package de.istec;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class GreetingResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)
    public String data() {
        return "Data from Database comming soon...";
        //return em.createQuery("SELECT s FROM schichten s where cut = :cut", Schicht.class)
        //        .setParameter("cut", cut)
        //        .getResultList();
    }

}
