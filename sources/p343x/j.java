package p343x;

import android.view.Window;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    @DoNotInline
    public static void a(Window.Callback callback, boolean z3) {
        callback.onPointerCaptureChanged(z3);
    }
}
