package retrofit2;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: retrofit2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1987e extends CompletableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Call f41927a;

    public C1987e(Call call) {
        this.f41927a = call;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        if (z3) {
            this.f41927a.cancel();
        }
        return super.cancel(z3);
    }
}
