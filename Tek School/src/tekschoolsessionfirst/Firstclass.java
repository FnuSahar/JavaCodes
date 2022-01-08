package tekschoolsessionfirst;

public class Firstclass {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade []={43,54,23,65};
		
		
		int count =grade.length;
		int min=grade[3];
		int max=grade[1];
		int sum=0;
		double ave=0;
		
		for(int i=0; i<grade.length; i++) {
			sum= sum + grade[i];
		
		if (grade[i]<min) {
			min= grade[i];
		}else if(grade[i]>max)
			max= grade[i];
		
			ave=sum/count;
		}System.out.println("-----------");
		System.out.println("count:"+ grade.length);
		System.out.println("sum:"+ sum);
		System.out.println("min:" + min);
		System.out.println("max:"+ max);
		System.out.println("ave:"+ ave);
		
		}
	}

		
		
		
		
		
		
		
    			
    			
    			
    			
    	
    			
    	
	

