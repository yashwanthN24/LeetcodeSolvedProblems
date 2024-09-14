class Solution {
   public List<Integer> grayCode(int n) {
      ArrayList list=new ArrayList();
       for(int i=0;i<(1<<n);i++){
         list.add(i^(i>>1));
       }
         return list;
    }
}


//  n = 2 


// 0 to 2^n-1 

// 0 1 2 3 i/p 
// 0 1 3 2 o/p do XOR
// ------------

// 0 0 1 1  // this should XOR with i/p to get o/p this sequence is nothing but i>> 2 where i = 0 to 2^n-1 ;


// so its i ^ (i >> 1); this is  the number in output add to list