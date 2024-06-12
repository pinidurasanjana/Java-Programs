public class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args){
        Person1 obj = new Person1("Pinidu",20);
        System.out.println("Name: "+ obj.getName);
        System.out.println("Age: "+obj.getAge);
    }
}