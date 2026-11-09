package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v implements ImageReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f20956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20958c;

    public v(ByteBuffer byteBuffer, ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        this.f20956a = byteBuffer;
        this.f20957b = arrayList;
        this.f20958c = fVar;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final Bitmap decodeBitmap(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new J1.a(J1.c.c(this.f20956a)), null, options);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final int getImageOrientation() {
        ByteBuffer byteBufferC = J1.c.c(this.f20956a);
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar = this.f20958c;
        if (byteBufferC != null) {
            ArrayList arrayList = this.f20957b;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                try {
                    int orientation = ((ImageHeaderParser) arrayList.get(i7)).getOrientation(byteBufferC, fVar);
                    if (orientation != -1) {
                        return orientation;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final ImageHeaderParser.ImageType getImageType() {
        return com.bumptech.glide.load.e.c(this.f20957b, J1.c.c(this.f20956a));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final void stopGrowingBuffers() {
    }
}
