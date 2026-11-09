package com.facebook.react.uimanager.drawable;

import Nf.b;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import com.facebook.react.uimanager.FilterHelper;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0005H\u0017J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0002J\n\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u001f\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/facebook/react/uimanager/drawable/InsetBoxShadowDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", ViewProps.SHADOW_COLOR, "", "offsetX", "", "offsetY", "blurRadius", "spread", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", ViewProps.BORDER_RADIUS, "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "<init>", "(Landroid/content/Context;IFFFFLcom/facebook/react/uimanager/style/BorderInsets;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "shadowPaint", "Landroid/graphics/Paint;", "setAlpha", "", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "draw", "canvas", "Landroid/graphics/Canvas;", "computeBorderRadii", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "computeBorderInsets", "Landroid/graphics/RectF;", "innerRadius", "radius", "borderInset", "(FLjava/lang/Float;)F", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInsetBoxShadowDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InsetBoxShadowDrawable.kt\ncom/facebook/react/uimanager/drawable/InsetBoxShadowDrawable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,188:1\n1#2:189\n11278#3:190\n11613#3,3:191\n*S KotlinDebug\n*F\n+ 1 InsetBoxShadowDrawable.kt\ncom/facebook/react/uimanager/drawable/InsetBoxShadowDrawable\n*L\n136#1:190\n136#1:191,3\n*E\n"})
public final class InsetBoxShadowDrawable extends Drawable {
    private final float blurRadius;

    @Nullable
    private BorderInsets borderInsets;

    @Nullable
    private BorderRadiusStyle borderRadius;

    @NotNull
    private final Context context;
    private final float offsetX;
    private final float offsetY;
    private final int shadowColor;

    @NotNull
    private final Paint shadowPaint;
    private final float spread;

    public /* synthetic */ InsetBoxShadowDrawable(Context context, int i7, float f10, float f11, float f12, float f13, BorderInsets borderInsets, BorderRadiusStyle borderRadiusStyle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i7, f10, f11, f12, f13, (i10 & 64) != 0 ? null : borderInsets, (i10 & 128) != 0 ? null : borderRadiusStyle);
    }

    private final RectF computeBorderInsets() {
        RectF rectFResolve;
        BorderInsets borderInsets = this.borderInsets;
        if (borderInsets == null || (rectFResolve = borderInsets.resolve(getLayoutDirection(), this.context)) == null) {
            return null;
        }
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        return new RectF(pixelUtil.dpToPx(rectFResolve.left), pixelUtil.dpToPx(rectFResolve.top), pixelUtil.dpToPx(rectFResolve.right), pixelUtil.dpToPx(rectFResolve.bottom));
    }

    private final ComputedBorderRadius computeBorderRadii() {
        ComputedBorderRadius computedBorderRadiusResolve;
        BorderRadiusStyle borderRadiusStyle = this.borderRadius;
        if (borderRadiusStyle != null) {
            int layoutDirection = getLayoutDirection();
            Context context = this.context;
            PixelUtil pixelUtil = PixelUtil.INSTANCE;
            computedBorderRadiusResolve = borderRadiusStyle.resolve(layoutDirection, context, pixelUtil.pxToDp(getBounds().width()), pixelUtil.pxToDp(getBounds().height()));
        } else {
            computedBorderRadiusResolve = null;
        }
        if (computedBorderRadiusResolve == null || !computedBorderRadiusResolve.hasRoundedBorders()) {
            return null;
        }
        PixelUtil pixelUtil2 = PixelUtil.INSTANCE;
        return new ComputedBorderRadius(new CornerRadii(pixelUtil2.dpToPx(computedBorderRadiusResolve.getTopLeft().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadiusResolve.getTopLeft().getVertical())), new CornerRadii(pixelUtil2.dpToPx(computedBorderRadiusResolve.getTopRight().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadiusResolve.getTopRight().getVertical())), new CornerRadii(pixelUtil2.dpToPx(computedBorderRadiusResolve.getBottomLeft().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadiusResolve.getBottomLeft().getVertical())), new CornerRadii(pixelUtil2.dpToPx(computedBorderRadiusResolve.getBottomRight().getHorizontal()), pixelUtil2.dpToPx(computedBorderRadiusResolve.getBottomRight().getVertical())));
    }

    private final float innerRadius(float radius, Float borderInset) {
        float fFloatValue = radius - (borderInset != null ? borderInset.floatValue() : 0.0f);
        if (fFloatValue < 0.0f) {
            return 0.0f;
        }
        return fFloatValue;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ComputedBorderRadius computedBorderRadiusComputeBorderRadii = computeBorderRadii();
        RectF rectFComputeBorderInsets = computeBorderInsets();
        RectF rectF = new RectF(getBounds().left + (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.left : 0.0f), getBounds().top + (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.top : 0.0f), getBounds().right - (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.right : 0.0f), getBounds().bottom - (rectFComputeBorderInsets != null ? rectFComputeBorderInsets.bottom : 0.0f));
        float[] fArr = null;
        if (computedBorderRadiusComputeBorderRadii != null) {
            fArr = new float[]{innerRadius(computedBorderRadiusComputeBorderRadii.getTopLeft().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.left) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getTopLeft().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.top) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getTopRight().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.right) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getTopRight().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.top) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomRight().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.right) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomRight().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.bottom) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomLeft().getHorizontal(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.left) : null), innerRadius(computedBorderRadiusComputeBorderRadii.getBottomLeft().getVertical(), rectFComputeBorderInsets != null ? Float.valueOf(rectFComputeBorderInsets.bottom) : null)};
        }
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        float fDpToPx = pixelUtil.dpToPx(this.offsetX);
        float fDpToPx2 = pixelUtil.dpToPx(this.offsetY);
        float fDpToPx3 = pixelUtil.dpToPx(this.spread);
        RectF rectF2 = new RectF(rectF);
        if (2 * fDpToPx3 > rectF.width()) {
            rectF2.setEmpty();
        } else {
            rectF2.inset(fDpToPx3, fDpToPx3);
        }
        rectF2.offset(fDpToPx, fDpToPx2);
        float fSigmaToRadius$ReactAndroid_release = FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(this.blurRadius);
        RectF rectF3 = new RectF(rectF2);
        rectF3.set(rectF);
        float f10 = -fSigmaToRadius$ReactAndroid_release;
        rectF3.inset(f10, f10);
        rectF3.union(new RectF(rectF2));
        int iSave = canvas.save();
        if (fArr != null) {
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f11 : fArr) {
                arrayList.add(Float.valueOf(BoxShadowBorderRadiusKt.adjustRadiusForSpread(f11, -fDpToPx3)));
            }
            canvas.drawDoubleRoundRect(rectF3, InsetBoxShadowDrawableKt.ZERO_RADII, rectF2, CollectionsKt.W(arrayList), this.shadowPaint);
        } else {
            canvas.clipRect(rectF);
            canvas.drawDoubleRoundRect(rectF3, InsetBoxShadowDrawableKt.ZERO_RADII, rectF2, InsetBoxShadowDrawableKt.ZERO_RADII, this.shadowPaint);
        }
        canvas.restoreToCount(iSave);
    }

    @Nullable
    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    @Nullable
    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        int alpha = this.shadowPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.shadowPaint.setAlpha(b.b((Color.alpha(this.shadowColor) / 255.0f) * (alpha / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public final void setBorderInsets(@Nullable BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(@Nullable BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.shadowPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public InsetBoxShadowDrawable(@NotNull Context context, int i7, float f10, float f11, float f12, float f13, @Nullable BorderInsets borderInsets, @Nullable BorderRadiusStyle borderRadiusStyle) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.shadowColor = i7;
        this.offsetX = f10;
        this.offsetY = f11;
        this.blurRadius = f12;
        this.spread = f13;
        this.borderInsets = borderInsets;
        this.borderRadius = borderRadiusStyle;
        Paint paint = new Paint();
        paint.setColor(i7);
        float fSigmaToRadius$ReactAndroid_release = FilterHelper.INSTANCE.sigmaToRadius$ReactAndroid_release(f12 * 0.5f);
        if (fSigmaToRadius$ReactAndroid_release > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(fSigmaToRadius$ReactAndroid_release, BlurMaskFilter.Blur.NORMAL));
        }
        this.shadowPaint = paint;
    }
}
