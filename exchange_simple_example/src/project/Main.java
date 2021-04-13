package project;

import java.math.BigDecimal;

public class Main {


    /**
     *
     * 30 грн ----- 1 долар
     * 35 грн ----- 1 євро
     *
     */

    enum Currency_2 {
        Hryvna(0),
        Dollar(30),
        Euro(35),
        Fount(40);

        double change;

        Currency_2(double change) {
            this.change = change;
        }

        double convertTo(double hryvnas) {
            return hryvnas / change;
        }

        void display() {
            System.out.println(change);
        }

    }


    /**
     * Пам'ятаємо!!!
     * Для того, щоб args[0] щось повернув
     * Потрібно зайти в edit configuration->environment->program arguments і написати в рядку якусь цифру
    */
    public static void main(String[] args) {    //   arg є [100]
        String arg = args[0];
        double hryvnas = Double.parseDouble(arg);

        System.out.println(convertToDollar(hryvnas));
        System.out.println(convertToEuro(hryvnas));


        // classes
        Currency dolar = new Dollar();
        Currency euro = new Euro();
        dolar.convertTo(hryvnas);
        euro.convertTo(hryvnas);


        // enum
        System.out.println(Currency_2.Dollar.convertTo(hryvnas));
        System.out.println(Currency_2.Euro.convertTo(hryvnas));
        System.out.println(Currency_2.Fount.convertTo(hryvnas));


    }


    public static double convertToDollar(double hryvnas) {
        return hryvnas / 30;
    }

    public static double convertToEuro(double hryvnas) {
        return hryvnas / 35;
    }

    public static double convertFunte(double hryvnas) {
        return hryvnas / 40;
    }

}



// валюта
interface Currency {
    double convertTo(double hryvnas);
}

class Hryvna implements Currency {
    @Override
    public double convertTo(double hryvnas) {
        return hryvnas;
    }
}

class Dollar implements Currency {
    @Override
    public double convertTo(double hryvnas) {
        return hryvnas / 30;
    }
}

class Euro implements Currency {
    @Override
    public double convertTo(double hryvnas) {
        return hryvnas / 35;
    }
}

class Funte implements Currency {
    @Override
    public double convertTo(double hryvnas) {
        return hryvnas / 40;
    }
}








