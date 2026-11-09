package com.mikepenz.iconics.view;

import E.AbstractC0198c;
import L5.a;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.internal.CompoundIconicsDrawables;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u000fR(\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u000fR(\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u000fR(\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/mikepenz/iconics/view/IconicsButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Lcom/mikepenz/iconics/internal/CompoundIconicsDrawables;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/mikepenz/iconics/IconicsDrawable;", "drawable", "", "setDrawableForAll", "(Lcom/mikepenz/iconics/IconicsDrawable;)V", "value", "getIconicsDrawableStart", "()Lcom/mikepenz/iconics/IconicsDrawable;", "setIconicsDrawableStart", "iconicsDrawableStart", "getIconicsDrawableTop", "setIconicsDrawableTop", "iconicsDrawableTop", "getIconicsDrawableEnd", "setIconicsDrawableEnd", "iconicsDrawableEnd", "getIconicsDrawableBottom", "setIconicsDrawableBottom", "iconicsDrawableBottom", "iconics-views"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class IconicsButton extends AppCompatButton implements CompoundIconicsDrawables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f23613a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.f23613a.a(this);
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getIconicsDrawableBottom() {
        return this.f23613a.f5553a;
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getIconicsDrawableEnd() {
        return this.f23613a.f5553a;
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getIconicsDrawableStart() {
        return this.f23613a.f5553a;
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    @Nullable
    public IconicsDrawable getIconicsDrawableTop() {
        return this.f23613a.f5553a;
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setDrawableForAll(@Nullable IconicsDrawable drawable) {
        D3.a.P(this, drawable);
        a aVar = this.f23613a;
        aVar.f5553a = drawable;
        D3.a.P(this, drawable);
        aVar.f5554b = drawable;
        D3.a.P(this, drawable);
        aVar.f5555c = drawable;
        D3.a.P(this, drawable);
        aVar.f5556d = drawable;
        a();
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setIconicsDrawableBottom(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.f23613a.f5553a = iconicsDrawable;
        a();
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setIconicsDrawableEnd(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.f23613a.f5553a = iconicsDrawable;
        a();
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setIconicsDrawableStart(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.f23613a.f5553a = iconicsDrawable;
        a();
    }

    @Override // com.mikepenz.iconics.internal.CompoundIconicsDrawables
    public void setIconicsDrawableTop(@Nullable IconicsDrawable iconicsDrawable) {
        D3.a.P(this, iconicsDrawable);
        this.f23613a.f5553a = iconicsDrawable;
        a();
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence text, TextView.BufferType type) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        setAllCaps(false);
        if (isInEditMode()) {
            super.setText(text, type);
        } else {
            super.setText(AbstractC0198c.f(text), type);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IconicsButton(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, N5.a.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a();
        this.f23613a = aVar;
        AbstractC0198c.V(context, attributeSet, aVar);
        D3.a.Q(this, aVar.f5556d, aVar.f5554b, aVar.f5555c, aVar.f5553a);
        a();
    }
}
