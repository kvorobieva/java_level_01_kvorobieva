package lesson01;

public class online01 {

    public static void main (String[] args) {

        //System.out.println() = sout
/*        System.out.println("¯\\_(ツ)_/¯ Hello, world!");

        //целочисленные
        byte myByte = 35; //1 byte = {-128..+127}
        short myShort = 3500; //2 byte = {-32000..+32000}
        int myInt = 2500000; //4 byte = {-2*10^9..2*10^9}
        long myLong = 350000000L; //8 byte = {-2^63..2^63}

        //числа с плавающей точкой
        float myFloat = 15.86f; //4 byte = {value.0000000}
        double myDouble = 15.86; //8 byte = {value.00000000000000}

        //логическая переменная
        boolean myBoolean = false; //true 1b

        //символы
        char myChar = 'T'; //2b
        int valueTest1 = 74;
        char valueChar = (char) valueTest1;
        int valueInteger = myChar;
        System.out.println(valueTest1);
        System.out.println(valueChar);
        System.out.println(valueInteger);

        //String
        String myString1 = "Hello ";
        String myString2 = "Blue DuctTape";
        System.out.println(myString1 + myString2);
        System.out.println(1 + " - this is ONE");

        float test1 = 15;
        System.out.println(test1);*/

/*        int a = 15;
        float b = 4.9f;
        int c = 100;
        float result = a / b;
        System.out.println(a / b * c); //3.75 float - 3 int*/

/*        int abc = 1;
        abc += 11; //abc = abc + 11;
        System.out.println(abc);

        int cde = 121;
        cde++; //cde = cde + 1;
        cde--; //cde = cde - 1;
        System.out.println(cde);*/

/*        int a = 10;

        if (a > 10) {
            System.out.println("ok");
        } else {
            System.out.println("not ok!");
        }

        int b = 2;
        if (a < 5) {
            System.out.println("b = ok");
        }*/

/*        int age = 65;

        if (age < 18) {
            System.out.println("Вам нет 18 лет");
        } else if (age > 60) {
            System.out.println("Вы уже стары, пожалейте здоровье");
        } else {
            System.out.println("Ваша покупка совершена, спасибо");
        }*/

/*        int a = 45;
        int b = 30;
        int result;

//        result = a + b; //45+30
        result = myMath(a, b, 20); //45+30
        a++; //46
        result = myMath(a, b, 50); //46+30
        b++; //31
        result = myMath(a, b, 100); //46+31
        a++; //47
        result = myMath(a, b, 0); //45+31
        System.out.println(result); //78*/
/*
        doSomething1();
        doSomething1();

        doSomething2(15);
        doSomething2(35);
        doSomething2(90.986f);
*/


    }
    public static int myMath(int valueA, int valueB, int valueC) {
        return valueA + valueB;

    }

    public static void doSomething1() {
        System.out.println("Hello");
    }

    public static void doSomething2(float inputValue) {
        System.out.println("My value is =  " + inputValue);

    }
}
