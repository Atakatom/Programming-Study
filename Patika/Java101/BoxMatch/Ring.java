package Java101.BoxMatch;

import java.util.Random;

public class Ring {
    Fighter firstFighter;
    Fighter secondFighter;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        Random r = new Random();
        if(r.nextInt(2) == 1){
            this.firstFighter = f1;
            this.secondFighter = f2;
        } else {
            this.firstFighter = f2;
            this.secondFighter = f1;
        }
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (firstFighter.health > 0 && secondFighter.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                secondFighter.health = firstFighter.hit(secondFighter);
                if (isWin()){
                    break;
                }
                firstFighter.health = secondFighter.hit(firstFighter);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
        }

    public boolean checkWeight() {
        return (firstFighter.weight >= minWeight && firstFighter.weight <= maxWeight) && (secondFighter.weight >= minWeight && secondFighter.weight <= maxWeight);
    }

    public boolean isWin() {
        if (firstFighter.health == 0) {
            System.out.println("Maçı Kazanan : " + secondFighter.name);
            return true;
        } else if (secondFighter.health == 0){
            System.out.println("Maçı Kazanan : " + secondFighter.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(firstFighter.name + " Kalan Can \t:" + firstFighter.health);
        System.out.println(secondFighter.name + " Kalan Can \t:" + secondFighter.health);
    }
}
