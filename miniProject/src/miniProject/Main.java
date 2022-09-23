package miniProject;

public class Main {

	public static void main(String[] args) {
//asal sayı hesaplama
		int number =-4 ;
		int reminder= number %2;
		//System.out.println(reminder);
		boolean isPrime=true;
		
		if (number==1) {
			System.out.println("Asal sayı değildir");
		}
		if (number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i=2; i<number; i++);{
			if (number % 2 == 0){
				isPrime = false;
			}
			
		}
		if (isPrime){
			System.out.println("Sayı asaldır");
			}else{
				System.out.println("Sayı asal değildir");
			}
	}

}
