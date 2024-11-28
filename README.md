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

El proyecto incluye pruebas unitarias diseñadas para garantizar el correcto funcionamiento de cada componente siguiendo el patrón MVC. Estas pruebas se realizaron utilizando **JUnit 5** y **Mockito**, alcanzando una cobertura superior al 70%.

### Pruebas Realizadas

#### 1. Modelo (`DNICalculatorTest`)
- Se realizan pruebas al modelo para validar el cálculo correcto de la letra del DNI.
- Casos de prueba:
  - **Entradas válidas:** Se verifica que para números de DNI dentro del rango permitido (0 a 99999999), la letra generada sea la esperada.
  - **Límites del rango:** Se prueban los valores extremos, como `0` y `99999999`.
  - **Entradas inválidas:** Se verifica que el modelo arroje excepciones cuando el número está fuera del rango permitido.

#### 2. Vista (`DNIViewTest`)
- Se prueban las funcionalidades de entrada y salida de datos.
- Casos de prueba:
  - **Simulación de entrada:** Se verifica que la vista capture correctamente la entrada del usuario.
  - **Captura de salida:** Se asegura que los mensajes enviados a la consola sean los esperados.

#### 3. Controlador (`DNIControllerTest`)
- Se realizan pruebas al flujo completo del programa simulando las interacciones entre el modelo y la vista.
- Casos de prueba:
  - **Flujo válido:** Se prueba que el controlador maneje correctamente entradas válidas, calcule la letra y muestre el resultado.
  - **Flujo con errores:** Se prueba que el controlador gestione correctamente entradas no numéricas o fuera de rango, mostrando los mensajes de error adecuados.

### Herramientas Utilizadas
- **JUnit 5:** Para la ejecución de las pruebas unitarias.
- **Mockito:** Para simular el comportamiento del modelo y la vista durante las pruebas del controlador.

### Ejecución de las Pruebas
Para ejecutar las pruebas unitarias, utiliza los siguientes comandos:

- **Con Maven:**
  ```bash
  mvn test

   <h3>Captura de la cobertura de tests</h3>
    <img src="/foto/Imagen pegada.png"  alt="Cobertura de Tests" />

<p><strong>Autor:</strong> FUAD AL KWKABANI  <a href="https://github.com/Fuad-Alkwkabani">GitHub</a>






