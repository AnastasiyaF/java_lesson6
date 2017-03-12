package com.epam.java_training.main;

import com.epam.java_training.object.Composition;

public class Collection {
	
	private int count_compositions;
	private Composition[] collection_list;
	private String type_collection;
	
	public Collection(String type_collection) {
		this.type_collection = type_collection;
		this.count_compositions = 0;
	}
	
	public String getType_collection() {
		return type_collection;
	}

	public int getCount() {
		return count_compositions;
	}
	
	public Composition[] getCollection_list(){
		return this.collection_list;
	}
	
	public void addRecord(Composition composition){
		
		if (this.checkExistCompposition(composition) == true){
			
			System.out.println("The composition already exists with such fields and cannot be added.");
			System.out.println(composition);
			return;
			
		}
		
		Composition[] new_composition = new Composition[this.count_compositions + 1];
		
		if (this.count_compositions == 0){
			new_composition[0] = composition;
		}
		else{
			for (int i = 0; i < this.count_compositions; i++){
				new_composition[i] = this.collection_list[i];
			}	
			new_composition[this.count_compositions] = composition;
		}
		
		this.count_compositions = this.count_compositions + 1;
		this.collection_list = new_composition;
	}
	
	public void deleteRecord(int position){
		int i_new = 0;
		
		if (position < 1){
			System.out.println("The position should be more then 1.");
		}
		else if (this.count_compositions == 0){
			
			System.out.println("The collection is empty.");
			return;
		}
		else if (this.count_compositions < position){
			System.out.println("There are not compositions with such position " + position + "in the collection.");
			return;
		}
		
		if (this.count_compositions == 1){
			
			System.out.println(this.collection_list[0]);
			
			this.count_compositions = 0;
			this.collection_list = null;
			
			System.out.println("The composition is deleted. Currently no compositions.");
			
			return;
		}
		
		Composition[] new_composition = new Composition[this.count_compositions - 1];
		
		for (int i = 0; i < this.count_compositions; i++){
			
			if (i == position - 1){
				System.out.println(this.collection_list[i]);
			}
			else{
				new_composition[i_new] = this.collection_list[i];
				i_new++;
			}
			
		}	
		
		this.count_compositions = this.count_compositions - 1;
		this.collection_list = new_composition;
	}

	
	public boolean checkExistCompposition(Composition current_composition){
		
		for (int i = 0; i < this.count_compositions; i++){
			if (this.collection_list[i].equals(current_composition)){
				return true;
			}
		}
		return false;
	}
	
	public void printAllComposition(){
		
		
		if (count_compositions == 0){
			System.out.println("The collection is empty.");
		}
		else{
			System.out.println(this.type_collection + " имеет следующие произведения:");
		}
		
		for (int i = 0; i < this.count_compositions; i++){
			System.out.println(this.collection_list[i]);
		}
		
	}
}
