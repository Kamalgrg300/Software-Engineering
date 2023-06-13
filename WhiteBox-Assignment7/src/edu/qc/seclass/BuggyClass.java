package edu.qc.seclass;

public class BuggyClass {
   public static int buggyMethod1(int p, int q) {
         int outcome = 0;
         if (p < q) {
            outcome = q / p;
         }
         else if (p > q)
         {
            outcome = p / q;
         }
         else {
            return 1;
         }
         return outcome;
      }  //End of buggyMethod1

      public static int buggyMethod2 ( int p, int q){
         int outcome = 0;

         if (p < q) {
            outcome = q / p;
         } else if (p > q)
         {
            outcome = p / q;
         } else
         {
            return 1;
         }

         return outcome;
      } // End of buggyMethod2

      public void buggyMethod3 (){
         /* I was not able to get 100% branch coverage and 100% statement coverage at the same time. one of the branches between branch or statements has to be less. so that, both coverage having 100% don't exist.  */
      }

      public void buggyMethod4 () {
        /* Since branch coverage exceeds the statement coverage, there won't be 100% statement coverage which have the fault.
        Likewise, branch coverage that shows 100% and it can't have the fault. */
      }

      public void buggyMethod5() {
        /* Since there exist exception because of division by zero while running buggyMethod 3 and 4,
        there won't be 100% statement coverage.

        */
      }
   } //End of BuggyClass



