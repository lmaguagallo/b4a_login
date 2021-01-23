package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class usuario_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public Id_usuario As Int";
usuario._id_usuario = RemoteObject.createImmutable(0);__ref.setField("_id_usuario",usuario._id_usuario);
 //BA.debugLineNum = 5;BA.debugLine="Public Nombre As String";
usuario._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",usuario._nombre);
 //BA.debugLineNum = 6;BA.debugLine="Public Email As String";
usuario._email = RemoteObject.createImmutable("");__ref.setField("_email",usuario._email);
 //BA.debugLineNum = 7;BA.debugLine="Public Password as String";
usuario._password = RemoteObject.createImmutable("");__ref.setField("_password",usuario._password);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (usuario) ","usuario",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "usuario","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}