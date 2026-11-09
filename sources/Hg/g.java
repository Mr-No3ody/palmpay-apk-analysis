package Hg;

import Pg.x;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.L;
import okhttp3.h0;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3943a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSource f3946d;

    public g(String str, long j6, x source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f3945c = str;
        this.f3944b = j6;
        this.f3946d = source;
    }

    @Override // okhttp3.h0
    public final long contentLength() {
        switch (this.f3943a) {
            case 0:
                break;
        }
        return this.f3944b;
    }

    @Override // okhttp3.h0
    public final L contentType() {
        switch (this.f3943a) {
            case 0:
                String str = (String) this.f3945c;
                if (str != null) {
                    return L.f40589e.parse(str);
                }
                return null;
            default:
                return (L) this.f3945c;
        }
    }

    @Override // okhttp3.h0
    public final BufferedSource source() {
        switch (this.f3943a) {
            case 0:
                return (x) this.f3946d;
            default:
                return this.f3946d;
        }
    }

    public g(L l5, long j6, BufferedSource bufferedSource) {
        this.f3945c = l5;
        this.f3944b = j6;
        this.f3946d = bufferedSource;
    }
}
