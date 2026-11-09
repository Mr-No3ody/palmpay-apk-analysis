package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements TintableCheckedTextView, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0887v f12602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0885u f12603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f12604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A f12605d;

    public AppCompatCheckedTextView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private A getEmojiTextViewHelper() {
        if (this.f12605d == null) {
            this.f12605d = new A(this);
        }
        return this.f12605d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        V v3 = this.f12604c;
        if (v3 != null) {
            v3.b();
        }
        C0885u c0885u = this.f12603b;
        if (c0885u != null) {
            c0885u.a();
        }
        C0887v c0887v = this.f12602a;
        if (c0887v != null) {
            c0887v.a();
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
        C0885u c0885u = this.f12603b;
        if (c0885u != null) {
            return c0885u.b();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885u c0885u = this.f12603b;
        if (c0885u != null) {
            return c0885u.c();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportCheckMarkTintList() {
        C0887v c0887v = this.f12602a;
        if (c0887v != null) {
            return c0887v.f13014b;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0887v c0887v = this.f12602a;
        if (c0887v != null) {
            return c0887v.f13015c;
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12604c.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12604c.e();
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public final boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        androidx.camera.core.impl.utils.executor.g.G(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885u c0885u = this.f12603b;
        if (c0885u != null) {
            c0885u.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i7) {
        super.setBackgroundResource(i7);
        C0885u c0885u = this.f12603b;
        if (c0885u != null) {
            c0885u.f(i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0887v c0887v = this.f12602a;
        if (c0887v != null) {
            if (c0887v.f13018f) {
                c0887v.f13018f = false;
            } else {
                c0887v.f13018f = true;
                c0887v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v3 = this.f12604c;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v3 = this.f12604c;
        if (v3 != null) {
            v3.b();
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

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0885u c0885u = this.f12603b;
        if (c0885u != null) {
            c0885u.h(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0885u c0885u = this.f12603b;
        if (c0885u != null) {
            c0885u.i(mode);
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        C0887v c0887v = this.f12602a;
        if (c0887v != null) {
            c0887v.f13014b = colorStateList;
            c0887v.f13016d = true;
            c0887v.a();
        }
    }

    @Override // androidx.core.widget.TintableCheckedTextView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        C0887v c0887v = this.f12602a;
        if (c0887v != null) {
            c0887v.f13015c = mode;
            c0887v.f13017e = true;
            c0887v.a();
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        V v3 = this.f12604c;
        v3.l(colorStateList);
        v3.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        V v3 = this.f12604c;
        v3.m(mode);
        v3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        V v3 = this.f12604c;
        if (v3 != null) {
            v3.g(i7, context);
        }
    }

    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.checkedTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, i7);
        X0.a(context);
        W0.a(this, getContext());
        V v3 = new V(this);
        this.f12604c = v3;
        v3.f(attributeSet, i7);
        v3.b();
        C0885u c0885u = new C0885u(this);
        this.f12603b = c0885u;
        c0885u.d(attributeSet, i7);
        this.f12602a = new C0887v(this);
        Z0 z0F = Z0.f(getContext(), attributeSet, p241q.j.CheckedTextView, i7, 0);
        TypedArray typedArray = z0F.f12863b;
        androidx.core.view.N.p(this, getContext(), p241q.j.CheckedTextView, attributeSet, z0F.f12863b, i7, 0);
        try {
            if (typedArray.hasValue(p241q.j.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(p241q.j.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(p264r5.a.q(resourceId2, getContext()));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(p241q.j.CheckedTextView_android_checkMark)) {
                        setCheckMarkDrawable(p264r5.a.q(resourceId, getContext()));
                    }
                }
            } else if (typedArray.hasValue(p241q.j.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(p241q.j.CheckedTextView_android_checkMark, 0)) != 0) {
                setCheckMarkDrawable(p264r5.a.q(resourceId, getContext()));
            }
            if (typedArray.hasValue(p241q.j.CheckedTextView_checkMarkTint)) {
                setCheckMarkTintList(z0F.a(p241q.j.CheckedTextView_checkMarkTint));
            }
            if (typedArray.hasValue(p241q.j.CheckedTextView_checkMarkTintMode)) {
                setCheckMarkTintMode(AbstractC0859g0.c(typedArray.getInt(p241q.j.CheckedTextView_checkMarkTintMode, -1), null));
            }
            z0F.g();
            getEmojiTextViewHelper().c(attributeSet, i7);
        } catch (Throwable th) {
            z0F.g();
            throw th;
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i7) {
        setCheckMarkDrawable(p264r5.a.q(i7, getContext()));
    }
}
