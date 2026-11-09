package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0887v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatCheckedTextView f13013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f13014b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f13015c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13016d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13017e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13018f;

    public C0887v(AppCompatCheckedTextView appCompatCheckedTextView) {
        this.f13013a = appCompatCheckedTextView;
    }

    public final void a() {
        AppCompatCheckedTextView appCompatCheckedTextView = this.f13013a;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f13016d || this.f13017e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f13016d) {
                    drawableMutate.setTintList(this.f13014b);
                }
                if (this.f13017e) {
                    drawableMutate.setTintMode(this.f13015c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
