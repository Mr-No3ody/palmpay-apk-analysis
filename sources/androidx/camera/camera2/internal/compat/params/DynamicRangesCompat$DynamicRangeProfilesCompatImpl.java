package androidx.camera.camera2.internal.compat.params;

import E.C0216v;
import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
interface DynamicRangesCompat$DynamicRangeProfilesCompatImpl {
    @NonNull
    Set<C0216v> getDynamicRangeCaptureRequestConstraints(@NonNull C0216v c0216v);

    @NonNull
    Set<C0216v> getSupportedDynamicRanges();

    boolean isExtraLatencyPresent(@NonNull C0216v c0216v);

    @Nullable
    DynamicRangeProfiles unwrap();
}
