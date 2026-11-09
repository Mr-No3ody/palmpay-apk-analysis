package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f12863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f12864c;

    public Z0(Context context, TypedArray typedArray) {
        this.f12862a = context;
        this.f12863b = typedArray;
    }

    public static Z0 e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new Z0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static Z0 f(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i10) {
        return new Z0(context, context.obtainStyledAttributes(attributeSet, iArr, i7, i10));
    }

    public final ColorStateList a(int i7) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = this.f12863b;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0 || (colorStateListC = androidx.core.content.d.c(resourceId, this.f12862a)) == null) ? typedArray.getColorStateList(i7) : colorStateListC;
    }

    public final Drawable b(int i7) {
        int resourceId;
        TypedArray typedArray = this.f12863b;
        return (!typedArray.hasValue(i7) || (resourceId = typedArray.getResourceId(i7, 0)) == 0) ? typedArray.getDrawable(i7) : p264r5.a.q(resourceId, this.f12862a);
    }

    public final Drawable c(int i7) {
        int resourceId;
        Drawable drawableE;
        if (!this.f12863b.hasValue(i7) || (resourceId = this.f12863b.getResourceId(i7, 0)) == 0) {
            return null;
        }
        C0891x c0891xA = C0891x.a();
        Context context = this.f12862a;
        synchronized (c0891xA) {
            drawableE = c0891xA.f13028a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public final Typeface d(int i7, int i10, Q q10) {
        int resourceId = this.f12863b.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f12864c == null) {
            this.f12864c = new TypedValue();
        }
        TypedValue typedValue = this.f12864c;
        ThreadLocal threadLocal = Y.j.f11254a;
        Context context = this.f12862a;
        if (context.isRestricted()) {
            return null;
        }
        return Y.j.b(context, resourceId, typedValue, i10, q10, true, false);
    }

    public final void g() {
        this.f12863b.recycle();
    }
}
