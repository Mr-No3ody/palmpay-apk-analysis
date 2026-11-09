package com.transsnet.palmpay.ui.view;

import L6.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/ui/view/HalfCircleProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HalfCircleProgressView extends View {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HalfCircleProgressView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(getContext().getColor(b.ppColorDividerLine));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(DensityUtil.dp2px(8.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF = new RectF(DensityUtil.dp2px(4.0f), DensityUtil.dp2px(4.0f), getWidth() - DensityUtil.dp2px(4.0f), getHeight());
        paint.setColor(getContext().getColor(b.ppColorDividerLine));
        canvas.drawArc(rectF, -180.0f, 180.0f, false, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i7);
        View.MeasureSpec.getSize(i10);
        if (mode != 1073741824 || mode2 != Integer.MIN_VALUE) {
            size = 0;
        }
        setMeasuredDimension(size, size);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HalfCircleProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HalfCircleProgressView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HalfCircleProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
