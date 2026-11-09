package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0889w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f13020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f13021b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f13022c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13023d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13024e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13025f;

    public C0889w(CompoundButton compoundButton) {
        this.f13020a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f13020a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f13023d || this.f13024e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f13023d) {
                    drawableMutate.setTintList(this.f13021b);
                }
                if (this.f13024e) {
                    drawableMutate.setTintMode(this.f13022c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f13020a;
        Z0 z0F = Z0.f(compoundButton.getContext(), attributeSet, p241q.j.CompoundButton, i7, 0);
        TypedArray typedArray = z0F.f12863b;
        CompoundButton compoundButton2 = this.f13020a;
        androidx.core.view.N.p(compoundButton2, compoundButton2.getContext(), p241q.j.CompoundButton, attributeSet, z0F.f12863b, i7, 0);
        try {
            if (typedArray.hasValue(p241q.j.CompoundButton_buttonCompat) && (resourceId2 = typedArray.getResourceId(p241q.j.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(p264r5.a.q(resourceId2, compoundButton.getContext()));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(p241q.j.CompoundButton_android_button)) {
                        compoundButton.setButtonDrawable(p264r5.a.q(resourceId, compoundButton.getContext()));
                    }
                }
            } else if (typedArray.hasValue(p241q.j.CompoundButton_android_button) && (resourceId = typedArray.getResourceId(p241q.j.CompoundButton_android_button, 0)) != 0) {
                compoundButton.setButtonDrawable(p264r5.a.q(resourceId, compoundButton.getContext()));
            }
            if (typedArray.hasValue(p241q.j.CompoundButton_buttonTint)) {
                compoundButton.setButtonTintList(z0F.a(p241q.j.CompoundButton_buttonTint));
            }
            if (typedArray.hasValue(p241q.j.CompoundButton_buttonTintMode)) {
                compoundButton.setButtonTintMode(AbstractC0859g0.c(typedArray.getInt(p241q.j.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            z0F.g();
        }
    }
}
