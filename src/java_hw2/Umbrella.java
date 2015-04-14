/*
 * ProjectName : Java Homework Project 2 - Umbrella
 * Name : ����� (uyu423@gmail.com)
 * Major : ��ǻ�Ͱ���
 * StdNum : 201021395
 * ================================================= *
 * ClassName : Umbrella
 * ClassDescription : ��� ��ü�� ǥ���� Umbrella ���� Ŭ���� 
 * DateTime : 2015. 04. 10 17:29
 * OS : Windows Embedded 8.1 Industry Pro (x64)
 * IDE : Eclipse Luna Service Release 2 (4.4.2)
 * Version : JavaSE-1.8
 */

package java_hw2;

/* ������ ������ ������ Level(��), Frame(��)�� ��ü�� ���� */
public class Umbrella {
	private Level level;	//�� �ʵ�
	private Frame frame;	//�� �ʵ�
	private boolean auto;	//�ڵ���� ��/�� �ʵ�
	private String str;		//���ڿ� �ʵ�
	private int price;		//���� ���� �ʵ�
	
	//Constructor Example :
	//Umbrella u1 = new Umbrella(1, false, 6, "Happy");
	public Umbrella() {};	//�⺻ ������
	
	/* Umbrella ��ü ������, ������ ������ ������. */
	public Umbrella(int level, boolean auto, int frame, String str) {
		this.level = new Level(level);	//level �ʵ带 level �Ķ���͸� ����� Level ��ü�� ����
		this.frame = new Frame(frame);	//frame �ʵ带 frame �Ƕ���͸� ����� Frame ��ü�� ����
		this.auto = auto;	//auto �ʱ�ȭ
		this.str = str;		//str �ʱ�ȭ
		this.calcPrice();	//���� ��� �޼ҵ�(calcPrice()) ȣ��
	}
	
	/* price �ʵ� ���� ����ϴ� �޼ҵ�, ������ �ʵ忡 ��ȭ�� ���� �� ���� ȣ��ȴ�. */
	private void calcPrice() {
		int price = 0;
		if(this.isAuto())	price += 2000;
		if(this.getStr() != null)	price += 2000;	
		price += level.retPrice();
		price *= frame.retMultiple();
		this.setPrice(price);
	}
	
	//Print Method Example :
	//u1.showInfoUm();
	//2�� �ڵ����
	//(��� ����: 12)
	//���� ����: Happy
	//����: 10350
	public void showInfoUm() {
		System.out.println(this.makeInfoStr());
		return;
	}
	
	/* ȭ�鿡 ����� ���ڿ��� �����ϴ� �޼ҵ� */
	public String makeInfoStr() {
		String output = level.toString() + "��";
		if(this.isAuto()) {
			output += " �ڵ�";
		} output += " ���\n";
		output += "(��� ����: " + frame.toString() + ")\n";
		if(this.getStr() != null) {
			output += "���� ���� : " + this.getStr() + "\n";
		}
		output += "���� : " + this.getPrice() + "\n";
		
		return output;
	}
	
	/* getter, setter ����, setter�� ��� ����� �� ���� clacPrice()�Լ��� ȣ���Ѵ�.  */
	public void setIsLevel(int dan) { 
		this.level.setValue(dan);
		this.calcPrice();
	}
	public void setIsFrame(int sal) { 
		this.frame.setValue(sal);
		this.calcPrice();
	}
	public void setAuto(boolean auto) { 
		this.auto = auto;
		this.calcPrice();
	}
	public void setStr(String str) { 
		this.str = str;
		this.calcPrice();
	}
	public void setPrice(int price) { this.price = price; }
	
	public String getIsLevel() { return this.level.toString(); }
	public String getIsFrame() { return this.frame.toString(); }
	public boolean isAuto() { return this.auto; }
	public String getStr() { return this.str; }
	public int getPrice() { return price; }
}
