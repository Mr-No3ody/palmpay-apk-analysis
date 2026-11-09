package p314uf;

import E.ThreadFactoryC0208m;
import com.didiglobal.booster.instrument.ShadowExecutors;
import java.util.concurrent.ExecutorService;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: Fake field, exist only in values array */
    a EF5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f42994b = {new a("INSTANCE", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f42993a = ShadowExecutors.newOptimizedCachedThreadPool(new ThreadFactoryC0208m(3), "\u200bj.a");

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f42994b.clone();
    }
}
