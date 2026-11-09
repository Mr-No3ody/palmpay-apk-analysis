package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Transformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Transformation f20945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20946c;

    public r(Transformation transformation, boolean z3) {
        this.f20945b = transformation;
        this.f20946c = z3;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f20945b.equals(((r) obj).f20945b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f20945b.hashCode();
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource transform(Context context, Resource resource, int i7, int i10) {
        BitmapPool bitmapPool = com.bumptech.glide.b.b(context).f20434b;
        Drawable drawable = (Drawable) resource.get();
        C1331c c1331cA = q.a(bitmapPool, drawable, i7, i10);
        if (c1331cA != null) {
            Resource resourceTransform = this.f20945b.transform(context, c1331cA, i7, i10);
            if (!resourceTransform.equals(c1331cA)) {
                return new C1331c(context.getResources(), resourceTransform);
            }
            resourceTransform.recycle();
            return resource;
        }
        if (!this.f20946c) {
            return resource;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f20945b.updateDiskCacheKey(messageDigest);
    }
}
