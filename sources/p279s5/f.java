package p279s5;

import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements LoadDataFetcher.DataCallback {
    @Override // com.growingio.android.sdk.track.modelloader.LoadDataFetcher.DataCallback
    public final void onDataReady(Object obj) {
        h.a("DeepLinkProvider", "start circle choose success", new Object[0]);
    }

    @Override // com.growingio.android.sdk.track.modelloader.LoadDataFetcher.DataCallback
    public final void onLoadFailed(Exception exc) {
        h.c("DeepLinkProvider", exc.getMessage(), new Object[0]);
    }
}
