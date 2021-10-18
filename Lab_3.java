
/** Heading  **********************************************/
/*	Your name:
		Class block: 				Date Started:
		Lab Number:
		Title:
		Purpose:
*/
//import SarahLibrary.*;

public class Lab_3{

   customArrays customArrays2 = new customArrays();

  public Lab_3(){
    int[] array = new int[(int)(Math.random()*21+30)];
    
    for (var i = 0; i < array.length; i++){
      array[i]=(int)(Math.random()*201-100);
    }

    customArrays2.display(array);
  }

}