package com.mycompany.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		Language language1 = new Language("Korean", 82);
		
//		System.out.println(language1.name);
		
//		ArrayList<Language> arrayList = new ArrayList<>();
		List<Language> languages = new ArrayList<>();
		
//		languages.add("asdadasd"); error: language 객체를 널어야 함
		languages.add(language1);
		Language language2 = new Language("USA", 10);
		Language language3 = new Language("JPN", 11);
		languages.add(language2);
		languages.add(language3);
		
		languages.add(new Language("England", 15));
//		Car car = new Car("HYundai",2000);
		
//		languages.add(car); error:language 객체만 담을수 있다.
		List<Car> cars = new ArrayList<>();
		cars.add( new Car("HYundai",2000));
		cars.add( new Car("BMW",2000));
		cars.add( new Car("KIA",2000));
		cars.add( new Car("PSE",2000));
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("cars.get("+i+").name: "+cars.get(i).getName());
		}
		for(Car car:cars) {	// for(타입  변수몀 : 콜렉션변수명){}
			System.out.println("car.name: "+car.getName());
		}
		
//		------------------------------------------------------------
		
		languages.get(3).name="UK";
		for (int i = 0; i < languages.size(); i++) {
			System.out.println("languages.get("+i+").name: "+languages.get(i).name);
		}
		for(Language language:languages) {	// for(타입  변수몀 : 콜렉션변수명){}
			System.out.println("language.name: "+language.name);
		}

	}

}
