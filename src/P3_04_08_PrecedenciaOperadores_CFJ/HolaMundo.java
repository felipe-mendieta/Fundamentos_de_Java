package P3_04_08_PrecedenciaOperadores_CFJ;


//Mi clase en Java
public class HolaMundo {
    
    public static void main(String args[]) {
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;//4 + ((5*6)/3)
        System.out.println("resultado = " + resultado);//14
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
    }
}
