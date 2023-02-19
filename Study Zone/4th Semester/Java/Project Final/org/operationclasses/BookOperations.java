package org.operationclasses;
import org.classes.Book;
import org.classes.Author;
import org.classes.Publisher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookOperations{
    Scanner sc = new Scanner(System.in);
    public void insertBook(Book b){
        System.out.print("Enter Book ID:");
        int id = sc.nextInt();
        sc.nextLine();
        b.setId(id);
        System.out.println("");
        System.out.print("Enter Book Title:");
        String title = sc.nextLine();
        b.setTitle(title);
        System.out.println("");
        System.out.print("Enter Book Subtitle:");
        String subTitle = sc.nextLine();
        b.setSubTitle(subTitle);
        System.out.println("");
        //Author
        System.out.print("Enter Book Author Details:");
        System.out.println("");
        Author at = new Author();
        System.out.print("Author ID: ");
        int authorID = sc.nextInt();
        sc.nextLine();
        at.setId(authorID);
        System.out.println("");
        System.out.print("Author Name: ");
        String authorName = sc.nextLine();
        at.setName(authorName);
        System.out.println("");
        System.out.print("Author Email: ");
        String authorEmail = sc.nextLine();
        at.setEmail(authorEmail);
        System.out.println("");
        b.setAuthor(at);
        //Publisher
        System.out.print("Enter Book Publisher Details:");
        System.out.println("");
        Publisher pb= new Publisher();
        System.out.print("Publisher ID: ");
        int publisherID = sc.nextInt();
        sc.nextLine();
        pb.setId(publisherID);
        System.out.println("");
        System.out.print("Publisher Name: ");
        String publisherName = sc.nextLine();
        pb.setName(publisherName);
        System.out.println("");
        System.out.print("Publisher Contact No: ");
        String publisherContactNo = sc.nextLine();
        pb.setContactNo(publisherContactNo);
        System.out.println("");
        b.setPublisher(pb);
        System.out.print("Enter Book Price:");
        double bPrice=sc.nextDouble();
        sc.nextLine();
        b.setPrice(bPrice);
        System.out.println("");

        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo\\"+id+".txt");
        FileWriter fw=null;
        try{
            f.createNewFile();
            fw = new FileWriter(f);
            String st= "-----------Book Information--------\n";
            fw.write(st);
            st= "Book ID: "+id+"\n";
            fw.write(st);
            st= "Book Title: "+title+"\n";
            fw.write(st);
            st= "Book Subtitle: "+subTitle+"\n";
            fw.write(st);
            st= "Book Author Information: \n";
            fw.write(st);
            st= "Author ID : "+authorID+"\n";
            fw.write(st);
            st= "Author Name: "+authorName+"\n";
            fw.write(st);
            st= "Author Email: "+authorEmail+"\n";
            fw.write(st);
            st= "Book Publisher Information: \n";
            fw.write(st);
            st= "Publisher ID : "+publisherID+"\n";
            fw.write(st);
            st= "Publisher Name: "+publisherName+"\n";
            fw.write(st);
            st= "Publisher Contact No: "+publisherContactNo+"\n";
            fw.write(st);
            st= "Book Price: "+bPrice+"\n";
            fw.write(st);
        }
        catch(IOException ie){
            System.out.println("Book ID Already Exist Give Different Book ID");
        }
        finally{
            try{
            fw.close();
        }
        catch(IOException ie){
            System.out.println("Cannot Close The Database");
        }
        }
    }
    public Book getBook(int bookId){
        File f = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo\\"+bookId+".txt");
        FileReader fr=null;
        BufferedReader br=null;
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String st=" ";
            while((st=br.readLine())!=null){
                System.out.println(st);
            }
        }
        catch(Exception e){
            System.out.println("The Book ID You Have Given Not Found In The Database");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException ie){
                System.out.println("Cannot Close Database");
            }
        }
        return null;
    }
    public void showAllBooks(){
        File folder = new File("D:\\Study Zone\\4th Semester\\Java\\Project Final\\org\\operationclasses\\database\\BookInfo");
        File[] listOfFiles = folder.listFiles();
        FileReader fr = null;
        BufferedReader br = null;
        for (int i = 0; i < listOfFiles.length; i++) {
        File file = listOfFiles[i];
        if (file.isFile() && file.getName().endsWith(".txt")) {
        try{
          fr = new FileReader(file);
          br = new BufferedReader(fr);
        String content = "";
        while ( (content=br.readLine()) != null) {
          System.out.println(content);
        }
        }
        catch(Exception e) {
        System.out.println("Error Opening Database!!");
        }
        finally {
            try {
            fr.close();
            }
            catch(IOException e) {
            System.out.println("Can not close Database!");
            }
        }
     } 
    }
  }
}