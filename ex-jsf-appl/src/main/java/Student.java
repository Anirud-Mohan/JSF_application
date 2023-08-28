import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "stu")
@SessionScoped
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;


    private Book book = new Book();
    private boolean disable=true;
    private boolean enable=false;
    private ArrayList<Book> bookList = new ArrayList<Book>();


    public Student() {
        book = new Book();

    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
   public void addAction() {
	   System.out.println("Going to Add Data");
	   bookList.add(book);
       book = new Book();
       System.out.println("The Data is Added Succesfully");

    }

    public String deleteAction(Book book) {
        System.out.println("Going to Delete Data");
        bookList.remove(book);
        System.out.println("The Data is Deleted Succesfully");
        return null;
    }

    public void editAction(Book book1) {
      setDisable(false);
      setEnable(true);
      book = new Book();
      book.setId(book1.getId());
      book.setName(book1.getName());
      book.setphoneno(book1.getphoneno());
      book.setAddress(book1.getAddress());


    }
    public void updateAction(){
	System.out.println("Going to update Data");
	for (Iterator<Book> it = bookList.iterator(); 
		it.hasNext();) 
	{	Book result = it.next();
		System.out.println(result.getId());
		if (result.getId() == book.getId())
		{	System.out.println(result.getId());
			System.out.println("address" + result.getAddress());
			System.out.println("naame" + result.getName());
			System.out.println(result.getphoneno());
			result.setName(book.getName());
			result.setphoneno(book.getphoneno());
			result.setAddress(book.getAddress());
			book = new Book();
			setDisable(true);
			setEnable(false);
		}
		else
		{
			System.out.println("No Data To Update");  
			setDisable(true);
		}
	}
    }
}