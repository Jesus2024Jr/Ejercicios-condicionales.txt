class Animal:
    def __init__(self, nombre, peso):
        self.nombre = nombre  # Atributo Nombre
        self.peso = peso      # Atributo Peso

    def __str__(self):
        return f"Animal: {self.nombre}, Peso: {self.peso} kg"
