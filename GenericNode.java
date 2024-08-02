public class GenericNode<Integer> {
   private Integer value;
   private GenericNode<Integer> next;
   
   public GenericNode(Integer val) {
      value = val;
      next = null;
   }
   
   public Integer getValue() { return value; }
   public GenericNode<Integer> getNext() { return next; }
   
   public void setValue(Integer val) { value = val; }
   public void setNext(GenericNode<Integer> nxt) { next = nxt; }
   
   public String toString() { return "" + value; }
}
