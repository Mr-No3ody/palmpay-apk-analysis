package Q8;

import B6.RunnableC0085g;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f7641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7642b;

    public e(View view, View view2) {
        this.f7641a = view;
        this.f7642b = view2;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView view, int i7) {
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onProgressChanged(view, i7);
        if (i7 != 100 || (view2 = this.f7641a) == null) {
            return;
        }
        view2.post(new RunnableC0085g(20, view2, this.f7642b));
    }
}
