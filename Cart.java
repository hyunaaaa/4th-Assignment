import java.util.ArrayList;
class Cart { //장바구니 클래스
	ArrayList<Item> list = new ArrayList<Item>();
	void additem(String name, int num, int unitPrice){
		list.add(new Item(name, num, unitPrice));
	}
	void removeItem(int index){
		list.remove(index);
	}
	int getItemNum(){
		return list.size();
	}
	Item getItem(int index){
		return list.get(index);
	}
	int getTotalPrice(){
		int total = 0;
		for(Item item : list)
			total += item.getPrice();
		return total;
	}
	void changeItemNumber(int index, int num){
		Item item = list.get(index);
		item.num = num;
	}
	class Item{//상품 항목 클래스
		int unitPrice
		;int num;
		String name;
		
		Item(String name, int num, int unitPrice){
			this.name = name;
			this.num = num;
			this.unitPrice = unitPrice;
		}
		int getPrice(){
			return num*unitPrice;
		}
		
	}
}
