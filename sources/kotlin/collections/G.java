package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class G extends F {
    public static A c() {
        A a3 = A.f38894a;
        Intrinsics.f(a3, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return a3;
    }

    public static Object d(Map map, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof MapWithDefault) {
            return ((MapWithDefault) map).getOrImplicitDefault(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap e(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap map = new HashMap(F.a(pairs.length));
        i(map, pairs);
        return map;
    }

    public static LinkedHashMap f(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap destination = new LinkedHashMap(F.a(pairs.length));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        i(destination, pairs);
        return destination;
    }

    public static Map g(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length <= 0) {
            return c();
        }
        LinkedHashMap destination = new LinkedHashMap(F.a(pairs.length));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        i(destination, pairs);
        return destination;
    }

    public static LinkedHashMap h(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.a(pairs.length));
        i(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final void i(HashMap map, Pair[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.f38891a, pair.f38892b);
        }
    }

    public static Map j(ArrayList pairs) {
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        int size = pairs.size();
        if (size == 0) {
            return c();
        }
        if (size == 1) {
            return F.b((Pair) pairs.get(0));
        }
        LinkedHashMap destination = new LinkedHashMap(F.a(pairs.size()));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(destination, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            destination.put(pair.f38891a, pair.f38892b);
        }
        return destination;
    }

    public static Map k(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size == 0) {
            return c();
        }
        if (size != 1) {
            return l(linkedHashMap);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap l(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
