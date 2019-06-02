import java.util.InputMismatchException;
import java.util.Scanner;
public class TicketVendingMachine {
	static int choose_option;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int adultResult = 0;
		int childResult = 0;
		int youthResult = 0;
		int result = 0;
		int count_ticket;
		boolean flag = true;
		while(flag) {
			while(true) {
				try {
					System.out.println("Ƽ���� ������ ���ʽÿ�.");
					System.out.println("0.����");
					System.out.println("1.����");
					System.out.println("2.û�ҳ�");
					System.out.println("3.����");
					System.out.println("4.�߱�");
					System.out.print(">>");
					choose_option = scanner.nextInt();
					if(0 <= choose_option && choose_option <= 4)
						break;
					else
						System.out.println("�ٽ� �Է����ּ���!");
					} catch (InputMismatchException e) {
						scanner = new Scanner(System.in);
						System.out.println("�ٽ� �Է����ּ���!");
					}
			}
			if(choose_option == 0) {
				adultResult = 0;
				childResult = 0;
				youthResult = 0;
				System.out.println("������ �Ǿ����ϴ�.");
			}else if(choose_option == 1) {
				while(true) {
					try {
						System.out.print("�ʿ��� ����� �Է����ֽʽÿ�.>>");
						count_ticket = scanner.nextInt();
							if(count_ticket > 0) {
								adultResult = 20000 * count_ticket;
								break;
							}else
								System.out.println("�ٽ� �Է����ּ���!");
					} catch (InputMismatchException e) {
						scanner = new Scanner(System.in);
						System.out.println("�ٽ� �Է����ּ���!");
					}
				}
				}else if(choose_option == 2) {
					while(true) {
						try {
							System.out.print("�ʿ��� ����� �Է����ֽʽÿ�.>>");
							count_ticket = scanner.nextInt();
								if(count_ticket > 0) {
									youthResult = 9000 * count_ticket;
									break;
								}else
									System.out.println("�ٽ� �Է����ּ���!");
						} catch (InputMismatchException e) {
							scanner = new Scanner(System.in);
							System.out.println("�ٽ� �Է����ּ���!");
						}
					}
				}else if(choose_option == 3) {
					while(true) {
						try {
							System.out.print("�ʿ��� ����� �Է����ֽʽÿ�.>>");
							count_ticket = scanner.nextInt();
								if(count_ticket > 0) {
									childResult = 4000 * count_ticket;
									break;
								}else
									System.out.println("�ٽ� �Է����ּ���!");
						} catch (InputMismatchException e) {
							scanner = new Scanner(System.in);
							System.out.println("�ٽ� �Է����ּ���!");
						}
					}
				}else if(choose_option == 4) {
					result += adultResult;
					result += youthResult;
					result += childResult;
					System.out.println("�հ�ݾ��� "+result+"���Դϴ�.");
					flag = false;
				}
				else {
					System.out.println("�ٽ� �Է����ּ���!");
				}
		}
		scanner.close();
	}
}