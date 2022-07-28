

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {

    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        System.out.println("Start");
        setStartTime(System.currentTimeMillis());
    }

    public void stop() {
        System.out.println("Stop");
        setEndTime(System.currentTimeMillis());
    }

    public long getElapsedTime() {
        return (getEndTime() - getStartTime());
    }
}
