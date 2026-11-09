package D;

import Gg.i;
import Gg.m;
import Gg.n;
import Hg.g;
import Pg.AbstractC0555b;
import Pg.w;
import Pg.x;
import androidx.camera.camera2.internal.C0944o;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.AbstractC1956y;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.C1930a;
import okhttp3.internal.http2.EnumC1932c;
import okhttp3.internal.http2.L;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1583g;

    public d(i call, AbstractC1956y eventListener, Gg.e finder, ExchangeCodec codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f1579c = call;
        this.f1580d = eventListener;
        this.f1581e = finder;
        this.f1582f = codec;
        this.f1583g = codec.getConnection();
    }

    public IOException a(long j6, boolean z3, boolean z8, IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        AbstractC1956y abstractC1956y = (AbstractC1956y) this.f1580d;
        i iVar = (i) this.f1579c;
        if (z8) {
            if (iOException != null) {
                abstractC1956y.requestFailed(iVar, iOException);
            } else {
                abstractC1956y.requestBodyEnd(iVar, j6);
            }
        }
        if (z3) {
            if (iOException != null) {
                abstractC1956y.responseFailed(iVar, iOException);
            } else {
                abstractC1956y.responseBodyEnd(iVar, j6);
            }
        }
        return iVar.f(this, z8, z3, iOException);
    }

    public Gg.c b(Y request, boolean z3) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f1577a = z3;
        c0 c0Var = request.f40688d;
        Intrinsics.e(c0Var);
        long jContentLength = c0Var.contentLength();
        ((AbstractC1956y) this.f1580d).requestBodyStart((i) this.f1579c);
        return new Gg.c(this, ((ExchangeCodec) this.f1582f).createRequestBody(request, jContentLength), jContentLength);
    }

    public m c() {
        i iVar = (i) this.f1579c;
        if (iVar.f3451p) {
            throw new IllegalStateException("Check failed.");
        }
        iVar.f3451p = true;
        iVar.f3446f.exit();
        n connection = ((ExchangeCodec) this.f1582f).getConnection();
        connection.getClass();
        Intrinsics.checkNotNullParameter(this, "exchange");
        Socket socket = connection.f3464d;
        Intrinsics.e(socket);
        x xVar = connection.f3468h;
        Intrinsics.e(xVar);
        w wVar = connection.f3469i;
        Intrinsics.e(wVar);
        socket.setSoTimeout(0);
        connection.k();
        return new m(xVar, wVar, this);
    }

    public g d(e0 response) throws IOException {
        ExchangeCodec exchangeCodec = (ExchangeCodec) this.f1582f;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strB = response.b(HttpHeaders.CONTENT_TYPE, null);
            long jReportedContentLength = exchangeCodec.reportedContentLength(response);
            return new g(strB, jReportedContentLength, AbstractC0555b.c(new Gg.d(this, exchangeCodec.openResponseBodySource(response), jReportedContentLength)));
        } catch (IOException e10) {
            ((AbstractC1956y) this.f1580d).responseFailed((i) this.f1579c, e10);
            f(e10);
            throw e10;
        }
    }

    public d0 e(boolean z3) throws IOException {
        try {
            d0 responseHeaders = ((ExchangeCodec) this.f1582f).readResponseHeaders(z3);
            if (responseHeaders != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                responseHeaders.f40727m = this;
            }
            return responseHeaders;
        } catch (IOException e10) {
            ((AbstractC1956y) this.f1580d).responseFailed((i) this.f1579c, e10);
            f(e10);
            throw e10;
        }
    }

    public void f(IOException iOException) {
        this.f1578b = true;
        ((Gg.e) this.f1581e).c(iOException);
        n connection = ((ExchangeCodec) this.f1582f).getConnection();
        i call = (i) this.f1579c;
        synchronized (connection) {
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                if (!(iOException instanceof L)) {
                    if (!(connection.f3467g != null) || (iOException instanceof C1930a)) {
                        connection.f3470j = true;
                        if (connection.f3473m == 0) {
                            n.d(call.f3441a, connection.f3462b, iOException);
                            connection.f3472l++;
                        }
                    }
                } else if (((L) iOException).f40801a == EnumC1932c.REFUSED_STREAM) {
                    int i7 = connection.f3474n + 1;
                    connection.f3474n = i7;
                    if (i7 > 1) {
                        connection.f3470j = true;
                        connection.f3472l++;
                    }
                } else if (((L) iOException).f40801a != EnumC1932c.CANCEL || !call.f3438B) {
                    connection.f3470j = true;
                    connection.f3472l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public d(C0944o c0944o, androidx.camera.core.impl.utils.executor.i iVar) {
        this.f1577a = false;
        this.f1578b = false;
        this.f1581e = new Object();
        this.f1582f = new androidx.camera.camera2.impl.a();
        this.f1579c = c0944o;
        this.f1580d = iVar;
    }
}
