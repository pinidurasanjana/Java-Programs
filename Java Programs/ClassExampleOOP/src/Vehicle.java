public class Vehicle {
    private String vehicleModel;
    private int vehicleNo;

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public String getVehicleModel(){
        return vehicleModel;
    }
    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
    public int getVehicleNo(){
        return vehicleNo;
    }

    public void getVehicalData(String vehicleModel, int vehicleNo){
        this.vehicleModel = vehicleModel;
        this.vehicleNo = vehicleNo;
    }


}

