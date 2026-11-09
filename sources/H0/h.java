package H0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    @DoNotInline
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
