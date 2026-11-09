package com.palmpay.lib.scanplus.view;

import Gb.z;
import I6.e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.lib.scanplus.bean.BoxHornType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\"\u0010,\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u00104\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\f\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010R\"\u00108\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\f\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\u0010R\"\u0010@\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010P\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\f\u001a\u0004\bR\u0010\u000e\"\u0004\bS\u0010\u0010R\"\u0010X\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010\f\u001a\u0004\bV\u0010\u000e\"\u0004\bW\u0010\u0010R\"\u0010\\\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010'\u001a\u0004\bZ\u0010)\"\u0004\b[\u0010+R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lcom/palmpay/lib/scanplus/view/BoxView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "b", "F", "getBoxSize", "()F", "setBoxSize", "(F)V", "boxSize", "c", "getBoxTop", "setBoxTop", "boxTop", "d", "getBoxRound", "setBoxRound", "boxRound", "Landroid/graphics/RectF;", "e", "Landroid/graphics/RectF;", "getBoxRect", "()Landroid/graphics/RectF;", "setBoxRect", "(Landroid/graphics/RectF;)V", "boxRect", "f", "getBoxStrokeWidth", "setBoxStrokeWidth", "boxStrokeWidth", "g", "I", "getMantleColor", "()I", "setMantleColor", "(I)V", "mantleColor", "i", "getBoxStrokeColor", "setBoxStrokeColor", "boxStrokeColor", "p", "getLineWidth", "setLineWidth", "lineWidth", "t", "getLineHeight", "setLineHeight", ViewProps.LINE_HEIGHT, "", "v", "J", "getLineAnimatorDuration", "()J", "setLineAnimatorDuration", "(J)V", "lineAnimatorDuration", "", "B", "[I", "getLineColor", "()[I", "setLineColor", "([I)V", "lineColor", "Landroid/graphics/Bitmap;", "C", "Landroid/graphics/Bitmap;", "getLineBitmap", "()Landroid/graphics/Bitmap;", "setLineBitmap", "(Landroid/graphics/Bitmap;)V", "lineBitmap", "H", "getHornWidth", "setHornWidth", "hornWidth", "L", "getHornLength", "setHornLength", "hornLength", "M", "getHornColor", "setHornColor", "hornColor", "Lcom/palmpay/lib/scanplus/bean/BoxHornType;", "Q", "Lcom/palmpay/lib/scanplus/bean/BoxHornType;", "getBoxType", "()Lcom/palmpay/lib/scanplus/bean/BoxHornType;", "setBoxType", "(Lcom/palmpay/lib/scanplus/bean/BoxHornType;)V", "boxType", "lib_scanplus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BoxView extends View {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f23968k0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ValueAnimator f23969A;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    public int[] lineColor;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    public Bitmap lineBitmap;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    public float hornWidth;

    /* JADX INFO: renamed from: L, reason: collision with root package name and from kotlin metadata */
    public float hornLength;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    public int hornColor;

    /* JADX INFO: renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public BoxHornType boxType;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f23976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public float boxSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float boxTop;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public float boxRound;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public RectF boxRect;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public float boxStrokeWidth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int mantleColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int boxStrokeColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PorterDuffXfermode f23984j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Paint f23985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public float lineWidth;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float lineHeight;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public long lineAnimatorDuration;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f23988w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BoxView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        int i7 = 1;
        ValueAnimator valueAnimator = this.f23969A;
        if (valueAnimator != null || (valueAnimator != null && valueAnimator.isRunning())) {
            ValueAnimator valueAnimator2 = this.f23969A;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.f23969A = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.boxSize, 0.0f);
        this.f23969A = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.addUpdateListener(new z(this, i7));
        }
        ValueAnimator valueAnimator3 = this.f23969A;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(this.lineAnimatorDuration);
        }
        ValueAnimator valueAnimator4 = this.f23969A;
        if (valueAnimator4 != null) {
            valueAnimator4.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator5 = this.f23969A;
        if (valueAnimator5 != null) {
            valueAnimator5.setRepeatCount(-1);
        }
        ValueAnimator valueAnimator6 = this.f23969A;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }

    @NotNull
    public final RectF getBoxRect() {
        return this.boxRect;
    }

    public final float getBoxRound() {
        return this.boxRound;
    }

    public final float getBoxSize() {
        return this.boxSize;
    }

    public final int getBoxStrokeColor() {
        return this.boxStrokeColor;
    }

    public final float getBoxStrokeWidth() {
        return this.boxStrokeWidth;
    }

    public final float getBoxTop() {
        return this.boxTop;
    }

    @NotNull
    public final BoxHornType getBoxType() {
        return this.boxType;
    }

    public final int getHornColor() {
        return this.hornColor;
    }

    public final float getHornLength() {
        return this.hornLength;
    }

    public final float getHornWidth() {
        return this.hornWidth;
    }

    public final long getLineAnimatorDuration() {
        return this.lineAnimatorDuration;
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

    public final float getLineWidth() {
        return this.lineWidth;
    }

    public final int getMantleColor() {
        return this.mantleColor;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        RectF rectF2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        BoxHornType boxHornType = this.boxType;
        BoxHornType boxHornType2 = BoxHornType.ROUND;
        PorterDuffXfermode porterDuffXfermode = this.f23984j;
        Paint paint = this.f23976a;
        if (boxHornType == boxHornType2) {
            paint.setStyle(Paint.Style.FILL);
            float f10 = 2;
            float width = (getWidth() - this.boxSize) / f10;
            if (this.boxTop == 0.0f) {
                float height = (getHeight() - this.boxSize) / f10;
                float f11 = this.boxSize;
                rectF2 = new RectF(width, height, width + f11, f11 + height);
            } else {
                float f12 = this.boxTop;
                float f13 = this.boxSize;
                rectF2 = new RectF(width, f12, width + f13, f13 + f12);
            }
            this.boxRect = rectF2;
            if (canvas != null) {
                float f14 = this.boxRound;
                canvas.drawRoundRect(rectF2, f14, f14, paint);
            }
            paint.setColor(this.mantleColor);
            paint.setXfermode(porterDuffXfermode);
            if (canvas != null) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            }
            paint.setXfermode(null);
            setLayerType(2, null);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.boxStrokeColor);
            paint.setStrokeWidth(this.boxStrokeWidth);
            if (canvas != null) {
                RectF rectF3 = this.boxRect;
                float f15 = this.boxRound;
                canvas.drawRoundRect(rectF3, f15, f15, paint);
            }
        } else {
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            float f16 = 2;
            float width2 = (getWidth() - this.boxSize) / f16;
            if (this.boxTop == 0.0f) {
                float height2 = (getHeight() - this.boxSize) / f16;
                float f17 = this.boxSize;
                rectF = new RectF(width2, height2, width2 + f17, f17 + height2);
            } else {
                float f18 = this.boxTop;
                float f19 = this.boxSize;
                rectF = new RectF(width2, f18, width2 + f19, f19 + f18);
            }
            this.boxRect = rectF;
            if (canvas != null) {
                canvas.drawRect(rectF, paint);
            }
            paint.setColor(this.mantleColor);
            paint.setXfermode(porterDuffXfermode);
            if (canvas != null) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            }
            paint.setXfermode(null);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.boxStrokeColor);
            paint.setStrokeWidth(this.boxStrokeWidth);
            if (canvas != null) {
                canvas.drawRect(this.boxRect, paint);
            }
            paint.setStyle(style);
            paint.setStrokeWidth(this.hornWidth);
            paint.setColor(this.hornColor);
            if (canvas != null) {
                RectF rectF4 = this.boxRect;
                float f20 = rectF4.left;
                float f21 = this.boxStrokeWidth;
                float f22 = (f20 - (f21 / f16)) - ((this.hornWidth - f21) / f16);
                float f23 = rectF4.top;
                canvas.drawLine(f22, f23, this.hornLength + f20, f23, paint);
            }
            if (canvas != null) {
                RectF rectF5 = this.boxRect;
                float f24 = rectF5.left;
                float f25 = rectF5.top;
                float f26 = this.boxStrokeWidth;
                canvas.drawLine(f24, (f25 - (f26 / f16)) - ((this.hornWidth - f26) / f16), f24, f25 + this.hornLength, paint);
            }
            if (canvas != null) {
                RectF rectF6 = this.boxRect;
                float f27 = rectF6.right;
                float f28 = f27 - this.hornLength;
                float f29 = rectF6.top;
                float f30 = this.boxStrokeWidth;
                canvas.drawLine(f28, f29, ((this.hornWidth - f30) / f16) + (f30 / f16) + f27, f29, paint);
            }
            if (canvas != null) {
                RectF rectF7 = this.boxRect;
                float f31 = rectF7.right;
                float f32 = rectF7.top;
                float f33 = this.boxStrokeWidth;
                canvas.drawLine(f31, ((this.hornWidth - f33) / f16) + (f33 / f16) + f32, f31, f32 + this.hornLength, paint);
            }
            if (canvas != null) {
                RectF rectF8 = this.boxRect;
                float f34 = rectF8.right;
                float f35 = f34 - this.hornLength;
                float f36 = rectF8.bottom;
                float f37 = this.boxStrokeWidth;
                canvas.drawLine(f35, f36, ((this.hornWidth - f37) / f16) + (f37 / f16) + f34, f36, paint);
            }
            if (canvas != null) {
                RectF rectF9 = this.boxRect;
                float f38 = rectF9.right;
                float f39 = rectF9.bottom;
                float f40 = f39 - this.hornLength;
                float f41 = this.boxStrokeWidth;
                canvas.drawLine(f38, f40, f38, (f41 / f16) + f39 + ((this.hornWidth - f41) / f16), paint);
            }
            if (canvas != null) {
                RectF rectF10 = this.boxRect;
                float f42 = rectF10.left;
                float f43 = this.hornLength + f42;
                float f44 = rectF10.bottom;
                float f45 = this.boxStrokeWidth;
                canvas.drawLine(f43, f44, (f42 - (f45 / f16)) - ((this.hornWidth - f45) / f16), f44, paint);
            }
            if (canvas != null) {
                RectF rectF11 = this.boxRect;
                float f46 = rectF11.left;
                float f47 = rectF11.bottom;
                float f48 = f47 - this.hornLength;
                float f49 = this.boxStrokeWidth;
                canvas.drawLine(f46, f48, f46, (f49 / f16) + f47 + ((this.hornWidth - f49) / f16), paint);
            }
        }
        float f50 = this.boxRect.left;
        float f51 = this.boxSize;
        float f52 = this.lineWidth;
        if (f51 >= f52) {
            f50 += (f51 - f52) / 2;
        }
        float f53 = f50;
        Bitmap bitmap = this.lineBitmap;
        Paint paint2 = this.f23985o;
        if (bitmap != null) {
            if (canvas != null) {
                float f54 = this.boxRect.top;
                float f55 = this.f23988w;
                canvas.drawBitmap(bitmap, (Rect) null, new RectF(f53, f54 + f55, this.lineWidth + f53, f54 + this.lineHeight + f55), paint2);
                return;
            }
            return;
        }
        float f56 = this.boxRect.top;
        float f57 = f53 + this.lineWidth;
        int[] iArr = this.lineColor;
        int i7 = iArr[0];
        int i10 = iArr[1];
        paint2.setShader(new LinearGradient(f53, f56, f57, f56, new int[]{i7, i10, iArr[2], i10, i7}, (float[]) null, Shader.TileMode.CLAMP));
        if (canvas != null) {
            float f58 = this.boxRect.top;
            float f59 = this.f23988w;
            canvas.drawRect(f53, f58 + f59, this.lineWidth + f53, f58 + this.lineHeight + f59, paint2);
        }
    }

    public final void setBoxRect(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.boxRect = rectF;
    }

    public final void setBoxRound(float f10) {
        this.boxRound = f10;
    }

    public final void setBoxSize(float f10) {
        this.boxSize = f10;
    }

    public final void setBoxStrokeColor(int i7) {
        this.boxStrokeColor = i7;
    }

    public final void setBoxStrokeWidth(float f10) {
        this.boxStrokeWidth = f10;
    }

    public final void setBoxTop(float f10) {
        this.boxTop = f10;
    }

    public final void setBoxType(@NotNull BoxHornType boxHornType) {
        Intrinsics.checkNotNullParameter(boxHornType, "<set-?>");
        this.boxType = boxHornType;
    }

    public final void setHornColor(int i7) {
        this.hornColor = i7;
    }

    public final void setHornLength(float f10) {
        this.hornLength = f10;
    }

    public final void setHornWidth(float f10) {
        this.hornWidth = f10;
    }

    public final void setLineAnimatorDuration(long j6) {
        this.lineAnimatorDuration = j6;
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

    public final void setLineWidth(float f10) {
        this.lineWidth = f10;
    }

    public final void setMantleColor(int i7) {
        this.mantleColor = i7;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BoxView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BoxView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BoxView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f23976a = paint;
        this.boxSize = J3.a.S(MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS, context);
        this.boxRound = J3.a.S(10, context);
        this.boxRect = new RectF();
        this.boxStrokeWidth = (float) J3.a.R(context);
        this.mantleColor = context.getColor(e.half_transparent);
        this.boxStrokeColor = context.getColor(e.width);
        this.f23984j = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        Paint paint2 = new Paint();
        this.f23985o = paint2;
        this.lineWidth = this.boxSize;
        this.lineHeight = (float) J3.a.R(context);
        this.lineAnimatorDuration = 5000L;
        this.lineColor = new int[]{context.getColor(e.scan_line_1), context.getColor(e.scan_line_2), context.getColor(e.scan_line_3)};
        this.hornWidth = J3.a.S(4, context);
        this.hornLength = J3.a.S(30, context);
        this.hornColor = context.getColor(e.width);
        this.boxType = BoxHornType.ROUND;
        a();
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
    }
}
