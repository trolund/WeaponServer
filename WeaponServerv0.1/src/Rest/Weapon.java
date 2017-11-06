package Rest;

import javax.websocket.server.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Weapon")
public class Weapon {

	/*
	 * I stedet for at have en oprDAO i hver metode, hvorfor saa ikke
	 * have en final global oprDAO?
	 */

	@POST
	@Path("/set")
	@Produces(MediaType.TEXT_PLAIN)
	public int setWeaponId(@FormParam("Weapon_Id") int weapon_Id) {
		return weapon_Id;
	}

	

	@GET
	@Path("/get")
	@Produces(MediaType.TEXT_HTML)
	public int getWeapon(@PathParam("Weapon_Id") String weapon_Id) {
		return 201;
	}

}