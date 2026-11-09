package p038ca;

import G9.i;
import V3.d;
import android.content.Intent;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.h;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import kotlin.jvm.internal.Intrinsics;
import p177m.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ActivityResultCaller caller, h hVar, String str) {
        super(caller, hVar, str, new l());
        Intrinsics.checkNotNullParameter(caller, "caller");
    }

    public final void f(Intent intent, Argument2Callback onActivityResult) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(onActivityResult, "onActivityResult");
        d(intent, new i(onActivityResult, 4));
    }
}
