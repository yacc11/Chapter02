package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods = new Goods();
		goods.name = "nikkon";
		goods.price = 20000;
		goods.countStock = 20;
		goods.countSold= 10;
		
		System.out.println(
				"이름 : "+goods.name
				+" \n가격 : "+goods.price 
				+"\n재고 : "+ goods.countStock
				+ "\n 판매 : "+ goods.countSold );
	}
}
