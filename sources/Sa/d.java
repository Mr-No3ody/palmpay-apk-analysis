package Sa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.camera.camera2.internal.F;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.C1331c;
import face.security.device.api.FaceSecCode;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Transformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapPool f8829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8834g;

    public d(Context context, int i7, int i10, int i11) {
        this(context, i7, 16);
        this.f8833f = i10;
        this.f8834g = i11;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f8830c == this.f8830c && dVar.f8831d == this.f8831d && dVar.f8834g == this.f8834g && dVar.f8833f == this.f8833f && dVar.f8832e == this.f8832e;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return (F.i(this.f8832e) * 10) + (this.f8834g * 100) + (this.f8831d * FaceSecCode.SC_SUCCESS) + (this.f8830c * 100000) + this.f8833f;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("RoundedTransformation(radius=");
        sb2.append(this.f8830c);
        sb2.append(", margin=0, diameter=");
        sb2.append(this.f8831d);
        sb2.append(", mBorder=");
        sb2.append(this.f8834g);
        sb2.append(", mColor=");
        sb2.append(this.f8833f);
        sb2.append(", cornerType=");
        switch (this.f8832e) {
            case 1:
                str = "ALL";
                break;
            case 2:
                str = "TOP_LEFT";
                break;
            case 3:
                str = "TOP_RIGHT";
                break;
            case 4:
                str = "BOTTOM_LEFT";
                break;
            case 5:
                str = "BOTTOM_RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "LEFT";
                break;
            case 9:
                str = "RIGHT";
                break;
            case 10:
                str = "OTHER_TOP_LEFT";
                break;
            case 11:
                str = "OTHER_TOP_RIGHT";
                break;
            case 12:
                str = "OTHER_BOTTOM_LEFT";
                break;
            case 13:
                str = "OTHER_BOTTOM_RIGHT";
                break;
            case 14:
                str = "DIAGONAL_FROM_TOP_LEFT";
                break;
            case 15:
                str = "DIAGONAL_FROM_TOP_RIGHT";
                break;
            case 16:
                str = "BORDER";
                break;
            default:
                throw null;
        }
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource transform(Context context, Resource resource, int i7, int i10) {
        Bitmap bitmap = (Bitmap) resource.get();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        BitmapPool bitmapPool = this.f8829b;
        Bitmap bitmapCreateBitmap = bitmapPool.get(width, height, config);
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f10 = width;
        float f11 = height;
        float f12 = 0;
        float f13 = f10 - f12;
        float f14 = f11 - f12;
        int i11 = F.i(this.f8832e);
        int i12 = this.f8831d;
        int i13 = this.f8830c;
        switch (i11) {
            case 0:
                RectF rectF = new RectF(f12, f12, f13, f14);
                float f15 = i13;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                break;
            case 1:
                float f16 = i12;
                RectF rectF2 = new RectF(f12, f12, f16, f16);
                float f17 = i13;
                canvas.drawRoundRect(rectF2, f17, f17, paint);
                float f18 = i13;
                canvas.drawRect(new RectF(f12, f18, f18, f14), paint);
                canvas.drawRect(new RectF(f18, f12, f13, f14), paint);
                break;
            case 2:
                RectF rectF3 = new RectF(f13 - i12, f12, f13, i12);
                float f19 = i13;
                canvas.drawRoundRect(rectF3, f19, f19, paint);
                float f20 = f13 - f19;
                canvas.drawRect(new RectF(f12, f12, f20, f14), paint);
                canvas.drawRect(new RectF(f20, i13, f13, f14), paint);
                break;
            case 3:
                float f21 = f14 - i12;
                float f22 = i12;
                RectF rectF4 = new RectF(f12, f21, f22, f14);
                float f23 = i13;
                canvas.drawRoundRect(rectF4, f23, f23, paint);
                canvas.drawRect(new RectF(f12, f12, f22, f14 - f23), paint);
                canvas.drawRect(new RectF(i13, f12, f13, f14), paint);
                break;
            case 4:
                float f24 = i12;
                RectF rectF5 = new RectF(f13 - f24, f14 - f24, f13, f14);
                float f25 = i13;
                canvas.drawRoundRect(rectF5, f25, f25, paint);
                float f26 = f13 - f25;
                canvas.drawRect(new RectF(f12, f12, f26, f14), paint);
                canvas.drawRect(new RectF(f26, f12, f13, f14 - f25), paint);
                break;
            case 5:
                RectF rectF6 = new RectF(f12, f12, f13, i12);
                float f27 = i13;
                canvas.drawRoundRect(rectF6, f27, f27, paint);
                canvas.drawRect(new RectF(f12, i13, f13, f14), paint);
                break;
            case 6:
                RectF rectF7 = new RectF(f12, f14 - i12, f13, f14);
                float f28 = i13;
                canvas.drawRoundRect(rectF7, f28, f28, paint);
                canvas.drawRect(new RectF(f12, f12, f13, f14 - f28), paint);
                break;
            case 7:
                RectF rectF8 = new RectF(f12, f12, i12, f14);
                float f29 = i13;
                canvas.drawRoundRect(rectF8, f29, f29, paint);
                canvas.drawRect(new RectF(i13, f12, f13, f14), paint);
                break;
            case 8:
                RectF rectF9 = new RectF(f13 - i12, f12, f13, f14);
                float f30 = i13;
                canvas.drawRoundRect(rectF9, f30, f30, paint);
                canvas.drawRect(new RectF(f12, f12, f13 - f30, f14), paint);
                break;
            case 9:
                float f31 = i12;
                float f32 = i13;
                canvas.drawRoundRect(new RectF(f12, f14 - f31, f13, f14), f32, f32, paint);
                canvas.drawRoundRect(new RectF(f13 - f31, f12, f13, f14), f32, f32, paint);
                canvas.drawRect(new RectF(f12, f12, f13 - f32, f14 - f32), paint);
                break;
            case 10:
                float f33 = i13;
                canvas.drawRoundRect(new RectF(f12, f12, i12, f14), f33, f33, paint);
                canvas.drawRoundRect(new RectF(f12, f14 - i12, f13, f14), f33, f33, paint);
                canvas.drawRect(new RectF(i13, f12, f13, f14 - f33), paint);
                break;
            case 11:
                float f34 = i13;
                canvas.drawRoundRect(new RectF(f12, f12, f13, i12), f34, f34, paint);
                canvas.drawRoundRect(new RectF(f13 - i12, f12, f13, f14), f34, f34, paint);
                canvas.drawRect(new RectF(f12, i13, f13 - f34, f14), paint);
                break;
            case 12:
                float f35 = i12;
                float f36 = i13;
                canvas.drawRoundRect(new RectF(f12, f12, f13, f35), f36, f36, paint);
                canvas.drawRoundRect(new RectF(f12, f12, f35, f14), f36, f36, paint);
                float f37 = i13;
                canvas.drawRect(new RectF(f37, f37, f13, f14), paint);
                break;
            case 13:
                float f38 = i12;
                float f39 = i13;
                canvas.drawRoundRect(new RectF(f12, f12, f38, f38), f39, f39, paint);
                float f40 = i12;
                float f41 = f13 - f40;
                canvas.drawRoundRect(new RectF(f41, f14 - f40, f13, f14), f39, f39, paint);
                canvas.drawRect(new RectF(f12, i13, f41, f14), paint);
                canvas.drawRect(new RectF(f38, f12, f13, f14 - f39), paint);
                break;
            case 14:
                float f42 = i12;
                float f43 = i12;
                float f44 = i13;
                canvas.drawRoundRect(new RectF(f13 - f42, f12, f13, f43), f44, f44, paint);
                canvas.drawRoundRect(new RectF(f12, f14 - f42, f43, f14), f44, f44, paint);
                canvas.drawRect(new RectF(f12, f12, f13 - f44, f14 - f44), paint);
                float f45 = i13;
                canvas.drawRect(new RectF(f45, f45, f13, f14), paint);
                break;
            case 15:
                Paint paint2 = new Paint();
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setColor(this.f8833f);
                paint2.setStrokeWidth(this.f8834g);
                float f46 = i13;
                canvas.drawRoundRect(new RectF(f12, f12, f13, f14), f46, f46, paint);
                canvas.drawRoundRect(new RectF(f12, f12, f13, f14), f46, f46, paint2);
                break;
            default:
                RectF rectF10 = new RectF(f12, f12, f13, f14);
                float f47 = i13;
                canvas.drawRoundRect(rectF10, f47, f47, paint);
                break;
        }
        return C1331c.a(bitmapPool, bitmapCreateBitmap);
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(String.valueOf(F.i(this.f8832e) + this.f8830c + this.f8831d + this.f8834g + this.f8833f).getBytes(Key.f20507a));
    }

    public d(Context context, int i7, int i10) {
        BitmapPool bitmapPool = com.bumptech.glide.b.b(context).f20434b;
        this.f8833f = -16777216;
        this.f8829b = bitmapPool;
        this.f8830c = i7;
        this.f8831d = i7 * 2;
        this.f8832e = i10;
    }
}
