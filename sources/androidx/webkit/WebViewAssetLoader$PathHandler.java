package androidx.webkit;

import android.webkit.WebResourceResponse;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes.dex */
public interface WebViewAssetLoader$PathHandler {
    @WorkerThread
    WebResourceResponse handle(String str);
}
