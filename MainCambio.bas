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

	Private txt_valor As EditText
	Private lbl_1usd As Label
	Private lbl_5usd As Label
	Private lbl_10usd As Label
	Private lbl_20usd As Label
	
	' Array de billetes disponibles
	Dim billetes_disponibles() As Int
	billetes_disponibles = Array As Int(20, 10, 5, 1)
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("lyBilletes")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub btn_calcular_Click
	
	Dim resto As Int
	
	Dim aux As Double
	Dim entero  As Int
	Dim decimal  As Double
	
	Dim acm_1 As Int
	Dim acum_5 As Int
	Dim acum_10 As Int
	Dim acm_20 As Int
	
	resto = txt_valor.Text
	
	If resto > 0 Then
		For i = 0  To billetes_disponibles.Length - 1
			If resto >= billetes_disponibles(i) Then
				aux = resto/billetes_disponibles(i)
				entero = Floor(aux)
				decimal = aux - entero
				resto = decimal * billetes_disponibles(i)
				
				If i == 0 Then
					acm_20 = entero
					
				Else If i == 1 Then
					acum_10 = entero
					
				Else If i == 2 Then
					acum_5 = entero
					
				Else If i == 3 Then
					acm_1 = entero
					
				End If
				
				aux = 0
				entero = 0
				decimal = 0
	
			End If
			'Log(billetes_disponibles(i) & " " & i)
		Next
	End If
	
	lbl_20usd.Text = acm_20
	lbl_10usd.Text = acum_10
	lbl_5usd.Text = acum_5
	lbl_1usd.Text = acm_1
	
End Sub