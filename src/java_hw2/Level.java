/*
 * ProjectName : Java Homework Project 2 - Umbrella
 * Name : ����� (uyu423@gmail.com)
 * Major : ��ǻ�Ͱ���
 * StdNum : 201021395
 * ================================================= *
 * ClassName : Level
 * ClassDescription : Umbrella Class�� ���� �ʵ� Level(��) ���� Ŭ���� 
 * DateTime : 2015. 04. 11 21:32
 * OS : Windows Embedded 8.1 Industry Pro (x64)
 * IDE : Eclipse Luna Service Release 2 (4.4.2)
 * Version : JavaSE-1.8
 */

package java_hw2;

/* Umbrella ��ü�� ���Ե� Level ��ü�� ���� */
public class Level {
	private int value;	//�� ���� ���� ������ �ʵ�

	/* �⺻ ������, �⺻ ���� 2��. */
	public Level() {
		this.setValue(2);
		return;
	}
	
	/* ������, value ���� 1~3�� ���� ó���Ѵ�. */
	public Level(int value) {
		if(value >= 1 && value <= 3) {
			this.setValue(value);
			return;
		}
		this.setValue(2);
	}

	/* value���� ���� ������ ��ȯ�ϴ� �޼ҵ� */
	public int retPrice() {
		if(this.value == 1 || this.value == 2)
			return 5000;
		else if(this.value == 3)
			return 6000;
		else	return -1;	//error handling
	}
	
	/* value���� String���� ��ȯ�ϴ� �޼ҵ� */
	@Override
	public String toString() {
		return String.valueOf(this.getValue());
	}
	
	/* ������, ������ ���� */
	public int getValue() { return value; }
	public void setValue(int value) { this.value = value; }
}
