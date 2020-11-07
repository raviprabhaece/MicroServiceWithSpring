package com.example.demo;

import com.example.demo.dao.Teamdao;
import com.example.demo.domain.Player;
import com.example.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	/*
	 * Used when running as a JAR
	 * */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	* Used when running as WAR File
	* */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}

	@PostConstruct
	public void init(){

		Set<Player> players = new HashSet<>();
		players.add(new Player("S Watson", "Mid-off"));
		players.add(new Player("MS Dhoni", "Keeper"));
		players.add(new Player("S Curran", "Long On"));
		players.add(new Player("M Vijay", "Deep Mid Wicket"));
		players.add(new Player("P Chawla", "Point"));
		players.add(new Player("du Plessis", "Cover"));
		Team team = new Team("Chennai","CSK", players);
		teamdao.save(team);

	/*	players.add(new Player("S Smith", "Mid-off"));
		players.add(new Player("Y Jaiswal", "Keeper"));
		players.add(new Player("Sanju Samson", "Long On"));
		players.add(new Player("David Miller", "Deep Mid Wicket"));
		players.add(new Player("Robbie Uthappa", "Point"));
		players.add(new Player("Rahul Tiwathia", "Cover"));
		Team team2 = new Team("Rajastan","RR", players);
		teamdao.save(team2);*/
	}
	@Autowired
	Teamdao teamdao;

}
