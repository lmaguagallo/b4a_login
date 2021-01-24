package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(32);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="manager.Initialize(\"users.sqlite\")";
Debug.ShouldStop(256);
main.mostCurrent._manager.runClassMethod (b4a.example.manageruser.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(RemoteObject.createImmutable("users.sqlite")));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_ingresar_click() throws Exception{
try {
		Debug.PushSubsStack("btn_ingresar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,56);
if (RapidSub.canDelegate("btn_ingresar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_ingresar_click");}
RemoteObject _u = RemoteObject.declareNull("b4a.example.usuario");
RemoteObject _data = RemoteObject.declareNull("b4a.example.usuario");
 BA.debugLineNum = 56;BA.debugLine="Private Sub btn_ingresar_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="Dim u As Usuario = manager.readOne_email(txt_emai";
Debug.ShouldStop(33554432);
_u = main.mostCurrent._manager.runClassMethod (b4a.example.manageruser.class, "_readone_email" /*RemoteObject*/ ,(Object)(main.mostCurrent._txt_email.runMethod(true,"getText")));Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 60;BA.debugLine="If u = Null Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("n",_u)) { 
 BA.debugLineNum = 61;BA.debugLine="MsgboxAsync(\"Usuario no encontrado!\", \"Ups\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Usuario no encontrado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ups"))),main.processBA);
 }else {
 BA.debugLineNum = 64;BA.debugLine="nombre = u.Nombre";
Debug.ShouldStop(-2147483648);
main.mostCurrent._nombre = _u.getField(true,"_nombre" /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="user = u.Email";
Debug.ShouldStop(1);
main.mostCurrent._user = _u.getField(true,"_email" /*RemoteObject*/ );
 BA.debugLineNum = 66;BA.debugLine="passw = u.Password";
Debug.ShouldStop(2);
main.mostCurrent._passw = _u.getField(true,"_password" /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="Dim data As Usuario";
Debug.ShouldStop(16);
_data = RemoteObject.createNew ("b4a.example.usuario");Debug.locals.put("data", _data);
 BA.debugLineNum = 70;BA.debugLine="data.Initialize";
Debug.ShouldStop(32);
_data.runClassMethod (b4a.example.usuario.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 72;BA.debugLine="If txt_email.Text = user And txt_password.Text =";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txt_email.runMethod(true,"getText"),main.mostCurrent._user) && RemoteObject.solveBoolean("=",main.mostCurrent._txt_password.runMethod(true,"getText"),main.mostCurrent._passw)) { 
 BA.debugLineNum = 73;BA.debugLine="CallSubDelayed2(MainMenu, \"Show\", Array As Stri";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",main.processBA,(Object)((main.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {main.mostCurrent._nombre,RemoteObject.createImmutable("otro")}))));
 };
 };
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 52;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(1048576);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Panel2 As Panel";
main.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim manager As ManagerUser";
main.mostCurrent._manager = RemoteObject.createNew ("b4a.example.manageruser");
 //BA.debugLineNum = 28;BA.debugLine="Private txt_email As EditText";
main.mostCurrent._txt_email = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private txt_password As EditText";
main.mostCurrent._txt_password = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim user As String";
main.mostCurrent._user = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Dim passw As String";
main.mostCurrent._passw = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim nombre As String";
main.mostCurrent._nombre = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
mainmenu_subs_0._process_globals();
mainusuario_subs_0._process_globals();
mainedad_subs_0._process_globals();
maincambio_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
manageruser.myClass = BA.getDeviceClass ("b4a.example.manageruser");
usuario.myClass = BA.getDeviceClass ("b4a.example.usuario");
mainmenu.myClass = BA.getDeviceClass ("b4a.example.mainmenu");
mainusuario.myClass = BA.getDeviceClass ("b4a.example.mainusuario");
mainedad.myClass = BA.getDeviceClass ("b4a.example.mainedad");
maincambio.myClass = BA.getDeviceClass ("b4a.example.maincambio");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}