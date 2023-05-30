package de.istec;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    @ConfigProperty(name = "exampledata.username")
    String exampleDataUsername;
    @ConfigProperty(name = "exampledata.password")
    String exampleDataPassword;

    @GET
    @Path("/secret")
    @Produces(MediaType.TEXT_PLAIN)
    public String secret() {
        return "Secrets from terraform: \n Username: " + exampleDataUsername + "\n Password: " + exampleDataPassword;
    }

    @GET
    @Path("/secret/{value}")
    @Produces(MediaType.TEXT_PLAIN)
    public String secret(@PathParam("value") int v) {
        String res = v == 1 ? "Username: " + exampleDataUsername : "Password: " + exampleDataPassword;
        return "Value from terraform \n" + res;
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
