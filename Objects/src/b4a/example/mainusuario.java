package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class mainusuario extends Activity implements B4AActivity{
	public static mainusuario mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.mainusuario");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mainusuario).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.mainusuario");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.mainusuario", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mainusuario) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mainusuario) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return mainusuario.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (mainusuario) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mainusuario) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            mainusuario mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mainusuario) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_nombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_email = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txt_passwd = null;
public anywheresoftware.b4a.objects.ListViewWrapper _list_usuario = null;
public b4a.example.manageruser _manger = null;
public static int _id = 0;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.mainmenu _mainmenu = null;
public b4a.example.mainedad _mainedad = null;
public b4a.example.maincambio _maincambio = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mainusuario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Activity.LoadLayout(\"lyUsuario\")";
mostCurrent._activity.LoadLayout("lyUsuario",mostCurrent.activityBA);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="manger.Initialize(\"users.sqlite\")";
mostCurrent._manger._initialize /*String*/ (null,processBA,"users.sqlite");
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="view_UserList";
_view_userlist();
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="End Sub";
return "";
}
public static String  _view_userlist() throws Exception{
RDebugUtils.currentModule="mainusuario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "view_userlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "view_userlist", null));}
anywheresoftware.b4a.objects.collections.List _user_item = null;
int _i = 0;
b4a.example.usuario _urs = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub view_UserList";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim user_item As List";
_user_item = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="user_item = manger.readByEmail(\"\")";
_user_item = mostCurrent._manger._readbyemail /*anywheresoftware.b4a.objects.collections.List*/ (null,"");
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="For i = 0 To user_item.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_user_item.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="Dim urs As Usuario";
_urs = new b4a.example.usuario();
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="urs = user_item.Get(i)";
_urs = (b4a.example.usuario)(_user_item.Get(_i));
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="list_usuario.AddSingleLine2(urs.Nombre, urs.Emai";
mostCurrent._list_usuario.AddSingleLine2(BA.ObjectToCharSequence(_urs._nombre /*String*/ ),(Object)(_urs._email /*String*/ ));
 }
};
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="mainusuario";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="mainusuario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _btn_eliminar_click() throws Exception{
RDebugUtils.currentModule="mainusuario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_eliminar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_eliminar_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub btn_eliminar_Click";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="manger.delete_User(id)";
mostCurrent._manger._delete_user /*String*/ (null,_id);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="MsgboxAsync(\"Registro eliminado!\", \"OK\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Registro eliminado!"),BA.ObjectToCharSequence("OK"),processBA);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="txt_nombre.Text = \"\"";
mostCurrent._txt_nombre.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="txt_email.Text = \"\"";
mostCurrent._txt_email.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="txt_passwd.Text = \"\"";
mostCurrent._txt_passwd.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="list_usuario.Clear";
mostCurrent._list_usuario.Clear();
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="view_UserList";
_view_userlist();
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="End Sub";
return "";
}
public static String  _btn_ingresar_click() throws Exception{
RDebugUtils.currentModule="mainusuario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_ingresar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_ingresar_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub btn_ingresar_Click";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="manger.create_User(txt_nombre.Text, txt_email.Tex";
mostCurrent._manger._create_user /*b4a.example.usuario*/ (null,mostCurrent._txt_nombre.getText(),mostCurrent._txt_email.getText(),mostCurrent._txt_passwd.getText());
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="MsgboxAsync(\"Registro insertado!\", \"OK\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Registro insertado!"),BA.ObjectToCharSequence("OK"),processBA);
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="list_usuario.Clear";
mostCurrent._list_usuario.Clear();
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="view_UserList";
_view_userlist();
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="End Sub";
return "";
}
public static String  _btn_readone_click() throws Exception{
RDebugUtils.currentModule="mainusuario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_readone_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_readone_click", null));}
b4a.example.usuario _u = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub btn_readone_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim u As Usuario = manger.readOne_email(txt_email";
_u = mostCurrent._manger._readone_email /*b4a.example.usuario*/ (null,mostCurrent._txt_email.getText());
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="If u = Null Then";
if (_u== null) { 
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="MsgboxAsync(\"Registro no encontrado!\", \"Ups\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Registro no encontrado!"),BA.ObjectToCharSequence("Ups"),processBA);
 }else {
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="id = u.Id_usuario";
_id = _u._id_usuario /*int*/ ;
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="txt_nombre.Text = u.Nombre";
mostCurrent._txt_nombre.setText(BA.ObjectToCharSequence(_u._nombre /*String*/ ));
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="txt_email.Text = u.Email";
mostCurrent._txt_email.setText(BA.ObjectToCharSequence(_u._email /*String*/ ));
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="txt_passwd.Text = u.Password";
mostCurrent._txt_passwd.setText(BA.ObjectToCharSequence(_u._password /*String*/ ));
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="MsgboxAsync(\"Registro encontrado!\", \"OK\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Registro encontrado!"),BA.ObjectToCharSequence("OK"),processBA);
 };
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="End Sub";
return "";
}
public static String  _btn_update_click() throws Exception{
RDebugUtils.currentModule="mainusuario";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btn_update_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btn_update_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub btn_update_Click";
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="manger.update_User(id, txt_nombre.Text, txt_email";
mostCurrent._manger._update_user /*b4a.example.usuario*/ (null,_id,mostCurrent._txt_nombre.getText(),mostCurrent._txt_email.getText(),mostCurrent._txt_passwd.getText());
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="MsgboxAsync(\"Registro actualizado!\", \"OK\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Registro actualizado!"),BA.ObjectToCharSequence("OK"),processBA);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="list_usuario.Clear";
mostCurrent._list_usuario.Clear();
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="view_UserList";
_view_userlist();
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="End Sub";
return "";
}
}