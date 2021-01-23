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

	Private txt_nombre As EditText
	Private txt_email As EditText
	Private txt_passwd As EditText
	Private list_usuario As ListView
	
	'Manager de usuarios
	Dim manger As ManagerUser
	
	Dim id as Int
	
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("lyUsuario")
	
	' inicializar la base de datos
	manger.Initialize("users.sqlite")
	
	view_UserList

End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub view_UserList
	Dim user_item As List
	
	user_item = manger.readByEmail("")
	
	For i = 0 To user_item.Size - 1
		Dim urs As Usuario
		urs = user_item.Get(i)
		
		list_usuario.AddSingleLine2(urs.Nombre, urs.Email)
		
	Next
	
End Sub


Private Sub btn_eliminar_Click
	manger.delete_User(id)
	
	MsgboxAsync("Registro eliminado!", "OK")
	txt_nombre.Text = ""
	txt_email.Text = ""
	txt_passwd.Text = ""
	
	list_usuario.Clear
	view_UserList
	
End Sub

Private Sub btn_update_Click
	
	manger.update_User(id, txt_nombre.Text, txt_email.Text, txt_passwd.Text)
	MsgboxAsync("Registro actualizado!", "OK")
	list_usuario.Clear
	view_UserList
	
End Sub

Private Sub btn_readone_Click
	Dim u As Usuario = manger.readOne_email(txt_email.Text)
	
	If u = Null Then
		MsgboxAsync("Registro no encontrado!", "Ups")
	Else
		id = u.Id_usuario
		txt_nombre.Text = u.Nombre
		txt_email.Text = u.Email
		txt_passwd.Text = u.Password
		MsgboxAsync("Registro encontrado!", "OK")
	End If
	
End Sub

Private Sub btn_ingresar_Click

	manger.create_User(txt_nombre.Text, txt_email.Text, txt_passwd.Text)
	MsgboxAsync("Registro insertado!", "OK")
	list_usuario.Clear
	view_UserList
	
End Sub