package com.transsnet.adsdk.widgets.banner.bannerview.indicator;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import com.facebook.react.uimanager.ViewProps;
import com.zhpan.indicator.base.BaseIndicatorView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001/B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J*\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\u001a\u0010#\u001a\u00020\u00002\b\b\u0001\u0010$\u001a\u00020\u00072\b\b\u0001\u0010%\u001a\u00020\u0007J&\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0007J\u001a\u0010-\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0007H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/transsnet/adsdk/widgets/banner/bannerview/indicator/DrawableIndicator;", "Lcom/zhpan/indicator/base/BaseIndicatorView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCheckedBitmap", "Landroid/graphics/Bitmap;", "mNormalBitmap", "mIndicatorPadding", "mCheckedBitmapWidth", "mCheckedBitmapHeight", "mNormalBitmapWidth", "mNormalBitmapHeight", "mIndicatorSize", "Lcom/transsnet/adsdk/widgets/banner/bannerview/indicator/DrawableIndicator$IndicatorSize;", "normalCanResize", "", "checkCanResize", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawIcon", ViewProps.LEFT, ViewProps.TOP, "icon", "initIconSize", "setIndicatorDrawable", "normalDrawable", "checkedDrawable", "setIndicatorSize", "normalWidth", "normalHeight", "checkedWidth", "checkedHeight", "setIndicatorGap", ViewProps.PADDING, "getBitmapFromVectorDrawable", "drawableId", "IndicatorSize", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DrawableIndicator extends BaseIndicatorView {
    private boolean checkCanResize;

    @Nullable
    private Bitmap mCheckedBitmap;
    private int mCheckedBitmapHeight;
    private int mCheckedBitmapWidth;
    private int mIndicatorPadding;

    @Nullable
    private IndicatorSize mIndicatorSize;

    @Nullable
    private Bitmap mNormalBitmap;
    private int mNormalBitmapHeight;
    private int mNormalBitmapWidth;
    private boolean normalCanResize;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/transsnet/adsdk/widgets/banner/bannerview/indicator/DrawableIndicator$IndicatorSize;", "", "normalWidth", "", "normalHeight", "checkedWidth", "checkedHeight", "<init>", "(IIII)V", "getNormalWidth", "()I", "setNormalWidth", "(I)V", "getNormalHeight", "setNormalHeight", "getCheckedWidth", "setCheckedWidth", "getCheckedHeight", "setCheckedHeight", "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IndicatorSize {
        private int checkedHeight;
        private int checkedWidth;
        private int normalHeight;
        private int normalWidth;

        public IndicatorSize(int i7, int i10, int i11, int i12) {
            this.normalWidth = i7;
            this.normalHeight = i10;
            this.checkedWidth = i11;
            this.checkedHeight = i12;
        }

        public final int getCheckedHeight() {
            return this.checkedHeight;
        }

        public final int getCheckedWidth() {
            return this.checkedWidth;
        }

        public final int getNormalHeight() {
            return this.normalHeight;
        }

        public final int getNormalWidth() {
            return this.normalWidth;
        }

        public final void setCheckedHeight(int i7) {
            this.checkedHeight = i7;
        }

        public final void setCheckedWidth(int i7) {
            this.checkedWidth = i7;
        }

        public final void setNormalHeight(int i7) {
            this.normalHeight = i7;
        }

        public final void setNormalWidth(int i7) {
            this.normalWidth = i7;
        }
    }

    @JvmOverloads
    public DrawableIndicator(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    private final void drawIcon(Canvas canvas, int left, int top2, Bitmap icon) {
        if (icon == null) {
            return;
        }
        canvas.drawBitmap(icon, left, top2, (Paint) null);
    }

    private final Bitmap getBitmapFromVectorDrawable(Context context, int drawableId) {
        Drawable drawable = context.getDrawable(drawableId);
        if (drawable == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private final void initIconSize() {
        Bitmap bitmap = this.mCheckedBitmap;
        if (bitmap != null) {
            if (this.mIndicatorSize != null) {
                Intrinsics.e(bitmap);
                if (bitmap.isMutable() && this.checkCanResize) {
                    Bitmap bitmap2 = this.mCheckedBitmap;
                    Intrinsics.e(bitmap2);
                    IndicatorSize indicatorSize = this.mIndicatorSize;
                    Intrinsics.e(indicatorSize);
                    bitmap2.setWidth(indicatorSize.getCheckedWidth());
                    Bitmap bitmap3 = this.mCheckedBitmap;
                    Intrinsics.e(bitmap3);
                    IndicatorSize indicatorSize2 = this.mIndicatorSize;
                    Intrinsics.e(indicatorSize2);
                    bitmap3.setHeight(indicatorSize2.getCheckedHeight());
                } else {
                    Bitmap bitmap4 = this.mCheckedBitmap;
                    Intrinsics.e(bitmap4);
                    int width = bitmap4.getWidth();
                    Bitmap bitmap5 = this.mCheckedBitmap;
                    Intrinsics.e(bitmap5);
                    int height = bitmap5.getHeight();
                    IndicatorSize indicatorSize3 = this.mIndicatorSize;
                    Intrinsics.e(indicatorSize3);
                    float checkedWidth = indicatorSize3.getCheckedWidth() / width;
                    IndicatorSize indicatorSize4 = this.mIndicatorSize;
                    Intrinsics.e(indicatorSize4);
                    float checkedHeight = indicatorSize4.getCheckedHeight() / height;
                    Matrix matrix = new Matrix();
                    matrix.postScale(checkedWidth, checkedHeight);
                    Bitmap bitmap6 = this.mCheckedBitmap;
                    Intrinsics.e(bitmap6);
                    this.mCheckedBitmap = Bitmap.createBitmap(bitmap6, 0, 0, width, height, matrix, true);
                }
            }
            Bitmap bitmap7 = this.mCheckedBitmap;
            Intrinsics.e(bitmap7);
            this.mCheckedBitmapWidth = bitmap7.getWidth();
            Bitmap bitmap8 = this.mCheckedBitmap;
            Intrinsics.e(bitmap8);
            this.mCheckedBitmapHeight = bitmap8.getHeight();
        }
        Bitmap bitmap9 = this.mNormalBitmap;
        if (bitmap9 != null) {
            if (this.mIndicatorSize != null) {
                Intrinsics.e(bitmap9);
                if (bitmap9.isMutable() && this.normalCanResize) {
                    Bitmap bitmap10 = this.mNormalBitmap;
                    Intrinsics.e(bitmap10);
                    IndicatorSize indicatorSize5 = this.mIndicatorSize;
                    Intrinsics.e(indicatorSize5);
                    bitmap10.setWidth(indicatorSize5.getNormalWidth());
                    Bitmap bitmap11 = this.mNormalBitmap;
                    Intrinsics.e(bitmap11);
                    IndicatorSize indicatorSize6 = this.mIndicatorSize;
                    Intrinsics.e(indicatorSize6);
                    bitmap11.setHeight(indicatorSize6.getNormalHeight());
                } else {
                    Bitmap bitmap12 = this.mNormalBitmap;
                    Intrinsics.e(bitmap12);
                    int width2 = bitmap12.getWidth();
                    Bitmap bitmap13 = this.mNormalBitmap;
                    Intrinsics.e(bitmap13);
                    int height2 = bitmap13.getHeight();
                    IndicatorSize indicatorSize7 = this.mIndicatorSize;
                    Intrinsics.e(indicatorSize7);
                    float normalWidth = indicatorSize7.getNormalWidth();
                    Bitmap bitmap14 = this.mNormalBitmap;
                    Intrinsics.e(bitmap14);
                    float width3 = normalWidth / bitmap14.getWidth();
                    IndicatorSize indicatorSize8 = this.mIndicatorSize;
                    Intrinsics.e(indicatorSize8);
                    float normalHeight = indicatorSize8.getNormalHeight();
                    Bitmap bitmap15 = this.mNormalBitmap;
                    Intrinsics.e(bitmap15);
                    float height3 = normalHeight / bitmap15.getHeight();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(width3, height3);
                    Bitmap bitmap16 = this.mNormalBitmap;
                    Intrinsics.e(bitmap16);
                    this.mNormalBitmap = Bitmap.createBitmap(bitmap16, 0, 0, width2, height2, matrix2, true);
                }
            }
            Bitmap bitmap17 = this.mNormalBitmap;
            Intrinsics.e(bitmap17);
            this.mNormalBitmapWidth = bitmap17.getWidth();
            Bitmap bitmap18 = this.mNormalBitmap;
            Intrinsics.e(bitmap18);
            this.mNormalBitmapHeight = bitmap18.getHeight();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int i7;
        int measuredHeight;
        int i10;
        int measuredHeight2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (getPageSize() <= 1 || this.mCheckedBitmap == null || this.mNormalBitmap == null) {
            return;
        }
        int pageSize = getPageSize() + 1;
        for (int i11 = 1; i11 < pageSize; i11++) {
            Bitmap bitmap = this.mNormalBitmap;
            int i12 = i11 - 1;
            if (i12 < getCurrentPosition()) {
                i7 = (this.mNormalBitmapWidth + this.mIndicatorPadding) * i12;
                measuredHeight = getMeasuredHeight() / 2;
                i10 = this.mNormalBitmapHeight / 2;
            } else {
                if (i12 == getCurrentPosition()) {
                    i7 = (this.mNormalBitmapWidth + this.mIndicatorPadding) * i12;
                    measuredHeight2 = (getMeasuredHeight() / 2) - (this.mCheckedBitmapHeight / 2);
                    bitmap = this.mCheckedBitmap;
                } else {
                    i7 = ((i11 - 2) * this.mNormalBitmapWidth) + (i12 * this.mIndicatorPadding) + this.mCheckedBitmapWidth;
                    measuredHeight = getMeasuredHeight() / 2;
                    i10 = this.mNormalBitmapHeight / 2;
                }
                drawIcon(canvas, i7, measuredHeight2, bitmap);
            }
            measuredHeight2 = measuredHeight - i10;
            drawIcon(canvas, i7, measuredHeight2, bitmap);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i7 = this.mCheckedBitmapHeight;
        int i10 = this.mNormalBitmapHeight;
        if (i7 < i10) {
            i7 = i10;
        }
        setMeasuredDimension(((getPageSize() - 1) * (this.mNormalBitmapWidth + this.mIndicatorPadding)) + this.mCheckedBitmapWidth, i7);
    }

    @NotNull
    public final DrawableIndicator setIndicatorDrawable(@DrawableRes int normalDrawable, @DrawableRes int checkedDrawable) {
        this.mNormalBitmap = BitmapFactory.decodeResource(getResources(), normalDrawable);
        this.mCheckedBitmap = BitmapFactory.decodeResource(getResources(), checkedDrawable);
        if (this.mNormalBitmap == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.mNormalBitmap = getBitmapFromVectorDrawable(context, normalDrawable);
            this.normalCanResize = false;
        }
        if (this.mCheckedBitmap == null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.mCheckedBitmap = getBitmapFromVectorDrawable(context2, checkedDrawable);
            this.checkCanResize = false;
        }
        initIconSize();
        postInvalidate();
        return this;
    }

    @NotNull
    public final DrawableIndicator setIndicatorGap(int padding) {
        if (padding >= 0) {
            this.mIndicatorPadding = padding;
            postInvalidate();
        }
        return this;
    }

    @NotNull
    public final DrawableIndicator setIndicatorSize(int normalWidth, int normalHeight, int checkedWidth, int checkedHeight) {
        this.mIndicatorSize = new IndicatorSize(normalWidth, normalHeight, checkedWidth, checkedHeight);
        initIconSize();
        postInvalidate();
        return this;
    }

    @JvmOverloads
    public DrawableIndicator(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DrawableIndicator(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DrawableIndicator(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.e(context);
        this.normalCanResize = true;
        this.checkCanResize = true;
    }
}
