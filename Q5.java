import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5 {
    public static List<List<Integer>> findArrayQuadruplet(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
                break;

            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target)
                continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                if ((long) nums[j] + nums[j + 1] + nums[j + 2] > target - nums[i])
                    break;

                if ((long) nums[j] + nums[n - 2] + nums[n - 1] < target - nums[i])
                    continue;

                int tempTarget = target - (nums[i] + nums[j]);

                int front = j + 1;
                int back = n - 1;

                while (front < back) {
                    int curSum = nums[front] + nums[back];

                    if (curSum == tempTarget) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[front], nums[back]));
                        front++;
                        back--;
                        while (front < back && nums[front] == nums[front - 1])
                            front++;
                        while (front < back && nums[back] == nums[back + 1])
                            back--;
                    } else if (curSum < tempTarget) {
                        front++;
                    } else {
                        back--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int target = 20;
        List<List<Integer>> a = findArrayQuadruplet(arr, target);
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++)
                System.out.print(a.get(i).get(j) + " ");
            System.out.println();
        }
    }
}
