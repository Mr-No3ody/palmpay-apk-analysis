package com.mikepenz.iconics.view;

import D3.a;
import H5.b;
import J5.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.mikepenz.iconics.IconicsDrawable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR(\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/mikepenz/iconics/view/IconicsImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "icon", "Lcom/mikepenz/iconics/IconicsDrawable;", "getIcon", "()Lcom/mikepenz/iconics/IconicsDrawable;", "setIcon", "(Lcom/mikepenz/iconics/IconicsDrawable;)V", "iconics-views"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class IconicsImageView extends AppCompatImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsImageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final IconicsDrawable getIcon() {
        Drawable drawable = getDrawable();
        if (drawable instanceof IconicsDrawable) {
            return (IconicsDrawable) drawable;
        }
        return null;
    }

    public final void setIcon(@Nullable IconicsDrawable iconicsDrawable) {
        a.P(this, iconicsDrawable);
        setImageDrawable(iconicsDrawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IconicsImageView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsImageView(@NotNull Context ctx, @Nullable AttributeSet attributeSet, int i7) {
        super(ctx, attributeSet, i7);
        Intrinsics.checkNotNullParameter(ctx, "context");
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        b.a(ctx);
        TypedArray typedArrayObtainStyledAttributes = ctx.obtainStyledAttributes(attributeSet, N5.b.IconicsImageView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "ctx.obtainStyledAttribut…yleable.IconicsImageView)");
        Resources resources = ctx.getResources();
        Resources.Theme theme = ctx.getTheme();
        int i10 = N5.b.IconicsImageView_iiv_icon;
        int i11 = N5.b.IconicsImageView_iiv_color;
        int i12 = N5.b.IconicsImageView_iiv_size;
        int i13 = N5.b.IconicsImageView_iiv_padding;
        int i14 = N5.b.IconicsImageView_iiv_contour_color;
        int i15 = N5.b.IconicsImageView_iiv_contour_width;
        int i16 = N5.b.IconicsImageView_iiv_background_color;
        int i17 = N5.b.IconicsImageView_iiv_corner_radius;
        int i18 = N5.b.IconicsImageView_iiv_background_contour_color;
        int i19 = N5.b.IconicsImageView_iiv_background_contour_width;
        int i20 = N5.b.IconicsImageView_iiv_shadow_radius;
        int i21 = N5.b.IconicsImageView_iiv_shadow_dx;
        int i22 = N5.b.IconicsImageView_iiv_shadow_dy;
        int i23 = N5.b.IconicsImageView_iiv_shadow_color;
        int i24 = N5.b.IconicsImageView_iiv_animations;
        int i25 = N5.b.IconicsImageView_iiv_automirror;
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        IconicsDrawable iconicsDrawableB = new c(resources, theme, typedArrayObtainStyledAttributes, i10, i12, i11, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25).b(null, true);
        typedArrayObtainStyledAttributes.recycle();
        setIcon(iconicsDrawableB);
    }
}
