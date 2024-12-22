package Activity1;


	import java.util.ArrayList;

	public class Activity9 {
	    public static void main(String[] args) {
	        
	        ArrayList<String> myList = new ArrayList<>();

	        
	        myList.add("Math");
	        myList.add("Phy");
	        myList.add("Champion");
	        myList.add("world");
	        myList.add("Skill");
	        
	        System.out.println("Names in the list:");
	        for (String name : myList) {
	            System.out.println(name);
	        }

	        String thirdName = myList.get(2);
	        System.out.println("\nThe 3rd name in the list is: " + thirdName);

	        
	        boolean containsCharlie = myList.contains("Charlie");
	        System.out.println("\nDoes the list contain 'Charlie'? " + containsCharlie);

	        
	        System.out.println("\nNumber of names in the list: " + myList.size());

	        
	        myList.remove("David");

	        
	        System.out.println("\nNumber of names after removal: " + myList.size());
	    }
	}


