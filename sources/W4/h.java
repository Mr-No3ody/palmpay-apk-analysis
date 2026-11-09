package W4;

import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends D4.f {
    @Override // D4.f
    public final void m(String str, b bVar) {
        ((WebView) ((View) this.f1592b)).evaluateJavascript(str, bVar);
    }
}
