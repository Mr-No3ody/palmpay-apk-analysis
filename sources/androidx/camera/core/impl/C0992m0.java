package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.camera.core.impl.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0992m0 extends C1000q0 implements MutableConfig {
    public static C0992m0 b() {
        return new C0992m0(new TreeMap(C1000q0.f14124b));
    }

    public static C0992m0 c(Config config) {
        TreeMap treeMap = new TreeMap(C1000q0.f14124b);
        for (V v3 : config.listOptions()) {
            Set<W> priorities = config.getPriorities(v3);
            ArrayMap arrayMap = new ArrayMap();
            for (W w3 : priorities) {
                arrayMap.put(w3, config.retrieveOptionWithPriority(v3, w3));
            }
            treeMap.put(v3, arrayMap);
        }
        return new C0992m0(treeMap);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public final void insertOption(V v3, Object obj) {
        insertOption(v3, W.f13997d, obj);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public final Object removeOption(V v3) {
        return this.f14126a.remove(v3);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public final void insertOption(V v3, W w3, Object obj) {
        TreeMap treeMap = this.f14126a;
        Map map = (Map) treeMap.get(v3);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(v3, arrayMap);
            arrayMap.put(w3, obj);
            return;
        }
        W w6 = (W) Collections.min(map.keySet());
        if (Objects.equals(map.get(w6), obj) || !Config.hasConflict(w6, w3)) {
            map.put(w3, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + ((C0971c) v3).f14031a + ", existing value (" + w6 + ")=" + map.get(w6) + ", conflicting (" + w3 + ")=" + obj);
    }
}
