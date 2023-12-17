<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib prefix="form" uri="https://www.springframework.org/tags/form" %>

        <!DOCTYPE html>
        <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>TVDB</title>
        </head>
        <body>
            <header>
                <h1>Bienvenidos a TVDB!</h1>
            </header>

            <div class="main">
                <div class="register">
                    <form:form action="/user" method="post" modelAttribute="user">
                        <p>
                            <form:label path="name">Nombre:</form:label>
                            <form:input path="name"/>
                            <form:errors path="name"/>
                        </p>
                        <p>
                            <form:label path="email">Correo:</form:label>
                            <form:input path="email"/>
                            <form:errors path="email"/>
                        </p>
                        <p>
                            <form:label path="password">Contraseña:</form:label>
                            <form:input path="password"/>
                            <form:errors path="password"/>
                        </p>
                        <p>
                            <form:label path="confirmPassword">Confirmar contraseña:</form:label>
                            <form:input path="confirmPassword"/>
                            <form:errors path="confirmPassword"/>
                        </p>

                        <label for="submit">Registrarte</label>
                        <input type="submit" value="submit">
                    </form:form>
                </div>
            </div>

        </body>
        </html>