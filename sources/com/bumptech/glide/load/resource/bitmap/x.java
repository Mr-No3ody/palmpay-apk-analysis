package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileInputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x implements ImageReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.data.m f20964c;

    public x(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        J1.g.c(fVar, "Argument must not be null");
        this.f20962a = fVar;
        J1.g.c(arrayList, "Argument must not be null");
        this.f20963b = arrayList;
        this.f20964c = new com.bumptech.glide.load.data.m(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final Bitmap decodeBitmap(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.f20964c.c().getFileDescriptor(), null, options);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final int getImageOrientation() throws Throwable {
        com.bumptech.glide.load.data.m mVar = this.f20964c;
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar = this.f20962a;
        ArrayList arrayList = this.f20963b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i7);
            y yVar = null;
            try {
                y yVar2 = new y(new FileInputStream(mVar.c().getFileDescriptor()), fVar);
                try {
                    int orientation = imageHeaderParser.getOrientation(yVar2, fVar);
                    yVar2.release();
                    mVar.c();
                    if (orientation != -1) {
                        return orientation;
                    }
                } catch (Throwable th) {
                    th = th;
                    yVar = yVar2;
                    if (yVar != null) {
                        yVar.release();
                    }
                    mVar.c();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final ImageHeaderParser.ImageType getImageType() throws Throwable {
        com.bumptech.glide.load.data.m mVar = this.f20964c;
        com.bumptech.glide.load.engine.bitmap_recycle.f fVar = this.f20962a;
        ArrayList arrayList = this.f20963b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i7);
            y yVar = null;
            try {
                y yVar2 = new y(new FileInputStream(mVar.c().getFileDescriptor()), fVar);
                try {
                    ImageHeaderParser.ImageType type = imageHeaderParser.getType(yVar2);
                    yVar2.release();
                    mVar.c();
                    if (type != ImageHeaderParser.ImageType.UNKNOWN) {
                        return type;
                    }
                } catch (Throwable th) {
                    th = th;
                    yVar = yVar2;
                    if (yVar != null) {
                        yVar.release();
                    }
                    mVar.c();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
    public final void stopGrowingBuffers() {
    }
}
