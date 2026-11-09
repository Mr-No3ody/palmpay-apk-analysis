package Sa;

import C0.G;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.AbstractC1332d;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends AbstractC1332d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8828b;

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1332d
    public final Bitmap a(BitmapPool bitmapPool, Bitmap bitmap, int i7, int i10) {
        Bitmap bitmap2 = bitmapPool.get(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmap2.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(bitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(new PorterDuffColorFilter(this.f8828b, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmap2;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f8828b == this.f8828b;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return (this.f8828b * 10) - 695346427;
    }

    public final String toString() {
        return G.n(this.f8828b, ")", new StringBuilder("ColorFilterTransformation(color="));
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(("com.bumptech.glide.transformations.ColorFilterTransformation.1" + this.f8828b).getBytes(Key.f20507a));
    }
}
