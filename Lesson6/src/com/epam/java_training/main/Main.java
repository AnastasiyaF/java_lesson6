/*
 * Задача 6.
 * Date: 12.03.2017
   Author: Anastasiya Findziukevich
   
 * Сборник литературных произведений. Реализовать приложение, позволяющее создавать сборники произведений 
 * (объект, представляющий собой сборник). Составляющими сборника являются литературные произведения(стихи, проза и т.д.) 
 * и форма сборника(журнал, книга и т.д.). Реализуйте возможность определения, есть ли конкретное произведение в сборнике.
 * 
 * 
 */

package com.epam.java_training.main;

import com.epam.java_training.object.Composition;
import com.epam.java_training.object.FairyTale;
import com.epam.java_training.object.Poem;
import com.epam.java_training.object.Story;

public class Main {
	
	
	public static void main(String[] args){
		
		Collection collection_1 = new Collection("журнал");
		
	    Collection collection_2 = new Collection("книга");

	    Composition composition_compare;
	    
	    Composition composition = new Story("Рассказ_1", 1976, "Автор_1", "тип_1");
	    collection_1.addRecord(composition);
	    
	    composition = new Story("Рассказ_2", 1983, "Автор_2", "тип_1");
	    collection_1.addRecord(composition);
		
	    composition = new FairyTale("Сказка_3", 1926, "Автор_3", "неизвестная народность");
	    collection_1.addRecord(composition);
	    
	    composition = new FairyTale("Сказка_4", 1965, "Автор_4", "народная русская сказка");
	    collection_1.addRecord(composition);
	    
	    
	    composition = new Story("Рассказ_3", 1965, "Автор_6", "тип_2");
	    collection_2.addRecord(composition);
		
	    composition = new Poem("Стихи_3", 1926, "Автор_8", "античное стихосложение");
	    collection_2.addRecord(composition);
	    
	    composition = new Poem("Стихи_7", 1926, "Автор_7", "новейшее стихосложение");
	    collection_2.addRecord(composition);
	    
	    composition = new FairyTale("Сказка_6", 1934, "Автор_7", "русская сказка");
	    collection_2.addRecord(composition);
	    
	    
	    System.out.println();
		System.out.println("Сборник №1:");
		collection_1.printAllComposition();
		
		System.out.println();
		System.out.println("Сборник №2:");
		collection_2.printAllComposition();
		
		
		System.out.println();
		System.out.println("Удалить композицию с 1 позицией из сборника №1");
		collection_1.deleteRecord(1);
		
		System.out.println("Удалить композицию со 2 позицией из сборника №2");
		collection_2.deleteRecord(2);
			
		
		System.out.println();
		System.out.println("Сборник №1:");
		collection_1.printAllComposition();
		
		System.out.println();
		System.out.println("Сборник №2:");
		collection_2.printAllComposition();

		
		System.out.println();
		System.out.println("Создадим тестовое произведения для проверки на существование: ");
		
		composition_compare = new FairyTale("Сказка_6", 1934, "Автор_7", "русская сказка");
		System.out.println(composition_compare);
		
		System.out.print("Проверим есть ли объект в 1 сборнике: ");
		if (collection_1.checkExistCompposition(composition_compare) == true){
		    	System.out.println("Произведение существует в сборнике.");
		    }
		    else{
		    	System.out.println("Не найдено по заданным критериям.");
		 };
		
	    System.out.print("Проверим есть ли объект во 2 сборнике: ");
	    if (collection_2.checkExistCompposition(composition_compare) == true){
	    	System.out.println("Произведение существует в сборнике.");
	    }
	    else{
	    	System.out.println("Не найдено по заданным критериям.");
	    };
	    
	    
	    System.out.println();
		System.out.println("Создадим 2 тестовое произведения для проверки на существование: ");
		
		composition_compare = new Story("Рассказ_2", 1983, "Автор_2", "тип_1");
		System.out.println(composition_compare);
		
		System.out.print("Проверим есть ли объект в 1 сборнике: ");
	    if (collection_1.checkExistCompposition(composition_compare) == true){
	    	System.out.println("Произведение существует в сборнике.");
	    }
	    else{
	    	System.out.println("Не найдено по заданным критериям.");
	    };
		
	    System.out.print("Проверим есть ли объект во 2 сборнике: ");
	    if (collection_2.checkExistCompposition(composition_compare) == true){
	    	System.out.println("Произведение существует в сборнике.");
	    }
	    else{
	    	System.out.println("Не найдено по заданным критериям.");
	    };
	    
	    
	    System.out.println();
		System.out.println("Создадим 3 тестовое произведения для проверки на существование: ");
		
		composition_compare =  new Poem("Стихи_3", 1926, "Автор_8", "античное стихосложение_1");
		System.out.println(composition_compare);
		
		System.out.print("Проверим есть ли объект в 1 сборнике: ");
		if (collection_1.checkExistCompposition(composition_compare) == true){
	    	System.out.println("Произведение существует в сборнике.");
	    }
	    else{
	    	System.out.println("Не найдено по заданным критериям.");
	    };
		
	    System.out.print("Проверим есть ли объект во 2 сборнике: ");
	    if (collection_2.checkExistCompposition(composition_compare) == true){
	    	System.out.println("Произведение существует в сборнике.");
	    }
	    else{
	    	System.out.println("Не найдено по заданным критериям.");
	    }; 
	    
	}
	
	

}
