
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class manageruser {
    public static RemoteObject myClass;
	public manageruser() {
	}
    public static PCBA staticBA = new PCBA(null, manageruser.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _bdd = RemoteObject.createImmutable("");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.mainmenu _mainmenu = null;
public static b4a.example.mainusuario _mainusuario = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bdd",_ref.getField(false, "_bdd"),"sql",_ref.getField(false, "_sql")};
}
}