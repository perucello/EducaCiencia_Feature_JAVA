package ex1;

import ex1.Carnivoro;
import ex1.Coelho;
import ex1.Herbivoro;
import ex1.Leao;

abstract class Carnivoro {
	
	public void euSou() {
		System.out.print(" eu sou carnívoro.\n");
	}
}

abstract class Herbivoro {
	
	public void euSou() {
		System.out.print(" eu sou herbívoro.\n");
	}
}

class Leao extends Carnivoro {
	
	public void euSou() {
		System.out.print("eu sou um leão,");
		super.euSou();
	}
}

class Gato extends Carnivoro {
	
	public void euSou() {
		System.out.print("eu sou um gato,");
		super.euSou();
	}
}

class Vaca extends Herbivoro {

	public void euSou() {
		System.out.print("eu sou uma vaca,");
		super.euSou();
	}
}

class Coelho extends Herbivoro {
	
	public void euSou() {
		System.out.print("eu sou um coelho,");
		super.euSou();
	}
}


public class ClassesSeladasEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leao l = new Leao();
		l.euSou();
		
		Coelho c = new Coelho();
		c.euSou();
	}

}
