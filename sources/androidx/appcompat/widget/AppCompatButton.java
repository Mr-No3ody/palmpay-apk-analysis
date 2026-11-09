package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView, EmojiCompatConfigurationView {

    @NonNull
    private A mAppCompatEmojiTextHelper;
    private final C0885u mBackgroundTintHelper;
    private final V mTextHelper;

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private A getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new A(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public int getAutoSizeMaxTextSize() {
        if (p1.f12997c) {
            return super.getAutoSizeMaxTextSize();
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            return Math.round(v3.f12840i.f12883e);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public int getAutoSizeMinTextSize() {
        if (p1.f12997c) {
            return super.getAutoSizeMinTextSize();
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            return Math.round(v3.f12840i.f12882d);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public int getAutoSizeStepGranularity() {
        if (p1.f12997c) {
            return super.getAutoSizeStepGranularity();
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            return Math.round(v3.f12840i.f12881c);
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public int[] getAutoSizeTextAvailableSizes() {
        if (p1.f12997c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        V v3 = this.mTextHelper;
        return v3 != null ? v3.f12840i.f12884f : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({p192n.c.f39802c})
    public int getAutoSizeTextType() {
        if (p1.f12997c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            return v3.f12840i.f12879a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p377z5.l.P(super.getCustomSelectionActionModeCallback());
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        V v3 = this.mTextHelper;
        if (v3 == null || p1.f12997c) {
            return;
        }
        v3.f12840i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        V v3 = this.mTextHelper;
        if (v3 == null || p1.f12997c || !v3.f12840i.f()) {
            return;
        }
        this.mTextHelper.f12840i.a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12) throws IllegalArgumentException {
        if (p1.f12997c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
            return;
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.i(i7, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i7) throws IllegalArgumentException {
        if (p1.f12997c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.j(iArr, i7);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({p192n.c.f39802c})
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (p1.f12997c) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.k(i7);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p377z5.l.Q(callback, this));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.f12832a.setAllCaps(z3);
        }
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.g(i7, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f10) {
        boolean z3 = p1.f12997c;
        if (z3) {
            super.setTextSize(i7, f10);
            return;
        }
        V v3 = this.mTextHelper;
        if (v3 == null || z3) {
            return;
        }
        C0853d0 c0853d0 = v3.f12840i;
        if (c0853d0.f()) {
            return;
        }
        c0853d0.g(i7, f10);
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(context);
        W0.a(this, getContext());
        C0885u c0885u = new C0885u(this);
        this.mBackgroundTintHelper = c0885u;
        c0885u.d(attributeSet, i7);
        V v3 = new V(this);
        this.mTextHelper = v3;
        v3.f(attributeSet, i7);
        v3.b();
        getEmojiTextViewHelper().c(attributeSet, i7);
    }
}
