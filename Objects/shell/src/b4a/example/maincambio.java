
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

public class maincambio implements IRemote{
	public static maincambio mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public maincambio() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("maincambio"), "b4a.example.maincambio");
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
		pcBA = new PCBA(this, maincambio.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _txt_valor = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lbl_1usd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_5usd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_10usd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_20usd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _billetes_disponibles = null;
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.mainmenu _mainmenu = null;
public static b4a.example.mainusuario _mainusuario = null;
public static b4a.example.mainedad _mainedad = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",maincambio.mostCurrent._activity,"billetes_disponibles",maincambio._billetes_disponibles,"lbl_10usd",maincambio.mostCurrent._lbl_10usd,"lbl_1usd",maincambio.mostCurrent._lbl_1usd,"lbl_20usd",maincambio.mostCurrent._lbl_20usd,"lbl_5usd",maincambio.mostCurrent._lbl_5usd,"Main",Debug.moduleToString(b4a.example.main.class),"MainEdad",Debug.moduleToString(b4a.example.mainedad.class),"MainMenu",Debug.moduleToString(b4a.example.mainmenu.class),"MainUsuario",Debug.moduleToString(b4a.example.mainusuario.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"txt_valor",maincambio.mostCurrent._txt_valor};
}
}