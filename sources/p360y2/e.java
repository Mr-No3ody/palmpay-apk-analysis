package p360y2;

import com.facebook.common.internal.Supplier;
import com.facebook.datasource.DataSource;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p180m2.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f44044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AtomicInteger f44047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f44048l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map f44049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f44050n;

    public e(f fVar) {
        this.f44050n = fVar;
        if (this.f44047k != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f44047k == null) {
                    this.f44047k = new AtomicInteger(0);
                    int size = this.f44050n.f44051a.size();
                    this.f44046j = size;
                    this.f44045i = size;
                    this.f44044h = new ArrayList(size);
                    for (int i7 = 0; i7 < size; i7++) {
                        DataSource dataSource = (DataSource) ((Supplier) this.f44050n.f44051a.get(i7)).get();
                        this.f44044h.add(dataSource);
                        dataSource.subscribe(new d(this, i7), a.f39461a);
                        if (dataSource.hasResult()) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(e eVar, int i7, DataSource dataSource) {
        DataSource dataSourceH;
        Throwable th;
        synchronized (eVar) {
            if (dataSource == eVar.j()) {
                dataSourceH = null;
            } else {
                dataSourceH = dataSource == eVar.i(i7) ? eVar.h(i7) : dataSource;
            }
        }
        if (dataSourceH != null) {
            dataSourceH.close();
        }
        if (i7 == 0) {
            eVar.f44048l = dataSource.getFailureCause();
            eVar.f44049m = dataSource.getExtras();
        }
        if (eVar.f44047k.incrementAndGet() != eVar.f44046j || (th = eVar.f44048l) == null) {
            return;
        }
        eVar.c(th, eVar.f44049m);
    }

    @Override // p360y2.b, com.facebook.datasource.DataSource
    public final boolean close() {
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                ArrayList arrayList = this.f44044h;
                this.f44044h = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    DataSource dataSource = (DataSource) arrayList.get(i7);
                    if (dataSource != null) {
                        dataSource.close();
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p360y2.b, com.facebook.datasource.DataSource
    public final synchronized Object getResult() {
        DataSource dataSourceJ;
        dataSourceJ = j();
        return dataSourceJ != null ? dataSourceJ.getResult() : null;
    }

    public final synchronized DataSource h(int i7) {
        DataSource dataSource;
        ArrayList arrayList = this.f44044h;
        dataSource = null;
        if (arrayList != null && i7 < arrayList.size()) {
            dataSource = (DataSource) this.f44044h.set(i7, null);
        }
        return dataSource;
    }

    @Override // p360y2.b, com.facebook.datasource.DataSource
    public final synchronized boolean hasResult() {
        DataSource dataSourceJ;
        dataSourceJ = j();
        return dataSourceJ != null && dataSourceJ.hasResult();
    }

    public final synchronized DataSource i(int i7) {
        ArrayList arrayList;
        arrayList = this.f44044h;
        return (arrayList == null || i7 >= arrayList.size()) ? null : (DataSource) this.f44044h.get(i7);
    }

    public final synchronized DataSource j() {
        return i(this.f44045i);
    }
}
