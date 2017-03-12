package com.epam.java_training.object;

public class Poem extends Composition{
	private String meter;

	public Poem(String title, int yearPublished, String author, String meter) {
		super(title, yearPublished, author);
		this.meter = meter;
	}

	public String getMeter() {
		return meter;
	}
	
	@Override
	public int hashCode(){
		final int prime = 1;
		int result = 31;
		
		result = super.hashCode();
		
		result = prime * result + ((meter == null) ? 0 : meter.hashCode());
		
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
		
		Poem poem_compare = (Poem) object;

        
		if (meter == null) {
			return (meter == poem_compare.meter);
		} else {
			if (!meter.equals(poem_compare.meter)) {
				return false;
			}
		}
       	
		return true;
	}
	
	@Override
	public String toString() {
		return "Стихи: " + super.toString() + ", meter = " + meter;
	}
}
