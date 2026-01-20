public class SmartHomeDevices {
    static class Device{
        int deviceId;
        String status;

        Device(int deviceId , String status){
            this.deviceId= deviceId;
            this.status=status;
        }
    }

    static class Thermostat extends Device{
        String temperatureSetting;

        Thermostat(int deviceId , String status,String temperatureSetting){
            super(deviceId ,status);
            this.temperatureSetting=temperatureSetting;
        }

        void displayStatus(){
            System.out.println(deviceId);
            System.out.println(status);
            System.out.println(temperatureSetting);
        }
    }
    public static void main(String[] args) {
        Thermostat t = new Thermostat(1, "gsge", "egg");
        t.displayStatus();
    }    
}
