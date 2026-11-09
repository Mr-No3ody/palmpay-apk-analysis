package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    @DoNotInline
    public static void a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @DoNotInline
    public static void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @DoNotInline
    public static void c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
