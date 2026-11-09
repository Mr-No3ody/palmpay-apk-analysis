package androidx.transition;

import android.graphics.Matrix;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: androidx.transition.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1264z {
    @DoNotInline
    public static void a(ImageView imageView, Matrix matrix) {
        imageView.animateTransform(matrix);
    }
}
