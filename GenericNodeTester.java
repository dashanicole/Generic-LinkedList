public class GenericNodeTester {
   public static void main(String[] args) {
      GenericNode<Integer> nodeA = new GenericNode<Integer>(1);
      GenericNode<Integer> nodeB = new GenericNode<Integer>(2);
      nodeA.setNext(nodeB);
      GenericNode<Integer> nodeC = new GenericNode<Integer>(3);
      nodeB.setNext(nodeC);
      GenericNode<Integer> nodeD = new GenericNode<Integer>(4);
      nodeC.setNext(nodeD);
      GenericNode<Integer> nodeE = new GenericNode<Integer>(5);
      nodeD.setNext(nodeE);
      
      System.out.println(nodeA);
      System.out.println(nodeA.getNext());
      System.out.println(nodeA.getNext().getNext());
      System.out.println(nodeA.getNext().getNext().getNext());
      System.out.println(nodeA.getNext().getNext().getNext().getNext());
   }
}