package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends p059e1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12911e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12913g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12914i;

    public h1(i1 i1Var, int i7) {
        super(11);
        this.f12914i = i1Var;
        this.f12913g = i7;
        this.f12912f = false;
    }

    @Override // p059e1.a, androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationCancel(View view) {
        switch (this.f12911e) {
            case 0:
                this.f12912f = true;
                break;
        }
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        switch (this.f12911e) {
            case 0:
                if (!this.f12912f) {
                    ((i1) this.f12914i).f12920a.setVisibility(this.f12913g);
                }
                break;
            default:
                int i7 = this.f12913g + 1;
                this.f12913g = i7;
                p343x.g gVar = (p343x.g) this.f12914i;
                if (i7 == gVar.f43547a.size()) {
                    p059e1.a aVar = gVar.f43550d;
                    if (aVar != null) {
                        aVar.onAnimationEnd(null);
                    }
                    this.f12913g = 0;
                    this.f12912f = false;
                    gVar.f43551e = false;
                }
                break;
        }
    }

    @Override // p059e1.a, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        switch (this.f12911e) {
            case 0:
                ((i1) this.f12914i).f12920a.setVisibility(0);
                break;
            default:
                if (!this.f12912f) {
                    this.f12912f = true;
                    p059e1.a aVar = ((p343x.g) this.f12914i).f43550d;
                    if (aVar != null) {
                        aVar.onAnimationStart(null);
                    }
                    break;
                }
                break;
        }
    }

    public h1(p343x.g gVar) {
        super(11);
        this.f12914i = gVar;
        this.f12912f = false;
        this.f12913g = 0;
    }
}
