package com.umutdogan.dev.algorithms.search;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinearSearchTest
{
   private LinearSearch linearSearch;

   @BeforeEach
   void init()
   {
      linearSearch = new LinearSearch();
   }

   @Test
   public void testLinearSearchWithStandardArrayFound()
   {
      int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
      int expectedResult = 2;
      assertEquals(expectedResult, linearSearch.search(arr, 2));
   }

   @Test
   public void testLinearSearchWithStandardArrayNotFound()
   {
      int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
      int expectedResult = -1;
      assertEquals(expectedResult, linearSearch.search(arr, 11));
   }

   @Test
   public void testLinearSearchWithBlankArray()
   {
      int[] arr = {};
      int expectedResult = -1;
      assertEquals(expectedResult, linearSearch.search(arr, 2));
   }

   @Test()
   public void testLinearSearchWithNullArray()
   {
      int[] arr = null;
      assertThrows(NullPointerException.class, () -> {linearSearch.search(arr, 1);});
   }
}