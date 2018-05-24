package com.codecool.Annotation;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;

public class Handler implements HttpHandler {


    public void handle(HttpExchange webRoute) throws IOException {
        String path = webRoute.getRequestURI().getPath();
        Method[] methods = getMethods(Routes.class.getMethods(), path);



        InputStream inputStream = webRoute.getRequestBody();
        inputStream.read();
        String response = "Bende design factory";
        webRoute.sendResponseHeaders(200, response.length());
        OutputStream outputStream = webRoute.getResponseBody();
        outputStream.write(response.getBytes());
        outputStream.close();
    }

    private Method[] getMethods(Method[] methods, String path) {


        return methods;
    }
}
