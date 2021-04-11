package lesson02;

public class online02 {

/*    public static void main (String[] args) {
        int a = 20;
        int b = 10;
        int result;

       if (a > b) {
            result = a;
        }
        else {
            result = b;
        }

        //Тернарный оператор - соответствие одному условию

        result = (a > b) ? a : b;

        System.out.println("Результат " + result);
    }*/
/*
    public static void main (String[] args) {

        //Switch - выполняет роль ветвления программы. Когда у нас есть
        // количество переборов и ветвлений, тогда switch, неизвестное
        // число ветвлений else if

        String name = "Olga";
        if (name == "Boris") {
            System.out.println("Send letter to Alex");
        } else if (name == "Alex") {
            System.out.println("Send letter to Alex");
        } else if (name == "Olga") {
            System.out.println("Send letter to Olga");
        } else {
            System.out.printf("Leave the office");
        }
        System.out.println("----------------------");

        switch (name) {
            case "Boris":
                System.out.println("Send letter to Boris");
                break;
            case "Alex":
                System.out.println("Send letter to Alex");
                break;
            case "Olga":
                System.out.println("Send letter to Olga");
                break;
            default:
                System.out.printf("Leave the office");
        }

*/

// Определенный цикл for

    public static void main(String[] args) {

/*       for (int i = 0; i < 10; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        System.out.println(myMath(2, 10));

        printPifagor(10,10);

    }

    public static int myMath(int base, int signature) {
        int result = 1;

        for (int i = 0; i < signature; i++) {
            result *= base; //result = result * base;
        }
        return result;
    }
    //Вложенный цикл внутри цикла

    public static void printPifagor(int width, int height) {
        for (int x = 1; x < width; x++) {
            for (int y = 1; y < height; y++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();
        }
    }*/
/*
    //Неопределенный цикл while (предусловие), когда условие выполняется, тогда делает

        int b = 0;

        while (b < 10) {
            b++;
            if (b == 3 || b == 8) {
                continue;
            }
            System.out.print(b + " | ");
        }
        System.out.println("\nend do-while");

//do while (сначала делает, потом проверяет

        int c = 0;

        do {
            c++;
            System.out.print(c + " | ");
            if (c == 6) {
                break;
            }
        } while (c < 10);
*/
/*      //бесконечные циклы

     while (true) {

        }
*/
/*       //Массивы

        int[] array = new int[10];

        array[0] = 55;
        array[1] = 655;
        array[2] = 755;

        System.out.println(array[1] + " " + array[2]);




        String[] strArray = new String[25];

        */
/*for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "Value " + i;
  */
/*
        writeArray("value", strArray);
        readArray(strArray);

        float[] myFloatArray = {10.5f, 15.9f, 200.987f};
        System.out.print(myFloatArray.length + " {");

        for (int i = 0; i < myFloatArray.length; i++) {
            System.out.print(myFloatArray[i] + " ,");
        }
        System.out.print("}");



*//*        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " | ");
        }*/
/*
    }


    public static void writeArray(String value, String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = value + " " + i;
        }
    }
    public static void readArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " | ");
        }
        System.out.println();
    }*/

        int[][] doubleArrayInt = new int[3][4];
        doubleArrayInt[0][1] = 15;

        System.out.println(doubleArrayInt[0][1]);

        int value = 0;

        for (int y = 0; y < doubleArrayInt.length; y++) {
            for (int x = 0; x < doubleArrayInt[y].length; x++) {
                doubleArrayInt[y][x] = value;
                value++;
            }
        }

        for (int y = 0; y < doubleArrayInt.length; y++) {
            for (int x = 0; x < doubleArrayInt[y].length; x++) {
                System.out.print(doubleArrayInt[y][x] + " | ");
            }
            System.out.println();
        }

        String[][] arr = {{"1", "2", "3"}, {"4", "5", "6"}};

        int value2 = 0;
        int[][][] arr3 = new int[3][4][5];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[j].length; k++) {
                    arr3[i][j][k] = value2;
                    value2++;
                }
            }
        }

        int[][] testArray = new int[3][2];

    }
}




