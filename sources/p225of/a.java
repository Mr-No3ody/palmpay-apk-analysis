package p225of;

import io.reactivex.internal.fuseable.QueueSubscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements QueueSubscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f40538b;

    static {
        a aVar = new a("INSTANCE", 0);
        f40537a = aVar;
        f40538b = new a[]{aVar};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f40538b.clone();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        b.c(j6);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i7) {
        return i7 & 2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }
}
