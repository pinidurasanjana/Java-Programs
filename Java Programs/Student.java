public class Student {
    private String name;
    private int id;

    public void Student_info(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void Student_info(){
        this.name = "sdds";
        this.id = 44;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}
