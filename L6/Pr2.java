import java.io.Console;

class Pr2
{
public static void main(String args[])
{
Console c = System.console();
int data[] = new int[0];

while (true)
{
int op = Integer.parseInt(c.readLine("1 add, 2 view, 3 delete, and 4 exit"));
}
if(op == 1)
{
int cs = data.length;
int ndata[] = new int[cs+1];
System.arraycopy(data,0,ndata,0,data.length);
ndata[ndata.length - 1] = Integer.parseInt(c.readLine("enter length"));
data = ndata;
}
else if (op == 2)
{
for (int i: data)
System.out.println(i + " ");
System.out.println();
}
else if (op == 3)
{
int re = Integer.parseInt(c.readLine("enter the element to remove"));
int pos;
boolean found = false;
for (pos = 0;pos < data.length;pos++)
{
if (re == data[pos])
{
found = true;
break;
}
}
}
if (found)
{
int cs = data.length;
int ndata[] = new int[cs-1];
System.arraycopy(data, 0, ndata, 0, pos);
System.arraycopy(data, pos+1, ndata, pos, data.length - pos - 1);
data = ndata;
}
else
{
System.out.println("element not found");
}
if (op == 4)
{
break;
}
}
}