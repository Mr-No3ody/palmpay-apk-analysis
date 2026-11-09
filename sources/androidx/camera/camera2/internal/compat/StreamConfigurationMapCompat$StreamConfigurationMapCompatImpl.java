package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
interface StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl {
    @Nullable
    Size[] getHighResolutionOutputSizes(int i7);

    @Nullable
    int[] getOutputFormats();

    @Nullable
    Size[] getOutputSizes(int i7);

    @Nullable
    <T> Size[] getOutputSizes(@NonNull Class<T> cls);

    @NonNull
    /* JADX INFO: renamed from: unwrap */
    StreamConfigurationMap mo70unwrap();
}
