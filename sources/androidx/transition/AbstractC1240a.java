package androidx.transition;

import android.graphics.Canvas;
import androidx.annotation.DoNotInline;

/* JADX INFO: renamed from: androidx.transition.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1240a {
    @DoNotInline
    public static void a(Canvas canvas) {
        canvas.disableZ();
    }

    @DoNotInline
    public static void b(Canvas canvas) {
        canvas.enableZ();
    }
}
