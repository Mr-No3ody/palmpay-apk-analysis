package Ig;

import C0.G;
import Gg.n;
import Hg.k;
import Pg.p;
import Pg.w;
import Pg.x;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.F;
import okhttp3.J;
import okhttp3.U;
import okhttp3.W;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.internal.http.ExchangeCodec;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements ExchangeCodec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f4440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f4441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f4442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f4443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f4445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F f4446g;

    static {
        new f(null);
    }

    public j(U u6, n connection, x source, w sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f4440a = u6;
        this.f4441b = connection;
        this.f4442c = source;
        this.f4443d = sink;
        this.f4445f = new b(source);
    }

    public static final void a(j jVar, p pVar) {
        jVar.getClass();
        Pg.F f10 = pVar.f7365a;
        Pg.F delegate = Pg.F.NONE;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        pVar.f7365a = delegate;
        f10.clearDeadline();
        f10.clearTimeout();
    }

    public final g b(long j6) {
        if (this.f4444e == 4) {
            this.f4444e = 5;
            return new g(this, j6);
        }
        throw new IllegalStateException(("state: " + this.f4444e).toString());
    }

    public final void c(F headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.f4444e != 0) {
            throw new IllegalStateException(("state: " + this.f4444e).toString());
        }
        w wVar = this.f4443d;
        wVar.writeUtf8(requestLine);
        wVar.writeUtf8("\r\n");
        int size = headers.size();
        for (int i7 = 0; i7 < size; i7++) {
            wVar.writeUtf8(headers.b(i7));
            wVar.writeUtf8(": ");
            wVar.writeUtf8(headers.f(i7));
            wVar.writeUtf8("\r\n");
        }
        wVar.writeUtf8("\r\n");
        this.f4444e = 1;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        Socket socket = this.f4441b.f3463c;
        if (socket != null) {
            Dg.c.d(socket);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Sink createRequestBody(Y request, long j6) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        c0 c0Var = request.f40688d;
        if (c0Var != null && c0Var.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.a(HttpHeaders.TRANSFER_ENCODING))) {
            if (this.f4444e == 1) {
                this.f4444e = 2;
                return new d(this);
            }
            throw new IllegalStateException(("state: " + this.f4444e).toString());
        }
        if (j6 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f4444e == 1) {
            this.f4444e = 2;
            return new h(this);
        }
        throw new IllegalStateException(("state: " + this.f4444e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void finishRequest() {
        this.f4443d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void flushRequest() {
        this.f4443d.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final n getConnection() {
        return this.f4441b;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Source openResponseBodySource(e0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!Hg.e.a(response)) {
            return b(0L);
        }
        if ("chunked".equalsIgnoreCase(response.b(HttpHeaders.TRANSFER_ENCODING, null))) {
            J j6 = response.f40728a.f40685a;
            if (this.f4444e == 4) {
                this.f4444e = 5;
                return new e(this, j6);
            }
            throw new IllegalStateException(("state: " + this.f4444e).toString());
        }
        long jK = Dg.c.k(response);
        if (jK != -1) {
            return b(jK);
        }
        if (this.f4444e == 4) {
            this.f4444e = 5;
            this.f4441b.k();
            return new i(this);
        }
        throw new IllegalStateException(("state: " + this.f4444e).toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final d0 readResponseHeaders(boolean z3) {
        b bVar = this.f4445f;
        int i7 = this.f4444e;
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(("state: " + this.f4444e).toString());
        }
        try {
            Hg.j jVar = k.f3948d;
            String utf8LineStrict = bVar.f4421a.readUtf8LineStrict(bVar.f4422b);
            bVar.f4422b -= (long) utf8LineStrict.length();
            k kVar = jVar.parse(utf8LineStrict);
            d0 d0Var = new d0();
            W protocol = kVar.f3949a;
            int i10 = kVar.f3950b;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            d0Var.f40716b = protocol;
            d0Var.f40717c = i10;
            String message = kVar.f3951c;
            Intrinsics.checkNotNullParameter(message, "message");
            d0Var.f40718d = message;
            F1.b bVar2 = new F1.b(3);
            while (true) {
                String utf8LineStrict2 = bVar.f4421a.readUtf8LineStrict(bVar.f4422b);
                bVar.f4422b -= (long) utf8LineStrict2.length();
                if (utf8LineStrict2.length() == 0) {
                    break;
                }
                bVar2.c(utf8LineStrict2);
            }
            d0Var.c(bVar2.h());
            if (z3 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f4444e = 3;
                return d0Var;
            }
            if (102 > i10 || i10 >= 200) {
                this.f4444e = 4;
                return d0Var;
            }
            this.f4444e = 3;
            return d0Var;
        } catch (EOFException e10) {
            throw new IOException(G.o("unexpected end of stream on ", this.f4441b.f3462b.f40761a.f40702i.i()), e10);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long reportedContentLength(e0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!Hg.e.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(response.b(HttpHeaders.TRANSFER_ENCODING, null))) {
            return -1L;
        }
        return Dg.c.k(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final F trailers() {
        if (this.f4444e != 6) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        F f10 = this.f4446g;
        return f10 == null ? Dg.c.f1880b : f10;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void writeRequestHeaders(Y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f4441b.f3462b.f40762b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f40686b);
        sb2.append(' ');
        J url = request.f40685a;
        if (url.f40588j || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url, "url");
            String strB = url.b();
            String strD = url.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb2.append(strB);
        } else {
            sb2.append(url);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        c(request.f40687c, string);
    }
}
