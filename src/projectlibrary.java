import java.util.Scanner;
class Author
{
	private String name;
	private String email;
	private char gender;

public Author (String name, String email, char gender)
{
      this.name = name;
      this.email = email;
      this.gender = gender;
}
public Author(String name2, Author author, double price) {
	// TODO Auto-generated constructor stub
}
public Author(String name2, Author author, double price, int qty) {
	// TODO Auto-generated constructor stub
}
public String getName()
{
	return name;
}
public String getEmail()
{
	return email;
}
public void setEmail(String email)
{
	this.email = email;
}
public char getGender()
{
	return gender;
}
public String toString()
{
	
	return "Author[name="+name+",email="+email+",gender="+gender+"]";
}
}
 class Book extends Author
{
	 private String name;
	 private double price;
	 private  int qty=0;
	 Author author;
	 public Book(String name, Author author, double price) {
		super(name, author, price);
		// TODO Auto-generated constructor stub
	 this.name = name;
	 this.author = author;
	 this.price = price;
}
	 public Book(String name, Author author, double price , int qty)
	 {
		super(name,author,price,qty);
		this.name = name;
		this.author = author;
		this.price = price;
		this.setQty(qty);
	 }  
	 //getName(), getAuthor(), getPrice(), setPrice(), getQty(), setQty(). 
	 public String getName()
	 {
		 return name;
	 }
	 public Author getAuthor()
	 {
		 return author;
	 }
	 public double getPrice()
	 {
		 return price;
	 }
	 public void setPrice(double price)
	 {
		 this.price = price;
	 }
	 public  int getQty()
	 {
		 return qty;
	 }
	 public void setQty(int qty)
	 {
		 this.qty = qty;
	 }
	 public String toString()
	 {
		 return  "Book [ name = "+name+", Author [ name = "+author.getName()+", email = "+author.getEmail()+", gender = "+author.getGender()+"]"+", price = "+price+" qty = "+getQty();
	 }
}
 class Date
{
	int dd;
	int mm;
	int yyyy;

 public  Date(int dd, int mm, int yyyy)
 {
	 this.dd = dd;
	 this.mm = mm;
	 this.yyyy=yyyy;
 }
 
 public Date(String name, int roll, Date issueDate, Date returnDate) {
	// TODO Auto-generated constructor stub
}
public int getDD()
 {
	 return dd;
 }
 public int getMM()
 {
	 return mm;
 }
 public int getYYYY()
 {
	 return yyyy;
 }
 
 public String toString()
 {
	 return dd+"/"+mm+"/"+yyyy;
	
 }

}
 class Student extends Date
 {
				// TODO Auto-generated constructor stub
	String name;
    int roll;
    Date issueDate;
	Date returnDate;
	public Student(String name,int roll,Date issueDate,Date returnDate) {
		super(name,roll,issueDate,returnDate);
		this.name = name;
		this.roll= roll;
		this.issueDate=issueDate;
		this.returnDate=returnDate;
	   }
	public String getName() 
	{
	return name;	
	}
    public int getRoll()
    {
    	return roll;
    }
              
    public  void issueBook() 
    {
    	issueDate.toString();
    	quantity q = new quantity();
    	int qty = q.quant();
    	 
    	if(qty<=0)
    	{
    		System.out.println("No book available");
    	}
    	if(qty>=1)
    	{
    		System.out.println("Books available");
        }
    	System.out.println("Tell no. of books you wanna issue");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	if(n<=5) {
    	
    	System.out.println("Issue date :"+issueDate);}
    	else if(n>5)
    	System.out.println("You cannot issue more than 5 books");	
    	qty = qty-n;
    	System.out.println(qty+" "+"Books available");
    }
    public void depositBook()
    {   
    	int qty = 12;
    	System.out.println("Tell no. of books you wanna deposit");
    	System.out.println("Enter the date you issued");
    	
    	Scanner sc = new Scanner(System.in);
    	int d4 = sc.nextInt();
    	int m = sc.nextInt();
    	qty += m;
    	System.out.println("Enter date");
    	int d = sc.nextInt();
    	int mm = sc.nextInt();
    	int yy = sc.nextInt();
    	Date d2 = new Date(d,mm,yy);
    	System.out.println("You returned on "+d2.toString());
    	if(d4>10)
    		d = d+20;
    	else if(d>10)
    		d4 = d4+20;
    	
    		
    	System.out.println("Your fine is ");
    	
    }
    public String toString()
    {
    	return name+" "+roll+" "+issueDate+" "+returnDate;
    	
    }

 }
 class quantity
 {
	 public int quant()
	 {
		 int qty= 12;
		return qty;
	 }
 }
