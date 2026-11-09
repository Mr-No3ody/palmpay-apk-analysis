package p075f2;

import M.g;
import android.net.Uri;
import android.util.Log;
import com.alibaba.android.arouter.utils.Consts;
import com.didi.drouter.loader.host.InterceptorLoader;
import com.didi.drouter.loader.host.RouterLoader;
import com.didi.drouter.loader.host.ServiceLoader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f36372a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f36373b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f36374c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f36375d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f36376e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f36377f;

    public static void a() {
        if (f36377f) {
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = f36375d;
        if (!copyOnWriteArraySet.contains("host")) {
            synchronized (c.class) {
                try {
                    if (!copyOnWriteArraySet.contains("host")) {
                        copyOnWriteArraySet.add("host");
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            f36376e.await();
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    public static g b(Uri uri) {
        String string;
        a();
        g gVar = new g(0);
        ConcurrentHashMap concurrentHashMap = f36372a;
        if (uri == null) {
            string = "@@$$";
        } else {
            StringBuilder sb2 = new StringBuilder();
            String scheme = uri.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            sb2.append(scheme);
            sb2.append("@@");
            String host = uri.getHost();
            if (host == null) {
                host = "";
            }
            sb2.append(host);
            sb2.append(Consts.SEPARATOR);
            String path = uri.getPath();
            if (path == null) {
                path = "";
            }
            sb2.append(path);
            string = sb2.toString();
        }
        Object obj = concurrentHashMap.get(string);
        if (obj instanceof b) {
            gVar.add((b) obj);
        }
        Map map = (Map) concurrentHashMap.get("RegexRouter");
        if (map != null) {
            for (b bVar : map.values()) {
                bVar.getClass();
                String scheme2 = uri.getScheme();
                if (scheme2 == null) {
                    scheme2 = "";
                }
                String host2 = uri.getHost();
                if (host2 == null) {
                    host2 = "";
                }
                String path2 = uri.getPath();
                if (path2 == null) {
                    path2 = "";
                }
                if (bVar.d(0)) {
                    throw null;
                }
                if (bVar.d(1)) {
                    throw null;
                }
                if (bVar.d(2)) {
                    throw null;
                }
                if (scheme2.matches(null) && host2.matches(null) && path2.matches(null)) {
                    gVar.add(bVar);
                }
            }
        }
        return gVar;
    }

    public static void c() {
        boolean z3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            new RouterLoader().load(f36372a);
            new InterceptorLoader().load(f36373b);
            new ServiceLoader().load(f36374c);
            z3 = true;
        } catch (NoClassDefFoundError unused) {
            z3 = false;
        }
        f36377f = true;
        f36376e.countDown();
        if (!z3) {
            Object[] objArr = {"host"};
            if (p092g2.c.c()) {
                Log.e("DRouterCore", p092g2.c.a("DRouterTable in app \"%s\" not found, please apply drouter plugin first.", objArr));
            }
        }
        Object[] objArr2 = {Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)};
        if (p092g2.c.c()) {
            p092g2.c.a("[===DRouter load complete=== waste time: %sms]", objArr2);
        }
    }
}
