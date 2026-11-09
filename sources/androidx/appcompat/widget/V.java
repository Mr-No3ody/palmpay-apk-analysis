package androidx.appcompat.widget;

import M7.C0442b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f12832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0442b f12833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0442b f12834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0442b f12835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0442b f12836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0442b f12837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0442b f12838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0442b f12839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0853d0 f12840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12841j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12842k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f12843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12844m;

    public V(TextView textView) {
        this.f12832a = textView;
        this.f12840i = new C0853d0(textView);
    }

    public static C0442b c(Context context, C0891x c0891x, int i7) {
        ColorStateList colorStateListG;
        synchronized (c0891x) {
            colorStateListG = c0891x.f13028a.g(i7, context);
        }
        if (colorStateListG == null) {
            return null;
        }
        C0442b c0442b = new C0442b();
        c0442b.f5806b = true;
        c0442b.f5807c = colorStateListG;
        return c0442b;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i7 >= 30) {
            androidx.core.view.inputmethod.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i7 >= 30) {
            androidx.core.view.inputmethod.a.a(editorInfo, text);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = text.length();
        if (i12 < 0 || i10 > length) {
            androidx.core.view.inputmethod.b.a(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            androidx.core.view.inputmethod.b.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            androidx.core.view.inputmethod.b.a(editorInfo, text, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int iMin = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (((double) i16) * 0.8d)));
        int iMin2 = Math.min(i12, i16 - iMin);
        int i17 = i12 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i17))) {
            i17++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i10 + iMin) - 1))) {
            iMin--;
        }
        int i18 = iMin2 + i15;
        androidx.core.view.inputmethod.b.a(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + iMin2), text.subSequence(i10, iMin + i10)) : text.subSequence(i17, i18 + iMin + i17), iMin2, i18);
    }

    public final void a(Drawable drawable, C0442b c0442b) {
        if (drawable == null || c0442b == null) {
            return;
        }
        C0891x.e(drawable, c0442b, this.f12832a.getDrawableState());
    }

    public final void b() {
        C0442b c0442b = this.f12833b;
        TextView textView = this.f12832a;
        if (c0442b != null || this.f12834c != null || this.f12835d != null || this.f12836e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f12833b);
            a(compoundDrawables[1], this.f12834c);
            a(compoundDrawables[2], this.f12835d);
            a(compoundDrawables[3], this.f12836e);
        }
        if (this.f12837f == null && this.f12838g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f12837f);
        a(compoundDrawablesRelative[2], this.f12838g);
    }

    public final ColorStateList d() {
        C0442b c0442b = this.f12839h;
        if (c0442b != null) {
            return (ColorStateList) c0442b.f5807c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C0442b c0442b = this.f12839h;
        if (c0442b != null) {
            return (PorterDuff.Mode) c0442b.f5808d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:227:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:229:0x03db  */
    /* JADX WARN: Code duplicated, block: B:232:0x03e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:235:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:237:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:239:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i7) {
        boolean z3;
        boolean z8;
        String string;
        String string2;
        float f10;
        int i10;
        int i11;
        float dimensionPixelSize;
        int i12;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.f12832a;
        Context context = textView.getContext();
        C0891x c0891xA = C0891x.a();
        Z0 z0F = Z0.f(context, attributeSet, p241q.j.AppCompatTextHelper, i7, 0);
        androidx.core.view.N.p(textView, textView.getContext(), p241q.j.AppCompatTextHelper, attributeSet, z0F.f12863b, i7, 0);
        int i13 = p241q.j.AppCompatTextHelper_android_textAppearance;
        TypedArray typedArray = z0F.f12863b;
        int resourceId3 = typedArray.getResourceId(i13, -1);
        if (typedArray.hasValue(p241q.j.AppCompatTextHelper_android_drawableLeft)) {
            this.f12833b = c(context, c0891xA, typedArray.getResourceId(p241q.j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (typedArray.hasValue(p241q.j.AppCompatTextHelper_android_drawableTop)) {
            this.f12834c = c(context, c0891xA, typedArray.getResourceId(p241q.j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (typedArray.hasValue(p241q.j.AppCompatTextHelper_android_drawableRight)) {
            this.f12835d = c(context, c0891xA, typedArray.getResourceId(p241q.j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (typedArray.hasValue(p241q.j.AppCompatTextHelper_android_drawableBottom)) {
            this.f12836e = c(context, c0891xA, typedArray.getResourceId(p241q.j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (typedArray.hasValue(p241q.j.AppCompatTextHelper_android_drawableStart)) {
            this.f12837f = c(context, c0891xA, typedArray.getResourceId(p241q.j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (typedArray.hasValue(p241q.j.AppCompatTextHelper_android_drawableEnd)) {
            this.f12838g = c(context, c0891xA, typedArray.getResourceId(p241q.j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        z0F.g();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, p241q.j.TextAppearance);
            Z0 z11 = new Z0(context, typedArrayObtainStyledAttributes);
            if (z10 || !typedArrayObtainStyledAttributes.hasValue(p241q.j.TextAppearance_textAllCaps)) {
                z3 = false;
                z8 = false;
            } else {
                z3 = typedArrayObtainStyledAttributes.getBoolean(p241q.j.TextAppearance_textAllCaps, false);
                z8 = true;
            }
            n(context, z11);
            int i14 = Build.VERSION.SDK_INT;
            string2 = typedArrayObtainStyledAttributes.hasValue(p241q.j.TextAppearance_textLocale) ? typedArrayObtainStyledAttributes.getString(p241q.j.TextAppearance_textLocale) : null;
            string = (i14 < 26 || !typedArrayObtainStyledAttributes.hasValue(p241q.j.TextAppearance_fontVariationSettings)) ? null : typedArrayObtainStyledAttributes.getString(p241q.j.TextAppearance_fontVariationSettings);
            z11.g();
        } else {
            z3 = false;
            z8 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p241q.j.TextAppearance, i7, 0);
        Z0 z12 = new Z0(context, typedArrayObtainStyledAttributes2);
        if (!z10 && typedArrayObtainStyledAttributes2.hasValue(p241q.j.TextAppearance_textAllCaps)) {
            z3 = typedArrayObtainStyledAttributes2.getBoolean(p241q.j.TextAppearance_textAllCaps, false);
            z8 = true;
        }
        int i15 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes2.hasValue(p241q.j.TextAppearance_textLocale)) {
            string2 = typedArrayObtainStyledAttributes2.getString(p241q.j.TextAppearance_textLocale);
        }
        if (i15 >= 26 && typedArrayObtainStyledAttributes2.hasValue(p241q.j.TextAppearance_fontVariationSettings)) {
            string = typedArrayObtainStyledAttributes2.getString(p241q.j.TextAppearance_fontVariationSettings);
        }
        if (i15 >= 28 && typedArrayObtainStyledAttributes2.hasValue(p241q.j.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(p241q.j.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, z12);
        z12.g();
        if (!z10 && z8) {
            textView.setAllCaps(z3);
        }
        Typeface typeface = this.f12843l;
        if (typeface != null) {
            if (this.f12842k == -1) {
                textView.setTypeface(typeface, this.f12841j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            T.d(textView, string);
        }
        if (string2 != null) {
            S.b(textView, S.a(string2));
        }
        int[] iArr = p241q.j.AppCompatTextView;
        C0853d0 c0853d0 = this.f12840i;
        Context context2 = c0853d0.f12888j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        TextView textView2 = c0853d0.f12887i;
        androidx.core.view.N.p(textView2, textView2.getContext(), p241q.j.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes3, i7, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(p241q.j.AppCompatTextView_autoSizeTextType)) {
            c0853d0.f12879a = typedArrayObtainStyledAttributes3.getInt(p241q.j.AppCompatTextView_autoSizeTextType, 0);
        }
        float f11 = -1.0f;
        float dimension = typedArrayObtainStyledAttributes3.hasValue(p241q.j.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes3.getDimension(p241q.j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(p241q.j.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes3.getDimension(p241q.j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(p241q.j.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes3.getDimension(p241q.j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(p241q.j.AppCompatTextView_autoSizePresetSizes) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(p241q.j.AppCompatTextView_autoSizePresetSizes, 0)) <= 0) {
            f10 = -1.0f;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr2 = new int[length];
            if (length > 0) {
                int i16 = 0;
                while (i16 < length) {
                    iArr2[i16] = typedArrayObtainTypedArray.getDimensionPixelSize(i16, -1);
                    i16++;
                    f11 = f11;
                }
                f10 = f11;
                c0853d0.f12884f = C0853d0.b(iArr2);
                c0853d0.i();
            } else {
                f10 = -1.0f;
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0853d0.j()) {
            c0853d0.f12879a = 0;
        } else if (c0853d0.f12879a == 1) {
            if (!c0853d0.f12885g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f10) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == f10) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == f10) {
                    dimension = 1.0f;
                }
                c0853d0.k(dimension2, dimension3, dimension);
            }
            c0853d0.h();
        }
        if (p1.f12997c && c0853d0.f12879a != 0) {
            int[] iArr3 = c0853d0.f12884f;
            if (iArr3.length > 0) {
                if (T.a(textView) != f10) {
                    T.b(textView, Math.round(c0853d0.f12882d), Math.round(c0853d0.f12883e), Math.round(c0853d0.f12881c), 0);
                } else {
                    T.c(textView, iArr3, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, p241q.j.AppCompatTextView);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(p241q.j.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableB = resourceId4 != -1 ? c0891xA.b(resourceId4, context) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(p241q.j.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c0891xA.b(resourceId5, context) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(p241q.j.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c0891xA.b(resourceId6, context) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(p241q.j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c0891xA.b(resourceId7, context) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(p241q.j.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c0891xA.b(resourceId8, context) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(p241q.j.AppCompatTextView_drawableEndCompat, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c0891xA.b(resourceId9, context) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(p241q.j.AppCompatTextView_drawableTint)) {
            int i17 = p241q.j.AppCompatTextView_drawableTint;
            if (!typedArrayObtainStyledAttributes4.hasValue(i17) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(i17, 0)) == 0 || (colorStateList = androidx.core.content.d.c(resourceId, context)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(i17);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(p241q.j.AppCompatTextView_drawableTintMode)) {
            i10 = -1;
            textView.setCompoundDrawableTintMode(AbstractC0859g0.c(typedArrayObtainStyledAttributes4.getInt(p241q.j.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i10 = -1;
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(p241q.j.AppCompatTextView_firstBaselineToTopHeight, i10);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(p241q.j.AppCompatTextView_lastBaselineToBottomHeight, i10);
        if (typedArrayObtainStyledAttributes4.hasValue(p241q.j.AppCompatTextView_lineHeight)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(p241q.j.AppCompatTextView_lineHeight);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i11 = -1;
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(p241q.j.AppCompatTextView_lineHeight, -1);
            } else {
                int i18 = typedValuePeekValue.data;
                int i19 = i18 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i18);
                i12 = i19;
                i11 = -1;
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != i11) {
                p377z5.l.E(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != i11) {
                p377z5.l.F(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != f10) {
                if (i12 == i11) {
                    p377z5.l.G(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    androidx.camera.core.imagecapture.i.l(textView, i12, dimensionPixelSize);
                } else {
                    p377z5.l.G(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        i11 = -1;
        dimensionPixelSize = f10;
        i12 = i11;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i11) {
            p377z5.l.E(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i11) {
            p377z5.l.F(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != f10) {
            if (i12 == i11) {
                p377z5.l.G(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                androidx.camera.core.imagecapture.i.l(textView, i12, dimensionPixelSize);
            } else {
                p377z5.l.G(textView, Math.round(TypedValue.applyDimension(i12, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(int i7, Context context) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, p241q.j.TextAppearance);
        Z0 z3 = new Z0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(p241q.j.TextAppearance_textAllCaps);
        TextView textView = this.f12832a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(p241q.j.TextAppearance_textAllCaps, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(p241q.j.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(p241q.j.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, z3);
        if (i10 >= 26 && typedArrayObtainStyledAttributes.hasValue(p241q.j.TextAppearance_fontVariationSettings) && (string = typedArrayObtainStyledAttributes.getString(p241q.j.TextAppearance_fontVariationSettings)) != null) {
            T.d(textView, string);
        }
        z3.g();
        Typeface typeface = this.f12843l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f12841j);
        }
    }

    public final void i(int i7, int i10, int i11, int i12) {
        C0853d0 c0853d0 = this.f12840i;
        if (c0853d0.j()) {
            DisplayMetrics displayMetrics = c0853d0.f12888j.getResources().getDisplayMetrics();
            c0853d0.k(TypedValue.applyDimension(i12, i7, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (c0853d0.h()) {
                c0853d0.a();
            }
        }
    }

    public final void j(int[] iArr, int i7) {
        C0853d0 c0853d0 = this.f12840i;
        if (c0853d0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i7 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0853d0.f12888j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i7, iArr[i10], displayMetrics));
                    }
                }
                c0853d0.f12884f = C0853d0.b(iArrCopyOf);
                if (!c0853d0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0853d0.f12885g = false;
            }
            if (c0853d0.h()) {
                c0853d0.a();
            }
        }
    }

    public final void k(int i7) {
        C0853d0 c0853d0 = this.f12840i;
        if (c0853d0.j()) {
            if (i7 == 0) {
                c0853d0.f12879a = 0;
                c0853d0.f12882d = -1.0f;
                c0853d0.f12883e = -1.0f;
                c0853d0.f12881c = -1.0f;
                c0853d0.f12884f = new int[0];
                c0853d0.f12880b = false;
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException(C0.G.m(i7, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c0853d0.f12888j.getResources().getDisplayMetrics();
            c0853d0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0853d0.h()) {
                c0853d0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f12839h == null) {
            this.f12839h = new C0442b();
        }
        C0442b c0442b = this.f12839h;
        c0442b.f5807c = colorStateList;
        c0442b.f5806b = colorStateList != null;
        this.f12833b = c0442b;
        this.f12834c = c0442b;
        this.f12835d = c0442b;
        this.f12836e = c0442b;
        this.f12837f = c0442b;
        this.f12838g = c0442b;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f12839h == null) {
            this.f12839h = new C0442b();
        }
        C0442b c0442b = this.f12839h;
        c0442b.f5808d = mode;
        c0442b.f5805a = mode != null;
        this.f12833b = c0442b;
        this.f12834c = c0442b;
        this.f12835d = c0442b;
        this.f12836e = c0442b;
        this.f12837f = c0442b;
        this.f12838g = c0442b;
    }

    public final void n(Context context, Z0 z3) {
        String string;
        int i7 = p241q.j.TextAppearance_android_textStyle;
        int i10 = this.f12841j;
        TypedArray typedArray = z3.f12863b;
        this.f12841j = typedArray.getInt(i7, i10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = typedArray.getInt(p241q.j.TextAppearance_android_textFontWeight, -1);
            this.f12842k = i12;
            if (i12 != -1) {
                this.f12841j &= 2;
            }
        }
        if (!typedArray.hasValue(p241q.j.TextAppearance_android_fontFamily) && !typedArray.hasValue(p241q.j.TextAppearance_fontFamily)) {
            if (typedArray.hasValue(p241q.j.TextAppearance_android_typeface)) {
                this.f12844m = false;
                int i13 = typedArray.getInt(p241q.j.TextAppearance_android_typeface, 1);
                if (i13 == 1) {
                    this.f12843l = Typeface.SANS_SERIF;
                    return;
                } else if (i13 == 2) {
                    this.f12843l = Typeface.SERIF;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f12843l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f12843l = null;
        int i14 = typedArray.hasValue(p241q.j.TextAppearance_fontFamily) ? p241q.j.TextAppearance_fontFamily : p241q.j.TextAppearance_android_fontFamily;
        int i15 = this.f12842k;
        int i16 = this.f12841j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceD = z3.d(i14, this.f12841j, new Q(this, i15, i16, new WeakReference(this.f12832a)));
                if (typefaceD != null) {
                    if (i11 < 28 || this.f12842k == -1) {
                        this.f12843l = typefaceD;
                    } else {
                        this.f12843l = U.a(Typeface.create(typefaceD, 0), this.f12842k, (this.f12841j & 2) != 0);
                    }
                }
                this.f12844m = this.f12843l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f12843l != null || (string = typedArray.getString(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f12842k == -1) {
            this.f12843l = Typeface.create(string, this.f12841j);
        } else {
            this.f12843l = U.a(Typeface.create(string, 0), this.f12842k, (this.f12841j & 2) != 0);
        }
    }
}
