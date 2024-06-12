
public class Person {
    //attributes of a person
    //Attributes should be made private to avoid unathorized access
    private String personName;
    private int personAge;
    private double personHeight;

    Vehicle[] vehicles = new Vehicle[2];
    //Methods related to Person
    //Constructor Methods : Responsible for creating objects of the
    //class inside memory
    /*
    public Person(String newPName,int newPAge,double newPHeight)
    {
        personName=newPName;
        personAge=newPAge;
        personHeight=newPHeight;
    }
    */
    public Person(String personName,int personAge,double personHeight)
    {
        this.personName=personName;
        this.personAge=personAge;
        this.personHeight=personHeight;
    }

    //Default constructor
    public Person()
    {
        personName="Doe";
        personAge=25;
        personHeight=5.8;
    }

    //Getter Methods : Retrieve information from attributes
    public String getPersonName()
    {
        return personName;
    }
    public int getPersonAge()
    {
        return personAge;
    }
    public double getPersonHeight()
    {
        return personHeight;
    }


    //Setter Methods : Modify or update existing attribute values
    public void setPersonName(String newName){
        personName=newName;
    }
    public void setPersonAge(int newAge){
        personAge=newAge;
    }
    public void setPersonHeight(double newHeight){
        personHeight=newHeight;
    }

    //Operational Methods :Helps to manipulate existing attribute
    //information and get new data
    public void calculateBirthYear()
    {
        int BirthYear=2024-getPersonAge();
        //int BirthYear2=2024-age;
    }

    public void addVehicles(Vehicle newvehicle){
        for (int index = 0;index < vehicles.length;index++){
            if (vehicles[index]==null){
                vehicles[index] = newvehicle;
                System.out.println("Vehicle added successfully");
            } else if (index == vehicles.length - 1) {
                System.out.println("can't own any more vehicles");
            }
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }
}
