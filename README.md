# Practice 06

## Goals
* You'll have to write you first ReST API
* You'll write all the business logic, all the layers of your server!
* Handle a Single Page Application, built with AngularJS

# Startup
A few classes and files are provided to help you. A SQL dump is also available in order to initialize your DB.

Did you notice that the "core" module is not present? Build it by yourself ;) The services, the DAOs and so on...

# Main concepts
* There is a GUI that shows a calendar with different views
* All the calls between the browser and your server are made with AJAX.
* The only data format that is exchanged is JSON
* Guess the fields of your entities by reading the SQL dump
* Please do not modify the front assets (HTML, JS, CSS files)!
* The previous works are your best friends for this practice.

# The API

* a `GET` call on `http://localhost:8080/pw06-web/api/calevents/` should return the list of all the events of the database
* a `GET` call on `http://localhost:8080/pw06-web/api/calevents/xx` should return the details of the event with id XX
* a `POST` call on `http://localhost:8080/pw06-web/api/calevents/` will save a new event in the database, based on the JSON content of the request 

# The GUI
It is available at the following URL : `http://localhost:8080/pw06-web/`