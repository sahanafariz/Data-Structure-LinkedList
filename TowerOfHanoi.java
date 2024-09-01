package LinkedList;

import java.util.Scanner;
public class TowerOfHanoi 
{
        public static void main(String args[])
        {
                int SIZE = 4;
                int[] src= new int[SIZE+1];
                int[] tem= new int[SIZE+1];
                int[] des= new int[SIZE+1];
                int count=0;
               //SRC 
               int S_Top, T_Top, D_Top;
               src[0] = des[0] = tem[0] = Integer.MAX_VALUE;
               for ( S_Top = 1; S_Top <= SIZE; S_Top++)
                {
                        src[S_Top] =SIZE-S_Top +1;
                        des[S_Top] = -1;
                        tem[S_Top ] = -1;
                }
                for ( S_Top = SIZE; S_Top >= 0; S_Top--)
                        System.out.printf("%8d  %8d  %8d\n",src[S_Top] , tem[S_Top],des[S_Top]);  
                //PROCESS
                S_Top = SIZE;
                D_Top = T_Top = 0;
               while (true)
               {
                 //SRC TO DES
                 if(src[S_Top] < des[D_Top])
                 {
                         D_Top++;
                         des[D_Top] = src[S_Top];
                         src[S_Top] = -1;
                         S_Top -=1;
                 }
                 else
                 {
                         S_Top++;
                         src[S_Top] = des[D_Top];
                         des[D_Top] = -1;
                         D_Top -=1;
                 }
                 count++;
                 if (D_Top == SIZE)
                        break;
 
                 //SRC TO TEM
                 if(src[S_Top] < tem[T_Top])
                 {
                         T_Top++;
                         tem[T_Top] = src[S_Top];
                         src[S_Top] = -1;
                         S_Top -=1;
                 }
                 else
                 {
                         S_Top++;
                         src[S_Top] = tem[T_Top];
                         tem[T_Top] = -1;
                         T_Top -=1;
                 }
                 count++;
                 if ( T_Top == SIZE)
                        break;
                  //DES TO TEM
                  if(des[D_Top] < tem[T_Top])
                  {
                          T_Top++;
                          tem[T_Top] = des[D_Top];
                          des[D_Top] = -1;
                          D_Top -=1;
                  }
                  else
                  {
                          D_Top++;
                          des[D_Top] = tem[T_Top];
                          tem[T_Top] = -1;
                          T_Top -=1;
                  }
                  count++;
                  if ( T_Top == SIZE)
                        break;
                  if (D_Top == SIZE)
                        break;
               }

                for ( S_Top = SIZE; S_Top >= 0; S_Top--)
                        System.out.printf("%8d  %8d  %8d\n",src[S_Top] , tem[S_Top],des[S_Top]);  
                System.out.println(count);
        }
}