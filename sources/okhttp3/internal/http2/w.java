package okhttp3.internal.http2;

import com.palmpay.lib.webview.cache.service.impl.net.BaseRequest;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.U;
import okhttp3.W;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.internal.http.ExchangeCodec;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements ExchangeCodec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f40894g = new v(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f40895h = Dg.c.l("connection", "host", BaseRequest.HEAD_VALUE_CONNECTION_KEEP_ALIVE, "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f40896i = Dg.c.l("connection", "host", BaseRequest.HEAD_VALUE_CONNECTION_KEEP_ALIVE, "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gg.n f40897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hg.f f40898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f40899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile E f40900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W f40901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f40902f;

    public w(U client, Gg.n connection, Hg.f chain, u http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f40897a = connection;
        this.f40898b = chain;
        this.f40899c = http2Connection;
        W w3 = W.H2_PRIOR_KNOWLEDGE;
        this.f40901e = client.f40648M.contains(w3) ? w3 : W.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f40902f = true;
        E e10 = this.f40900d;
        if (e10 != null) {
            e10.e(EnumC1932c.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Sink createRequestBody(Y request, long j6) {
        Intrinsics.checkNotNullParameter(request, "request");
        E e10 = this.f40900d;
        Intrinsics.e(e10);
        return e10.f();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void finishRequest() {
        E e10 = this.f40900d;
        Intrinsics.e(e10);
        e10.f().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void flushRequest() {
        this.f40899c.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Gg.n getConnection() {
        return this.f40897a;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Source openResponseBodySource(e0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        E e10 = this.f40900d;
        Intrinsics.e(e10);
        return e10.f40784i;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final d0 readResponseHeaders(boolean z3) throws IOException {
        okhttp3.F f10;
        E e10 = this.f40900d;
        if (e10 == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (e10) {
            e10.f40786k.enter();
            while (e10.f40782g.isEmpty() && e10.f40788m == null) {
                try {
                    e10.k();
                } catch (Throwable th) {
                    e10.f40786k.a();
                    throw th;
                }
            }
            e10.f40786k.a();
            if (e10.f40782g.isEmpty()) {
                IOException iOException = e10.f40789n;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC1932c enumC1932c = e10.f40788m;
                Intrinsics.e(enumC1932c);
                throw new L(enumC1932c);
            }
            Object objRemoveFirst = e10.f40782g.removeFirst();
            Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "headersQueue.removeFirst()");
            f10 = (okhttp3.F) objRemoveFirst;
        }
        d0 http2HeadersList = f40894g.readHttp2HeadersList(f10, this.f40901e);
        if (z3 && http2HeadersList.f40717c == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long reportedContentLength(e0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (Hg.e.a(response)) {
            return Dg.c.k(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final okhttp3.F trailers() throws IOException {
        okhttp3.F f10;
        E e10 = this.f40900d;
        Intrinsics.e(e10);
        synchronized (e10) {
            C c6 = e10.f40784i;
            if (!c6.f40769b || !c6.f40770c.exhausted() || !e10.f40784i.f40771d.exhausted()) {
                if (e10.f40788m == null) {
                    throw new IllegalStateException("too early; can't read the trailers yet");
                }
                IOException iOException = e10.f40789n;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC1932c enumC1932c = e10.f40788m;
                Intrinsics.e(enumC1932c);
                throw new L(enumC1932c);
            }
            f10 = e10.f40784i.f40772e;
            if (f10 == null) {
                f10 = Dg.c.f1880b;
            }
        }
        return f10;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void writeRequestHeaders(Y request) throws IOException {
        int i7;
        E e10;
        boolean z3 = true;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f40900d != null) {
            return;
        }
        boolean z8 = request.f40688d != null;
        List<C1934e> requestHeaders = f40894g.http2HeadersList(request);
        u uVar = this.f40899c;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z10 = !z8;
        synchronized (uVar.f40878Y) {
            synchronized (uVar) {
                try {
                    if (uVar.f40884e > 1073741823) {
                        uVar.e(EnumC1932c.REFUSED_STREAM);
                    }
                    if (uVar.f40885f) {
                        throw new C1930a();
                    }
                    i7 = uVar.f40884e;
                    uVar.f40884e = i7 + 2;
                    e10 = new E(i7, uVar, z10, false, null);
                    if (z8 && uVar.f40875M < uVar.f40876Q && e10.f40780e < e10.f40781f) {
                        z3 = false;
                    }
                    if (e10.h()) {
                        uVar.f40881b.put(Integer.valueOf(i7), e10);
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            uVar.f40878Y.e(i7, requestHeaders, z10);
        }
        if (z3) {
            uVar.f40878Y.flush();
        }
        this.f40900d = e10;
        if (this.f40902f) {
            E e11 = this.f40900d;
            Intrinsics.e(e11);
            e11.e(EnumC1932c.CANCEL);
            throw new IOException("Canceled");
        }
        E e12 = this.f40900d;
        Intrinsics.e(e12);
        D d2 = e12.f40786k;
        long j6 = this.f40898b.f3940g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d2.timeout(j6, timeUnit);
        E e13 = this.f40900d;
        Intrinsics.e(e13);
        e13.f40787l.timeout(this.f40898b.f3941h, timeUnit);
    }
}
