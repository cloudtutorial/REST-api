package org.christelle.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.christelle.javabrains.messenger.ressources.model.Message;
import org.christelle.javabrains.messenger.ressources.model.Profiles;


public class DatabaseClass {
	

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profiles> Profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	public static Map< Long, Profiles>getProfiles(){
		return Profiles;
		
		
		
	}
	
	
}
