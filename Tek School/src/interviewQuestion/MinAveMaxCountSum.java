package interviewQuestion;

public class MinAveMaxCountSum {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 6, 3, 7, 33, 27, 86, 44, 32, 12 };
		System.out.println("Max Number:" + getMax(nums));
		System.out.println("Min Number:" + getMin(nums));
		System.out.println("sum Number:" + getSum(nums));
		System.out.println("Ave Number:" + getAve1(nums));
		System.out.println("Ave Number:" + getAve2(nums));
		System.out.println("SecondMax Number:" + secondMax(nums));
		System.out.println("SecondMin Number:" + secondMin(nums));
	}

	public static int getMax(int[] nums) {
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i])
				max = nums[i];

		}
		return max;
	}

	public static int getMin(int[] nums) {
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (min > nums[i])
				min = nums[i];

		}
		return min;
	}

	public static int getSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {

			sum += nums[i];
		}

		return sum;
	}

	public static double getAve1(int[] nums) {
		getSum(nums);
		int count = nums.length;
		double ave = (double) getSum(nums) / count;
		return ave;

	}

	public static double getAve2(int[] nums) {// we add (double) because int/int return int we have to
		// make one of them double to get double result
		return (double) getSum(nums) / nums.length;

	}// find the secondmax number or second largest

	public static int secondMax(int[] nums) {
		int secondMax = nums[0];
		int max = getMax(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > secondMax && nums[i] < max) {
				secondMax = nums[i];
			}

		}
		return secondMax;

	}

	public static int secondMin(int[] nums) {
		int secondMin = Integer.MAX_VALUE;
		int min = getMin(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < secondMin && nums[i] > min) {
				secondMin = nums[i];
			}

		}
		return secondMin;

	}
}
