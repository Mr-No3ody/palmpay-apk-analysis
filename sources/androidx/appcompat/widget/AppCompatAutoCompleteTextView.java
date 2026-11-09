package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {
    private static final int[] TINT_ATTRS = {R.attr.popupBackground};

    @NonNull
    private final C0895z mAppCompatEmojiEditTextHelper;
    private final C0885u mBackgroundTintHelper;
    private final V mTextHelper;

    public AppCompatAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
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

    public void initEmojiKeyListener(C0895z c0895z) {
        KeyListener keyListener = getKeyListener();
        c0895z.getClass();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c0895z.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return ((p228p0.i) ((androidx.work.impl.model.b) this.mAppCompatEmojiEditTextHelper.f13033b.f41176b).f18581c).f41167c;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        androidx.camera.core.impl.utils.executor.g.G(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.mAppCompatEmojiEditTextHelper.c(inputConnectionOnCreateInputConnection, editorInfo);
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p377z5.l.Q(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int i7) {
        setDropDownBackgroundDrawable(p264r5.a.q(i7, getContext()));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z3) {
        this.mAppCompatEmojiEditTextHelper.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
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

    public AppCompatAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(context);
        W0.a(this, getContext());
        Z0 z0F = Z0.f(getContext(), attributeSet, TINT_ATTRS, i7, 0);
        if (z0F.f12863b.hasValue(0)) {
            setDropDownBackgroundDrawable(z0F.b(0));
        }
        z0F.g();
        C0885u c0885u = new C0885u(this);
        this.mBackgroundTintHelper = c0885u;
        c0885u.d(attributeSet, i7);
        V v3 = new V(this);
        this.mTextHelper = v3;
        v3.f(attributeSet, i7);
        v3.b();
        C0895z c0895z = new C0895z(this);
        this.mAppCompatEmojiEditTextHelper = c0895z;
        c0895z.b(attributeSet, i7);
        initEmojiKeyListener(c0895z);
    }
}
