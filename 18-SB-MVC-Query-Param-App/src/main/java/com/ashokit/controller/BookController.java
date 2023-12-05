package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ashokit.domain.Book;

@Controller
public class BookController {

	@GetMapping("/price")
	public @ResponseBody String getBookPrice(@RequestParam("bname") String bookName) {
		String msgTxt = "The price of " + bookName + " is :: 450.00";
		return msgTxt;
	}

	@GetMapping("/check")
	public @ResponseBody String checkAvailability(@RequestParam("book") String bookName,
			@RequestParam("author") String authorName) {
		String msgTxt = "The Book " + bookName + " Written By " + authorName + " Is Not AVailable.";
		return msgTxt;
	}

	@GetMapping("/add")
	public @ResponseBody String captureData(Book book) {
		String msg = "Book Added successfully";
		System.out.println(book);
		return msg;
	}
}
