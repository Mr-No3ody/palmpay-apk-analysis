package Ng;

import C0.G;
import Gg.m;
import Pg.r;
import androidx.camera.video.u;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.W;
import okhttp3.WebSocket;
import okhttp3.Y;
import okhttp3.e0;
import okhttp3.internal.ws.WebSocketReader$FrameCallback;
import okhttp3.l0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements WebSocket, WebSocketReader$FrameCallback {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f6406x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f6407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f6408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Random f6409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f6411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Gg.i f6414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f6415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f6416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f6417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Fg.b f6418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f6419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m f6420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayDeque f6421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f6422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6425s;
    public String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f6426u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6427v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6428w;

    static {
        new d(null);
        f6406x = C1849p.c(W.HTTP_1_1);
    }

    public h(Fg.d taskRunner, Y originalRequest, l0 listener, Random random, long j6, long j10) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f6407a = originalRequest;
        this.f6408b = listener;
        this.f6409c = random;
        this.f6410d = j6;
        this.f6411e = null;
        this.f6412f = j10;
        this.f6418l = taskRunner.e();
        this.f6421o = new ArrayDeque();
        this.f6422p = new ArrayDeque();
        this.f6425s = -1;
        if (!"GET".equals(originalRequest.f40686b)) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.f40686b).toString());
        }
        Pg.l lVar = Pg.m.f7359d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.f38893a;
        this.f6413g = Pg.l.of$default(lVar, bArr, 0, 0, 3, null).a();
    }

    public final void a(e0 response, D.d dVar) {
        Intrinsics.checkNotNullParameter(response, "response");
        int i7 = response.f40731d;
        if (i7 != 101) {
            StringBuilder sb2 = new StringBuilder("Expected HTTP 101 response but was '");
            sb2.append(i7);
            sb2.append(' ');
            throw new ProtocolException(u.p(sb2, response.f40730c, '\''));
        }
        String strB = response.b("Connection", null);
        if (!HttpHeaders.UPGRADE.equalsIgnoreCase(strB)) {
            throw new ProtocolException(G.l('\'', "Expected 'Connection' header value 'Upgrade' but was '", strB));
        }
        String strB2 = response.b(HttpHeaders.UPGRADE, null);
        if (!"websocket".equalsIgnoreCase(strB2)) {
            throw new ProtocolException(G.l('\'', "Expected 'Upgrade' header value 'websocket' but was '", strB2));
        }
        String strB3 = response.b(HttpHeaders.SEC_WEBSOCKET_ACCEPT, null);
        String strA = Pg.m.f7359d.encodeUtf8(this.f6413g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").c("SHA-1").a();
        if (Intrinsics.c(strA, strB3)) {
            if (dVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strB3 + '\'');
    }

    public final void b(Exception e10, e0 e0Var) {
        Intrinsics.checkNotNullParameter(e10, "e");
        synchronized (this) {
            if (this.f6426u) {
                return;
            }
            this.f6426u = true;
            m mVar = this.f6420n;
            this.f6420n = null;
            k kVar = this.f6416j;
            this.f6416j = null;
            l lVar = this.f6417k;
            this.f6417k = null;
            this.f6418l.f();
            Unit unit = Unit.f38893a;
            try {
                this.f6408b.onFailure(this, e10, e0Var);
            } finally {
                if (mVar != null) {
                    Dg.c.c(mVar);
                }
                if (kVar != null) {
                    Dg.c.c(kVar);
                }
                if (lVar != null) {
                    Dg.c.c(lVar);
                }
            }
        }
    }

    public final void c(String name, m streams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        j jVar = this.f6411e;
        Intrinsics.e(jVar);
        synchronized (this) {
            try {
                this.f6419m = name;
                this.f6420n = streams;
                this.f6417k = new l(streams.f3460b, this.f6409c, jVar.f6430a, jVar.f6432c, this.f6412f);
                this.f6415i = new f(this);
                long j6 = this.f6410d;
                if (j6 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j6);
                    this.f6418l.c(new g(name + " ping", this, nanos), nanos);
                }
                if (!this.f6422p.isEmpty()) {
                    e();
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6416j = new k(streams.f3459a, this, jVar.f6430a, jVar.f6434e);
    }

    @Override // okhttp3.WebSocket
    public final void cancel() {
        Gg.i iVar = this.f6414h;
        Intrinsics.e(iVar);
        iVar.cancel();
    }

    @Override // okhttp3.WebSocket
    public final boolean close(int i7, String str) {
        String str2;
        synchronized (this) {
            Pg.m mVarEncodeUtf8 = null;
            try {
                if (i7 < 1000 || i7 >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i7;
                } else if ((1004 > i7 || i7 >= 1007) && (1015 > i7 || i7 >= 3000)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i7 + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    mVarEncodeUtf8 = Pg.m.f7359d.encodeUtf8(str);
                    if (mVarEncodeUtf8.d() > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.f6426u && !this.f6424r) {
                    this.f6424r = true;
                    this.f6422p.add(new c(mVarEncodeUtf8, i7));
                    e();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        while (this.f6425s == -1) {
            k kVar = this.f6416j;
            Intrinsics.e(kVar);
            kVar.b();
            if (kVar.f6444j) {
                kVar.a();
            } else {
                int i7 = kVar.f6441f;
                if (i7 != 1 && i7 != 2) {
                    StringBuilder sb2 = new StringBuilder("Unknown opcode: ");
                    byte[] bArr = Dg.c.f1879a;
                    String hexString = Integer.toHexString(i7);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    sb2.append(hexString);
                    throw new ProtocolException(sb2.toString());
                }
                while (true) {
                    if (!kVar.f6440e) {
                        long j6 = kVar.f6442g;
                        Pg.k buffer = kVar.t;
                        if (j6 > 0) {
                            kVar.f6436a.readFully(buffer, j6);
                        }
                        if (kVar.f6443i) {
                            if (kVar.f6445o) {
                                a aVar = kVar.f6447v;
                                if (aVar == null) {
                                    aVar = new a(kVar.f6439d, 1);
                                    kVar.f6447v = aVar;
                                }
                                Intrinsics.checkNotNullParameter(buffer, "buffer");
                                Pg.k kVar2 = aVar.f6394c;
                                if (kVar2.f7358b != 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                Inflater inflater = (Inflater) aVar.f6395d;
                                if (aVar.f6393b) {
                                    inflater.reset();
                                }
                                kVar2.writeAll(buffer);
                                kVar2.p(65535);
                                long bytesRead = inflater.getBytesRead() + kVar2.f7358b;
                                do {
                                    ((r) aVar.f6396e).a(buffer, Long.MAX_VALUE);
                                } while (inflater.getBytesRead() < bytesRead);
                            }
                            h hVar = kVar.f6437b;
                            if (i7 != 1) {
                                hVar.onReadMessage(buffer.readByteString(buffer.f7358b));
                                break;
                            } else {
                                hVar.onReadMessage(buffer.readUtf8());
                                break;
                            }
                        }
                        while (!kVar.f6440e) {
                            kVar.b();
                            if (!kVar.f6444j) {
                                break;
                            } else {
                                kVar.a();
                            }
                        }
                        if (kVar.f6441f != 0) {
                            StringBuilder sb3 = new StringBuilder("Expected continuation opcode. Got: ");
                            int i10 = kVar.f6441f;
                            byte[] bArr2 = Dg.c.f1879a;
                            String hexString2 = Integer.toHexString(i10);
                            Intrinsics.checkNotNullExpressionValue(hexString2, "toHexString(this)");
                            sb3.append(hexString2);
                            throw new ProtocolException(sb3.toString());
                        }
                    } else {
                        throw new IOException("closed");
                    }
                }
            }
        }
    }

    public final void e() {
        byte[] bArr = Dg.c.f1879a;
        f fVar = this.f6415i;
        if (fVar != null) {
            this.f6418l.c(fVar, 0L);
        }
    }

    public final synchronized boolean f(Pg.m mVar, int i7) {
        if (!this.f6426u && !this.f6424r) {
            if (this.f6423q + ((long) mVar.d()) > 16777216) {
                close(1001, null);
                return false;
            }
            this.f6423q += (long) mVar.d();
            this.f6422p.add(new e(mVar, i7));
            e();
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: all -> 0x008d, TRY_ENTER, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0090 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011b A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x012d A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0137  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0141  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:29:0x007c, B:32:0x0090, B:34:0x0094, B:35:0x00a0, B:37:0x00ad, B:40:0x00b1, B:41:0x00b2, B:42:0x00b3, B:44:0x00b7, B:74:0x0129, B:76:0x012d, B:85:0x0146, B:86:0x0148, B:62:0x00e2, B:66:0x0107, B:67:0x0110, B:63:0x00f6, B:68:0x0111, B:70:0x011b, B:71:0x011e, B:87:0x0149, B:88:0x014e, B:36:0x00a1, B:73:0x0126), top: B:104:0x007a, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00f6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean g() {
        Object objPoll;
        String str;
        int i7;
        ?? r10;
        ?? r11;
        ?? r12;
        int i10;
        Pg.m mVar;
        Pg.m byteString;
        Pg.k kVar;
        e eVar;
        synchronized (this) {
            try {
                if (this.f6426u) {
                    return false;
                }
                l lVar = this.f6417k;
                Object objPoll2 = this.f6421o.poll();
                String str2 = null;
                try {
                    if (objPoll2 == null) {
                        objPoll = this.f6422p.poll();
                        if (objPoll instanceof c) {
                            i7 = this.f6425s;
                            str = this.t;
                            if (i7 != -1) {
                                m mVar2 = this.f6420n;
                                this.f6420n = null;
                                k kVar2 = this.f6416j;
                                this.f6416j = null;
                                l lVar2 = this.f6417k;
                                this.f6417k = null;
                                this.f6418l.f();
                                r10 = mVar2;
                                r12 = kVar2;
                                r11 = lVar2;
                            } else {
                                ((c) objPoll).getClass();
                                this.f6418l.c(new f(this.f6419m + " cancel", this), TimeUnit.MILLISECONDS.toNanos(60000L));
                                r10 = 0;
                                r12 = 0;
                                r11 = 0;
                            }
                        } else {
                            if (objPoll == null) {
                                return false;
                            }
                            str = null;
                        }
                        Unit unit = Unit.f38893a;
                        if (objPoll2 != null) {
                            Intrinsics.e(lVar);
                            Pg.m payload = (Pg.m) objPoll2;
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            lVar.a(payload, 10);
                        } else if (objPoll instanceof e) {
                            eVar = (e) objPoll;
                            Intrinsics.e(lVar);
                            lVar.b(eVar.f6401b, eVar.f6400a);
                            synchronized (this) {
                                this.f6423q -= (long) eVar.f6401b.d();
                            }
                        } else {
                            if (objPoll instanceof c) {
                                throw new AssertionError();
                            }
                            c cVar = (c) objPoll;
                            Intrinsics.e(lVar);
                            i10 = cVar.f6398a;
                            mVar = cVar.f6399b;
                            byteString = Pg.m.f7360e;
                            if (i10 == 0 || mVar != null) {
                                if (i10 != 0) {
                                    if (i10 >= 1000 || i10 >= 5000) {
                                        str2 = "Code must be in range [1000,5000): " + i10;
                                    } else if ((1004 <= i10 && i10 < 1007) || (1015 <= i10 && i10 < 3000)) {
                                        str2 = "Code " + i10 + " is reserved and may not be used.";
                                    }
                                    if (str2 != null) {
                                        throw new IllegalArgumentException(str2.toString());
                                    }
                                }
                                kVar = new Pg.k();
                                kVar.r(i10);
                                if (mVar != null) {
                                    kVar.i(mVar);
                                }
                                byteString = kVar.readByteString(kVar.f7358b);
                            }
                            try {
                                lVar.a(byteString, 8);
                                lVar.f6456i = true;
                                if (r10 != 0) {
                                    l0 l0Var = this.f6408b;
                                    Intrinsics.e(str);
                                    l0Var.onClosed(this, i7, str);
                                }
                            } catch (Throwable th) {
                                lVar.f6456i = true;
                                throw th;
                            }
                        }
                        if (r10 != 0) {
                            Dg.c.c(r10);
                        }
                        if (r12 != 0) {
                            Dg.c.c(r12);
                        }
                        if (r11 != 0) {
                            Dg.c.c(r11);
                        }
                        return true;
                    }
                    objPoll = null;
                    str = null;
                    if (objPoll2 != null) {
                        Intrinsics.e(lVar);
                        Pg.m payload2 = (Pg.m) objPoll2;
                        Intrinsics.checkNotNullParameter(payload2, "payload");
                        lVar.a(payload2, 10);
                    } else if (objPoll instanceof e) {
                        eVar = (e) objPoll;
                        Intrinsics.e(lVar);
                        lVar.b(eVar.f6401b, eVar.f6400a);
                        synchronized (this) {
                            this.f6423q -= (long) eVar.f6401b.d();
                        }
                    } else {
                        if (objPoll instanceof c) {
                            throw new AssertionError();
                        }
                        c cVar2 = (c) objPoll;
                        Intrinsics.e(lVar);
                        i10 = cVar2.f6398a;
                        mVar = cVar2.f6399b;
                        byteString = Pg.m.f7360e;
                        if (i10 == 0) {
                            if (i10 != 0) {
                                if (i10 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i10;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i10;
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            kVar = new Pg.k();
                            kVar.r(i10);
                            if (mVar != null) {
                                kVar.i(mVar);
                            }
                            byteString = kVar.readByteString(kVar.f7358b);
                        } else {
                            if (i10 != 0) {
                                if (i10 >= 1000) {
                                    str2 = "Code must be in range [1000,5000): " + i10;
                                } else {
                                    str2 = "Code must be in range [1000,5000): " + i10;
                                }
                                if (str2 != null) {
                                    throw new IllegalArgumentException(str2.toString());
                                }
                            }
                            kVar = new Pg.k();
                            kVar.r(i10);
                            if (mVar != null) {
                                kVar.i(mVar);
                            }
                            byteString = kVar.readByteString(kVar.f7358b);
                        }
                        lVar.a(byteString, 8);
                        lVar.f6456i = true;
                        if (r10 != 0) {
                            l0 l0Var2 = this.f6408b;
                            Intrinsics.e(str);
                            l0Var2.onClosed(this, i7, str);
                        }
                    }
                    if (r10 != 0) {
                        Dg.c.c(r10);
                    }
                    if (r12 != 0) {
                        Dg.c.c(r12);
                    }
                    if (r11 != 0) {
                        Dg.c.c(r11);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (r10 != 0) {
                        Dg.c.c(r10);
                    }
                    if (r12 != 0) {
                        Dg.c.c(r12);
                    }
                    if (r11 != 0) {
                        Dg.c.c(r11);
                    }
                    throw th2;
                }
                String str3 = str;
                String str4 = str3;
                i7 = -1;
                r10 = str4;
                r12 = str3;
                r11 = str4;
                Unit unit2 = Unit.f38893a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public final void onReadClose(int i7, String reason) {
        m mVar;
        k kVar;
        l lVar;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (i7 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.f6425s != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f6425s = i7;
                this.t = reason;
                mVar = null;
                if (this.f6424r && this.f6422p.isEmpty()) {
                    m mVar2 = this.f6420n;
                    this.f6420n = null;
                    kVar = this.f6416j;
                    this.f6416j = null;
                    lVar = this.f6417k;
                    this.f6417k = null;
                    this.f6418l.f();
                    mVar = mVar2;
                } else {
                    kVar = null;
                    lVar = null;
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f6408b.onClosing(this, i7, reason);
            if (mVar != null) {
                this.f6408b.onClosed(this, i7, reason);
            }
        } finally {
            if (mVar != null) {
                Dg.c.c(mVar);
            }
            if (kVar != null) {
                Dg.c.c(kVar);
            }
            if (lVar != null) {
                Dg.c.c(lVar);
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public final void onReadMessage(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f6408b.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public final synchronized void onReadPing(Pg.m payload) {
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (!this.f6426u && (!this.f6424r || !this.f6422p.isEmpty())) {
                this.f6421o.add(payload);
                e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public final synchronized void onReadPong(Pg.m payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f6428w = false;
    }

    @Override // okhttp3.WebSocket
    public final synchronized long queueSize() {
        return this.f6423q;
    }

    @Override // okhttp3.WebSocket
    public final Y request() {
        return this.f6407a;
    }

    @Override // okhttp3.WebSocket
    public final boolean send(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return f(Pg.m.f7359d.encodeUtf8(text), 1);
    }

    @Override // okhttp3.internal.ws.WebSocketReader$FrameCallback
    public final void onReadMessage(Pg.m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f6408b.onMessage(this, bytes);
    }

    @Override // okhttp3.WebSocket
    public final boolean send(Pg.m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return f(bytes, 2);
    }
}
