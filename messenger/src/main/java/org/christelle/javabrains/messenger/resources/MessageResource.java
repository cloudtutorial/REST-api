package org.christelle.javabrains.messenger.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.christelle.javabrains.messenger.ressources.model.Message;
import org.christelle.javabrains.messenger.ressources.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	//we have 2 APIs
	
	// To get all messages, map to / messages in @path/ messages
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	//to get individual messages, map to /messages/messageId 
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public  Message getMessage(@PathParam("messageId")long Id) {
		return messageService.getMessage(Id); 
		
	}
	 @GET
	 @Path("/test")
	    @Produces(MediaType.TEXT_PLAIN)
	    public String getIt() {
	        return "Got it!";
	    }
}
