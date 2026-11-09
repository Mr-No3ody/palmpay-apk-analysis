package p137j3;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BitmapPool;
import kotlin.jvm.internal.Intrinsics;
import p262r2.b;

/* JADX INFO: loaded from: classes.dex */
public final class n implements BitmapPool {
    @Override // com.facebook.common.memory.Pool
    public final Bitmap get(int i7) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i7) / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    public final void release(Object obj) {
        Bitmap value = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        value.recycle();
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public final void trim(b trimType) {
        Intrinsics.checkNotNullParameter(trimType, "trimType");
    }
}
