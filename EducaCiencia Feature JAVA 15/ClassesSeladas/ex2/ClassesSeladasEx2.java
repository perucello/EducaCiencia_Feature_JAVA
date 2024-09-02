package ex2;

abstract sealed class Carnivoro permits Leao, Gato {
	
	public void euSou() {
		System.out.print(" eu sou carnívoro.\n");
	}
}

abstract sealed class Herbivoro permits Vaca, Coelho {
	
	public void euSou() {
		System.out.print(" eu sou herbívoro.\n");
	}
}

non-sealed class Leao extends Carnivoro {
	
	public void euSou() {
		System.out.print("eu sou um leão,");
		super.euSou();
	}
}

final class Gato extends Carnivoro {
	
	public void euSou() {
		System.out.print("eu sou um gato,");
		super.euSou();
	}
}

sealed class Vaca extends Herbivoro permits X {

	public void euSou() {
		System.out.print("eu sou uma vaca,");
		super.euSou();
	}
}

final class X extends Vaca{
	
}

final class Coelho extends Herbivoro {
	
	public void euSou() {
		System.out.print("eu sou um coelho,");
		super.euSou();
	}
}

public class ClassesSeladasEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leao l = new Leao();
		l.euSou();
		
		Coelho c = new Coelho();
		c.euSou();
	}
}
