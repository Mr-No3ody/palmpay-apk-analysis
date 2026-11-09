package E;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: E.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0218x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f2136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2137d;

    public C0218x(C0217w c0217w) {
        this.f2134a = Collections.unmodifiableList(c0217w.f2130a);
        this.f2135b = Collections.unmodifiableList(c0217w.f2131b);
        this.f2136c = Collections.unmodifiableList(c0217w.f2132c);
        this.f2137d = c0217w.f2133d;
    }
}
