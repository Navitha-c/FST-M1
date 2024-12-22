package Activity1;


	import java.util.HashMap;
	import java.util.Map;

	public class Activity11 {
	    public static void main(String[] args) {
	        
	        Map<Integer, String> colours = new HashMap<>();

	        colours.put(1, "Red");
	        colours.put(2, "Blue");
	        colours.put(3, "Green");
	        colours.put(4, "Yellow");
	        colours.put(5, "Purple");

	       
	        System.out.println("Initial colours in the Map: " + colours);

	       
	        colours.remove(3);  
	        System.out.println("\nColours after removal: " + colours);

	        
	        boolean containsGreen = colours.containsValue("Green");
	        System.out.println("\nDoes the Map contain 'Green'? " + containsGreen);

	       
	        System.out.println("\nSize of the Map: " + colours.size());
	    }
	}



