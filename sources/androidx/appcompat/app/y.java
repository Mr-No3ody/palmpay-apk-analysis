package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.Z0;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;

/* JADX INFO: loaded from: classes.dex */
public final class y implements ActionBarDrawerToggle$Delegate, ViewPropertyAnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f12329a;

    public /* synthetic */ y(Object obj) {
        this.f12329a = obj;
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public Context getActionBarThemedContext() {
        return ((I) this.f12329a).z();
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public Drawable getThemeUpIndicator() {
        Z0 z0E = Z0.e(((I) this.f12329a).z(), null, new int[]{p241q.a.homeAsUpIndicator});
        Drawable drawableB = z0E.b(0);
        z0E.g();
        return drawableB;
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public boolean isNavigationVisible() {
        I i7 = (I) this.f12329a;
        i7.C();
        AbstractC0824b abstractC0824b = i7.f12110A;
        return (abstractC0824b == null || (abstractC0824b.e() & 4) == 0) ? false : true;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorUpdateListener
    public void onAnimationUpdate(View view) {
        ((View) ((X) this.f12329a).f12190d.getParent()).invalidate();
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public void setActionBarDescription(int i7) {
        I i10 = (I) this.f12329a;
        i10.C();
        AbstractC0824b abstractC0824b = i10.f12110A;
        if (abstractC0824b != null) {
            abstractC0824b.r(i7);
        }
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle$Delegate
    public void setActionBarUpIndicator(Drawable drawable, int i7) {
        I i10 = (I) this.f12329a;
        i10.C();
        AbstractC0824b abstractC0824b = i10.f12110A;
        if (abstractC0824b != null) {
            abstractC0824b.s(drawable);
            abstractC0824b.r(i7);
        }
    }
}
