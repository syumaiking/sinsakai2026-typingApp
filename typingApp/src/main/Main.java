package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("難易度を選択してください:");
			System.out.println("1.簡単");
			System.out.println("2.普通");
			System.out.println("3.難しい");
			System.out.print("--->");
			int difficulty = scan.nextInt();

			switch (difficulty) {
			case 1: {
				System.out.println("簡単です");
				break;
			}
			case 2: {
				System.out.println("普通です");
				break;
			}
			case 3: {
				System.out.println("難しいです");
				break;
			}
			default:
				System.out.println("1~3の数字を入力してください:");
				continue;

			}
			break;
		}
		scan.close();
	}
}
