package Story.ObjectOfForest;

public class Pathway {
    Width width;
    public Pathway(Width width){
        this.width = width;
        System.out.println(width.getRusName() + " тропа");
        if (this.width == Width.Wide){
            System.out.println("-- пожалуй, ее можно было даже назвать дорогой--");
        }
        System.out.println("вела из Внешнего Мира в Лес, но, перед тем как попасть в Лес, ей надо было перебраться через эту Реку");
    }
    public Bridge meetWithRiver(){
        System.out.println("И там, где Река и Дорога встречались, был деревянный мостик, почти такой же ширины, как сама дорога, с деревянными перилами по обеим сторонам.");
        return new Bridge(width);
    }
}
