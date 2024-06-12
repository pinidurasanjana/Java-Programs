public class Rectangle {
    int A;
    int B;
    public Rectangle(){
        A = 5;
        B = 2;
    }
    public Rectangle(int A,int B){
        this.A = A;
        this.B = B;
    }
    public int getarea(){
        return A*B;
    }
    public int getparameter(){
        return  2*(A+B);
    }
}
