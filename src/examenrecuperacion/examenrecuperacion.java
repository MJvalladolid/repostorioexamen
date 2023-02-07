package examenrecuperacion;

import java.io.*;
public class inicioproyecto{
public static void main(String[] args) {
String comando;
System.out.println("Proyecto X");
System.out.println("---------------");
System.out.println("Seleccione comando de inicio...");
System.out.print("opción: ");
comando=lectura();
ejecutar(comando);
}
}
import java.io.*;
import java.util.*;
public class lectura{
public static String lectura() {
String cad="";
BufferedReader br;
br=new BufferedReader(new InputStreamReader(System.in));
try{
cad=br.readLine();
} catch (I0Exception e){
e.printStackTrace();
}
return cad;
}
}
