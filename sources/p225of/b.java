package p225of;

import Yf.z;
import androidx.camera.video.u;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p147jf.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f40539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f40540b;

    static {
        b bVar = new b("CANCELLED", 0);
        f40539a = bVar;
        f40540b = new b[]{bVar};
    }

    public static void a(AtomicReference atomicReference) {
        Subscription subscription;
        Subscription subscription2 = (Subscription) atomicReference.get();
        b bVar = f40539a;
        if (subscription2 == bVar || (subscription = (Subscription) atomicReference.getAndSet(bVar)) == bVar || subscription == null) {
            return;
        }
        subscription.cancel();
    }

    public static boolean b(AtomicReference atomicReference, Subscription subscription) {
        a.a(subscription, "s is null");
        while (!atomicReference.compareAndSet(null, subscription)) {
            if (atomicReference.get() != null) {
                subscription.cancel();
                if (atomicReference.get() == f40539a) {
                    return false;
                }
                org.chromium.support_lib_boundary.util.b.V(new z("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean c(long j6) {
        if (j6 > 0) {
            return true;
        }
        org.chromium.support_lib_boundary.util.b.V(new IllegalArgumentException(u.i(j6, "n > 0 required but it was ")));
        return false;
    }

    public static boolean d(Subscription subscription, Subscription subscription2) {
        if (subscription2 == null) {
            org.chromium.support_lib_boundary.util.b.V(new NullPointerException("next is null"));
            return false;
        }
        if (subscription == null) {
            return true;
        }
        subscription2.cancel();
        org.chromium.support_lib_boundary.util.b.V(new z("Subscription already set!"));
        return false;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f40540b.clone();
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
    }
}
