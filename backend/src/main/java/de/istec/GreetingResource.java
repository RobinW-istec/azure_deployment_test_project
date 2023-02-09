package de.istec;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class GreetingResource {

    @Inject
    EntityManager em;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)
    public List<de.istec.Data> data() {

        return em.createNamedQuery("getAllData", Data.class).getResultList();
    }

    @GET
    @Path("/data/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Data byId(@PathParam("id") Long id) {

        return (Data) em.createNativeQuery(
                "SELECT id, name, devmode, somenumber FROM data d where id = :id", Data.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
