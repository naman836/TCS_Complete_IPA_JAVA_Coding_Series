
// Create class Book with below attributes:
// id - int , title - String, author - String, price - double
// Write getters, setters and parametrized constructor.

// Create class with main method and implement static method - sortBookByPrice
// This method will take a parameter as array of Book objects.
// It will return array of books which is sorted in ascending order of book price. Assume that no two books
// will have same price. This method should be called from the main method and display values of returned objects
// as shared in the sample.

// Before calling this method, use Scanner object to read values for four Book objects referring attributes in
// the above sequence. Next call the method and display the result.

// Input:
// 1
// hello
// writer1
// 50
// 2
// cup
// writer2
// 55
// 3
// Planet
// writer3
// 45
// 4
// India
// writer4
// 40

// Output(each line has value separated by single space):
// 4 India writer4 40.0
// 3 Planet writer3 45.0
// 1 hello writer1 50.0
// 2 cup writer2 55.0


package TCS_IPA;
import java.util.*;
public class SortBooksByPriceHandsOn7
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        Book[] book=new Book[4];
        for(int i=0;i<book.length;i++)
        {
            book[i]=new Book(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        }
        Book[] output=sortBooksByPrice(book);
        for(Book i: output)
        {
            System.out.println(i.getId()+" "+i.getTitle()+" "+i.getAuthor()+" "+i.getPrice());
        }

    }
    public static Book[] sortBooksByPrice(Book[] book)
    {
        // sorting in ascending order of book price and returning the array of Books
        for(int i=0;i<book.length;i++)
        {
            for(int j=i+1;j<book.length;j++)
            {
                if(book[i].getPrice() > book[j].getPrice()) // Change ">" to "<" only to sort it in descending
                {
                    Book temp=book[i];
                    book[i]=book[j];
                    book[j]=temp;
                }
            }
        }
        return book;
    }
}
class Book
{
    private int id;
    private String title;
    private String author;
    private double price;
    Book(int id,String title,String author,double price)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;

    }
    public int getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }

}
