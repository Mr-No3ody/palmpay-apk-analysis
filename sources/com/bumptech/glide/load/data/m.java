package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.y;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class m implements DataRewinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20549a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20550b;

    public m(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        y yVar = new y(inputStream, fVar);
        this.f20550b = yVar;
        yVar.mark(5242880);
    }

    public ParcelFileDescriptor c() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f20550b).rewind();
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public final void cleanup() {
        switch (this.f20549a) {
            case 0:
            case 1:
                break;
            default:
                ((y) this.f20550b).release();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public final Object rewindAndGet() {
        switch (this.f20549a) {
            case 0:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f20550b).rewind();
            case 1:
                return this.f20550b;
            default:
                y yVar = (y) this.f20550b;
                yVar.reset();
                return yVar;
        }
    }

    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f20550b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public m(Object obj) {
        this.f20550b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }
}
