package Week1;

public class TwoSums {

  public int[] twoSum(int[] nums, int target) {
    int firstIndexToReturn = -1;
    int secondIndexToReturn = -1;
    boolean isFound = false;

    for (int firstIndex = 0; firstIndex < nums.length; firstIndex++) {
      for (int secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex++) {
        if (nums[firstIndex] + nums[secondIndex] == target) {
          firstIndexToReturn = firstIndex;
          secondIndexToReturn = secondIndex;
          isFound = true;
          break;
        }
      }

      if (isFound) {
        break;
      }
    }

    int[] answer = new int[]{-1, -1};

    if (isFound) {
      answer = new int[]{firstIndexToReturn, secondIndexToReturn};
    }

    return answer;
  }
}
