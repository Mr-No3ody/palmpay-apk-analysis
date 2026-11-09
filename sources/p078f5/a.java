package p078f5;

import com.growingio.android.sdk.track.async.Disposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f36402b;

    static {
        a aVar = new a("INSTANCE", 0);
        f36401a = aVar;
        f36402b = new a[]{aVar};
    }

    public static a valueOf(String name) {
        return (a) Enum.valueOf(a.class, name);
    }

    public static a[] values() {
        return (a[]) f36402b.clone();
    }

    @Override // com.growingio.android.sdk.track.async.Disposable
    public final boolean isDisposed() {
        return this == f36401a;
    }

    @Override // com.growingio.android.sdk.track.async.Disposable
    public final void dispose() {
    }
}
