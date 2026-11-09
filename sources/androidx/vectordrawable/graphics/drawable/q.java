package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final PorterDuff.Mode f18212o = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f18213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f18214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorFilter f18215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f18218g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f18219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f18220j;

    public q() {
        this.f18217f = true;
        this.f18218g = new float[9];
        this.f18219i = new Matrix();
        this.f18220j = new Rect();
        o oVar = new o();
        oVar.f18201c = null;
        oVar.f18202d = f18212o;
        oVar.f18200b = new n();
        this.f18213b = oVar;
    }

    public static q a(Resources.Theme theme, Resources resources, int i7) {
        q qVar = new q();
        ThreadLocal threadLocal = Y.j.f11254a;
        qVar.f18157a = resources.getDrawable(i7, theme);
        new p(qVar.f18157a.getConstantState());
        return qVar;
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f18157a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f18220j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f18215d;
        if (colorFilter == null) {
            colorFilter = this.f18214c;
        }
        Matrix matrix = this.f18219i;
        canvas.getMatrix(matrix);
        float[] fArr = this.f18218g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f18213b;
        Bitmap bitmap = oVar.f18204f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f18204f.getHeight()) {
            oVar.f18204f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.f18209k = true;
        }
        if (this.f18217f) {
            o oVar2 = this.f18213b;
            if (oVar2.f18209k || oVar2.f18205g != oVar2.f18201c || oVar2.f18206h != oVar2.f18202d || oVar2.f18208j != oVar2.f18203e || oVar2.f18207i != oVar2.f18200b.getRootAlpha()) {
                o oVar3 = this.f18213b;
                oVar3.f18204f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f18204f);
                n nVar = oVar3.f18200b;
                nVar.a(nVar.f18190g, n.f18183p, canvas2, iMin, iMin2);
                o oVar4 = this.f18213b;
                oVar4.f18205g = oVar4.f18201c;
                oVar4.f18206h = oVar4.f18202d;
                oVar4.f18207i = oVar4.f18200b.getRootAlpha();
                oVar4.f18208j = oVar4.f18203e;
                oVar4.f18209k = false;
            }
        } else {
            o oVar5 = this.f18213b;
            oVar5.f18204f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f18204f);
            n nVar2 = oVar5.f18200b;
            nVar2.a(nVar2.f18190g, n.f18183p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.f18213b;
        if (oVar6.f18200b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f18210l == null) {
                Paint paint2 = new Paint();
                oVar6.f18210l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f18210l.setAlpha(oVar6.f18200b.getRootAlpha());
            oVar6.f18210l.setColorFilter(colorFilter);
            paint = oVar6.f18210l;
        }
        canvas.drawBitmap(oVar6.f18204f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getAlpha() : this.f18213b.f18200b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f18213b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getColorFilter() : this.f18215d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f18157a != null) {
            return new p(this.f18157a.getConstantState());
        }
        this.f18213b.f18199a = getChangingConfigurations();
        return this.f18213b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f18213b.f18200b.f18192i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f18213b.f18200b.f18191h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.isAutoMirrored() : this.f18213b.f18203e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.f18213b;
        if (oVar == null) {
            return false;
        }
        n nVar = oVar.f18200b;
        if (nVar.f18197n == null) {
            nVar.f18197n = Boolean.valueOf(nVar.f18190g.a());
        }
        if (nVar.f18197n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f18213b.f18201c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f18216e && super.mutate() == this) {
            o oVar = this.f18213b;
            o oVar2 = new o();
            oVar2.f18201c = null;
            oVar2.f18202d = f18212o;
            if (oVar != null) {
                oVar2.f18199a = oVar.f18199a;
                n nVar = new n(oVar.f18200b);
                oVar2.f18200b = nVar;
                if (oVar.f18200b.f18188e != null) {
                    nVar.f18188e = new Paint(oVar.f18200b.f18188e);
                }
                if (oVar.f18200b.f18187d != null) {
                    oVar2.f18200b.f18187d = new Paint(oVar.f18200b.f18187d);
                }
                oVar2.f18201c = oVar.f18201c;
                oVar2.f18202d = oVar.f18202d;
                oVar2.f18203e = oVar.f18203e;
            }
            this.f18213b = oVar2;
            this.f18216e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f18213b;
        ColorStateList colorStateList = oVar.f18201c;
        if (colorStateList == null || (mode = oVar.f18202d) == null) {
            z3 = false;
        } else {
            this.f18214c = b(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        n nVar = oVar.f18200b;
        if (nVar.f18197n == null) {
            nVar.f18197n = Boolean.valueOf(nVar.f18190g.a());
        }
        if (nVar.f18197n.booleanValue()) {
            boolean zB = oVar.f18200b.f18190g.b(iArr);
            oVar.f18209k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f18213b.f18200b.getRootAlpha() != i7) {
            this.f18213b.f18200b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f18213b.f18203e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f18215d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(int i7) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            org.chromium.support_lib_boundary.util.b.i0(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f18213b;
        if (oVar.f18201c != colorStateList) {
            oVar.f18201c = colorStateList;
            this.f18214c = b(colorStateList, oVar.f18202d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f18213b;
        if (oVar.f18202d != mode) {
            oVar.f18202d = mode;
            this.f18214c = b(oVar.f18201c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z8) {
        Drawable drawable = this.f18157a;
        return drawable != null ? drawable.setVisible(z3, z8) : super.setVisible(z3, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        n nVar;
        int i7;
        boolean z3;
        char c6;
        int i10;
        int i11;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f18157a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f18213b;
        oVar.f18200b = new n();
        TypedArray typedArrayH = Y.a.h(resources, theme, attributeSet, a.f18138a);
        o oVar2 = this.f18213b;
        n nVar2 = oVar2.f18200b;
        int iC = Y.a.c(typedArrayH, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (iC == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iC != 5) {
            if (iC != 9) {
                switch (iC) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f18202d = mode;
        int i12 = 1;
        ColorStateList colorStateListA = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayH.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 >= 28 && i13 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayH.getResources();
                int resourceId = typedArrayH.getResourceId(1, 0);
                ThreadLocal threadLocal = Y.b.f11236a;
                try {
                    colorStateListA = Y.b.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            oVar2.f18201c = colorStateList;
        }
        boolean z8 = oVar2.f18203e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z8 = typedArrayH.getBoolean(5, z8);
        }
        oVar2.f18203e = z8;
        float f10 = nVar2.f18193j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayH.getFloat(7, f10);
        }
        nVar2.f18193j = f10;
        float f11 = nVar2.f18194k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayH.getFloat(8, f11);
        }
        nVar2.f18194k = f11;
        boolean z10 = false;
        if (nVar2.f18193j <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            nVar2.f18191h = typedArrayH.getDimension(3, nVar2.f18191h);
            float dimension = typedArrayH.getDimension(2, nVar2.f18192i);
            nVar2.f18192i = dimension;
            if (nVar2.f18191h <= 0.0f) {
                throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayH.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = typedArrayH.getString(0);
                if (string != null) {
                    nVar2.f18196m = string;
                    nVar2.f18198o.put(string, nVar2);
                }
                typedArrayH.recycle();
                oVar.f18199a = getChangingConfigurations();
                oVar.f18209k = true;
                o oVar3 = this.f18213b;
                n nVar3 = oVar3.f18200b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f18190g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        M.f fVar = nVar3.f18198o;
                        nVar = nVar3;
                        if (zEquals) {
                            j jVar = new j();
                            jVar.f18159e = 0.0f;
                            jVar.f18161g = 1.0f;
                            jVar.f18162h = 1.0f;
                            i7 = depth;
                            jVar.f18163i = 0.0f;
                            jVar.f18164j = 1.0f;
                            jVar.f18165k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.f18166l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            jVar.f18167m = join2;
                            jVar.f18168n = 4.0f;
                            TypedArray typedArrayH2 = Y.a.h(resources, theme, attributeSet, a.f18140c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayH2.getString(0);
                                if (string2 != null) {
                                    jVar.f18181b = string2;
                                }
                                String string3 = typedArrayH2.getString(2);
                                if (string3 != null) {
                                    jVar.f18180a = androidx.core.graphics.o.k(string3);
                                }
                                jVar.f18160f = Y.a.b(typedArrayH2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = jVar.f18162h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = typedArrayH2.getFloat(12, f12);
                                }
                                jVar.f18162h = f12;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayH2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = jVar.f18166l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                jVar.f18166l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayH2.getInt(9, -1) : -1;
                                Paint.Join join3 = jVar.f18167m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                jVar.f18167m = join;
                                float f13 = jVar.f18168n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = typedArrayH2.getFloat(10, f13);
                                }
                                jVar.f18168n = f13;
                                jVar.f18158d = Y.a.b(typedArrayH2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = jVar.f18161g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = typedArrayH2.getFloat(11, f14);
                                }
                                jVar.f18161g = f14;
                                float f15 = jVar.f18159e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = typedArrayH2.getFloat(4, f15);
                                }
                                jVar.f18159e = f15;
                                float f16 = jVar.f18164j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = typedArrayH2.getFloat(6, f16);
                                }
                                jVar.f18164j = f16;
                                float f17 = jVar.f18165k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = typedArrayH2.getFloat(7, f17);
                                }
                                jVar.f18165k = f17;
                                float f18 = jVar.f18163i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = typedArrayH2.getFloat(5, f18);
                                }
                                jVar.f18163i = f18;
                                int i16 = jVar.f18182c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = typedArrayH2.getInt(13, i16);
                                }
                                jVar.f18182c = i16;
                            }
                            typedArrayH2.recycle();
                            kVar.f18170b.add(jVar);
                            if (jVar.getPathName() != null) {
                                fVar.put(jVar.getPathName(), jVar);
                            }
                            oVar3.f18199a = oVar3.f18199a;
                            i11 = 1;
                            z11 = false;
                            c6 = '\b';
                            z3 = false;
                        } else {
                            i7 = depth;
                            c6 = '\b';
                            z3 = false;
                            if ("clip-path".equals(name)) {
                                i iVar = new i();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayH3 = Y.a.h(resources, theme, attributeSet, a.f18141d);
                                    String string4 = typedArrayH3.getString(0);
                                    if (string4 != null) {
                                        iVar.f18181b = string4;
                                    }
                                    String string5 = typedArrayH3.getString(1);
                                    if (string5 != null) {
                                        iVar.f18180a = androidx.core.graphics.o.k(string5);
                                    }
                                    iVar.f18182c = !Y.a.e(xmlPullParser, "fillType") ? 0 : typedArrayH3.getInt(2, 0);
                                    typedArrayH3.recycle();
                                }
                                kVar.f18170b.add(iVar);
                                if (iVar.getPathName() != null) {
                                    fVar.put(iVar.getPathName(), iVar);
                                }
                                oVar3.f18199a = oVar3.f18199a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray typedArrayH4 = Y.a.h(resources, theme, attributeSet, a.f18139b);
                                float f19 = kVar2.f18171c;
                                if (Y.a.e(xmlPullParser, ViewProps.ROTATION)) {
                                    f19 = typedArrayH4.getFloat(5, f19);
                                }
                                kVar2.f18171c = f19;
                                i11 = 1;
                                kVar2.f18172d = typedArrayH4.getFloat(1, kVar2.f18172d);
                                kVar2.f18173e = typedArrayH4.getFloat(2, kVar2.f18173e);
                                float f20 = kVar2.f18174f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", ViewProps.SCALE_X) != null) {
                                    f20 = typedArrayH4.getFloat(3, f20);
                                }
                                kVar2.f18174f = f20;
                                float f21 = kVar2.f18175g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", ViewProps.SCALE_Y) != null) {
                                    f21 = typedArrayH4.getFloat(4, f21);
                                }
                                kVar2.f18175g = f21;
                                float f22 = kVar2.f18176h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", ViewProps.TRANSLATE_X) != null) {
                                    f22 = typedArrayH4.getFloat(6, f22);
                                }
                                kVar2.f18176h = f22;
                                float f23 = kVar2.f18177i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", ViewProps.TRANSLATE_Y) != null) {
                                    f23 = typedArrayH4.getFloat(7, f23);
                                }
                                kVar2.f18177i = f23;
                                String string6 = typedArrayH4.getString(0);
                                if (string6 != null) {
                                    kVar2.f18179k = string6;
                                }
                                kVar2.c();
                                typedArrayH4.recycle();
                                kVar.f18170b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    fVar.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f18199a = oVar3.f18199a;
                            }
                            i11 = 1;
                        }
                        i10 = i11;
                    } else {
                        nVar = nVar3;
                        i7 = depth;
                        z3 = z10;
                        c6 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    z10 = z3;
                    nVar3 = nVar;
                    depth = i7;
                }
                if (!z11) {
                    this.f18214c = b(oVar.f18201c, oVar.f18202d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f18217f = true;
        this.f18218g = new float[9];
        this.f18219i = new Matrix();
        this.f18220j = new Rect();
        this.f18213b = oVar;
        this.f18214c = b(oVar.f18201c, oVar.f18202d);
    }
}
