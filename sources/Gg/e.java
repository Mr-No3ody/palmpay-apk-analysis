package Gg;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.AbstractC1956y;
import okhttp3.C1921a;
import okhttp3.Call;
import okhttp3.J;
import okhttp3.i0;
import okhttp3.internal.http2.C1930a;
import okhttp3.internal.http2.EnumC1932c;
import okhttp3.internal.http2.L;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1921a f3423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f3424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1956y f3425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4.a f3426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f3427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i0 f3431j;

    public e(p connectionPool, C1921a address, i call, AbstractC1956y eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f3422a = connectionPool;
        this.f3423b = address;
        this.f3424c = call;
        this.f3425d = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0248  */
    /* JADX WARN: Code duplicated, block: B:115:0x025f  */
    /* JADX WARN: Code duplicated, block: B:117:0x026b  */
    /* JADX WARN: Code duplicated, block: B:118:0x027b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0281  */
    /* JADX WARN: Code duplicated, block: B:129:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.List] */
    public final n a(int i7, boolean z3, boolean z8, int i10, int i11) throws IOException {
        i0 route;
        C4.a aVar;
        s sVar;
        ArrayList arrayList;
        C4.a aVar2;
        boolean z10;
        C1921a c1921a;
        Proxy proxy;
        String socketHost;
        int port;
        List<InetAddress> listC;
        boolean zContains;
        n connection;
        C2085k0 c2085k0;
        Socket socketH;
        while (!this.f3424c.f3438B) {
            n nVar = this.f3424c.f3450o;
            if (nVar != null) {
                synchronized (nVar) {
                    try {
                        socketH = (nVar.f3470j || !b(nVar.f3462b.f40761a.f40702i)) ? this.f3424c.h() : null;
                        Unit unit = Unit.f38893a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3424c.f3450o == null) {
                    if (socketH != null) {
                        Dg.c.d(socketH);
                    }
                    this.f3425d.connectionReleased(this.f3424c, nVar);
                    this.f3428g = 0;
                    this.f3429h = 0;
                    this.f3430i = 0;
                    if (this.f3422a.a(this.f3423b, this.f3424c, null, false)) {
                        nVar = this.f3424c.f3450o;
                        Intrinsics.e(nVar);
                        this.f3425d.connectionAcquired(this.f3424c, nVar);
                    } else {
                        route = this.f3431j;
                        try {
                            if (route != null) {
                                this.f3431j = null;
                            } else {
                                aVar = this.f3426e;
                                if (aVar == null && aVar.c()) {
                                    C4.a aVar3 = this.f3426e;
                                    Intrinsics.e(aVar3);
                                    if (!aVar3.c()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i12 = aVar3.f1155b;
                                    aVar3.f1155b = i12 + 1;
                                    route = (i0) ((ArrayList) aVar3.f1156c).get(i12);
                                } else {
                                    sVar = this.f3427f;
                                    if (sVar == null) {
                                        C1921a c1921a2 = this.f3423b;
                                        i iVar = this.f3424c;
                                        sVar = new s(c1921a2, iVar.f3441a.f40668s0, iVar, this.f3425d);
                                        this.f3427f = sVar;
                                    }
                                    if (sVar.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (sVar.f3491f < sVar.f3490e.size()) {
                                        if (sVar.f3491f < sVar.f3490e.size()) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        c1921a = sVar.f3486a;
                                        if (z10) {
                                            throw new SocketException("No route to " + c1921a.f40702i.f40582d + "; exhausted proxy configurations: " + sVar.f3490e);
                                        }
                                        List list = sVar.f3490e;
                                        int i13 = sVar.f3491f;
                                        sVar.f3491f = i13 + 1;
                                        proxy = (Proxy) list.get(i13);
                                        ArrayList arrayList2 = new ArrayList();
                                        sVar.f3492g = arrayList2;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            J j6 = c1921a.f40702i;
                                            socketHost = j6.f40582d;
                                            port = j6.f40583e;
                                        } else {
                                            SocketAddress proxyAddress = proxy.address();
                                            if (!(proxyAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
                                            }
                                            Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                                            socketHost = s.f3485i.getSocketHost(inetSocketAddress);
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + socketHost + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(socketHost, port));
                                        } else {
                                            byte[] bArr = Dg.c.f1879a;
                                            Intrinsics.checkNotNullParameter(socketHost, "<this>");
                                            if (Dg.c.f1884f.b(socketHost)) {
                                                listC = C1849p.c(InetAddress.getByName(socketHost));
                                            } else {
                                                AbstractC1956y abstractC1956y = sVar.f3489d;
                                                Call call = sVar.f3488c;
                                                abstractC1956y.dnsStart(call, socketHost);
                                                List<InetAddress> listLookup = c1921a.f40694a.lookup(socketHost);
                                                if (listLookup.isEmpty()) {
                                                    throw new UnknownHostException(c1921a.f40694a + " returned no addresses for " + socketHost);
                                                }
                                                abstractC1956y.dnsEnd(call, socketHost, listLookup);
                                                listC = listLookup;
                                            }
                                            Iterator<InetAddress> it = listC.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InetSocketAddress(it.next(), port));
                                            }
                                        }
                                        Iterator it2 = sVar.f3492g.iterator();
                                        while (it2.hasNext()) {
                                            i0 route2 = new i0(sVar.f3486a, proxy, (InetSocketAddress) it2.next());
                                            C2085k0 c2085k1 = sVar.f3487b;
                                            synchronized (c2085k1) {
                                                Intrinsics.checkNotNullParameter(route2, "route");
                                                zContains = ((LinkedHashSet) c2085k1.f42878b).contains(route2);
                                            }
                                            if (zContains) {
                                                sVar.f3493h.add(route2);
                                            } else {
                                                arrayList.add(route2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        v.n(arrayList, sVar.f3493h);
                                        sVar.f3493h.clear();
                                    }
                                    aVar2 = new C4.a(arrayList);
                                    this.f3426e = aVar2;
                                    if (!this.f3424c.f3438B) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f3422a.a(this.f3423b, this.f3424c, arrayList, false)) {
                                        nVar = this.f3424c.f3450o;
                                        Intrinsics.e(nVar);
                                        this.f3425d.connectionAcquired(this.f3424c, nVar);
                                    } else {
                                        if (aVar2.c()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i14 = aVar2.f1155b;
                                        aVar2.f1155b = i14 + 1;
                                        route = (i0) arrayList.get(i14);
                                        connection = new n(this.f3422a, route);
                                        this.f3424c.f3440H = connection;
                                        connection.c(i7, i10, i11, z3, this.f3424c, this.f3425d);
                                        this.f3424c.f3440H = null;
                                        c2085k0 = this.f3424c.f3441a.f40668s0;
                                        synchronized (c2085k0) {
                                            Intrinsics.checkNotNullParameter(route, "route");
                                            ((LinkedHashSet) c2085k0.f42878b).remove(route);
                                        }
                                        if (this.f3422a.a(this.f3423b, this.f3424c, arrayList, true)) {
                                            nVar = this.f3424c.f3450o;
                                            Intrinsics.e(nVar);
                                            this.f3431j = route;
                                            Socket socket = connection.f3464d;
                                            Intrinsics.e(socket);
                                            Dg.c.d(socket);
                                            this.f3425d.connectionAcquired(this.f3424c, nVar);
                                        } else {
                                            synchronized (connection) {
                                                p pVar = this.f3422a;
                                                pVar.getClass();
                                                Intrinsics.checkNotNullParameter(connection, "connection");
                                                byte[] bArr2 = Dg.c.f1879a;
                                                pVar.f3482e.add(connection);
                                                pVar.f3480c.c(pVar.f3481d, 0L);
                                                this.f3424c.b(connection);
                                                Unit unit2 = Unit.f38893a;
                                            }
                                            this.f3425d.connectionAcquired(this.f3424c, connection);
                                            nVar = connection;
                                        }
                                    }
                                }
                            }
                            connection.c(i7, i10, i11, z3, this.f3424c, this.f3425d);
                            this.f3424c.f3440H = null;
                            c2085k0 = this.f3424c.f3441a.f40668s0;
                            synchronized (c2085k0) {
                                Intrinsics.checkNotNullParameter(route, "route");
                                ((LinkedHashSet) c2085k0.f42878b).remove(route);
                                if (this.f3422a.a(this.f3423b, this.f3424c, arrayList, true)) {
                                    nVar = this.f3424c.f3450o;
                                    Intrinsics.e(nVar);
                                    this.f3431j = route;
                                    Socket socket2 = connection.f3464d;
                                    Intrinsics.e(socket2);
                                    Dg.c.d(socket2);
                                    this.f3425d.connectionAcquired(this.f3424c, nVar);
                                } else {
                                    synchronized (connection) {
                                        p pVar2 = this.f3422a;
                                        pVar2.getClass();
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        byte[] bArr3 = Dg.c.f1879a;
                                        pVar2.f3482e.add(connection);
                                        pVar2.f3480c.c(pVar2.f3481d, 0L);
                                        this.f3424c.b(connection);
                                        Unit unit3 = Unit.f38893a;
                                        this.f3425d.connectionAcquired(this.f3424c, connection);
                                        nVar = connection;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.f3424c.f3440H = null;
                            throw th2;
                        }
                        arrayList = null;
                        connection = new n(this.f3422a, route);
                        this.f3424c.f3440H = connection;
                    }
                } else if (socketH != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.f3428g = 0;
                this.f3429h = 0;
                this.f3430i = 0;
                if (this.f3422a.a(this.f3423b, this.f3424c, null, false)) {
                    nVar = this.f3424c.f3450o;
                    Intrinsics.e(nVar);
                    this.f3425d.connectionAcquired(this.f3424c, nVar);
                } else {
                    route = this.f3431j;
                    if (route != null) {
                        this.f3431j = null;
                    } else {
                        aVar = this.f3426e;
                        if (aVar == null) {
                        }
                        sVar = this.f3427f;
                        if (sVar == null) {
                            C1921a c1921a3 = this.f3423b;
                            i iVar2 = this.f3424c;
                            sVar = new s(c1921a3, iVar2.f3441a.f40668s0, iVar2, this.f3425d);
                            this.f3427f = sVar;
                        }
                        if (sVar.a()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (sVar.f3491f < sVar.f3490e.size()) {
                            if (sVar.f3491f < sVar.f3490e.size()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            c1921a = sVar.f3486a;
                            if (z10) {
                                throw new SocketException("No route to " + c1921a.f40702i.f40582d + "; exhausted proxy configurations: " + sVar.f3490e);
                            }
                            List list2 = sVar.f3490e;
                            int i15 = sVar.f3491f;
                            sVar.f3491f = i15 + 1;
                            proxy = (Proxy) list2.get(i15);
                            ArrayList arrayList3 = new ArrayList();
                            sVar.f3492g = arrayList3;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                J j10 = c1921a.f40702i;
                                socketHost = j10.f40582d;
                                port = j10.f40583e;
                            } else {
                                J j11 = c1921a.f40702i;
                                socketHost = j11.f40582d;
                                port = j11.f40583e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + socketHost + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            v.n(arrayList, sVar.f3493h);
                            sVar.f3493h.clear();
                        }
                        aVar2 = new C4.a(arrayList);
                        this.f3426e = aVar2;
                        if (!this.f3424c.f3438B) {
                            throw new IOException("Canceled");
                        }
                        if (this.f3422a.a(this.f3423b, this.f3424c, arrayList, false)) {
                            nVar = this.f3424c.f3450o;
                            Intrinsics.e(nVar);
                            this.f3425d.connectionAcquired(this.f3424c, nVar);
                        } else {
                            if (aVar2.c()) {
                                throw new NoSuchElementException();
                            }
                            int i16 = aVar2.f1155b;
                            aVar2.f1155b = i16 + 1;
                            route = (i0) arrayList.get(i16);
                            connection = new n(this.f3422a, route);
                            this.f3424c.f3440H = connection;
                            connection.c(i7, i10, i11, z3, this.f3424c, this.f3425d);
                            this.f3424c.f3440H = null;
                            c2085k0 = this.f3424c.f3441a.f40668s0;
                            synchronized (c2085k0) {
                                Intrinsics.checkNotNullParameter(route, "route");
                                ((LinkedHashSet) c2085k0.f42878b).remove(route);
                                if (this.f3422a.a(this.f3423b, this.f3424c, arrayList, true)) {
                                    nVar = this.f3424c.f3450o;
                                    Intrinsics.e(nVar);
                                    this.f3431j = route;
                                    Socket socket3 = connection.f3464d;
                                    Intrinsics.e(socket3);
                                    Dg.c.d(socket3);
                                    this.f3425d.connectionAcquired(this.f3424c, nVar);
                                } else {
                                    synchronized (connection) {
                                        p pVar3 = this.f3422a;
                                        pVar3.getClass();
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        byte[] bArr4 = Dg.c.f1879a;
                                        pVar3.f3482e.add(connection);
                                        pVar3.f3480c.c(pVar3.f3481d, 0L);
                                        this.f3424c.b(connection);
                                        Unit unit4 = Unit.f38893a;
                                        this.f3425d.connectionAcquired(this.f3424c, connection);
                                        nVar = connection;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    connection = new n(this.f3422a, route);
                    this.f3424c.f3440H = connection;
                    connection.c(i7, i10, i11, z3, this.f3424c, this.f3425d);
                    this.f3424c.f3440H = null;
                    c2085k0 = this.f3424c.f3441a.f40668s0;
                    synchronized (c2085k0) {
                        Intrinsics.checkNotNullParameter(route, "route");
                        ((LinkedHashSet) c2085k0.f42878b).remove(route);
                        if (this.f3422a.a(this.f3423b, this.f3424c, arrayList, true)) {
                            nVar = this.f3424c.f3450o;
                            Intrinsics.e(nVar);
                            this.f3431j = route;
                            Socket socket4 = connection.f3464d;
                            Intrinsics.e(socket4);
                            Dg.c.d(socket4);
                            this.f3425d.connectionAcquired(this.f3424c, nVar);
                        } else {
                            synchronized (connection) {
                                p pVar4 = this.f3422a;
                                pVar4.getClass();
                                Intrinsics.checkNotNullParameter(connection, "connection");
                                byte[] bArr5 = Dg.c.f1879a;
                                pVar4.f3482e.add(connection);
                                pVar4.f3480c.c(pVar4.f3481d, 0L);
                                this.f3424c.b(connection);
                                Unit unit5 = Unit.f38893a;
                                this.f3425d.connectionAcquired(this.f3424c, connection);
                                nVar = connection;
                            }
                        }
                    }
                }
            }
            if (nVar.i(z8)) {
                return nVar;
            }
            nVar.k();
            if (this.f3431j == null) {
                C4.a aVar4 = this.f3426e;
                if (aVar4 != null ? aVar4.c() : true) {
                    continue;
                } else {
                    s sVar2 = this.f3427f;
                    if (!(sVar2 != null ? sVar2.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(J url) {
        Intrinsics.checkNotNullParameter(url, "url");
        J j6 = this.f3423b.f40702i;
        return url.f40583e == j6.f40583e && Intrinsics.c(url.f40582d, j6.f40582d);
    }

    public final void c(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f3431j = null;
        if ((e10 instanceof L) && ((L) e10).f40801a == EnumC1932c.REFUSED_STREAM) {
            this.f3428g++;
        } else if (e10 instanceof C1930a) {
            this.f3429h++;
        } else {
            this.f3430i++;
        }
    }
}
