package abc;

import java.util.Scanner;

public class circular_linkedlist {
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	Node root;
	
	circular_linkedlist(){
		root=null;
	}
	
	void insert(int data)
	{
		Node temp=new Node(data);
		if(root==null) {
			root=temp;
			return;
		}
		Node t=root;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.next=temp;
		
	}
	
   	 void rotate()
	{
   
   	        Node current  = root; 
   	  
   	        while (current.next.next !=  null) 
   	        { 
   	            current = current.next; 
   	        } 
   	       
   	        current.next.next = root; 
   	        root = current.next; 
            current.next = null; 
   	 
		
	}
	
	
	void print()
	{
		Node temp=root;
		while(temp!=null)
		{
		     System.out.print(temp.data+" ");
		     temp=temp.next;
		}
	}


	public static void main(String[] args) {
		
		circular_linkedlist obj=new circular_linkedlist();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of terms");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			obj.insert(sc.nextInt());
		}
		System.out.println("enter the value of k");
		int k=sc.nextInt();
		System.out.println("before rotate");
		obj.print();
		for(int j=0;j<k;j++)
		{
	    obj.rotate();
		}
		System.out.println();
		System.out.print("after rotate");
		System.out.println();
		obj.print();
		
	}
	
	}



