import java.io.*;
import java.net.*;

class serverArmustrongCheak
{
  
    public static void main(String args[])throws Exception
    {
        ServerSocket ss=new ServerSocket(2101);
        
        Socket s=ss.accept();
        System.out.println("client connected....");

        InputStream is=null;
        DataInputStream dis=null;
        OutputStream os=null;
        DataOutputStream dos=null;
        while(true)
        {
            is=s.getInputStream();
            dis=new DataInputStream(is);
            os=s.getOutputStream();
            dos=new DataOutputStream(os);

            String num=dis.readUTF();
            
            if(num.equals("-1"))
            {
                dos.writeUTF("quit");
                break;
            }
            else//sum cube of digit = num is armstong
            {
               int n=Integer.parseInt(num); 
               System.out.println(n);  
               int sum=0,m=n;
               while(n>0)
               {
                  int ldigit=n%10;
                  sum+=(ldigit*ldigit*ldigit);
                  
                  n=n/10;
               }
               
               if(m==sum)
               {
                 dos.writeUTF(m+" is Armustrong Number.....");
               }
               else
               {
                  dos.writeUTF(m+" is NOT Armustrong Number.....");
               }
                
            }


        }
        dos.close();
        dis.close();
        s.close();
        System.out.println("Server Close.........");

    }
}
