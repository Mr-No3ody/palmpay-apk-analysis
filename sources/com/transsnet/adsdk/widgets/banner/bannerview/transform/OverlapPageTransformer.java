package com.transsnet.adsdk.widgets.banner.bannerview.transform;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/transsnet/adsdk/widgets/banner/bannerview/transform/OverlapPageTransformer;", "Landroidx/viewpager2/widget/ViewPager2$PageTransformer;", "orientation", "", "minScale", "", "unSelectedItemRotation", "unSelectedItemAlpha", "itemGap", "<init>", "(IFFFF)V", "scalingValue", "transformPage", "", "page", "Landroid/view/View;", ViewProps.POSITION, "adSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlapPageTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlapPageTransformer.kt\ncom/transsnet/adsdk/widgets/banner/bannerview/transform/OverlapPageTransformer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
public final class OverlapPageTransformer implements ViewPager2.PageTransformer {
    private final float itemGap;
    private final float minScale;
    private final int orientation;
    private float scalingValue;
    private final float unSelectedItemAlpha;
    private final float unSelectedItemRotation;

    public OverlapPageTransformer(int i7, float f10, float f11, float f12, float f13) {
        this.orientation = i7;
        this.minScale = f10;
        this.unSelectedItemRotation = f11;
        this.unSelectedItemAlpha = f12;
        this.itemGap = f13;
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException("minScale value should be between 1.0 to 0.0");
        }
        if (0.0f > f12 || f12 > 1.0f) {
            throw new IllegalArgumentException("unSelectedItemAlpha value should be between 1.0 to 0.0");
        }
        this.scalingValue = 0.2f;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NotNull View page, float position) {
        float f10;
        Intrinsics.checkNotNullParameter(page, "page");
        double d2 = this.minScale;
        if (d2 >= 0.8d) {
            f10 = 0.2f;
        } else {
            f10 = d2 >= 0.6d ? 0.3f : 0.4f;
        }
        this.scalingValue = f10;
        page.setElevation(-Math.abs(position));
        float fMax = Math.max(1.0f - Math.abs(position * 0.5f), 0.5f);
        float f11 = this.unSelectedItemRotation;
        if (f11 != 0.0f) {
            float f12 = 1 - fMax;
            if (position <= 0.0f) {
                f11 = -f11;
            }
            page.setRotationY(f12 * f11);
        }
        float fMax2 = Math.max(1.0f - Math.abs(this.scalingValue * position), this.minScale);
        page.setScaleX(fMax2);
        page.setScaleY(fMax2);
        int iF = f.f(((int) this.itemGap) / 2);
        int i7 = this.orientation;
        if (i7 == 0) {
            page.setTranslationX((iF * position) + ((1.0f - fMax2) * (position > 0.0f ? -page.getWidth() : page.getWidth())));
        } else {
            if (i7 != 1) {
                throw new IllegalArgumentException("Gives correct orientation value, ViewPager2.ORIENTATION_HORIZONTAL or ViewPager2.ORIENTATION_VERTICAL");
            }
            page.setTranslationY((iF * position) + ((1.0f - fMax2) * (position > 0.0f ? -page.getWidth() : page.getWidth())));
        }
        if (this.unSelectedItemAlpha == 1.0f) {
            return;
        }
        page.setAlpha((position < -1.0f || position > 1.0f) ? 0.5f / Math.abs(position * position) : ((1 - Math.abs(position)) * 0.5f) + 0.5f);
    }

    public /* synthetic */ OverlapPageTransformer(int i7, float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 0.0f : f13);
    }
}
