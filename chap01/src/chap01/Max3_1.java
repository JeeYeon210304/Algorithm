package chap01;

import java.util.Scanner;

public class Max3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * ������(concatenation)���� : ���������� ��������(���μ���)�� ����Ǵ� ����.
		 * ����(selection)���� : () �� ���� �򰡰���� ���� ���α׷��� �����帧�� �����ϴ� if��.
		 */
		System.out.println("�� ������ �ִ��� ���մϴ�.");
		System.out.println("a�� �� : "); int a = sc.nextInt();
		System.out.println("b�� �� : "); int b = sc.nextInt();
		System.out.println("c�� �� : "); int c = sc.nextInt();
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("�ִ��� " + max + "�Դϴ�.");
	}
}
