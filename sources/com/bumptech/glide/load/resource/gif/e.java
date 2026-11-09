package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.C1331c;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Transformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transformation f20993b;

    public e(Transformation transformation) {
        J1.g.c(transformation, "Argument must not be null");
        this.f20993b = transformation;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f20993b.equals(((e) obj).f20993b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f20993b.hashCode();
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource transform(Context context, Resource resource, int i7, int i10) {
        d dVar = (d) resource.get();
        C1331c c1331c = new C1331c(com.bumptech.glide.b.b(context).f20434b, ((h) dVar.f20982a.f18151b).f21010l);
        Transformation transformation = this.f20993b;
        Resource resourceTransform = transformation.transform(context, c1331c, i7, i10);
        if (!c1331c.equals(resourceTransform)) {
            c1331c.recycle();
        }
        ((h) dVar.f20982a.f18151b).c(transformation, (Bitmap) resourceTransform.get());
        return resource;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f20993b.updateDiskCacheKey(messageDigest);
    }
}
