package R0;

import android.os.Trace;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(String str, int i7) {
        Trace.beginAsyncSection(str, i7);
    }

    public static void b(String str, int i7) {
        Trace.endAsyncSection(str, i7);
    }

    @DoNotInline
    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(int i7, String str) {
        Trace.setCounter(str, i7);
    }
}
