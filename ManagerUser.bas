B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.5
@EndOfDesignText@
Sub Class_Globals
	' Clase de persistencia
	Public bdd As String
	Private sql As SQL
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize (BDDNombre As String)
	
	bdd = BDDNombre
	' Se crea si no existe en un directorio de privado de la aplicacion
	sql.Initialize(File.DirInternal, bdd, True)
	
	sql.ExecNonQuery("CREATE TABLE IF NOT EXISTS usuario(id_user INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT(60), email TEXT(30), password TEXT(30))")
	
End Sub

Public Sub create_User(nombre As String, email As String, passw As String) As Usuario
	
	Dim usr As Usuario
	
	usr.Nombre = nombre
	usr.Email = email
	usr.Password = passw
	
	sql.ExecNonQuery2("INSERT INTO usuario(nombre, email, password) VALUES (?,?,?)", _
	Array As Object(nombre, email, passw))
	
	Return usr
	 
End Sub

Public Sub readOne_email(email As String) As Usuario
	Dim curs As Cursor
	curs = sql.ExecQuery2("SELECT * FROM usuario WHERE email = ?", Array As String(email))
	
	If curs.RowCount < 1 Then
		Return Null
	Else
		curs.Position = 0
		
		Dim item As Usuario
		item.Id_usuario = curs.GetInt("id_user")
		item.Nombre = curs.GetString("nombre")
		item.Email = curs.GetString("email")
		item.Password = curs.GetString("password")
		Return item
	End If
	
End Sub


Public Sub readByEmail(email As String) As List
	
	Dim curs As Cursor
	Dim user_item As List
	user_item.Initialize()
	
	curs = sql.ExecQuery2("SELECT * FROM usuario WHERE email LIKE ?", Array As String("%" & email & "%"))
	
	For i = 0 To curs.RowCount -1 Step 1
		curs.Position = i
		
		Dim aux_urs As Usuario
		
		aux_urs.Id_usuario = curs.GetInt("id_user")
		aux_urs.Nombre = curs.GetString("nombre")
		aux_urs.Email = curs.GetString("email")
		aux_urs.Password = curs.GetString("password")
		
		user_item.Add(aux_urs)
	Next
	
	Return user_item
	
End Sub

Public Sub update_User(id As Int, nombre As String, email As String, passw As String) As Usuario
	
	Dim usr As Usuario
	
	usr.Nombre = nombre
	usr.Email = email
	usr.Password = passw
	
	sql.ExecNonQuery2( _
	"UPDATE usuario SET nombre = ?, email = ?, password = ? WHERE id_user = ?", _
	Array As Object(nombre, email, passw, id))
	
	Return usr
	
End Sub


Public Sub delete_User( id As Int)
	sql.ExecNonQuery2("DELETE FROM usuario WHERE id_user = ?", Array As Object(id))
	
End Sub

