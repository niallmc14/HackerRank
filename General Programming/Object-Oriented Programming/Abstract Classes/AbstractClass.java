import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

//Write MyBook class here

class MyBook extends Book{

    private String title;

    public MyBook(){
    	
    }

    void setTitle(String s){
        this.title = s;
    }

    String getTitle(){
        return title;
    }
}

public class AbstractClass{
	
	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}