public class projectlibrary {
	public static void main(String[] args)
	{
		while(true)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n--------Menu-----------\n");
		System.out.println("1.Show library\n");
		System.out.println("2.Select your books\n");
		System.out.println("3.Issue book\n");
		System.out.println("4.Deposit Book\n");
		System.out.println("5.Exit\n");
		System.out.println("\nEnter your choice:\t");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:Author a1 = new Author("Dhairya","dhairyas593@gmail.com",'m');
	    Book b = new Book("Phyicos",a1,123.325,45);
	    Book c = new Book("Chemicos",a1,150.3,35);
	    Book d = new Book("Biocos",a1,125.26,45);
	    Book e = new Book("Metricos",a1, 1258.5,56);
	    Book f = new Book("Compucos",a1,1246.45, 5 );
	    Book g = new Book("Darwins game",a1,1278.2,65);
	    Book h = new Book("Seven deadly sins",a1,14.55,45);
	    Book i = new Book("Moogli",a1,178.25,78);
	    Book j = new Book("Harry potter",a1,189.5,89);
	    Book k = new Book("Hamlet",a1,199.25,16);
	    Book l = new Book("Merchant of venice",a1,163.25,65);
	    Book m = new Book("Julius Caesar",a1,1452.35,78);
	    System.out.println( b.toString());
	    System.out.println( c.toString());
	    System.out.println( d.toString());
	    System.out.println( e.toString());
	    System.out.println( f.toString());
	    System.out.println( g.toString());
	    System.out.println( h.toString());
	    System.out.println( i.toString());
	    System.out.println( j.toString());
	    System.out.println( k.toString());
	    System.out.println( l.toString());
	    System.out.println( m.toString());
	    
	    ; break;
		case 2: System.out.println("Tell numbers of book you selected");
		Scanner sc1 = new Scanner(System.in);
		int m1 = sc1.nextInt();
		; break;
		case 3:System.out.println("Tell todays date");
		Scanner s2 = new Scanner(System.in);
		int dd= s2.nextInt();
		System.out.println("Tell todays month");
		int mm = s2.nextInt();	
		System.out.println("Tell todays year");
		int yyyy = s2.nextInt();	
		Date d1 = new Date(dd,mm,yyyy);
		System.out.println("Issue date is "+d1.toString());
		String r = d1.toString();
		System.out.println("Tell your name");
		String nm = s2.next();
		System.out.println("Your roll number");
		int rol = s2.nextInt();
		System.out.println("Your last return date will be 20 days after your issue date");
		int dd2=0;
		int mm2 = 0;
		if(dd<=10)
			 dd2 = 20+dd;
		else if(dd>10)
			 dd2 = (20+dd)-30;
		     mm2 = (mm+1);
		Date d2 = new Date(dd2,mm2,yyyy);
		System.out.println("your return date is : "+d2.toString());
		String r2 = d2.toString();
		Student s1 = new Student(nm,rol,d1,d2);
		System.out.println(s1.toString());
		s1.issueBook();
		
			; continue;
		case 4:System.out.println("Tell todays date");
		Scanner s21 = new Scanner(System.in);
		int dd1= s21.nextInt();
		System.out.println("Tell todays month");
		int mm1 = s21.nextInt();	
		System.out.println("Tell todays year");
		int yyyy1 = s21.nextInt();	
		Date d11 = new Date(dd1,mm1,yyyy1);
		System.out.println("Return Date is "+d11.toString());
		System.out.println("your last return date is "+r2);
		System.out.println("Tell your name");
		String nm1 = s21.next();
		System.out.println("Your roll number");
		int rol1 = s21.nextInt();
		System.out.println("Your last return date will be 20 days after your issue date");
		         
		int dd21=0;
		int mm21 = 0;
		if(dd1<=10)
			 dd21 = 20+dd1;
		else if(dd1>10)
			 dd21 = (20+dd1)-30;
		     mm21 = (mm1+1);
		Date d21 = new Date(dd21,mm21,yyyy1);
		System.out.println("your return date is : "+d21.toString());
		Student s211 = new Student(nm1,rol1,d11,d21);
		System.out.println(s211.toString());
		s211.depositBook();
			
			
			; break;
		case 5: System.exit (0); break;
		default:
		System.out.println("\nInvalid choice:\n");
		}
		}
		
	}}


