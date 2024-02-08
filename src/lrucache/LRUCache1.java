package lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache1<K extends Comparable<K> , V extends  Comparable<V>> {

    Map<K,CacheNode<V>> cache = new HashMap<>();
    DoubleLinkedList1<V> linkedList = new DoubleLinkedList1<>();



    V get(K key){

        return null;
    }

    boolean put(K key, V value){
        CacheNode<V> newValue = new CacheNode<>(value);
        CacheNode<V> cachedValue = cache.get(key);
        if(null != cachedValue){
            linkedList.detachNode(cachedValue);
            cache.put(key, newValue);
            linkedList.moveTotart(cachedValue);
        }else {
            linkedList.addFromStart(value);
            cache.put(key,newValue);
        }

        return false;
    }

}
