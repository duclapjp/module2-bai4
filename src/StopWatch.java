public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
        this.startTime = 0;
        this.endTime = 0;
    }
    public long start(){
      return   this.startTime = System.currentTimeMillis();
    }
    public long stop(){
       return   this.endTime =System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }

    public static void main(String[] args) {

    }

}
