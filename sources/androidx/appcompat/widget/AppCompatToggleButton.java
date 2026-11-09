package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton implements TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0885u f12622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f12623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A f12624c;

    public AppCompatToggleButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private A getEmojiTextViewHelper() {
        if (this.f12624c == null) {
            this.f12624c = new A(this);
        }
        return this.f12624c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0885u c0885u = this.f12622a;
        if (c0885u != null) {
            c0885u.a();
        }
        V v3 = this.f12623b;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportBackgroundTintList() {
        C0885u c0885u = this.f12622a;
        if (c0885u != null) {
            return c0885u.b();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885u c0885u = this.f12622a;
        if (c0885u != null) {
            return c0885u.c();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12623b.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12623b.e();
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public final boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885u c0885u = this.f12622a;
        if (c0885u != null) {
            c0885u.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i7) {
        super.setBackgroundResource(i7);
        C0885u c0885u = this.f12622a;
        if (c0885u != null) {
            c0885u.f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v3 = this.f12623b;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v3 = this.f12623b;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0885u c0885u = this.f12622a;
        if (c0885u != null) {
            c0885u.h(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0885u c0885u = this.f12622a;
        if (c0885u != null) {
            c0885u.i(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        V v3 = this.f12623b;
        v3.l(colorStateList);
        v3.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        V v3 = this.f12623b;
        v3.m(mode);
        v3.b();
    }

    public AppCompatToggleButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        W0.a(this, getContext());
        C0885u c0885u = new C0885u(this);
        this.f12622a = c0885u;
        c0885u.d(attributeSet, i7);
        V v3 = new V(this);
        this.f12623b = v3;
        v3.f(attributeSet, i7);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }
}
