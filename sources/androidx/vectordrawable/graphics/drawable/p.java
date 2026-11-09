package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class p extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f18211a;

    public p(Drawable.ConstantState constantState) {
        this.f18211a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f18211a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f18211a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        q qVar = new q();
        qVar.f18157a = (VectorDrawable) this.f18211a.newDrawable();
        return qVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        q qVar = new q();
        qVar.f18157a = (VectorDrawable) this.f18211a.newDrawable(resources);
        return qVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        q qVar = new q();
        qVar.f18157a = (VectorDrawable) this.f18211a.newDrawable(resources, theme);
        return qVar;
    }
}
