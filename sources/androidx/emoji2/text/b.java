package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    @DoNotInline
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
