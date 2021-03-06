package org.christelle.javabrains.messenger.ressources.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.christelle.javabrains.messenger.database.DatabaseClass;
import org.christelle.javabrains.messenger.ressources.model.Message;

public class MessageService {
	private Map<Long, Message> messages =DatabaseClass.getMessages();

	public MessageService () {
		messages.put (1L, new Message(1, "Hello world", "Christelle"));
		messages.put (2L, new Message(2, "Hello Jersey", "Christelle"));
		
	}
	
	
	public List <Message> getAllMessages() {
		return new ArrayList<Message> (messages.values());
		
	}
	public Message getMessage (long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size() +1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <=0) {
			return null;
		}
		messages.put (message.getId(),message);
		return message;
		}
	public Message removeMessage(long id ){
	return messages.remove(id);
	}
}	
		
		
		/*Message m1 = new Message(1L, "Hello World!", "Christelle");
		Message m2 = new Message(2L, "Hello Jersey!", "Christelle");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;*/
		
		// WE WANT This message instances created here to be  returned as XML in message resource class					
	
		
	


