package R;

import androidx.constraintlayout.core.widgets.analyzer.Dependency;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7884m;

    public f(n nVar) {
        super(nVar);
        if (nVar instanceof j) {
            this.f7876e = 2;
        } else {
            this.f7876e = 3;
        }
    }

    @Override // R.e
    public final void c(int i7) {
        if (this.f7881j) {
            return;
        }
        this.f7881j = true;
        this.f7878g = i7;
        for (Dependency dependency : this.f7882k) {
            dependency.update(dependency);
        }
    }
}
