package com.airtribe.meditrack.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class datastore<T> {
    private Map<String, T> store = new HashMap<>();

    public void add(String id, T obj){
        store.put(id,obj);
    }
    public T get(String id){
        return store.get(id);
    }
    public Collection<T> getAll(){
        return store.values();
    }

    public void remove(String id) {
    }
}
