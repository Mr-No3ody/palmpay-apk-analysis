package W4;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.google.maps.android.BuildConfig;
import com.growingio.android.sdk.track.async.Disposable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Disposable f10554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10555b;

    public b(Disposable disposable, f fVar) {
        this.f10554a = disposable;
        this.f10555b = fVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        Disposable disposable = this.f10554a;
        if (disposable.isDisposed()) {
            return;
        }
        disposable.dispose();
        boolean zIsEmpty = TextUtils.isEmpty(str);
        f fVar = this.f10555b;
        if (zIsEmpty || BuildConfig.TRAVIS.equals(str)) {
            p198n5.h.c("HybridBridgePolicy", "getWebViewDomTree ValueCallback is NULL", new Object[0]);
            fVar.onFailed();
            return;
        }
        try {
            fVar.onSuccess(new JSONObject(str));
        } catch (JSONException e10) {
            p198n5.h.b("HybridBridgePolicy", e10);
            fVar.onFailed();
        }
    }
}
