package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mainusuario_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mainusuario) ","mainusuario",5,mainusuario.mostCurrent.activityBA,mainusuario.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mainusuario.remoteMe.runUserSub(false, "mainusuario","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"lyUsuario\")";
Debug.ShouldStop(1073741824);
mainusuario.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lyUsuario")),mainusuario.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="manger.Initialize(\"users.sqlite\")";
Debug.ShouldStop(2);
mainusuario.mostCurrent._manger.runClassMethod (b4a.example.manageruser.class, "_initialize" /*RemoteObject*/ ,mainusuario.processBA,(Object)(RemoteObject.createImmutable("users.sqlite")));
 BA.debugLineNum = 36;BA.debugLine="view_UserList";
Debug.ShouldStop(8);
_view_userlist();
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (mainusuario) ","mainusuario",5,mainusuario.mostCurrent.activityBA,mainusuario.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mainusuario.remoteMe.runUserSub(false, "mainusuario","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (mainusuario) ","mainusuario",5,mainusuario.mostCurrent.activityBA,mainusuario.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mainusuario.remoteMe.runUserSub(false, "mainusuario","activity_resume");}
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_eliminar_click() throws Exception{
try {
		Debug.PushSubsStack("btn_eliminar_Click (mainusuario) ","mainusuario",5,mainusuario.mostCurrent.activityBA,mainusuario.mostCurrent,65);
if (RapidSub.canDelegate("btn_eliminar_click")) { return b4a.example.mainusuario.remoteMe.runUserSub(false, "mainusuario","btn_eliminar_click");}
 BA.debugLineNum = 65;BA.debugLine="Private Sub btn_eliminar_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="manger.delete_User(id)";
Debug.ShouldStop(2);
mainusuario.mostCurrent._manger.runClassMethod (b4a.example.manageruser.class, "_delete_user" /*RemoteObject*/ ,(Object)(mainusuario._id));
 BA.debugLineNum = 68;BA.debugLine="MsgboxAsync(\"Registro eliminado!\", \"OK\")";
Debug.ShouldStop(8);
mainusuario.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro eliminado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),mainusuario.processBA);
 BA.debugLineNum = 69;BA.debugLine="txt_nombre.Text = \"\"";
Debug.ShouldStop(16);
mainusuario.mostCurrent._txt_nombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 70;BA.debugLine="txt_email.Text = \"\"";
Debug.ShouldStop(32);
mainusuario.mostCurrent._txt_email.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 71;BA.debugLine="txt_passwd.Text = \"\"";
Debug.ShouldStop(64);
mainusuario.mostCurrent._txt_passwd.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 73;BA.debugLine="list_usuario.Clear";
Debug.ShouldStop(256);
mainusuario.mostCurrent._list_usuario.runVoidMethod ("Clear");
 BA.debugLineNum = 74;BA.debugLine="view_UserList";
Debug.ShouldStop(512);
_view_userlist();
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("btn_ingresar_Click (mainusuario) ","mainusuario",5,mainusuario.mostCurrent.activityBA,mainusuario.mostCurrent,102);
if (RapidSub.canDelegate("btn_ingresar_click")) { return b4a.example.mainusuario.remoteMe.runUserSub(false, "mainusuario","btn_ingresar_click");}
 BA.debugLineNum = 102;BA.debugLine="Private Sub btn_ingresar_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="manger.create_User(txt_nombre.Text, txt_email.Tex";
Debug.ShouldStop(128);
mainusuario.mostCurrent._manger.runClassMethod (b4a.example.manageruser.class, "_create_user" /*RemoteObject*/ ,(Object)(mainusuario.mostCurrent._txt_nombre.runMethod(true,"getText")),(Object)(mainusuario.mostCurrent._txt_email.runMethod(true,"getText")),(Object)(mainusuario.mostCurrent._txt_passwd.runMethod(true,"getText")));
 BA.debugLineNum = 105;BA.debugLine="MsgboxAsync(\"Registro insertado!\", \"OK\")";
Debug.ShouldStop(256);
mainusuario.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro insertado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),mainusuario.processBA);
 BA.debugLineNum = 106;BA.debugLine="list_usuario.Clear";
Debug.ShouldStop(512);
mainusuario.mostCurrent._list_usuario.runVoidMethod ("Clear");
 BA.debugLineNum = 107;BA.debugLine="view_UserList";
