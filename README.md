# Aplicación para calcular la letra del DNI

Esta aplicación está estructurada utilizando el patrón de diseño Modelo-Vista-Controlador (MVC) para una mejor organización del código.

## Estructura del proyecto
- `model/DNICalculator.java`: Contiene la lógica para calcular la letra del DNI.
- `view/DNIView.java`: Maneja la interacción con el usuario.
- `controller/DNIController.java`: Coordina la lógica entre el modelo y la vista.
- `Main.java`: Punto de entrada de la aplicación.

## Ejecución
1. Compila todo el proyecto:
<pre>javac Main.java model/.java view/.java controller/*.java</pre>

2. Ejecuta el programa:
<pre>java Main </pre>


## Pruebas Unitarias
- Se realizan pruebas al modelo (`DNICalculatorTest`) para validar el cálculo de la letra.

<h2>Ejecución de los tests</h2>
    <p>Para ejecutar los tests, usa el siguiente comando:</p>
    <pre>mvn test</pre>
    <p>Asegúrate de tener las dependencias de Hamcrest configuradas en tu archivo <code>pom.xml</code> para ejecutar las pruebas correctamente.</p>

   <h3>Captura de la cobertura de tests</h3>
    <img src="/foto/Captura desde 2024-11-26 15-18-16.png"  alt="Cobertura de Tests" />

<p><strong>Autor:</strong> FUAD AL KWKABANI  <a href="https://github.com/Fuad-Alkwkabani">GitHub</a>






