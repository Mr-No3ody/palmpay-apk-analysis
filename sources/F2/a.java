package F2;

import com.facebook.datasource.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p360y2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f2531c;

    public a(c cVar, String str, boolean z3) {
        this.f2531c = cVar;
        this.f2529a = str;
        this.f2530b = z3;
    }

    @Override // p360y2.c
    public final void onFailureImpl(DataSource dataSource) {
        this.f2531c.k(this.f2529a, dataSource, dataSource.getFailureCause(), true);
    }

    @Override // p360y2.c
    public final void onNewResultImpl(DataSource dataSource) {
        boolean zIsFinished = dataSource.isFinished();
        boolean zHasMultipleResults = dataSource.hasMultipleResults();
        float progress = dataSource.getProgress();
        Object result = dataSource.getResult();
        if (result != null) {
            this.f2531c.l(this.f2529a, dataSource, result, progress, zIsFinished, this.f2530b, zHasMultipleResults);
        } else if (zIsFinished) {
            NullPointerException nullPointerException = new NullPointerException();
            this.f2531c.k(this.f2529a, dataSource, nullPointerException, true);
        }
    }

    @Override // p360y2.c, com.facebook.datasource.DataSubscriber
    public final void onProgressUpdate(DataSource dataSource) {
        boolean zIsFinished = dataSource.isFinished();
        float progress = dataSource.getProgress();
        c cVar = this.f2531c;
        if (!cVar.g(this.f2529a, dataSource)) {
            cVar.h("ignore_old_datasource @ onProgress", null);
            dataSource.close();
        } else {
            if (zIsFinished) {
                return;
            }
            cVar.f2539f.setProgress(progress, false);
        }
    }
}
