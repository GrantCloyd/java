public class Main {

    public static void main (String[] args){
        System.out.println(durationString.getDurationString(-5));
        System.out.println(durationString.getDurationString(500));
        System.out.println(durationString.getDurationString(50000));
        System.out.println(durationString.getDurationString(-10,500));
        System.out.println(durationString.getDurationString(10,500));
        System.out.println(durationString.getDurationString(5,3));
        System.out.println(durationString.getDurationString(100,50));
        System.out.println(durationString.getDurationString(1880,50));
    }

}
