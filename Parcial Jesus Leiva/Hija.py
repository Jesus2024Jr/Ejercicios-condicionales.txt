
class Empleado:
    def __init__(self, nombre_cargo: str, salario: float, jefe_inmediato: str, años_experiencia: int):
        self.__nombre_cargo = nombre_cargo
        self.__salario = salario
        self.__jefe_inmediato = jefe_inmediato
        self.__años_experiencia = años_experiencia

    # GET
    def get_nombre_cargo(self) -> str:
        return self.__nombre_cargo

    def get_salario(self) -> float:
        return self.__salario

    def get_jefe_inmediato(self) -> str:
        return self.__jefe_inmediato

    def get_años_experiencia(self) -> int:
        return self.__años_experiencia

    # SET
    def set_nombre_cargo(self, nombre_cargo: str):
        self.__nombre_cargo = nombre_cargo

    def set_salario(self, salario: float):
        self.__salario = salario

    def set_jefe_inmediato(self, jefe_inmediato: str):
        self.__jefe_inmediato = jefe_inmediato

    def set_años_experiencia(self, años_experiencia: int):
        self.__años_experiencia = años_experiencia


def main():
    nombre = input("Digite su nombre: ")
    apellido = input("Digite su apellido: ")
    direccion = input("Digite su dirección: ")
    telefono = input("Digite su teléfono: ")
    edad = int(input("Digite su edad: "))
    email = input("Digite su email: ")
    salario = float(input("Digite su salario: "))
    jefe_inmediato = input("Digite su jefe inmediato: ")
    años_experiencia = int(input("Digite sus años de experiencia: "))

    if salario >= 5000000 and años_experiencia >= 5 and 25 <= edad <= 45:
        nombre_cargo = "Senior"
    elif 900000 <= salario <= 1200000 and 1 <= años_experiencia <= 2 and 18 <= edad <= 22:
        nombre_cargo = "Junior"
    else:
        nombre_cargo = "No aplica"

    empleado = Empleado(nombre_cargo, salario, jefe_inmediato, años_experiencia)

    print("Detalle del Empleado:")
    print(f"Nombre: {nombre}")
    print(f"Apellido: {apellido}")
    print(f"Dirección: {direccion}")
    print(f"Teléfono: {telefono}")
    print(f"Edad: {edad}")
    print(f"Email: {email}")
    print(f"Salario: {empleado.get_salario()}")
    print(f"Jefe Inmediato: {empleado.get_jefe_inmediato()}")
    print(f"Años de Experiencia: {empleado.get_años_experiencia()}")
    print(f"Cargo: {empleado.get_nombre_cargo()}")


if __name__ == "__main__":
    main()