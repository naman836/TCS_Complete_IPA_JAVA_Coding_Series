
// Create class Document with below attributes
// id - int, title - String, folderName - String, pages - int
// Write getters, setters and parametrized constructor as required.

// Create class with main method and implement static method - docsWithOddPages.
// This method will take array of Document objects and return another array with Document objects which has
// odd number of pages. This method should be called from the main method and display values of returned objects
// as shared in the sample in ascending order of id attribute.

// Before calling this method, use Scanner object to read values for four Document objects referring attributes
// in the above sequence. Next Call the method and display the result.

// Input:
// 1
// resume
// personal
// 50
// 2
// question1
// exams
// 55
// 3
// question2
// exams
// 45
// 4
// India
// misc
// 40

// Output(each line has values separated by single space):
// 2 question1 exams 55
// 3 question2 exams 45


package TCS_IPA;
import java.util.*;

public class FindDocsWithOddPageHandsOn6 {
    public static void main(String[] args) throws Exception {
        Document[] document=new Document[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<document.length;i++)
        {
            document[i]=new Document(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
        }
        Document[] output=docsWithOddPages(document);
        for(Document i:output)
        {
            System.out.println(i.getId()+" "+i.getTitle()+" "+i.getFolderName()+" "+i.getPages());
        }
    }
    public static Document[] docsWithOddPages(Document[] d)
    {   Document[] d2=new Document[0];
        for(Document i:d)
        {
            if(i.getPages()%2!=0)
            {
                d2=Arrays.copyOf(d2, d2.length+1);
                d2[d2.length-1]=i;
            }
        }
        for(int i=0;i<d2.length;i++)
        {
            for(int j=i+1;j<d2.length;j++)
            {
                if(d2[i].getId()>d2[j].getId())
                {
                    Document temp=d2[i];
                    d2[i]=d2[j];
                    d2[j]=temp;
                }
            }
        }
        return d2;
    }
}

class Document
{
    private int id;
    private String title;
    private String folderName;
    private int pages;
    Document(int id,String title,String folderName,int pages)
    {
        this.id=id;
        this.title=title;
        this.folderName=folderName;
        this.pages=pages;
    }
    public int getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public String getFolderName()
    {
        return folderName;
    }
    public int getPages()
    {
        return pages;
    }
}