package datatec.studio;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/**
 * @author https://datatec.studio
 */
@Path("greeting")
public class GreetingService {
    @PathParam("name") String name;

    @GET
    @Path("{name}")
    public String sayHello() {
        return "Hello, " + name + "!";
    }
}