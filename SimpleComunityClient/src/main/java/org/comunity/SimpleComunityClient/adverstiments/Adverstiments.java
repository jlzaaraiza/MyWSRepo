package org.comunity.SimpleComunityClient.adverstiments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

import com.comunity.announcements.beans.UserMessages;

@Component
public class Adverstiments {

	@Autowired
	private RestOperations restOperations;
	private String url;
	
	@Autowired
	public Adverstiments(@Value("${community.adverstisement.usermessager.url}") final String url){
		this.url = url;
	}
	
	public UserMessages getUserMessager(final String userId){
		return restOperations.getForObject(url, UserMessages.class, userId);
	}
	
}
