class MovieTicket {
    String name;
    int count;
    String category;

    MovieTicket(String name) {
        this.name = name;
        this.count = 1;
        this.category = "Silver";
    }

    MovieTicket(String name, int count) {
        this.name = name;
        this.count = count;
        this.category = "Silver";
    }

    MovieTicket(String name, int count, String category) {
        this.name = name;
        this.count = count;
        this.category = category;
    }
}

public class movie_ticket {
    public static void main(String args[]) {
        MovieTicket t1 = new MovieTicket("Spiderman");
        MovieTicket t2 = new MovieTicket("Spiderman", 2);
        MovieTicket t3 = new MovieTicket("Spiderman", 3, "Gold");

        System.out.println(t1.name + " " + t1.count + " " + t1.category);
        System.out.println(t2.name + " " + t2.count + " " + t2.category);
        System.out.println(t3.name + " " + t3.count + " " + t3.category);
    }
}