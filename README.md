🧪 Selenium Java Automation Framework






Suite de pruebas automatizadas UI con Selenium WebDriver, Java y TestNG sobre la plataforma DemoQA.

</div>

📌 Sobre el proyecto

Este proyecto muestra la creación de un framework de automatización Web UI desde cero.

La estructura está organizada con Page Object Model (POM) para separar los elementos y acciones de cada página de los tests.

También se trabajan aspectos habituales en automatización como:

Esperas explícitas

Localizadores

Aserciones

Interacciones con elementos

Eventos del ratón

Organización y reutilización del código

🧪 Pruebas automatizadas

Módulo

Qué se prueba

Técnicas

Text Box

Completar y validar formularios

Explicit Waits, Assertions

Buttons

Interacciones con botones

Actions API, Assertions

🏗️ Estructura del proyecto

selenium-demoqa-portfolio/
├── src/
│   ├── main/java/com/portfolio/pages/
│   │   ├── TextBoxPage.java
│   │   └── ButtonsPage.java
│   │
│   └── test/java/com/portfolio/tests/
│       ├── BaseTest.java
│       ├── TextBoxTest.java
│       └── ButtonsTest.java
│
├── pom.xml
└── README.md

¿Cómo está organizado?

Pages

Contiene los Page Objects con los localizadores y métodos necesarios para interactuar con cada página.

Tests

Contiene los casos de prueba y las validaciones.

BaseTest

Centraliza la configuración inicial y el cierre del navegador mediante @BeforeMethod y @AfterMethod.

pom.xml

Gestiona las dependencias y la configuración del proyecto mediante Maven.

🛠️ Tecnologías utilizadas

Java 17 LTS

Selenium WebDriver 4.25.0

TestNG 7.10.2

WebDriverManager 5.9.2

Apache Maven 3.9.x

🚀 Cómo ejecutar el proyecto

Requisitos

Antes de ejecutar las pruebas necesitas:

JDK 17 o superior

Maven 3.8 o superior

Un navegador compatible, como Chrome

Ejecutar todas las pruebas

mvn clean test

Ejecutar un test concreto

Solo Buttons:

mvn test -Dtest=ButtonsTest

Solo Text Box:

mvn test -Dtest=TextBoxTest

👩‍💻 Autora

Sharon

Systems Engineer & QA Automation Specialist