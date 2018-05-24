package com.codecool.Annotation;

import com.sun.net.httpserver.HttpExchange;

public class Routes {


    @WebRoute(path="/other")
    public void route(HttpExchange exchange){
        String response = "Other response";
        exchange.setAttribute("response", response);
    }

    @WebRoute()
    public void basicRoute(HttpExchange exchange){
        String response = "Basic design";
        exchange.setAttribute("response", response);
    }
}
