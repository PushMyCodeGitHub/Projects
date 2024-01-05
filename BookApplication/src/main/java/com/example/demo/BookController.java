package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/book", method = RequestMethod.GET)
public class BookController {
//	@GetMapping
	      @Autowired     
          BookService b1;
	
    @PostMapping("/booksave") 
    void save(@RequestBody Book book) {
    	  
  	 b1.addBook(book);
  	
  }
  
    
    @GetMapping("/books")
    List<Book> getdata()
    {
             return b1.getbook();	 
    }
    
    @GetMapping("/books/{id}")
    Book getdatabyid(@PathVariable("id") int id)
    {
             return b1.getbookid(id);
    }
    
    
    
	   @DeleteMapping("/book/{id}")
	   public void deleteBook(@PathVariable("id") int id) {
	      b1.deleteBook(id);
	   }

	   @PutMapping("/bookupdate")
	   public void updateBook(@RequestBody Book book)
	   {
	      b1.updateBook(book);
	   }
	  
    
    
	
//	@PutMapping
//	@DeleteMapping

}
