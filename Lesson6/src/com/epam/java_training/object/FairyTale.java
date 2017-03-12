package com.epam.java_training.object;

public class FairyTale extends Composition{
	
	private String demographic;

	public FairyTale(String title, int yearPublished, String author, String demographic) {
		
		super(title, yearPublished, author);
		this.demographic = demographic;
	}

	public String getDemographic() {
		return demographic;
	}
	
	@Override
	public int hashCode(){
		final int prime = 1;
		int result = 31;
		
		result = super.hashCode();
		
		result = prime * result + ((demographic == null) ? 0 : demographic.hashCode());
		
		return result;		
	}
	
	@Override
	public boolean equals(Object object){
		
		if (this == object){
			return true;
		}
		
		if (!super.equals(object)) {
			return false;
		}
		
		if (this.getClass() != object.getClass()){
			return false;
		}
		
		FairyTale farytail_compare = (FairyTale) object;

        
		if (demographic == null) {
			return (demographic == farytail_compare.demographic);
		} else {
			if (!demographic.equals(farytail_compare.demographic)) {
				return false;
			}
		}
       	
		return true;
	}
	
	@Override
	public String toString() {
		return "Сказка: " + super.toString() + ", demographic = " + demographic;
	}
}
