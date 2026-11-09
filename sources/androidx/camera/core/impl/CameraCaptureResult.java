package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface CameraCaptureResult {
    @NonNull
    EnumC1006u getAeMode();

    @NonNull
    EnumC1007v getAeState();

    @NonNull
    EnumC1008w getAfMode();

    @NonNull
    EnumC1009x getAfState();

    @NonNull
    EnumC1010y getAwbMode();

    @NonNull
    EnumC1011z getAwbState();

    @Nullable
    default CaptureResult getCaptureResult() {
        return null;
    }

    @NonNull
    A getFlashState();

    @NonNull
    O0 getTagBundle();

    long getTimestamp();

    default void populateExifData(@NonNull androidx.camera.core.impl.utils.i iVar) {
        int i7;
        A flashState = getFlashState();
        iVar.getClass();
        if (flashState == A.f13828a) {
            return;
        }
        int iOrdinal = flashState.ordinal();
        if (iOrdinal == 1) {
            i7 = 32;
        } else if (iOrdinal == 2) {
            i7 = 0;
        } else {
            if (iOrdinal != 3) {
                flashState.toString();
                p140j8.f.G("ExifData");
                return;
            }
            i7 = 1;
        }
        int i10 = i7 & 1;
        ArrayList arrayList = iVar.f14228a;
        if (i10 == 1) {
            iVar.c("LightSource", String.valueOf(4), arrayList);
        }
        iVar.c("Flash", String.valueOf(i7), arrayList);
    }
}
