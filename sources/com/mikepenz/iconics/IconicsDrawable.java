package com.mikepenz.iconics;

import H5.b;
import H5.c;
import H5.h;
import I5.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.camera.core.impl.utils.executor.g;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000B\t\b\u0000¢\u0006\u0004\b\u0001\u0010\u0002B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0018\u00010\u0005R\u00020\u0003¢\u0006\u0004\b\u0001\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0018\u00010\u0005R\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0001\u0010\nB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0018\u00010\u0005R\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0001\u0010\fB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0018\u00010\u0005R\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u0001\u0010\u000eB1\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0018\u00010\u0005R\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u0001\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0001\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0001\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0001\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u0001\u0010\u0017B!\b\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\t\u001a\u00020\r¢\u0006\u0004\b\u0001\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/mikepenz/iconics/IconicsDrawable;", "<init>", "()V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V", "", "icon", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;C)V", "", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Ljava/lang/String;)V", "Lcom/mikepenz/iconics/typeface/IIcon;", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lcom/mikepenz/iconics/typeface/IIcon;)V", "Lcom/mikepenz/iconics/typeface/ITypeface;", "typeface", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lcom/mikepenz/iconics/typeface/ITypeface;Lcom/mikepenz/iconics/typeface/IIcon;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "(Landroid/content/Context;C)V", "(Landroid/content/Context;Ljava/lang/String;)V", "(Landroid/content/Context;Lcom/mikepenz/iconics/typeface/IIcon;)V", "(Landroid/content/Context;Lcom/mikepenz/iconics/typeface/ITypeface;Lcom/mikepenz/iconics/typeface/IIcon;)V", "iconics-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class IconicsDrawable extends Drawable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f23569A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f23570B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f23571C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public float f23572D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f23573E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ColorStateList f23574F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public PorterDuff.Mode f23575G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public PorterDuffColorFilter f23576H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ColorFilter f23577I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Resources f23578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f23579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f23580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f23581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f23582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f23583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f23584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f23585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f23586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IIcon f23588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f23589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f23592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f23595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f23596s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f23597u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f23598v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23601y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f23602z;

    public IconicsDrawable() {
        TextPaint textPaint = new TextPaint(1);
        c cVar = new c(textPaint);
        this.f23580c = cVar;
        Paint paint = new Paint(1);
        this.f23581d = new c(paint);
        this.f23582e = new c(new Paint(1));
        Paint paint2 = new Paint(1);
        this.f23583f = new c(paint2);
        this.f23584g = new Rect();
        this.f23585h = new RectF();
        this.f23586i = new Path();
        this.f23587j = 255;
        this.f23591n = true;
        this.f23592o = true;
        this.f23593p = -1;
        this.f23594q = -1;
        this.f23595r = b.f3698d;
        this.f23597u = -1.0f;
        this.f23598v = -1.0f;
        this.f23575G = PorterDuff.Mode.SRC_IN;
        cVar.f3701c = ColorStateList.valueOf(-16777216);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setUnderlineText(false);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
    }

    public static IconicsDrawable b(IconicsDrawable iconicsDrawable, a aVar, int i7) {
        a aVar2 = (i7 & 1) != 0 ? null : aVar;
        Resources res = iconicsDrawable.c();
        Resources.Theme theme = iconicsDrawable.f23579b;
        c cVar = iconicsDrawable.f23580c;
        ColorStateList colorStateList = cVar.f3701c;
        Paint.Style style = ((TextPaint) cVar.f3699a).getStyle();
        Intrinsics.checkNotNullExpressionValue(style, "iconBrush.paint.style");
        Typeface typeface = ((TextPaint) iconicsDrawable.f23580c.f3699a).getTypeface();
        ColorStateList colorStateList2 = iconicsDrawable.f23581d.f3701c;
        ColorStateList colorStateList3 = iconicsDrawable.f23582e.f3701c;
        ColorStateList colorStateList4 = iconicsDrawable.f23583f.f3701c;
        int i10 = iconicsDrawable.f23587j;
        IIcon iIcon = iconicsDrawable.f23588k;
        String str = iconicsDrawable.f23589l;
        boolean z3 = iconicsDrawable.f23590m;
        int i11 = iconicsDrawable.f23593p;
        int i12 = iconicsDrawable.f23594q;
        a aVar3 = aVar2;
        boolean z8 = iconicsDrawable.f23595r;
        boolean z10 = iconicsDrawable.f23596s;
        boolean z11 = iconicsDrawable.t;
        float f10 = iconicsDrawable.f23597u;
        float f11 = iconicsDrawable.f23598v;
        int i13 = iconicsDrawable.f23599w;
        int i14 = iconicsDrawable.f23600x;
        int i15 = iconicsDrawable.f23601y;
        int i16 = iconicsDrawable.f23602z;
        int i17 = iconicsDrawable.f23569A;
        float f12 = iconicsDrawable.f23570B;
        float f13 = iconicsDrawable.f23571C;
        float f14 = iconicsDrawable.f23572D;
        int i18 = iconicsDrawable.f23573E;
        ColorStateList colorStateList5 = iconicsDrawable.f23574F;
        PorterDuff.Mode tintPorterMode = iconicsDrawable.f23575G;
        ColorFilter colorFilter = iconicsDrawable.f23577I;
        iconicsDrawable.getClass();
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(tintPorterMode, "tintPorterMode");
        IconicsDrawable iconicsDrawable2 = aVar3 == null ? new IconicsDrawable(res, theme) : aVar3;
        iconicsDrawable2.a(new h(colorStateList, style, typeface, colorStateList2, colorStateList3, colorStateList4, i10, iIcon, str, z3, i11, i12, z8, z10, z11, f10, f11, i13, i14, i15, i16, i17, f12, f13, f14, i18, colorStateList5, tintPorterMode, colorFilter));
        return iconicsDrawable2;
    }

    public final void a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f23591n = false;
        invalidateSelf();
        block.invoke(this);
        this.f23591n = true;
        invalidateSelf();
        invalidateSelf();
    }

    public final Resources c() {
        Resources resources = this.f23578a;
        if (resources != null) {
            return resources;
        }
        Intrinsics.n("res");
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.f23577I = null;
        d();
    }

    public final void d() {
        if (this.f23591n) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Path path = this.f23586i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f23588k == null && this.f23589l == null) {
            return;
        }
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
        n(bounds);
        o(bounds);
        e();
        if (this.f23590m && getLayoutDirection() == 1) {
            canvas.translate(getBounds().right - getBounds().left, 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        if (this.f23598v > -1.0f && this.f23597u > -1.0f) {
            boolean z3 = this.t;
            c cVar = this.f23582e;
            if (z3) {
                float f10 = this.f23601y / 2;
                RectF rectF = new RectF(f10, f10, bounds.width() - f10, bounds.height() - f10);
                canvas.drawRoundRect(rectF, this.f23597u, this.f23598v, cVar.f3699a);
                canvas.drawRoundRect(rectF, this.f23597u, this.f23598v, this.f23581d.f3699a);
            } else {
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, bounds.width(), bounds.height()), this.f23597u, this.f23598v, cVar.f3699a);
            }
        }
        try {
            o oVar = q.f43977a;
            path.close();
            Unit unit = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            g.f(th);
        }
        if (this.f23596s) {
            canvas.drawPath(path, this.f23583f.f3699a);
        }
        c cVar2 = this.f23580c;
        TextPaint textPaint = (TextPaint) cVar2.f3699a;
        ColorFilter colorFilter = this.f23577I;
        if (colorFilter == null) {
            colorFilter = this.f23576H;
        }
        textPaint.setColorFilter(colorFilter);
        canvas.drawPath(path, cVar2.f3699a);
    }

    public final void e() {
        boolean z3 = this.f23595r;
        Path path = this.f23586i;
        if (z3) {
            path.offset(this.f23602z, this.f23569A);
            return;
        }
        Rect rect = this.f23584g;
        float fWidth = rect.width();
        RectF rectF = this.f23585h;
        float f10 = 2;
        path.offset(((fWidth - rectF.width()) / f10) + this.f23602z, ((rect.height() - rectF.height()) / f10) + this.f23569A);
    }

    public final void f(ColorStateList colorStateList) {
        c cVar = this.f23582e;
        cVar.f3701c = colorStateList;
        boolean z3 = this.f23591n;
        this.f23591n = false;
        invalidateSelf();
        if (this.f23597u == -1.0f) {
            this.f23597u = 0.0f;
            d();
        }
        if (this.f23598v == -1.0f) {
            this.f23598v = 0.0f;
            d();
        }
        this.f23591n = z3;
        invalidateSelf();
        if (cVar.a(getState())) {
            d();
        }
    }

    public final void g(ColorStateList colorStateList) {
        c cVar = this.f23580c;
        cVar.f3701c = colorStateList;
        if (cVar.a(getState())) {
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f23587j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f23594q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f23593p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.f23576H != null || this.f23577I != null) {
            return -3;
        }
        int i7 = this.f23587j;
        if (i7 != 0) {
            return i7 != 255 ? -3 : -1;
        }
        return -2;
    }

    public final void h(boolean z3) {
        if (z3 != this.t) {
            this.t = z3;
            j(((z3 ? 1 : -1) * this.f23601y * 2) + this.f23599w);
            d();
        }
    }

    public final void i(IIcon iIcon) {
        ITypeface typeface;
        this.f23588k = iIcon;
        ((TextPaint) this.f23580c.f3699a).setTypeface((iIcon == null || (typeface = iIcon.getTypeface()) == null) ? null : typeface.getRawTypeface());
        d();
        if (this.f23588k != null) {
            this.f23589l = null;
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r3, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainStyledAttributes;
        Intrinsics.checkNotNullParameter(r3, "r");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.inflate(r3, parser, attrs, theme);
        Intrinsics.checkNotNullParameter(r3, "<set-?>");
        this.f23578a = r3;
        this.f23579b = theme;
        int[] Iconics = K5.a.Iconics;
        Intrinsics.checkNotNullExpressionValue(Iconics, "Iconics");
        if (theme == null) {
            typedArrayObtainStyledAttributes = r3.obtainAttributes(attrs, Iconics);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "{\n            res.obtain…tes(set, attrs)\n        }");
        } else {
            typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attrs, Iconics, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "theme.obtainStyledAttributes(set, attrs, 0, 0)");
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        J5.c cVar = new J5.c(r3, theme, typedArray, K5.a.Iconics_ico_icon, K5.a.Iconics_ico_size, K5.a.Iconics_ico_color, K5.a.Iconics_ico_padding, K5.a.Iconics_ico_offset_x, K5.a.Iconics_ico_offset_y, K5.a.Iconics_ico_contour_color, K5.a.Iconics_ico_contour_width, K5.a.Iconics_ico_background_color, K5.a.Iconics_ico_corner_radius, K5.a.Iconics_ico_background_contour_color, K5.a.Iconics_ico_background_contour_width, K5.a.Iconics_ico_shadow_radius, K5.a.Iconics_ico_shadow_dx, K5.a.Iconics_ico_shadow_dy, K5.a.Iconics_ico_shadow_color, K5.a.Iconics_ico_animations, K5.a.Iconics_ico_automirror);
        Intrinsics.checkNotNullParameter(this, "icon");
        cVar.b(this, false);
        typedArray.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        return this.f23580c.b() || this.f23583f.b() || this.f23582e.b() || this.f23581d.b() || ((colorStateList = this.f23574F) != null && colorStateList.isStateful());
    }

    public final void j(int i7) {
        if (this.f23599w != i7) {
            if (this.f23596s) {
                i7 += this.f23600x;
            }
            if (this.t) {
                i7 += this.f23601y;
            }
            this.f23599w = i7;
            d();
        }
    }

    public final void k(int i7) {
        this.f23593p = i7;
        setBounds(0, 0, i7, this.f23594q);
    }

    public final void l(int i7) {
        this.f23594q = i7;
        setBounds(0, 0, this.f23593p, i7);
    }

    public final boolean m(int[] iArr) {
        if (iArr != null) {
            return super.setState(iArr);
        }
        return false;
    }

    public final void n(Rect rect) {
        int i7 = this.f23599w;
        if (i7 < 0 || i7 * 2 > rect.width() || this.f23599w * 2 > rect.height()) {
            return;
        }
        int i10 = rect.left;
        int i11 = this.f23599w;
        this.f23584g.set(i10 + i11, rect.top + i11, rect.right - i11, rect.bottom - i11);
    }

    public final void o(Rect rect) {
        String strValueOf;
        IIcon iIcon = this.f23588k;
        if (iIcon == null || (strValueOf = Character.valueOf(iIcon.getCharacter()).toString()) == null) {
            strValueOf = String.valueOf(this.f23589l);
        }
        String str = strValueOf;
        Rect rect2 = this.f23584g;
        float fHeight = rect2.height();
        c cVar = this.f23580c;
        ((TextPaint) cVar.f3699a).setTextSize(fHeight);
        Paint paint = cVar.f3699a;
        int length = str.length();
        Path path = this.f23586i;
        ((TextPaint) paint).getTextPath(str, 0, length, 0.0f, 0.0f, path);
        RectF rectF = this.f23585h;
        path.computeBounds(rectF, true);
        if (this.f23595r) {
            path.offset(rect.exactCenterX(), (rect2.top + fHeight) - ((TextPaint) paint).getFontMetrics().descent);
            return;
        }
        float fWidth = rect2.width() / rectF.width();
        float fHeight2 = rect2.height() / rectF.height();
        if (fWidth >= fHeight2) {
            fWidth = fHeight2;
        }
        ((TextPaint) paint).setTextSize(fHeight * fWidth);
        ((TextPaint) paint).getTextPath(str, 0, str.length(), 0.0f, 0.0f, path);
        path.computeBounds(rectF, true);
        path.offset(rect2.left - rectF.left, rect2.top - rectF.top);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        n(bounds);
        o(bounds);
        e();
        try {
            o oVar = q.f43977a;
            this.f23586i.close();
            Unit unit = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            g.f(th);
        }
        super.onBoundsChange(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] stateSet) {
        Intrinsics.checkNotNullParameter(stateSet, "stateSet");
        boolean z3 = this.f23581d.a(stateSet) || (this.f23582e.a(stateSet) || (this.f23583f.a(stateSet) || this.f23580c.a(stateSet)));
        if (this.f23574F == null) {
            return z3;
        }
        q();
        return true;
    }

    public final void p() {
        if (this.f23592o) {
            ((TextPaint) this.f23580c.f3699a).setShadowLayer(this.f23570B, this.f23571C, this.f23572D, this.f23573E);
            d();
        }
    }

    public final void q() {
        ColorStateList colorStateList = this.f23574F;
        PorterDuff.Mode mode = this.f23575G;
        if (colorStateList == null) {
            this.f23576H = null;
        } else {
            this.f23576H = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f23580c.c(i7);
        this.f23583f.c(i7);
        this.f23582e.c(i7);
        this.f23581d.c(i7);
        this.f23587j = i7;
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23577I = colorFilter;
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        ColorStateList colorStateList;
        return m(iArr) || this.f23580c.b() || this.f23583f.b() || this.f23582e.b() || this.f23581d.b() || ((colorStateList = this.f23574F) != null && colorStateList.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f23574F = colorStateList;
        q();
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode value) {
        if (value == null) {
            value = PorterDuff.Mode.SRC_IN;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        this.f23575G = value;
        q();
        d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconicsDrawable(@NotNull Resources res, @Nullable Resources.Theme theme) {
        this();
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(res, "<set-?>");
        this.f23578a = res;
        this.f23579b = theme;
    }

    public /* synthetic */ IconicsDrawable(Resources resources, Resources.Theme theme, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i7 & 2) != 0 ? null : theme);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconicsDrawable(@NotNull Resources res, @Nullable Resources.Theme theme, char c6) {
        this(res, theme);
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(this, "<this>");
        String strValueOf = String.valueOf(c6);
        this.f23589l = strValueOf;
        if (strValueOf != null) {
            i(null);
            d();
        }
    }

    public /* synthetic */ IconicsDrawable(Resources resources, Resources.Theme theme, char c6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i7 & 2) != 0 ? null : theme, c6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconicsDrawable(@NotNull Resources res, @Nullable Resources.Theme theme, @NotNull String icon) {
        this(res, theme);
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(icon, "icon");
        D3.a.k(this, icon);
    }

    public /* synthetic */ IconicsDrawable(Resources resources, Resources.Theme theme, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i7 & 2) != 0 ? null : theme, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconicsDrawable(@NotNull Resources res, @Nullable Resources.Theme theme, @NotNull IIcon icon) {
        this(res, theme);
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(icon, "icon");
        D3.a.i(this, icon);
    }

    public /* synthetic */ IconicsDrawable(Resources resources, Resources.Theme theme, IIcon iIcon, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i7 & 2) != 0 ? null : theme, iIcon);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconicsDrawable(@NotNull Resources res, @Nullable Resources.Theme theme, @NotNull ITypeface typeface, @NotNull IIcon icon) {
        this(res, theme);
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Intrinsics.checkNotNullParameter(icon, "icon");
        D3.a.j(this, typeface, icon);
    }

    public /* synthetic */ IconicsDrawable(Resources resources, Resources.Theme theme, ITypeface iTypeface, IIcon iIcon, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i7 & 2) != 0 ? null : theme, iTypeface, iIcon);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IconicsDrawable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        this(resources, context.getTheme());
        b.a(context);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IconicsDrawable(@NotNull Context context, char c6) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        this(resources, context.getTheme());
        b.a(context);
        Intrinsics.checkNotNullParameter(this, "<this>");
        String strValueOf = String.valueOf(c6);
        this.f23589l = strValueOf;
        if (strValueOf != null) {
            i(null);
            d();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IconicsDrawable(@NotNull Context context, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        this(resources, context.getTheme());
        b.a(context);
        D3.a.k(this, icon);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IconicsDrawable(@NotNull Context context, @NotNull IIcon icon) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        this(resources, context.getTheme());
        b.a(context);
        D3.a.i(this, icon);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IconicsDrawable(@NotNull Context context, @NotNull ITypeface typeface, @NotNull IIcon icon) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        this(resources, context.getTheme());
        b.a(context);
        D3.a.j(this, typeface, icon);
    }
}
