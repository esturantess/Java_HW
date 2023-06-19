package HW_Lesson6;


import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class Laptop {
    String serial_number;
    Brand brand_name;
    Color color;
    Origin origin_country;

    public Laptop(String serial_number, Brand brand_name, Color color, Origin origin_country) {
        this.serial_number = serial_number;
        this.brand_name = brand_name;
        this.color = color;
        this.origin_country = origin_country;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "serial_number='" + serial_number + '\'' +
                ", brand_name=" + brand_name +
                ", color=" + color +
                ", origin_country=" + origin_country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(serial_number, laptop.serial_number) && brand_name == laptop.brand_name && color == laptop.color && origin_country == laptop.origin_country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial_number, brand_name, color, origin_country);
    }

    public static void infoOutput(Set<Laptop> laptops) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(Laptop.class.getName());
        logger.info("Добро пожаловать в магазин ноутбуков! Для вывода информации о товарах в наличии введите: 0 - все товары; 1 - сортировка по цвету; 2 - сортировка по бренду.");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 0:
                System.out.println(laptops);
            break;
            case 1:
                logger.info("Введите цифру, соответствующую цвету: BLACK - 1, WHITE - 2, GRAY - 3, PINK - 4, RED - 5, GOLD - 6, SILVER - 7");
                int number_of_color = scanner.nextInt();
                switch (number_of_color) {
                    case 1:
                        for (Laptop el : laptops) {
                            if (el.getColor() == Color.BLACK) System.out.println(el);
                            break;
                        }
                    case 2:
                        for (Laptop el : laptops) {
                            if (el.getColor() == Color.WHITE) System.out.println(el);
                            break;
                        }
                    case 3:
                        for (Laptop el : laptops) {
                            if (el.getColor() == Color.GRAY) System.out.println(el);
                            break;
                        }
                    case 4:
                        for (Laptop el : laptops) {
                            if (el.getColor() == Color.PINK) System.out.println(el);
                            break;
                        }
                    case 5:
                        for (Laptop el : laptops) {
                            if (el.getColor() == Color.RED) System.out.println(el);
                            break;
                        }
                    case 6:
                        for (Laptop el : laptops) {
                            if (el.getColor() == Color.GOLD) System.out.println(el);
                            break;
                        }
                    case 7:
                        for (Laptop el : laptops) {
                            if (el.getColor() == Color.SILVER) System.out.println(el);
                            break;
                        }
                    default:
                        logger.info("Некорректный номер цвета!");
                }
                break;
            case 2:
                logger.info("Введите цифру, соответствующую бренду: APPLE - 1, LENOVO - 2, ASUS - 3, HUAWEI - 4");
                int number_of_brand = scanner.nextInt();
                switch (number_of_brand) {
                    case 1:
                        for (Laptop el: laptops) {
                            if (el.getBrand_name() == Brand.APPLE) System.out.println(el);
                            break;
                        }
                    case 2:
                        for (Laptop el: laptops) {
                            if (el.getBrand_name() == Brand.LENOVO) System.out.println(el);
                            break;
                        }
                    case 3:
                        for (Laptop el: laptops) {
                            if (el.getBrand_name() == Brand.ASUS) System.out.println(el);
                            break;
                        }
                    case 4:
                        for (Laptop el: laptops) {
                            if (el.getBrand_name() == Brand.HUAWEI) System.out.println(el);
                            break;
                        }
                    default:
                        logger.info("Некорректный номер бренда!");
                }
            default:
                logger.info("Некорректный код для вывода!");
        }
    }

    public String getSerial_number() {
        return serial_number;
    }

    public Brand getBrand_name() {
        return brand_name;
    }

    public Color getColor() {
        return color;
    }

    public Origin getOrigin_country() {
        return origin_country;
    }

}
