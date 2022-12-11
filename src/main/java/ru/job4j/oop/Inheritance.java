package ru.job4j.oop;

public class Inheritance {

    public class Profession {
        private boolean degree;

        public Profession(boolean degree) {
            this.degree = degree;
        }
    }

    public class Engineer extends Profession {
        private int experience;

        public Engineer(int experienc, boolean degree) {
            super(degree);
            this.experience = experience;
        }
    }

    public class Programmer extends Engineer {
        private String programLang;

        public Programmer(String programLang, int experienc, boolean degree) {
            super(experienc, degree);
            this.programLang = programLang;
        }
    }
}