package pilasmiercoles05;

import java.util.Stack;

/**
 *
 * @author Alumno
 */
public class Ejercicios {
    public void Problemauno(){
        Stack Juegos=new Stack();
        Juegos.push("Pes 2016");
        Juegos.push("Fifa 16");
        Juegos.push("ResidentEvil 4");
        Juegos.push("GTA V");
        Juegos.push("LOL");
        System.out.println("Juegos:"+Juegos);
    }
    public void Problemados(){
        Stack Notas=new Stack();
        Notas.push(5.5);
        Notas.push(3.0);
        Notas.push(4.8);
        Notas.push(7.0);
        Notas.push(6.4);  
        
        for(int a=0; a<Notas.size(); a++){
            System.out.println(Notas.get(a));
            
    }   
    }
    public void Problematres(){
        Stack paises=new Stack();
        paises.push("chile");
         paises.push("argentina");
         paises.push("brazil");
          paises.push("alemania");
           paises.push("francia");
           for(Object d:paises){
               
               System.out.println(d);
           
           }
        
    }
    public void Problemacuatro(){
        
        Stack Libros = new Stack();
        Libros.push("Divergente");
         Libros.push("papelucho");
          Libros.push("Exodo");
          
          while(Libros.empty()==false)
              System.out.println(Libros.pop());
          
          
        
        
    }
    
    
  
    
}
