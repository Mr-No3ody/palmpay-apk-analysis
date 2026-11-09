package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ImageReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.data.m f20959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20961c;

    public w(J1.l lVar, ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        J1.g.c(fVar, "Argument must not be null");
        this.f20960b = fVar;
        J1.g.c(arrayList, "Argument must not be null");
        this.f20961c = arrayList;
        this.f20959a = new com.bumptech.glide.load.data.m(lVar, fVar);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final Bitmap decodeBitmap(BitmapFactory.Options options) {
        y yVar = (y) this.f20959a.f20550b;
        yVar.reset();
        return BitmapFactory.decodeStream(yVar, null, options);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final int getImageOrientation() {
        y yVar = (y) this.f20959a.f20550b;
        yVar.reset();
        return com.bumptech.glide.load.e.a(this.f20961c, yVar, this.f20960b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final ImageHeaderParser.ImageType getImageType() {
        y yVar = (y) this.f20959a.f20550b;
        yVar.reset();
        return com.bumptech.glide.load.e.b(this.f20961c, yVar, this.f20960b);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final void stopGrowingBuffers() {
        y yVar = (y) this.f20959a.f20550b;
        synchronized (yVar) {
            yVar.f20967c = yVar.f20965a.length;
        }
    }
}
