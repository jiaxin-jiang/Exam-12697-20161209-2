package Exam_12697_20161209_2;

import java.util.Scanner;

public class Tax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入工资：");
		double salary = sc.nextDouble();
		double salaryOver = salary - 3500;
		double salary2 = salaryOver * 0.03;
		double salary3 = (salaryOver - 1500) * 0.1 + 1500 * 0.03;
		double salary4 = (salaryOver - 4500) * 0.2 + 3000 * 0.1 + 1500 * 0.03;
		double salary5 = (salaryOver - 9000) * 0.25 + 4000 * 0.25 + 3000 * 0.1
				+ 1500 * 0.03;
		double salary6 = (salaryOver - 35000) * 0.30 + 26000 * 0.25 + 4000
				* 0.25 + 3000 * 0.1 + 1500 * 0.03;
		double salary7 = (salaryOver - 55000) * 0.35 + 20000 * 0.3 + 26000
				* 0.25 + 4000 * 0.25 + 3000 * 0.1 + 1500 * 0.03;
		double salary8 = (salaryOver - 80000) * 0.45 + 25000 * 0.35 + 20000
				* 0.3 + 26000 * 0.25 + 4000 * 0.25 + 3000 * 0.1 + 1500 * 0.03;
		if (salaryOver <= 0) {
			System.out.println("所需要缴纳的税费为：" + 0);
		} else if (salaryOver <= 1500 && salaryOver > 0) {
			System.out.println("所需要缴纳的税费为：" + salary2);
		} else if (salaryOver <= 4500 && salaryOver > 1500) {
			System.out.println("所需要缴纳的税费为：" + salary3);
		} else if (salaryOver <= 9000 && salaryOver > 4500) {
			System.out.println("所需要缴纳的税费为：" + salary4);
		} else if (salaryOver <= 35000 && salaryOver > 9000) {
			System.out.println("所需要缴纳的税费为：" + salary5);
		} else if (salaryOver <= 55000 && salaryOver > 35000) {
			System.out.println("所需要缴纳的税费为：" + salary6);
		} else if (salaryOver <= 80000 && salaryOver > 55000) {
			System.out.println("所需要缴纳的税费为：" + salary7);
		} else {
			System.out.println("所需要缴纳的税费为：" + salary8);
		}
	}
}
