package androidx.appcompat.widget;

import M7.C0442b;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f12625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0442b f12626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12627c = 0;

    public B(ImageView imageView) {
        this.f12625a = imageView;
    }

    public final void a() {
        C0442b c0442b;
        ImageView imageView = this.f12625a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0859g0.a(drawable);
        }
        if (drawable == null || (c0442b = this.f12626b) == null) {
            return;
        }
        C0891x.e(drawable, c0442b, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i7) {
        int resourceId;
        ImageView imageView = this.f12625a;
        Z0 z0F = Z0.f(imageView.getContext(), attributeSet, p241q.j.AppCompatImageView, i7, 0);
        ImageView imageView2 = this.f12625a;
        androidx.core.view.N.p(imageView2, imageView2.getContext(), p241q.j.AppCompatImageView, attributeSet, z0F.f12863b, i7, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = z0F.f12863b;
            if (drawable == null && (resourceId = typedArray.getResourceId(p241q.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = p264r5.a.q(resourceId, imageView.getContext())) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0859g0.a(drawable);
            }
            if (typedArray.hasValue(p241q.j.AppCompatImageView_tint)) {
                imageView.setImageTintList(z0F.a(p241q.j.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(p241q.j.AppCompatImageView_tintMode)) {
                imageView.setImageTintMode(AbstractC0859g0.c(typedArray.getInt(p241q.j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            z0F.g();
        }
    }

    public final void c(int i7) {
        ImageView imageView = this.f12625a;
        if (i7 != 0) {
            Drawable drawableQ = p264r5.a.q(i7, imageView.getContext());
            if (drawableQ != null) {
                AbstractC0859g0.a(drawableQ);
            }
            imageView.setImageDrawable(drawableQ);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
