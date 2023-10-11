import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Comparator;


class TicketTest {


    @Test
    public void testTicketZeroflight() {
        AviaSouls bilet = new AviaSouls();

        Ticket ticket1 = new Ticket("JFK", "IST", 600, 13, 23);
        Ticket ticket2 = new Ticket("BCN", "IST", 400, 17, 20);
        Ticket ticket3 = new Ticket("IST", "VKO", 250, 10, 13);
        Ticket ticket4 = new Ticket("IST", "GOI", 320, 11, 19);
        Ticket ticket5 = new Ticket("GOI", "BOM", 50, 12, 15);
        Ticket ticket6 = new Ticket("IST", "GOI", 270, 4, 22);
        Ticket ticket7 = new Ticket("JFK", "BCN", 700, 3, 23);
        Ticket ticket8 = new Ticket("BCN", "IST", 300, 7, 20);
        Ticket ticket9 = new Ticket("IST", "VKO", 450, 1, 13);
        Ticket ticket10 = new Ticket("IST", "GOI", 520, 1, 19);
        Ticket ticket11 = new Ticket("GOI", "BOM", 150, 2, 4);
        Ticket ticket12 = new Ticket("IST", "GOI", 330, 3, 18);

        bilet.add(ticket1);
        bilet.add(ticket2);
        bilet.add(ticket3);
        bilet.add(ticket4);
        bilet.add(ticket5);
        bilet.add(ticket6);
        bilet.add(ticket7);
        bilet.add(ticket8);
        bilet.add(ticket9);
        bilet.add(ticket10);
        bilet.add(ticket11);
        bilet.add(ticket12);


        Ticket[] actual = bilet.search("IST", "SPB");
        Ticket[] extented = {};

        Assertions.assertArrayEquals(extented, actual);
    }


    @Test
    public void testTicket() {
        AviaSouls bilet = new AviaSouls();

        Ticket ticket1 = new Ticket("JFK", "BCN", 600, 13, 23);
        Ticket ticket2 = new Ticket("BCN", "IST", 400, 17, 20);
        Ticket ticket3 = new Ticket("IST", "VKO", 250, 10, 13);
        Ticket ticket4 = new Ticket("IST", "GOI", 320, 11, 19);
        Ticket ticket5 = new Ticket("GOI", "BOM", 50, 12, 15);
        Ticket ticket6 = new Ticket("IST", "GOI", 270, 4, 22);
        Ticket ticket7 = new Ticket("JFK", "BCN", 700, 3, 23);
        Ticket ticket8 = new Ticket("BCN", "IST", 300, 7, 20);
        Ticket ticket9 = new Ticket("IST", "VKO", 450, 1, 13);
        Ticket ticket10 = new Ticket("IST", "GOI", 520, 1, 19);
        Ticket ticket11 = new Ticket("GOI", "BOM", 150, 2, 4);
        Ticket ticket12 = new Ticket("IST", "GOI", 330, 3, 18);

        bilet.add(ticket1);
        bilet.add(ticket2);
        bilet.add(ticket3);
        bilet.add(ticket4);
        bilet.add(ticket5);
        bilet.add(ticket6);
        bilet.add(ticket7);
        bilet.add(ticket8);
        bilet.add(ticket9);
        bilet.add(ticket10);
        bilet.add(ticket11);
        bilet.add(ticket12);


        Ticket[] actual = bilet.search("IST", "GOI");
        Ticket[] extented = {ticket6, ticket4, ticket12, ticket10};

        Assertions.assertArrayEquals(extented, actual);
    }

    @Test
    public void testTicketoneflight() {
        AviaSouls bilet = new AviaSouls();

        Ticket ticket1 = new Ticket("JFK", "IST", 600, 13, 23);
        Ticket ticket2 = new Ticket("BCN", "IST", 400, 17, 20);
        Ticket ticket3 = new Ticket("IST", "VKO", 250, 10, 13);
        Ticket ticket4 = new Ticket("IST", "GOI", 320, 11, 19);
        Ticket ticket5 = new Ticket("GOI", "BOM", 50, 12, 15);
        Ticket ticket6 = new Ticket("IST", "GOI", 270, 4, 22);
        Ticket ticket7 = new Ticket("JFK", "BCN", 700, 3, 23);
        Ticket ticket8 = new Ticket("BCN", "IST", 300, 7, 20);
        Ticket ticket9 = new Ticket("IST", "VKO", 450, 1, 13);
        Ticket ticket10 = new Ticket("IST", "GOI", 520, 1, 19);
        Ticket ticket11 = new Ticket("GOI", "BOM", 150, 2, 4);
        Ticket ticket12 = new Ticket("IST", "GOI", 330, 3, 18);

        bilet.add(ticket1);
        bilet.add(ticket2);
        bilet.add(ticket3);
        bilet.add(ticket4);
        bilet.add(ticket5);
        bilet.add(ticket6);
        bilet.add(ticket7);
        bilet.add(ticket8);
        bilet.add(ticket9);
        bilet.add(ticket10);
        bilet.add(ticket11);
        bilet.add(ticket12);


        Ticket[] actual = bilet.search("JFK", "IST");
        Ticket[] extented = {ticket1};

        Assertions.assertArrayEquals(extented, actual);
    }

