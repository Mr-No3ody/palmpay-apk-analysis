package retrofit2;

import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.Z;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;

/* JADX INFO: renamed from: retrofit2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2002u implements Call {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f41955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f41957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final okhttp3.Call.Factory f41958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Converter f41959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f41960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public okhttp3.Call f41961g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Throwable f41962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41963j;

    public C2002u(J j6, Object obj, Object[] objArr, okhttp3.Call.Factory factory, Converter converter) {
        this.f41955a = j6;
        this.f41956b = obj;
        this.f41957c = objArr;
        this.f41958d = factory;
        this.f41959e = converter;
    }

    public final okhttp3.Call a() {
        okhttp3.J url;
        J j6 = this.f41955a;
        Object[] objArr = this.f41957c;
        int length = objArr.length;
        U[] uArr = j6.f41871k;
        if (length != uArr.length) {
            throw new IllegalArgumentException(C0.G.n(uArr.length, ")", androidx.camera.camera2.internal.F.e(length, "Argument count (", ") doesn't match expected count (")));
        }
        H h7 = new H(j6.f41864d, j6.f41863c, j6.f41865e, j6.f41866f, j6.f41867g, j6.f41868h, j6.f41869i, j6.f41870j);
        if (j6.f41872l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            arrayList.add(objArr[i7]);
            uArr[i7].a(h7, objArr[i7]);
        }
        okhttp3.H h10 = h7.f41828d;
        if (h10 != null) {
            url = h10.b();
        } else {
            String str = h7.f41827c;
            okhttp3.J j10 = h7.f41826b;
            url = j10.j(str);
            if (url == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + j10 + ", Relative: " + h7.f41827c);
            }
        }
        c0 z3 = h7.f41835k;
        if (z3 == null) {
            androidx.work.impl.model.b bVar = h7.f41834j;
            if (bVar != null) {
                z3 = new okhttp3.A((ArrayList) bVar.f18580b, (ArrayList) bVar.f18581c);
            } else {
                okhttp3.M m7 = h7.f41833i;
                if (m7 != null) {
                    ArrayList arrayList2 = m7.f40598c;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    z3 = new okhttp3.Q(m7.f40596a, m7.f40597b, Dg.c.y(arrayList2));
                } else if (h7.f41832h) {
                    z3 = c0.create((okhttp3.L) null, new byte[0]);
                }
            }
        }
        okhttp3.L l5 = h7.f41831g;
        F1.b bVar2 = h7.f41830f;
        if (l5 != null) {
            if (z3 != null) {
                z3 = new Z(z3, l5);
            } else {
                bVar2.b(HttpHeaders.CONTENT_TYPE, l5.f40592a);
            }
        }
        X x3 = h7.f41829e;
        x3.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        x3.f40680a = url;
        x3.f(bVar2.h());
        x3.g(h7.f41825a, z3);
        x3.j(C1998p.class, new C1998p(j6.f41861a, this.f41956b, j6.f41862b, arrayList));
        okhttp3.Call callNewCall = this.f41958d.newCall(x3.b());
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final okhttp3.Call b() throws IOException {
        okhttp3.Call call = this.f41961g;
        if (call != null) {
            return call;
        }
        Throwable th = this.f41962i;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.Call callA = a();
            this.f41961g = callA;
            return callA;
        } catch (IOException | Error | RuntimeException e10) {
            U.s(e10);
            this.f41962i = e10;
            throw e10;
        }
    }

    public final K c(e0 e0Var) throws IOException {
        h0 h0Var = e0Var.f40734g;
        d0 d0VarC = e0Var.c();
        d0VarC.f40721g = new C2001t(h0Var.contentType(), h0Var.contentLength());
        e0 e0VarA = d0VarC.a();
        int i7 = e0VarA.f40731d;
        if (i7 < 200 || i7 >= 300) {
            try {
                Pg.k kVar = new Pg.k();
                h0Var.source().readAll(kVar);
                h0 h0VarCreate = h0.create(h0Var.contentType(), h0Var.contentLength(), kVar);
                Objects.requireNonNull(h0VarCreate, "body == null");
                if (e0VarA.isSuccessful()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                K k2 = new K(e0VarA, null, h0VarCreate);
                h0Var.close();
                return k2;
            } catch (Throwable th) {
                h0Var.close();
                throw th;
            }
        }
        if (i7 == 204 || i7 == 205) {
            h0Var.close();
            if (e0VarA.isSuccessful()) {
                return new K(e0VarA, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        C2000s c2000s = new C2000s(h0Var);
        try {
            Object objConvert = this.f41959e.convert(c2000s);
            if (e0VarA.isSuccessful()) {
                return new K(e0VarA, objConvert, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e10) {
            IOException iOException = c2000s.f41952c;
            if (iOException == null) {
                throw e10;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.Call
    public final void cancel() {
        okhttp3.Call call;
        this.f41960f = true;
        synchronized (this) {
            call = this.f41961g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() {
        return new C2002u(this.f41955a, this.f41956b, this.f41957c, this.f41958d, this.f41959e);
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) {
        okhttp3.Call call;
        Throwable th;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.f41963j) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f41963j = true;
                call = this.f41961g;
                th = this.f41962i;
                if (call == null && th == null) {
                    try {
                        okhttp3.Call callA = a();
                        this.f41961g = callA;
                        call = callA;
                    } catch (Throwable th2) {
                        th = th2;
                        U.s(th);
                        this.f41962i = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.f41960f) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new androidx.work.impl.model.b(this, 20, callback, false));
    }

    @Override // retrofit2.Call
    public final K execute() {
        okhttp3.Call callB;
        synchronized (this) {
            if (this.f41963j) {
                throw new IllegalStateException("Already executed.");
            }
            this.f41963j = true;
            callB = b();
        }
        if (this.f41960f) {
            callB.cancel();
        }
        return c(FirebasePerfOkHttpClient.execute(callB));
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        boolean z3 = true;
        if (this.f41960f) {
            return true;
        }
        synchronized (this) {
            try {
                okhttp3.Call call = this.f41961g;
                if (call == null || !call.isCanceled()) {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // retrofit2.Call
    public final synchronized boolean isExecuted() {
        return this.f41963j;
    }

    @Override // retrofit2.Call
    public final synchronized Y request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().request();
    }

    @Override // retrofit2.Call
    public final synchronized Pg.F timeout() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create call.", e10);
        }
        return b().timeout();
    }

    @Override // retrofit2.Call
    /* JADX INFO: renamed from: clone */
    public final Call mo136clone() {
        return new C2002u(this.f41955a, this.f41956b, this.f41957c, this.f41958d, this.f41959e);
    }
}
