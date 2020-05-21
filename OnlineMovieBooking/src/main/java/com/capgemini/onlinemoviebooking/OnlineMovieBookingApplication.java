package com.capgemini.onlinemoviebooking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.onlinemoviebooking.dao.MovieDao;
import com.capgemini.onlinemoviebooking.dao.TheaterDao;
import com.capgemini.onlinemoviebooking.dao.UserDao;
import com.capgemini.onlinemoviebooking.entity.GenreList;
import com.capgemini.onlinemoviebooking.entity.LanguageList;
import com.capgemini.onlinemoviebooking.entity.Movie;
import com.capgemini.onlinemoviebooking.entity.Screen;
import com.capgemini.onlinemoviebooking.entity.Show;
import com.capgemini.onlinemoviebooking.entity.Theater;
import com.capgemini.onlinemoviebooking.entity.User;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

@SpringBootApplication
public class OnlineMovieBookingApplication implements CommandLineRunner{

	@Autowired
	UserDao userDao;
	@Autowired
	MovieDao movieDao;
	@Autowired
	TheaterDao theaterDao;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineMovieBookingApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	
		//userDao.save(new User(101, "amanadmin",true, "amanadmin"));
		//userDao.save(new User(102, "aman",false, "amanuser"));
		
//		movieDao.save(new Movie(4, "I, Robot1", GenreList.Action.toString(), LanguageList.English.toString(), "Alex1"));
//		movieDao.save(new Movie(3, "WAR1",GenreList.Action.toString(), LanguageList.Hindi.toString(), "Siddarth1"));
//		List<Movie> listOfMovie=new ArrayList<Movie>();
//		listOfMovie.add(new Movie(4, "I, Robot1", GenreList.Action.toString(), LanguageList.English.toString(), "Alex1"));
//		
//		List<Show> showList=new ArrayList<Show>();
//		Date startDate=new Date();
//		LocalDateTime startTime= new Loc)
//		showList.add(new Show(1, LocalDateTime showstartTime, LocalDateTime showendTime, int seats, String showName,
//				Movie movieName, String screenName, Theater theater))
//		
//		List<Screen> listOfScreen=new ArrayList<Screen>();
//		listOfScreen.add(new Screen(1, "One", showList, 4,1, 1000));
//		
//		
//		theaterDao.save(new Theater(1000,"Inox", "Delhi", "Sams", "9986870274",listOfMovie,listOfScreen));
	}

}
