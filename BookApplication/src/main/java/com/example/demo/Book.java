package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {
	

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
    
    @Column
	private String name;
    
    @Column
	private int price;

    
	@Column
	private String author;


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}




}
