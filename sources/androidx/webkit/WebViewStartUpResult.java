package androidx.webkit;

import android.annotation.SuppressLint;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@WebViewCompat$ExperimentalAsyncStartUp
public interface WebViewStartUpResult {
    @SuppressLint({"AutoBoxing"})
    Long getMaxTimePerTaskInUiThreadMillis();

    @SuppressLint({"NullableCollection"})
    List<StartUpLocation> getNonUiThreadBlockingStartUpLocations();

    @SuppressLint({"AutoBoxing"})
    Long getTotalTimeInUiThreadMillis();

    @SuppressLint({"NullableCollection"})
    List<StartUpLocation> getUiThreadBlockingStartUpLocations();
}
