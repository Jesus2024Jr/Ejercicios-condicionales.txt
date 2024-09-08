class Usuario:
    def __init__(self, nombre_completo, nickname, clave, tipo):
        self.datos = {
            "nombre_completo": nombre_completo,
            "nickname": nickname,
            "clave": clave,
            "tipo": tipo,
        }

    def buscar_usuario(self, nickname):
        if self.datos["nickname"] == nickname:
            return self.datos
        else:
            return None

    def eliminar_usuario(self, nickname):
        if self.datos["nickname"] == nickname:
            del self.datos
            return "Usuario eliminado"
        else:
            return "Usuario no encontrado"


def menu():
    usuarios = []
    while True:
        print("\n1. Agregar Usuario")
        print("2. Buscar Usuario")
        print("3. Eliminar Usuario")
        print("4. Salir")
        opcion = input("Seleccione una opción: ")
        
        if opcion == "1":
            nombre_completo = input("Ingrese nombre completo: ")
            nickname = input("Ingrese nickname: ")
            clave = input("Ingrese clave: ")
            tipo = input("Ingrese tipo: ")
            usuario = Usuario(nombre_completo, nickname, clave, tipo)
            usuarios.append(usuario)
            print("Usuario agregado exitosamente")
        elif opcion == "2":
            nickname = input("Ingrese nickname a buscar: ")
            for usuario in usuarios:
                resultado = usuario.buscar_usuario(nickname)
                if resultado:
                    print(resultado)
                    break
            else:
                print("Usuario no encontrado")
        elif opcion == "3":
            nickname = input("Ingrese nickname a eliminar: ")
            for usuario in usuarios:
                resultado = usuario.eliminar_usuario(nickname)
                if resultado:
                    print(resultado)
                    usuarios.remove(usuario)
                    break
            else:
                print("Usuario no encontrado")
        elif opcion == "4":
            break
        else:
            print("Opción no válida")


menu()