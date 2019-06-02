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
					System.out.println("티켓의 종류를 고르십시오.");
					System.out.println("0.리셋");
					System.out.println("1.성인");
					System.out.println("2.청소년");
					System.out.println("3.유아");
					System.out.println("4.발권");
					System.out.print(">>");
					choose_option = scanner.nextInt();
					if(0 <= choose_option && choose_option <= 4)
						break;
					else
						System.out.println("다시 입력해주세요!");
					} catch (InputMismatchException e) {
						scanner = new Scanner(System.in);
						System.out.println("다시 입력해주세요!");
					}
			}
			if(choose_option == 0) {
				adultResult = 0;
				childResult = 0;
				youthResult = 0;
				System.out.println("리셋이 되었습니다.");
			}else if(choose_option == 1) {
				while(true) {
					try {
						System.out.print("필요한 장수를 입력해주십시오.>>");
						count_ticket = scanner.nextInt();
							if(count_ticket > 0) {
								adultResult = 20000 * count_ticket;
								break;
							}else
								System.out.println("다시 입력해주세요!");
					} catch (InputMismatchException e) {
						scanner = new Scanner(System.in);
						System.out.println("다시 입력해주세요!");
					}
				}
				}else if(choose_option == 2) {
					while(true) {
						try {
							System.out.print("필요한 장수를 입력해주십시오.>>");
							count_ticket = scanner.nextInt();
								if(count_ticket > 0) {
									youthResult = 9000 * count_ticket;
									break;
								}else
									System.out.println("다시 입력해주세요!");
						} catch (InputMismatchException e) {
							scanner = new Scanner(System.in);
							System.out.println("다시 입력해주세요!");
						}
					}
				}else if(choose_option == 3) {
					while(true) {
						try {
							System.out.print("필요한 장수를 입력해주십시오.>>");
							count_ticket = scanner.nextInt();
								if(count_ticket > 0) {
									childResult = 4000 * count_ticket;
									break;
								}else
									System.out.println("다시 입력해주세요!");
						} catch (InputMismatchException e) {
							scanner = new Scanner(System.in);
							System.out.println("다시 입력해주세요!");
						}
					}
				}else if(choose_option == 4) {
					result += adultResult;
					result += youthResult;
					result += childResult;
					System.out.println("합계금액은 "+result+"원입니다.");
					flag = false;
				}
				else {
					System.out.println("다시 입력해주세요!");
				}
		}
		scanner.close();
	}
}