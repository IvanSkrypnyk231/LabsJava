import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/")
public class Controller {
    private static Shop shop = new Shop("Shop", 1000);
    @Autowired
    private GoodsRepository repo;

    @GET
    @Path("/goods/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response good(@PathParam("id") String id) {
        for (Goods g: shop.getGoods()) {
            if(g.getID() == Integer.parseInt(id))
                //repo.findById((int)g.getID())
                return Response.status(200).entity("" + g).build();
        }
        return Response.status(200).entity("Good id undefined").build();
    }

    @GET
    @Path("/goods")
    @Produces(MediaType.TEXT_PLAIN)
    public Response goods() {
        return Response.status(200).entity("" + shop.getGoods()).build();
        //return Response.status(200).entity("" + repo.findAll()).build();
    }

    @POST
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    public Response add(@QueryParam("price") float price,
                        @QueryParam("name") String name,
                        @QueryParam("weight") float weight,
                        @QueryParam("producer") String producer,
                        @QueryParam("type") campaignType type) {
        Goods goods = new Goods(price, name, weight, producer, type);
        shop.addGoods(goods);
        //repo.save(goods);
        return Response.status(200).entity("Succesfuly added: " + shop.getGoods()).build();
    }

    @PUT
    @Path("/update")
    @Produces(MediaType.TEXT_PLAIN)
    public Response update(
                        @QueryParam("price") int id,
                        @QueryParam("price") float price,
                        @QueryParam("name") String name,
                        @QueryParam("weight") float weight,
                        @QueryParam("producer") String producer,
                        @QueryParam("types") campaignType type) {
        Goods goods = new Goods(price, name, weight, producer, type);
        shop.updateGoods(id, goods);
        return Response.status(200).entity("Succesfuly updated: " + shop.getGoods()).build();
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response sort(@PathParam("id") int id) {
        //repo.deleteById(id);
        shop.delete(id);
        return Response.status(200).entity("Deleted at: " + id).build();
    }

}
