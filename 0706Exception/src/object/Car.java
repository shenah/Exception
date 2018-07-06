package object;

public class Car {
	//모델명, 배기량, 가격을 저장할 변수
	private String modelName;
	private int displacement;
	private int price;
	
	//인스턴스 변수를 사용하기 위한 접근자 메소드 - getters & setters

	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getDisplacement() {
		return displacement;
	}
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", displacement=" + displacement + ", price=" + price + "]";
	}
	
	public boolean equals(Car other) {
		boolean result = false;
		//호출하는 인스턴스의 모델명과  매개변수의 모델명이 같으면 true.
		if(modelName.equals(other.modelName)) {
			result = true;
		}
		return result;
	}
}
