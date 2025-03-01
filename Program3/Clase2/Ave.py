
class Ave(Animal):
    def __init__(self, nombre, peso, año_nacimiento, propietario):
        # Llamamos al constructor de la clase base (Animal)
        super().__init__(nombre, peso)
        # Atributos adicionales específicos de Ave
        self.año_nacimiento = año_nacimiento
        self.propietario = propietario

    def __str__(self):
        # Llamamos al método __str__ de la clase base para obtener la parte común
        animal_info = super().__str__()
        # Agregamos la información específica de la clase Ave
        return f"{animal_info}, Año de nacimiento: {self.año_nacimiento}, Propietario: {self.propietario}"

    def calcular_edad(self):
        # Obtener el año actual
        año_actual = datetime.now().year  # Corregido: Usamos datetime para obtener el año actual
        # Calcular la edad
        edad = año_actual - self.año_nacimiento
        # Verificar si el animal es mayor o menor de edad
        if edad >= 5:
            return f"{self.nombre} es MAYOR DE EDAD (Edad: {edad} años)"
        else:
            return f"{self.nombre} es MENOR DE EDAD (Edad: {edad} años)"

