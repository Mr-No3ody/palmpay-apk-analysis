package org.chromium.net.apihelpers;

import androidx.annotation.Nullable;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface CronetRequestCompletionListener<T> {
    void onCanceled(@Nullable UrlResponseInfo urlResponseInfo);

    void onFailed(@Nullable UrlResponseInfo urlResponseInfo, CronetException cronetException);

    void onSucceeded(UrlResponseInfo urlResponseInfo, T t);
}
