package p343x;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import androidx.annotation.DoNotInline;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    @DoNotInline
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i7) {
        callback.onProvideKeyboardShortcuts(list, menu, i7);
    }
}
