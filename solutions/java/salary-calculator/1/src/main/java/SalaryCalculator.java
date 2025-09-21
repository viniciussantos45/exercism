public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (double) (daysSkipped < 5 ? 1 : 1 - 15/100.0);
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return (double) this.bonusMultiplier(productsSold) * productsSold; 
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double total = 1000 * this.salaryMultiplier(daysSkipped) + this.bonusForProductsSold(productsSold);

        return total > 2000 ? 2000: total;
    } 
}
