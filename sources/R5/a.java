package R5;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BitmapPool;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements BitmapPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f7931a;

    @Override // com.facebook.common.memory.Pool
    public Bitmap get(int i7) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i7) / 2.0d), Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f7931a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override // com.facebook.common.memory.Pool, com.facebook.common.references.ResourceReleaser
    public void release(Object obj) {
        Bitmap value = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7931a.remove(value);
        value.recycle();
    }

    @Override // com.facebook.common.memory.MemoryTrimmable
    public void trim(p262r2.b trimType) {
        Intrinsics.checkNotNullParameter(trimType, "trimType");
    }
}
