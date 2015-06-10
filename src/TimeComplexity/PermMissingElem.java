package TimeComplexity;

public class PermMissingElem {
  public static void main(String[] args) {
    System.out.println(solution(new int[] {2, 3, 1, 5}));
  }

  private static int solution(int[] A) {
    final int N = A.length;
    int lostNumber = N+1;
    for (int i = 0; i < N; i++) {
      lostNumber += (i+1);
      lostNumber -= A[i];
    }
    return lostNumber;
  }
}
