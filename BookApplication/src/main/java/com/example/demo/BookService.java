package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
	
	     @Autowired
	     BookRepository b1;

		public BookService(BookRepository b1) {
			super();
			this.b1 = b1;
		}

		public void addBook(Book book) {
			    
			  b1.save(book);
			
		}

		public List<Book> getbook() {
			
			List<Book> list =  new ArrayList<>();
			    
//			for(Book book : b1.findAll())
//			{
//				  list.add(book);
//			}
			  
			b1.findAll().forEach(book->list.add(book));
			
			return list;
		}

		public Book getbookid(int id) {
			// TODO Auto-generated method stub
			return b1.findById(id).get();
		}
		  public void deleteBook(int id)
		  {
		        b1.deleteById(id);
		    }

		public void updateBook(Book book) {
			
			  b1.save(book);
			
		}

		 

}
