package He;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Drawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f3867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f3868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Paint f3869g = new Paint();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Rect f3870h = new Rect();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f3871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f3872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.growingio.android.circler.a f3873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3874d;

    public b(Resources resources) {
        this.f3871a = resources;
        Paint paint = new Paint();
        this.f3872b = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        f3867e = resources.getDimensionPixelSize(Ac.c.main_invitee_photo_text_size);
        f3868f = resources.getColor(Ac.b.main_invitee_photo_text_color);
        Paint paint2 = f3869g;
        paint2.setTypeface(Typeface.create("sans-serif-light", 0));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!isVisible() || bounds.isEmpty()) {
            return;
        }
        Rect bounds2 = getBounds();
        Paint paint = f3869g;
        if (this.f3873c == null) {
            com.growingio.android.circler.a aVar = new com.growingio.android.circler.a(2);
            if (com.growingio.android.circler.a.f23132c == null) {
                int i7 = p025ba.b.core_invitee_photo_colors;
                Resources resources = this.f3871a;
                TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i7);
                com.growingio.android.circler.a.f23132c = typedArrayObtainTypedArray;
                com.growingio.android.circler.a.f23133d = typedArrayObtainTypedArray.length();
                com.growingio.android.circler.a.f23134e = resources.getColor(p025ba.c.core_invitee_photo_default_color);
            }
            this.f3873c = aVar;
        }
        com.growingio.android.circler.a aVar2 = this.f3873c;
        String str = this.f3874d;
        aVar2.getClass();
        paint.setColor(com.growingio.android.circler.a.f23132c.getColor(Math.abs(str.hashCode()) % com.growingio.android.circler.a.f23133d, com.growingio.android.circler.a.f23134e));
        paint.setAlpha(this.f3872b.getAlpha());
        canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() / 2, paint);
        paint.setTextSize(f3867e);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        String upperCase = this.f3874d.toUpperCase();
        int length = this.f3874d.length();
        Rect rect = f3870h;
        paint.getTextBounds(upperCase, 0, length, rect);
        paint.setColor(f3868f);
        canvas.drawText(this.f3874d.toUpperCase(), bounds2.centerX(), (rect.height() / 2) + bounds2.centerY(), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f3872b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3872b.setColorFilter(colorFilter);
    }
}
