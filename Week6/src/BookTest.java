import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		
		Book info = new Book("Mihai ", "Magical codes and where to find them? ", 20, 150);

		System.out.println("What is the name of the author? ");
		info.setAuthor(name.nextLine());

		System.out.println("What is the title ");
		info.setTitle(name.nextLine());

		System.out.println("What is the price ?");
		info.setPrice(name.nextDouble());

		System.out.println("How many pages ?");
		info.setPages(name.nextInt());

		System.out.println(info);
	}
}
