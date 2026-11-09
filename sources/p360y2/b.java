package p360y2;

import android.util.Pair;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p7.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f44035a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f44038d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f44039e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f44040f = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44037c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44036b = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedQueue f44041g = new ConcurrentLinkedQueue();

    public final void b() {
        boolean zHasFailed = hasFailed();
        boolean zF = f();
        for (Pair pair : this.f44041g) {
            ((Executor) pair.second).execute(new a(this, zHasFailed, (DataSubscriber) pair.first, zF));
        }
    }

    public final boolean c(Throwable th, Map map) {
        boolean z3;
        synchronized (this) {
            if (this.f44037c) {
                z3 = false;
            } else {
                z3 = true;
                if (this.f44036b != 1) {
                    z3 = false;
                } else {
                    this.f44036b = 3;
                    this.f44039e = th;
                    this.f44035a = map;
                }
            }
        }
        if (z3) {
            b();
        }
        return z3;
    }

    @Override // com.facebook.datasource.DataSource
    public boolean close() {
        synchronized (this) {
            try {
                if (this.f44037c) {
                    return false;
                }
                this.f44037c = true;
                Object obj = this.f44038d;
                this.f44038d = null;
                if (obj != null) {
                    a(obj);
                }
                if (!isFinished()) {
                    b();
                }
                synchronized (this) {
                    this.f44041g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(float f10) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            if (!this.f44037c && this.f44036b == 1 && f10 >= this.f44040f) {
                this.f44040f = f10;
                z3 = true;
            }
        }
        if (z3) {
            for (Pair pair : this.f44041g) {
                ((Executor) pair.second).execute(new h(23, this, (DataSubscriber) pair.first));
            }
        }
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0029 A[PHI: r1 r3
      0x0029: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:27:0x0033, B:21:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r3v7 java.lang.Object) = (r3v0 java.lang.Object), (r3v10 java.lang.Object) binds: [B:27:0x0033, B:21:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003c). Please report as a decompilation issue!!! */
    public final boolean e(Object obj, boolean z3, Map map) {
        boolean z8;
        this.f44035a = map;
        Object obj2 = null;
        try {
            synchronized (this) {
                try {
                    try {
                        if (this.f44037c) {
                            z8 = false;
                            if (obj != null) {
                                a(obj);
                            }
                        } else {
                            z8 = true;
                            if (this.f44036b != 1) {
                                z8 = false;
                                if (obj != null) {
                                    a(obj);
                                }
                            } else {
                                if (z3) {
                                    this.f44036b = 2;
                                    this.f44040f = 1.0f;
                                }
                                Object obj3 = this.f44038d;
                                if (obj3 != obj) {
                                    try {
                                        this.f44038d = obj;
                                        obj = obj3;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj2 = obj3;
                                        throw th;
                                    }
                                } else {
                                    obj = null;
                                }
                                if (obj != null) {
                                    a(obj);
                                }
                            }
                        }
                        if (z8) {
                            b();
                        }
                        return z8;
                    } catch (Throwable th2) {
                        obj2 = obj;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (obj2 != null) {
                a(obj2);
            }
            throw th4;
        }
    }

    public final synchronized boolean f() {
        return isClosed() && !isFinished();
    }

    @Override // com.facebook.datasource.DataSource
    public final Map getExtras() {
        return this.f44035a;
    }

    @Override // com.facebook.datasource.DataSource
    public final synchronized Throwable getFailureCause() {
        return this.f44039e;
    }

    @Override // com.facebook.datasource.DataSource
    public final synchronized float getProgress() {
        return this.f44040f;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized Object getResult() {
        return this.f44038d;
    }

    @Override // com.facebook.datasource.DataSource
    public final synchronized boolean hasFailed() {
        return this.f44036b == 3;
    }

    @Override // com.facebook.datasource.DataSource
    public final boolean hasMultipleResults() {
        return false;
    }

    @Override // com.facebook.datasource.DataSource
    public synchronized boolean hasResult() {
        return this.f44038d != null;
    }

    @Override // com.facebook.datasource.DataSource
    public final synchronized boolean isClosed() {
        return this.f44037c;
    }

    @Override // com.facebook.datasource.DataSource
    public final synchronized boolean isFinished() {
        return this.f44036b != 1;
    }

    @Override // com.facebook.datasource.DataSource
    public final void subscribe(DataSubscriber dataSubscriber, Executor executor) {
        dataSubscriber.getClass();
        executor.getClass();
        synchronized (this) {
            try {
                if (this.f44037c) {
                    return;
                }
                boolean z3 = true;
                if (this.f44036b == 1) {
                    this.f44041g.add(Pair.create(dataSubscriber, executor));
                }
                if (!hasResult() && !isFinished() && !f()) {
                    z3 = false;
                }
                if (z3) {
                    executor.execute(new a(this, hasFailed(), dataSubscriber, f()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Object obj) {
    }
}
