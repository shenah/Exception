package object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1  = new Car();
		car1.setModelName("그랜져");
		car1.setDisplacement(2400);
		car1.setPrice(2200);
		
		//toString을 호출해서 출력 
		//디버깅을 빨리 하기위해 사용/값을 확인 하기 위해서 사용
		System.out.println(car1.toString());
		System.out.println(car1);
		
		Car car2 = new Car();
		car2.setModelName("그랜져");
		car2.setDisplacement(3000);
		car2.setPrice(2900);
		
		System.out.println(car1 == car2);
		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car2));

	}

}
