class MultiplosDeTresAteCem {
	public static void main(String[] args) {
		int a = 2, b = 5, c = 10, d = 3;

		if ( ! ( (a+c*b) <= (d*b/a) && (b+c/d <  c/a*d-b*a) ) ){

			System.out.print("A");

		}

		if (     (a+c*b) <= (d*b/a) || (b+c/d != c/a*d-b*a) ){

			System.out.print("B");

		}

		if (     (a+c*b) <= (d*b/a) && (b+c/d) <(c/a*(d-b)*a) ){

			System.out.print("C");

		}
	}
}