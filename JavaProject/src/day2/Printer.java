package day2;

public class Printer {
  private String Content;
  public Printer() { //no argument constructor
	  Content = "Good Morning";// code for intialization
	  this.Content = "Good Morning";
  }
  
  public Printer (String Content) {// parameterized constructor accepting 1 parameter
	  this.Content = Content;
	  
	  
  }

public String getContent() {
	return Content;
}

public void setContent(String content) {
	Content = content;
}
  
  public void print() {//prints the content without any decoration
	  System.out.println(Content);
	  
  }
  
  public void print(String decoration) {//Prints the content with some decoration
	  System.out.println(decoration + Content + decoration);
	  
  }
  
  
}
