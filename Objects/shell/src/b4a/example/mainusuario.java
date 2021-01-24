
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class mainusuario implements IRemote{
	public static mainusuario mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mainusuario() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mainusuario"), "b4a.example.mainusuario");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, mainusuario.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _txt_nombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txt_email = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txt_passwd = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _list_usuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _manger = RemoteObject.declareNull("b4a.example.manageruser");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.mainmenu _mainmenu = null;
public static b4a.example.mainedad _mainedad = null;
public static b4a.example.maincambio _maincambio = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",mainusuario.mostCurrent._activity,"id",mainusuario._id,"list_usuario",mainusuario.mostCurrent._list_usuario,"Main",Debug.moduleToString(b4a.example.main.class),"MainCambio",Debug.moduleToString(b4a.example.maincambio.class),"MainEdad",Debug.moduleToString(b4a.example.mainedad.class),"MainMenu",Debug.moduleToString(b4a.example.mainmenu.class),"manger",mainusuario.mostCurrent._manger,"Starter",Debug.moduleToString(b4a.example.starter.class),"txt_email",mainusuario.mostCurrent._txt_email,"txt_nombre",mainusuario.mostCurrent._txt_nombre,"txt_passwd",mainusuario.mostCurrent._txt_passwd};
}
}