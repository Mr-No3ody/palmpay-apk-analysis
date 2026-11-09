package j4;

import android.R;
import android.app.Activity;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void assistActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        new b(activity.findViewById(R.id.content));
    }

    private a() {
    }

    public final void assistActivity(@NotNull View content) {
        Intrinsics.checkNotNullParameter(content, "content");
        new b(content);
    }
}
