import java.net.*;
import java.io.*;

class clientArmustrongCheack
{
    public static void main(String args[])throws Exception
    {
        Socket s=new Socket("127.0.0.1",2101);
           
        InputStream is=null;
        DataInputStream dis=null;
        OutputStream os=null;
        DataOutputStream dos=null;
        for(int i=0;;i++)
        {
            is=s.getInputStream();
            dis=new DataInputStream(is);
            os=s.getOutputStream();
            dos=new DataOutputStream(os);
            if(args[i].equals("-1"))
             {
                 //pass number to server
                  dos.writeUTF(args[i]);
                  break;
             }
            else
             {
                 //pass number to server
                 dos.writeUTF(args[i]);
                 System.out.println(dis.readUTF());

             }              
        }
        dos.close();
        dis.close();
        s.close();
        System.out.println("client disconnected....");

    }
}
