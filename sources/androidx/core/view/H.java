package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(@NonNull View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void c(View view, int i7) {
        view.setImportantForAutofill(i7);
    }
}
