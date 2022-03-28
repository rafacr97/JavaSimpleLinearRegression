import java.util.*;
/**
 * @author Rafael Camacho Roldán <za18012201@zapopan.tecmm.edu.mx>
 */
public class SLR{ 

    public static void main(String[] args){
        ArithmeticClass obj = new ArithmeticClass();
        Scanner in = new Scanner(System.in);
        Double predict;
        
        System.out.println("ŷ = β0 + β1x");
        System.out.println("ŷ = " + obj.Beta1() + " + " + obj.Beta1()+"*x");
        
        System.out.println("\nType 'x' value to predict ŷ value:");
        predict=in.nextDouble();
        System.out.println("\nPredict = "+ obj.predict(predict));
    }
    
}
