public class NumbersTest {

	public static void main(String[] args) {


		Numbers n1   = new Numbers (10);
		n1.generateNumbers();
		System.out.println("\nPrinting Numbers");
		n1.printNumbers();

		System.out.println("\n\nPrinting table");
		Numbers table = new Numbers(10,10);
		Numbers positions = new Numbers(10,10);
		Numbers squares = new Numbers(10,10);
		squares.printSquares();
		positions.printIndices();
		squares.generateSquares();
		table.printTable();
		Numbers star = new Numbers(10,5);
		star.printStarPattern1();
		star.printStarPattern2();

	}


}