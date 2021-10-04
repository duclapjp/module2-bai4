public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST  =3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color  = "blue";

    public Fan() {
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }
    public boolean getOn(){
        return this.on;
    }
    public void setOn(){
        this.on =true;
    }
    public void setOff(){
        this.on = false;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public String toString(){
        if (this.getOn()){
          return   "tốc độ:"+this.speed+"màu:"+this.getColor()+"bán kính"+this.getRadius()+"fan is on";
        }else {
          return   "màu:"+this.getColor()+"bán kính"+this.getRadius()+"fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn();
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOff();

        System.out.println(fan1.toString());
        System.out.println(  fan2.toString());
    }
}
