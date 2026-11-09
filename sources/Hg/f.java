package Hg;

import Gg.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Interceptor.Chain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gg.i f3934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D.d f3937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y f3938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3942i;

    public f(Gg.i call, ArrayList interceptors, int i7, D.d dVar, Y request, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f3934a = call;
        this.f3935b = interceptors;
        this.f3936c = i7;
        this.f3937d = dVar;
        this.f3938e = request;
        this.f3939f = i10;
        this.f3940g = i11;
        this.f3941h = i12;
    }

    public static f a(f fVar, int i7, D.d dVar, Y y8, int i10, int i11, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i7 = fVar.f3936c;
        }
        int i14 = i7;
        if ((i13 & 2) != 0) {
            dVar = fVar.f3937d;
        }
        D.d dVar2 = dVar;
        if ((i13 & 4) != 0) {
            y8 = fVar.f3938e;
        }
        Y request = y8;
        if ((i13 & 8) != 0) {
            i10 = fVar.f3939f;
        }
        int i15 = i10;
        if ((i13 & 16) != 0) {
            i11 = fVar.f3940g;
        }
        int i16 = i11;
        int i17 = (i13 & 32) != 0 ? fVar.f3941h : i12;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new f(fVar.f3934a, fVar.f3935b, i14, dVar2, request, i15, i16, i17);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Call call() {
        return this.f3934a;
    }

    @Override // okhttp3.Interceptor.Chain
    public final int connectTimeoutMillis() {
        return this.f3939f;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Connection connection() {
        D.d dVar = this.f3937d;
        if (dVar != null) {
            return (n) dVar.f1583g;
        }
        return null;
    }

    @Override // okhttp3.Interceptor.Chain
    public final e0 proceed(Y request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f3935b;
        int size = arrayList.size();
        int i7 = this.f3936c;
        if (i7 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3942i++;
        D.d dVar = this.f3937d;
        if (dVar != null) {
            if (!((Gg.e) dVar.f1581e).b(request.f40685a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must retain the same host and port").toString());
            }
            if (this.f3942i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i10 = i7 + 1;
        f fVarA = a(this, i10, null, request, 0, 0, 0, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i7);
        e0 e0VarIntercept = interceptor.intercept(fVarA);
        if (e0VarIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (dVar != null && i10 < arrayList.size() && fVarA.f3942i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (e0VarIntercept.f40734g != null) {
            return e0VarIntercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public final int readTimeoutMillis() {
        return this.f3940g;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Y request() {
        return this.f3938e;
    }

    @Override // okhttp3.Interceptor.Chain
    public final Interceptor.Chain withConnectTimeout(int i7, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f3937d == null) {
            return a(this, 0, null, null, Dg.c.b("connectTimeout", i7, unit), 0, 0, 55);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.Chain
    public final Interceptor.Chain withReadTimeout(int i7, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f3937d == null) {
            return a(this, 0, null, null, 0, Dg.c.b("readTimeout", i7, unit), 0, 47);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.Chain
    public final Interceptor.Chain withWriteTimeout(int i7, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f3937d == null) {
            return a(this, 0, null, null, 0, 0, Dg.c.b("writeTimeout", i7, unit), 31);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.Chain
    public final int writeTimeoutMillis() {
        return this.f3941h;
    }
}
