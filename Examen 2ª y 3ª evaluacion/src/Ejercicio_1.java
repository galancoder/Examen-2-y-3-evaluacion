import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio_1 {
	
	


	 public static void main(String [] arg) {
	   
		  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      String[] partes=null;
	      String linea_aux=null;
	      
	      List<String> coleccion_nombres_compuestos= new ArrayList<String>();
	      
	      Set<String> coleccion_elementos= new TreeSet<String>();
	      
	      String nombre_compuesto=null;
	      String[] elementos=null;
	      
	      try {
	         //LEO EL FICHERO CON LA ESTRUCTURA DETERMINADA
	         archivo = new File ("C:\\quimicos.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         String linea;
	         //LEO CADA LINEA Y PARTO LA CADENA CON : PARA EXTRAER EL NOMBRE Y LOS COMPONENETES
	         //A SU VEZ PARTO LOS COMPONENTES Y LOS ALMACENO EN UN ARRAY
	         while((linea=br.readLine())!=null) {
	        	 
	        	linea_aux = linea;
	        	partes = linea_aux.split(":");
	        	nombre_compuesto=partes[0];
	        	elementos=partes[1].trim().split(" ");
	        	
	        	coleccion_nombres_compuestos.add(nombre_compuesto);
	        	
	        	for(int i=0;i<elementos.length;i++) {
	        		
	        		coleccion_elementos.add(elementos[i]);
	        		
	        	}
	  
	        	//System.out.println(nombre_compuesto);
	        	//System.out.println(Arrays.toString(elementos));
	         }
	         
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	        
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
		 //ITERO DE TRES FORMAS DIFERENTES SOBRE LA COLECCION DE LOS NOMBRES DE LOS COMPUESTOS
	      
	      //FOR EACH
	      System.out.println("RECORRIENDO CON FOR EACH");
	      coleccion_nombres_compuestos.forEach(numero -> System.out.print(numero +" - "));
	      System.out.println("");
	      //ITERATOR
	      System.out.println("");
	      System.out.println("RECORRIENDO CON ITERATOR");
	      ListIterator<String> i = coleccion_nombres_compuestos.listIterator();
	      while (i.hasNext()) {
	    	  String nombre = i.next();
	    	  System.out.println(nombre);
	    	  }
	      System.out.println("");
	      //BUCLE FOR
	      System.out.println("RECORRIENDO CON FOR");
	     for (String nombre : coleccion_nombres_compuestos) {
	    	  
	    	  System.out.println(nombre);
	    	 }
	      
	
	     System.out.println("");
	//COLECCION DE ELEMENTOS SIN REPETIR CON UN TREESET
	     
	     System.out.println("COLECCION DE ELEMENTOS");
	    for (String nombre : coleccion_elementos) {
	    	  
	    	  System.out.print(nombre+"-");
	    	 }
	      
	   }
	 

	  

	
}
