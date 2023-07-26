package oops1;

public class UseLibrary {
	public static void main (String[]args) {
		Book b1=new Book();
		b1.name="Story";
		b1.noOfPages=100;
		
		Book b2=new Book();
		b2.name="fiction";
		b2.noOfPages=200;
		
		
		Library l1=new Library();
		l1.location="tambaram";
		l1.division="east";
		l1.noOfBooks=2000;
		l1.book=b1;
		
		Library l2=new Library();
		l2.location="chrompet";
		l2.division="west";
		l2.noOfBooks=3000;
		l2.book=b2;
		
		System.out.println(l1.location+"\n"+l1.division+"\n"+l1.noOfBooks);
		System.out.println(l1.book.name+"\n"+l1.book.noOfPages);
		System.out.println(l2.location+"\n"+l2.division+"\n"+l2.noOfBooks);
		System.out.println(l2.book.name+"\n"+l2.book.noOfPages);

	}

}
