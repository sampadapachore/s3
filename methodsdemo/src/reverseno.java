
public class reverseno {
	public static void main(String[] args) {
		int num=123456;
		int i=0;
		int j=0;
		int r=0;
/*while(num!=0){//******************reverse number****************		{
			
		    r=r*10+num%10;		//num=6,5,4,3,2,1   
		    num=num/10;//
		    	
		}
		
System.out.println("Reverse num"+ r);

	
		while(num>0) {//sum of nos
			i=num%10;
			j=j+i;
			num=num/10;
		}
		System.out.println("sum of digits " +  j);*/
		while(num>0) {
			num=num/10;
			i++;
		}
		System.out.println("count of digits " +i);
		
		}
}
	


