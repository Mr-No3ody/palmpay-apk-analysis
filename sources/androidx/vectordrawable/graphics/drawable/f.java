package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18151b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f18150a = i7;
        this.f18151b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f18150a) {
            case 0:
                return ((Drawable.ConstantState) this.f18151b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f18150a) {
            case 0:
                return ((Drawable.ConstantState) this.f18151b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f18150a) {
            case 0:
                g gVar = new g(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f18151b).newDrawable();
                gVar.f18157a = drawableNewDrawable;
                drawableNewDrawable.setCallback(gVar.f18156f);
                return gVar;
            default:
                return new com.bumptech.glide.load.resource.gif.d(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f18150a) {
            case 0:
                g gVar = new g(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f18151b).newDrawable(resources);
                gVar.f18157a = drawableNewDrawable;
                drawableNewDrawable.setCallback(gVar.f18156f);
                return gVar;
            default:
                return new com.bumptech.glide.load.resource.gif.d(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f18150a) {
            case 0:
                g gVar = new g(null);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f18151b).newDrawable(resources, theme);
                gVar.f18157a = drawableNewDrawable;
                drawableNewDrawable.setCallback(gVar.f18156f);
                return gVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
