# Pruebas automatizadas UI con Selenium y Java

Proyecto de pruebas automatizadas sobre la plataforma DemoQA utilizando Selenium WebDriver, Java y TestNG.

En este proyecto se automatizan y validan flujos de interacción con componentes web como formularios y botones avanzados mediante el patrón de diseño Page Object Model (POM).

---

## Pruebas realizadas

### Módulo Text Box - Formulario

Se completa el formulario de datos de usuario e información de contacto enviando la información ingresada.

Se valida:

* Sincronización mediante `WebDriverWait`
* Captura de datos en los campos de entrada
* Aserción de la información mostrada tras el envío

### Módulo Buttons - Interacciones avanzadas

Se realiza la interacción con botones que requieren acciones especiales del ratón.

Se valida:

* Evento de doble clic mediante la API `Actions`
* Confirmación del mensaje de éxito tras la acción
* Independencia de ejecución de cada caso de prueba

---

## Estructura del proyecto

El código está organizado bajo el patrón Page Object Model para mantener la separación de responsabilidades:

* `src/main/java/com/portfolio/pages/`  
  Contiene las clases con los localizadores y métodos de interacción de cada página (`TextBoxPage.java`, `ButtonsPage.java`).

* `src/test/java/com/portfolio/tests/`  
  Contiene los casos de prueba y la configuración del ciclo de vida del driver (`BaseTest.java`, `TextBoxTest.java`, `ButtonsTest.java`).

---

## Tecnologías utilizadas

* `Java 17`
* `Selenium WebDriver 4.25.0`
* `TestNG 7.10.2`
* `WebDriverManager 5.9.2`
* `Apache Maven`

---

## Ejecución de las pruebas

Para ejecutar la suite completa de pruebas desde la terminal:

```bash
mvn clean test
```

Para ejecutar un módulo específico:

```bash
mvn test -Dtest=ButtonsTest
```

---

## Autora

**Sharon**  
Systems Engineer & QA Automation