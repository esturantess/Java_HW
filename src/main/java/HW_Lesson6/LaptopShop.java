package HW_Lesson6;

import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class LaptopShop {
    public void shopInit(Set<Laptop> laptops) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(Laptop.class.getName());
        logger.info("����� ���������� � ������� ���������! ��� ������ ���������� � ������� � ������� �������: 0 - ��� ������; 1 - ���������� �� �����; 2 - ���������� �� ������.");
        int userInput = scanner.nextInt();
        if (userInput == 0) {
            System.out.println(laptops);
        }
        if (userInput == 1) {
            logger.info("������� �����, ��������������� �����: BLACK - 1, WHITE - 2, GRAY - 3, PINK - 4, RED - 5, GOLD - 6, SILVER - 7");
            int number_of_color = scanner.nextInt();
            if (number_of_color == 1) {
                for (Laptop el : laptops) {
                    if (el.getColor() == Color.BLACK) System.out.println(el);
                }
            }
            if (number_of_color == 2) {
                for (Laptop el : laptops) {
                    if (el.getColor() == Color.WHITE) System.out.println(el);
                }
            }
            if (number_of_color == 3) {
                for (Laptop el : laptops) {
                    if (el.getColor() == Color.GRAY) System.out.println(el);
                }
            }
            if (number_of_color == 4) {
                for (Laptop el : laptops) {
                    if (el.getColor() == Color.PINK) System.out.println(el);
                }
            }
            if (number_of_color == 5) {
                for (Laptop el : laptops) {
                    if (el.getColor() == Color.RED) System.out.println(el);
                }
            }
            if (number_of_color == 6) {
                for (Laptop el : laptops) {
                    if (el.getColor() == Color.GOLD) System.out.println(el);
                }
            }
            if (number_of_color == 7) {
                for (Laptop el : laptops) {
                    if (el.getColor() == Color.SILVER) System.out.println(el);
                }
            }
            if (number_of_color < 1 || number_of_color > 7) logger.info("������������ ����� �����!");
        }
        if (userInput == 2) {
            logger.info("������� �����, ��������������� ������: APPLE - 1, LENOVO - 2, ASUS - 3, HUAWEI - 4");
            int number_of_brand = scanner.nextInt();
            if (number_of_brand == 1) {
                for (Laptop el : laptops) {
                    if (el.getBrand_name() == Brand.APPLE) System.out.println(el);
                }
            }
            if (number_of_brand == 2) {
                for (Laptop el : laptops) {
                    if (el.getBrand_name() == Brand.LENOVO) System.out.println(el);
                }
            }
            if (number_of_brand == 3) {
                for (Laptop el : laptops) {
                    if (el.getBrand_name() == Brand.ASUS) System.out.println(el);
                }
            }
            if (number_of_brand == 4) {
                for (Laptop el : laptops) {
                    if (el.getBrand_name() == Brand.HUAWEI) System.out.println(el);
                }
            }
            if (number_of_brand < 1 || number_of_brand >4) {
                logger.info("������������ ����� ������!");
            }
        } if (userInput < 0 || userInput > 2) {
            logger.info("������������ ��� ��� ������!");
        }
    }
}
