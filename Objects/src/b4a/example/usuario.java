package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class usuario extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.usuario");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.usuario.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public int _id_usuario = 0;
public String _nombre = "";
public String _email = "";
public String _password = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.mainmenu _mainmenu = null;
public b4a.example.mainusuario _mainusuario = null;
public String  _initialize(b4a.example.usuario __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="usuario";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.usuario __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="usuario";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Public Id_usuario As Int";
_id_usuario = 0;
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Public Nombre As String";
_nombre = "";
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Public Email As String";
_email = "";
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Public Password as String";
_password = "";
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="End Sub";
return "";
}
}