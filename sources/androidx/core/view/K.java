package androidx.core.view;

import android.view.View;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {
    public static CharSequence a(View view) {
        return view.getStateDescription();
    }

    @Nullable
    public static w0 b(@NonNull View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new w0(windowInsetsController);
        }
        return null;
    }

    public static void c(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
