package com.mycompany.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class Language2Ex {

	public static void main(String[] args) {
		
		ArrayList<Language> languages = new ArrayList<>();
		languages.add(new Language("Korean", 15));
		languages.add(new Language("USA", 16));
		languages.add(new Language("UK", 17));
		languages.add(new Language("JPN", 18));
		
//		------------------------------------------------------------
		
		for (int i = 0; i < languages.size(); i++) {
			System.out.println("languages.get("+i+").name: "+languages.get(i).name);
		}
		for(Language language:languages) {	// for(타입  변수몀 : 콜렉션변수명){}
			System.out.println("language.name: "+language.name);
		}

	}

}
