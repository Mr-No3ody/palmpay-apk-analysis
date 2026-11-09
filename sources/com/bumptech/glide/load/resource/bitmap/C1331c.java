package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1331c implements Resource, Initializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20911a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20913c;

    public C1331c(BitmapPool bitmapPool, Bitmap bitmap) {
        J1.g.c(bitmap, "Bitmap must not be null");
        this.f20912b = bitmap;
        J1.g.c(bitmapPool, "BitmapPool must not be null");
        this.f20913c = bitmapPool;
    }

    public static C1331c a(BitmapPool bitmapPool, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C1331c(bitmapPool, bitmap);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        switch (this.f20911a) {
            case 0:
                return (Bitmap) this.f20912b;
            default:
                return new BitmapDrawable((Resources) this.f20912b, (Bitmap) ((Resource) this.f20913c).get());
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class getResourceClass() {
        switch (this.f20911a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        switch (this.f20911a) {
            case 0:
                return J1.o.c((Bitmap) this.f20912b);
            default:
                return ((Resource) this.f20913c).getSize();
        }
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        switch (this.f20911a) {
            case 0:
                ((Bitmap) this.f20912b).prepareToDraw();
                break;
            default:
                Resource resource = (Resource) this.f20913c;
                if (resource instanceof Initializable) {
                    ((Initializable) resource).initialize();
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        switch (this.f20911a) {
            case 0:
                ((BitmapPool) this.f20913c).put((Bitmap) this.f20912b);
                break;
            default:
                ((Resource) this.f20913c).recycle();
                break;
        }
    }

    public C1331c(Resources resources, Resource resource) {
        J1.g.c(resources, "Argument must not be null");
        this.f20912b = resources;
        J1.g.c(resource, "Argument must not be null");
        this.f20913c = resource;
    }
}
