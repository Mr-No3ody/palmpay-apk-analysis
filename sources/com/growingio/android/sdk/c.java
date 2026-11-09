package com.growingio.android.sdk;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import p094g5.e;
import p198n5.h;
import p279s5.l;
import p279s5.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f23194a;

    public final void a(HashMap map) {
        if (this.f23194a) {
            if (map.isEmpty()) {
                h.c("GrowingIO Track SDK", "setLoginUserAttributes: attributes is NULL", new Object[0]);
                return;
            }
            HashMap map2 = new HashMap(map);
            e5.d dVar = e5.c.f36164a;
            e eVar = new e();
            eVar.f37297z = map2;
            dVar.y(eVar);
        }
    }

    public void b(Application application) {
        d dVar = d.f23195b;
        synchronized (d.class) {
            try {
                if (d.f23195b == null) {
                    d.f23195b = new d(application);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p279s5.b bVar = p279s5.a.f42018a;
        application.registerActivityLifecycleCallbacks(bVar);
        bVar.r(p279s5.h.f42027a);
        m mVar = l.f42040a;
        mVar.f42041a.clear();
        bVar.r(mVar);
        try {
            ((GeneratedGioModule) GeneratedGioModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(application.getApplicationContext())).registerComponents(application, d.a().f23197a);
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("GeneratedGioModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException("GeneratedGioModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
        } catch (NoSuchMethodException e12) {
            throw new IllegalStateException("GeneratedGioModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
        } catch (InvocationTargetException e13) {
            throw new IllegalStateException("GeneratedGioModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
        }
        Iterator it = ((a) p279s5.d.b().f42025b).f23193p.iterator();
        while (it.hasNext()) {
            ((b) it.next()).registerComponents(application, d.a().f23197a);
        }
    }

    public final void c(String str, HashMap map) {
        if (this.f23194a) {
            if (TextUtils.isEmpty(str)) {
                h.c("GrowingIO Track SDK", "trackCustomEvent: eventName is NULL", new Object[0]);
                return;
            }
            HashMap map2 = new HashMap(map);
            e5.d dVar = e5.c.f36164a;
            p094g5.c cVar = new p094g5.c();
            cVar.f36852A = str;
            cVar.f37297z = map2;
            dVar.y(cVar);
        }
    }
}
