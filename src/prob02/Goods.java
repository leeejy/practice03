package prob02;

public class Goods {
	private String name;
	private int price;
	private int sold;
	
	Goods(){
		
	}
	Goods(String name, int price, int sold){
		this.name=name;
		this.price=price;
		this.sold=sold;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	
	public void show(){
		System.out.println(name+"(가격 : "+price +"원이 "+sold+"개) 입고 되었습니다.");
	}
}
