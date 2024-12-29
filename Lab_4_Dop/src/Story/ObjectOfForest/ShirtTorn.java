package Story.ObjectOfForest;

public class ShirtTorn extends Exception{
    public ShirtTorn(String massage){
        super(massage);
    }
    @Override
    public String getMessage(){
        return "Рубашка порвалась и Тигр остался жить на дереве";
    }
}
