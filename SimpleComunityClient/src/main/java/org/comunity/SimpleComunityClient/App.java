package org.comunity.SimpleComunityClient;

import org.comunity.SimpleComunityClient.adverstiments.Adverstiments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.comunity.announcements.beans.UserMessages;

@SpringBootApplication
public class App implements CommandLineRunner
{
	private Logger log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Autowired
    private Adverstiments adverstisements;
    
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		UserMessages userMessager = adverstisements.getUserMessager("usr");
		log.debug("Response {}",userMessager);
	}
    
    
}
