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
