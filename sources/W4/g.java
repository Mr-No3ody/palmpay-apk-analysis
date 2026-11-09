package W4;

import M7.s;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.webkit.WebView;
import com.growingio.android.sdk.track.async.Disposable;
import com.growingio.android.sdk.track.modelloader.LoadDataFetcher;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements LoadDataFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p264r5.b f10560a;

    public g(p264r5.b bVar) {
        this.f10560a = bVar;
    }

    public final D4.f a() {
        p264r5.b bVar = this.f10560a;
        View view = bVar.f41566a;
        if (view instanceof WebView) {
            return new h((WebView) view, 2);
        }
        if (p291t5.a.c(view)) {
            return new k(bVar.f41566a, 2);
        }
        if (p291t5.a.b(bVar.f41566a)) {
            return new i(bVar.f41566a, 2);
        }
        return null;
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public final Object executeData() {
        return new p264r5.c(new JSONObject());
    }

    @Override // com.growingio.android.sdk.track.modelloader.DataFetcher
    public final Class getDataClass() {
        return p264r5.c.class;
    }

    @Override // com.growingio.android.sdk.track.modelloader.LoadDataFetcher
    public final void loadData(LoadDataFetcher.DataCallback dataCallback) {
        Disposable disposable;
        if (this.f10560a.f41566a == null) {
            dataCallback.onLoadFailed(new NullPointerException("webview is null"));
            return;
        }
        D4.f fVarA = a();
        if (fVarA == null) {
            dataCallback.onLoadFailed(new IllegalArgumentException(this.f10560a.f41566a.getClass().getName().concat("is not webView")));
            return;
        }
        d dVar = c.f10556a;
        f fVar = new f(dataCallback);
        dVar.getClass();
        p198n5.h.a("HybridBridgePolicy", "getWebViewDomTree", new Object[0]);
        p078f5.a aVar = p078f5.a.f36401a;
        p078f5.c cVar = new p078f5.c();
        s sVar = new s(fVar, 29);
        if (!cVar.f36408b) {
            disposable = aVar;
            Handler handler = cVar.f36407a;
            p078f5.b bVar = new p078f5.b(handler, sVar);
            Message messageObtain = Message.obtain(handler, bVar);
            messageObtain.obj = cVar;
            cVar.f36407a.sendMessageDelayed(messageObtain, 5000L);
            disposable = bVar;
        }
        disposable = aVar;
        int[] iArr = new int[2];
        ((View) fVarA.f1592b).getLocationOnScreen(iArr);
        fVarA.m("javascript:window.GrowingWebViewJavascriptBridge.getDomTree(" + iArr[0] + ", " + iArr[1] + ", " + ((View) fVarA.f1592b).getWidth() + ", " + ((View) fVarA.f1592b).getHeight() + ", 100)", new b(disposable, fVar));
    }
}
