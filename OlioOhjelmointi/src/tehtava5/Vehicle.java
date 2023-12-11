package tehtava5;

    public class Vehicle {
        private float price;
        private String color;
        private int maxSpeed;
        private int speed;
        
        public float getPrice() {
            return price;
        }
        public void setPrice(float price) {
            this.price = price;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public int getMaxSpeed() {
            return maxSpeed;
        }
        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }
    
    public void accelerate(int amount){
        speed = speed + amount;
    }

    public void slowDown(int amount){
        speed = speed - amount;
    }
}

