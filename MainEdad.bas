B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private txt_fechaInicio As EditText
	Private txt_fechaHasta As EditText
	Private lbl_resultados As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("lyFechas")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btn_calcular_Click
	
	DateTime.DateFormat="dd/MM/yyyy"
	
	Dim numDays As Int = (DateTime.DateParse(txt_fechaHasta.Text) - DateTime.DateParse(txt_fechaInicio.Text)) / DateTime.TicksPerDay
	
	lbl_resultados.Text = numDays
	
End Sub