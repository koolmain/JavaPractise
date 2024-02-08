package lrucache;

public class DoubleLinkedList1<T> {

    private  CacheNode<T> start;
    private CacheNode<T> end;

    CacheNode<T> getSart(){
        return start;
    }

    CacheNode<T> getEnd(){
        return end;
    }

    public CacheNode<T> addFromStart(T data){

        CacheNode<T> node = new CacheNode<>(data);
        addFromStartWithNode(node);
        return node;
    }

    public void addFromStartWithNode(CacheNode<T> node){
        if(this.start == null){
            start = node;
            end = node;
        }else {
            node.next = start;
            start.pre = node;
            start = node;
        }
    }

    public void printFromStart(){
        CacheNode<T> node = start;
        while(null != node){
            System.out.print(node.data + " --> ");
            node = node.next;
        }
    }

    public void printFromEnd(){
        CacheNode<T> node = end;
        while(null != node){
            System.out.print(node.data + " <-- " );
            node = node.pre;
        }
    }

    public <N extends CacheNode> N detachNode(N node){
        if(null != node){
            node.next = null;
            node.pre = null;
        }
        return node;
    }

    public <N extends CacheNode> void moveTotart(N node){
        if(null != node){
            node.pre.next = node.next;
            node.next.pre =  node.pre;
            addFromStartWithNode(node);
        }
    }

    public void addToEnd(T data){
        CacheNode<T> node = new CacheNode<>(data);
        if(this.end == null){
            start = node;
            end = node;
        }else {
            end.next = node;
            node.pre = end;
            end = node;
        }
    }

    public static void main(String[] args){
        DoubleLinkedList1<Integer> dList = new DoubleLinkedList1<>();
        dList.addFromStart(7);
        dList.addFromStart(9);
        dList.addFromStart(45);
        dList.addFromStart(44);
        dList.addFromStart(33);

        dList.printFromStart();
        System.out.println();
        dList.printFromEnd();

    }
}
