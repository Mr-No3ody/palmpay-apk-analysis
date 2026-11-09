package androidx.camera.core.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14201a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14204d;

    public /* synthetic */ e(androidx.concurrent.futures.k kVar, ListenableFuture listenableFuture, long j6) {
        this.f14203c = kVar;
        this.f14204d = listenableFuture;
        this.f14202b = j6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14201a) {
            case 0:
                return Boolean.valueOf(((androidx.concurrent.futures.k) this.f14203c).d(new TimeoutException("Future[" + ((ListenableFuture) this.f14204d) + "] is not done within " + this.f14202b + " ms.")));
            default:
                return ((CrashlyticsCore) this.f14203c).lambda$log$3(this.f14202b, (String) this.f14204d);
        }
    }

    public /* synthetic */ e(CrashlyticsCore crashlyticsCore, long j6, String str) {
        this.f14203c = crashlyticsCore;
        this.f14202b = j6;
        this.f14204d = str;
    }
}
