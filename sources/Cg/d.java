package Cg;

import Gg.i;
import Jg.t;
import Pg.AbstractC0555b;
import Pg.k;
import Pg.m;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.C1943k;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.H;
import okhttp3.J;
import okhttp3.L;
import okhttp3.U;
import okhttp3.W;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.h0;
import p355xf.C2126e;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Dns {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f1561g = new c(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final L f1562h = L.f40589e.get("application/dns-message");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f1563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f1564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1567f;

    public d(U client, J url, boolean z3, boolean z8, boolean z10) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1563b = client;
        this.f1564c = url;
        this.f1565d = z3;
        this.f1566e = z8;
        this.f1567f = z10;
    }

    public static void b(e0 e0Var, String str, ArrayList arrayList, ArrayList arrayList2) {
        try {
            ArrayList arrayListC = c(str, e0Var);
            synchronized (arrayList) {
                arrayList.addAll(arrayListC);
            }
        } catch (Exception e10) {
            synchronized (arrayList2) {
                arrayList2.add(e10);
            }
        }
    }

    public static ArrayList c(String str, e0 e0Var) {
        if (e0Var.f40736j == null) {
            W w3 = W.HTTP_2;
            W w6 = e0Var.f40729b;
            if (w6 != w3) {
                t.j(t.f4869a.get(), "Incorrect protocol: " + w6, 4);
            }
        }
        try {
            if (!e0Var.isSuccessful()) {
                throw new IOException("response: " + e0Var.f40731d + ' ' + e0Var.f40730c);
            }
            h0 h0Var = e0Var.f40734g;
            Intrinsics.e(h0Var);
            if (h0Var.contentLength() <= 65536) {
                ArrayList arrayListA = e.a(h0Var.source().readByteString(), str);
                e0Var.close();
                return arrayListA;
            }
            throw new IOException("response size exceeds limit (65536 bytes): " + h0Var.contentLength() + " bytes");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                org.chromium.support_lib_boundary.util.b.o(e0Var, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0132  */
    public final void a(String host, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i7) throws EOFException {
        List<String> listU;
        e0 e0VarExecute;
        X x3 = new X();
        L l5 = f1562h;
        x3.e(HttpHeaders.ACCEPT, l5.f40592a);
        int i10 = e.f1568a;
        Intrinsics.checkNotNullParameter(host, "host");
        k kVar = new k();
        kVar.r(0);
        kVar.r(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
        kVar.r(1);
        kVar.r(0);
        kVar.r(0);
        kVar.r(0);
        k kVar2 = new k();
        List listM = StringsKt.M(host, new char[]{'.'}, 6);
        if (listM.isEmpty()) {
            listU = z.f38935a;
            break;
        }
        ListIterator listIterator = listM.listIterator(listM.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listU = CollectionsKt.U(listM, listIterator.nextIndex() + 1);
                    break;
                }
            } else {
                listU = z.f38935a;
                break;
            }
        }
        for (String str : listU) {
            long jK = AbstractC0555b.k(str);
            if (jK != str.length()) {
                throw new IllegalArgumentException("non-ascii hostname: ".concat(host).toString());
            }
            kVar2.m((int) jK);
            kVar2.v(str);
        }
        kVar2.m(0);
        kVar2.d(kVar, 0L, kVar2.f7358b);
        kVar.r(i7);
        kVar.r(1);
        m byteString = kVar.readByteString(kVar.f7358b);
        boolean z3 = this.f1566e;
        J url = this.f1564c;
        if (z3) {
            Intrinsics.checkNotNullParameter(url, "url");
            x3.f40680a = url;
            x3.h(c0.Companion.create(byteString, l5));
        } else {
            String strK = y.k(byteString.b(), "=", "");
            H hF = url.f();
            hF.a("dns", strK);
            J url2 = hF.b();
            Intrinsics.checkNotNullParameter(url2, "url");
            x3.f40680a = url2;
        }
        Y yB = x3.b();
        U u6 = this.f1563b;
        if (z3 || u6.f40664p == null) {
            e0VarExecute = null;
        } else {
            try {
                C1943k c1943k = new C1943k(false, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
                X xB = yB.b();
                xB.c(c1943k);
                e0VarExecute = ((i) u6.newCall(xB.b())).execute();
                if (e0VarExecute.f40731d == 504) {
                    e0VarExecute = null;
                }
            } catch (IOException unused) {
            }
        }
        if (e0VarExecute != null) {
            b(e0VarExecute, host, arrayList2, arrayList3);
        } else {
            arrayList.add(u6.newCall(yB));
        }
    }

    @Override // okhttp3.Dns
    public final List lookup(String hostname) throws Exception {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        boolean zIsPrivateHost$okhttp_dnsoverhttps = f1561g.isPrivateHost$okhttp_dnsoverhttps(hostname);
        if (zIsPrivateHost$okhttp_dnsoverhttps) {
            throw new UnknownHostException("private hosts not resolved");
        }
        if (!zIsPrivateHost$okhttp_dnsoverhttps && !this.f1567f) {
            throw new UnknownHostException("public hosts not resolved");
        }
        ArrayList<Call> arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(2);
        ArrayList arrayList3 = new ArrayList(5);
        a(hostname, arrayList, arrayList3, arrayList2, 1);
        if (this.f1565d) {
            a(hostname, arrayList, arrayList3, arrayList2, 28);
        }
        CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
        for (Call call : arrayList) {
            O2.a aVar = new O2.a();
            aVar.f6553a = arrayList2;
            aVar.f6554b = countDownLatch;
            aVar.f6555c = hostname;
            aVar.f6556d = arrayList3;
            call.enqueue(aVar);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            arrayList2.add(e10);
        }
        if (!arrayList3.isEmpty()) {
            return arrayList3;
        }
        if (arrayList2.isEmpty()) {
            throw new UnknownHostException(hostname);
        }
        Exception exc = (Exception) arrayList2.get(0);
        if (exc instanceof UnknownHostException) {
            throw exc;
        }
        UnknownHostException unknownHostException = new UnknownHostException(hostname);
        unknownHostException.initCause(exc);
        int size = arrayList2.size();
        for (int i7 = 1; i7 < size; i7++) {
            C2126e.a(unknownHostException, (Throwable) arrayList2.get(i7));
        }
        throw unknownHostException;
    }
}
