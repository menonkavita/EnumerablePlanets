package org.launchcode.data;

public enum Planets {
    // list the planets here.
    // Mercury, Venus, Earth, Mars, Jupiter,
    // Saturn, Uranus, Neptune
    // Don't forget to capitalization convention and enum
    // syntax to separate value and end the list

//    MERCURY("Mercury", "88", 0),
//    VENUS("Venus", "225", 0),
//    EARTH("Earth", "365", 1),
//    MARS("Mars", "687", 2),
//    JUPITER("Jupiter", "4333", 95),
//    SATURN("Saturn", "10759", 146),
//    URANUS("Uranus", "30687", 28),
//    NEPTUNE("Neptune", "60200", 16),
//    PLUTO("Pluto", "", 5);

        MERCURY("Mercury"),
        VENUS("Venus"),
        EARTH("Earth"),
        MARS("Mars"),
        JUPITER("Jupiter"),
        SATURN("Saturn"),
        URANUS("Uranus"),
        NEPTUNE("Neptune"),
        PLUTO("Pluto");

    private final String planetName;
//    private final String yearLength;
//    private final int numOfMoons;


//    Planets(String planetName, String yearLength, int numOfMoons) {
//        this.planetName = planetName;
//        this.yearLength = yearLength;
//        this.numOfMoons = numOfMoons;
//    }


    Planets(String planetName) {
        this.planetName = planetName;
    }

    public String getPlanetName() {
        return planetName;
    }



//    public String getYearLength() {
//        return yearLength;
//    }
//
//    public int getNumOfMoons() {
//        return numOfMoons;
//    }
}
