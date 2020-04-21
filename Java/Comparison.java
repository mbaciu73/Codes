package com.Assignment;

import java.util.Scanner;

public class Comparison {
	//variables of the class
	static int i=0,similarWords=0,percent=0,wordCount = 0;		
	static Scanner s1,s2;
	private String token1,token2;
	static String[] theStopWords = stopWords.getNewWords();
	//constructor for the word count
	public String count(Files f1,Files f2) {
		//if one file has less words than the other it will stop
		while(f1.read(s1) != null || f2.read(s2)!=null) {
				
			token1 = f1.read(s1);
			token2 = f2.read(s2);
			//compares each word from the first file to every other word from the 2nd file
			while(token2!=null) {
				if(token1 == token2) {
					//stopWords introduced to not count the word if it is a stop word
					for(i=0;i<theStopWords.length;i++) {
						if(token1 == theStopWords[i]) {
							continue;
						}
						else {
							similarWords+=1;
							percent+=1;
							
						}
					}
				}
				//keeps continuing until the while is finished
				else {
					continue;
				}
				wordCount+=1;
			}
		}
		//divides the number of words by the amount of words that are similar and creates the percentage of the similarity
		percent = (percent/wordCount)/100;
		return "The amount of words that are relatable is "+similarWords+" and that there is a "+percent+"%that the files are about the same topic";
	}

}
