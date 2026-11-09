package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/custom_view/DashedLineView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", ViewProps.COLOR, "", "setDashColor", "(I)V", "", "width", "setDashWidth", "(F)V", "length", "setDashLength", "setGapLength", "orientation", "setOrientation", "a", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DashedLineView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f31000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f31003f;

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
    public DashedLineView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        int i7 = this.f30998a;
        Paint paint = this.f31003f;
        paint.setColor(i7);
        paint.setStrokeWidth(this.f30999b);
        paint.setPathEffect(new DashPathEffect(new float[]{this.f31000c, this.f31001d}, 0.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i7 = this.f31002e;
        Paint paint = this.f31003f;
        if (i7 == 0) {
            float width = getWidth() / 2.0f;
            canvas.drawLine(width, 0.0f, width, getHeight(), paint);
        } else if (i7 == 1) {
            float width2 = getWidth();
            float height = getHeight() / 2.0f;
            canvas.drawLine(0.0f, height, width2, height, paint);
        }
    }

    public final void setDashColor(@ColorInt int color) {
        this.f30998a = color;
        a();
        invalidate();
    }

    public final void setDashLength(@Dimension(unit = 1) float length) {
        this.f31000c = length;
        a();
        invalidate();
    }

    public final void setDashWidth(@Dimension(unit = 1) float width) {
        this.f30999b = width;
        a();
        invalidate();
    }

    public final void setGapLength(@Dimension(unit = 1) float length) {
        this.f31001d = length;
        a();
        invalidate();
    }

    public final void setOrientation(int orientation) {
        this.f31002e = orientation;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DashedLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DashedLineView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DashedLineView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30998a = -16777216;
        this.f30999b = 5.0f;
        this.f31000c = 10.0f;
        this.f31001d = 10.0f;
        this.f31002e = 1;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        this.f31003f = paint;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x.DashedLineView, 0, 0);
        try {
            this.f30998a = typedArrayObtainStyledAttributes.getColor(x.DashedLineView_dashColor, this.f30998a);
            this.f30999b = typedArrayObtainStyledAttributes.getDimension(x.DashedLineView_dashWidth, this.f30999b);
            this.f31000c = typedArrayObtainStyledAttributes.getDimension(x.DashedLineView_dashLength, this.f31000c);
            this.f31001d = typedArrayObtainStyledAttributes.getDimension(x.DashedLineView_gapLength, this.f31001d);
            this.f31002e = typedArrayObtainStyledAttributes.getInt(x.DashedLineView_orientation_line, this.f31002e);
            typedArrayObtainStyledAttributes.recycle();
            a();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
