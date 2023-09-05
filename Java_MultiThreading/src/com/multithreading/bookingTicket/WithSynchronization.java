package com.multithreading.bookingTicket;

class BookMovieSeats{
	int totalSeats = 10;
	synchronized void bookSeat(int seats) {
		if(totalSeats >= seats) {
			System.out.println("Seats booked successfully..");
			totalSeats = totalSeats-seats;
			System.out.println("Seats left "+ totalSeats);
		}else {
			System.out.println("Seats can not be booked");
			System.out.println("Seats left "+totalSeats);
		}
	}
}

public class WithSynchronization extends Thread{
	static BookMovieSeats obj;
	int seats;
	public void run() {
		obj.bookSeat(seats);
	}
	public static void main(String[] args) {
		obj = new BookMovieSeats();
		WithSynchronization deepak = new WithSynchronization();
		deepak.seats = 7;
		deepak.start();
		WithSynchronization rahul = new WithSynchronization();
		rahul.seats = 4;
		rahul.start();
	}

}


