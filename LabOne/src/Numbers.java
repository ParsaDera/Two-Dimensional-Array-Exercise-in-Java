public class Numbers{


	private int[]numbers;
	private int[][] tables;


	Numbers(){
	}
	Numbers(int size){
		numbers = new int[size];
	}
	Numbers(int row, int col) {
		tables = new int[row][col];
	}


	public void generateNumbers() {
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = i;
	}

	public void printNumbers() {
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println("");
	}


	public void printIndices() {
		for (int i=0; i < tables.length; i++)
		{
			for ( int j = 0; j < tables[i].length; j++)
				System.out.printf("%8s" ,( i+ "," + j));
			System.out.println("");
			System.out.println("");
			System.out.println("");
		}
	}


	public void generateSquares(){

		for (int i=0; i < tables.length - 1; i++)
		{
			int x = (((i + 1) * 10) * ((i + 1) * 10)) ;
			for ( int j = 0; j < i +1; j++);


		}

	}
	public void printSquares() {
		for (int i=0; i < tables.length; i++)
		{
			for ( int j = 0; j < i; j++)
				System.out.printf("%9s",tables[i][j] = (((i + 1) * 10) + j) * (((i + 1) * 10) + j));
		}
	}


	public void printTable() {
		for (int i=0; i < tables.length; i++)
		{
			for ( int j = 0; j < tables[i].length; j++)
				System.out.printf("%4d", (i*10 + j));
			System.out.println();
		}
	}


	public void printStarPattern1() {
		{
			for (int i=0; i < tables.length; i++)
			{
				for ( int j = 0; j < i; j++)
					System.out.printf("%4s", "*");
				System.out.println();
			}
		}
	}

	public void printStarPattern2() {
		{
			for (int j = 0; j < tables.length; j++)
			{
				for (int i=j; i < tables.length; i++)
					System.out.printf("%4s", "*");
				System.out.println();
			}
		}
	}
}

