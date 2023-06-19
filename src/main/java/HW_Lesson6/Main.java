package HW_Lesson6;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
//        Создать множество ноутбуков (Set).
//        Написать метод, который будет запрашивать у пользователя критерий
//        (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
//        Критерии фильтрации можно хранить в Map или в Сет. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - цвет
//        2 - бренд
//

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("OIKVX3FI5ILE", Brand.LENOVO, Color.PINK, Origin.CHINA);
        Laptop laptop2 = new Laptop("P7E49NUMDVJ6", Brand.APPLE, Color.GOLD, Origin.USA);
        Laptop laptop3 = new Laptop("IU1F3RX6DH7B", Brand.ASUS, Color.BLACK, Origin.TAIWAN);
        Laptop laptop4 = new Laptop("ZJU6SL1TOERE", Brand.HUAWEI, Color.RED, Origin.CHINA);
        Laptop laptop5 = new Laptop("AGU7ULVQOLMW", Brand.HUAWEI, Color.GRAY, Origin.CHINA); // повтор
        Laptop laptop6 = new Laptop("70J58J2TIZR0", Brand.HUAWEI, Color.SILVER, Origin.CHINA);
        Laptop laptop7 = new Laptop("GS0NDRHWBZCQ", Brand.APPLE, Color.WHITE, Origin.USA);
        Laptop laptop8 = new Laptop("AGU7ULVQOLMW", Brand.HUAWEI, Color.GRAY, Origin.CHINA); // повтор
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop5);
        laptops.add(laptop1);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop2);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        System.out.println(laptops); // список без повторов

        LaptopShop laptopShop = new LaptopShop();
        laptopShop.shopInit(laptops);

    }
}
