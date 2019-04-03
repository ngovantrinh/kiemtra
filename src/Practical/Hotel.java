package adf1_hotel;

import java.util.Scanner;
import java.util.ArrayList;

public class Hotel {
    private String name;
    private String location;
    private String ownerName;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.setName(name);
        this.setLocation(location);
        this.setOwnerName(ownerName);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void KetQua() {
        System.out.println("Khach San:" + this.getName() + "\n Dia chi: " + this.getLocation() + "\n Chu so huu: " + this.getOwnerName());
    }

    public static void main(String[] args) {
        ArrayList<Hotel> hotels = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            hotels.add(new Hotel());
        }

        int j = 1;
        for (Hotel ht : hotels) {
            System.out.println("So khach San " + j + " :");
            Scanner info = new Scanner(System.in);
            System.out.println("Nhap ten khach san:");
            ht.setName(info.nextLine());

            System.out.print("Ten chu so huu: ");
            ht.setOwnerName(info.nextLine());

            System.out.print("Dia chi: ");
            ht.setLocation(info.nextLine());
            j++;
        }


        System.out.println("Tim ten chu so huu: ");
        Scanner search = new Scanner(System.in);
        String str = search.nextLine();

        for (Hotel ht : hotels) {
            if (ht.getOwnerName().equalsIgnoreCase(str)) {
                ht.KetQua();
            }

        }
    }
}