package lab07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Driver {

	public static void main(String[] args) throws IOException
	{
		Book2Tester tester = new Book2Tester();
		try(
				//open a file in "append mode" using the argument "true"
				// so we can keep adding to the file
				FileOutputStream outfile = new FileOutputStream("books.txt",true);
				//use a PrintWriter "wrapper" to make the file easier to ues
				// use the try with resources construct, new in Java 7
				PrintWriter output = new PrintWriter(outfile)){
					do {
						Book2 book = tester.getBook();
						String title = book.getTitle();
						title = title.replace('\t', ' '); //remove tabs in title, if any
						output.println(title+'\t'+book.getPageCount()+
								'\t'+book.isRequired()+'\t'+book.getBookmark());
						//output the book to the file to avoid losing it if the program
						//stops
						output.flush();
					} while(tester.getMoreBooks());
				}
	}

}
