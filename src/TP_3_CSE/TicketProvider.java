package TP_3_CSE;

public class TicketProvider implements Runnable {

	private int id;
    private int soldTickets;
    private Solution solution;
    public TicketProvider(int id, Solution solution) {
        this.id = id;
        this.solution = solution;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "TicketProvider{" +
                "id=" + id +
                ", soldTickets=" + soldTickets +
                '}';
    }
    @Override
    public void run() {
        boolean parkingIsNotFull;
        do {
            solution.entrySection(this);
            parkingIsNotFull = Parking.decreaseCapacity();
            solution.exitSection(this);
            if (parkingIsNotFull)
                soldTickets++;
        } while (parkingIsNotFull);
        System.out.println(this);
    }
}
