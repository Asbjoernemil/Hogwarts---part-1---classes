package edu.hogwarts;

import java.util.Arrays;

public class House {
    private String name;
    private String founder;
    private String[] colors;

    public House(String name, String founder, String[] colors) {
        validateHouseName(name);
        this.name = name;
        this.founder = founder;
        this.colors = colors;
    }

    private void validateHouseName(String name) {
        String[] allowedHouses = {"Gryffindor", "Ravenclaw", "Slytherin", "Hufflepuff"};

        for (String house : allowedHouses) {
            if (name.equals(house)) {
                return;
            }
        }

        throw new IllegalArgumentException("Invalid house name: " + name);
    }

    public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getFounder () {
            return founder;
        }

        public void setFounder (String founder){
            this.founder = founder;
        }

        public String[] getColors () {
            return colors;
        }

        public void setColors (String[]colors){
            this.colors = colors;
        }

        @Override
        public String toString () {
            return
                    "House: '" + name + '\'' +
                            ", Founder: '" + founder + '\'' +
                            ", Colors: " + Arrays.toString(colors) +
                            '}';
        }
    }

