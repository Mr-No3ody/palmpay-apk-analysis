package S;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f8626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.helper.widget.a f8627b;

    public a(androidx.constraintlayout.helper.widget.a aVar, float f10) {
        this.f8627b = aVar;
        this.f8626a = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8627b.f15185a.f15131C.w(1.0f, this.f8626a, 5);
    }
}
