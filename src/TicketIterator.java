public class TicketIterator {
	private Tickets[] tickets;
	private int position = 0;
	
	public TicketIterator(Tickets[] tickets) {
		this.tickets = tickets;
	}
	
	public boolean hasNext() {
		if(position >= tickets.length || tickets[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public Tickets next() {
		Tickets next = tickets[position];
		if(hasNext()) {
			position = position + 1;
			return next;
		} else {
			return null;
		}
	}
}
