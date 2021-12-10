class Point{
private int x,y;
public Point (){
} 
public Point(int x,int y){
this.x=x;
this.y=y;
} 
public void Setx(int x){ this.x=x; }
public void Sety(int y){ this.y=y; }
public void Setxy(int x,int y){
this.x=x;
this.y=y;
}
public static void main(String[] args){
  Point obj= new Point(2,3);
   obj.setx(2);
   obj.sety(3);
     obj.setxy(2.3);
   
}
}
////////////////////////////////////////

interface Test{
void Square();
}

class Arithmetic implements Test{
@override
public void Square(){



}


}

class TO_Test{
Arithmetic obj= new Arithmetic();
}
////////////////////////////////////////


class Outer {
public void Display(){     }
class Inner{
public void Display(){      }
}
public Static void main(String args[]){
        outer obj= new outer();
         outer.inner obj1= obj.new inner();
          obj.Display();
           obj1.Display();
}
}


