package lrucache;

public class DList<T> {

    CacheNode<T> start;
    CacheNode<T> end;


    public CacheNode<T> addOnTop(T value){
        CacheNode<T> node = new CacheNode<>(value);
        if(null != start ){
          node.next = start;
          start.pre = node;

        }
        start = node;
        return node;
    }

    public void printFromTop(){
        CacheNode<T> node = start;
        while(null != node){
            System.out.print(node.data+" --> ");
            node = node.next;
        }
    }

    public CacheNode<T> moveOnTop(CacheNode<T> node){
        if(null != node){
            node.pre.next = node.next;
            node.next.pre = node.pre;
            node.pre=null;
            node.next = start;
            start.pre = node;
            start = node;
        }
        return node;
    }

    public static void main(String[] args){
        DList<Integer> linkedList = new DList<>();
        linkedList.addOnTop(5);
        linkedList.addOnTop(23);
        linkedList.addOnTop(33);
        linkedList.addOnTop(11);

        linkedList.printFromTop();
    }




}
