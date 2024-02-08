package lrucache;

class CacheNode<T> {
    T data;
    CacheNode<T> pre;
    CacheNode<T> next;

    public CacheNode(T data){
        this.data = data;
        this.pre = null;
        this.next = null;
    }
    public CacheNode(T data, CacheNode<T> pre, CacheNode<T> next){
        this.data = data;
        this.pre = pre;
        this.next = next;
    }
}
