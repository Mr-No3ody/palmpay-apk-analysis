package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class U implements CaptureStage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f13981a;

    public U() {
        HashSet hashSet = new HashSet();
        C0992m0 c0992m0B = C0992m0.b();
        ArrayList arrayList = new ArrayList();
        C0996o0 c0996o0A = C0996o0.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        C1000q0 c1000q0A = C1000q0.a(c0992m0B);
        ArrayList arrayList3 = new ArrayList(arrayList);
        O0 o10 = O0.f13940b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c0996o0A.f13941a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        this.f13981a = new T(arrayList2, c1000q0A, -1, false, arrayList3, false, new O0(arrayMap), null);
    }

    @Override // androidx.camera.core.impl.CaptureStage
    public final T getCaptureConfig() {
        return this.f13981a;
    }

    @Override // androidx.camera.core.impl.CaptureStage
    public final int getId() {
        return 0;
    }
}
