package com.growingio.android.sdk.track.middleware.format;

import com.growingio.android.sdk.track.modelloader.DataFetcher;
import java.util.List;
import p216o5.d;

/* JADX INFO: loaded from: classes3.dex */
public interface FormatDataFetcher<T> extends DataFetcher<T> {
    T format(d gEvent);

    T merge(List<byte[]> events);
}
