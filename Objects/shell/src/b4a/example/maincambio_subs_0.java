package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class maincambio_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (maincambio) ","maincambio",7,maincambio.mostCurrent.activityBA,maincambio.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.maincambio.remoteMe.runUserSub(false, "maincambio","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"lyBilletes\")";
Debug.ShouldStop(536870912);
maincambio.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lyBilletes")),maincambio.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Pause (maincambio) ","maincambio",7,maincambio.mostCurrent.activityBA,maincambio.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.maincambio.remoteMe.runUserSub(false, "maincambio","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (maincambio) ","maincambio",7,maincambio.mostCurrent.activityBA,maincambio.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.maincambio.remoteMe.runUserSub(false, "maincambio","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btn_calcular_Click (maincambio) ","maincambio",7,maincambio.mostCurrent.activityBA,maincambio.mostCurrent,43);
if (RapidSub.canDelegate("btn_calcular_click")) { return b4a.example.maincambio.remoteMe.runUserSub(false, "maincambio","btn_calcular_click");}
RemoteObject _resto = RemoteObject.createImmutable(0);
RemoteObject _aux = RemoteObject.createImmutable(0);
RemoteObject _entero = RemoteObject.createImmutable(0);
RemoteObject _decimal = RemoteObject.createImmutable(0);
RemoteObject _acm_1 = RemoteObject.createImmutable(0);
RemoteObject _acum_5 = RemoteObject.createImmutable(0);
RemoteObject _acum_10 = RemoteObject.createImmutable(0);
RemoteObject _acm_20 = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 43;BA.debugLine="Private Sub btn_calcular_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="Dim resto As Int";
Debug.ShouldStop(4096);
_resto = RemoteObject.createImmutable(0);Debug.locals.put("resto", _resto);
 BA.debugLineNum = 47;BA.debugLine="Dim aux As Double";
Debug.ShouldStop(16384);
_aux = RemoteObject.createImmutable(0);Debug.locals.put("aux", _aux);
 BA.debugLineNum = 48;BA.debugLine="Dim entero  As Int";
Debug.ShouldStop(32768);
_entero = RemoteObject.createImmutable(0);Debug.locals.put("entero", _entero);
 BA.debugLineNum = 49;BA.debugLine="Dim decimal  As Double";
Debug.ShouldStop(65536);
_decimal = RemoteObject.createImmutable(0);Debug.locals.put("decimal", _decimal);
 BA.debugLineNum = 51;BA.debugLine="Dim acm_1 As Int";
Debug.ShouldStop(262144);
_acm_1 = RemoteObject.createImmutable(0);Debug.locals.put("acm_1", _acm_1);
 BA.debugLineNum = 52;BA.debugLine="Dim acum_5 As Int";
Debug.ShouldStop(524288);
_acum_5 = RemoteObject.createImmutable(0);Debug.locals.put("acum_5", _acum_5);
 BA.debugLineNum = 53;BA.debugLine="Dim acum_10 As Int";
Debug.ShouldStop(1048576);
_acum_10 = RemoteObject.createImmutable(0);Debug.locals.put("acum_10", _acum_10);
 BA.debugLineNum = 54;BA.debugLine="Dim acm_20 As Int";
Debug.ShouldStop(2097152);
_acm_20 = RemoteObject.createImmutable(0);Debug.locals.put("acm_20", _acm_20);
 BA.debugLineNum = 56;BA.debugLine="resto = txt_valor.Text";
Debug.ShouldStop(8388608);
_resto = BA.numberCast(int.class, maincambio.mostCurrent._txt_valor.runMethod(true,"getText"));Debug.locals.put("resto", _resto);
 BA.debugLineNum = 58;BA.debugLine="If resto > 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_resto,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 59;BA.debugLine="For i = 0  To billetes_disponibles.Length - 1";
Debug.ShouldStop(67108864);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {maincambio._billetes_disponibles.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="If resto >= billetes_disponibles(i) Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("g",_resto,BA.numberCast(double.class, maincambio._billetes_disponibles.getArrayElement(true,BA.numberCast(int.class, _i))))) { 
 BA.debugLineNum = 61;BA.debugLine="aux = resto/billetes_disponibles(i)";
Debug.ShouldStop(268435456);
_aux = RemoteObject.solve(new RemoteObject[] {_resto,maincambio._billetes_disponibles.getArrayElement(true,BA.numberCast(int.class, _i))}, "/",0, 0);Debug.locals.put("aux", _aux);
 BA.debugLineNum = 62;BA.debugLine="entero = Floor(aux)";
Debug.ShouldStop(536870912);
_entero = BA.numberCast(int.class, maincambio.mostCurrent.__c.runMethod(true,"Floor",(Object)(_aux)));Debug.locals.put("entero", _entero);
 BA.debugLineNum = 63;BA.debugLine="decimal = aux - entero";
Debug.ShouldStop(1073741824);
_decimal = RemoteObject.solve(new RemoteObject[] {_aux,_entero}, "-",1, 0);Debug.locals.put("decimal", _decimal);
 BA.debugLineNum = 64;BA.debugLine="resto = decimal * billetes_disponibles(i)";
Debug.ShouldStop(-2147483648);
_resto = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_decimal,maincambio._billetes_disponibles.getArrayElement(true,BA.numberCast(int.class, _i))}, "*",0, 0));Debug.locals.put("resto", _resto);
 BA.debugLineNum = 66;BA.debugLine="If i == 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 67;BA.debugLine="acm_20 = entero";
