package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mainmenu_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mainmenu) ","mainmenu",4,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mainmenu.remoteMe.runUserSub(false, "mainmenu","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"lyMenu\")";
Debug.ShouldStop(1048576);
mainmenu.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lyMenu")),mainmenu.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Pause (mainmenu) ","mainmenu",4,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,29);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mainmenu.remoteMe.runUserSub(false, "mainmenu","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (mainmenu) ","mainmenu",4,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,25);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mainmenu.remoteMe.runUserSub(false, "mainmenu","activity_resume");}
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_usuarios_click() throws Exception{
try {
		Debug.PushSubsStack("btn_usuarios_Click (mainmenu) ","mainmenu",4,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,37);
if (RapidSub.canDelegate("btn_usuarios_click")) { return b4a.example.mainmenu.remoteMe.runUserSub(false, "mainmenu","btn_usuarios_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub btn_usuarios_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="CallSubDelayed2(MainUsuario, \"Show\", Array As Str";
Debug.ShouldStop(64);
mainmenu.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",mainmenu.processBA,(Object)((mainmenu.mostCurrent._mainusuario.getObject())),(Object)(BA.ObjectToString("Show")),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("Ingreso de Usuarios")}))));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _show(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("show (mainmenu) ","mainmenu",4,mainmenu.mostCurrent.activityBA,mainmenu.mostCurrent,33);
if (RapidSub.canDelegate("show")) { return b4a.example.mainmenu.remoteMe.runUserSub(false, "mainmenu","show", _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 33;BA.debugLine="Public Sub show(data() As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="ToastMessageShow(\"Bienvenido \" & data(0), True)";
Debug.ShouldStop(2);
mainmenu.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Bienvenido "),_data.getArrayElement(true,BA.numberCast(int.class, 0))))),(Object)(mainmenu.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}