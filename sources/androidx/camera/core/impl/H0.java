package androidx.camera.core.impl;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f13879i = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0987k f13881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f13883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SessionConfig$ErrorListener f13885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T f13886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InputConfiguration f13887h;

    public H0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, T t, SessionConfig$ErrorListener sessionConfig$ErrorListener, InputConfiguration inputConfiguration, C0987k c0987k) {
        this.f13880a = arrayList;
        this.f13882c = Collections.unmodifiableList(arrayList2);
        this.f13883d = Collections.unmodifiableList(arrayList3);
        this.f13884e = Collections.unmodifiableList(arrayList4);
        this.f13885f = sessionConfig$ErrorListener;
        this.f13886g = t;
        this.f13887h = inputConfiguration;
        this.f13881b = c0987k;
    }

    public static H0 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        C0992m0 c0992m0B = C0992m0.b();
        ArrayList arrayList5 = new ArrayList();
        C0996o0 c0996o0A = C0996o0.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        C1000q0 c1000q0A = C1000q0.a(c0992m0B);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        O0 o10 = O0.f13940b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = c0996o0A.f13941a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new H0(arrayList, arrayList2, arrayList3, arrayList4, new T(arrayList6, c1000q0A, -1, false, arrayList7, false, new O0(arrayMap), null), null, null, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (C0987k c0987k : this.f13880a) {
            arrayList.add(c0987k.f14094a);
            Iterator it = c0987k.f14095b.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC0970b0) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
