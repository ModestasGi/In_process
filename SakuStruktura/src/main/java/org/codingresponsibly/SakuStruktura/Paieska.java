package org.codingresponsibly.SakuStruktura;

public class Paieska {


    public static void main(String[] args) {

        String objektasPaieskai = "11";

        Comparable<String> paieskosKriterijai = new Comparable<String>() {
            @Override
            public int compareTo(String strukturosDuomenys) {
                if (strukturosDuomenys == null)
                    return 1;
                boolean sakeleYRA = strukturosDuomenys.contains(objektasPaieskai);
                return sakeleYRA ? 0 : 1;
            }
        };

        Saka<String> medzioKamienas = SakaDuomenys.getSet();
        Saka<String> rasta = medzioKamienas.findTreeNode(paieskosKriterijai);

        System.out.println("Rastas giliausias: " + rasta);
    }

}
