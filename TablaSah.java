public class TablaSah {
    private static final int  nrLines = 8;
    private static final int  nrColumns = 8;
    private char mat[][] = {

    };
    public TablaSah() {
        mat = new char[nrLines][nrColumns];
    }
    public void MatHandler(){
        mat = new char[nrLines][nrColumns];
        initializeMat();
    }
    private void initializeMat() {
        for (int i = 0; i < nrColumns; i++) {
            for (int j = 0; j < nrLines; j++) {
                mat[i][j] = '_';
            }
        }
    }
    public char[][] getTablaSah(){
        return mat;
    }
    public char getElement(int i, int j){
        return mat[i][j];
    }
    public void setElement(int i, int j,char val){
        mat[i][j] = val;
    }
    public void afisareMatrice(char mat[][]){
        for(int i = 0; i < nrLines; i++){
            for(int j = 0; j < nrColumns; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public char[][] getMat(){
        return mat;
    }
}
