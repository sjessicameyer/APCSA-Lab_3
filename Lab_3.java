
/** Heading  **********************************************/
/*	Your name:
		Class block: 				Date Started:
		Lab Number:
		Title:
		Purpose:
*/
//import SarahLibrary.*;

public class Lab_3{

   customArrays customArrays = new customArrays();

  public Lab_3(){
    int[] array = new int[(int)(Math.random()*21+30)];
    

    for (var i = 0; i < array.length; i++){
      array[i]=(int)(Math.random()*201-100);
    }
  
    customArrays.display(array);

    array = sortArray(array);

    customArrays.display(array);

    System.out.println("The mean is: "+mean(array));
    System.out.println("The median is: "+median(array));
    System.out.println("The Mode is: "+mode(array));
    System.out.println("The range is: "+range(array));
    System.out.println("The Standard Deviation is: "+standardDeviation(array));
  }

  public int[] sortArray(int[] array){
    
    int[] revisedArray = customArrays.copyArray(array);
    
    for (var x = 0;x<array.length;x++){
      revisedArray=smallestAfterN(revisedArray, x);
    }

    return revisedArray;
  }

  public int[] smallestAfterN(int[] array, int n){
    int smallestItemPosition=0;

    for (int i=n; i<array.length; i++){
      if (array[i]<array[smallestItemPosition]){
        smallestItemPosition=i;
      }
    }

    int[] revisedArray = new int[0];
    revisedArray= customArrays.copyArray(array);
    
    revisedArray[n]=array[smallestItemPosition];
    revisedArray[smallestItemPosition]=array[n];

    return revisedArray;
  }

  public double mean(int[] array){
    int total=0;
    int sampleSize=0;
    double average=0;

    for (var i=0;i<array.length;i++){
      total= total+array[i];
      sampleSize++;
    }

    average=total/sampleSize;
    return average;
  }

  public double median(int[] array){
    if(array.length%2==1){
      return (array[array.length/2]+array[array.length/2+1])/2;
    }else{
      return array[array.length/2];
    }
  }

  public int mode(int[] array){
    return -1;
  }

  public double range(int[] array){
    return -1.0;
  }

  public double standardDeviation(int[] array){
    return -1.0;
  }
}