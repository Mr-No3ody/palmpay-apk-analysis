package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.y0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends Quirk {
    default boolean workaroundByCaptureIntentPreview() {
        return true;
    }

    static boolean workaroundByCaptureIntentPreview(@NonNull y0 y0Var) {
        Iterator it = y0Var.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).workaroundByCaptureIntentPreview()) {
                return true;
            }
        }
        return false;
    }
}
