package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.p;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f21047f = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile p f21048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RequestManagerRetriever$RequestManagerFactory f21049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M.f f21050c = new M.f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameWaiter f21051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f21052e;

    public j(RequestManagerRetriever$RequestManagerFactory requestManagerRetriever$RequestManagerFactory) {
        requestManagerRetriever$RequestManagerFactory = requestManagerRetriever$RequestManagerFactory == null ? f21047f : requestManagerRetriever$RequestManagerFactory;
        this.f21049b = requestManagerRetriever$RequestManagerFactory;
        this.f21052e = new h(requestManagerRetriever$RequestManagerFactory);
        this.f21051d = (u.f20949f && u.f20948e) ? new f() : new c();
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(List list, M.f fVar) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                fVar.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager().f17069c.f(), fVar);
            }
        }
    }

    public final p c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = J1.o.f4478a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof E) {
                return e((E) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return c(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f21048a == null) {
            synchronized (this) {
                try {
                    if (this.f21048a == null) {
                        this.f21048a = this.f21049b.build(com.bumptech.glide.b.b(context.getApplicationContext()), new c(), new c(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f21048a;
    }

    public final p d(Fragment fragment) {
        J1.g.c(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        char[] cArr = J1.o.f4478a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f21051d.registerSelf(fragment.getActivity());
        }
        Z childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f21052e.b(context, com.bumptech.glide.b.b(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    public final p e(E e10) {
        char[] cArr = J1.o.f4478a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return c(e10.getApplicationContext());
        }
        if (e10.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f21051d.registerSelf(e10);
        Activity activityA = a(e10);
        return this.f21052e.b(e10, com.bumptech.glide.b.b(e10.getApplicationContext()), e10.getLifecycle(), e10.getSupportFragmentManager(), activityA == null || !activityA.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
