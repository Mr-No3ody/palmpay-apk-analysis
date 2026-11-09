package H0;

import android.view.Choreographer;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    @DoNotInline
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new f(runnable, 0));
    }
}
