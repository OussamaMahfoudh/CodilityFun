package solutions;

public class TapeEquilibrium {
  public static void main(String[] args) {
    
  }
  private static int solution(int[] A) {
    int minDiff = A[0];
    int currentSum = A[0];
    int lastSum = A[0];
    for (int i = 1; i < A.length; i++) {
      currentSum += A[i];
      if (currentSum - lastSum < minDiff) {
        minDiff = currentSum - lastSum;
      }
      lastSum = currentSum;
    }
    return minDiff;
  }
}
