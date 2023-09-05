package com.multithreading.bookingTicket;

class BookMovieSeat{
	int totalSeats = 10;
	void bookSeat(int seats) {
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

public class WithoutSynchronization extends Thread {
	
	static BookMovieSeat obj;
	int seats;
	public void run() {
		obj.bookSeat(seats);
	}
	public static void main(String[] args) {
		obj = new BookMovieSeat();
		WithoutSynchronization deepak = new WithoutSynchronization();
		deepak.seats = 7;
		deepak.start();
		WithoutSynchronization rahul = new WithoutSynchronization();
		rahul.seats = 8;
		rahul.start();
	}

}
