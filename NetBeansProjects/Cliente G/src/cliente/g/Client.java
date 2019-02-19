/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.g;

/**
 *
 * @author ferna
 */import java.io.*;
import java.net.*;
public class Client {
    static final String HOST = "localhost";
	static final int PUERTO=5000;
        String cad1, cad2;
       String a;
	public Client(String b, String c ) {
	try{
	Socket miCliente = new Socket( HOST , PUERTO );
   
        
        Socket sc1=new Socket("localhost", 5000);
        OutputStream os1=sc1.getOutputStream();
        DataOutputStream dos1=new DataOutputStream(os1);
        dos1.writeUTF((b));
        
        Socket sc2=new Socket("localhost", 5000);
        OutputStream os2=sc2.getOutputStream();
        DataOutputStream dos2=new DataOutputStream(os2);
        dos2.writeUTF((c));
        
        Socket s1=new Socket("localhost", 5000);
        InputStream is=s1.getInputStream();
    DataInputStream dis=new DataInputStream(is);
        System.out.println(dis.readUTF());
        
        
        
	InputStream aux = miCliente.getInputStream();
	DataInputStream flujo = new DataInputStream( aux );
	System.out.println( flujo.readUTF() );
     ServerSocket miClient = new ServerSocket(PUERTO);
        System.out.println("El resultado es: ");
        Socket miServidor = miClient.accept(); // Crea objeto
		
			Socket sl=miClient.accept();
                        InputStream xd=sl.getInputStream();
                        DataInputStream diso=new DataInputStream(xd);
                        a=diso.readUTF();
                        System.out.println(a);
        
	miCliente.close();
	} catch( Exception e ) {
	System.out.println( e.getMessage() );
	}
	}
    
    
}
