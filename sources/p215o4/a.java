package p215o4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isValidActivityContext(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
        }
        if (context instanceof ContextWrapper) {
            return isValidActivityContext(((ContextWrapper) context).getBaseContext());
        }
        return true;
    }

    private a() {
    }
}
