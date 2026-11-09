package com.transsnet.palmpay.credit.view;

import Ae.n;
import C0.G;
import Gb.A;
import Gb.z;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\b\tB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/view/MultiLoanCtaLightView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Gb/A", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiLoanCtaLightView extends View {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f30800p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ValueAnimator f30801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A f30803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f30805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f30806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f30807g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f30808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PathInterpolator f30809j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f30810o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiLoanCtaLightView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        ValueAnimator valueAnimator = this.f30801a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f30804d = 0.0f;
        ValueAnimator valueAnimatorD = G.d(1200L, new float[]{0.0f, 1.0f}, -1);
        valueAnimatorD.setInterpolator(new LinearInterpolator());
        valueAnimatorD.addUpdateListener(new z(this, 0));
        valueAnimatorD.start();
        this.f30801a = valueAnimatorD;
        invalidate();
    }

    public final void b() {
        if (this.f30802b) {
            ValueAnimator valueAnimator = this.f30801a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                if (getWidth() <= 0 || getHeight() <= 0) {
                    post(new n(this, 17));
                } else {
                    a();
                }
            }
        }
    }

    public final void c() {
        this.f30802b = false;
        ValueAnimator valueAnimator = this.f30801a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f30801a = null;
        this.f30804d = 0.0f;
        Paint paint = this.f30805e;
        paint.setMaskFilter(null);
        paint.setShader(null);
        setVisibility(8);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        c();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f || !this.f30802b) {
            return;
        }
        int iOrdinal = this.f30803c.ordinal();
        Paint paint = this.f30805e;
        Path path = this.f30807g;
        RectF rectF = this.f30808i;
        if (iOrdinal == 0) {
            float f10 = height / 2.0f;
            rectF.set(0.0f, 0.0f, width, height);
            path.reset();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            float f11 = 0.3646409f * width;
            PathInterpolator pathInterpolator = this.f30809j;
            float f12 = this.f30804d;
            if (f12 <= 0.6663f) {
                width = ((width + f11) * pathInterpolator.getInterpolation(b.b(f12 / 0.6663f, 0.0f, 1.0f))) + (-f11);
            }
            float f13 = 0.95454544f * f11;
            float fMax = Math.max(f13, height);
            paint.setMaskFilter(null);
            paint.setShader(new RadialGradient(width + f13, f10, fMax, new int[]{Color.argb(102, 255, 255, 255), Color.argb(0, 255, 255, 255)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            canvas.drawRoundRect(width, 0.0f, f11 + width, height, f10, f10, paint);
            canvas.restore();
            return;
        }
        if (iOrdinal != 1) {
            throw new l();
        }
        float f14 = height / 48.0f;
        float f15 = 46.0f * f14;
        float dp = CommonViewExtKt.getDp(12);
        rectF.set(0.0f, 0.0f, width, height);
        path.reset();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = this.f30810o;
        float f16 = this.f30804d;
        if (f16 <= 0.6677f) {
            width = ((width + f15) * accelerateDecelerateInterpolator.getInterpolation(b.b(f16 / 0.6677f, 0.0f, 1.0f))) + (-f15);
        }
        canvas.translate(width, 0.0f);
        Path path2 = this.f30806f;
        path2.reset();
        path2.moveTo(13.8f * f14, 0.0f);
        path2.lineTo(f15, 0.0f);
        path2.lineTo(32.2f * f14, height);
        path2.lineTo(0.0f, height);
        path2.close();
        paint.setShader(new LinearGradient(f14 * 51.0f, f14 * 22.4474f, f14 * 11.0f, f14 * 11.7295f, Color.argb(107, 255, 255, 255), Color.argb(0, 255, 255, 255), Shader.TileMode.CLAMP));
        paint.setMaskFilter(new BlurMaskFilter(f14 * 4.6f, BlurMaskFilter.Blur.NORMAL));
        canvas.drawPath(path2, paint);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (!this.f30802b || i7 <= 0 || i10 <= 0 || getVisibility() != 0) {
            return;
        }
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiLoanCtaLightView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30803c = A.f3219a;
        this.f30805e = new Paint(1);
        this.f30806f = new Path();
        this.f30807g = new Path();
        this.f30808i = new RectF();
        this.f30809j = new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
        this.f30810o = new AccelerateDecelerateInterpolator();
        setClickable(false);
        setFocusable(false);
        setWillNotDraw(false);
        setVisibility(8);
    }
}
