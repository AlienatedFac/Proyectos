/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author Mariano
 */
import java.io.* ;
import java.net.* ;
class Servidor {
static final int PUERTO=5000;
int x, y, sum;
String a, b;//puerto de comunicacion
public Servidor( ) {
		try {
			ServerSocket miServidor = new ServerSocket(PUERTO);
			System.out.println("Iniciando el puerto " + PUERTO );
		for ( int numCli = 0; numCli < 3; numCli++ ) {
			Socket miCliente = miServidor.accept(); // Crea objeto
			System.out.println("Servicio al cliente " + numCli);
			OutputStream aux = miCliente.getOutputStream();
			DataOutputStream flujo= new DataOutputStream( aux );
			flujo.writeUTF( "Hola cliente " + numCli );
			Socket s1=miServidor.accept();
                        InputStream is=s1.getInputStream();
                        DataInputStream dis=new DataInputStream(is);
                        a=dis.readUTF();
                        System.out.println(a);
                        Socket s2=miServidor.accept();
                        InputStream is2=s2.getInputStream();
                        DataInputStream dis2=new DataInputStream(is2);
                        b=dis2.readUTF();
                        System.out.println();
                        x=Integer.parseInt(a);
                        y=Integer.parseInt(b);
                        sum=x+y;
                        Socket sc=new Socket("localhost",5000);
                        OutputStream os=sc.getOutputStream();
                        DataOutputStream dos= new DataOutputStream(os);
                        dos.writeUTF("La suma total es;  "+sum);
                        
                        Socket sc1=new Socket("localhost", 5000);
                        OutputStream os1=sc1.getOutputStream();
                       DataOutputStream dos1=new DataOutputStream(os1);
                        dos1.writeUTF((""+sum));
        
                        miCliente.close();
                        
		}
			System.out.println("Demasiados clientes por hoy");
		} catch( Exception e ) {
			System.out.println( e.getMessage() );
		}
		}
		public static void main( String[] arg ) {
		new Servidor();
		}
} 
