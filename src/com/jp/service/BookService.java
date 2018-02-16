package com.jp.service;

import java.util.List;

import com.jp.po.Book;
import com.jp.po.BookCustom;


/**
 * @ClassName:  BookService   
 * @Description:TODO(Book服务层接口)   
 * @author      ZJP
 * @date:2018年1月31日 下午3:01:24
 */
public interface BookService {
	
	/**
	 * 查找所有图书
	 * @return Book对象集合
	 * */
	public List<BookCustom> getAllBooks() throws Exception;

}
