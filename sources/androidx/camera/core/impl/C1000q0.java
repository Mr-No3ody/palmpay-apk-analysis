package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: androidx.camera.core.impl.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1000q0 implements Config {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0998p0 f14124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1000q0 f14125c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f14126a;

    static {
        C0998p0 c0998p0 = new C0998p0(0);
        f14124b = c0998p0;
        f14125c = new C1000q0(new TreeMap(c0998p0));
    }

    public C1000q0(TreeMap treeMap) {
        this.f14126a = treeMap;
    }

    public static C1000q0 a(Config config) {
        if (C1000q0.class.equals(config.getClass())) {
            return (C1000q0) config;
        }
        TreeMap treeMap = new TreeMap(f14124b);
        for (V v3 : config.listOptions()) {
            Set<W> priorities = config.getPriorities(v3);
            ArrayMap arrayMap = new ArrayMap();
            for (W w3 : priorities) {
                arrayMap.put(w3, config.retrieveOptionWithPriority(v3, w3));
            }
            treeMap.put(v3, arrayMap);
        }
        return new C1000q0(treeMap);
    }

    @Override // androidx.camera.core.impl.Config
    public final boolean containsOption(V v3) {
        return this.f14126a.containsKey(v3);
    }

    @Override // androidx.camera.core.impl.Config
    public final void findOptions(String str, Config.OptionMatcher optionMatcher) {
        for (Map.Entry entry : this.f14126a.tailMap(new C0971c(str, Void.class, null)).entrySet()) {
            if (!((C0971c) ((V) entry.getKey())).f14031a.startsWith(str) || !optionMatcher.onOptionMatched((V) entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.Config
    public final W getOptionPriority(V v3) {
        Map map = (Map) this.f14126a.get(v3);
        if (map != null) {
            return (W) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + v3);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set getPriorities(V v3) {
        Map map = (Map) this.f14126a.get(v3);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public final Set listOptions() {
        return Collections.unmodifiableSet(this.f14126a.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public final Object retrieveOption(V v3) {
        Map map = (Map) this.f14126a.get(v3);
        if (map != null) {
            return map.get((W) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + v3);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object retrieveOptionWithPriority(V v3, W w3) {
        Map map = (Map) this.f14126a.get(v3);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + v3);
        }
        if (map.containsKey(w3)) {
            return map.get(w3);
        }
        throw new IllegalArgumentException("Option does not exist: " + v3 + " with priority=" + w3);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object retrieveOption(V v3, Object obj) {
        try {
            return retrieveOption(v3);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }
}
