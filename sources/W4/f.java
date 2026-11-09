package W4;

import com.growingio.android.sdk.track.async.Callback;
import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoadDataFetcher.DataCallback f10559a;

    public f(LoadDataFetcher.DataCallback dataCallback) {
        this.f10559a = dataCallback;
    }

    @Override // com.growingio.android.sdk.track.async.Callback
    public final void onFailed() {
        this.f10559a.onLoadFailed(new RuntimeException("getWebViewDomTree error"));
    }

    @Override // com.growingio.android.sdk.track.async.Callback
    public final void onSuccess(Object obj) {
        this.f10559a.onDataReady(new p264r5.c((JSONObject) obj));
    }
}
