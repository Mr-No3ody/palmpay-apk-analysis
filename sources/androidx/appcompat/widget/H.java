package androidx.appcompat.widget;

import android.content.res.Resources;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    @DoNotInline
    public static void a(@NonNull android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
