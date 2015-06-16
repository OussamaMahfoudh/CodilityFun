package counting_elements;

public class FrogRiverOne {
  public static void main(String[] args) {
      System.out.println(solution(5, new int[]{1,3,1,4,2,3,5,4}));
  }

  public static int solution(int X, int[] A) {
    boolean[] positionsFound = new boolean[X];
    for (int time = 0; time < A.length; time++) {
      if (!positionsFound[A[time] - 1]) {
        positionsFound[A[time] - 1] = true;
        X--;
      }
      if (X == 0) {
        return time;
      }
    }
    return -1;
  }
}
