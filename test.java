package ����ĳ�����;
abstract class pets{
public void weight(){
		System.out.println("���������:40kg");
	}
public void color(){
		System.out.println("�������ɫ:�߲ʵ�");
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
			System.out.println("è����");
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
			System.out.println("����Ӿ");
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
