//Q3. Initialize an integer array with ascii values and print the corresponding character values in a single row.
// 70  F
// 76  L
// 103  g
public class Ascii {
public void main() {
    int AA[]= {70,76,103};
    for(int i=0;i< AA.length;i++){
        System.out.printf("%c  ",AA[i]);
    }}

    public static void main(String[] args) {
        Ascii obj= new Ascii();
        obj.main();
    }
}
