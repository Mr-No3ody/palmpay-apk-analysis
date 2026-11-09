package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    @Nullable
    public static String[] a(@NonNull View view) {
        return view.getReceiveContentMimeTypes();
    }

    @Nullable
    public static C1054f b(@NonNull View view, @NonNull C1054f c1054f) {
        ContentInfo wrapped = c1054f.f16217a.getWrapped();
        Objects.requireNonNull(wrapped);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(wrapped);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == wrapped ? c1054f : new C1054f(new C1052d(contentInfoPerformReceiveContent));
    }
}
