package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import E.C0218x;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0968a0;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0953t implements AsyncFunction, CallbackToFutureAdapter$Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13649c;

    public /* synthetic */ C0953t(int i7, Object obj, Object obj2) {
        this.f13647a = i7;
        this.f13648b = obj;
        this.f13649c = obj2;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        switch (this.f13647a) {
            case 0:
                C0962x0 c0962x0 = (C0962x0) this.f13648b;
                c0962x0.close();
                ((E.j0) this.f13649c).a();
                return c0962x0.release(false);
            case 1:
            default:
                List list = (List) obj;
                ((b1) this.f13648b).toString();
                Objects.toString(list);
                p140j8.f.G("SyncCaptureSessionBase");
                if (list.isEmpty()) {
                    return new androidx.camera.core.impl.utils.futures.l(new IllegalArgumentException("Unable to open capture session without surfaces"), 1);
                }
                if (!list.contains(null)) {
                    return androidx.camera.core.impl.utils.futures.j.d(list);
                }
                return new androidx.camera.core.impl.utils.futures.l(new C0968a0("Surface closed", (AbstractC0970b0) ((List) this.f13649c).get(list.indexOf(null))), 1);
            case 2:
                C0923d0 c0923d0 = (C0923d0) this.f13648b;
                return AbstractC0198c.y(new androidx.camera.core.impl.utils.futures.c((androidx.concurrent.futures.m) this.f13649c, c0923d0.f13499c, TimeUnit.SECONDS.toMillis(3L), 1));
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        switch (this.f13647a) {
            case 1:
                org.chromium.support_lib_boundary.util.b.S().execute(new G0((C0923d0) this.f13648b, (AtomicReference) this.f13649c, kVar));
                return "OnScreenFlashStart";
            default:
                K0 k2 = (K0) this.f13648b;
                k2.getClass();
                k2.f13204b.execute(new G0(k2, 0, kVar, (C0218x) this.f13649c));
                return "startFocusAndMetering";
        }
    }
}
