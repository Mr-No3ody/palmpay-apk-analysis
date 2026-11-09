package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface UseCaseConfigFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S0 f13993a = new S0();

    public interface Provider {
        @NonNull
        UseCaseConfigFactory newInstance(@NonNull Context context) throws E.T;
    }

    @Nullable
    Config getConfig(@NonNull T0 t1, int i7);
}
