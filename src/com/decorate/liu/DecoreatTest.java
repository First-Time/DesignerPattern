package com.decorate.liu;

public class DecoreatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person xc = new Person("小菜");
		System.out.println("第一种装扮：");
		Finery bigTrouser = new BigTrouser();
		Finery sneakers = new Sneakers();
		Finery tshirts = new TShirts();
		bigTrouser.decorate(xc);
		sneakers.decorate(bigTrouser);
		tshirts.decorate(sneakers);
		tshirts.show();

		System.out.println("第二种装扮：");
		Finery leatherShoes = new LeatherShoes();
		Finery tie = new Tie();
		Finery suit = new Suit();
		leatherShoes.decorate(xc);
		tie.decorate(leatherShoes);
		suit.decorate(tie);
		suit.show();
	}

}
