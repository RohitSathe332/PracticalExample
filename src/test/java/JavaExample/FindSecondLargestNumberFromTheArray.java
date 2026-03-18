package JavaExample;

public class FindSecondLargestNumberFromTheArray {
public static void main(String[] args) {
	int[] arr= {1,2};
	int largest=arr[0];
	int seclargest=arr[1];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest){
			seclargest=largest;
			largest=arr[i];
		}else if(arr[i]>seclargest && arr[i] != largest) {
			seclargest=arr[i];
		}
	}
	System.out.println("second Largest Number is "+seclargest);
}
}
