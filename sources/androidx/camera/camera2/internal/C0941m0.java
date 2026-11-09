package androidx.camera.camera2.internal;

import android.content.Context;
import android.util.ArrayMap;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0996o0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0941m0 implements UseCaseConfigFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0966z0 f13598b;

    public C0941m0(Context context) {
        this.f13598b = C0966z0.b(context);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0038  */
    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public final Config getConfig(androidx.camera.core.impl.T0 t1, int i7) {
        int i10;
        C0992m0 c0992m0B = C0992m0.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        C0992m0 c0992m0B2 = C0992m0.b();
        ArrayList arrayList = new ArrayList();
        C0996o0 c0996o0A = C0996o0.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = t1.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 3) {
                i10 = 1;
            } else {
                i10 = 3;
            }
        } else if (i7 == 2) {
            i10 = 5;
        } else {
            i10 = 1;
        }
        C0971c c0971c = UseCaseConfig.f13982K;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        C1000q0 c1000q0A = C1000q0.a(c0992m0B2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        androidx.camera.core.impl.O0 o10 = androidx.camera.core.impl.O0.f13940b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c0996o0A.f13941a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        c0992m0B.insertOption(c0971c, new androidx.camera.core.impl.H0(arrayList5, arrayList6, arrayList7, arrayList8, new androidx.camera.core.impl.T(arrayList9, c1000q0A, i10, false, arrayList10, false, new androidx.camera.core.impl.O0(arrayMap), null), null, null, null));
        c0992m0B.insertOption(UseCaseConfig.f13984O, C0939l0.f13584a);
        HashSet hashSet2 = new HashSet();
        C0992m0 c0992m0B3 = C0992m0.b();
        ArrayList arrayList11 = new ArrayList();
        C0996o0 c0996o0A2 = C0996o0.a();
        int iOrdinal2 = t1.ordinal();
        int i11 = iOrdinal2 != 0 ? iOrdinal2 != 3 ? 1 : 3 : i7 == 2 ? 5 : 2;
        C0971c c0971c2 = UseCaseConfig.f13983N;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        C1000q0 c1000q0A2 = C1000q0.a(c0992m0B3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        androidx.camera.core.impl.O0 o11 = androidx.camera.core.impl.O0.f13940b;
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = c0996o0A2.f13941a;
        for (String str2 : arrayMap4.keySet()) {
            arrayMap3.put(str2, arrayMap4.get(str2));
        }
        c0992m0B.insertOption(c0971c2, new androidx.camera.core.impl.T(arrayList12, c1000q0A2, i11, false, arrayList13, false, new androidx.camera.core.impl.O0(arrayMap3), null));
        c0992m0B.insertOption(UseCaseConfig.f13985P, t1 == androidx.camera.core.impl.T0.f13974a ? L0.f13227b : P.f13245a);
        androidx.camera.core.impl.T0 t3 = androidx.camera.core.impl.T0.f13975b;
        C0966z0 c0966z0 = this.f13598b;
        if (t1 == t3) {
            c0992m0B.insertOption(ImageOutputConfig.f13901F, c0966z0.e());
        }
        c0992m0B.insertOption(ImageOutputConfig.f13906x, Integer.valueOf(c0966z0.c(true).getRotation()));
        if (t1 == androidx.camera.core.impl.T0.f13977d || t1 == androidx.camera.core.impl.T0.f13978e) {
            c0992m0B.insertOption(UseCaseConfig.f13988T, Boolean.TRUE);
        }
        return C1000q0.a(c0992m0B);
    }
}
