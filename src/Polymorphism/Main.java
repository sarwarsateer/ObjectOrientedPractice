package Polymorphism;

class Movie {
    private String name;

    public Movie (String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaw extends Movie {
    public Jaw() {
        super("Jaw");
    }

    @Override
    public String plot() {
        return "A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Independence Day";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a Maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

   //No Plot here
}


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 12; i++) {
            Movie movie = randomMovie();
            System.out.println("The Movie Number #" + i + " is " + movie.getName() + " and plot:" + movie.plot());
        }

    }

    private static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number generated was = " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaw();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}
