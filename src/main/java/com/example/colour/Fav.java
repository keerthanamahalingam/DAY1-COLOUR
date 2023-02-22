package com.example.colour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Fav {
	private String yourFavColor="Black";
	@GetMapping("/")
	public String getMyFav() {
		return " My Fav Color is " + yourFavColor;
	}

}
