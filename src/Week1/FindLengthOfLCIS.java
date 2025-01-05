package Week1;

public class FindLengthOfLCIS {
  public int findLengthOfLCIS(int[] nums) {

    int lcis = 1;
    int currentMax = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > nums[i - 1]) {
        currentMax++;

        if (currentMax > lcis) {
          lcis = currentMax;
        }
      } else {
        currentMax = 1;
      }
    }

    return lcis;
  }
}
