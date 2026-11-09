package p032c3;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.BitmapPool;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.Intrinsics;
import p061e3.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f18853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18854b;

    public a(BitmapPool bitmapPool, b closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        this.f18853a = bitmapPool;
        this.f18854b = closeableReferenceFactory;
    }

    @Override // p032c3.b
    public final CloseableReference a(int i7, int i10, Bitmap.Config bitmapConfig) {
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        int sizeInByteForBitmap = BitmapUtil.getSizeInByteForBitmap(i7, i10, bitmapConfig);
        BitmapPool bitmapPool = this.f18853a;
        Bitmap bitmap = bitmapPool.get(sizeInByteForBitmap);
        if (bitmap.getAllocationByteCount() < BitmapUtil.getPixelSizeForBitmapConfig(bitmapConfig) * i7 * i10) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i7, i10, bitmapConfig);
        com.facebook.common.references.b bVarJ = CloseableReference.j(bitmap, bitmapPool, this.f18854b.f36000a);
        Intrinsics.checkNotNullExpressionValue(bVarJ, "create(...)");
        return bVarJ;
    }
}
