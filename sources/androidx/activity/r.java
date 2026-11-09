package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class r extends q {
    @Override // androidx.activity.u, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void adjustLayoutInDisplayCutoutMode(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
