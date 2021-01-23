
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class usuario {
    public static RemoteObject myClass;
	public usuario() {
	}
    public static PCBA staticBA = new PCBA(null, usuario.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id_usuario = RemoteObject.createImmutable(0);
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static RemoteObject _email = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.mainmenu _mainmenu = null;
public static b4a.example.mainusuario _mainusuario = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Email",_ref.getField(false, "_email"),"Id_usuario",_ref.getField(false, "_id_usuario"),"Nombre",_ref.getField(false, "_nombre"),"Password",_ref.getField(false, "_password")};
}
}