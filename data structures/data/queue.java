package data;
import java.util.*;
public class queue
{
Scanner s=new Scanner(System.in);
public
 int q[]=new int[3];
public
 int front=-1;
int rear=-1;
public void enq()
 {  
System.out.println("Enter a element:");
                  int item=s.nextInt();
    if(front==-1)
     front=0;
    rear++;
    q[rear]=item;
 }
 public void  deq()
  {
   
    if(front==-1||rear<0)
     System.out.println("Queue is empty");
   else
    {int p=q[front];
     
   System.out.println("Deleted element is:"+p);  
 front++;
}
  }
public void display()
{
       int i; 
                    if(front==-1||rear<0)
                       System.out.println("Queue is empty");
else
{
                       System.out.println("Display");
                     for(i=front;i<=rear;i++)
                     {
                       System.out.println(q[i]+ " ");
                     }
                     System.out.println();
}
}
public void callqueue()
{
 do
    {
      System.out.println("Enter 1.enqueue 2.dequeue 3.display");
      System.out.println("Enter your choice:");
      int ch=s.nextInt();
      switch(ch)
      {
        case 1:
        if(rear==2)
        System.out.println("queue is full");
        else
        {
                  
                  enq();
        }
                  break;
        case 2:
               deq();
        break;
        case 3:
           display();
                     break;
         default:
                   System.out.println("Invalid choice");
System.exit(0);
                   break;
               }
              }while(true);
}
}
