package p177m;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l extends b {
    static {
        new k(null);
    }

    @Override // p177m.b
    public final Intent createIntent(Context context, Object obj) {
        Intent input = (Intent) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // p177m.b
    public final Object parseResult(int i7, Intent intent) {
        return new ActivityResult(i7, intent);
    }
}
