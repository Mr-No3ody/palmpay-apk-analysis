package p317v0;

import android.view.View;
import p059e1.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f43019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f43020f;

    public c(a aVar, a aVar2) {
        super(19);
        this.f43019e = aVar;
        this.f43020f = aVar2;
    }

    @Override // p059e1.a
    public final int o(View view, int i7, int i10) {
        return (view.getLayoutDirection() == 1 ? this.f43020f : this.f43019e).o(view, i7, i10);
    }

    @Override // p059e1.a
    public final String r() {
        return "SWITCHING[L:" + this.f43019e.r() + ", R:" + this.f43020f.r() + "]";
    }

    @Override // p059e1.a
    public final int u(int i7, View view) {
        return (view.getLayoutDirection() == 1 ? this.f43020f : this.f43019e).u(i7, view);
    }
}
