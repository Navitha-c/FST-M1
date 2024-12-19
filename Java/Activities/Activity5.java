package Activity1;

abstract class Book {
  String title;
  
  abstract void setTitle(String s);
  
  //Concrete method
  String getTitle() {
      return title;
  }
}

class MyBook extends Book {
  public void setTitle(String s) {
      title = s;
  }
}

public class Activity5 {
  
  public static void main(String []args) {
      
      String title = "The silence";
      
      Book newNovel = new MyBook();
    
      newNovel.setTitle(title);
      
            System.out.println("The title is: " + newNovel.getTitle());
  }
}