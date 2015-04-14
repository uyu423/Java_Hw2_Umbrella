/*
 * ProjectName : Java Homework Project 2 - Umbrella
 * Name : ����� (uyu423@gmail.com)
 * Major : ��ǻ�Ͱ���
 * StdNum : 201021395
 * ================================================= *
 * ClassName : Frame
 * ClassDescription : Umbrella Class�� ���� �ʵ� Frame(��) ���� Ŭ���� 
 * DateTime : 2015. 04. 12 22:44
 * OS : Windows Embedded 8.1 Industry Pro (x64)
 * IDE : Eclipse Luna Service Release 2 (4.4.2)
 * Version : JavaSE-1.8
 */


package java_hw2;

/* Umbrella ��ü�� ���Ե� Frame ��ü�� ���� */
public class Frame {
	private int value;	//�� ������ ������ �ʵ�
	private double multiple;	//value�� ���� ���� ����� ����
	
	/* �⺻ ������. �⺻ ���� ����  6, 1.0�̴�. */
	public Frame() {
		this.setMultiple(1.0);
		this.setValue(6);
		return;
	}
	
	/* ������. value ���� 6, 8, 12�� ����  �����ڷ� ó���Ѵ�.*/
	public Frame(int value) {
		if(value == 6 || value == 8 || value == 12)
			this.value = value;
		else	
			this.value = 6;
		this.calcMultiple();	//����� ����ϴ� �޼ҵ� ȣ��
		return;
	}
	
	/* ����� ����ϴ� �޼ҵ� */
	private void calcMultiple() {
		switch(this.value) {
			case 6:
				this.setMultiple(1.0);
				break;
			case 8:
				this.setMultiple(1.1);
				break;
			case 12:
				this.setMultiple(1.15);
				break;
			//value error handling
			default:
				this.setMultiple(-1);
		}
	}
	
	/* getMultiple() ���� �޼ҵ�, multiple ���� ��ȯ�Ѵ�. */
	public double retMultiple() {
		return this.getMultiple();
	}
	
	/* value ���� String���� ��� */
	@Override
	public String toString() {
		return String.valueOf(this.getValue());
	}
	
	/* ������ �� ������ ���� */
	public int getValue() { return this.value; }
	public void setValue(int value) { 
		this.value = value;
		this.calcMultiple();
	}
	public double getMultiple() { return this.multiple; }
	public void setMultiple(double multiple) { this.multiple = multiple; }
}
