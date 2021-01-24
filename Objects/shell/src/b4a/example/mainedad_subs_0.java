package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mainedad_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mainedad) ","mainedad",6,mainedad.mostCurrent.activityBA,mainedad.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mainedad.remoteMe.runUserSub(false, "mainedad","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"lyFechas\")";
Debug.ShouldStop(4194304);
mainedad.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lyFechas")),mainedad.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (mainedad) ","mainedad",6,mainedad.mostCurrent.activityBA,mainedad.mostCurrent,31);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mainedad.remoteMe.runUserSub(false, "mainedad","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (mainedad) ","mainedad",6,mainedad.mostCurrent.activityBA,mainedad.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mainedad.remoteMe.runUserSub(false, "mainedad","activity_resume");}
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn_calcular_click() throws Exception{
try {
		Debug.PushSubsStack("btn_calcular_Click (mainedad) ","mainedad",6,mainedad.mostCurrent.activityBA,mainedad.mostCurrent,36);
if (RapidSub.canDelegate("btn_calcular_click")) { return b4a.example.mainedad.remoteMe.runUserSub(false, "mainedad","btn_calcular_click");}
RemoteObject _numdays = RemoteObject.createImmutable(0);
 BA.debugLineNum = 36;BA.debugLine="Private Sub btn_calcular_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(32);
mainedad.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 40;BA.debugLine="Dim numDays As Int = (DateTime.DateParse(txt_fech";
Debug.ShouldStop(128);
_numdays = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {mainedad.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(mainedad.mostCurrent._txt_fechahasta.runMethod(true,"getText"))),mainedad.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(mainedad.mostCurrent._txt_fechainicio.runMethod(true,"getText")))}, "-",1, 2)),mainedad.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "/",0, 0));Debug.locals.put("numDays", _numdays);Debug.locals.put("numDays", _numdays);
 BA.debugLineNum = 42;BA.debugLine="lbl_resultados.Text = numDays";
Debug.ShouldStop(512);
mainedad.mostCurrent._lbl_resultados.runMethod(true,"setText",BA.ObjectToCharSequence(_numdays));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 16;BA.debugLine="Private txt_fechaInicio As EditText";
mainedad.mostCurrent._txt_fechainicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txt_fechaHasta As EditText";
mainedad.mostCurrent._txt_fechahasta = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private lbl_resultados As Label";
mainedad.mostCurrent._lbl_resultados = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}