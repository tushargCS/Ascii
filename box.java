class Box{
int length,breath,height;
class Box(int l,int b,int h){
length= l;
breath= b;
height=h;
}
public void AREA (){
int area=length*breath;
System.out.println(area);
}
public void VOLUME(){
int s= lenght*breath*height;
System.out.println(s);
}
}
class Box3d extends Box{
    
public static void main(String[] args){
Box obj= new Box(2,3,3);
obj.AREA();
}
}
