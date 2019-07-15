package javablock;

public class Block_final {
	static final int a;

	public Block_final() {//non static final variable initialize in constructor and init bloc
		System.out.println("constructor");
	}

	void go() {
		System.out.println("go");
	}

	public static void main(String[] args) {
		System.out.println("main");
		new Block_final().go();
	}

	static {// static block=>static final var can be initialize in static block//
		a = 10;//static block is always exc first rather than main method//
		System.out.println("static block");
	}

	// init//
	{
		System.out.println("initblock");
	}
}