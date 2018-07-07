package com.umutdogan.dev.algorithms.search;

public class LinearSearch
{
   // This function returns index of element x in arr[]
   public int search(int arr[], int x)
   {
      if(arr == null)
      {
         throw new NullPointerException();
      }

      for (int i = 0; i < arr.length; i++)
      {
         // Return the index of the element if the element
         // is found
         if (arr[i] == x)
            return i;
      }

      // return -1 if the element is not found
      return -1;
   }
}