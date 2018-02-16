package com.jp.mapper;

import java.util.List;

import com.jp.po.BookCustom;
import com.jp.po.BookQueryVo;

public interface BookMapperCustom {
    	
	public List<BookCustom> findBookList(BookQueryVo bookQueryVo) throws Exception;
}