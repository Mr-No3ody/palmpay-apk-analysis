package androidx.appcompat.widget;

import M7.C0442b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton implements TintableBackgroundView, TintableImageSourceView {
    private final C0885u mBackgroundTintHelper;
    private boolean mHasLevel;
    private final B mImageHelper;

    public AppCompatImageButton(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.a();
        }
        B b7 = this.mImageHelper;
        if (b7 != null) {
            b7.a();
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

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportImageTintList() {
        C0442b c0442b;
        B b7 = this.mImageHelper;
        if (b7 == null || (c0442b = b7.f12626b) == null) {
            return null;
        }
        return (ColorStateList) c0442b.f5807c;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportImageTintMode() {
        C0442b c0442b;
        B b7 = this.mImageHelper;
        if (b7 == null || (c0442b = b7.f12626b) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0442b.f5808d;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f12625a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B b7 = this.mImageHelper;
        if (b7 != null) {
            b7.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        B b7 = this.mImageHelper;
        if (b7 != null && drawable != null && !this.mHasLevel) {
            b7.f12627c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        B b10 = this.mImageHelper;
        if (b10 != null) {
            b10.a();
            if (this.mHasLevel) {
                return;
            }
            B b11 = this.mImageHelper;
            ImageView imageView = b11.f12625a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(b11.f12627c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i7) {
        this.mImageHelper.c(i7);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        B b7 = this.mImageHelper;
        if (b7 != null) {
            b7.a();
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

    @Override // androidx.core.widget.TintableImageSourceView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        B b7 = this.mImageHelper;
        if (b7 != null) {
            if (b7.f12626b == null) {
                b7.f12626b = new C0442b();
            }
            C0442b c0442b = b7.f12626b;
            c0442b.f5807c = colorStateList;
            c0442b.f5806b = true;
            b7.a();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        B b7 = this.mImageHelper;
        if (b7 != null) {
            if (b7.f12626b == null) {
                b7.f12626b = new C0442b();
            }
            C0442b c0442b = b7.f12626b;
            c0442b.f5808d = mode;
            c0442b.f5805a = true;
            b7.a();
        }
    }

    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(context);
        this.mHasLevel = false;
        W0.a(this, getContext());
        C0885u c0885u = new C0885u(this);
        this.mBackgroundTintHelper = c0885u;
        c0885u.d(attributeSet, i7);
        B b7 = new B(this);
        this.mImageHelper = b7;
        b7.b(attributeSet, i7);
    }
}
