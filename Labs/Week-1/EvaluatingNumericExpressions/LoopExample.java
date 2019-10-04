/**
 * Write a description of class LoopExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopExample
{
    public static void main(String[] args){
    int a = 4; 
    int b = 5;
    long c = 8;
    double d = 4.6;
    for (int i = 0; i <= args.length; i++){
        double result = args[i];
        
        System.out.println("Q-" + i + ": " + result);
    }
    
    
 }
}
