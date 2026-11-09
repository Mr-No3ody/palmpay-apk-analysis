package p360y2;

import com.facebook.datasource.DataSubscriber;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f44031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataSubscriber f44032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f44033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f44034d;

    public a(b bVar, boolean z3, DataSubscriber dataSubscriber, boolean z8) {
        this.f44034d = bVar;
        this.f44031a = z3;
        this.f44032b = dataSubscriber;
        this.f44033c = z8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f44031a;
        b bVar = this.f44034d;
        DataSubscriber dataSubscriber = this.f44032b;
        if (z3) {
            dataSubscriber.onFailure(bVar);
        } else if (this.f44033c) {
            dataSubscriber.onCancellation(bVar);
        } else {
            dataSubscriber.onNewResult(bVar);
        }
    }
}
