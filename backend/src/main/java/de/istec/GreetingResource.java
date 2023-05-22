package de.istec;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class GreetingResource {

    //@Inject
    //EntityManager em;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        return "Hello from RESTEasy Reactive";
    }

    @ConfigProperty(name = "testdata.value")
    String testDataValue;

    @GET
    @Path("/secret")
    @Produces(MediaType.TEXT_PLAIN)
    public String secret() {
        return "Value from terraform: " + testDataValue;
    }

//    @GET
//    @Path("/data")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<de.istec.Data> data() {
//
//        return em.createNamedQuery("getAllData", Data.class).getResultList();
//    }
//
//    @GET
//    @Path("/data/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Data byId(@PathParam("id") Long id) {
//
//        return (Data) em.createNativeQuery(
//                "SELECT id, name, devmode, somenumber FROM data d where id = :id", Data.class)
//                .setParameter("id", id)
//                .getSingleResult();
//    }
}
