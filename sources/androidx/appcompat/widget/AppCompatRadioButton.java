package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements TintableCompoundButton, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {
    private A mAppCompatEmojiTextHelper;
    private final C0885u mBackgroundTintHelper;
    private final C0889w mCompoundButtonHelper;
    private final V mTextHelper;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    @NonNull
    private A getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new A(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.a();
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportBackgroundTintList() {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            return c0885u.b();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            return c0885u.c();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportButtonTintList() {
        C0889w c0889w = this.mCompoundButtonHelper;
        if (c0889w != null) {
            return c0889w.f13021b;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportButtonTintMode() {
        C0889w c0889w = this.mCompoundButtonHelper;
        if (c0889w != null) {
            return c0889w.f13022c;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i7) {
        super.setBackgroundResource(i7);
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.f(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0889w c0889w = this.mCompoundButtonHelper;
        if (c0889w != null) {
            if (c0889w.f13025f) {
                c0889w.f13025f = false;
            } else {
                c0889w.f13025f = true;
                c0889w.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v3 = this.mTextHelper;
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
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.h(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.i(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo({p192n.c.f39802c})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        C0889w c0889w = this.mCompoundButtonHelper;
        if (c0889w != null) {
            c0889w.f13021b = colorStateList;
            c0889w.f13023d = true;
            c0889w.a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo({p192n.c.f39802c})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        C0889w c0889w = this.mCompoundButtonHelper;
        if (c0889w != null) {
            c0889w.f13022c = mode;
            c0889w.f13024e = true;
            c0889w.a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.l(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.m(mode);
        this.mTextHelper.b();
    }

    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.radioButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(context);
        W0.a(this, getContext());
        C0889w c0889w = new C0889w(this);
        this.mCompoundButtonHelper = c0889w;
        c0889w.b(attributeSet, i7);
        C0885u c0885u = new C0885u(this);
        this.mBackgroundTintHelper = c0885u;
        c0885u.d(attributeSet, i7);
        V v3 = new V(this);
        this.mTextHelper = v3;
        v3.f(attributeSet, i7);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i7) {
        setButtonDrawable(p264r5.a.q(i7, getContext()));
    }
}
