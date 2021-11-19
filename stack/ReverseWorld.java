	import java.util.*;
	import java.io.*;
	
	class ReverseWorld
	{
	  public static void main(String args[])throws IOException
	  {
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     //accepting sentence from user
	     System.out.println("Enter the sentence.......");
	     String sen=br.readLine();
	     
	     //split world from sentence
	     String worlds[]=sen.split(" ");//split sentence into array of worlds
	     
	     //create stack leagacy class object  
             Stack stack=new Stack();
             
             String result="";
             for(String world: worlds)
             {
                    char ch[]=world.toCharArray();//Convert world into array of characters
                    for(int i=0;i<ch.length;i++)
                    {
                       stack.push(ch[i]);//push characters into stack
                    }  
                    for(int i=0;i<ch.length;i++)
                    {
                       result+=stack.pop();//pop characters from stack
                    } 
                    result+=" ";  //after each world their is space      
             }  	     
	     System.out.println(result);//display final result
	  }
	}
