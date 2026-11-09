package androidx.work.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.work.impl.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1276i implements StartStopTokens {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f18564b = new LinkedHashMap();

    @Override // androidx.work.impl.StartStopTokens
    public final boolean contains(androidx.work.impl.model.e id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f18564b.containsKey(id2);
    }

    @Override // androidx.work.impl.StartStopTokens
    public final C1275h remove(androidx.work.impl.model.e id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return (C1275h) this.f18564b.remove(id2);
    }

    @Override // androidx.work.impl.StartStopTokens
    public final C1275h tokenFor(androidx.work.impl.model.e id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        LinkedHashMap linkedHashMap = this.f18564b;
        Object c1275h = linkedHashMap.get(id2);
        if (c1275h == null) {
            c1275h = new C1275h(id2);
            linkedHashMap.put(id2, c1275h);
        }
        return (C1275h) c1275h;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final List remove(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = this.f18564b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.c(((androidx.work.impl.model.e) entry.getKey()).f18587a, workSpecId)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((androidx.work.impl.model.e) it.next());
        }
        return CollectionsKt.Y(linkedHashMap2.values());
    }
}
