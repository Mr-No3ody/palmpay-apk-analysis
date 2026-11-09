package androidx.transition;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class L extends PathMotion {
    @Override // androidx.transition.PathMotion
    public final Path getPath(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }
}
