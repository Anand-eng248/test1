package com.capg.wage;

public class Ladder {
	public static void main(String[] args) {
		int i=0;
		int count1=0;
		int count2=0;
		int players=(int) Math.floor(Math.random()*10)%3;
		if(players==1) {
		while(i!=100) {
			count1++;
		int dice=(int) Math.floor(Math.random()*10)%7;
		int option=(int) Math.floor(Math.random()*10)%3;
		while(option==0) //dice=no play
		{
			i=i;
		}
		while(option==1) //dice=ladder 
		{
			i=i+dice;
		}
		while(option==2) //dice=snake
		{
			i=i-dice;
		}
		if(i<0) {
			i=0;
		}
		System.out.println("Position after "+count1+" dice rolls = "+i);
	}
		}
		if(players==2) {
			while(i!=100) {
				count2++;
			int dice=(int) Math.floor(Math.random()*10)%7;
			int option=(int) Math.floor(Math.random()*10)%3;
			while(option==0) //dice=noplay
			{
				i=i;
			}
			while(option==1) //dice=ladder 
			{
				i=i+dice;
				dice=(int) Math.floor(Math.random()*10)%7;
				i=i+dice;
			}
			while(option==2) //dice=snake 
			{
				i=i-dice;
			}
			if(i<0) {
				i=0;
			}
			System.out.println("Position after "+count2+" dice rolls = "+i);
		}
			}
		}
}
