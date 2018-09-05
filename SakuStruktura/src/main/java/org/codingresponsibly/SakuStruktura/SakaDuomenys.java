package org.codingresponsibly.SakuStruktura;

public class SakaDuomenys {

    public static Saka<String> getSet() {
        Saka<String> kamienas = new Saka<String>("1");
        {
            Saka<String> sakele0 = kamienas.addJungtis("2");
            Saka<String> sakele1 = kamienas.addJungtis("3");
            {
                Saka<String> sakele01 = sakele0.addJungtis("4");
                Saka<String> sakele10 = sakele1.addJungtis("5");
                Saka<String> sakele11 = sakele1.addJungtis("6");
                Saka<String> sakele12 = sakele1.addJungtis("7");

                {
                    Saka<String> sakele101 = sakele10.addJungtis("8");
                    Saka<String> sakele110 = sakele11.addJungtis("9");
                    Saka<String> sakele111 = sakele11.addJungtis("10");

                    {

                        Saka<String> sakele1101 = sakele110.addJungtis("11");

                    }
                }
            }
        }

        return kamienas;
    }

}
