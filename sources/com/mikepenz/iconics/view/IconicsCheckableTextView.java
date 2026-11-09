package com.mikepenz.iconics.view;

import J5.c;
import N5.b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002*+B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u001bR(\u0010#\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010\u001bR(\u0010&\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010\u001bR(\u0010)\u001a\u0004\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00188V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010\u001b¨\u0006,"}, d2 = {"Lcom/mikepenz/iconics/view/IconicsCheckableTextView;", "Lcom/mikepenz/iconics/view/IconicsTextView;", "Landroid/widget/Checkable;", "Lcom/mikepenz/iconics/internal/CheckedCompoundIconicsDrawables;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "checked", "", "setChecked", "(Z)V", "Lcom/mikepenz/iconics/view/IconicsCheckableTextView$OnCheckedChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCheckedChangeListener", "(Lcom/mikepenz/iconics/view/IconicsCheckableTextView$OnCheckedChangeListener;)V", "Lcom/mikepenz/iconics/IconicsDrawable;", "drawable", "setCheckedDrawableForAll", "(Lcom/mikepenz/iconics/IconicsDrawable;)V", "value", "getCheckedIconicsDrawableStart", "()Lcom/mikepenz/iconics/IconicsDrawable;", "setCheckedIconicsDrawableStart", "checkedIconicsDrawableStart", "getCheckedIconicsDrawableTop", "setCheckedIconicsDrawableTop", "checkedIconicsDrawableTop", "getCheckedIconicsDrawableEnd", "setCheckedIconicsDrawableEnd", "checkedIconicsDrawableEnd", "getCheckedIconicsDrawableBottom", "setCheckedIconicsDrawableBottom", "checkedIconicsDrawableBottom", "a", "OnCheckedChangeListener", "iconics-views"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class IconicsCheckableTextView extends IconicsTextView implements Checkable, CheckedCompoundIconicsDrawables {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f23614g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L5.a f23615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnCheckedChangeListener f23619f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/mikepenz/iconics/view/IconicsCheckableTextView$OnCheckedChangeListener;", "", "onCheckedChanged", "", "buttonView", "Lcom/mikepenz/iconics/view/IconicsCheckableTextView;", "isChecked", "", "iconics-views"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnCheckedChangeListener {
        void onCheckedChanged(@NotNull IconicsCheckableTextView buttonView, boolean isChecked);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f23614g = new int[]{R.attr.state_checked};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsCheckableTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        IconicsDrawable iconicsDrawable = getIconsBundle().f5553a;
        L5.a aVar = this.f23615b;
        IconicsDrawable iconicsDrawable2 = aVar.f5553a;
        boolean z3 = this.f23616c;
        StateListDrawable stateListDrawableL = J3.a.l(context, iconicsDrawable, iconicsDrawable2, z3);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        StateListDrawable stateListDrawableL2 = J3.a.l(context2, getIconsBundle().f5554b, aVar.f5554b, z3);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        StateListDrawable stateListDrawableL3 = J3.a.l(context3, getIconsBundle().f5555c, aVar.f5555c, z3);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        setCompoundDrawablesRelativeWithIntrinsicBounds(stateListDrawableL, stateListDrawableL2, stateListDrawableL3, J3.a.l(context4, getIconsBundle().f5556d, aVar.f5556d, z3));
    }

    @Override // android.widget.TextView, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        String name = IconicsCheckableTextView.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "IconicsCheckableTextView::class.java.name");
        return name;
    }

    @Override // com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getCheckedIconicsDrawableBottom() {
        return this.f23615b.f5556d;
    }

    @Override // com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getCheckedIconicsDrawableEnd() {
        return this.f23615b.f5555c;
    }

    @Override // com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getCheckedIconicsDrawableStart() {
        return this.f23615b.f5553a;
    }

    @Override // com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getCheckedIconicsDrawableTop() {
        return this.f23615b.f5554b;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f23617d;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] drawableState = super.onCreateDrawableState(i7 + 1);
        if (this.f23617d) {
            View.mergeDrawableStates(drawableState, f23614g);
        }
        Intrinsics.checkNotNullExpressionValue(drawableState, "drawableState");
        return drawableState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        boolean zPerformClick = super.performClick();
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (this.f23617d != checked) {
            this.f23617d = checked;
            refreshDrawableState();
            if (this.f23618e) {
                return;
            }
            this.f23618e = true;
            OnCheckedChangeListener onCheckedChangeListener = this.f23619f;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, this.f23617d);
            }
            this.f23618e = false;
        }
    }

    @Override // com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables
    public void setCheckedDrawableForAll(@Nullable IconicsDrawable drawable) {
        D3.a.P(this, drawable);
        L5.a aVar = this.f23615b;
        aVar.f5553a = drawable;
        D3.a.P(this, drawable);
        aVar.f5554b = drawable;
        D3.a.P(this, drawable);
        aVar.f5555c = drawable;
        D3.a.P(this, drawable);
        aVar.f5556d = drawable;
        c();
    }

    @Override // com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables
    public void setCheckedIconicsDrawableBottom(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.f23615b.f5556d = iconicsDrawable;
        c();
    }

    @Override // com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables
    public void setCheckedIconicsDrawableEnd(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.f23615b.f5555c = iconicsDrawable;
        c();
    }

    @Override // com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables
    public void setCheckedIconicsDrawableStart(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.f23615b.f5553a = iconicsDrawable;
        c();
    }

    @Override // com.mikepenz.iconics.internal.CheckedCompoundIconicsDrawables
    public void setCheckedIconicsDrawableTop(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.f23615b.f5554b = iconicsDrawable;
        c();
    }

    public final void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener listener) {
        this.f23619f = listener;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f23617d = !this.f23617d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsCheckableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IconicsCheckableTextView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, p241q.a.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsCheckableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        L5.a bundle = new L5.a();
        this.f23615b = bundle;
        setFocusable(true);
        setClickable(true);
        Intrinsics.checkNotNullParameter(context, "ctx");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.IconicsCheckableTextView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "ctx.obtainStyledAttribut…IconicsCheckableTextView)");
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        int i10 = b.IconicsCheckableTextView_iiv_all_checked_icon;
        int i11 = b.IconicsCheckableTextView_iiv_all_checked_color;
        int i12 = b.IconicsCheckableTextView_iiv_all_checked_size;
        int i13 = b.IconicsCheckableTextView_iiv_all_checked_padding;
        int i14 = b.IconicsCheckableTextView_iiv_all_checked_contour_color;
        int i15 = b.IconicsCheckableTextView_iiv_all_checked_contour_width;
        int i16 = b.IconicsCheckableTextView_iiv_all_checked_background_color;
        int i17 = b.IconicsCheckableTextView_iiv_all_checked_corner_radius;
        int i18 = b.IconicsCheckableTextView_iiv_all_checked_background_contour_color;
        int i19 = b.IconicsCheckableTextView_iiv_all_checked_background_contour_width;
        int i20 = b.IconicsCheckableTextView_iiv_all_checked_shadow_radius;
        int i21 = b.IconicsCheckableTextView_iiv_all_checked_shadow_dx;
        int i22 = b.IconicsCheckableTextView_iiv_all_checked_shadow_dy;
        int i23 = b.IconicsCheckableTextView_iiv_all_checked_shadow_color;
        int i24 = b.IconicsCheckableTextView_iiv_all_checked_animations;
        int i25 = b.IconicsCheckableTextView_iiv_all_checked_automirror;
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        IconicsDrawable iconicsDrawableB = new c(resources, theme, typedArrayObtainStyledAttributes, i10, i12, i11, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25).b(null, true);
        Resources resources2 = context.getResources();
        Resources.Theme theme2 = context.getTheme();
        int i26 = b.IconicsCheckableTextView_iiv_start_checked_icon;
        int i27 = b.IconicsCheckableTextView_iiv_start_checked_color;
        int i28 = b.IconicsCheckableTextView_iiv_start_checked_size;
        int i29 = b.IconicsCheckableTextView_iiv_start_checked_padding;
        int i30 = b.IconicsCheckableTextView_iiv_start_checked_contour_color;
        int i31 = b.IconicsCheckableTextView_iiv_start_checked_contour_width;
        int i32 = b.IconicsCheckableTextView_iiv_start_checked_background_color;
        int i33 = b.IconicsCheckableTextView_iiv_start_checked_corner_radius;
        int i34 = b.IconicsCheckableTextView_iiv_start_checked_background_contour_color;
        int i35 = b.IconicsCheckableTextView_iiv_start_checked_background_contour_width;
        int i36 = b.IconicsCheckableTextView_iiv_start_checked_shadow_radius;
        int i37 = b.IconicsCheckableTextView_iiv_start_checked_shadow_dx;
        int i38 = b.IconicsCheckableTextView_iiv_start_checked_shadow_dy;
        int i39 = b.IconicsCheckableTextView_iiv_start_checked_shadow_color;
        int i40 = b.IconicsCheckableTextView_iiv_start_checked_animations;
        int i41 = b.IconicsCheckableTextView_iiv_start_checked_automirror;
        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
        bundle.f5553a = new c(resources2, theme2, typedArrayObtainStyledAttributes, i26, i28, i27, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41).b(iconicsDrawableB, true);
        Resources resources3 = context.getResources();
        Resources.Theme theme3 = context.getTheme();
        int i42 = b.IconicsCheckableTextView_iiv_top_checked_icon;
        int i43 = b.IconicsCheckableTextView_iiv_top_checked_color;
        int i44 = b.IconicsCheckableTextView_iiv_top_checked_size;
        int i45 = b.IconicsCheckableTextView_iiv_top_checked_padding;
        int i46 = b.IconicsCheckableTextView_iiv_top_checked_contour_color;
        int i47 = b.IconicsCheckableTextView_iiv_top_checked_contour_width;
        int i48 = b.IconicsCheckableTextView_iiv_top_checked_background_color;
        int i49 = b.IconicsCheckableTextView_iiv_top_checked_corner_radius;
        int i50 = b.IconicsCheckableTextView_iiv_top_checked_background_contour_color;
        int i51 = b.IconicsCheckableTextView_iiv_top_checked_background_contour_width;
        int i52 = b.IconicsCheckableTextView_iiv_top_checked_shadow_radius;
        int i53 = b.IconicsCheckableTextView_iiv_top_checked_shadow_dx;
        int i54 = b.IconicsCheckableTextView_iiv_top_checked_shadow_dy;
        int i55 = b.IconicsCheckableTextView_iiv_top_checked_shadow_color;
        int i56 = b.IconicsCheckableTextView_iiv_top_checked_animations;
        int i57 = b.IconicsCheckableTextView_iiv_top_checked_automirror;
        Intrinsics.checkNotNullExpressionValue(resources3, "resources");
        bundle.f5554b = new c(resources3, theme3, typedArrayObtainStyledAttributes, i42, i44, i43, i45, i46, i47, i48, i49, i50, i51, i52, i53, i54, i55, i56, i57).b(iconicsDrawableB, true);
        Resources resources4 = context.getResources();
        Resources.Theme theme4 = context.getTheme();
        int i58 = b.IconicsCheckableTextView_iiv_end_checked_icon;
        int i59 = b.IconicsCheckableTextView_iiv_end_checked_color;
        int i60 = b.IconicsCheckableTextView_iiv_end_checked_size;
        int i61 = b.IconicsCheckableTextView_iiv_end_checked_padding;
        int i62 = b.IconicsCheckableTextView_iiv_end_checked_contour_color;
        int i63 = b.IconicsCheckableTextView_iiv_end_checked_contour_width;
        int i64 = b.IconicsCheckableTextView_iiv_end_checked_background_color;
        int i65 = b.IconicsCheckableTextView_iiv_end_checked_corner_radius;
        int i66 = b.IconicsCheckableTextView_iiv_end_checked_background_contour_color;
        int i67 = b.IconicsCheckableTextView_iiv_end_checked_background_contour_width;
        int i68 = b.IconicsCheckableTextView_iiv_end_checked_shadow_radius;
        int i69 = b.IconicsCheckableTextView_iiv_end_checked_shadow_dx;
        int i70 = b.IconicsCheckableTextView_iiv_end_checked_shadow_dy;
        int i71 = b.IconicsCheckableTextView_iiv_end_checked_shadow_color;
        int i72 = b.IconicsCheckableTextView_iiv_end_checked_animations;
        int i73 = b.IconicsCheckableTextView_iiv_end_checked_automirror;
        Intrinsics.checkNotNullExpressionValue(resources4, "resources");
        bundle.f5555c = new c(resources4, theme4, typedArrayObtainStyledAttributes, i58, i60, i59, i61, i62, i63, i64, i65, i66, i67, i68, i69, i70, i71, i72, i73).b(iconicsDrawableB, true);
        Resources resources5 = context.getResources();
        Resources.Theme theme5 = context.getTheme();
        int i74 = b.IconicsCheckableTextView_iiv_bottom_checked_icon;
        int i75 = b.IconicsCheckableTextView_iiv_bottom_checked_color;
        int i76 = b.IconicsCheckableTextView_iiv_bottom_checked_size;
        int i77 = b.IconicsCheckableTextView_iiv_bottom_checked_padding;
        int i78 = b.IconicsCheckableTextView_iiv_bottom_checked_contour_color;
        int i79 = b.IconicsCheckableTextView_iiv_bottom_checked_contour_width;
        int i80 = b.IconicsCheckableTextView_iiv_bottom_checked_background_color;
        int i81 = b.IconicsCheckableTextView_iiv_bottom_checked_corner_radius;
        int i82 = b.IconicsCheckableTextView_iiv_bottom_checked_background_contour_color;
        int i83 = b.IconicsCheckableTextView_iiv_bottom_checked_background_contour_width;
        int i84 = b.IconicsCheckableTextView_iiv_bottom_checked_shadow_radius;
        int i85 = b.IconicsCheckableTextView_iiv_bottom_checked_shadow_dx;
        int i86 = b.IconicsCheckableTextView_iiv_bottom_checked_shadow_dy;
        int i87 = b.IconicsCheckableTextView_iiv_bottom_checked_shadow_color;
        int i88 = b.IconicsCheckableTextView_iiv_bottom_checked_animations;
        int i89 = b.IconicsCheckableTextView_iiv_bottom_checked_automirror;
        Intrinsics.checkNotNullExpressionValue(resources5, "resources");
        bundle.f5556d = new c(resources5, theme5, typedArrayObtainStyledAttributes, i74, i76, i75, i77, i78, i79, i80, i81, i82, i83, i84, i85, i86, i87, i88, i89).b(iconicsDrawableB, true);
        Unit unit = Unit.f38893a;
        typedArrayObtainStyledAttributes.recycle();
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.IconicsAnimateChanges);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…le.IconicsAnimateChanges)");
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(b.IconicsAnimateChanges_iiv_animate_icon_changes, true);
        typedArrayObtainStyledAttributes2.recycle();
        this.f23616c = z3;
        D3.a.Q(this, bundle.f5556d, bundle.f5554b, bundle.f5555c, bundle.f5553a);
        c();
    }
}
