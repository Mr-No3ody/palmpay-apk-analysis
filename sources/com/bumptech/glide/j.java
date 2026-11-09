package com.bumptech.glide;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.model.u;
import com.bumptech.glide.load.model.x;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.work.impl.model.b f20494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F1.b f20495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F1.f f20496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p1.c f20497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.e f20498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p045d3.k f20499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F1.c f20500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1.d f20501h = new p1.d(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F1.d f20502i = new F1.d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final top.zibin.luban.io.a f20503j;

    public j() {
        top.zibin.luban.io.a aVar = new top.zibin.luban.io.a(10, new p058e0.b(20), new org.sufficientlysecure.htmltextview.m(1), new org.sufficientlysecure.htmltextview.n(1), false);
        this.f20503j = aVar;
        this.f20494a = new androidx.work.impl.model.b(aVar);
        this.f20495b = new F1.b(0);
        this.f20496c = new F1.f(0);
        this.f20497d = new p1.c(3);
        this.f20498e = new com.bumptech.glide.load.data.e();
        this.f20499f = new p045d3.k((byte) 0, 3);
        this.f20500g = new F1.c();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        F1.f fVar = this.f20496c;
        synchronized (fVar) {
            try {
                ArrayList<String> arrayList2 = new ArrayList(fVar.f2526c);
                fVar.f2526c.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fVar.f2526c.add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        fVar.f2526c.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, Encoder encoder) {
        F1.b bVar = this.f20495b;
        synchronized (bVar) {
            bVar.f2516a.add(new F1.a(cls, encoder));
        }
    }

    public final void b(Class cls, ResourceEncoder resourceEncoder) {
        p1.c cVar = this.f20497d;
        synchronized (cVar) {
            ((ArrayList) cVar.f41176b).add(new F1.g(cls, resourceEncoder));
        }
    }

    public final void c(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        androidx.work.impl.model.b bVar = this.f20494a;
        synchronized (bVar) {
            ((x) bVar.f18580b).a(cls, cls2, modelLoaderFactory);
            ((HashMap) ((s) bVar.f18581c).f20866a).clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, ResourceDecoder resourceDecoder) {
        F1.f fVar = this.f20496c;
        synchronized (fVar) {
            fVar.c(str).add(new F1.e(cls, cls2, resourceDecoder));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        F1.c cVar = this.f20500g;
        synchronized (cVar) {
            arrayList = cVar.f2517a;
        }
        if (arrayList.isEmpty()) {
            throw new i("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List listUnmodifiableList;
        androidx.work.impl.model.b bVar = this.f20494a;
        bVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (bVar) {
            u uVar = (u) ((HashMap) ((s) bVar.f18581c).f20866a).get(cls);
            listUnmodifiableList = uVar == null ? null : uVar.f20870a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((x) bVar.f18580b).d(cls));
                if (((u) ((HashMap) ((s) bVar.f18581c).f20866a).put(cls, new u(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new i("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z3 = true;
        for (int i7 = 0; i7 < size; i7++) {
            ModelLoader modelLoader = (ModelLoader) listUnmodifiableList.get(i7);
            if (modelLoader.handles(obj)) {
                if (z3) {
                    arrayList = new ArrayList(size - i7);
                    z3 = false;
                }
                arrayList.add(modelLoader);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new i("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final DataRewinder g(Object obj) {
        DataRewinder dataRewinderBuild;
        com.bumptech.glide.load.data.e eVar = this.f20498e;
        synchronized (eVar) {
            try {
                J1.g.b(obj);
                DataRewinder.Factory factory = (DataRewinder.Factory) eVar.f20533a.get(obj.getClass());
                if (factory == null) {
                    for (DataRewinder.Factory factory2 : eVar.f20533a.values()) {
                        if (factory2.getDataClass().isAssignableFrom(obj.getClass())) {
                            factory = factory2;
                            break;
                        }
                    }
                }
                if (factory == null) {
                    factory = com.bumptech.glide.load.data.e.f20532b;
                }
                dataRewinderBuild = factory.build(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataRewinderBuild;
    }

    public final void h(DataRewinder.Factory factory) {
        com.bumptech.glide.load.data.e eVar = this.f20498e;
        synchronized (eVar) {
            eVar.f20533a.put(factory.getDataClass(), factory);
        }
    }

    public final void i(Class cls, Class cls2, ResourceTranscoder resourceTranscoder) {
        p045d3.k kVar = this.f20499f;
        synchronized (kVar) {
            ((ArrayList) kVar.f35518b).add(new E1.a(cls, cls2, resourceTranscoder));
        }
    }

    public final void j(p345x1.b bVar) {
        ArrayList arrayListF;
        androidx.work.impl.model.b bVar2 = this.f20494a;
        synchronized (bVar2) {
            x xVar = (x) bVar2.f18580b;
            synchronized (xVar) {
                arrayListF = xVar.f();
                xVar.a(com.bumptech.glide.load.model.l.class, InputStream.class, bVar);
            }
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                ((ModelLoaderFactory) it.next()).teardown();
            }
            ((HashMap) ((s) bVar2.f18581c).f20866a).clear();
        }
    }
}
