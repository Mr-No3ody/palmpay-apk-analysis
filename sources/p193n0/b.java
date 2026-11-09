package p193n0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f39807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sd.b f39808b;

    public b(LinkedHashMap preferencesMap, boolean z3) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f39807a = preferencesMap;
        this.f39808b = new Sd.b(z3);
    }

    @Override // p193n0.g
    public final Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.f39807a.entrySet();
        int iA = F.a(r.l(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap map = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            map.put(pair.f38891a, pair.f38892b);
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f39808b.f8871b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        this.f39807a.remove(key);
    }

    public final void d(e key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        e(key, obj);
    }

    public final void e(e key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b();
        if (obj == null) {
            c(key);
            return;
        }
        boolean z3 = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.f39807a;
        if (z3) {
            Set set = (Set) obj;
            Intrinsics.checkNotNullParameter(set, "set");
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.b0(set));
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(key, setUnmodifiableSet);
            return;
        }
        if (!(obj instanceof byte[])) {
            linkedHashMap.put(key, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        linkedHashMap.put(key, bArrCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    public final boolean equals(Object obj) {
        boolean zC;
        if (obj instanceof b) {
            b bVar = (b) obj;
            LinkedHashMap linkedHashMap = bVar.f39807a;
            LinkedHashMap linkedHashMap2 = this.f39807a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = bVar.f39807a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zC = Intrinsics.c(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zC = true;
                                } else {
                                    zC = false;
                                }
                            } else {
                                zC = false;
                            }
                            if (!zC) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f39807a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.J(this.f39807a.entrySet(), ",\n", "{\n", "\n}", a.f39806a, 24);
    }

    public /* synthetic */ b(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
