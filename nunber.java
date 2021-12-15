//Q9. Create class Number with only one private instance variable as a int primitive type.
//        Initialize it with parameterised constructor and include the following methods
//        isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong()
//        the above methods return boolean primitive type value.
//        getFactorial(), getSqrt(), getSqr(), sumDigits()
//        these methods return int primitive type value.
//        dispBinary(), dispOctal(), displayhexa() these method return string value

public class Number {
    private int a;
    public Number(int a){
        this.a= a;
    }
    public boolean isZero(){
        if(a==0)
        return true;
        else
            return false;
    }
    public boolean isPositive(){
        if(a>0){
            return true;
        }
        else
            return false;
    }
    public boolean isNegative(){
        if(a<0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isOdd(){
        if(a%2==0)
            return false;
        else
            return false;
    }
    public boolean isEven(){
        if(a%2==0)
            return true;
        else
            return false;
    }
    public boolean isPrime() {
   int i;
    for(i=2;i<a;i++) {
        if (a % i == 0) {
            break;
        }
    }            if(a==i)
                return true;
            else
                return false;
    }
    public boolean isAmstrong(){
        int c=a;
        int b=a,sum=0;
        while(b>0){
            b=a%10;
            sum=(b*b*b)+sum;
            b=a/10;
            a=b;}
        if(sum==c){
            return true;}
            else
                return false;
        }
        public int getFactorial(){
        int s=1;
        while(a>0){
            s=s*a;
            a--;
         }
        return s;
        }
        public double getSqrt(){
        double s;
        s= Math.pow(a ,0.5);
        return s;
        }
        public int getSqr(){
           a=a*a;
           return a;
    }
    public int sumDigits(){
        int b=a,sum=0;
        while(b>0){
            b=a%10;
            sum=b+sum;
            b=a/10;
            a=b;}
        return sum;
    }
    public String displayBinary(){
        Integer b;
        String sum= " is a binary";
        while(a>0){
        b=a%2;
         String s=b.toString();
         sum= s+sum;
         a=a/2;}
        return sum;
    }
    public String disOctal(){
        Integer b;
        String sum= " is a octal";
        while(a>0){
            b=a%8;
            String s=b.toString();
            sum= s+sum;
            a=a/8;}
        return sum;
    }
    public String disHexa(){
        Integer b;
        String sum= " is a octal";
        while(a>0){
            b=a%16;
            String s=b.toString();
            sum= s+sum;
            a=a/16;}
        return sum;
    }

    public static void main(String[] args) {
        Number obj= new Number(63);
        System.out.println(obj.disHexa());
    }
    }
