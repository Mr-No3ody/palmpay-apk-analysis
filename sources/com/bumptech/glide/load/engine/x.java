package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class x implements DataFetcherGenerator, DataFetcher.DataCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f20780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f20781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20783d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Key f20784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f20785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20786g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile com.bumptech.glide.load.model.t f20787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public File f20788j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y f20789o;

    public x(f fVar, i iVar) {
        this.f20781b = fVar;
        this.f20780a = iVar;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        com.bumptech.glide.load.model.t tVar = this.f20787i;
        if (tVar != null) {
            tVar.f20869c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        this.f20780a.onDataFetcherReady(this.f20784e, obj, this.f20787i.f20869c, com.bumptech.glide.load.a.f20511d, this.f20789o);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(Exception exc) {
        this.f20780a.onDataFetcherFailed(this.f20789o, exc, this.f20787i.f20869c, com.bumptech.glide.load.a.f20511d);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean startNext() {
        List list;
        ArrayList arrayListE;
        ArrayList arrayListA = this.f20781b.a();
        boolean z3 = false;
        if (!arrayListA.isEmpty()) {
            f fVar = this.f20781b;
            com.bumptech.glide.j jVarA = fVar.f20647c.a();
            Class<?> cls = fVar.f20648d.getClass();
            Class cls2 = fVar.f20651g;
            Class cls3 = fVar.f20655k;
            p1.d dVar = jVarA.f20501h;
            J1.m mVar = (J1.m) ((AtomicReference) dVar.f41178b).getAndSet(null);
            if (mVar == null) {
                mVar = new J1.m(cls, cls2, cls3);
            } else {
                mVar.f4474a = cls;
                mVar.f4475b = cls2;
                mVar.f4476c = cls3;
            }
            synchronized (((M.f) dVar.f41179c)) {
                list = (List) ((M.f) dVar.f41179c).get(mVar);
            }
            ((AtomicReference) dVar.f41178b).set(mVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                androidx.work.impl.model.b bVar = jVarA.f20494a;
                synchronized (bVar) {
                    arrayListE = ((com.bumptech.glide.load.model.x) bVar.f18580b).e(cls);
                }
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : jVarA.f20496c.d((Class) it.next(), cls2)) {
                        if (!jVarA.f20499f.e(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                p1.d dVar2 = jVarA.f20501h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((M.f) dVar2.f41179c)) {
                    ((M.f) dVar2.f41179c).put(new J1.m(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f20785f;
                    if (list3 != null && this.f20786g < list3.size()) {
                        this.f20787i = null;
                        while (!z3 && this.f20786g < this.f20785f.size()) {
                            List list4 = this.f20785f;
                            int i7 = this.f20786g;
                            this.f20786g = i7 + 1;
                            ModelLoader modelLoader = (ModelLoader) list4.get(i7);
                            File file = this.f20788j;
                            f fVar2 = this.f20781b;
                            this.f20787i = modelLoader.buildLoadData(file, fVar2.f20649e, fVar2.f20650f, fVar2.f20653i);
                            if (this.f20787i != null && this.f20781b.c(this.f20787i.f20869c.getDataClass()) != null) {
                                this.f20787i.f20869c.loadData(this.f20781b.f20659o, this);
                                z3 = true;
                            }
                        }
                        return z3;
                    }
                    int i10 = this.f20783d + 1;
                    this.f20783d = i10;
                    if (i10 >= list2.size()) {
                        int i11 = this.f20782c + 1;
                        this.f20782c = i11;
                        if (i11 >= arrayListA.size()) {
                            break;
                        }
                        this.f20783d = 0;
                    }
                    Key key = (Key) arrayListA.get(this.f20782c);
                    Class cls5 = (Class) list2.get(this.f20783d);
                    Transformation transformationE = this.f20781b.e(cls5);
                    f fVar3 = this.f20781b;
                    this.f20789o = new y(fVar3.f20647c.f20459a, key, fVar3.f20658n, fVar3.f20649e, fVar3.f20650f, transformationE, cls5, fVar3.f20653i);
                    File file2 = fVar3.f20652h.getDiskCache().get(this.f20789o);
                    this.f20788j = file2;
                    if (file2 != null) {
                        this.f20784e = key;
                        this.f20785f = this.f20781b.f20647c.a().f(file2);
                        this.f20786g = 0;
                    }
                }
            } else if (!File.class.equals(this.f20781b.f20655k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f20781b.f20648d.getClass() + " to " + this.f20781b.f20655k);
            }
        }
        return false;
    }
}
