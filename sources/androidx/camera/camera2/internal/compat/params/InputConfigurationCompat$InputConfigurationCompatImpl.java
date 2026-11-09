package androidx.camera.camera2.internal.compat.params;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
interface InputConfigurationCompat$InputConfigurationCompatImpl {
    int getFormat();

    int getHeight();

    @Nullable
    Object getInputConfiguration();

    int getWidth();

    boolean isMultiResolution();
}
