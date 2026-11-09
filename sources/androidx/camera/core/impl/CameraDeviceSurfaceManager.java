package androidx.camera.core.impl;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface CameraDeviceSurfaceManager {

    public interface Provider {
        @NonNull
        CameraDeviceSurfaceManager newInstance(@NonNull Context context, @Nullable Object obj, @NonNull Set<String> set) throws E.T;
    }

    @NonNull
    Pair<Map<UseCaseConfig<?>, C0993n>, Map<C0967a, C0993n>> getSuggestedStreamSpecs(int i7, @NonNull String str, @NonNull List<C0967a> list, @NonNull Map<UseCaseConfig<?>, List<Size>> map, boolean z3, boolean z8);

    @Nullable
    N0 transformSurfaceConfig(int i7, @NonNull String str, int i10, @NonNull Size size);
}
