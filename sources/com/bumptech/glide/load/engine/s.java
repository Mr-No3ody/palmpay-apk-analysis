package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Resource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resource f20759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f20760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Key f20761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20763g;

    public s(Resource resource, boolean z3, boolean z8, Key key, m mVar) {
        J1.g.c(resource, "Argument must not be null");
        this.f20759c = resource;
        this.f20757a = z3;
        this.f20758b = z8;
        this.f20761e = key;
        J1.g.c(mVar, "Argument must not be null");
        this.f20760d = mVar;
    }

    public final synchronized void a() {
        if (this.f20763g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f20762f++;
    }

    public final void b() {
        boolean z3;
        synchronized (this) {
            int i7 = this.f20762f;
            if (i7 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z3 = true;
            int i10 = i7 - 1;
            this.f20762f = i10;
            if (i10 != 0) {
                z3 = false;
            }
        }
        if (z3) {
            this.f20760d.onResourceReleased(this.f20761e, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.f20759c.get();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        return this.f20759c.getResourceClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.f20759c.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final synchronized void recycle() {
        if (this.f20762f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f20763g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f20763g = true;
        if (this.f20758b) {
            this.f20759c.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f20757a + ", listener=" + this.f20760d + ", key=" + this.f20761e + ", acquired=" + this.f20762f + ", isRecycled=" + this.f20763g + ", resource=" + this.f20759c + '}';
    }
}
