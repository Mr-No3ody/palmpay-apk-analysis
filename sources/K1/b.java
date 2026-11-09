package K1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f4899a;

    public final void a() {
        if (this.f4899a) {
            throw new IllegalStateException("Already released");
        }
    }
}
