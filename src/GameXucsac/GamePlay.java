package GameXucsac;

import Person.person;

public class GamePlay {
	static person[] player = new person[10];
	static int[][] xucsac = new int[10][30];
	static int[] ketqua = new int[10];
	static final int maxPoint = 21;
	static final int num = 4;
	public static void taoXucsac() {
		int dot=0;
		for (int list=1; list<=4; list++) {			// list la thu tu con xuc sac, dot la so cham, element la phan tu trong mang the hien kha nang xay ra khi tung xuc sac
			for (int element=0; element<=23; element++) {
				if (element%4==0)
					dot++;
				xucsac[list][element] = dot;
			}
			xucsac[list][24] = list;
			dot=0;
		}
	}
	
	public static void tungXucsac(int list) {
		int randomXucsac = (int)(Math.random()*4)+1;
		int randomKetqua = (int)(Math.random()*25);
		ketqua[list] = (int) xucsac[randomXucsac][randomKetqua];
	}
	
	public static void tinhDiem(int list) {
		if (player[list].point + ketqua[list] < maxPoint)
			player[list].point += ketqua[list];
		else if (player[list].point + ketqua[list] == maxPoint) {
			for (int list1=1; list1<=num; list1++) {
				player[list1].status = "Sad";
			}
			System.out.println("\n\nNguoi thang cuoc: " + player[list].name + "\n");
			player[list].status = "Happy";
			
			for (int list1=1; list1<=num; list1++) {
				if (player[list1].character == false)
					System.out.println (player[list1].name + ": " + player[list1].status);
			}
			
			System.exit(0);
		}
		else player[list].point = 0;
	}
}
