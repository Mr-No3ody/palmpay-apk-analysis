package androidx.concurrent.futures;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f15039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f15040d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationException f15042b;

    static {
        if (j.GENERATE_CANCELLATION_CAUSES) {
            f15040d = null;
            f15039c = null;
        } else {
            f15040d = new b(false, null);
            f15039c = new b(true, null);
        }
    }

    public b(boolean z3, CancellationException cancellationException) {
        this.f15041a = z3;
        this.f15042b = cancellationException;
    }
}
