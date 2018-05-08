package com.decorate.liu;

public class DecoreatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person xc = new Person("С��");
		System.out.println("��һ��װ�磺");
		Finery bigTrouser = new BigTrouser();
		Finery sneakers = new Sneakers();
		Finery tshirts = new TShirts();
		bigTrouser.decorate(xc);
		sneakers.decorate(bigTrouser);
		tshirts.decorate(sneakers);
		tshirts.show();

		System.out.println("�ڶ���װ�磺");
		Finery leatherShoes = new LeatherShoes();
		Finery tie = new Tie();
		Finery suit = new Suit();
		leatherShoes.decorate(xc);
		tie.decorate(leatherShoes);
		suit.decorate(tie);
		suit.show();
	}

}