Debug.ShouldStop(4);
_acm_20 = _entero;Debug.locals.put("acm_20", _acm_20);
 }else 
{ BA.debugLineNum = 69;BA.debugLine="Else If i == 1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 70;BA.debugLine="acum_10 = entero";
Debug.ShouldStop(32);
_acum_10 = _entero;Debug.locals.put("acum_10", _acum_10);
 }else 
{ BA.debugLineNum = 72;BA.debugLine="Else If i == 2 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 73;BA.debugLine="acum_5 = entero";
Debug.ShouldStop(256);
_acum_5 = _entero;Debug.locals.put("acum_5", _acum_5);
 }else 
{ BA.debugLineNum = 75;BA.debugLine="Else If i == 3 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 76;BA.debugLine="acm_1 = entero";
Debug.ShouldStop(2048);
_acm_1 = _entero;Debug.locals.put("acm_1", _acm_1);
 }}}}
;
 BA.debugLineNum = 80;BA.debugLine="aux = 0";
Debug.ShouldStop(32768);
_aux = BA.numberCast(double.class, 0);Debug.locals.put("aux", _aux);
 BA.debugLineNum = 81;BA.debugLine="entero = 0";
Debug.ShouldStop(65536);
_entero = BA.numberCast(int.class, 0);Debug.locals.put("entero", _entero);
 BA.debugLineNum = 82;BA.debugLine="decimal = 0";
Debug.ShouldStop(131072);
_decimal = BA.numberCast(double.class, 0);Debug.locals.put("decimal", _decimal);
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 89;BA.debugLine="lbl_20usd.Text = acm_20";
Debug.ShouldStop(16777216);
maincambio.mostCurrent._lbl_20usd.runMethod(true,"setText",BA.ObjectToCharSequence(_acm_20));
 BA.debugLineNum = 90;BA.debugLine="lbl_10usd.Text = acum_10";
Debug.ShouldStop(33554432);
maincambio.mostCurrent._lbl_10usd.runMethod(true,"setText",BA.ObjectToCharSequence(_acum_10));
 BA.debugLineNum = 91;BA.debugLine="lbl_5usd.Text = acum_5";
Debug.ShouldStop(67108864);
maincambio.mostCurrent._lbl_5usd.runMethod(true,"setText",BA.ObjectToCharSequence(_acum_5));
 BA.debugLineNum = 92;BA.debugLine="lbl_1usd.Text = acm_1";
Debug.ShouldStop(134217728);
maincambio.mostCurrent._lbl_1usd.runMethod(true,"setText",BA.ObjectToCharSequence(_acm_1));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 16;BA.debugLine="Private txt_valor As EditText";
maincambio.mostCurrent._txt_valor = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private lbl_1usd As Label";
maincambio.mostCurrent._lbl_1usd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private lbl_5usd As Label";
maincambio.mostCurrent._lbl_5usd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lbl_10usd As Label";
maincambio.mostCurrent._lbl_10usd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lbl_20usd As Label";
maincambio.mostCurrent._lbl_20usd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim billetes_disponibles() As Int";
maincambio._billetes_disponibles = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 24;BA.debugLine="billetes_disponibles = Array As Int(20, 10, 5, 1)";
maincambio._billetes_disponibles = RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 20),BA.numberCast(int.class, 10),BA.numberCast(int.class, 5),BA.numberCast(int.class, 1)});
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}