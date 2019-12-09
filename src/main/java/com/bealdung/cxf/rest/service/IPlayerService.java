package com.bealdung.cxf.rest.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bealdung.cxf.rest.domain.Player;

@Path("/playerService")
public interface IPlayerService {
	
	@GET
	@Path("/player/{id}")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces({ MediaType.APPLICATION_JSON})
	public Player getPlayerInfo(@PathParam("id") int playerId);
	 
	@GET //http://localhost:8083/playerService/getallplayers
	@Path("/getallplayers")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Player> getAllPlayers();

}

