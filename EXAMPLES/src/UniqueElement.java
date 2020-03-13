import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class UniqueElement {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		List items= new ArrayList();
		char c;
		do {
			System.out.println("enter a element :");
			int item=in.nextInt();
			items.add(item);
			System.out.println("Do you want to add more(y/n):");
			c=in.next().charAt(0);
			System.out.println(c);
		}
		while(!(c=='n' || c=='N'));
		List UniqueElement= new ArrayList();
		for(Object item :items) {
			if(!UniqueElement.contains(item)) {
				UniqueElement.add(item);
			
		}
		System.out.println("\n\nList of items: ");
			for(Object element: items) {
				System.out.println("\t"+item); 	
			}
			
			System.out.println("\n\nList of unique elements: ");
			for(Object item1
					:UniqueElement ) {
				System.out.println("\t"+item1); 	
			}
			
			
		}
		
		

	}

}
