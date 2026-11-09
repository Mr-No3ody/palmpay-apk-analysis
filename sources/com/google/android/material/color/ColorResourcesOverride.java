package com.google.android.material.color;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Map;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public interface ColorResourcesOverride {
    @Nullable
    static ColorResourcesOverride getInstance() {
        int i7 = Build.VERSION.SDK_INT;
        if (30 <= i7 && i7 <= 33) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        if (i7 >= 34) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        return null;
    }

    boolean applyIfPossible(@NonNull Context context, @NonNull Map<Integer, Integer> map);

    @NonNull
    Context wrapContextIfPossible(@NonNull Context context, @NonNull Map<Integer, Integer> map);
}
