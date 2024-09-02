class Padre:
    def __init__(self, nombre: str, apellido: str, direccion: str, telefono: str, edad: int, email: str):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__direccion = direccion
        self.__telefono = telefono
        self.__edad = edad
        self.__email = email

    # GET
    def get_nombre(self) -> str:
        return self.__nombre

    def get_apellido(self) -> str:
        return self.__apellido

    def get_direccion(self) -> str:
        return self.__direccion

    def get_telefono(self) -> str:
        return self.__telefono

    def get_edad(self) -> int:
        return self.__edad

    def get_email(self) -> str:
        return self.__email

    # SET
    def set_nombre(self, nombre: str):
        self.__nombre = nombre

    def set_apellido(self, apellido: str):
        self.__apellido = apellido

    def set_direccion(self, direccion: str):
        self.__direccion = direccion

    def set_telefono(self, telefono: str):
        self.__telefono = telefono

    def set_edad(self, edad: int):
        self.__edad = edad

    def set_email(self, email: str):
        self.__email = email




