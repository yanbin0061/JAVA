package day23;

import java.util.Scanner;

public class Traslasion {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] tras= new int[50];
		int i=0;
		while(num>0){
			tras[i] = num%2;
			num/=2;
			i++;
		}
		for (int j = i-1; j>=0; j--) {
			System.out.print(tras[j]+" ");
		}
		scanner.close();
	}
}
