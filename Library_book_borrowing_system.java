import java.util.*;

class BookLimitExceededException extends Exception{
	BookLimitExceededException(String a){
		super(a);
	}
}

public class Library_book_borrowing_system{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num_books;
		
		try{
			System.out.print("Enter the number of books : ");
			num_books=sc.nextInt();
			
			if (num_books>5){
				throw new BookLimitExceededException("\nYOU CAN ONLY BORROW MAX 5 BOOKS");
			}
			else{
				System.out.println("Books issued successfully");
			}
		}
		
		catch(BookLimitExceededException e){
			System.out.println(e.getMessage());
		}
	}
}
