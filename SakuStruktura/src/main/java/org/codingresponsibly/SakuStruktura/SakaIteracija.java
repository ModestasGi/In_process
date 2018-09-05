package org.codingresponsibly.SakuStruktura;

public class SakaIteracija {

    public static void main(String[] args) {
        Saka<String> medzioKamienas = SakaDuomenys.getSet();
        System.out.println("Šakų struktūra:");

        for (Saka<String> sakele : medzioKamienas) {
            String itraukiam = createItraukiam(sakele.getLevel());
            System.out.println(itraukiam + sakele.data);
        }
    }

    private static String createItraukiam(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

}
