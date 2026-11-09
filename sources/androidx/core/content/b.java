package androidx.core.content;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
