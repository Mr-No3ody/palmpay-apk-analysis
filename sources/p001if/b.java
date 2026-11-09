package p001if;

import io.reactivex.internal.fuseable.QueueDisposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements QueueDisposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f37587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f37588b;

    static {
        b bVar = new b("INSTANCE", 0);
        f37587a = bVar;
        f37588b = new b[]{bVar, new b("NEVER", 1)};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f37588b.clone();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this == f37587a;
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

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i7) {
        return i7 & 2;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }
}
