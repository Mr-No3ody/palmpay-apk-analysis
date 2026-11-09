package p337w8;

import Eg.k;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.content.Context;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import androidx.work.impl.constraints.trackers.g;
import com.tencent.mmkv.MMKV;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import okhttp3.Dns;
import p042cg.e;
import p042cg.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Dns {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f43326m = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f43327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f43329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f43330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f43331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f43332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f43334i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MMKV f43335j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f43336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f43337l;

    static {
        new a(null);
    }

    public l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43328c = true;
        this.f43330e = 300000L;
        this.f43331f = 120000L;
        this.f43332g = C2131j.b(d.f43307d);
        this.f43336k = C2131j.b(d.f43305b);
        this.f43337l = C2131j.b(d.f43306c);
        this.f43334i = new k(this);
        g networkCallback = new g(this, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(networkCallback);
    }

    public static final void a(l lVar, ArrayList arrayList) {
        lVar.getClass();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Deferred deferred = (Deferred) it.next();
                try {
                    Objects.toString(deferred);
                    deferred.cancel((CancellationException) null);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static List f(String str) {
        try {
            return Dns.f40565a.lookup(str);
        } catch (Throwable th) {
            th.toString();
            return z.f38935a;
        }
    }

    public final MMKV b() {
        if (this.f43335j == null) {
            try {
                try {
                    this.f43335j = MMKV.o("DnsLib");
                } catch (Exception unused) {
                    Context context = this.f43329d;
                    if (context != null) {
                        MMKV.m(context);
                        this.f43335j = MMKV.o("DnsLib");
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return this.f43335j;
    }

    public final void c(String str) {
        if (((AtomicBoolean) this.f43336k.getValue()).compareAndSet(false, true)) {
            V v3 = V.f10828a;
            f fVar = I.f10809a;
            AbstractC0780y.m(v3, e.f19009c, null, new h(this, str, null), 2);
        }
    }

    public final void d(String str, List list, Long l5, Long l6) {
        ((c) this.f43332g.getValue()).f43304a.put(str, new b(list, l5 != null ? l5.longValue() : System.currentTimeMillis() + this.f43330e, l6 != null ? l6.longValue() : System.currentTimeMillis() + this.f43331f));
    }

    public final void e() {
        V v3 = V.f10828a;
        f fVar = I.f10809a;
        AbstractC0780y.m(v3, e.f19009c, null, new k(this, null), 2);
    }

    @Override // okhttp3.Dns
    public final List lookup(String hostname) {
        Set<String> setD;
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            b bVar = (b) ((c) this.f43332g.getValue()).f43304a.get(hostname);
            if (!this.f43328c) {
                return f(hostname);
            }
            if (bVar != null) {
                List list = bVar.f43303c;
                if (!list.isEmpty() && bVar.f43301a >= System.currentTimeMillis()) {
                    if (System.currentTimeMillis() > bVar.f43302b) {
                        c(hostname);
                    }
                    return list;
                }
            }
            if (this.f43333h) {
                MMKV mmkvB = b();
                ArrayList arrayList = null;
                if (mmkvB != null && (setD = mmkvB.d(hostname, null)) != null && (!setD.isEmpty())) {
                    arrayList = new ArrayList();
                    for (String str : setD) {
                        if (!TextUtils.isEmpty(str)) {
                            arrayList.add(InetAddress.getByName(str));
                        }
                    }
                    arrayList.toString();
                }
                if (arrayList != null && (!arrayList.isEmpty())) {
                    c(hostname);
                    d(hostname, arrayList, Long.valueOf(System.currentTimeMillis() + 60000), Long.valueOf(System.currentTimeMillis() + 30000));
                    return arrayList;
                }
            }
            c(hostname);
            return f(hostname);
        } catch (Throwable th) {
            th.toString();
            return f(hostname);
        }
    }
}
