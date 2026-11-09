package p167l3;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import p121i2.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.facebook.imagepipeline.request.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f39269c;

    public a(int i7) {
        if (!(i7 > 0)) {
            throw new IllegalArgumentException();
        }
        this.f39267a = 2;
        this.f39268b = i7;
    }

    @Override // com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.Postprocessor
    public final CacheKey getPostprocessorCacheKey() {
        if (this.f39269c == null) {
            this.f39269c = new f("i" + this.f39267a + "r" + this.f39268b);
        }
        return this.f39269c;
    }

    @Override // com.facebook.imagepipeline.request.a
    public final void process(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f39267a, this.f39268b);
    }
}
