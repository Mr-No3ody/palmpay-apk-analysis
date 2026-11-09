package I2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.DrawableParent;
import com.facebook.drawee.drawable.Rounded;
import com.facebook.drawee.drawable.f;
import com.facebook.drawee.drawable.h;
import com.facebook.drawee.drawable.i;
import com.facebook.drawee.drawable.j;
import com.facebook.drawee.drawable.l;
import com.facebook.drawee.drawable.m;
import com.facebook.drawee.drawable.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ColorDrawable f3999a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            dVar.getClass();
            h hVar = new h(resources, bitmap, paint);
            b(hVar, dVar);
            return hVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) drawable;
            Intrinsics.checkNotNullParameter(ninePatchDrawable, "ninePatchDrawable");
            l lVar = new l(ninePatchDrawable);
            b(lVar, dVar);
            return lVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            p229p2.a.x("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        i iVar = new i(((ColorDrawable) drawable).getColor());
        b(iVar, dVar);
        return iVar;
    }

    public static void b(Rounded rounded, d dVar) {
        rounded.setCircle(dVar.f3992b);
        rounded.setRadii(dVar.f3993c);
        rounded.setBorder(dVar.f3996f, dVar.f3995e);
        rounded.setPadding(dVar.f3997g);
        rounded.setScaleDownInsideBorders(false);
        rounded.setPaintFilterBitmap(dVar.f3998h);
        rounded.setRepeatEdgePixels(false);
    }

    public static Drawable c(Drawable drawable, d dVar, Resources resources) {
        try {
            p181m3.a.a();
            if (drawable != null && dVar != null && dVar.f3991a == 2) {
                if (!(drawable instanceof f)) {
                    return a(drawable, dVar, resources);
                }
                DrawableParent drawableParent = (f) drawable;
                while (true) {
                    Object drawable2 = drawableParent.getDrawable();
                    if (drawable2 == drawableParent || !(drawable2 instanceof DrawableParent)) {
                        break;
                        break;
                    }
                    drawableParent = (DrawableParent) drawable2;
                }
                drawableParent.setDrawable(a(drawableParent.setDrawable(f3999a), dVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            p181m3.a.a();
        }
    }

    public static Drawable d(Drawable drawable, d dVar) {
        try {
            p181m3.a.a();
            if (drawable != null && dVar != null && dVar.f3991a == 1) {
                j jVar = new j(drawable);
                b(jVar, dVar);
                jVar.f21292p = dVar.f3994d;
                jVar.invalidateSelf();
                return jVar;
            }
            return drawable;
        } finally {
            p181m3.a.a();
        }
    }

    public static Drawable e(Drawable drawable, n nVar) {
        p181m3.a.a();
        if (drawable == null || nVar == null) {
            p181m3.a.a();
            return drawable;
        }
        m mVar = new m(drawable, nVar);
        p181m3.a.a();
        return mVar;
    }
}
