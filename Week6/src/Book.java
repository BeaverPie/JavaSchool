
public class Book {

	Book(String au, String ti, double pr, int pg) 
	{
		Author = au;
		Title = ti;
		Price = pr * 0.80;
		Pages = pg;
	}

	private String Author;
	private String Title;
	private double Price;
	private int Pages;

	@Override
	public String toString() {
		return "Author \n" + Author + "\nTitle \n" + Title + "\nPrice \n" + Price + "\nPages\n" + Pages;
	}

	public String setAuthor() {
		return Author;
	}

	public String setTitle() {
		return Title;

	}

	public double setPrice() {
		return Price;
	}

	public int setPages() {
		return Pages;
	
	
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getPages() {
		return Pages;
	}

	public void setPages(int pages) {
		Pages = pages;
	}

}
