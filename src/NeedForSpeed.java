class NeedForSpeed {
    private int distance = 0;
    private int battery = 100;
    private int speed;
    private int batteryDrain;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (this.battery == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(this.batteryDrained() == false){
            this.distance += this.speed;
            this.battery = this.battery - this.batteryDrain;
        }
    }


}

