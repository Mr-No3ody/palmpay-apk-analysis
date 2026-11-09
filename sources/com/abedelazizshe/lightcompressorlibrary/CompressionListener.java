package com.abedelazizshe.lightcompressorlibrary;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH'¨\u0006\u0011"}, d2 = {"Lcom/abedelazizshe/lightcompressorlibrary/CompressionListener;", "", "onCancelled", "", FirebaseAnalytics.Param.INDEX, "", "onFailure", "failureMessage", "", "onProgress", "percent", "", "onStart", "onSuccess", "size", "", "path", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface CompressionListener {
    @WorkerThread
    void onCancelled(int index);

    @MainThread
    void onFailure(int index, @NotNull String failureMessage);

    @WorkerThread
    void onProgress(int index, float percent);

    @MainThread
    void onStart(int index);

    @MainThread
    void onSuccess(int index, long size, @Nullable String path);
}
