package com.dao;

import com.dao.daolayer.BookDao;
import com.dao.daolayer.BookDaoImpl;
import com.dao.model.Book;

/*  Data Access Object Pattern or DAO pattern is used to separate low level data accessing API
 *  or operations from high level business services. This class
 *  is responsible to get data from a data source which can be database / xml
 *  or any other storage mechanism.
 */

public class DataAccessObject {

	public static void main(String[] args) {

		BookDao bookDao = new BookDaoImpl();
		for (Book book : bookDao.getAllBooks()) {
			System.out.println(book);
		}
		Book book = bookDao.getAllBooks().get(0);
		book.setBookName("Java First");
		bookDao.saveBook(book);
		System.out.println(book.getBookId());

	}
}
