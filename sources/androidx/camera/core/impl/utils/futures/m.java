package androidx.camera.core.impl.utils.futures;

import E.AbstractC0198c;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f14215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f14216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f14218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.concurrent.futures.m f14219e = AbstractC0198c.y(new Oe.a(this, 12));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.concurrent.futures.k f14220f;

    public m(ArrayList arrayList, boolean z3, androidx.camera.core.impl.utils.executor.a aVar) {
        this.f14215a = arrayList;
        this.f14216b = new ArrayList(arrayList.size());
        this.f14217c = z3;
        this.f14218d = new AtomicInteger(arrayList.size());
        addListener(new B5.c(this, 28), org.chromium.support_lib_boundary.util.b.u());
        if (this.f14215a.isEmpty()) {
            this.f14220f.b(new ArrayList(this.f14216b));
            return;
        }
        for (int i7 = 0; i7 < this.f14215a.size(); i7++) {
            this.f14216b.add(null);
        }
        ArrayList arrayList2 = this.f14215a;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ListenableFuture listenableFuture = (ListenableFuture) arrayList2.get(i10);
            listenableFuture.addListener(new F6.a(this, i10, listenableFuture), aVar);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f14219e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        ArrayList arrayList = this.f14215a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(z3);
            }
        }
        return this.f14219e.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return (List) this.f14219e.f15066b.get(j6, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14219e.f15066b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14219e.f15066b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<ListenableFuture> arrayList = this.f14215a;
        if (arrayList != null && !isDone()) {
            loop0: for (ListenableFuture listenableFuture : arrayList) {
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e10) {
                        throw e10;
                    } catch (InterruptedException e11) {
                        throw e11;
                    } catch (Throwable unused) {
                        if (this.f14217c) {
                            return (List) this.f14219e.f15066b.get();
                        }
                    }
                }
            }
        }
        return (List) this.f14219e.f15066b.get();
    }
}
