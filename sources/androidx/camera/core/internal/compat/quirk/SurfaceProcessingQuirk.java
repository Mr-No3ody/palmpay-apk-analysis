package androidx.camera.core.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.y0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceProcessingQuirk extends Quirk {
    default boolean workaroundBySurfaceProcessing() {
        return true;
    }

    static boolean workaroundBySurfaceProcessing(@NonNull y0 y0Var) {
        Iterator it = y0Var.c(SurfaceProcessingQuirk.class).iterator();
        while (it.hasNext()) {
            if (((SurfaceProcessingQuirk) it.next()).workaroundBySurfaceProcessing()) {
                return true;
            }
        }
        return false;
    }
}
