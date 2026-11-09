package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u000e2\b\b\u0001\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/custom_view/DrawableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawableLeft", "", "setDrawableLeft", "(Landroid/graphics/drawable/Drawable;)V", "drawableLeftRes", "(I)V", "drawableRight", "setDrawableRight", "drawableRightRes", "drawableTop", "setDrawableTop", "drawableTopRes", "drawableBottom", "setDrawableBottom", "drawableBottomRes", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DrawableTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f31004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f31005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f31006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f31007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31010g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f31012j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawableTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31012j = context;
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.DrawableTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f31004a = typedArrayObtainStyledAttributes.getDrawable(x.DrawableTextView_android_drawableLeft);
        this.f31005b = typedArrayObtainStyledAttributes.getDrawable(x.DrawableTextView_android_drawableRight);
        this.f31006c = typedArrayObtainStyledAttributes.getDrawable(x.DrawableTextView_android_drawableTop);
        this.f31007d = typedArrayObtainStyledAttributes.getDrawable(x.DrawableTextView_android_drawableBottom);
        Drawable drawable = this.f31004a;
        if (drawable != null) {
            this.f31008e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.DrawableTextView_leftDrawableWidth, drawable.getIntrinsicWidth());
            this.f31010g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.DrawableTextView_leftDrawableHeight, drawable.getIntrinsicHeight());
        }
        Drawable drawable2 = this.f31005b;
        if (drawable2 != null) {
            this.f31009f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.DrawableTextView_rightDrawableWidth, drawable2.getIntrinsicWidth());
            this.f31011i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.DrawableTextView_rightDrawableHeight, drawable2.getIntrinsicHeight());
        }
        Drawable drawable3 = this.f31006c;
        if (drawable3 != null) {
            this.f31008e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.DrawableTextView_topDrawableWidth, drawable3.getIntrinsicWidth());
            this.f31010g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.DrawableTextView_topDrawableHeight, drawable3.getIntrinsicHeight());
        }
        Drawable drawable4 = this.f31007d;
        if (drawable4 != null) {
            this.f31008e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.DrawableTextView_bottomDrawableWidth, drawable4.getIntrinsicWidth());
            this.f31010g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(x.DrawableTextView_bottomDrawableHeight, drawable4.getIntrinsicHeight());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        setCompoundDrawables(this.f31004a, this.f31006c, this.f31005b, this.f31007d);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Drawable drawable = this.f31004a;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.f31008e, this.f31010g);
        }
        Drawable drawable2 = this.f31005b;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, this.f31009f, this.f31011i);
        }
        Drawable drawable3 = this.f31006c;
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, 0, 0);
        }
        Drawable drawable4 = this.f31007d;
        if (drawable4 != null) {
            drawable4.setBounds(0, 0, 0, 0);
        }
    }

    public final void setDrawableBottom(@Nullable Drawable drawableBottom) {
        this.f31007d = drawableBottom;
        invalidate();
    }

    public final void setDrawableLeft(@Nullable Drawable drawableLeft) {
        this.f31004a = drawableLeft;
        invalidate();
    }

    public final void setDrawableRight(@Nullable Drawable drawableRight) {
        this.f31005b = this.f31004a;
        invalidate();
    }

    public final void setDrawableTop(@Nullable Drawable drawableTop) {
        this.f31006c = drawableTop;
        invalidate();
    }

    public final void setDrawableBottom(@DrawableRes int drawableBottomRes) {
        this.f31007d = this.f31012j.getDrawable(drawableBottomRes);
        invalidate();
    }

    public final void setDrawableLeft(@DrawableRes int drawableLeftRes) {
        this.f31004a = this.f31012j.getDrawable(drawableLeftRes);
        invalidate();
    }

    public final void setDrawableRight(@DrawableRes int drawableRightRes) {
        this.f31005b = this.f31012j.getDrawable(drawableRightRes);
        invalidate();
    }

    public final void setDrawableTop(@DrawableRes int drawableTopRes) {
        this.f31006c = this.f31012j.getDrawable(drawableTopRes);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31012j = context;
        b(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31012j = context;
        b(context, attributeSet);
    }
}
