package Sa;

import J1.o;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.AbstractC1332d;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC1332d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8827c;

    public b(int i7, int i10) {
        this.f8826b = i7;
        this.f8827c = i10;
        Intrinsics.checkNotNullExpressionValue("com.transsnet.palmpay.core.util.glide.CircleCropWithBorderTransformation".getBytes(Charsets.UTF_8), "getBytes(...)");
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1332d
    public final Bitmap a(BitmapPool pool, Bitmap toTransform, int i7, int i10) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        int iMin = Math.min(i7, i10);
        int width = toTransform.getWidth();
        int height = toTransform.getHeight();
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        Bitmap bitmap = pool.get(iMin, iMin, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "get(...)");
        bitmap.setHasAlpha(true);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        float f12 = width;
        float f13 = height;
        float fMax = Math.max(f10 / f12, f10 / f13);
        float f14 = f12 * fMax;
        float f15 = f13 * fMax;
        float f16 = f11 - (f14 / 2.0f);
        float f17 = f11 - (f15 / 2.0f);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(f11, f11, f11, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(toTransform, (Rect) null, new RectF(f16, f17, f14 + f16, f15 + f17), paint);
        int i11 = this.f8826b;
        if (i11 > 0) {
            paint.setXfermode(null);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(i11);
            paint.setColor(this.f8827c);
            canvas.drawCircle(f11, f11, f11 - (i11 / 2.0f), paint);
        }
        return bitmap;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f8826b == bVar.f8826b && this.f8827c == bVar.f8827c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return o.g((this.f8826b * 100) + 930116802 + this.f8827c, 17);
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        byte[] bytes = ("com.transsnet.palmpay.core.util.glide.CircleCropWithBorderTransformation" + this.f8826b + this.f8827c).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
    }
}
