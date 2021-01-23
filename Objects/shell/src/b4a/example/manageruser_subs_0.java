package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class manageruser_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public bdd As String";
manageruser._bdd = RemoteObject.createImmutable("");__ref.setField("_bdd",manageruser._bdd);
 //BA.debugLineNum = 4;BA.debugLine="Private sql As SQL";
manageruser._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");__ref.setField("_sql",manageruser._sql);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create_user(RemoteObject __ref,RemoteObject _nombre,RemoteObject _email,RemoteObject _passw) throws Exception{
try {
		Debug.PushSubsStack("create_User (manageruser) ","manageruser",2,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("create_user")) { return __ref.runUserSub(false, "manageruser","create_user", __ref, _nombre, _email, _passw);}
RemoteObject _usr = RemoteObject.declareNull("b4a.example.usuario");
Debug.locals.put("nombre", _nombre);
Debug.locals.put("email", _email);
Debug.locals.put("passw", _passw);
 BA.debugLineNum = 19;BA.debugLine="Public Sub create_User(nombre As String, email As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Dim usr As Usuario";
Debug.ShouldStop(1048576);
_usr = RemoteObject.createNew ("b4a.example.usuario");Debug.locals.put("usr", _usr);
 BA.debugLineNum = 23;BA.debugLine="usr.Nombre = nombre";
Debug.ShouldStop(4194304);
_usr.setField ("_nombre" /*RemoteObject*/ ,_nombre);
 BA.debugLineNum = 24;BA.debugLine="usr.Email = email";
Debug.ShouldStop(8388608);
_usr.setField ("_email" /*RemoteObject*/ ,_email);
 BA.debugLineNum = 25;BA.debugLine="usr.Password = passw";
Debug.ShouldStop(16777216);
_usr.setField ("_password" /*RemoteObject*/ ,_passw);
 BA.debugLineNum = 27;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO usuario(nombre, em";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO usuario(nombre, email, password) VALUES (?,?,?)")),(Object)(manageruser.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_nombre),(_email),(_passw)})))));
 BA.debugLineNum = 30;BA.debugLine="Return usr";
Debug.ShouldStop(536870912);
if (true) return _usr;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete_user(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("delete_User (manageruser) ","manageruser",2,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("delete_user")) { return __ref.runUserSub(false, "manageruser","delete_user", __ref, _id);}
Debug.locals.put("id", _id);
 BA.debugLineNum = 96;BA.debugLine="Public Sub delete_User( id As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="sql.ExecNonQuery2(\"DELETE FROM usuario WHERE id_u";
Debug.ShouldStop(1);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("DELETE FROM usuario WHERE id_user = ?")),(Object)(manageruser.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})))));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _bddnombre) throws Exception{
try {
		Debug.PushSubsStack("Initialize (manageruser) ","manageruser",2,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "manageruser","initialize", __ref, _ba, _bddnombre);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("BDDNombre", _bddnombre);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize (BDDNombre As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="bdd = BDDNombre";
Debug.ShouldStop(1024);
__ref.setField ("_bdd" /*RemoteObject*/ ,_bddnombre);
 BA.debugLineNum = 13;BA.debugLine="sql.Initialize(File.DirInternal, bdd, True)";
Debug.ShouldStop(4096);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(manageruser.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(__ref.getField(true,"_bdd" /*RemoteObject*/ )),(Object)(manageruser.__c.getField(true,"True")));
 BA.debugLineNum = 15;BA.debugLine="sql.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS usua";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS usuario(id_user INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT(60), email TEXT(30), password TEXT(30))")));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readbyemail(RemoteObject __ref,RemoteObject _email) throws Exception{
try {
		Debug.PushSubsStack("readByEmail (manageruser) ","manageruser",2,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("readbyemail")) { return __ref.runUserSub(false, "manageruser","readbyemail", __ref, _email);}
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _user_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _aux_urs = RemoteObject.declareNull("b4a.example.usuario");
Debug.locals.put("email", _email);
 BA.debugLineNum = 54;BA.debugLine="Public Sub readByEmail(email As String) As List";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="Dim curs As Cursor";
Debug.ShouldStop(8388608);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("curs", _curs);
 BA.debugLineNum = 57;BA.debugLine="Dim user_item As List";
Debug.ShouldStop(16777216);
_user_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("user_item", _user_item);
 BA.debugLineNum = 58;BA.debugLine="user_item.Initialize()";
Debug.ShouldStop(33554432);
_user_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 60;BA.debugLine="curs = sql.ExecQuery2(\"SELECT * FROM usuario WHER";
Debug.ShouldStop(134217728);
_curs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT * FROM usuario WHERE email LIKE ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.concat(RemoteObject.createImmutable("%"),_email,RemoteObject.createImmutable("%"))}))));
 BA.debugLineNum = 62;BA.debugLine="For i = 0 To curs.RowCount -1 Step 1";
Debug.ShouldStop(536870912);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_curs.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 63;BA.debugLine="curs.Position = i";
Debug.ShouldStop(1073741824);
_curs.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 65;BA.debugLine="Dim aux_urs As Usuario";
Debug.ShouldStop(1);
_aux_urs = RemoteObject.createNew ("b4a.example.usuario");Debug.locals.put("aux_urs", _aux_urs);
 BA.debugLineNum = 67;BA.debugLine="aux_urs.Id_usuario = curs.GetInt(\"id_user\")";
