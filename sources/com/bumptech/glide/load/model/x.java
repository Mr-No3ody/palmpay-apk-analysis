package com.bumptech.glide.load.model;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1326c f20881e = new C1326c(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B f20882f = new B(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1326c f20884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f20885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final top.zibin.luban.io.a f20886d;

    public x(top.zibin.luban.io.a aVar) {
        C1326c c1326c = f20881e;
        this.f20883a = new ArrayList();
        this.f20885c = new HashSet();
        this.f20886d = aVar;
        this.f20884b = c1326c;
    }

    public final synchronized void a(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        w wVar = new w(cls, cls2, modelLoaderFactory);
        ArrayList arrayList = this.f20883a;
        arrayList.add(arrayList.size(), wVar);
    }

    public final ModelLoader b(w wVar) {
        ModelLoader modelLoaderBuild = wVar.f20880c.build(this);
        J1.g.c(modelLoaderBuild, "Argument must not be null");
        return modelLoaderBuild;
    }

    public final synchronized ModelLoader c(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f20883a.iterator();
            boolean z3 = false;
            while (true) {
                boolean z8 = true;
                if (!it.hasNext()) {
                    break;
                }
                w wVar = (w) it.next();
                if (this.f20885c.contains(wVar)) {
                    z3 = true;
                } else {
                    if (!wVar.f20878a.isAssignableFrom(cls) || !wVar.f20879b.isAssignableFrom(cls2)) {
                        z8 = false;
                    }
                    if (z8) {
                        this.f20885c.add(wVar);
                        arrayList.add(b(wVar));
                        this.f20885c.remove(wVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                C1326c c1326c = this.f20884b;
                top.zibin.luban.io.a aVar = this.f20886d;
                c1326c.getClass();
                return new C1325b(2, arrayList, aVar);
            }
            if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            }
            if (z3) {
                return f20882f;
            }
            throw new com.bumptech.glide.i("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f20885c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (w wVar : this.f20883a) {
                if (!this.f20885c.contains(wVar) && wVar.f20878a.isAssignableFrom(cls)) {
                    this.f20885c.add(wVar);
                    arrayList.add(b(wVar));
                    this.f20885c.remove(wVar);
                }
            }
        } catch (Throwable th) {
            this.f20885c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList e(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (w wVar : this.f20883a) {
            if (!arrayList.contains(wVar.f20879b) && wVar.f20878a.isAssignableFrom(cls)) {
                arrayList.add(wVar.f20879b);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList f() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f20883a.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar.f20878a.isAssignableFrom(l.class) && wVar.f20879b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(wVar.f20880c);
            }
        }
        return arrayList;
    }
}
