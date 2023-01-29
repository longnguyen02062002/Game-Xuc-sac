package GameXucsac;

import java.util.Scanner;
import Person.person;

public class playing extends GamePlay {
	public static void main (String args[]) {
		int numPlay;
		String emp = new String();
		char emp1;
		Scanner myObj = new Scanner(System.in);
		System.out.print("Nhap so luong nguoi choi (tu 1 den " + num + "): ");
		numPlay = myObj.nextInt();
		emp = myObj.nextLine();
		
		for (int list=1; list<=num; list++) {
			if (list<=numPlay) {
				String name = new String();
				System.out.print("Nhap ten nguoi choi thu " + list + ": ");
				name = myObj.nextLine();
				player[list] = new person(name, 0);
				player[list].name = name;
				player[list].character = true;
			}
			else {
				player[list] = new person("BOT", 0);
				player[list].name += list;
				player[list].character = false;
			}
		}
		
		System.out.println("Co " + (num-numPlay) + " nguoi choi ao\n");

		for (int list=1; list<=num; list++) player[list].point = 0;
		taoXucsac();
		/*for (int list=1; list<=4; list++) {
			for (int element=0; element<=24; element++) {
				System.out.print(xucsac[list][element]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}*/
		while (1!=0) {
			for (int list=1; list<=num; list++) {
				if (player[list].character==true) {
					System.out.print("Luot cua " + player[list].name + " (bam 1 de tiep tuc): ");
					emp1 = (char) myObj.nextInt();
				}
				System.out.print("Ket qua xuc sac cua " + player[list].name + ": ");
				tungXucsac(list);
				System.out.print(ketqua[list]);
				tinhDiem(list);
				System.out.println("------Diem: " + player[list].point);
			}
			System.out.print("\n");
		}
	}
}
