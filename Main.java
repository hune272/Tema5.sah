//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TablaSah myTable = new TablaSah();
        myTable.MatHandler();
        Pion myPion = new Pion(2,3, "Pion" , 'P', myTable);
        Nebun myNebun = new Nebun(5,5, "Nebun" , 'N', myTable);
        myTable.afisareMatrice(myTable.getMat());
        System.out.println("-----------------------------");
        myTable.setElement(2,3, myPion.getSign());
        myTable.afisareMatrice(myTable.getMat());
        System.out.println("-----------------------------");
        myPion.mutare(3,3, myPion.getSign() ,myTable);
        myTable.afisareMatrice(myTable.getMat());
        System.out.println("-----------------------------");
        myTable.setElement(5, 5, myNebun.getSign());
        myTable.afisareMatrice(myTable.getMat());
        System.out.println("-----------------------------");
        myNebun.mutare(6,6, myNebun.getSign() ,myTable);
        myTable.afisareMatrice(myTable.getMat());
        }
    }
    //plus nebun pion si sa arate numele figurei