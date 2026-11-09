package com.abedelazizshe.lightcompressorlibrary;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/abedelazizshe/lightcompressorlibrary/CompressionProgressListener;", "", "onProgressCancelled", "", FirebaseAnalytics.Param.INDEX, "", "onProgressChanged", "percent", "", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CompressionProgressListener {
    void onProgressCancelled(int index);

    void onProgressChanged(int index, float percent);
}
