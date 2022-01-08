package tekschoolsessionfirst;

public class AveSumMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []numbers = {1,5,478,1,58,1,85,12,87,3,685,12,871,2,8721,5,6};
		
		int count=numbers.length;
		int sum=0;
		int min=numbers[1];
		int max=numbers[1];
		double ave =0;
		
		
		for(int i=0; i<numbers.length; i++) {
			//to find sum
			sum= sum+numbers[i];
			
			//to find min
			if (numbers [i] < min ) {
			min = numbers[i];
			
			}else if (numbers[i]> max) {
				max=(numbers[i]);}
			
			ave= sum/count;
			}System.out.println("-----------");
			System.out.println("count:"+ numbers.length);
			System.out.println("sum:"+ sum);
			System.out.println("min:" + min);
			System.out.println("max:"+ max);
			System.out.println("ave:"+ ave);
			System.out.println("------------");
			
		
	
			}
			}


