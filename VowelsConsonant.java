package com.masai;

public class VowelsConsonant {
	
	String word="a";
	
	public static void main(String[] args) {
		int count=0;
		String vowela="aeiou";
		String vowelA="AEIOU";
		String consonentsa="bcdfghjklmnpqrstvwxyz";
		String consonentsA="BCDFGHJKLMNPQRSTVWXYZ";
		
		VowelsConsonant w=new VowelsConsonant();
		for(int i=0;i<vowelA.length();i++)
		{
			if(w.word.charAt(0)==vowela.charAt(i)||w.word.charAt(0)==vowelA.charAt(i))
				{System.out.println("vowels");
			break;}
			else
			{
				for(int j=0;j<consonentsa.length();j++)
				{
					if(w.word.charAt(0)==consonentsa.charAt(j)||w.word.charAt(0)==consonentsA.charAt(j))
						{count++;break;}		
				}
				if(count>0) 
				{System.out.println("consonents");	break;}
				else
					{System.out.println("error");break;}
				
			}
				
		}
		
		
		
	}

}
