package com.company;

public class Main {

    public static void main(String[] args) {//Loop - цикл
        //  while
    //budet schetatj i schetatj do znachenija ustanovlennogo nami.
        int a0 = 0;
        while (a0 < 5) {
            System.out.print(a0+" ");
                    a0++;//ne zabudj pro eto, inache budet schetatj vechno
        }
        System.out.println("while");

        //  do/while
        int b0 = 10;
        do {
            System.out.print(b0+" ");
                    b0++;//ne zabudj pro eto, inache budet schetatj vechno
        }
        while (b0 < 15);
        System.out.println("do/while");

        //  for
        for (int c0 = 0; c0 < 5; c0++) {
            //(statement1;stat2;stat3)-
            /*stat1-ustanavlivajet peremennuju pered nachalom tsikla (инициализация)
            stat2-ustanavlivajet uslovija tsikla (логическое выражение)
            stat3-uvelichivajet na 1 (обновление) */
            System.out.print(c0+" ");
        }
        System.out.println("for");

        //  eshe odin podobnqj primer
        for (int d0 = 0; d0 <= 10; d0 = d0+2) {
            System.out.print(d0+" ");
            }
        System.out.println("eshe odin podobnqj primer");

        //  for-each - улучшенный цикл for
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String e0 : cars) {
            System.out.print(e0+" ");
        }
        System.out.println("for-each - улучшенный цикл for");

        //Java break i continue
        //  Java break
        for (int f = 40; f < 50; f++){
            if (f==44){
                break;//brek zakonchil petlju kak tolko f stalo ravno 44
            }
            System.out.print(f+" ");
        }
        System.out.println("Java break");

        //  Java continue
        for (int g = 60; g < 70; g++){
            if (g==65){
                continue;//continue ne zakonchil petlju kak tolko g stalo ravno 65, a prodolzajet ee do g<70.
            }
            System.out.print(g+" ");
        }
        System.out.println("Java continue");
        // Java break and continue in while loop
        //Break


        int h = 0;
        while (h < 10) {
            System.out.print(h+" ");
            h++;
            if (h == 4) {
                break;
            }
        }
        System.out.println("Break");

        //Continue
        int j = 0;
        while (j < 10) {
            if (j == 4) {
                j++;
                continue;
            }
            System.out.print(j+" ");
            j++;
        }
        System.out.println("Continue");
        //moj X-mas kod
        System.out.println("moj x-mas kod");
        for(int a=1;a<=5;a++){
            for(int b=4;b>=a;b--) {
                System.out.print("_");
            }
            for(int c=1;c<=a;c++){
                System.out.print("A");
            }
            for(int e=1;e<=a-1;e++){
                System.out.print("A");
            }
            for(int d=5;d>a;d--){
                System.out.print("_");
            }
            System.out.println();
        }
        for(int a1=1;a1<=5;a1++){
            for(int b1=1;b1<=a1-1;b1++){
                System.out.print("-");
            }
            for (int c1=4;c1>=a1;c1--){
                System.out.print("V");
            }
            for (int d1=5;d1>=a1;d1--){
                System.out.print("V");
            }
            for(int e1=1;e1<=a1-1;e1++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
