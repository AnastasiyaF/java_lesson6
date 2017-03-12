package com.epam.java_training.object;

public class Composition {
	private String title;
	private int yearPublished;
	private String author;
	
	public Composition(){
		
	}
	
	public Composition(String title, int yearPublished, String author) {
		this.title = title;
		this.yearPublished = yearPublished;
		this.author = author;
	}

	public String getTitle(){
		return title; 
	}
	
	public void setTitle(String title){
		this.title = title; 
	}
	
	public int getYearPublished(){
		return yearPublished; 
	}
	
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	public String getAuthor(){
		return author; 
	}
	
	public void setAuthor(String author){
		this.author = author; 
	}
	
	@Override
	public String toString() {
		return "title = " + title + ", yearPublished = " + yearPublished + ", author = " + author;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublished;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object object) {
		
		if( this == object){
			return true;
		}
		
		if (object == null){
			return false;
		}
		
		if (this.getClass() != object.getClass()){
			return false;
		}
		
		Composition object_compare = (Composition) object;
		
		if (null == title) {
			return (title == object_compare.title);
		} else {
			if (!title.equals(object_compare.title)) {
				return false;
			}
		}
		
		if (yearPublished != object_compare.yearPublished){
			return false;
		}
		
		if (null == author) {
			return (author == object_compare.author);
		} else {
			if (!author.equals(object_compare.author)) {
				return false;
			}
		}
		
		return true;
	}
}
