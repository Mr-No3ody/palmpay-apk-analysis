package p075f2;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public void put(String uri, b meta, Map<String, Map<String, b>> data) {
        Map<String, b> concurrentHashMap = data.get("RegexRouter");
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            data.put("RegexRouter", concurrentHashMap);
        }
        concurrentHashMap.put(uri, meta);
    }

    public void put(Class<?> clz, b meta, Map<Class<?>, Set<b>> data) {
        Set<b> setNewSetFromMap = data.get(clz);
        if (setNewSetFromMap == null) {
            setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            data.put(clz, setNewSetFromMap);
        }
        setNewSetFromMap.add(meta);
    }
}
