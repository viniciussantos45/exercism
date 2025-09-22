
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = {0, 0, 0, 0, 0, 0, 0};

        int days = this.birdsPerDay.length;
        int daysIndexable = days - 1;
        
        int limitLoop = days >= 7? daysIndexable-6: daysIndexable;

        for(int i = daysIndexable; i >= limitLoop; i--) {
            lastWeek[i] = this.birdsPerDay[i];
        }
        return lastWeek;
    }

    public int getToday() {
        int [] lastWeek = this.getLastWeek();
        return lastWeek[lastWeek.length-1];
    }

    public void incrementTodaysCount() {
        int todayIncremented = this.getToday() +1;

        this.birdsPerDay[this.birdsPerDay.length-1]= todayIncremented;
    }

    public boolean hasDayWithoutBirds() {
        for(int count: this.birdsPerDay){
            if(count == 0) return true;
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;

        for(int i=0; i < numberOfDays; i++) {
            if(i < this.birdsPerDay.length) count += this.birdsPerDay[i];
        }

        return count;
    }

    public int getBusyDays() {
        int count = 0;

        for(int i=0; i < this.birdsPerDay.length - 1; i++) {
            if(this.birdsPerDay[i] >= 5) count += 1;
        }

        return count;
    }
}
