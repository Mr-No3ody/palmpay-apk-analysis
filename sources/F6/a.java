package F6;

import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.TextView;
import androidx.camera.core.impl.utils.futures.j;
import androidx.camera.core.impl.utils.futures.m;
import androidx.concurrent.futures.k;
import androidx.work.impl.background.systemalarm.h;
import com.google.common.util.concurrent.ListenableFuture;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2598d;

    public /* synthetic */ a(Object obj, Object obj2, int i7, int i10) {
        this.f2595a = i10;
        this.f2597c = obj;
        this.f2598d = obj2;
        this.f2596b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        k kVar;
        ArrayList arrayList2;
        switch (this.f2595a) {
            case 0:
                int i7 = this.f2596b;
                String str = ((c) this.f2597c).f2600a;
                String strConcat = ": ".concat((String) this.f2598d);
                synchronized (d.f2608h) {
                    try {
                        Date date = new Date();
                        if (d.f2605e == null) {
                            d.f2605e = new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS ", Locale.getDefault());
                        }
                        String str2 = d.f2605e.format(date);
                        String strSubstring = str2.substring(0, 8);
                        String strE = d.e(date);
                        if (!d.a(strE, strSubstring)) {
                            Log.e("PpLog", "create " + strE + " failed!");
                            return;
                        }
                        d.g(strE, str2.substring(9) + d.f2601a[i7 - 2] + "/" + str + strConcat + d.f2603c);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                ((TextView) this.f2597c).setTypeface((Typeface) this.f2598d, this.f2596b);
                return;
            case 2:
                int i10 = this.f2596b;
                ListenableFuture listenableFuture = (ListenableFuture) this.f2597c;
                m mVar = (m) this.f2598d;
                AtomicInteger atomicInteger = mVar.f14218d;
                ArrayList arrayList3 = mVar.f14216b;
                boolean zIsDone = mVar.isDone();
                boolean z3 = mVar.f14217c;
                if (zIsDone || arrayList3 == null) {
                    p118hf.a.k(z3, "Future was done before all dependencies completed");
                    return;
                }
                try {
                    p118hf.a.k(listenableFuture.isDone(), "Tried to set value from future which is not done");
                    arrayList3.set(i10, j.c(listenableFuture));
                    int iDecrementAndGet = atomicInteger.decrementAndGet();
                    p118hf.a.k(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet == 0) {
                        if (arrayList != null) {
                            kVar = mVar.f14220f;
                            arrayList2 = new ArrayList(arrayList);
                            kVar.b(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (ExecutionException e10) {
                    if (z3) {
                        mVar.f14220f.d(e10.getCause());
                    }
                    int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                    p118hf.a.k(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet2 == 0) {
                        if (arrayList != null) {
                            kVar = mVar.f14220f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (CancellationException unused) {
                    if (z3) {
                        mVar.cancel(false);
                    }
                    int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                    p118hf.a.k(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet3 == 0) {
                        if (arrayList != null) {
                            kVar = mVar.f14220f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (Error e11) {
                    mVar.f14220f.d(e11);
                    int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                    p118hf.a.k(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        if (arrayList != null) {
                            kVar = mVar.f14220f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } catch (RuntimeException e12) {
                    if (z3) {
                        mVar.f14220f.d(e12);
                    }
                    int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                    p118hf.a.k(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet5 == 0) {
                        if (arrayList != null) {
                            kVar = mVar.f14220f;
                            arrayList2 = new ArrayList(arrayList);
                        }
                        return;
                    }
                    return;
                } finally {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    p118hf.a.k(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet6 == 0) {
                        arrayList = mVar.f14216b;
                        if (arrayList != null) {
                            mVar.f14220f.b(new ArrayList(arrayList));
                        } else {
                            p118hf.a.k(mVar.isDone(), null);
                        }
                    }
                }
            default:
                ((h) this.f2597c).a(this.f2596b, (Intent) this.f2598d);
                return;
        }
    }

    public a(m mVar, int i7, ListenableFuture listenableFuture) {
        this.f2595a = 2;
        this.f2598d = mVar;
        this.f2596b = i7;
        this.f2597c = listenableFuture;
    }

    public a(int i7, c cVar, String str) {
        this.f2595a = 0;
        this.f2596b = i7;
        this.f2597c = cVar;
        this.f2598d = str;
    }
}
