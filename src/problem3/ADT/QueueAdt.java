package problem3.ADT;

public interface QueueAdt<G> {
    void add(G data);

    G remove();

    G peek();
}
