/*
 * ProjectName : Java Homework Project 2 - Umbrella
 * Name : ����� (uyu423@gmail.com)
 * Major : ��ǻ�Ͱ���
 * StdNum : 201021395
 * ================================================= *
 * ClassName : Sal
 * ClassDescription : ���� Ŭ���� ����
 * DateTime : 2015. 04. 12 23:03
 * OS : Windows Embedded 8.1 Industry Pro (x64)
 * IDE : Eclipse Luna Service Release 2 (4.4.2)
 * Version : JavaSE-1.8
 */

package java_hw2;

//���� Ŭ���� �� ���� �޼ҵ�
public class J_Hw2 {
	public static void main(String[] args) {
		Umbrella u1 = new Umbrella(1, false, 6, "Happy");
		Umbrella u2 = new Umbrella(2, false, 6, "Love");
		Umbrella u3 = new Umbrella(3, false, 6, "Macchiato");
		Umbrella u4 = new Umbrella(1, true, 6, "Happy");
		Umbrella u5 = new Umbrella(2, true, 8, "Love");
		Umbrella u6 = new Umbrella(3, true, 8, "Fine day");
		Umbrella u7 = new Umbrella(2, true, 12, "Happy");
		Umbrella u8 = new Umbrella(3, true, 12, "Love");
		Umbrella u9 = new Umbrella(1, false, 6, null);	//null�� ���ڿ��� ���� ���̴�.
		u1.showInfoUm();
		u2.showInfoUm();
		u3.showInfoUm();
		u4.showInfoUm();
		u5.showInfoUm();
		u6.showInfoUm();
		u7.showInfoUm();
		u8.showInfoUm();
		u9.showInfoUm();
		u8.setIsFrame(6);	//u8 �ν��Ͻ��� Frame��ü value�� ����
		u8.showInfoUm();
	}
}
