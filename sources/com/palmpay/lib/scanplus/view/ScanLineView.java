package com.palmpay.lib.scanplus.view;

import Ae.n;
import I6.e;
import I6.g;
import K6.d;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.DrawableRes;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.lib.scanplus.view.ScanLineView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0011R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\"\u0010'\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u001a\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001eR\"\u00107\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u0010\u001eR\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001a\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u0010\u001e¨\u0006D"}, d2 = {"Lcom/palmpay/lib/scanplus/view/ScanLineView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "id", "", "setTrailingBitmapRes", "(I)V", "Landroid/graphics/Bitmap;", "bitmap", "setTrailingBitmap", "(Landroid/graphics/Bitmap;)V", "t", "Landroid/graphics/Bitmap;", "getLineBitmap", "()Landroid/graphics/Bitmap;", "setLineBitmap", "lineBitmap", "", "v", "F", "getLineWidth", "()F", "setLineWidth", "(F)V", "lineWidth", "w", "getLineHeight", "setLineHeight", ViewProps.LINE_HEIGHT, "A", "getLineTop", "setLineTop", "lineTop", "", "B", "J", "getAnimatorTime", "()J", "setAnimatorTime", "(J)V", "animatorTime", "C", "getAnimatorWidth", "setAnimatorWidth", "animatorWidth", "H", "getAnimatorHeight", "setAnimatorHeight", "animatorHeight", "", "L", "[I", "getLineColor", "()[I", "setLineColor", "([I)V", "lineColor", "M", "getLineLeft", "setLineLeft", "lineLeft", "lib_scanplus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"UseCompatLoadingForDrawables"})
@SourceDebugExtension({"SMAP\nScanLineView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanLineView.kt\ncom/palmpay/lib/scanplus/view/ScanLineView\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,248:1\n29#2:249\n85#2,18:250\n29#2:268\n85#2,18:269\n*S KotlinDebug\n*F\n+ 1 ScanLineView.kt\ncom/palmpay/lib/scanplus/view/ScanLineView\n*L\n201#1:249\n201#1:250,18\n205#1:268\n205#1:269,18\n*E\n"})
public final class ScanLineView extends View {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f24022Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    public float lineTop;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    public long animatorTime;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    public float animatorWidth;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    public float animatorHeight;

    /* JADX INFO: renamed from: L, reason: collision with root package name and from kotlin metadata */
    public int[] lineColor;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    public float lineLeft;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f24029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f24030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f24032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bitmap f24033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f24034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f24035g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AnimatorSet f24037j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AnimatorSet f24038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24039p;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public Bitmap lineBitmap;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public float lineWidth;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public float lineHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanLineView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        AnimatorSet animatorSet = this.f24037j;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f24038o;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        AnimatorSet animatorSet3 = this.f24037j;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.f24038o;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        this.f24037j = null;
        this.f24038o = null;
    }

    public final float getAnimatorHeight() {
        return this.animatorHeight;
    }

    public final long getAnimatorTime() {
        return this.animatorTime;
    }

    public final float getAnimatorWidth() {
        return this.animatorWidth;
    }

    @Nullable
    public final Bitmap getLineBitmap() {
        return this.lineBitmap;
    }

    @NotNull
    public final int[] getLineColor() {
        return this.lineColor;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final float getLineLeft() {
        return this.lineLeft;
    }

    public final float getLineTop() {
        return this.lineTop;
    }

    public final float getLineWidth() {
        return this.lineWidth;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.lineWidth < getWidth()) {
            this.lineLeft = (getWidth() - this.lineWidth) / 2;
        } else {
            this.lineWidth = getWidth();
        }
        float f10 = this.lineTop;
        RectF rectF = this.f24030b;
        if (f10 == 0.0f) {
            rectF.top = ((getHeight() - this.animatorHeight) / 2) + this.f24031c;
        } else {
            rectF.top = f10 + this.f24031c;
        }
        float f11 = this.lineLeft;
        rectF.left = f11;
        rectF.right = f11 + this.lineWidth;
        rectF.bottom = rectF.top + this.lineHeight;
        Bitmap bitmap = this.lineBitmap;
        Paint paint = this.f24029a;
        if (bitmap == null) {
            float f12 = rectF.left;
            float f13 = rectF.top;
            float f14 = f12 + this.lineWidth;
            int[] iArr = this.lineColor;
            int i7 = iArr[0];
            int i10 = iArr[1];
            paint.setShader(new LinearGradient(f12, f13, f14, f13, new int[]{i7, i10, iArr[2], i10, i7}, (float[]) null, Shader.TileMode.CLAMP));
            if (canvas != null) {
                canvas.drawRect(rectF, paint);
            }
        } else if (canvas != null) {
            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        }
        boolean z3 = this.f24039p;
        Paint paint2 = this.f24032d;
        Rect rect = this.f24035g;
        if (z3) {
            float f15 = rectF.bottom;
            rect.top = (int) (f15 - this.f24036i);
            rect.left = (int) rectF.left;
            rect.right = (int) rectF.right;
            rect.bottom = (int) f15;
            if (canvas != null) {
                Bitmap bitmap2 = this.f24034f;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint2);
                    return;
                } else {
                    Intrinsics.n("rotateBitMap");
                    throw null;
                }
            }
            return;
        }
        float f16 = rectF.top;
        rect.top = (int) f16;
        rect.left = (int) rectF.left;
        rect.right = (int) rectF.right;
        rect.bottom = (int) (f16 + this.f24036i);
        if (canvas != null) {
            Bitmap bitmap3 = this.f24033e;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, (Rect) null, rect, paint2);
            } else {
                Intrinsics.n("trailingBitmap");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void requestLayout() {
        super.requestLayout();
        post(new n(this, 27));
    }

    public final void setAnimatorHeight(float f10) {
        this.animatorHeight = f10;
    }

    public final void setAnimatorTime(long j6) {
        this.animatorTime = j6;
    }

    public final void setAnimatorWidth(float f10) {
        this.animatorWidth = f10;
    }

    public final void setLineBitmap(@Nullable Bitmap bitmap) {
        this.lineBitmap = bitmap;
    }

    public final void setLineColor(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.lineColor = iArr;
    }

    public final void setLineHeight(float f10) {
        this.lineHeight = f10;
    }

    public final void setLineLeft(float f10) {
        this.lineLeft = f10;
    }

    public final void setLineTop(float f10) {
        this.lineTop = f10;
    }

    public final void setLineWidth(float f10) {
        this.lineWidth = f10;
    }

    public final void setTrailingBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f24033e = bitmap;
        Matrix matrix = new Matrix();
        Bitmap bitmap2 = this.f24033e;
        if (bitmap2 == null) {
            Intrinsics.n("trailingBitmap");
            throw null;
        }
        float width = bitmap2.getWidth() / 2;
        Bitmap bitmap3 = this.f24033e;
        if (bitmap3 == null) {
            Intrinsics.n("trailingBitmap");
            throw null;
        }
        matrix.setRotate(180.0f, width, bitmap3.getHeight() / 2);
        Bitmap bitmap4 = this.f24033e;
        if (bitmap4 == null) {
            Intrinsics.n("trailingBitmap");
            throw null;
        }
        if (bitmap4 == null) {
            Intrinsics.n("trailingBitmap");
            throw null;
        }
        int width2 = bitmap4.getWidth();
        Bitmap bitmap5 = this.f24033e;
        if (bitmap5 == null) {
            Intrinsics.n("trailingBitmap");
            throw null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap4, 0, 0, width2, bitmap5.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …           true\n        )");
        this.f24034f = bitmapCreateBitmap;
    }

    public final void setTrailingBitmapRes(@DrawableRes int id2) {
        Drawable drawable = getContext().getResources().getDrawable(id2);
        Intrinsics.checkNotNullExpressionValue(drawable, "context.resources.getDrawable(id)");
        Bitmap bitmapI = p264r5.a.I(drawable);
        this.f24033e = bitmapI;
        if (bitmapI != null) {
            setTrailingBitmap(bitmapI);
        } else {
            Intrinsics.n("trailingBitmap");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScanLineView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanLineView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        AnimatorSet.Builder builderPlay;
        AnimatorSet.Builder builderPlay2;
        AnimatorSet animatorSet;
        super(context, attributeSet, i7);
        final int i10 = 0;
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f24029a = paint;
        this.f24030b = new RectF();
        Paint paint2 = new Paint();
        this.f24032d = paint2;
        this.f24035g = new Rect();
        final int i11 = 1;
        this.f24039p = true;
        this.lineWidth = J3.a.S(320, context);
        this.lineHeight = (float) J3.a.R(context);
        this.animatorTime = 2000L;
        this.animatorWidth = J3.a.S(180, context);
        this.animatorHeight = J3.a.S(300, context);
        this.lineColor = new int[]{context.getColor(e.scan_line_1), context.getColor(e.scan_line_2), context.getColor(e.scan_line_3)};
        paint.setStyle(Paint.Style.FILL);
        setTrailingBitmapRes(g.scankit_scan_tail);
        paint2.setAntiAlias(true);
        AnimatorSet animatorSet2 = this.f24037j;
        if (animatorSet2 != null || this.f24038o != null || ((animatorSet2 != null && animatorSet2.isRunning()) || ((animatorSet = this.f24038o) != null && animatorSet.isRunning()))) {
            a();
        }
        this.f24037j = new AnimatorSet();
        this.f24038o = new AnimatorSet();
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.animatorHeight);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, this.animatorWidth, 0.0f);
        final ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.animatorHeight, 0.0f);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, this.animatorWidth, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScanLineView f4941b;

            {
                this.f4941b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                ValueAnimator valueAnimator = valueAnimatorOfFloat;
                ScanLineView this$0 = this.f4941b;
                switch (i10) {
                    case 0:
                        int i12 = ScanLineView.f24022Q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f24036i = ((Float) animatedValue).floatValue();
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        Intrinsics.f(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f24031c = ((Float) animatedValue2).floatValue();
                        this$0.postInvalidateOnAnimation();
                        break;
                    default:
                        int i13 = ScanLineView.f24022Q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        Object animatedValue3 = it.getAnimatedValue();
                        Intrinsics.f(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f24036i = ((Float) animatedValue3).floatValue();
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        Intrinsics.f(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f24031c = ((Float) animatedValue4).floatValue();
                        this$0.postInvalidateOnAnimation();
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScanLineView f4941b;

            {
                this.f4941b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                ValueAnimator valueAnimator = valueAnimatorOfFloat3;
                ScanLineView this$0 = this.f4941b;
                switch (i11) {
                    case 0:
                        int i12 = ScanLineView.f24022Q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        Object animatedValue = it.getAnimatedValue();
                        Intrinsics.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f24036i = ((Float) animatedValue).floatValue();
                        Object animatedValue2 = valueAnimator.getAnimatedValue();
                        Intrinsics.f(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f24031c = ((Float) animatedValue2).floatValue();
                        this$0.postInvalidateOnAnimation();
                        break;
                    default:
                        int i13 = ScanLineView.f24022Q;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        Object animatedValue3 = it.getAnimatedValue();
                        Intrinsics.f(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f24036i = ((Float) animatedValue3).floatValue();
                        Object animatedValue4 = valueAnimator.getAnimatedValue();
                        Intrinsics.f(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                        this$0.f24031c = ((Float) animatedValue4).floatValue();
                        this$0.postInvalidateOnAnimation();
                        break;
                }
            }
        });
        AnimatorSet animatorSet3 = this.f24037j;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(this.animatorTime);
        }
        AnimatorSet animatorSet4 = this.f24037j;
        if (animatorSet4 != null && (builderPlay2 = animatorSet4.play(valueAnimatorOfFloat)) != null) {
            builderPlay2.with(valueAnimatorOfFloat2);
        }
        AnimatorSet animatorSet5 = this.f24038o;
        if (animatorSet5 != null) {
            animatorSet5.setDuration(this.animatorTime);
        }
        AnimatorSet animatorSet6 = this.f24038o;
        if (animatorSet6 != null && (builderPlay = animatorSet6.play(valueAnimatorOfFloat3)) != null) {
            builderPlay.with(valueAnimatorOfFloat4);
        }
        AnimatorSet animatorSet7 = this.f24037j;
        if (animatorSet7 != null) {
            animatorSet7.addListener(new d(this, 0));
        }
        AnimatorSet animatorSet8 = this.f24038o;
        if (animatorSet8 != null) {
            animatorSet8.addListener(new d(this, 1));
        }
        AnimatorSet animatorSet9 = this.f24037j;
        if (animatorSet9 != null) {
            animatorSet9.start();
        }
    }
}
