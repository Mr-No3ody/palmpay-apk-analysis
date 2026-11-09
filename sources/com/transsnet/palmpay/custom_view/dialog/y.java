package com.transsnet.palmpay.custom_view.dialog;

import C0.G;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f31323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f31324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f31327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f31328f;

    public y() {
        this.f31325c = 64;
        this.f31326d = 5;
        this.f31323a = new ArrayDeque();
        this.f31324b = new ArrayDeque();
        this.f31328f = new ArrayDeque();
    }

    public synchronized void a() {
        try {
            Iterator it = ((ArrayDeque) this.f31323a).iterator();
            while (it.hasNext()) {
                ((Gg.f) it.next()).f3434c.cancel();
            }
            Iterator it2 = ((ArrayDeque) this.f31324b).iterator();
            while (it2.hasNext()) {
                ((Gg.f) it2.next()).f3434c.cancel();
            }
            Iterator it3 = ((ArrayDeque) this.f31328f).iterator();
            while (it3.hasNext()) {
                ((Gg.i) it3.next()).cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ExecutorService b() {
        ExecutorService executorService;
        try {
            if (((ExecutorService) this.f31327e) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = Dg.c.f1885g + " Dispatcher";
                Intrinsics.checkNotNullParameter(name, "name");
                this.f31327e = new ShadowThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, (BlockingQueue<Runnable>) synchronousQueue, (ThreadFactory) new Dg.b(name, false), "\u200bokhttp3.Dispatcher", true);
            }
            executorService = (ExecutorService) this.f31327e;
            Intrinsics.e(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public void c(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.f38893a;
        }
        e();
    }

    public void d(Gg.f call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f3433b.decrementAndGet();
        c((ArrayDeque) this.f31324b, call);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    public void e() {
        int size;
        int i7;
        Gg.f fVar;
        byte[] bArr = Dg.c.f1879a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f31323a).iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    Gg.f asyncCall = (Gg.f) it.next();
                    if (((ArrayDeque) this.f31324b).size() >= this.f31325c) {
                        break;
                    }
                    if (asyncCall.f3433b.get() < this.f31326d) {
                        it.remove();
                        asyncCall.f3433b.incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        ((ArrayDeque) this.f31324b).add(asyncCall);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f31324b).size();
                    ((ArrayDeque) this.f31328f).size();
                }
                size = arrayList.size();
                for (i7 = 0; i7 < size; i7++) {
                    fVar = (Gg.f) arrayList.get(i7);
                    ExecutorService executorService = b();
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(executorService, "executorService");
                    Gg.i iVar = fVar.f3434c;
                    byte[] bArr2 = Dg.c.f1879a;
                    try {
                        try {
                            executorService.execute(fVar);
                        } catch (RejectedExecutionException e10) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e10);
                            iVar.g(interruptedIOException);
                            fVar.f3432a.onFailure(iVar, interruptedIOException);
                            iVar.f3441a.f40653a.d(fVar);
                        }
                    } catch (Throwable th) {
                        iVar.f3441a.f40653a.d(fVar);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Unit unit = Unit.f38893a;
        size = arrayList.size();
        while (i7 < size) {
            fVar = (Gg.f) arrayList.get(i7);
            ExecutorService executorService2 = b();
            fVar.getClass();
            Intrinsics.checkNotNullParameter(executorService2, "executorService");
            Gg.i iVar2 = fVar.f3434c;
            byte[] bArr3 = Dg.c.f1879a;
            executorService2.execute(fVar);
        }
    }

    public void f(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(G.m(i7, "max < 1: ").toString());
        }
        synchronized (this) {
            this.f31325c = i7;
            Unit unit = Unit.f38893a;
        }
        e();
    }

    public void g(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(G.m(i7, "max < 1: ").toString());
        }
        synchronized (this) {
            this.f31326d = i7;
            Unit unit = Unit.f38893a;
        }
        e();
    }

    public void h() {
        int i7 = this.f31326d;
        Context context = (Context) this.f31327e;
        ToastDialog toastDialog = (i7 == 2 || i7 == 3) ? new ToastDialog(context, com.transsnet.palmpay.custom_view.t.cv_toast_dialog_v2) : new ToastDialog(context, com.transsnet.palmpay.custom_view.t.cv_toast_dialog);
        toastDialog.setMessage((String) this.f31323a);
        toastDialog.setTitle((String) this.f31324b);
        toastDialog.setIcon(this.f31325c);
        S6.a aVar = (S6.a) this.f31328f;
        if (aVar != null) {
            toastDialog.setIcon(p059e1.a.h(context, aVar, null, context.getColor(L6.b.ppColorButtonTextWhite), 32.0f));
        } else {
            toastDialog.setIcon((Drawable) null);
        }
        toastDialog.setBackground(0);
        int i10 = this.f31326d;
        if (i10 == 2 || i10 == 3) {
            toastDialog.show(2000L, i10);
        } else {
            toastDialog.show(2000L);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Serializable, java.lang.String[]] */
    public y(Bundle bundle) {
        this.f31323a = bundle.getString("positiveButton");
        this.f31324b = bundle.getString("negativeButton");
        this.f31327e = bundle.getString("rationaleMsg");
        this.f31325c = bundle.getInt("theme");
        this.f31326d = bundle.getInt("requestCode");
        this.f31328f = bundle.getStringArray("permissions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(ExecutorService executorService) {
        this();
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f31327e = executorService;
    }

    public y(Context context) {
        this.f31326d = 1;
        this.f31327e = context;
    }
}
