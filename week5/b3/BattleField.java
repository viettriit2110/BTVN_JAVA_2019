package test;

import java.util.Scanner;

public class BattleField {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Human[] humans = new Human[2];
        for (int i = 0; i < 2; i++) {
            humans[i] = new Human();
            System.out.println("Nhập thông tin người thứ " + (i + 1));
            humans[i].nhap();
        }
        System.out.println("---------Start---------");
        System.out.println("Người 1 đánh người 2: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Người 1 đánh người 2 lần " + (i + 1));
            humans[1].Attack(humans[0]);
            System.out.println(humans[0].xuatnguoi());
            System.out.println(humans[1].xuatnguoi());
        }
        System.out.println("Người 2 đánh người 1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Người 2 đánh người 1 lần " + (i + 1));
            humans[0].Attack(humans[1]);
            System.out.println(humans[0].xuatnguoi());
            System.out.println(humans[1].xuatnguoi());
        }
        System.out.println("Người chiến thắng: ");
        if (humans[0].getHP() > humans[1].getHP()) {
            System.out.println(humans[0].xuatnguoi());
        }
        if (humans[0].getHP() < humans[1].getHP()) {
            System.out.println(humans[1].xuatnguoi());
        }
        if (humans[0].getHP() == humans[1].getHP()) {
            System.out.println("Hòa");
        }
    }
    
}
