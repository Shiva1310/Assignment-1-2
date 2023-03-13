import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Countwords{
public static void main(String[] args)throws Exception{
	FileReader file=null;
	String line;
	Scanner s=null;
	String word1;
	int count=0;
	BufferedReader br=null;
	for(int i=0;i<args.length;i++){
	 file=new FileReader(args[i]);}
	
		 br=new BufferedReader(file);
		 System.out.println("Enter the word :");
		 s=new Scanner(System.in);
		 word1=s.nextLine();


while((line=br.readLine())!=null){
String words[]=line.split(" ");
for(int j=0; j<words.length;j++){
if(word1.equals(words[j]))
	count++;}}
System.out.println(word1+" "+count);
}}
