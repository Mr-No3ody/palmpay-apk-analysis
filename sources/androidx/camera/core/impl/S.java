package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f13955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0992m0 f13956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0996o0 f13961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CameraCaptureResult f13962h;

    public S() {
        this.f13955a = new HashSet();
        this.f13956b = C0992m0.b();
        this.f13957c = -1;
        this.f13958d = false;
        this.f13959e = new ArrayList();
        this.f13960f = false;
        this.f13961g = C0996o0.a();
    }

    public final void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((AbstractC0999q) it.next());
        }
    }

    public final void b(AbstractC0999q abstractC0999q) {
        ArrayList arrayList = this.f13959e;
        if (arrayList.contains(abstractC0999q)) {
            return;
        }
        arrayList.add(abstractC0999q);
    }

    public final void c(Config config) {
        for (V v3 : config.listOptions()) {
            this.f13956b.retrieveOption(v3, null);
            this.f13956b.insertOption(v3, config.getOptionPriority(v3), config.retrieveOption(v3));
        }
    }

    public final T d() {
        ArrayList arrayList = new ArrayList(this.f13955a);
        C1000q0 c1000q0A = C1000q0.a(this.f13956b);
        int i7 = this.f13957c;
        boolean z3 = this.f13958d;
        ArrayList arrayList2 = new ArrayList(this.f13959e);
        boolean z8 = this.f13960f;
        O0 o10 = O0.f13940b;
        ArrayMap arrayMap = new ArrayMap();
        C0996o0 c0996o0 = this.f13961g;
        for (String str : c0996o0.f13941a.keySet()) {
            arrayMap.put(str, c0996o0.f13941a.get(str));
        }
        return new T(arrayList, c1000q0A, i7, z3, arrayList2, z8, new O0(arrayMap), this.f13962h);
    }

    public S(T t) {
        HashSet hashSet = new HashSet();
        this.f13955a = hashSet;
        this.f13956b = C0992m0.b();
        this.f13957c = -1;
        this.f13958d = false;
        ArrayList arrayList = new ArrayList();
        this.f13959e = arrayList;
        this.f13960f = false;
        this.f13961g = C0996o0.a();
        hashSet.addAll(t.f13966a);
        this.f13956b = C0992m0.c(t.f13967b);
        this.f13957c = t.f13968c;
        arrayList.addAll(t.f13970e);
        this.f13960f = t.f13971f;
        ArrayMap arrayMap = new ArrayMap();
        O0 o10 = t.f13972g;
        for (String str : o10.f13941a.keySet()) {
            arrayMap.put(str, o10.f13941a.get(str));
        }
        this.f13961g = new C0996o0(arrayMap);
        this.f13958d = t.f13969d;
    }
}
