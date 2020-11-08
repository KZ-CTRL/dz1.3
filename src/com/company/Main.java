package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        Bankakkaunt d = new Bankakkaunt();
        d.depozit(20000);
        while (true) {
            try {d.vichrou(6000);

            } catch (LimitException e) {
              d.vichrou(d.getEmaont());
                break;
            }
        }
    }
}
