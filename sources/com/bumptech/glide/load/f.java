package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Transformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20801b;

    public f(Transformation... transformationArr) {
        if (transformationArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f20801b = Arrays.asList(transformationArr);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f20801b.equals(((f) obj).f20801b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f20801b.hashCode();
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource transform(Context context, Resource resource, int i7, int i10) {
        Iterator it = this.f20801b.iterator();
        Resource resource2 = resource;
        while (it.hasNext()) {
            Resource resourceTransform = ((Transformation) it.next()).transform(context, resource2, i7, i10);
            if (resource2 != null && !resource2.equals(resource) && !resource2.equals(resourceTransform)) {
                resource2.recycle();
            }
            resource2 = resourceTransform;
        }
        return resource2;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Iterator it = this.f20801b.iterator();
        while (it.hasNext()) {
            ((Transformation) it.next()).updateDiskCacheKey(messageDigest);
        }
    }
}
