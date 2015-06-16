package counting_elements;

public class MissingInteger {
  public static void main(String[] args) {
    System.out.println(solution(new int[] {1, 3, 6, 4, 1, 2}));
  }

  public static int solution(int[] A) {
    int positiveCount = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] > 0)
        positiveCount++;
    }
    int[] B = new int[positiveCount];
    for (int i = 0; i < A.length; i++) {
      if (A[i] <= A.length && A[i] > 0) {
        B[A[i] - 1] = 1;
      }
    }
    int min = B.length + 1;
    for (int i = 0; i < B.length; i++) {
      if (B[i] == 0) {
        min = i + 1;
        break;
      }
    }
    return min;
  }
}
