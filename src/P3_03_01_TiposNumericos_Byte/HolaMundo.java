package P3_03_01_TiposNumericos_Byte;
/**
 *
 * @author Felipe Mendieta
 */
//Mi clase en Java
public class HolaMundo {

    public static void main(String args[]) {
        /*
                                      8   ,  16  , 32 , 64  : bits
            tipos primitivos enteros: byte, short, int, long
         */
        /* El tipo de dato que usaremos será el de 32 bits ya que la mayoría de arquitecturas 
        de los procesadores vienen de 64 y 32 bits.
        El tipo byte si puede ser utilizado, sin embargo esto no garatiza que se usen los 8 bytes 
        ya que posiblemente los 8 bytes e van a almacenar en los 32 bits que compone
        una palabra de una arquitectura de 32 bits.
        */
        //tener en cuenta los rangos de los tipos de datos
        byte numeroByte = (byte) 129;//que pasa si se va pasando, ¿qué hace el compilador?
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);

      
    }
}
