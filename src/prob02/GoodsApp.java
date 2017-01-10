package prob02;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Goods[] goods = new Goods[3];

		for (int i = 0; i < 3 ; i++) {
			String name = sc.next();
			int price = sc.nextInt();
			int sold = sc.nextInt();
			goods[i]=new Goods();
			goods[i].setName(name);
			goods[i].setPrice(price);
			goods[i].setSold(sold);
		}

		for (int i = 0; i < goods.length; i++) {
			goods[i].show();
		}

		sc.close();
	}

}
