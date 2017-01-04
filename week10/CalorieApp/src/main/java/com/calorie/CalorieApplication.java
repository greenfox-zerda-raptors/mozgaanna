package com.calorie;

import com.calorie.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class CalorieApplication implements CommandLineRunner{


	@Autowired
	private MealRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CalorieApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		repository.deleteAll();
//		for (int i = 0; i < 5; i++){
//			repository.save(new Meal(new Date(), "Breakfast", "Joghurt + Coffee", 100));
//			repository.save(new Meal(new Date(), "Elevenses", "Salad", 200));
//			repository.save(new Meal(new Date(), "Lunch", "Hamburger", 400));
//			repository.save(new Meal(new Date(), "Afternoon Tea", "Earl Grey", 30));
//			repository.save(new Meal(new Date(), "Dinner", "Sandwiches by Zsuzska", 300));
//		}
	}
}
