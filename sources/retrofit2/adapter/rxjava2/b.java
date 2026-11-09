package retrofit2.adapter.rxjava2;

import io.reactivex.disposables.Disposable;
import retrofit2.Call;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call f41907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f41908b;

    public b(Call call) {
        this.f41907a = call;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f41908b = true;
        this.f41907a.cancel();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f41908b;
    }
}
