package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1948p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gg.p f40970a;

    public C1948p(int i7, long j6) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Gg.p delegate = new Gg.p(Fg.d.f2846i, i7, j6);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f40970a = delegate;
    }
}
