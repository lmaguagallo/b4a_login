package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"Layout\")";
Debug.ShouldStop(1);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="manager.Initialize(\"users.sqlite\")";
Debug.ShouldStop(8);
main.mostCurrent._manager.runClassMethod (b4a.example.manageruser.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(RemoteObject.createImmutable("users.sqlite")));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btn_ingresar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("btn_ingresar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btn_ingresar_click");}
RemoteObject _data = RemoteObject.declareNull("b4a.example.usuario");
 BA.debugLineNum = 51;BA.debugLine="Private Sub btn_ingresar_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 54;BA.debugLine="MsgboxAsync(txt_email.Text & \" \" & txt_password.T";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._txt_email.runMethod(true,"getText"),RemoteObject.createImmutable(" "),main.mostCurrent._txt_password.runMethod(true,"getText")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),main.processBA);
 BA.debugLineNum = 58;BA.debugLine="Dim data As Usuario";
Debug.ShouldStop(33554432);
_data = RemoteObject.createNew ("b4a.example.usuario");Debug.locals.put("data", _data);
 BA.debugLineNum = 59;BA.debugLine="data.Initialize";
Debug.ShouldStop(67108864);
_data.runClassMethod (b4a.example.usuario.class, "_initialize" /*RemoteObject*/ ,main.processBA);
 BA.debugLineNum = 61;BA.debugLine="data.Email = txt_email.Text";
Debug.ShouldStop(268435456);
_data.setField ("_email" /*RemoteObject*/ ,main.mostCurrent._txt_email.runMethod(true,"getText"));
 BA.debugLineNum = 63;BA.debugLine="CallSubDelayed2(MainMenu, \"Show\", Array As String";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",main.processBA,(Object)((main.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {main.mostCurrent._txt_email.runMethod(true,"getText"),RemoteObject.createImmutable("otro")}))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,47);
if (RapidSub.canDelegate("button1_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","button1_click");}
 BA.debugLineNum = 47;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="xui.MsgboxAsync(\"Hello world!\", \"B4X\")";
Debug.ShouldStop(32768);
main._xui.runVoidMethod ("MsgboxAsync",main.processBA,(Object)(BA.ObjectToCharSequence("Hello world!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("B4X"))));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
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
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
manageruser.myClass = BA.getDeviceClass ("b4a.example.manageruser");
usuario.myClass = BA.getDeviceClass ("b4a.example.usuario");
mainmenu.myClass = BA.getDeviceClass ("b4a.example.mainmenu");
mainusuario.myClass = BA.getDeviceClass ("b4a.example.mainusuario");
		
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