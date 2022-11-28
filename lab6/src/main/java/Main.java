import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(new Shop("Похід", 1000));

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Адмін(1) чи клієнт(2)");
            int typeUser = in.nextInt();
            if (typeUser == 1) {
                int answer = -1;
                do {
                    System.out.println("1. Добавити товар");
                    System.out.println("2. Вивести доступні товари");
                    System.out.println("3. Пошук за типом");
                    System.out.println("4. Відсортувати за вагою");
                    answer = in.nextInt();

                    switch (answer) {
                        case 1:
                            manager.inputGoods(in);
                            break;
                        case 2:
                            System.out.println("Список товарів: " + manager.getGoods());
                            break;
                        case 3:
                            boolean reversed = false;
                            System.out.println("Реверсивно сортувати? (true/false): ");
                            reversed = in.nextBoolean();
                            System.out.println("Список товарів: " + manager.getGoodsByTypes(in, reversed));
                            break;
                        case 4:
                            boolean reverse = false;
                            System.out.println("Реверсивно сортувати? (true/false): ");
                            reverse = in.nextBoolean();
                            manager.sortGoodsByWeight(reverse);
                            break;
                    }
                } while (answer != 0);
            } else {

            }
        }


    }
}
