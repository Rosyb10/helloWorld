package generic;

public class GM {

	public static void main(String[] args) {
		
		Character[] array = {'a','s','d'};
		Integer[] arr = {5,77,8,34,56,7,22,6};
		
		for(int i:arr) {
			System.out.println(i);
		}
         abc(arr);
         abc(array);
        
       String[] jkl = {"sdfs","sfsdf","sfdf"};
       
       printStr(jkl);
	}
	
	public static void abc(int[] a) {
        
		for(int i:a) {
			System.out.println(i);
		}
	}
	
   public static void printStr(String[] a) {
        
		for(String i:a) {
			System.out.println(i);
		}
	}
   //Creating generic method :generic method avoids to create multiple methods for varying data type
   public static <E> void abc(E[] arrayName) {
	   
	   for(E i:arrayName) {
			System.out.println(i);
   }
	

}
}
