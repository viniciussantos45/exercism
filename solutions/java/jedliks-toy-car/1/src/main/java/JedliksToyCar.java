public class JedliksToyCar {
    private Integer battery = 100;
    private Integer drivenMeters = 0;
    
    private boolean getBatteryIsEmpty (){
        if(this.battery <= 0) {
            return true;
        }

        return false;
    }

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + this.drivenMeters.toString() + " meters";
    }

    public String batteryDisplay() {
        if(this.getBatteryIsEmpty()) {
            return "Battery empty";
        }
        
        return "Battery at " + this.battery.toString() + "%";
    }

    public void drive() {
        if(!this.getBatteryIsEmpty()){
            this.battery -= 1;
            this.drivenMeters += 20;
        }
    }
}
