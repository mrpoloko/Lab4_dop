package Story;
import Story.Character.*;
import Story.Clothes.*;
import Story.ObjectOfForest.*;


public class Main {
    public static void main(String[] args) throws Exception {

        Tiger tiger = new Tiger("Тигр", State.Hanging);
        IAIA iaia = new IAIA("ИА-ИА", State.Standing);
        Vinni vinni = new Vinni("Винни Пух", State.Standing);
        Piglet piglet = new Piglet("Пяточок", State.Standing);
        ChristopherRobin christopherRobin = new ChristopherRobin("Кристофер Робин", State.Standing);
        Ru ru = new Ru("крошка Ру", State.Hanging);

        piglet.offended(iaia);
        piglet.memory();

        christopherRobin.takeOffShirt(piglet, "Blue", Quality.Good);

        Shirt shirt = new Shirt(0.9, christopherRobin, iaia, vinni, piglet);

        Heap heap;
        try {
            ru.jump();
            heap = shirt.catching(ru);
            heap.riseAll();
        }catch (Exception _){}
        try {

                tiger.jump();
                heap = shirt.catching(tiger);
                heap.riseAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        River river = new River();
        river.getToEdge();
        river.aboutStreams();

        Pathway pathway = new Pathway(Width.Wide);

        Bridge bridge = pathway.meetWithRiver();
        bridge.addOnBridge(ru, christopherRobin, piglet, vinni);

        vinni.seeingOnRiver();
        ru.seeingOnRiver();
        christopherRobin.seeingOnRiver();
        piglet.seeingOnRiver();

        vinni.memory();
    }
}