Debug.ShouldStop(4);
_aux_urs.setField ("_id_usuario" /*RemoteObject*/ ,_curs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id_user"))));
 BA.debugLineNum = 68;BA.debugLine="aux_urs.Nombre = curs.GetString(\"nombre\")";
Debug.ShouldStop(8);
_aux_urs.setField ("_nombre" /*RemoteObject*/ ,_curs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombre"))));
 BA.debugLineNum = 69;BA.debugLine="aux_urs.Email = curs.GetString(\"email\")";
Debug.ShouldStop(16);
_aux_urs.setField ("_email" /*RemoteObject*/ ,_curs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("email"))));
 BA.debugLineNum = 70;BA.debugLine="aux_urs.Password = curs.GetString(\"password\")";
Debug.ShouldStop(32);
_aux_urs.setField ("_password" /*RemoteObject*/ ,_curs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("password"))));
 BA.debugLineNum = 72;BA.debugLine="user_item.Add(aux_urs)";
Debug.ShouldStop(128);
_user_item.runVoidMethod ("Add",(Object)((_aux_urs)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 75;BA.debugLine="Return user_item";
Debug.ShouldStop(1024);
if (true) return _user_item;
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readone_email(RemoteObject __ref,RemoteObject _email) throws Exception{
try {
		Debug.PushSubsStack("readOne_email (manageruser) ","manageruser",2,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("readone_email")) { return __ref.runUserSub(false, "manageruser","readone_email", __ref, _email);}
RemoteObject _curs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _item = RemoteObject.declareNull("b4a.example.usuario");
Debug.locals.put("email", _email);
 BA.debugLineNum = 34;BA.debugLine="Public Sub readOne_email(email As String) As Usuar";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Dim curs As Cursor";
Debug.ShouldStop(4);
_curs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("curs", _curs);
 BA.debugLineNum = 36;BA.debugLine="curs = sql.ExecQuery2(\"SELECT * FROM usuario WHER";
Debug.ShouldStop(8);
_curs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), __ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("SELECT * FROM usuario WHERE email = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_email}))));
 BA.debugLineNum = 38;BA.debugLine="If curs.RowCount < 1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",_curs.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 39;BA.debugLine="Return Null";
Debug.ShouldStop(64);
if (true) return (manageruser.__c.getField(false,"Null"));
 }else {
 BA.debugLineNum = 41;BA.debugLine="curs.Position = 0";
Debug.ShouldStop(256);
_curs.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 43;BA.debugLine="Dim item As Usuario";
Debug.ShouldStop(1024);
_item = RemoteObject.createNew ("b4a.example.usuario");Debug.locals.put("item", _item);
 BA.debugLineNum = 44;BA.debugLine="item.Id_usuario = curs.GetInt(\"id_user\")";
Debug.ShouldStop(2048);
_item.setField ("_id_usuario" /*RemoteObject*/ ,_curs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id_user"))));
 BA.debugLineNum = 45;BA.debugLine="item.Nombre = curs.GetString(\"nombre\")";
Debug.ShouldStop(4096);
_item.setField ("_nombre" /*RemoteObject*/ ,_curs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nombre"))));
 BA.debugLineNum = 46;BA.debugLine="item.Email = curs.GetString(\"email\")";
Debug.ShouldStop(8192);
_item.setField ("_email" /*RemoteObject*/ ,_curs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("email"))));
 BA.debugLineNum = 47;BA.debugLine="item.Password = curs.GetString(\"password\")";
Debug.ShouldStop(16384);
_item.setField ("_password" /*RemoteObject*/ ,_curs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("password"))));
 BA.debugLineNum = 48;BA.debugLine="Return item";
Debug.ShouldStop(32768);
if (true) return _item;
 };
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update_user(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _email,RemoteObject _passw) throws Exception{
try {
		Debug.PushSubsStack("update_User (manageruser) ","manageruser",2,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("update_user")) { return __ref.runUserSub(false, "manageruser","update_user", __ref, _id, _nombre, _email, _passw);}
RemoteObject _usr = RemoteObject.declareNull("b4a.example.usuario");
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("email", _email);
Debug.locals.put("passw", _passw);
 BA.debugLineNum = 79;BA.debugLine="Public Sub update_User(id As Int, nombre As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="Dim usr As Usuario";
Debug.ShouldStop(65536);
_usr = RemoteObject.createNew ("b4a.example.usuario");Debug.locals.put("usr", _usr);
 BA.debugLineNum = 83;BA.debugLine="usr.Nombre = nombre";
Debug.ShouldStop(262144);
_usr.setField ("_nombre" /*RemoteObject*/ ,_nombre);
 BA.debugLineNum = 84;BA.debugLine="usr.Email = email";
Debug.ShouldStop(524288);
_usr.setField ("_email" /*RemoteObject*/ ,_email);
 BA.debugLineNum = 85;BA.debugLine="usr.Password = passw";
Debug.ShouldStop(1048576);
_usr.setField ("_password" /*RemoteObject*/ ,_passw);
 BA.debugLineNum = 87;BA.debugLine="sql.ExecNonQuery2( _ 	\"UPDATE usuario SET nombre";
Debug.ShouldStop(4194304);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE usuario SET nombre = ?, email = ?, password = ? WHERE id_user = ?")),(Object)(manageruser.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_nombre),(_email),(_passw),(_id)})))));
 BA.debugLineNum = 91;BA.debugLine="Return usr";
Debug.ShouldStop(67108864);
if (true) return _usr;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}