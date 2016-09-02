package 宠物的抽象类;
abstract class pets{
public void weight(){
		System.out.println("宠物的体重:40kg");
	}
public void color(){
		System.out.println("宠物的颜色:七彩的");
	}
public abstract void act();
public void print() {
	// TODO Auto-generated method stub
	
}
	
}
class cat extends pets{

	@Override
	public void act() {
		// TODO Auto-generated method stub
		this.weight();
		this.color();
		}
		public void print(){
			System.out.println("猫爬树");
		}
	}
	class dog extends pets{

		@Override
		public void act() {
			// TODO Auto-generated method stub
			this.weight();
			this.color();
		}
		public void print(){
			System.out.println("狗游泳");
		}
}
public class test {
 public static void main(String args[]){
	 pets pet1=new cat();
	 pets pet2=new dog();
	 pet1.print();
	 pet2.print();
 }
	
}
