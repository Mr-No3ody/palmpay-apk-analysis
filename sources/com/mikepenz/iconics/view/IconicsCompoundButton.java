package com.mikepenz.iconics.view;

import E.AbstractC0198c;
import He.a;
import J5.c;
import N5.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.mikepenz.iconics.IconicsDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/mikepenz/iconics/view/IconicsCompoundButton;", "Landroid/widget/CompoundButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lcom/mikepenz/iconics/IconicsDrawable;", "icon", "getCheckedIcon", "()Lcom/mikepenz/iconics/IconicsDrawable;", "setCheckedIcon", "(Lcom/mikepenz/iconics/IconicsDrawable;)V", "checkedIcon", "getUncheckedIcon", "setUncheckedIcon", "uncheckedIcon", "iconics-views"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class IconicsCompoundButton extends CompoundButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f23620a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsCompoundButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        String name = IconicsCompoundButton.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "IconicsCompoundButton::class.java.name");
        return name;
    }

    @Nullable
    public final IconicsDrawable getCheckedIcon() {
        return (IconicsDrawable) this.f23620a.f3865c;
    }

    @Nullable
    public final IconicsDrawable getUncheckedIcon() {
        return (IconicsDrawable) this.f23620a.f3866d;
    }

    public final void setCheckedIcon(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        a aVar = this.f23620a;
        aVar.f3865c = iconicsDrawable;
        Context ctx = getContext();
        Intrinsics.checkNotNullExpressionValue(ctx, "context");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        setButtonDrawable(J3.a.l(ctx, (IconicsDrawable) aVar.f3866d, (IconicsDrawable) aVar.f3865c, aVar.f3864b));
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence text, TextView.BufferType type) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        if (isInEditMode()) {
            super.setText(text, type);
        } else {
            super.setText(AbstractC0198c.f(text), type);
        }
    }

    public final void setUncheckedIcon(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        a aVar = this.f23620a;
        aVar.f3866d = iconicsDrawable;
        Context ctx = getContext();
        Intrinsics.checkNotNullExpressionValue(ctx, "context");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        setButtonDrawable(J3.a.l(ctx, (IconicsDrawable) aVar.f3866d, (IconicsDrawable) aVar.f3865c, aVar.f3864b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsCompoundButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IconicsCompoundButton(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsCompoundButton(@NotNull Context ctx, @Nullable AttributeSet attributeSet, int i7) {
        super(ctx, attributeSet, i7);
        Intrinsics.checkNotNullParameter(ctx, "context");
        a icon = new a(1, false);
        this.f23620a = icon;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        icon.f3865c = new IconicsDrawable(ctx);
        icon.f3866d = new IconicsDrawable(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(icon, "icon");
        TypedArray typedArrayObtainStyledAttributes = ctx.obtainStyledAttributes(attributeSet, b.IconicsCompoundButton);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "ctx.obtainStyledAttribut…le.IconicsCompoundButton)");
        Resources resources = ctx.getResources();
        Resources.Theme theme = ctx.getTheme();
        int i10 = b.IconicsCompoundButton_iiv_unchecked_icon;
        int i11 = b.IconicsCompoundButton_iiv_unchecked_color;
        int i12 = b.IconicsCompoundButton_iiv_unchecked_size;
        int i13 = b.IconicsCompoundButton_iiv_unchecked_padding;
        int i14 = b.IconicsCompoundButton_iiv_unchecked_contour_color;
        int i15 = b.IconicsCompoundButton_iiv_unchecked_contour_width;
        int i16 = b.IconicsCompoundButton_iiv_unchecked_background_color;
        int i17 = b.IconicsCompoundButton_iiv_unchecked_corner_radius;
        int i18 = b.IconicsCompoundButton_iiv_unchecked_background_contour_color;
        int i19 = b.IconicsCompoundButton_iiv_unchecked_background_contour_width;
        int i20 = b.IconicsCompoundButton_iiv_unchecked_shadow_radius;
        int i21 = b.IconicsCompoundButton_iiv_unchecked_shadow_dx;
        int i22 = b.IconicsCompoundButton_iiv_unchecked_shadow_dy;
        int i23 = b.IconicsCompoundButton_iiv_unchecked_shadow_color;
        int i24 = b.IconicsCompoundButton_iiv_unchecked_animations;
        int i25 = b.IconicsCompoundButton_iiv_unchecked_automirror;
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        icon.f3866d = new c(resources, theme, typedArrayObtainStyledAttributes, i10, i12, i11, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25).b(null, true);
        Resources resources2 = ctx.getResources();
        Resources.Theme theme2 = ctx.getTheme();
        int i26 = b.IconicsCompoundButton_iiv_checked_icon;
        int i27 = b.IconicsCompoundButton_iiv_checked_color;
        int i28 = b.IconicsCompoundButton_iiv_checked_size;
        int i29 = b.IconicsCompoundButton_iiv_checked_padding;
        int i30 = b.IconicsCompoundButton_iiv_checked_contour_color;
        int i31 = b.IconicsCompoundButton_iiv_checked_contour_width;
        int i32 = b.IconicsCompoundButton_iiv_checked_background_color;
        int i33 = b.IconicsCompoundButton_iiv_checked_corner_radius;
        int i34 = b.IconicsCompoundButton_iiv_checked_background_contour_color;
        int i35 = b.IconicsCompoundButton_iiv_checked_background_contour_width;
        int i36 = b.IconicsCompoundButton_iiv_checked_shadow_radius;
        int i37 = b.IconicsCompoundButton_iiv_checked_shadow_dx;
        int i38 = b.IconicsCompoundButton_iiv_checked_shadow_dy;
        int i39 = b.IconicsCompoundButton_iiv_checked_shadow_color;
        int i40 = b.IconicsCompoundButton_iiv_checked_animations;
        int i41 = b.IconicsCompoundButton_iiv_checked_automirror;
        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        icon.f3865c = new c(resources2, theme2, typedArrayObtainStyledAttributes, i26, i28, i27, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41).b(null, true);
        Unit unit = Unit.f38893a;
        typedArrayObtainStyledAttributes.recycle();
        Intrinsics.checkNotNullParameter(ctx, "context");
        TypedArray typedArrayObtainStyledAttributes2 = ctx.obtainStyledAttributes(attributeSet, b.IconicsAnimateChanges);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…le.IconicsAnimateChanges)");
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(b.IconicsAnimateChanges_iiv_animate_icon_changes, true);
        typedArrayObtainStyledAttributes2.recycle();
        icon.f3864b = z3;
        D3.a.Q(this, (IconicsDrawable) icon.f3865c, (IconicsDrawable) icon.f3866d);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        setButtonDrawable(J3.a.l(ctx, (IconicsDrawable) icon.f3866d, (IconicsDrawable) icon.f3865c, icon.f3864b));
        Drawable buttonDrawable = getButtonDrawable();
        if (buttonDrawable != null) {
            setMinWidth(buttonDrawable.getMinimumWidth());
            setMinHeight(buttonDrawable.getMinimumHeight());
        }
    }
}
