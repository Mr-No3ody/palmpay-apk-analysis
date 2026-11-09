package p137j3;

import Me.AbstractC0456a;
import android.graphics.Bitmap;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.Intrinsics;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0456a {
    static {
        new f(null);
    }

    public static boolean l(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            a.z("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        a.z("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // Me.AbstractC0456a, com.facebook.imagepipeline.memory.PoolBackend
    public final Object get(int i7) {
        Bitmap bitmap = (Bitmap) super.get(i7);
        if (bitmap == null || !l(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.PoolBackend
    public final int getSize(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return BitmapUtil.getSizeInBytes(bitmap);
    }

    @Override // Me.AbstractC0456a, com.facebook.imagepipeline.memory.PoolBackend
    public final void put(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (l(bitmap)) {
            super.put(bitmap);
        }
    }
}
