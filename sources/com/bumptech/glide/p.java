package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.target.Target;
import java.io.File;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p implements ComponentCallbacks2, LifecycleListener, ModelTypes {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final G1.d f21066p = (G1.d) ((G1.d) new G1.d().f(Bitmap.class)).p();
    public static final G1.d t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lifecycle f21069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final He.a f21070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RequestManagerTreeNode f21071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f21072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.customview.widget.e f21073g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConnectivityMonitor f21074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f21075j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public G1.d f21076o;

    static {
        t = (G1.d) ((G1.d) G1.d.N(com.bumptech.glide.load.engine.k.f20705d).z(g.f20472d)).F(true);
    }

    public p(b bVar, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        G1.d dVar;
        He.a aVar = new He.a(6);
        com.bumptech.glide.manager.b bVar2 = bVar.f20439g;
        this.f21072f = new com.bumptech.glide.manager.o();
        androidx.customview.widget.e eVar = new androidx.customview.widget.e(this, 10);
        this.f21073g = eVar;
        this.f21067a = bVar;
        this.f21069c = lifecycle;
        this.f21071e = requestManagerTreeNode;
        this.f21070d = aVar;
        this.f21068b = context;
        ConnectivityMonitor connectivityMonitorBuild = bVar2.build(context.getApplicationContext(), new o(this, aVar));
        this.f21074i = connectivityMonitorBuild;
        synchronized (bVar.f20440i) {
            if (bVar.f20440i.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f20440i.add(this);
        }
        char[] cArr = J1.o.f4478a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lifecycle.addListener(this);
        } else {
            J1.o.f().post(eVar);
        }
        lifecycle.addListener(connectivityMonitorBuild);
        this.f21075j = new CopyOnWriteArrayList(bVar.f20436d.f20463e);
        f fVar = bVar.f20436d;
        synchronized (fVar) {
            try {
                if (fVar.f20468j == null) {
                    fVar.f20468j = (G1.d) fVar.f20462d.build().p();
                }
                dVar = fVar.f20468j;
            } catch (Throwable th) {
                throw th;
            }
        }
        s(dVar);
    }

    public m a(Class cls) {
        return new m(this.f21067a, this, cls, this.f21068b);
    }

    public m b() {
        return a(Bitmap.class).a(f21066p);
    }

    public m c() {
        return a(Drawable.class);
    }

    public m d() {
        return a(File.class).a(G1.d.P());
    }

    public final void e(Target target) {
        if (target == null) {
            return;
        }
        boolean zT = t(target);
        Request request = target.getRequest();
        if (zT) {
            return;
        }
        b bVar = this.f21067a;
        synchronized (bVar.f20440i) {
            try {
                Iterator it = bVar.f20440i.iterator();
                while (it.hasNext()) {
                    if (((p) it.next()).t(target)) {
                        return;
                    }
                }
                if (request != null) {
                    target.setRequest(null);
                    request.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void f() {
        try {
            Iterator it = J1.o.e(this.f21072f.f21063a).iterator();
            while (it.hasNext()) {
                e((Target) it.next());
            }
            this.f21072f.f21063a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public m g() {
        return a(File.class).a(t);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public m load(Bitmap bitmap) {
        return c().load(bitmap);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public m load(Drawable drawable) {
        return c().load(drawable);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public m load(Uri uri) {
        return c().load(uri);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public m load(File file) {
        return c().load(file);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public m load(Integer num) {
        return c().load(num);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public m load(Object obj) {
        return c().load(obj);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public m load(String str) {
        return c().load(str);
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m load(URL url) {
        return c().load(url);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onDestroy() {
        this.f21072f.onDestroy();
        f();
        He.a aVar = this.f21070d;
        Iterator it = J1.o.e((Set) aVar.f3865c).iterator();
        while (it.hasNext()) {
            aVar.c((Request) it.next());
        }
        ((HashSet) aVar.f3866d).clear();
        this.f21069c.removeListener(this);
        this.f21069c.removeListener(this.f21074i);
        J1.o.f().removeCallbacks(this.f21073g);
        b bVar = this.f21067a;
        synchronized (bVar.f20440i) {
            if (!bVar.f20440i.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.f20440i.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onStart() {
        r();
        this.f21072f.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onStop() {
        this.f21072f.onStop();
        q();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
    }

    @Override // com.bumptech.glide.ModelTypes
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public m load(byte[] bArr) {
        return c().load(bArr);
    }

    public final synchronized void q() {
        He.a aVar = this.f21070d;
        aVar.f3864b = true;
        for (Request request : J1.o.e((Set) aVar.f3865c)) {
            if (request.isRunning()) {
                request.pause();
                ((HashSet) aVar.f3866d).add(request);
            }
        }
    }

    public final synchronized void r() {
        He.a aVar = this.f21070d;
        aVar.f3864b = false;
        for (Request request : J1.o.e((Set) aVar.f3865c)) {
            if (!request.isComplete() && !request.isRunning()) {
                request.begin();
            }
        }
        ((HashSet) aVar.f3866d).clear();
    }

    public synchronized void s(G1.d dVar) {
        this.f21076o = (G1.d) ((G1.d) dVar.clone()).b();
    }

    public final synchronized boolean t(Target target) {
        Request request = target.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f21070d.c(request)) {
            return false;
        }
        this.f21072f.f21063a.remove(target);
        target.setRequest(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f21070d + ", treeNode=" + this.f21071e + "}";
    }
}
