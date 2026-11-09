package com.rollingtextview;

import G7.j;
import Gb.z;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.rollingtextview.strategy.CharOrderStrategy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p039cb.c;
import p117hd.a;
import p294tb.RunnableC2060w;
import p365y7.e;
import p379z7.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010(\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010'R(\u0010/\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R$\u00106\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0011\"\u0004\b5\u0010'R$\u0010<\u001a\u0002072\u0006\u0010*\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/rollingtextview/RollingTextView;", "Landroid/view/View;", "", ReactTextInputShadowNode.PROP_TEXT, "", "setText", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "", "textSize", "setTextSize", "(F)V", "getTextSize", "()F", "", "getBaseline", "()I", "", "p", "J", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "animationDuration", "Landroid/view/animation/Interpolator;", "t", "Landroid/view/animation/Interpolator;", "getAnimationInterpolator", "()Landroid/view/animation/Interpolator;", "setAnimationInterpolator", "(Landroid/view/animation/Interpolator;)V", "animationInterpolator", ViewProps.COLOR, "v", "I", "getTextColor", "setTextColor", "(I)V", "textColor", "Landroid/graphics/Typeface;", "value", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "typeface", "", "getCurrentText", "()[C", "currentText", "getLetterSpacingExtra", "setLetterSpacingExtra", "letterSpacingExtra", "Lcom/rollingtextview/strategy/CharOrderStrategy;", "getCharStrategy", "()Lcom/rollingtextview/strategy/CharOrderStrategy;", "setCharStrategy", "(Lcom/rollingtextview/strategy/CharOrderStrategy;)V", "charStrategy", "lib_rollingtextview_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class RollingTextView extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f24998w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f25001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f25002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f25003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ValueAnimator f25004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f25005g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25007j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f25008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public long animationDuration;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public Interpolator animationInterpolator;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public int textColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RollingTextView(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void b(RollingTextView rollingTextView, D d2, C c6, C c10, C c11, F f10, C c12, TypedArray typedArray) {
        rollingTextView.f25006i = typedArray.getInt(a.RollingTextView_android_gravity, rollingTextView.f25006i);
        d2.f38949a = typedArray.getColor(a.RollingTextView_android_shadowColor, d2.f38949a);
        c6.f38948a = typedArray.getFloat(a.RollingTextView_android_shadowDx, c6.f38948a);
        c10.f38948a = typedArray.getFloat(a.RollingTextView_android_shadowDy, c10.f38948a);
        c11.f38948a = typedArray.getFloat(a.RollingTextView_android_shadowRadius, c11.f38948a);
        String string = typedArray.getString(a.RollingTextView_android_text);
        if (string == null) {
            string = "";
        }
        f10.f38951a = string;
        rollingTextView.setTextColor(typedArray.getColor(a.RollingTextView_android_textColor, rollingTextView.textColor));
        c12.f38948a = typedArray.getDimension(a.RollingTextView_android_textSize, c12.f38948a);
        rollingTextView.f25007j = typedArray.getInt(a.RollingTextView_android_textStyle, rollingTextView.f25007j);
    }

    public final void c(CharSequence text, boolean z3) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f25008o = text;
        e eVar = this.f25003e;
        if (z3) {
            eVar.e(text);
            ValueAnimator valueAnimator = this.f25004f;
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            valueAnimator.setDuration(getAnimationDuration());
            valueAnimator.setInterpolator(getAnimationInterpolator());
            post(new RunnableC2060w(valueAnimator, 6));
            return;
        }
        CharOrderStrategy charStrategy = getCharStrategy();
        setCharStrategy(new p379z7.e(1));
        eVar.e(text);
        setCharStrategy(charStrategy);
        eVar.d();
        requestLayout();
        invalidate();
    }

    public final void d(int i7, float f10) {
        Context context = getContext();
        Resources resources = context == null ? null : context.getResources();
        if (resources == null) {
            resources = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(resources, "getSystem()");
        }
        this.f25001c.setTextSize(TypedValue.applyDimension(i7, f10, resources.getDisplayMetrics()));
        this.f25003e.f();
        requestLayout();
        invalidate();
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    @NotNull
    public final Interpolator getAnimationInterpolator() {
        return this.animationInterpolator;
    }

    @Override // android.view.View
    public int getBaseline() {
        Paint.FontMetrics fontMetrics = this.f25001c.getFontMetrics();
        float f10 = 2;
        float f11 = this.f25003e.f44145g / f10;
        float f12 = fontMetrics.descent;
        return (int) ((((f12 - fontMetrics.ascent) / f10) - f12) + f11);
    }

    @NotNull
    public final CharOrderStrategy getCharStrategy() {
        return (CharOrderStrategy) this.f25002d.f18901b;
    }

    @NotNull
    public final char[] getCurrentText() {
        return this.f25003e.b();
    }

    public final int getLetterSpacingExtra() {
        return this.f25003e.f44144f;
    }

    @NotNull
    /* JADX INFO: renamed from: getText, reason: from getter */
    public final CharSequence getF25008o() {
        return this.f25008o;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.f25001c.getTextSize();
    }

    @Nullable
    public final Typeface getTypeface() {
        return this.f25001c.getTypeface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        e eVar = this.f25003e;
        float fC = eVar.c();
        float f10 = eVar.f44145g;
        Rect rect = this.f25005g;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i7 = this.f25006i;
        float f11 = (i7 & 16) == 16 ? ((iHeight - f10) / 2.0f) + rect.top : 0.0f;
        float f12 = (i7 & 1) == 1 ? ((iWidth - fC) / 2.0f) + rect.left : 0.0f;
        if ((i7 & 48) == 48) {
            f11 = rect.top;
        }
        if ((i7 & 80) == 80) {
            f11 = (iHeight - f10) + rect.top;
        }
        if ((i7 & 8388611) == 8388611) {
            f12 = rect.left;
        }
        if ((i7 & 8388613) == 8388613) {
            f12 = (iWidth - fC) + rect.left;
        }
        canvas.translate(f12, f11);
        canvas.clipRect(0.0f, 0.0f, fC, f10);
        canvas.translate(0.0f, eVar.f44146h);
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        for (p365y7.c cVar : eVar.f44142d) {
            cVar.getClass();
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            int iSave = canvas.save();
            Rect clipBounds = canvas.getClipBounds();
            Intrinsics.checkNotNullExpressionValue(clipBounds, "canvas.clipBounds");
            canvas.clipRect(0, clipBounds.top, (int) cVar.f44131e, clipBounds.bottom);
            b bVar = cVar.f44130d;
            int i10 = bVar.f44500b;
            int i11 = bVar.f44499a;
            if (i10 == 0) {
                int i12 = cVar.f44136j + 1;
                float f13 = ((float) cVar.f44135i) - (cVar.f44131e * i11);
                canvas2 = canvas;
                p365y7.c.a(cVar, canvas2, i12, f13, 0.0f, 16);
                p365y7.c.a(cVar, canvas2, cVar.f44136j, (float) cVar.f44135i, 0.0f, 16);
                p365y7.c.a(cVar, canvas2, cVar.f44136j - 1, (cVar.f44131e * cVar.f44130d.f44499a) + ((float) cVar.f44135i), 0.0f, 16);
            } else {
                int i13 = cVar.f44136j + 1;
                float f14 = (float) cVar.f44135i;
                e eVar2 = cVar.f44127a;
                float f15 = f14 - (eVar2.f44145g * i11);
                canvas2 = canvas;
                p365y7.c.a(cVar, canvas2, i13, 0.0f, f15, 8);
                p365y7.c.a(cVar, canvas2, cVar.f44136j, 0.0f, (float) cVar.f44135i, 8);
                p365y7.c.a(cVar, canvas2, cVar.f44136j - 1, 0.0f, (eVar2.f44145g * cVar.f44130d.f44499a) + ((float) cVar.f44135i), 8);
            }
            canvas2.restoreToCount(iSave);
            canvas2.translate(cVar.f44131e + eVar.f44144f, 0.0f);
            canvas = canvas2;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        e eVar = this.f25003e;
        this.f24999a = getPaddingRight() + getPaddingLeft() + ((int) eVar.c());
        this.f25000b = getPaddingBottom() + getPaddingTop() + ((int) eVar.f44145g);
        setMeasuredDimension(View.resolveSize(this.f24999a, i7), View.resolveSize(this.f25000b, i10));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f25005g.set(getPaddingLeft(), getPaddingTop(), i7 - getPaddingRight(), i10 - getPaddingBottom());
    }

    public final void setAnimationDuration(long j6) {
        this.animationDuration = j6;
    }

    public final void setAnimationInterpolator(@NotNull Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "<set-?>");
        this.animationInterpolator = interpolator;
    }

    public final void setCharStrategy(@NotNull CharOrderStrategy value) {
        Intrinsics.checkNotNullParameter(value, "value");
        c cVar = this.f25002d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(value, "<set-?>");
        cVar.f18901b = value;
    }

    public final void setLetterSpacingExtra(int i7) {
        this.f25003e.f44144f = i7;
    }

    public final void setText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        c(text, !TextUtils.isEmpty(this.f25008o));
    }

    public final void setTextColor(int i7) {
        if (this.textColor != i7) {
            this.textColor = i7;
            this.f25001c.setColor(i7);
            invalidate();
        }
    }

    public final void setTextSize(float textSize) {
        d(2, textSize);
    }

    public final void setTypeface(@Nullable Typeface typeface) {
        Paint paint = this.f25001c;
        int i7 = this.f25007j;
        if (i7 == 1) {
            typeface = Typeface.create(typeface, 1);
        } else if (i7 == 2) {
            typeface = Typeface.create(typeface, 2);
        } else if (i7 == 3) {
            typeface = Typeface.create(typeface, 3);
        }
        paint.setTypeface(typeface);
        this.f25003e.f();
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RollingTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RollingTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RollingTextView(Context context, AttributeSet attributeSet, int i7, int i10) {
        D d2;
        C c6;
        C c10;
        C c11;
        F f10;
        AttributeSet attributeSet2 = (i10 & 2) != 0 ? null : attributeSet;
        int i11 = (i10 & 4) != 0 ? 0 : i7;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet2, i11);
        Paint paint = new Paint();
        this.f25001c = paint;
        c cVar = new c(18);
        this.f25002d = cVar;
        this.f25003e = new e(paint, cVar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f);
        this.f25004f = valueAnimatorOfFloat;
        this.f25005g = new Rect();
        this.f25006i = 8388613;
        this.f25008o = "";
        this.animationDuration = 750L;
        D d10 = new D();
        C c12 = new C();
        C c13 = new C();
        C c14 = new C();
        F f11 = new F();
        f11.f38951a = "";
        C c15 = new C();
        c15.f38948a = TypedValue.applyDimension(2, 12.0f, context.getResources().getDisplayMetrics());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, a.RollingTextView, i11, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…efStyleAttr, defStyleRes)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(a.RollingTextView_android_textAppearance, -1);
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, a.RollingTextView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.RollingTextView)");
            c6 = c12;
            c10 = c13;
            c11 = c14;
            d2 = d10;
            f10 = f11;
            b(this, d2, c6, c10, c11, f10, c15, typedArrayObtainStyledAttributes2);
            typedArrayObtainStyledAttributes2.recycle();
        } else {
            d2 = d10;
            c6 = c12;
            c10 = c13;
            c11 = c14;
            f10 = f11;
        }
        b(this, d2, c6, c10, c11, f10, c15, typedArrayObtainStyledAttributes);
        this.animationDuration = typedArrayObtainStyledAttributes.getInt(a.RollingTextView_rollDuration, (int) this.animationDuration);
        paint.setAntiAlias(true);
        int i12 = d2.f38949a;
        if (i12 != 0) {
            paint.setShadowLayer(c11.f38948a, c6.f38948a, c10.f38948a, i12);
        }
        if (this.f25007j != 0) {
            setTypeface(paint.getTypeface());
        }
        d(0, c15.f38948a);
        c((CharSequence) f10.f38951a, false);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimatorOfFloat.addUpdateListener(new z(this, 9));
        valueAnimatorOfFloat.addListener(new j(this, 11));
        this.animationInterpolator = new LinearInterpolator();
        this.textColor = -16777216;
    }
}
