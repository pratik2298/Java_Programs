interface Center
{
void nrc();
default void cab(){
System.out.println(" center will do ");
}
}

class Mah implements Center{
public void nrc()
{
System.out.println(" mah will do ");
}

}

class Demo{
public static void main(String args[])
{
Mah m = new Mah();
m.nrc();
m.cab();


/* this is lambda expression 
Center g = () -> {System.out.println("guj will do it");};
g.nrc();
g.cab();  */
}
}