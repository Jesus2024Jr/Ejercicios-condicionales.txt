def main():
    nombre = input("Ingrese su nombre: ")
    apellido = input("Ingrese su apellido: ")
    edad = int(input("Ingrese su edad: "))
    sexo = input("Ingrese su sexo (Masculino/Femenino): ")

    if edad >= 18:
        print(f"{nombre} {apellido} es mayor de edad.")
    else:
        print(f"{nombre} {apellido} es menor de edad.")

    if sexo.lower() == "masculino":
        print("Es un Hombre.")
    else:
        print("Es una Mujer.")

if __name__ == "__main__":
    main()