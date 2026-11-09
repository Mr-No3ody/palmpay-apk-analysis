package p360y2;

import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DataSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f44043b;

    public d(e eVar, int i7) {
        this.f44043b = eVar;
        this.f44042a = i7;
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onFailure(DataSource dataSource) {
        e.g(this.f44043b, this.f44042a, dataSource);
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onNewResult(DataSource dataSource) {
        Throwable th;
        int i7;
        if (!dataSource.hasResult()) {
            if (dataSource.isFinished()) {
                e.g(this.f44043b, this.f44042a, dataSource);
                return;
            }
            return;
        }
        e eVar = this.f44043b;
        int i10 = this.f44042a;
        boolean zIsFinished = dataSource.isFinished();
        synchronized (eVar) {
            try {
                int i11 = eVar.f44045i;
                if (dataSource == eVar.i(i10) && i10 != eVar.f44045i) {
                    if (eVar.j() == null || (zIsFinished && i10 < eVar.f44045i)) {
                        eVar.f44045i = i10;
                        i7 = i10;
                    } else {
                        i7 = i11;
                    }
                    while (i11 > i7) {
                        DataSource dataSourceH = eVar.h(i11);
                        if (dataSourceH != null) {
                            dataSourceH.close();
                        }
                        i11--;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (dataSource == eVar.j()) {
            eVar.e(null, i10 == 0 && dataSource.isFinished(), dataSource.getExtras());
        }
        if (eVar.f44047k.incrementAndGet() != eVar.f44046j || (th = eVar.f44048l) == null) {
            return;
        }
        eVar.c(th, eVar.f44049m);
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onProgressUpdate(DataSource dataSource) {
        if (this.f44042a == 0) {
            this.f44043b.d(dataSource.getProgress());
        }
    }

    @Override // com.facebook.datasource.DataSubscriber
    public final void onCancellation(DataSource dataSource) {
    }
}
