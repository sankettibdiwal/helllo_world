package demo;

import java.util.Scanner;

public class TowerOfHanoi {
	 
public void TOH(int n, String start, String aux, String end) {
 
           if (n == 1) {
               System.out.println(start + " -> " + end);
           } else {
               TOH(n - 1, start, end, aux);
               System.out.println(start + " -> " + end);
               TOH(n - 1, aux, start, end);
           }
}
 
public static void main(String[] args) {
 
	   TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
 
           System.out.print("Enter number of discs: ");
           Scanner scanner = new Scanner(System.in);
           int discs = scanner.nextInt();
           Hanoi(discs,"A","B","C");
}

public static void Hanoi(int n,String start,String Middle,String End)
{
	if (n==1)
		System.out.println(start+" --> "+End);
	else if(n>1)
	{
		Hanoi(n-1,start,End,Middle);
		System.out.println(start+" --> "+End);
		Hanoi(n-1,Middle,start,End);
	}
		
}
 
}

