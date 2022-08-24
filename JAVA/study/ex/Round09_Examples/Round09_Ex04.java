package Round09_Examples;

class Round09_Ex04 {
	int a, b, c, d, e, f, g;

	Round09_Ex04() {
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		e = 5;
		f = 6;
		g = 7;
	}

	Round09_Ex04(int x) {
		this();
		d = x;
	}

	Round09_Ex04(int x, int y) {
		this(x);
		e = y;
	}
	public static void main(String[] ar) 
	{
		Round09_Ex04 kor = new Round09_Ex04();
		Round09_Ex04 kor1 = new Round09_Ex04(5500);
		Round09_Ex04 kor2 = new Round09_Ex04(788,923);
		System.out.println("a:"+kor.a+"/"+"b:"+kor.b+"/"+"c:"+kor.c+"/"+"d:"+kor.d+"/"+"e:"+kor.e);
		System.out.println("a:"+kor1.a+"/"+"b:"+kor1.b+"/"+"c:"+kor1.c+"/"+"d:"+kor1.d+"/"+"e:"+kor1.e);
		System.out.println("a:"+kor2.a+"/"+"b:"+kor2.b+"/"+"c:"+kor2.c+"/"+"d:"+kor2.d+"/"+"e:"+kor2.e);
	}
}
