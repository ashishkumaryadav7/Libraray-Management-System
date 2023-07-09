// project of library management...............................

import java.util.*;

class authentication
{
	final String userid="abc";
	final int userpass=123;
	int x; int y;
	authentication(String uid, int upass)
	{
		
		if (userid.equals(uid) && userpass==upass)
		{
			x=1; 
		}
		else
		{
			y=0;

		}
		
	}
}

// library book entry class........

class Bookentry
{
	Scanner sc=new Scanner(System.in);
	String Book[][]=new String [20][9];
	int size;
	Bookentry()
	{
		System.out.println("NO of Book do you want to enter:  ");
		size=sc.nextInt();
	}
	void bookdefault()
	{
		Book[0][0]="S.NO ";
		Book[0][1]="  No. of Copy ";
		Book[0][2]="  Book ID ";
		Book[0][3]="  Book Name ";
		Book[0][4]="  Author Name ";
		Book[0][5]="  Publication ";
		Book[0][6]="  Book Price ";
		Book[0][7]="      Status";
		Book[0][8]="      Issue ID";                    
	
	}
	void getbookdefault()
	{
		for(int i=0; i<1; i++)    // printing the basic details..........
		{
			for(int j=0; j<8; j++)
			{
				System.out.print(Book[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	void getbookdefaultISSUE()
	{
		for(int i=0; i<1; i++)    // printing the basic details..........
		{
			for(int j=0; j<9; j++)
			{
				System.out.print(Book[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
	}
	
	// enter the book detail in data management...

	void bookentry()
	{
		for(int i=1; i<size+1 ; i++)
		{
			System.out.println("Entery "+i+" book:" );
			Book[i][7]="Not_Issue";                                                                         
			Book[i][8]="empty";
			for(int j=0; j<7; j++)
			{
				Book[i][j]=sc.next();
				System.out.print("\t");
			}
		}
		System.out.println("");
	}
	
	//print the data management........

	void bookdetail()
	{
		for(int i=1; i<size+1; i++)
		{
			for(int j=0; j<7; j++)
			{
				System.out.print(Book[i][j]);
				System.out.print("\t\t");
			}
			System.out.println("");
		}
	}
	String[][] returnBook()
	{
		return Book;
	}
}

//class BOOK........

class BOOK
{
	String Gbook[][]=new String [20][9];
	int Gsize;
	void GBook(String ar[][],int n)
	{	
		Gsize=n;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<9; j++)
			{
				Gbook[i][j]=ar[i][j];
			}
		}
	}
	String[][] returnGbook()
	{
		return Gbook;
	}

	void printGbook()
	{
		for(int i=1; i<Gsize; i++)
		{
			for(int j=0; j<9; j++)
			{
				System.out.print(Gbook[i][j]);
				System.out.print("\t\t");
			}
			System.out.println("");
		}
	}

}

// class to add new book in the data management.......................

class addBook 
{
	Scanner sc=new Scanner(System.in);
	String Booknew[][]=new String[20][9];
	private int size1;
	int updatedsize;
	addBook(String ar[][],int n)
	{	
		size1=n;
		for(int i=0; i<n+1; i++)
		{
			for(int j=0; j<9; j++)
			{
				Booknew[i][j]=ar[i][j];
			}
		}
	}

	void addnewBook()
	{
		System.out.println("How many book do you want to Add in Data:");
		int s=sc.nextInt();
		int s1=size1+s;
		updatedsize=s1;
		for(int i=size1; i<s1; i++)
		{
			System.out.println("Entery "+i+" book:" );
			Booknew[i][7]="Not_Issue";                                                                        
			Booknew[i][8]="empty";
			for(int j=0; j<7; j++)
			{
				Booknew[i][j]=sc.next();
				System.out.print("\t");
			}
		}
		System.out.println("");

	}
	void getnewBook()
	{
		for(int i=1; i<updatedsize; i++)
		{
			for(int j=0; j<7; j++)
			{
				System.out.print(Booknew[i][j]);
				System.out.print("\t\t");
			}
			System.out.println("");
		}
		
	}
	String[][] returnnewBook()
	{
		return Booknew;
	}

}

// class for Status of books...........
class bookstatus
{																
	Scanner sc=new Scanner(System.in);
	String Bookstatus[][]=new String[20][9];
	int size2;
	private String a1; 											
	private int Cindex=-1;
	private int detail1=-1;
	private int StoI=0;
	bookstatus(String arr[][],int n)
	{	
		size2=n;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<9; j++)
			{
				Bookstatus[i][j]=arr[i][j];
			}
		}
	}
	void StringtoInteger(int ns)
	{
		String ss=Bookstatus[ns][1];
		Integer si=Integer.parseInt(ss);
		StoI=si.intValue();
	}

	void indexvalue()
	{
		if(detail1==1)
			Cindex=0;
		else if(detail1==2)
			Cindex=2;
		else if(detail1==3)
			Cindex=3;
		else if(detail1==4)
			Cindex=4;
		else if(detail1==5)
			Cindex=5;
	}

	void setdetailforStatus()
	{
		System.out.println("\n choose the option by which do you want to ISSUE / WITHDRAW the book: \n");

		System.out.println("press 1 for S.No");
		System.out.println("press 2 for Book ID");
		System.out.println("press 3 for Book Name");
		System.out.println("press 4 for Author Name");
		System.out.println("press 5 for Publication\n");
		int detail=sc.nextInt();
		detail1=detail;
		if(detail>0 && detail<6)
		{
		switch(detail)
		{
			case 1:
			{
				System.out.println("Enter the S.No:");
				a1=sc.next();
				break;
			}
			case 2:
			{
				System.out.println("Enter the Book ID:");
				a1=sc.next();
				break;

			}
			case 3:
			{
				System.out.println("Enter the Book Name:");
				a1=sc.next();
				break;

			}
			case 4:
			{
				System.out.println("Enter the Author Name:");
				a1=sc.next();
				break;

			}
			case 5:
			{
				System.out.println("Enter the Publication:");
				a1=sc.next();
				break;

			}
		}
		}
		else
		{
			System.out.println("\n\n Invalid Input \n\n");
		}
	}
	
		
	int FindBookIndexforStatus()
	{	
		
		int x1=0;
		if(Cindex>=0)
   	 	for(int x=1; x<size2; x++)
   		{
	
        		for(int y=Cindex; y<=Cindex; y++)						
        		{
        		    if (Bookstatus[x][y].equals(a1))
				{
                			x1=x;
                			break;
				}
			    else
				{
					x1=-1;
				}
       			}
    		}
		else
		{
			System.out.println("\nWrong Input\n");
		}
		return x1;
	
	}


	void addStatus(int n)
	{			
		System.out.println("Enter the Status (issued / not issue)");

		System.out.println("\npress 1 to Issue");
		System.out.println("press 2 to Withdraw\n");
		String s1="Issued";
		String s2="Not_Issue";

		for(int i=n; i<=n; i++)
		{
			if(StoI>0)
			{
				System.out.println("Status of "+i+" book:" );

				int x2=sc.nextInt();
				
				if(x2==1) // for issue the book
				{						
					for(int j=7; j<8; j++)
					{
			        		if (Bookstatus[i][j].equals(s2))
						{
							Bookstatus[i][j]="Issued";
							int IS=StoI-1;
							String ItoS= String.valueOf(IS);
							Bookstatus[i][1]=ItoS;
							System.out.println("\nplease Enter the Issue ID:\n");
							String id=sc.next();
							Bookstatus[i][8]=id;
							break;
						}
						else if(Bookstatus[i][j].equals(s1))
						{
							System.out.println("\nBook Already ISSUED\n");
							break;
						}
					}
				}
				else
					{
						System.out.println("\n\nInvalid input !!!\n\n");
						break;
					}
			}

			else if(StoI>=0)
			{
				System.out.println("Status of "+i+" book:" );

				int x2=sc.nextInt();

				if(x2==2) // for not issue the book
				{						
					for(int j=7; j<8; j++)
					{
			        		if (Bookstatus[i][j].equals(s1))
						{
							Bookstatus[i][j]="Not_Issue";
							int IS=StoI+1;
							String ItoS= String.valueOf(IS);
							Bookstatus[i][1]=ItoS;
							Bookstatus[i][8]="empty";
							break;
						}
						else if(Bookstatus[i][j].equals(s2))
						{
							System.out.println("\nBook Already Not Issue\n");
							break;
						}
					}
						
					
				}
				else if(x2==1)
				{
					System.out.println("\n NO COPY AVAILABLE !!!!!\n");
					break;
				}
				else
					{
						System.out.println("\n\nInvalid input !!!\n\n");
						break;
					}
			
			}

			else
			{
				System.out.println("\nNO MORE COPY AVAILABLE\n");
			}
		}	

		
		

	}
	
	void updatedStatus()
	{
		for(int i=1; i<size2; i++)
		{
			for(int j=0; j<9; j++)
			{
				System.out.print(Bookstatus[i][j]);
				System.out.print("\t\t");
			}
			System.out.println("");
		}	
	}
	
	String[][] returnupdatedsataus()
	{
		return Bookstatus;
	}
	
}

// class for search the book in data management...................

class searchBook
{
	Scanner sc=new Scanner(System.in);
	String searchBook[][]=new String[20][9];
	private int size3;
	private int Cindex=-1;
	private int detail1=-1;
	private String a;
	searchBook(String arr[][],int n)
	{	
		size3=n;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<9; j++)
			{
				searchBook[i][j]=arr[i][j];
			}
		}
	}
	void indexvalue2()
	{
		if(detail1==1)
			Cindex=0;
		else if(detail1==2)
			Cindex=2;
		else if(detail1==3)
			Cindex=3;
		else if(detail1==4)
			Cindex=4;
		else if(detail1==5)
			Cindex=5;
	}

	void setdetail()
	{
		System.out.println("\n choose the option to seach the book: \n");

		System.out.println("press 1 for S.No");
		System.out.println("press 2 for Book ID");
		System.out.println("press 3 for Book Name");
		System.out.println("press 4 for Author Name");
		System.out.println("press 5 for Publication\n");

		int detail=sc.nextInt();
		detail1=detail;
		if(detail>0 && detail<6)
		{
		switch(detail)
		{
			case 1:
			{
				System.out.println("Enter the S.No:");
				a=sc.next();
				break;
			}
			case 2:
			{
				System.out.println("Enter the Book ID:");
				a=sc.next();
				break;

			}
			case 3:
			{
				System.out.println("Enter the Book Name:");
				a=sc.next();
				break;

			}
			case 4:
			{
				System.out.println("Enter the Author Name:");
				a=sc.next();
				break;

			}
			case 5:
			{
				System.out.println("Enter the Publication:");
				a=sc.next();
				break;

			}
		}
		}
		else
		{
			System.out.println("\n\n Invalid Input \n\n");
		}
	}
	
		
	int FindBookIndex()
	{
		int x1=0;
		if(Cindex>=0)
   	 	for(int x=1; x<size3; x++)
   		{
	
        		for(int y=Cindex; y<=Cindex; y++)
        		{
        		    if (searchBook[x][y].equals(a))
				{
                			x1=x;
                			break;
				}
			    else
				{
					x1=-1;
				}
       			}
    		}
		else
		{
			System.out.println("\nWrong Input\n");
		}
		return x1;
	
	}
	void getbookIndexdetail(int n)
	{

               	    for(int j=0; j<7; j++)
               	    {
                        System.out.print(searchBook[n][j]);
                        System.out.print("\t\t");
                    }
                    System.out.println("");
		
	}
}

//class for deleting the book from the book management...............

class deleteBook
{
	Scanner sc=new Scanner(System.in);
	String deletebook[][]=new String[20][9];
	String deletebook1[][]=new String[20][9];
	private int size4;
	private int Cindex=-1;
	private int detail1=-1;
	private String a;
	deleteBook(String arr[][],int n)
	{
		size4=n;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<9; j++)
			{
				deletebook[i][j]=arr[i][j];
			}
		}
	}	
	void indexvalue1()
	{
		if(detail1==1)
			Cindex=0;
		else if(detail1==2)
			Cindex=2;
		else if(detail1==3)
			Cindex=3;
		else if(detail1==4)
			Cindex=4;
		else if(detail1==5)
			Cindex=5;
	}
	
	void setdetailtodelete()
	{
		System.out.println("press 1 for S.No");
		System.out.println("press 2 for Book ID");
		System.out.println("press 3 for Book Name");
		System.out.println("press 4 for Author Name");
		System.out.println("press 5 for Publication");
		System.out.println("\n choose the option to delete the book: \n");

		int detail=sc.nextInt();
		detail1=detail;

		switch(detail)
		{
			case 1:
			{
				System.out.println("Enter the S.No:");
				a=sc.next();
				break;
			}
			case 2:
			{
				System.out.println("Enter the Book ID:");
				a=sc.next();
				break;

			}
			case 3:
			{
				System.out.println("Enter the Book Name:");
				a=sc.next();
				break;

			}
			case 4:
			{
				System.out.println("Enter the Author Name:");
				a=sc.next();
				break;

			}
			case 5:
			{
				System.out.println("Enter the Publication:");
				a=sc.next();
				break;

			}
		}
	}
	
		
	int FindIndextoDelete()
	{
		int x1=0;
		if(Cindex>=0)
   	 	for(int x=1; x<size4; x++)
   		{
	
        		for(int y=Cindex; y<=Cindex; y++)
        		{
        		    if (deletebook[x][y].equals(a))
				{
                			x1=x;
                			break;
				}
			    else
				{
					x1=-1;
				}
       			}
    		}
		else
		{
			System.out.println("\nWrong Input\n");
		}
		return x1;
	
	}

	void removeBook(int n)
	{

		for(int i=1; i<size4; i++)
		{
			if(i==n)
			{

				continue;
                	    
				
			}
			else if(i>n)
			{
				for(int j=0; j<8; j++)
				{
					deletebook1[i-1][j]=deletebook[i][j];
					//deletebook1[i][j]="impty";
				}
			}
			else
			{

				for(int j=0; j<8; j++)
				{
					deletebook1[i][j]=deletebook[i][j];
				}
			}


		
		}
	}
		
	void getdeletedBook()
	{
		for(int i=1; i<size4-1; i++)
		{
			for(int j=0; j<8; j++)
			{
				System.out.print(deletebook1[i][j]);
				System.out.print("\t\t");
			}
			System.out.println("");
		}
	}
	
	String [][] returnAfterdeletedBook()
	{
		return deletebook1;
	}
	
}

// class to find the issued book in the Book management......

class searchIssuedBook
{
	Scanner sc=new Scanner(System.in);
	String findIssuedBook[][]=new String[20][9];
	private int size5;
	private String a;
	int av=0;
	searchIssuedBook(String arr[][],int n)
	{	
		size5=n;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<9; j++)
			{
				findIssuedBook[i][j]=arr[i][j];
			}
		}
	}

	void setissued()
	{
		System.out.println("press 1 for Issued Book");
		System.out.println("press 2 for Not Issued");
		System.out.println("\n choose the option to seach the book Issued/Not Issued: \n");
		int detail=sc.nextInt();
		switch(detail)
		{
			case 1:
			{
				a="Issued";
				
				break;
			}
			case 2:
			{
				a="Not_Issue";
				
				break;
			}	
		}
	}
	void conditionStatus()
	{
		for(int m1=1; m1<size5; m1++)
		{

	      		for(int m2=7; m2<8; m2++)
			{
        		  	if (findIssuedBook[m1][m2].equals(a))
				{
						av=1;
				}
				
			}
		}

	}

	void getBooknewStatus()
	{

		for(int m1=1; m1<size5; m1++)
		{

	      		for(int m2=7; m2<8; m2++)
			{
        		  	if (findIssuedBook[m1][m2].equals(a))
				{
					for(int p=0; p<9; p++)
					{						
						System.out.print(findIssuedBook[m1][p]);
                        			System.out.print("\t\t");
						
						av=1;
					}
					System.out.println("");
				}
				
			}
		}
	}
	
}

