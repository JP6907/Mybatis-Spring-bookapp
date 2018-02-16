package com.jp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.mapper.BookMapper;
import com.jp.mapper.BookMapperCustom;
import com.jp.po.BookCustom;
import com.jp.service.BookService;

/**
 * Book服务层接口实现类
 * @Service("bookService")用于将当前类注释为一个Spring的bean，名为bookService
 * */
@Service("bookService")
public class BookServiceImpl implements BookService {
	
	/**
	 * 自动注入BookMapper
	 * */
	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private BookMapperCustom bookMapperCustom;

	@Override
	public List<BookCustom> getAllBooks() throws Exception {
		
		return bookMapperCustom.findBookList(null);
	}

}
