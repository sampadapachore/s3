
public class duplicatearray {
	public static void main(String[] args) {
		
		   int arr[]= {0,1,0,2,1,2,3,1,1};
		   int count=0;
			for(int i=0;i<=arr.length-1;i++) {//length
				for(int j=i+1;j<=arr.length-1;j++) {//compare
					if(arr[i]==arr[j]) {
						count++;
					}
				}
			}
			System.out.println(count);
			
			
			
			}

}
