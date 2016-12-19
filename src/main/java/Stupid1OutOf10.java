import java.util.concurrent.ThreadLocalRandom;

public class Stupid1OutOf10 {
    public boolean isLargerThan(int number) {
        return random1OutOf10Dispatch1() > number;
    }

    private int random1OutOf10Dispatch1() {
        return random1OutOf10Dispatch2();
    }


    private int random1OutOf10Dispatch2() {
        return random1OutOf10Dispatch3();
    }


    private int random1OutOf10Dispatch3() {
        return random1OutOf10Dispatch4();
    }


    private int random1OutOf10Dispatch4() {
        return random1OutOf10Dispatch5();
    }


    private int random1OutOf10Dispatch5() {
        return random1OutOf10Dispatch6();
    }


    private int random1OutOf10Dispatch6() {
        return random1OutOf10Dispatch7();
    }


    private int random1OutOf10Dispatch7() {
        return random1OutOf10Dispatch8();
    }


    private int random1OutOf10Dispatch8() {
        return random1OutOf10Dispatch9();
    }


    private int random1OutOf10Dispatch9() {
        return random1OutOf10Dispatch10();
    }


    private int random1OutOf10Dispatch10() {
        return random1OutOf10Dispatch11();
    }


    private int random1OutOf10Dispatch11() {
        return random1OutOf10Dispatch12();
    }


    private int random1OutOf10Dispatch12() {
        return random1OutOf10Dispatch13();
    }


    private int random1OutOf10Dispatch13() {
        return random1OutOf10Dispatch14();
    }


    private int random1OutOf10Dispatch14() {
        return random1OutOf10Dispatch15();
    }


    private int random1OutOf10Dispatch15() {
        return random1OutOf10Dispatch16();
    }


    private int random1OutOf10Dispatch16() {
        return random1OutOf10Dispatch17();
    }


    private int random1OutOf10Dispatch17() {
        return random1OutOf10Dispatch18();
    }


    private int random1OutOf10Dispatch18() {
        return random1OutOf10Dispatch19();
    }


    private int random1OutOf10Dispatch19() {
        return random1OutOf10Dispatch20();
    }


    private int random1OutOf10Dispatch20() {
        return ThreadLocalRandom.current().nextInt(1, 11);
    }
}
