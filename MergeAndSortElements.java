package LinkedList;

import java.util.*;
class MergeAndSortElements{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,n1;
    ArrayList al=new ArrayList();
    //ArrayList all=new ArrayList();
    while(true){
      n=sc.nextInt();
      //n1=sc.nextInt();
      
      if(n==-1)
      break;
      else{
        al.add(n);
        Collections.sort(al);
        //all.add(n1);
      }
    }
    
    ArrayList all=new ArrayList();
    while(true){
      n1=sc.nextInt();
      if(n1==-1)
      break;
      else{
        all.add(n1);
        Collections.sort(all);
      }
    }
    
    al.addAll(all);
        Collections.sort(al);
    for(int i=0;i<al.size();i++){
    System.out.print(al.get(i)+" ");
    }
    
    
    
    
  }
}