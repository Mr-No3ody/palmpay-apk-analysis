package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Resource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f20895a;

    public C(Bitmap bitmap) {
        this.f20895a = bitmap;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.f20895a;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return J1.o.c(this.f20895a);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
    }
}
