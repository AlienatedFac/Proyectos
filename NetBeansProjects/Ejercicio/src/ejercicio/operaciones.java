/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author ferna
 */
public class operaciones {
     public double generalf (double a,double b,double c)
    {
        
     double res;
       
      res= (-b + Math.sqrt( (b*b) - (4*a*c)))/(2*a);
       
        return res;
        
    
    
    }
       public double generalfe (double a,double b,double c)
    {
        
     double res;
       
      res= (-b - Math.sqrt( (b*b) - (4*a*c)))/(2*a);
       
        return res;
        
    
            
}}

