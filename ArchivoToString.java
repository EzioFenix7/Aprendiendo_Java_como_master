
/**
 * Este programa consiste básicamente en que mediante la entrada de un archivo ruta="texto.txt" 
 * que es posible configurar. Del archivo que se inroduce, se lee hasta que no exista elementos
 * en el archivo. Los caracteres que lee, los convierte en cadenas de carateres en un lista enlazada
 * por ejemplo si el archivo conteniera "paco,pedro,victor" , en la lista se almacenaria el primer 
 * elmento[0]="paco", elmento[1]="pedro",elemento[2]="victor". Por lista me riefo a "lista_numeros"
 * como se observa en el programa.
 * Puede emplearse este código para manejar datos almacenados en un archivo y pasarlos a cadenas 
 * de caracteres, pero debe cumplir dos condiciones el archivo:
 * los datos a leer deben empezar por un un caracter difrente a un salto o una coma.
 * LA divisón entre los datos a leer debe estar separados por una coma.
 * El ultimo elemento tiene que terminar en coma.
 * Si hay un espacio entre elementos , este se verá incluido en el dato almacenado en la lista.
 * ]
 * @version 1.0
 * @author EzioFenix7
 */

import java.io.*;
import java.util.*;

public class ArchivoToString 
{
    public static void main(String[] args) 
    {
        String ruta="texto.txt";
        LinkedList<String> lista_numeros = new LinkedList<>();

        FileInputStream archivo;
        BufferedReader buff;
        String lectura;
        String tmp="";
        char c;
        try 
        {
            archivo = new FileInputStream(ruta);    //entrada
            buff= new BufferedReader(new InputStreamReader(archivo));   //buffer
            while((lectura=buff.readLine())!=null)  //bloque
            {
                for (int i = 0; i < lectura.length(); i++)  //dividir en numeros
                {
                    c=lectura.charAt(i);
                    if( c== ',')
                    {
                        lista_numeros.add(tmp);
                        tmp="";
                    }
                    else
                    {
                        tmp=tmp+c;	
                    }   
                }
                System.out.println(lista_numeros);
                //------------------Ejecución del bloque
            }  
        }
        catch (IOException e)
        {
            System.out.println("Error archivoToString");
        }
        finally
        {
            System.out.println(lista_numeros);
        }

    }
    
}