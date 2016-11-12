public class zavd4a {
	public static void main(String[] args) {		
		int [][] a = new int[][] {
			{ 10, 5, 3, 20, 1 },
			{ 2, 15, 26, 5, 23 },
			{ 7, 9, 11, 2, 6 },
			{ 5, 23, 32, 5,  2 },
			{ 1, 5, 31, 2, 11 }
		};

		for (int i = 0; i < 5; i++) {			
			System.out.println("");
				for (int j = 0; j < 5; j++) {
					System.out.print(a[i][j]+" ");				
				}
			}
		System.out.println("");
		
		int min = a[0][1];
		for (int i = 0; i < 5; i++) {			
			for (int j = 0; j < 5; j++) {
				if (j > i) {
					if (a[i][j] < min) {
						min = a[i][j];
					}				
				}
			}
		}
		System.out.println("");
		System.out.println("Мінімальний елемент серед тих, що розташовані вище головної діагоналі складає --> "+min);
		
	}
}

/*
String [][] a = new String[][] {
	{"00", "01", "02", "03", "04"},
	{"10", "11", "12", "13", "14"},
	{"20", "21", "22", "23", "24"},
	{"30", "31", "32", "33", "34"},
	{"40", "41", "42", "43", "44", }
};
*/
