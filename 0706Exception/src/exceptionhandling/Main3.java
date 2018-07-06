package exceptionhandling;

public class Main3 {

	public static void main(String[] args){
		//java.lang.thread 라는 클래스에는 sleep 이라는 메소드가 
		//있는데 이 메소드는 매개변수로 대입된 시간만큼 실행을 중지 시키는 
		//역할을 합니다. 이 메소드를 이용해서 1~10까지 1초씩 쉬면서 출력
		/*for(int i=1;i<11;i=i+1)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}*/
		//"image0.png", "image1.png", "image2.png" 를 1분간격으로 무한반복해서 출력
		/*int idx = 0;
		for(;;)
		{
			System.out.println("image" + (idx%3) + ".png");
			idx = idx + 1;	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}*/
		
		String [] ar = {"김기태", "박승현", "최향", "이승범"};
		int size = ar.length;
		int idx = 0;
		try {
		
			while(true) {
				System.out.println(ar[idx%size]);
				idx = idx + 1;
				Thread.sleep(1000);
			}
		}			
			catch(InterruptedException e) {
				e.printStackTrace();
			}

		


  }

}
