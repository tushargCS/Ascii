abstract class Compartment {
          public abstract String  notice();
}

class Firstclass extends Compartment{
@override
public abstract String  notice(){
system.out.primtln("first class");
}
}

class Ladies extends Compartment{
@override
public abstract String notice(){
system.out.println("Ladies");
}
}

class GeneralLuggage extends Compartment{
@override
public abstract String notice(){
sysytem.out.println("general luggage");
}
}

class TestCompartment {
public static void main(String [] args){
Compartment c[] = new Compartment[10];
		double i = Math.random()*5;
		int x = (int)i;
		System.out.println(x);
		
		switch(x)
		{

		case 1: c[0] = new GeneralLuggage();
		            c[0].notice();
		            break;
		
		case 2: c[1] = new Ladies();
                            c[1].notice();
                            break;
        
		case 3: c[2] = new Firstclass();
                            c[2].notice();
                            break;
        
        
                default: System.out.println("Invalid");

		}

	}

}

}
}
