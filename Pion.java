import java.util.StringJoiner;

public class Pion {
    private int pozX;
    private int pozY;
    TablaSah my_table;
    private String nume;
    private char sign;
    public Pion(int pozX, int pozY, String Nume,char sign, TablaSah my_table) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.nume = nume;
        this.sign = sign;
        this.my_table = my_table;
    }
    public void mutare(int i, int j, char sign, TablaSah my_table) {
        if(i >= 0 && i <= 7 && j >= 0 && j <= 7){
               if(my_table.getElement(i, j) == '_'){
                   if((i - pozX) == 1 && (j - pozY) == 0){
                       my_table.setElement(i, j, sign);
                       my_table.setElement(pozX, pozY, '_');
                       pozX = i;
                       pozY = j;
                   }
               }
               else {System.out.println("Muatare invalida!");}
        }
    }
    public char getSign() {
        return sign;
    }
    public String toString(){
        return pozX + " " + pozY;
    }
}
