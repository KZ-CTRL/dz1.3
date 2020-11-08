package com.company;

public class Bankakkaunt {
    private  double Emaont;

    public double getEmaont() {
        return Emaont;
    }
    public void depozit(double sum){
        Emaont+=sum;
        System.out.println("Вы положили на счет " + sum );

    }public  void vichrou(double sum) throws LimitException{
        if (Emaont < sum){
            throw new LimitException("Вы не можете снять запращеваемую сумму ", sum);

        }else  {
            System.out.println("Со счета сняли "+ sum);
            System.out.println( "Остаток на счету " + (Emaont-= sum));
        }

    }

}
