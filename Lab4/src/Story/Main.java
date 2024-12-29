package Story;
import Story.Character.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Tiger tiger = new Tiger("Тигр", State.Hanging);
        IAIA iaia = new IAIA("ИА-ИА", State.Standing);
        Vinni vinni = new Vinni("Винни Пух", State.Standing);
        Piglet piglet = new Piglet("Пяточок", State.Standing);
        ChristopherRobin christopherRobin = new ChristopherRobin("Кристофер Робин", State.Standing);

        Shirt shirt = new Shirt(0.5, christopherRobin, iaia, vinni, piglet, tiger);

        tiger.jump();

        try {
            Heap heap = shirt.catching(iaia, vinni, tiger, christopherRobin, piglet);
            heap.riseAll();
        } catch (NullPointerException _){
            System.out.println("ни кто не упал");
        }
    }
}