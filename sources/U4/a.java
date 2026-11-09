package U4;

import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements LoadDataFetcher.DataCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p047d5.b f9208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f9209b;

    public a(b bVar, p047d5.b bVar2) {
        this.f9209b = bVar;
        this.f9208a = bVar2;
    }

    @Override // com.growingio.android.sdk.track.modelloader.LoadDataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        p047d5.b bVar = this.f9208a;
        b bVar2 = this.f9209b;
        j jVarC = bVar2.c(bVar);
        ArrayList arrayList = bVar2.f9215f;
        jVarC.f9264l = ((p264r5.c) obj).f41568a;
        arrayList.add(new k(jVarC));
        bVar2.a();
    }

    @Override // com.growingio.android.sdk.track.modelloader.LoadDataFetcher.DataCallback
    public final void onLoadFailed(Exception exc) {
        this.f9209b.a();
    }
}
