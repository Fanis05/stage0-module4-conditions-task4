package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first >=second) {
            if (first >= third) {
                System.out.println(first);
            }  System.out.println(third);
        }  {
            if (second >= third){
                System.out.println(second);
            }  {
                System.out.println(third);
            }
        }
    }
}
