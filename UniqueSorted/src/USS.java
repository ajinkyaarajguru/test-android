public class USS {

	public static void main(String[] args) {

		System.out.println("Final result " + checkNumber(45623));
	}

	public static boolean checkNumber(int number) {

		boolean flag=true;
		StringBuffer b = new StringBuffer();
		b.append(number);
		System.out.println(b);
		for (int i = 0; i < b.length()-1; i++) {
			if (Integer.parseInt(String.valueOf(b.charAt(i))) > Integer.parseInt(String.valueOf(b.charAt(i + 1)))) {
				flag = false;
			}
		}

		return flag;

	}
}
/*
 * int count = 0; int [] a = new int[9];
 * 
 * while (number >= 10) { a[count++]=number%10; number=number/10;
 * 
 * }
 * 
 * disp(a, count);
 * 
 * int j=count;
 * 
 * for(int i=0;i<j;i++){
 * 
 * int temp=a[j]; a[j]=a[i]; a[i]=temp; }
 * 
 * int[] b=a; Arrays.sort(a);
 * 
 * disp(a, count); disp(b, count);
 * 
 * 
 * return a.equals(b); }
 * 
 * public static void disp(int [] a,int count) { for(int i=0;i<=count;i++){
 * System.out.println(a[i]); } }
 */
