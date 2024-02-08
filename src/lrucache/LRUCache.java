package lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache< K extends Comparable<K>,V extends Comparable<V>> {

    Map<K,CacheNode<V>> iCache = new HashMap<>();
    DList<V> linkedList = new DList<>();

    void put(K key, V value){
        CacheNode<V> node = new CacheNode<>(value);

        CacheNode<V> cacheNode = iCache.get(key);
        if(null != cacheNode){
            node = linkedList.moveOnTop(cacheNode);
            node.data = value;
        }else {
            node = linkedList.addOnTop(value);
        }
        iCache.put(key,node);
    }

    void printCache(){
        linkedList.printFromTop();
    }


    public static void main(String[] args){
        LRUCache<Integer,String> c = new LRUCache<>();
        c.put(5,"five");
        c.put(8,"eight");
        c.put(10,"ten");
        c.put(15,"fifteen");
        c.put(8,"updatedEight");
        c.printCache();
    }

}
