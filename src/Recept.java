public class Recept{
    private String matRätt;
    private String ingredienser[];
    private int tillagningsTid;

    public Recept(String matRätt, String ingredienser[], int tillagningsTid){
        this.matRätt = matRätt;
        this.ingredienser = ingredienser;
        this.tillagningsTid = tillagningsTid;
    }
}