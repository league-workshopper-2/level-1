import javax.swing.JOptionPane;

public class MovieRunner {
	public static void main(String[] args) {

		Movie james=new Movie("James Bond",1);
		Movie deadpool=new Movie("Dead Pool",3);
		Movie spy=new Movie("Spy",2);
		Movie neighbors=new Movie("neighbors",3);
		Movie neighbors2=new Movie("neighbors 2",3);
		String JamesPrice=james.getTicketPrice();
		NetflixQueue queue=new NetflixQueue();
		queue.addMovie(james);
		queue.addMovie(deadpool);
		queue.addMovie(spy);
		queue.addMovie(neighbors);
		queue.addMovie(neighbors2);
		queue.printMovies();
		System.out.println("The best movie is " + queue.getBestMovie());
		System.out.println("The second best movie is "+ queue.getMovie(1) );
	}
}
