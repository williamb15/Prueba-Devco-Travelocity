# **Prueba Tecnica Devco Travelocity**

## Introduction 🚀


Travelocity is an online travel agency operated by Travelocity.com LP. Travelocity is a subsidiary of Saber Holdings Corporation, whose shareholders are Silver Lake Partners and Texas Pacific Group since March 2007

Travelocity is the sixth largest travel agency in the United States, and the second largest online agency. In addition to the retail site, Travelocity operates a full service for business travel, Travelocity Business, it also has retail sales sites in Argentina, Canada, Germany, France, the Scandinavian countries, Mexico, India, the United Kingdom, and as lastminute.com in Europe and Zuji in Asia. Other brands operated include World Choice Travel and Travelocity on Location.

The tests for this application are run on the following website: [Travelocity] (https://www.travelocity.com/).

## Pre requirements 📋
- Java version 1.8, update 191 or higher and JDK (environment variables configured).
- Eclipse IDE or IntelliJ IDEA (version 2019 or higher).
- Gradle version 5.5.1 or higher (environment variables configured).
- Cucumber for Java Plugin (updated version).
- Gherkin Plugin (updated version).
- ChromeDriver version 90.0.4430.24 for local runs of automations.

## Web browser 🌐
Automation currently runs in the following browser:
- Google Chrome Versión 91.0.4472.101 (Build oficial) (64 bits)

## Installation ⚙️
- To clone this repository locally, the following command must be run: 
```git clone https://github.com/williamb15/Prueba-Devco-Travelocity.git```
- Import the project from Eclipse or IntelliJ IDE under the structure of an existing Gradle project. 
- Configure JRE System Library with JavaSE-1.8.
- Configure the encoding to UTF-8 to the project once it is imported.

## Compile the project and generate Wrapper 🔧
- To build the project you must run the command:
```gradle clean build -x test```.

## Command for execution ▶️
- The project can be run from the console, being in the project folder with the following command:
```gradle clean test --tests=* aggregate --info```.
- The Serenity report will be generated in the folder ``/target/site/serenity/`` located in the root folder of the project.

## Building 🛠
Automation is developed with:
 - BDD (Behavior-Driven Development) - Development strategy
 - Screenplay pattern - Design pattern that applies SOLID principles
 - Gradle - Project and Dependency manager
 - Selenium Web Driver - Tool to automate actions in web browsers
 - Cucumber - Framework to automate BDD tests
 - Serenity BDD - Framework, Open source library for report generation
 - Gherkin - Business-readable domain specific language (DSL)

## Programming convention 🎨
The following writing styles are used in automations:
- Variables and functions: Lower Camel Case. Example: `nomenclatureExample`.
- Class names: PascalCase or Upper Camel Case. Example: `NomenclatureExample`.
- Feature names: Snake Case. Example: `nomenclature_example`.

## Versioning 🔀
Git is used for version control

## "Documentos de Pruebas" folder 📑
---
It is the folder that contains an evidence file, about a defect found on the website.

## Travelocity folder 🎬
---
It is the folder that contains the automated testing project

### Travelocity Project structure 🚧

The complete structure of the automation project is as follows:

* ```src/main/java/co/com/devco/certification/travelocity/```
``` 

+ exceptions
    Classes that catch exceptions and throw custom messages when automation fails due to it is not found what was expected.

+ integrations
    Classes that enable connection to services.

+ interactions
    Classes that perform low-level actions, such as select a text field, search a case, among others.

+ models
    Classes with which the data models are built using the builder pattern.

+ questions
    Classes with which values are obtained from the application to be verified (asserts).

+ tasks
    Classes that perform high-level actions, such as login in the application, enter data into a form, etc.

+ userinterfaces
    Classes where the elements of the user interface are mapped throw Xpaths.

+ utils
    Classes that contain common functionalities, such as files handling (Excel or XML), or string handling.
```

* ```src/test/java/co/com/devco/certification/travelocity/```
```
+ runners
    Classes to execute the automations with the scenarios indicated in the equivalents Features.

+ stepdefinitions
    Classes that allow the translation of the Gherkin language used in the Features into machine language, thus they make possible the execution of automation.
    There is a general Step Definitions class that contains the configuration and steps that are repeated in the other Step Definitions, therefore the General inherits to the others.
 ```

* ```src/test/resources/```
```

+ data_driven
    Files to interact with the application through automation.

+ driver
    Chrome drivers used to run automation.

+ features
    The project features are found here.
```

## Travelocity folder 🖱
---
It is the folder that contains the manual testing project

### TravelocityManual Project structure 🚧

The complete structure of the manual project is as follows:

* ```src/test/java/co/com/devco/certification/travelocitymanual/```
```
+ runners
    Classes to execute the manual tests with the scenarios indicated in the equivalents Features.

+ stepdefinitions
    Class that allow the translation of the Gherkin language used in the Features into machine language.
    There is a general Step Definitions class called ManualTestDefinitions that contains the configuration to get the evidence of manual scenarios.
 ```

* ```src/test/resources/```
```
+ features
    The project features are found here.
```

### Running the manual tests ⏭

- When running the manual tests, several pop-up windows will appear, one for each step of the test, where it must be indicated whether the step was successful or failed.
- In case of failure, a new pop-up window will appear, indicating the reason why it failed.

## Vocabulary 📚
---
### BDD
BDD is used as an automation framework for the automation of test scenarios, the idea is to write the tests before writing the source code, but instead of unit tests, what is done is to write tests that verify that the behavior of the Application is correct from a business point of view. After writing the tests, the source code of the functionality that makes these tests pass is written.

### Gherkin
Gherkin is used as a language for the development of functionalities since it is a language understandable by humans and computers, with it the behavior of the page to be automated is defined. It is an easy to read, easy to understand and easy to write language. Using Gherkin allows you to create a live documentation while automating the tests, also doing it with a language that can be understood from the business point of view.

To build BDD with Gherkin it is only necessary to know 5 words. With which the sentences that describe the functionalities are made:

- **Feature:** Indicates the name of the functionality to be tested. It must be a clear and explicit title. In addition, a description in the form of a user story is included: “As [role] I want [feature] so that [benefits]”. According to this description, the test scenarios are constructed.
- **Scenario:** Describe each scenario to be tested.
- **Given:** Provides context for the scenario in which the test will be executed, such as the point where the test is carried out, or data prerequisites. It includes the steps necessary to put the system in the desired state to run the test.
- **When:** Specifies the set of actions that launch the test. The user interaction that triggers the functionality to be tested.
- **Then:** Specifies the expected result in the test. It is validated if the changes observed in the system are the desired ones.

In addition to these five words, it can be used **Background** to group the same steps that are executed before each scenario in order to avoid code repetition.

### Cucumber
Cucumber is used as a tool to automate testing in BDD. Cucumber allows it to run functional descriptions in plain text like automated software tests. Fully compatible with the Gherkin language.

### Compiler
The project is created with Gradle, which is a project and dependency manager, it is the improved version of Maven, but it tries to take it one step further. For starters, it relies on Groovy and a DSL (Domain Specific Language) to work with a simple and clear language when constructing the build compared to Maven. On the other hand, it has great flexibility which allows to work using other languages and not just Java.

### IntelliJ
The IntelliJ IDE is used for automation development. IntelliJ is a development platform, designed to be extended indefinitely through plug-ins. It was conceived from its origins to become a platform for integrating development tools.

It does not have a specific language in mind, but is a generic IDE, although it is very popular among the Java language developer community using the JDT plug-in that is included in the standard distribution of the IDE.

It provides tools for managing workspaces, writing, deploying, running, and debugging applications.

## Author ✒
* **William Andrés Betancur Aguirre** - [williamb.a@hotmail.com](#github #williamb15)