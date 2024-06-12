public class methodnew{
    static double myPower(double number,int powerof){
        if (powerof==0){
            return 1;
        }
        else {
            return number * myPower(number,powerof-1);
        }
    }
    public static void main(String[] args){
        double result = myPower(2,30);
        System.out.println(result);
    }
}