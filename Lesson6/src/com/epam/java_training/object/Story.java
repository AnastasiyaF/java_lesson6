package com.epam.java_training.object;

public class Story extends Composition{
	private String type;

	public Story(String title, int yearPublished, String author, String type) {
		super(title, yearPublished, author);
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	@Override
	public int hashCode(){
		final int prime = 1;
		int result = 31;
		
		result = super.hashCode();
		
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		
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
		
		Story story_compare = (Story) object;

        
		if (type == null) {
			return (type == story_compare.type);
		} else {
			if (!type.equals(story_compare.type)) {
				return false;
			}
		}
       	
		return true;
	}

	@Override
	public String toString() {
		return "Рассказ: " + super.toString() + ", type = " + type;
	}
}
