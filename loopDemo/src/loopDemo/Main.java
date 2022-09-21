package loopDemo;

public class Main {

	public static void main(String[] args) {
//FOR
		
		//int i=1 sayaç tanımı
		//i<10 şart
		//i++ kaçar kaçar artacağını gösterir
		//i 10 olana kadar döngüye girmeye devam eder
		//+=2 iki arttırır
		
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("for döngüsü bitti");	

//WHILE - şart döngüye uymazsa döngüye girmez 
		
		int i=1;
		while(i<10){
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("while döngüsü bitti");
		
//DO-WHILE LOOP - şart uymasa bile bir kez çalışır
		int j =100;
		do {
				System.out.println(j);
				j+=2;
		}while(j<10);
		System.out.println("do-while döngüsü bitti");
		
		}
	

	}

