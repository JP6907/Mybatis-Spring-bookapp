package com.jp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jp.po.Book;
import com.jp.po.BookCustom;
import com.jp.service.BookService;

/**
 * 处理图书请求控制器
 * */
@Controller
@RequestMapping(value="/book")
public class BookController {
	
	/**
	 * 自动注入BookService
	 * */
	@Autowired
	@Qualifier("bookService")
	private BookService bookService;

	/**
	 * 处理/main请求
	 * */
	@RequestMapping(value="/bookList")
	 public String bookList(Model model){
		// 获得所有图书集合
		List<BookCustom> bookList;
		try {
			bookList = bookService.getAllBooks();
			model.addAttribute("bookList", bookList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 
		return "bookList";
	}
	
}
