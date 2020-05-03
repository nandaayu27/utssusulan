package com.app.data;

import com.app.data.entity.Cinema;
import com.app.data.repository.CinemaRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BelajarSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringApplication.class, args);
	}
        @Bean
        public CommandLineRunner testInsertData(CinemaRepository repo){
            return args -> {
                Cinema cin = new Cinema();
                cin.setmovieid("MOV001");
                cin.setmovieid("MOV002");
                cin.settitle("AVENGERS START GAME");
                cin.settitle("JUSTICE LAEGUE VS PREMIERE");
                cin.setgenre("SCIENT FICTION");
                cin.setgenre("ACTION");
                cin.setduration("240 MINUTES");
                cin.setduration("220 MINUTES");
                cin.setactors("ROBERT DOWNEY SR");
                cin.setactors("TOM HOLLAND");
                
                repo.save(cin);
                System.out.println("Insert data berhasil");
            }     
        }
        
}
public CommandLineRunner testSelectData(CinemaRepository repo){
            return args -> {
                List<Cinema> list= repo.findAll();
                for(Cinema cin: list){
                    System.out.println("movieid : " + cin.getmovieid()
                    +"title : " +cin.gettitle());  
                } 
                    }
                    }