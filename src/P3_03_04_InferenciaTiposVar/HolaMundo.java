package P3_03_04_InferenciaTiposVar;

//Mi clase en Java
public class HolaMundo {
    //enseñar el moo debug para saber el tipo de variable que se infirió 
    public static void main(String args[]) {
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
    }
}
