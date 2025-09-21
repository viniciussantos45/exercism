public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        var percentage = 100;
        
        if (speed >= 5 && speed <= 8) {
            percentage = 90;
        }else if(speed == 9) {
            percentage = 80;
        }else if (speed >= 10) {
            percentage = 77;
        }

        return percentage/100.00 * 221 * speed;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (this.productionRatePerHour(speed)/60);
    }
}
