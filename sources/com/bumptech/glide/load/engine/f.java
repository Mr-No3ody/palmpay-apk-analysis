package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20645a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20646b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f20647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f20648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class f20651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l f20652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.bumptech.glide.load.h f20653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public J1.d f20654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class f20655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f20656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Key f20658n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.g f20659o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f20660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20661q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20662r;

    public final ArrayList a() {
        boolean z3 = this.f20657m;
        ArrayList arrayList = this.f20646b;
        if (!z3) {
            this.f20657m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i7 = 0; i7 < size; i7++) {
                com.bumptech.glide.load.model.t tVar = (com.bumptech.glide.load.model.t) arrayListB.get(i7);
                if (!arrayList.contains(tVar.f20867a)) {
                    arrayList.add(tVar.f20867a);
                }
                int i10 = 0;
                while (true) {
                    List list = tVar.f20868b;
                    if (i10 < list.size()) {
                        if (!arrayList.contains(list.get(i10))) {
                            arrayList.add(list.get(i10));
                        }
                        i10++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z3 = this.f20656l;
        ArrayList arrayList = this.f20645a;
        if (!z3) {
            this.f20656l = true;
            arrayList.clear();
            List listF = this.f20647c.a().f(this.f20648d);
            int size = listF.size();
            for (int i7 = 0; i7 < size; i7++) {
                com.bumptech.glide.load.model.t tVarBuildLoadData = ((ModelLoader) listF.get(i7)).buildLoadData(this.f20648d, this.f20649e, this.f20650f, this.f20653i);
                if (tVarBuildLoadData != null) {
                    arrayList.add(tVarBuildLoadData);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v c(Class cls) {
        v vVar;
        Class cls2;
        Class cls3;
        Class cls4;
        v vVar2;
        ArrayList arrayList;
        ResourceTranscoder resourceTranscoder;
        Class cls5 = cls;
        com.bumptech.glide.j jVarA = this.f20647c.a();
        Class cls6 = this.f20651g;
        Class cls7 = this.f20655k;
        F1.d dVar = jVarA.f20502i;
        J1.m mVar = (J1.m) dVar.f2520b.getAndSet(null);
        if (mVar == null) {
            mVar = new J1.m();
        }
        mVar.f4474a = cls5;
        mVar.f4475b = cls6;
        mVar.f4476c = cls7;
        synchronized (dVar.f2519a) {
            vVar = (v) dVar.f2519a.get(mVar);
        }
        dVar.f2520b.set(mVar);
        jVarA.f20502i.getClass();
        if (F1.d.f2518c.equals(vVar)) {
            return null;
        }
        if (vVar != null) {
            return vVar;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : jVarA.f20496c.d(cls5, cls6)) {
            for (Class cls9 : jVarA.f20499f.e(cls8, cls7)) {
                F1.f fVar = jVarA.f20496c;
                synchronized (fVar) {
                    arrayList = new ArrayList();
                    Iterator it = fVar.f2526c.iterator();
                    while (it.hasNext()) {
                        List<F1.e> list = (List) fVar.f2525b.get((String) it.next());
                        if (list != null) {
                            for (F1.e eVar : list) {
                                if (eVar.f2521a.isAssignableFrom(cls5) && cls8.isAssignableFrom(eVar.f2522b)) {
                                    arrayList.add(eVar.f2523c);
                                }
                            }
                        }
                    }
                }
                p045d3.k kVar = jVarA.f20499f;
                synchronized (kVar) {
                    if (cls9.isAssignableFrom(cls8)) {
                        resourceTranscoder = E1.b.f2178b;
                    } else {
                        Iterator it2 = ((ArrayList) kVar.f35518b).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            E1.a aVar = (E1.a) it2.next();
                            if (aVar.f2175a.isAssignableFrom(cls8) && cls9.isAssignableFrom(aVar.f2176b)) {
                                resourceTranscoder = aVar.f2177c;
                                break;
                            }
                            cls5 = cls;
                        }
                    }
                }
                arrayList2.add(new j(cls5, cls8, cls9, arrayList, resourceTranscoder, jVarA.f20503j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            vVar2 = new v(cls2, cls3, cls4, arrayList2, jVarA.f20503j);
        }
        F1.d dVar2 = jVarA.f20502i;
        synchronized (dVar2.f2519a) {
            dVar2.f2519a.put(new J1.m(cls2, cls3, cls4), vVar2 != null ? vVar2 : F1.d.f2518c);
        }
        return vVar2;
    }

    public final Encoder d(Object obj) {
        Encoder encoder;
        F1.b bVar = this.f20647c.a().f20495b;
        Class<?> cls = obj.getClass();
        synchronized (bVar) {
            for (F1.a aVar : bVar.f2516a) {
                if (aVar.f2514a.isAssignableFrom(cls)) {
                    encoder = aVar.f2515b;
                }
            }
            encoder = null;
        }
        if (encoder != null) {
            return encoder;
        }
        throw new com.bumptech.glide.i(androidx.camera.video.u.l(obj.getClass(), "Failed to find source encoder for data class: "));
    }

    public final Transformation e(Class cls) {
        Transformation transformation = (Transformation) this.f20654j.get(cls);
        if (transformation == null) {
            for (Map.Entry entry : (M.a) this.f20654j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (!this.f20654j.isEmpty() || !this.f20661q) {
            return A1.e.f30b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
