package com.severin.homework_7;

public class Main {

        private static int TIME = 0;

        public static void main(String[] args) {

            Cat[] cat = new Cat[3];
            cat[0] = new Cat("Tom", 150, 1);
            cat[1] = new Cat("Cat", 100, 2);
            cat[2] = new Cat("Robot", 30, 3);
            Plate plate = new Plate(700);
            System.out.println("Есть три кота: " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + ", которые хотят есть каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + " и " + cat[2].getSatietyTime() + " час(а).");
            System.out.println("Сейчас в миске " + plate.getFood() + " грамм корма. ");

            do {
                for (Cat i : cat) {

                    if (i.getSatiety() == 0) {

                        if (!plate.checkFood(i.getAppetite())) {
                            plate.increaseFood();
                        }

                        //кот ест
                        i.eat(plate);
                        System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                    }

                    i.setSatiety(i.getSatiety() - 1);
                }
                System.out.println("\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getFood() + " грамм корма.\n");
                TIME++;

            } while (TIME <= 24);
        }
    }

