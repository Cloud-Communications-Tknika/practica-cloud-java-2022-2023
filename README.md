# Practica Cloud Java 2022-2023

Aitor Iturrioz & Pablo Rubio 

Este repositorio es el código inicial del ejercicio principal del Curso Cloud de Tknika.

Es una rest API simple con tres métodos:

    GET persona/{id}

    PUT persona/add pasando la persona en el cuerpot

    GET persona/init para introducir 3 datos en la BBDD.

Utiliza Maven como gestor de paquetes, por lo que:

Para empaquetar el proyecto usar:

    mvn package

Para realizar los test:

    mvn test

Generar la documentación:

    mvn javadoc:javadoc

Tras hacer mvn package para ejecutar la aplicación debemos ejecutar.

    java -jar ./targe/*.jar