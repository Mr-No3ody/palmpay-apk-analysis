package com.bumptech.glide.load.engine;

import com.bumptech.glide.util.pool.FactoryPools$Poolable;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Resource, FactoryPools$Poolable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final top.zibin.luban.io.a f20775e = K1.a.a(20, new org.sufficientlysecure.htmltextview.l(4));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K1.b f20776a = new K1.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resource f20777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20779d;

    public final synchronized void a() {
        this.f20776a.a();
        if (!this.f20778c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f20778c = false;
        if (this.f20779d) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.f20777b.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        return this.f20777b.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.f20777b.getSize();
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools$Poolable
    public final K1.c getVerifier() {
        return this.f20776a;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void recycle() {
        this.f20776a.a();
        this.f20779d = true;
        if (!this.f20778c) {
            this.f20777b.recycle();
            this.f20777b = null;
            f20775e.release(this);
        }
    }
}