Debug.ShouldStop(1024);
_view_userlist();
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_readone_click() throws Exception{
try {
		Debug.PushSubsStack("btn_readone_Click (mainusuario) ","mainusuario",5,mainusuario.mostCurrent.activityBA,mainusuario.mostCurrent,87);
if (RapidSub.canDelegate("btn_readone_click")) { return b4a.example.mainusuario.remoteMe.runUserSub(false, "mainusuario","btn_readone_click");}
RemoteObject _u = RemoteObject.declareNull("b4a.example.usuario");
 BA.debugLineNum = 87;BA.debugLine="Private Sub btn_readone_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Dim u As Usuario = manger.readOne_email(txt_email";
Debug.ShouldStop(8388608);
_u = mainusuario.mostCurrent._manger.runClassMethod (b4a.example.manageruser.class, "_readone_email" /*RemoteObject*/ ,(Object)(mainusuario.mostCurrent._txt_email.runMethod(true,"getText")));Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 90;BA.debugLine="If u = Null Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("n",_u)) { 
 BA.debugLineNum = 91;BA.debugLine="MsgboxAsync(\"Registro no encontrado!\", \"Ups\")";
Debug.ShouldStop(67108864);
mainusuario.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro no encontrado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ups"))),mainusuario.processBA);
 }else {
 BA.debugLineNum = 93;BA.debugLine="id = u.Id_usuario";
Debug.ShouldStop(268435456);
mainusuario._id = _u.getField(true,"_id_usuario" /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="txt_nombre.Text = u.Nombre";
Debug.ShouldStop(536870912);
mainusuario.mostCurrent._txt_nombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_u.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 95;BA.debugLine="txt_email.Text = u.Email";
Debug.ShouldStop(1073741824);
mainusuario.mostCurrent._txt_email.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_u.getField(true,"_email" /*RemoteObject*/ )));
 BA.debugLineNum = 96;BA.debugLine="txt_passwd.Text = u.Password";
Debug.ShouldStop(-2147483648);
mainusuario.mostCurrent._txt_passwd.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_u.getField(true,"_password" /*RemoteObject*/ )));
 BA.debugLineNum = 97;BA.debugLine="MsgboxAsync(\"Registro encontrado!\", \"OK\")";
Debug.ShouldStop(1);
mainusuario.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro encontrado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),mainusuario.processBA);
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_update_click() throws Exception{
try {
		Debug.PushSubsStack("btn_update_Click (mainusuario) ","mainusuario",5,mainusuario.mostCurrent.activityBA,mainusuario.mostCurrent,78);
if (RapidSub.canDelegate("btn_update_click")) { return b4a.example.mainusuario.remoteMe.runUserSub(false, "mainusuario","btn_update_click");}
 BA.debugLineNum = 78;BA.debugLine="Private Sub btn_update_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 80;BA.debugLine="manger.update_User(id, txt_nombre.Text, txt_email";
Debug.ShouldStop(32768);
mainusuario.mostCurrent._manger.runClassMethod (b4a.example.manageruser.class, "_update_user" /*RemoteObject*/ ,(Object)(mainusuario._id),(Object)(mainusuario.mostCurrent._txt_nombre.runMethod(true,"getText")),(Object)(mainusuario.mostCurrent._txt_email.runMethod(true,"getText")),(Object)(mainusuario.mostCurrent._txt_passwd.runMethod(true,"getText")));
 BA.debugLineNum = 81;BA.debugLine="MsgboxAsync(\"Registro actualizado!\", \"OK\")";
Debug.ShouldStop(65536);
mainusuario.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Registro actualizado!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),mainusuario.processBA);
 BA.debugLineNum = 82;BA.debugLine="list_usuario.Clear";
Debug.ShouldStop(131072);
mainusuario.mostCurrent._list_usuario.runVoidMethod ("Clear");
 BA.debugLineNum = 83;BA.debugLine="view_UserList";
Debug.ShouldStop(262144);
_view_userlist();
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 16;BA.debugLine="Private txt_nombre As EditText";
mainusuario.mostCurrent._txt_nombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txt_email As EditText";
mainusuario.mostCurrent._txt_email = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txt_passwd As EditText";
mainusuario.mostCurrent._txt_passwd = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private list_usuario As ListView";
mainusuario.mostCurrent._list_usuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim manger As ManagerUser";
mainusuario.mostCurrent._manger = RemoteObject.createNew ("b4a.example.manageruser");
 //BA.debugLineNum = 24;BA.debugLine="Dim id as Int";
mainusuario._id = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _view_userlist() throws Exception{
try {
		Debug.PushSubsStack("view_UserList (mainusuario) ","mainusuario",5,mainusuario.mostCurrent.activityBA,mainusuario.mostCurrent,49);
if (RapidSub.canDelegate("view_userlist")) { return b4a.example.mainusuario.remoteMe.runUserSub(false, "mainusuario","view_userlist");}
RemoteObject _user_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _urs = RemoteObject.declareNull("b4a.example.usuario");
 BA.debugLineNum = 49;BA.debugLine="Private Sub view_UserList";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim user_item As List";
Debug.ShouldStop(131072);
_user_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("user_item", _user_item);
 BA.debugLineNum = 52;BA.debugLine="user_item = manger.readByEmail(\"\")";
Debug.ShouldStop(524288);
_user_item = mainusuario.mostCurrent._manger.runClassMethod (b4a.example.manageruser.class, "_readbyemail" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("user_item", _user_item);
 BA.debugLineNum = 54;BA.debugLine="For i = 0 To user_item.Size - 1";
Debug.ShouldStop(2097152);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_user_item.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 55;BA.debugLine="Dim urs As Usuario";
Debug.ShouldStop(4194304);
_urs = RemoteObject.createNew ("b4a.example.usuario");Debug.locals.put("urs", _urs);
 BA.debugLineNum = 56;BA.debugLine="urs = user_item.Get(i)";
Debug.ShouldStop(8388608);
_urs = (_user_item.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("urs", _urs);
 BA.debugLineNum = 58;BA.debugLine="list_usuario.AddSingleLine2(urs.Nombre, urs.Emai";
Debug.ShouldStop(33554432);
mainusuario.mostCurrent._list_usuario.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(_urs.getField(true,"_nombre" /*RemoteObject*/ ))),(Object)((_urs.getField(true,"_email" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}