import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {
    for(int j=0;j<list.length-1;j++)
    {
      for(int i=0;i<list.length-j-1;i++)
      {
        if(list[i]>list[i+1])
        {
          int temp = list[i];
          list[i]=list[i+1];
          list[i+1]=temp;
        }
      }
    }
  }

  public void selectionSort(int[] list)
  {
    int flag, temp;
    for(int outer=0;outer<list.length-1;outer++)
    {
      flag=outer;
      for(int inner=outer+1;inner<list.length;inner++)
      {
        if(list[inner]<list[outer])
        {
          flag=inner;
        }
      }
      temp=list[outer];
      list[outer]=list[flag];
      list[flag]=temp;
    }
  }

  public void insertionSort(int[] list)
  {
    //your code here
  }

  private void merge(int[] a, int first, int mid, int last)
  {
    //your code here
  }

  public void mergeSort(int[] a, int first, int last)
  {
    //your code here
  }
}

