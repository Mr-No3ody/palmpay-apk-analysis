package p298tf;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42624a;

    public /* synthetic */ b(int i7) {
        this.f42624a = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f42624a) {
            case 0:
                return a.f42623a;
            case 1:
                return c.f42625a;
            case 2:
                return d.f42626a;
            default:
                return e.f42627a;
        }
    }
}