    @Test
    public void testTicketZeroflightTime() {
        AviaSouls bilet = new AviaSouls();

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket ticket1 = new Ticket("JFK", "IST", 600, 13, 23);
        Ticket ticket2 = new Ticket("BCN", "IST", 400, 17, 20);
        Ticket ticket3 = new Ticket("IST", "VKO", 250, 10, 13);
        Ticket ticket4 = new Ticket("IST", "GOI", 320, 11, 19);
        Ticket ticket5 = new Ticket("GOI", "BOM", 50, 12, 15);
        Ticket ticket6 = new Ticket("IST", "GOI", 270, 4, 22);
        Ticket ticket7 = new Ticket("JFK", "BCN", 700, 3, 23);
        Ticket ticket8 = new Ticket("BCN", "IST", 300, 7, 20);
        Ticket ticket9 = new Ticket("IST", "VKO", 450, 1, 13);
        Ticket ticket10 = new Ticket("IST", "GOI", 520, 1, 19);
        Ticket ticket11 = new Ticket("GOI", "BOM", 150, 2, 4);
        Ticket ticket12 = new Ticket("IST", "GOI", 330, 3, 18);

        bilet.add(ticket1);
        bilet.add(ticket2);
        bilet.add(ticket3);
        bilet.add(ticket4);
        bilet.add(ticket5);
        bilet.add(ticket6);
        bilet.add(ticket7);
        bilet.add(ticket8);
        bilet.add(ticket9);
        bilet.add(ticket10);
        bilet.add(ticket11);
        bilet.add(ticket12);


        Ticket[] actual = bilet.search("IST", "SPB", comparator);
        Ticket[] extented = {};

        Assertions.assertArrayEquals(extented, actual);
    }


    @Test
    public void testTicketTime() {
        AviaSouls bilet = new AviaSouls();

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket ticket1 = new Ticket("JFK", "BCN", 600, 13, 23);
        Ticket ticket2 = new Ticket("BCN", "IST", 400, 17, 20);
        Ticket ticket3 = new Ticket("IST", "VKO", 250, 10, 13);
        Ticket ticket4 = new Ticket("IST", "GOI", 320, 11, 19);
        Ticket ticket5 = new Ticket("GOI", "BOM", 50, 12, 15);
        Ticket ticket6 = new Ticket("IST", "GOI", 270, 4, 22);
        Ticket ticket7 = new Ticket("JFK", "BCN", 700, 3, 23);
        Ticket ticket8 = new Ticket("BCN", "IST", 300, 7, 20);
        Ticket ticket9 = new Ticket("IST", "VKO", 450, 1, 13);
        Ticket ticket10 = new Ticket("IST", "GOI", 520, 1, 19);
        Ticket ticket11 = new Ticket("GOI", "BOM", 150, 2, 4);
        Ticket ticket12 = new Ticket("IST", "GOI", 330, 3, 18);

        bilet.add(ticket1);
        bilet.add(ticket2);
        bilet.add(ticket3);
        bilet.add(ticket4);
        bilet.add(ticket5);
        bilet.add(ticket6);
        bilet.add(ticket7);
        bilet.add(ticket8);
        bilet.add(ticket9);
        bilet.add(ticket10);
        bilet.add(ticket11);
        bilet.add(ticket12);


        Ticket[] actual = bilet.search("IST", "GOI", comparator);
        Ticket[] extented = {ticket4, ticket12, ticket6, ticket10};

        Assertions.assertArrayEquals(extented, actual);
    }

    @Test
    public void testTicketoneflightTime() {
        AviaSouls bilet = new AviaSouls();
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket ticket1 = new Ticket("JFK", "IST", 600, 13, 23);
        Ticket ticket2 = new Ticket("BCN", "IST", 400, 17, 20);
        Ticket ticket3 = new Ticket("IST", "VKO", 250, 10, 13);
        Ticket ticket4 = new Ticket("IST", "GOI", 320, 11, 19);
        Ticket ticket5 = new Ticket("GOI", "BOM", 50, 12, 15);
        Ticket ticket6 = new Ticket("IST", "GOI", 270, 4, 22);
        Ticket ticket7 = new Ticket("JFK", "BCN", 700, 3, 23);
        Ticket ticket8 = new Ticket("BCN", "IST", 300, 7, 20);
        Ticket ticket9 = new Ticket("IST", "VKO", 450, 1, 13);
        Ticket ticket10 = new Ticket("IST", "GOI", 520, 1, 19);
        Ticket ticket11 = new Ticket("GOI", "BOM", 150, 2, 4);
        Ticket ticket12 = new Ticket("IST", "GOI", 330, 3, 18);

        bilet.add(ticket1);
        bilet.add(ticket2);
        bilet.add(ticket3);
        bilet.add(ticket4);
        bilet.add(ticket5);
        bilet.add(ticket6);
        bilet.add(ticket7);
        bilet.add(ticket8);
        bilet.add(ticket9);
        bilet.add(ticket10);
        bilet.add(ticket11);
        bilet.add(ticket12);


        Ticket[] actual = bilet.search("JFK", "IST", comparator);
        Ticket[] extented = {ticket1};

        Assertions.assertArrayEquals(extented, actual);
    }

}