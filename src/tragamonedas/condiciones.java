package tragamonedas;

public class condiciones {

    private int monedas;

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public int darPremio(int premio) {
        return this.monedas + premio;
    }

    public boolean condicion1(int cartas1, int cartas2, int cartas3) {
        if (cartas1 == 1 && cartas2 == 1 && cartas3 == 1) {
            System.out.println("win");
            return true;
        } else {
            return false;
        }

    }

    public boolean condicion2_1(int cartas1, int cartas2, int cartas3) {
        if (cartas1 == 13 && cartas2 == 13 && cartas3 == 13) {
            return true;
        } else {
            return false;
        }
    }

    public boolean condicion2_2(int cartas1, int cartas2, int cartas3) {
        if (cartas1 == 12 && cartas2 == 12 && cartas3 == 12) {
            return true;
        } else {
            return false;
        }
    }

    public boolean condicion2_3(int cartas1, int cartas2, int cartas3) {
        if (cartas1 == 11 && cartas2 == 11 && cartas3 == 11) {
            return true;

        } else {
            return false;
        }

    }

    public boolean condicion3_1(int cartas1, int cartas2, int cartas3) {
        if ((cartas1 >= 6 && cartas1 != 13) && cartas2 == 13 && cartas3 == 13) {

            System.out.println("win");
            return true;

        } else {
            return false;
        }
    }

    public boolean condicion3_2(int cartas1, int cartas2, int cartas3) {
        if ((cartas1 >= 6 && cartas1 != 12) && cartas2 == 12 && cartas3 == 12) {

            System.out.println("win");
            return true;

        } else {
            return false;
        }
    }

    public boolean condicion3_3(int cartas1, int cartas2, int cartas3) {
        if ((cartas1 >= 6 && cartas1 != 11) && cartas2 == 11 && cartas3 == 11) {

            System.out.println("win");
            return true;

        } else {
            return false;
        }
    }

    public boolean condicion4(int cartas1, int cartas2, int cartas3) {
        if (cartas1 == 1 && cartas2 == 5 && cartas3 == 10) {
            System.out.println("win");
            return true;
        } else {
            return false;
        }
    }

    public boolean condicion5(int cartas1, int cartas2, int cartas3) {
        if ((cartas1 + 1 == cartas2 && cartas2 + 1 == cartas3) || (cartas1 + 1 == cartas2 && cartas2 + 1 == cartas3)) {

            System.out.println("win");
            return true;

        } else {
            return false;
        }
    }

    public boolean condicion6(int cartas1, int cartas2, int cartas3) {
        if ((cartas2 >= 6 && cartas2 < 11 && cartas2 == cartas3) || (cartas1 >= 6 && cartas1 < 11 && cartas1 == cartas2)) {

            System.out.println("win");
            return true;

        } else {
            return false;
        }
    }

    public boolean condicion7(int cartas1, int cartas2, int cartas3) {
        if (cartas1 == 3 && cartas2 == 6 && cartas3 == 9) {

            System.out.println("win");
            return true;

        } else {
            return false;
        }
    }
}
