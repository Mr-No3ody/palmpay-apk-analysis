package Sa;

import J1.o;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.AbstractC1332d;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC1332d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8825b;

    public a() {
        byte[] bytes = "com.transsnet.palmpay.core.util.glide.CircleCropTransformation".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        this.f8825b = bytes;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC1332d
    public final Bitmap a(BitmapPool pool, Bitmap toTransform, int i7, int i10) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        int iMin = Math.min(toTransform.getWidth(), toTransform.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(toTransform, (toTransform.getWidth() - iMin) / 2, (toTransform.getHeight() - iMin) / 2, iMin, iMin);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Bitmap bitmap = pool.get(iMin, iMin, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmap, "get(...)");
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f10 = iMin / 2.0f;
        canvas.drawCircle(f10, f10, f10, paint);
        return bitmap;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return o.g(-608970672, 17);
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(this.f8825b);
    }
}