// main class of project....................
class mainofproject1
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		
						// code for user login..................................
		int n=1;
		while(n>0 && n<6)
		{
			System.out.println("Enter your user ID: ");
			String userid=sc.next();
			System.out.println("Enter your Password: ");
			int userpass=sc.nextInt();
			authentication ob1=new authentication(userid, userpass);

			if(ob1.x==1)
			{
				break;
			}
			else if(ob1.y==0)
			{
				System.out.println("Invalid user ID or Password");
				n++;
			}
			
		}

	// object for book entry...........................................
		Bookentry ob2=new Bookentry();
		System.out.println("Enter the data:");
		ob2.bookdefault();
		ob2.getbookdefault();
		ob2.bookentry();
		ob2.getbookdefault();
		ob2.bookdetail();
		String x[][]=ob2.returnBook();	

	// object of global class BOOK...........
		
		BOOK obG=new BOOK();
		obG.GBook(x,ob2.size+1);





		int option=1;
		while(option>0 && option<7)
		{
			System.out.println("\n\npress 1 to Add Book");
			System.out.println("press 2 to Search Book");
			System.out.println("press 3 to Issued Book/ Withdraw Book");
			System.out.println("press 4 to search Issued / NOT_Issued Book");
			System.out.println("press 5 to delete Book");
			System.out.println("press 6 to print library");
			System.out.println("press 0 to exit\n");
			System.out.println("Enter your choice\n");


			int X=sc.nextInt();
			

			
			switch(X)
			{
				case 1: //Add book
					{
						BOOK obG1=new BOOK();
						addBook ob30=new addBook(obG.returnGbook(),obG.Gsize);
						ob30.addnewBook();
						System.out.println("Updated data is: ");
						ob2.getbookdefault();
						ob30.getnewBook();
						obG.GBook(ob30.returnnewBook(),ob30.updatedsize);


						break;	
					}
				case 2: //Search Book
					{
						searchBook ob50=new searchBook(obG.returnGbook(),obG.Gsize);
						ob50.setdetail();
						ob50.indexvalue2();
						int n1=ob50.FindBookIndex();
						if(n1>0)
						{
							System.out.println("\n\nFound !!!\n\n");
							ob2.getbookdefault();
							ob50.getbookIndexdetail(n1);
							
						}
						else
						{
							System.out.println("\nNot found\n");
						}
						break;
					}
				case 3: //Issue Book
					{

						bookstatus ob40=new bookstatus(obG.returnGbook(),obG.Gsize);
	

						ob40.setdetailforStatus();
						ob40.indexvalue();
						int n2=ob40.FindBookIndexforStatus();
						if(n2>0)                                                          
						{
							ob40.StringtoInteger(n2);
							ob40.addStatus(n2);
							//ob2.getbookdefaultISSUE();
							//ob40.updatedStatus();
							obG.GBook(ob40.returnupdatedsataus(),ob40.size2);

							
						}
						else
						{
							System.out.println("\nNOT FOUND BOOK !!!!!!\n");
						}
						break;
					}
				case 4: //search Issued Book
					{

						searchIssuedBook ob70=new searchIssuedBook(obG.returnGbook(),obG.Gsize);
						ob70.setissued();
						ob70.conditionStatus();
						if(ob70.av==1)
						{
							System.out.println("");
							ob2.getbookdefaultISSUE();
							ob70.getBooknewStatus();
						}
						else
						{
							System.out.println("\n\nNOT FOUND !!!");
						}
						break;
					}
				case 5: //delete Book
					{

						deleteBook ob60=new deleteBook(obG.returnGbook(),obG.Gsize);
						ob60.setdetailtodelete();
						ob60.indexvalue1();
						int n2=ob60.FindIndextoDelete();
						if(n2>0)
						{
							ob60.removeBook(n2);
							System.out.println("\n");
							ob2.getbookdefault();
							ob60.getdeletedBook();
							obG.GBook(ob60.returnAfterdeletedBook(),obG.Gsize-1);

						}
						else
						{
							System.out.println("Not found !!!!");
						}
						break;
					}
				case 6: //Print Book management
					{
						ob2.getbookdefaultISSUE();
						obG.printGbook();
						break;
					}
				
			}

			
			option=X;
			

		}

	}
}