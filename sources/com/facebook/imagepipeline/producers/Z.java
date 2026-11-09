package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f21522b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Closeable f21523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1340e f21526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Y f21527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1344i f21528h;

    public Z(C1344i c1344i, Object obj) {
        this.f21528h = c1344i;
        this.f21521a = obj;
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final boolean a(Consumer consumer, ProducerContext producerContext) {
        Z z3;
        Pair pairCreate = Pair.create(consumer, producerContext);
        synchronized (this) {
            try {
                C1344i c1344i = this.f21528h;
                Object obj = this.f21521a;
                synchronized (c1344i) {
                    z3 = (Z) c1344i.f21575a.get(obj);
                }
                if (z3 != this) {
                    return false;
                }
                this.f21522b.add(pairCreate);
                ArrayList arrayListK = k();
                ArrayList arrayListL = l();
                ArrayList arrayListJ = j();
                Closeable closeableA = this.f21523c;
                float f10 = this.f21524d;
                int i7 = this.f21525e;
                C1340e.b(arrayListK);
                C1340e.c(arrayListL);
                C1340e.a(arrayListJ);
                synchronized (pairCreate) {
                    try {
                        synchronized (this) {
                            try {
                                if (closeableA != this.f21523c) {
                                    closeableA = null;
                                } else if (closeableA != null) {
                                    closeableA = this.f21528h.a(closeableA);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (closeableA != null) {
                            if (f10 > 0.0f) {
                                consumer.onProgressUpdate(f10);
                            }
                            consumer.onNewResult(closeableA, i7);
                            b(closeableA);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                producerContext.addCallbacks(new X(0, this, pairCreate));
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final synchronized boolean c() {
        Iterator it = this.f21522b.iterator();
        while (it.hasNext()) {
            if (((ProducerContext) ((Pair) it.next()).second).isIntermediateResultExpected()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean d() {
        Iterator it = this.f21522b.iterator();
        while (it.hasNext()) {
            if (!((ProducerContext) ((Pair) it.next()).second).isPrefetch()) {
                return false;
            }
        }
        return true;
    }

    public final synchronized com.facebook.imagepipeline.common.e e() {
        com.facebook.imagepipeline.common.e higherPriority;
        higherPriority = com.facebook.imagepipeline.common.e.f21428b;
        Iterator it = this.f21522b.iterator();
        while (it.hasNext()) {
            higherPriority = com.facebook.imagepipeline.common.e.f21427a.getHigherPriority(higherPriority, ((ProducerContext) ((Pair) it.next()).second).getPriority());
        }
        return higherPriority;
    }

    public final void f(Y y8, Throwable th) {
        synchronized (this) {
            try {
                if (this.f21527g != y8) {
                    return;
                }
                this.f21522b.clear();
                this.f21528h.b(this.f21521a, this);
                b(this.f21523c);
                this.f21523c = null;
                for (Pair pair : this.f21522b) {
                    synchronized (pair) {
                        try {
                            ((ProducerContext) pair.second).getProducerListener().onProducerFinishWithFailure((ProducerContext) pair.second, this.f21528h.f21578d, th, null);
                            C1340e c1340e = this.f21526f;
                            if (c1340e != null) {
                                ((ProducerContext) pair.second).putExtras(c1340e.f21557g);
                            }
                            ((Consumer) pair.first).onFailure(th);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void g(Y y8, Closeable closeable, int i7) {
        synchronized (this) {
            try {
                if (this.f21527g != y8) {
                    return;
                }
                b(this.f21523c);
                this.f21523c = null;
                int size = this.f21522b.size();
                if (AbstractC1338c.b(i7)) {
                    this.f21523c = this.f21528h.a(closeable);
                    this.f21525e = i7;
                } else {
                    this.f21522b.clear();
                    this.f21528h.b(this.f21521a, this);
                }
                for (Pair pair : this.f21522b) {
                    synchronized (pair) {
                        try {
                            if (AbstractC1338c.a(i7)) {
                                ((ProducerContext) pair.second).getProducerListener().onProducerFinishWithSuccess((ProducerContext) pair.second, this.f21528h.f21578d, null);
                                C1340e c1340e = this.f21526f;
                                if (c1340e != null) {
                                    ((ProducerContext) pair.second).putExtras(c1340e.f21557g);
                                }
                                ((ProducerContext) pair.second).putExtra(this.f21528h.f21579e, Integer.valueOf(size));
                            }
                            ((Consumer) pair.first).onNewResult(closeable, i7);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(Y y8, float f10) {
        synchronized (this) {
            try {
                if (this.f21527g != y8) {
                    return;
                }
                this.f21524d = f10;
                for (Pair pair : this.f21522b) {
                    synchronized (pair) {
                        ((Consumer) pair.first).onProgressUpdate(f10);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(int i7) {
        String str;
        synchronized (this) {
            try {
                boolean z3 = false;
                if (!(this.f21526f == null)) {
                    throw new IllegalArgumentException();
                }
                if (!(this.f21527g == null)) {
                    throw new IllegalArgumentException();
                }
                if (this.f21522b.isEmpty()) {
                    this.f21528h.b(this.f21521a, this);
                    return;
                }
                ProducerContext producerContext = (ProducerContext) ((Pair) this.f21522b.iterator().next()).second;
                C1340e c1340e = new C1340e(producerContext.getImageRequest(), producerContext.getId(), null, producerContext.getProducerListener(), producerContext.getCallerContext(), producerContext.getLowestPermittedRequestLevel(), d(), c(), e(), producerContext.getImagePipelineConfig());
                this.f21526f = c1340e;
                c1340e.putExtras(producerContext.getExtras());
                if (i7 == 0) {
                    throw null;
                }
                if (i7 != 3) {
                    C1340e c1340e2 = this.f21526f;
                    int i10 = androidx.camera.camera2.internal.F.i(i7);
                    if (i10 == 0) {
                        z3 = true;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            throw new IllegalStateException("No boolean equivalent for UNSET");
                        }
                        if (i7 == 1) {
                            str = "YES";
                        } else if (i7 != 2) {
                            str = i7 != 3 ? BuildConfig.TRAVIS : "UNSET";
                        } else {
                            str = ResetPinVerifyTypeRsp.VERIFY_TYPE_NO;
                        }
                        throw new IllegalStateException("Unrecognized TriState value: ".concat(str));
                    }
                    c1340e2.putExtra("started_as_prefetch", Boolean.valueOf(z3));
                }
                Y y8 = new Y(this, 0);
                this.f21527g = y8;
                this.f21528h.f21576b.produceResults(y8, this.f21526f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList j() {
        C1340e c1340e = this.f21526f;
        ArrayList arrayList = null;
        if (c1340e == null) {
            return null;
        }
        boolean zC = c();
        synchronized (c1340e) {
            if (zC != c1340e.f21560o) {
                c1340e.f21560o = zC;
                arrayList = new ArrayList(c1340e.t);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList k() {
        C1340e c1340e = this.f21526f;
        ArrayList arrayList = null;
        if (c1340e == null) {
            return null;
        }
        boolean zD = d();
        synchronized (c1340e) {
            if (zD != c1340e.f21558i) {
                c1340e.f21558i = zD;
                arrayList = new ArrayList(c1340e.t);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList l() {
        C1340e c1340e = this.f21526f;
        if (c1340e == null) {
            return null;
        }
        return c1340e.e(e());
    }
}
