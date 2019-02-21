/*
(Financial application: compute future tuition) Suppose that the tuition for a university
is $10,000 this year and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years*/
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	int tuition = 10000;
	
	for (int i=0; i<=10; i++){
	     tuition += (tuition * 0.05); 
	}
	System.out.println("After 10 years tuition is " + tuition);
	}
}