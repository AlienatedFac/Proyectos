/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

/**
 *
 * @author Mariano
 */
import java.io.*;
import java.net.*;
public class Cliente {
	static final String HOST = "localhost";
	static final int PUERTO=5000;
        String cad1, cad2;
       String a;
	public Cliente( ) {
	try{
	Socket miCliente = new Socket( HOST , PUERTO );
        System.out.println("Primer Numero");
        BufferedReader num1= new BufferedReader(new InputStreamReader(System.in));
        cad1=num1.readLine();
        System.out.println("Segundo Numero");
        BufferedReader num2= new BufferedReader(new InputStreamReader(System.in));
        cad2=num2.readLine();
        
        Socket sc1=new Socket("localhost", 5000);
        OutputStream os1=sc1.getOutputStream();
        DataOutputStream dos1=new DataOutputStream(os1);
        dos1.writeUTF((cad1));
        
        Socket sc2=new Socket("localhost", 5000);
        OutputStream os2=sc2.getOutputStream();
        DataOutputStream dos2=new DataOutputStream(os2);
        dos2.writeUTF((cad2));
        
        Socket s1=new Socket("localhost", 5000);
        InputStream is=s1.getInputStream();
    DataInputStream dis=new DataInputStream(is);
        System.out.println(dis.readUTF());
        
        
         ServerSocket miClient = new ServerSocket(PUERTO);
	InputStream aux = miCliente.getInputStream();
	DataInputStream flujo = new DataInputStream( aux );
           System.out.println("El resultado es: ");
	System.out.println( flujo.readUTF() );
        Socket miServidor = miClient.accept(); // Crea objeto
	miCliente.close();
System.out.println("Iniciando el puerto " + PUERTO );
			Socket sl=miClient.accept();
                        InputStream xd=sl.getInputStream();
                        DataInputStream diso=new DataInputStream(xd);
                        a=diso.readUTF();
                        System.out.println(a);
        
	
	} catch( Exception e ) {
	System.out.println( e.getMessage() );
	}
	}
	public static void main( String[] arg ) {
	new Cliente();
	}
}
