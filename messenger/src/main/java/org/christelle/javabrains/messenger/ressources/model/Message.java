package org.christelle.javabrains.messenger.ressources.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement 
public class Message {
	
	private long id;
	private String messages;
	private Date created;
	private String author;
	
	public Message(){
	
	// Always create a no op constructor public Message(){}
	}
	
	
	public Message(long id, String message, String author){
		this.id = id;
		this.messages = message;
		this.author = author;
		this.created = new Date();
		//to create new instances
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	} 
	

}
