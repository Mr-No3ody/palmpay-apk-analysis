package com.mikepenz.iconics.view;

import E.AbstractC0198c;
import L5.a;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.internal.CompoundIconicsDrawables;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u000fR(\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u000fR(\u0010 \u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u000fR(\u0010#\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u000f¨\u0006$"}, d2 = {"Lcom/mikepenz/iconics/view/IconicsTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/mikepenz/iconics/internal/CompoundIconicsDrawables;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/mikepenz/iconics/IconicsDrawable;", "drawable", "", "setDrawableForAll", "(Lcom/mikepenz/iconics/IconicsDrawable;)V", "LL5/a;", "a", "LL5/a;", "getIconsBundle$iconics_views", "()LL5/a;", "iconsBundle", "value", "getIconicsDrawableStart", "()Lcom/mikepenz/iconics/IconicsDrawable;", "setIconicsDrawableStart", "iconicsDrawableStart", "getIconicsDrawableTop", "setIconicsDrawableTop", "iconicsDrawableTop", "getIconicsDrawableEnd", "setIconicsDrawableEnd", "iconicsDrawableEnd", "getIconicsDrawableBottom", "setIconicsDrawableBottom", "iconicsDrawableBottom", "iconics-views"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class IconicsTextView extends AppCompatTextView implements CompoundIconicsDrawables {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final a iconsBundle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void b() {
        this.iconsBundle.a(this);
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getIconicsDrawableBottom() {
        return this.iconsBundle.f5556d;
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getIconicsDrawableEnd() {
        return this.iconsBundle.f5555c;
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getIconicsDrawableStart() {
        return this.iconsBundle.f5553a;
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getIconicsDrawableTop() {
        return this.iconsBundle.f5554b;
    }

    @NotNull
    /* JADX INFO: renamed from: getIconsBundle$iconics_views, reason: from getter */
    public final a getIconsBundle() {
        return this.iconsBundle;
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setDrawableForAll(@Nullable IconicsDrawable drawable) {
        D3.a.P(this, drawable);
        a aVar = this.iconsBundle;
        aVar.f5553a = drawable;
        D3.a.P(this, drawable);
        aVar.f5554b = drawable;
        D3.a.P(this, drawable);
        aVar.f5555c = drawable;
        D3.a.P(this, drawable);
        aVar.f5556d = drawable;
        b();
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setIconicsDrawableBottom(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.iconsBundle.f5556d = iconicsDrawable;
        b();
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setIconicsDrawableEnd(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.iconsBundle.f5555c = iconicsDrawable;
        b();
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setIconicsDrawableStart(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.iconsBundle.f5553a = iconicsDrawable;
        b();
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setIconicsDrawableTop(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.iconsBundle.f5554b = iconicsDrawable;
        b();
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (isInEditMode()) {
            super.setText(charSequence, type);
        } else {
            super.setText(charSequence != null ? AbstractC0198c.f(charSequence) : null, type);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IconicsTextView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a();
        this.iconsBundle = aVar;
        AbstractC0198c.V(context, attributeSet, aVar);
        D3.a.Q(this, aVar.f5556d, aVar.f5554b, aVar.f5555c, aVar.f5553a);
        b();
    }
}
