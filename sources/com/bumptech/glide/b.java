package com.bumptech.glide;

import C0.G;
import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.module.GlideModule;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile b f20431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile boolean f20432p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.m f20433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapPool f20434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.cache.f f20435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f20436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.manager.j f20438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.manager.b f20439g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f20440i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Glide$RequestOptionsFactory f20441j;

    public b(Context context, com.bumptech.glide.load.engine.m mVar, com.bumptech.glide.load.engine.cache.f fVar, BitmapPool bitmapPool, com.bumptech.glide.load.engine.bitmap_recycle.f fVar2, com.bumptech.glide.manager.j jVar, com.bumptech.glide.manager.b bVar, int i7, Glide$RequestOptionsFactory glide$RequestOptionsFactory, M.f fVar3, List list, List list2, com.bumptech.glide.module.a aVar, Oe.a aVar2) {
        this.f20433a = mVar;
        this.f20434b = bitmapPool;
        this.f20437e = fVar2;
        this.f20435c = fVar;
        this.f20438f = jVar;
        this.f20439g = bVar;
        this.f20441j = glide$RequestOptionsFactory;
        this.f20436d = new f(context, fVar2, new Eg.g(this, list2, aVar), new org.sufficientlysecure.htmltextview.k(1), glide$RequestOptionsFactory, fVar3, list, mVar, aVar2, i7);
    }

    public static b b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f20431o == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (b.class) {
                if (f20431o == null) {
                    if (f20432p) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f20432p = true;
                    try {
                        d(context, generatedAppGlideModule);
                        f20432p = false;
                    } catch (Throwable th) {
                        f20432p = false;
                        throw th;
                    }
                }
            }
        }
        return f20431o;
    }

    public static com.bumptech.glide.manager.j c(Context context) {
        J1.g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f20438f;
    }

    public static void d(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List list;
        e eVar = new e();
        Context applicationContext = context.getApplicationContext();
        List list2 = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(com.bumptech.glide.module.b.a(str));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                if (Log.isLoggable("ManifestParser", 6)) {
                    Log.e("ManifestParser", "Failed to parse glide modules", e10);
                }
            }
            list = arrayList;
        } else {
            list = list2;
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set setD = generatedAppGlideModule.d();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GlideModule glideModule = (GlideModule) it.next();
                if (setD.contains(glideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        glideModule.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((GlideModule) it2.next()).getClass().toString();
            }
        }
        eVar.f20455n = generatedAppGlideModule != null ? generatedAppGlideModule.e() : null;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((GlideModule) it3.next()).getClass();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, eVar);
        }
        if (eVar.f20448g == null) {
            int i7 = p359y1.b.f44029c;
            androidx.camera.core.impl.utils.executor.e eVar2 = new androidx.camera.core.impl.utils.executor.e(3);
            if (p359y1.b.f44029c == 0) {
                p359y1.b.f44029c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i10 = p359y1.b.f44029c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException(G.o("Name must be non-null and non-empty, but given: ", "source"));
            }
            ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new PriorityBlockingQueue(), (ThreadFactory) new p359y1.a(eVar2, "source", false), "\u200bcom.bumptech.glide.load.engine.executor.GlideExecutor$Builder", true);
            if (0 != 0) {
                shadowThreadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            eVar.f20448g = new p359y1.b(shadowThreadPoolExecutor);
        }
        if (eVar.f20449h == null) {
            int i11 = p359y1.b.f44029c;
            androidx.camera.core.impl.utils.executor.e eVar3 = new androidx.camera.core.impl.utils.executor.e(3);
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            eVar.f20449h = new p359y1.b(new ShadowThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new PriorityBlockingQueue(), (ThreadFactory) new p359y1.a(eVar3, "disk-cache", true), "\u200bcom.bumptech.glide.load.engine.executor.GlideExecutor$Builder", true));
        }
        if (eVar.f20456o == null) {
            if (p359y1.b.f44029c == 0) {
                p359y1.b.f44029c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i12 = p359y1.b.f44029c >= 4 ? 2 : 1;
            androidx.camera.core.impl.utils.executor.e eVar4 = new androidx.camera.core.impl.utils.executor.e(3);
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            eVar.f20456o = new p359y1.b(new ShadowThreadPoolExecutor(i12, i12, 0L, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new PriorityBlockingQueue(), (ThreadFactory) new p359y1.a(eVar4, "animation", true), "\u200bcom.bumptech.glide.load.engine.executor.GlideExecutor$Builder", true));
        }
        if (eVar.f20451j == null) {
            eVar.f20451j = new com.bumptech.glide.load.engine.cache.i(new com.bumptech.glide.load.engine.cache.g(applicationContext));
        }
        if (eVar.f20452k == null) {
            eVar.f20452k = new com.bumptech.glide.manager.b();
        }
        if (eVar.f20445d == null) {
            int i13 = eVar.f20451j.f20635a;
            if (i13 > 0) {
                eVar.f20445d = new com.bumptech.glide.load.engine.bitmap_recycle.h(i13);
            } else {
                eVar.f20445d = new com.bumptech.glide.load.engine.bitmap_recycle.g();
            }
        }
        if (eVar.f20446e == null) {
            eVar.f20446e = new com.bumptech.glide.load.engine.bitmap_recycle.f(eVar.f20451j.f20637c);
        }
        if (eVar.f20447f == null) {
            eVar.f20447f = new com.bumptech.glide.load.engine.cache.f(eVar.f20451j.f20636b);
        }
        if (eVar.f20450i == null) {
            eVar.f20450i = new com.bumptech.glide.load.engine.cache.e(new com.bumptech.glide.load.engine.cache.h(applicationContext, 3), 262144000L);
        }
        if (eVar.f20444c == null) {
            eVar.f20444c = new com.bumptech.glide.load.engine.m(eVar.f20447f, eVar.f20450i, eVar.f20449h, eVar.f20448g, new p359y1.b(new ShadowThreadPoolExecutor(0, Integer.MAX_VALUE, p359y1.b.f44028b, TimeUnit.MILLISECONDS, (BlockingQueue<Runnable>) new SynchronousQueue(), (ThreadFactory) new p359y1.a(new androidx.camera.core.impl.utils.executor.e(3), "source-unlimited", false), "\u200bcom.bumptech.glide.load.engine.executor.GlideExecutor", true)), eVar.f20456o);
        }
        List list3 = eVar.f20457p;
        if (list3 == null) {
            eVar.f20457p = Collections.EMPTY_LIST;
        } else {
            eVar.f20457p = Collections.unmodifiableList(list3);
        }
        p319v5.c cVar = eVar.f20443b;
        cVar.getClass();
        b bVar = new b(applicationContext, eVar.f20444c, eVar.f20447f, eVar.f20445d, eVar.f20446e, new com.bumptech.glide.manager.j(eVar.f20455n), eVar.f20452k, eVar.f20453l, eVar.f20454m, eVar.f20442a, eVar.f20457p, list, generatedAppGlideModule, new Oe.a(cVar));
        applicationContext.registerComponentCallbacks(bVar);
        f20431o = bVar;
    }

    public static p e(Context context) {
        return c(context).c(context);
    }

    public static p f(View view) {
        com.bumptech.glide.manager.j jVarC = c(view.getContext());
        jVarC.getClass();
        char[] cArr = J1.o.f4478a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return jVarC.c(view.getContext().getApplicationContext());
        }
        J1.g.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = com.bumptech.glide.manager.j.a(view.getContext());
        if (activityA == null) {
            return jVarC.c(view.getContext().getApplicationContext());
        }
        if (!(activityA instanceof E)) {
            return jVarC.c(view.getContext().getApplicationContext());
        }
        E e10 = (E) activityA;
        M.f fVar = jVarC.f21050c;
        fVar.clear();
        com.bumptech.glide.manager.j.b(e10.getSupportFragmentManager().f17069c.f(), fVar);
        View viewFindViewById = e10.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) fVar.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        fVar.clear();
        return fragment != null ? jVarC.d(fragment) : jVarC.e(e10);
    }

    public final void a() {
        J1.o.a();
        this.f20435c.clearMemory();
        this.f20434b.clearMemory();
        this.f20437e.clearMemory();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        J1.o.a();
        synchronized (this.f20440i) {
            try {
                Iterator it = this.f20440i.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20435c.trimMemory(i7);
        this.f20434b.trimMemory(i7);
        this.f20437e.trimMemory(i7);
    }
}
