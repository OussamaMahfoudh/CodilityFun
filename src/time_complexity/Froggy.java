package time_complexity;

public class Froggy {
  public static void main(String[] args) {
    System.out.println(solution(10, 85, 30));
  }
  public static int solution(int X, int Y, int D) {
    return (Y-X)/D + ((Y-X)%D > 0 ? 1 : 0);
  }
}
