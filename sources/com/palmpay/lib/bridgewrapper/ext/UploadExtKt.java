package com.palmpay.lib.bridgewrapper.ext;

import androidx.activity.AbstractActivityC0822m;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.a;
import androidx.activity.result.g;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p177m.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I", "O", "Landroidx/activity/m;", "Lm/b;", "contract", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/a;", "registerActivityResultLauncher", "(Landroidx/activity/m;Lm/b;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/a;", "lib_bridgeWrapper_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class UploadExtKt {
    @NotNull
    public static final <I, O> a registerActivityResultLauncher(@NotNull AbstractActivityC0822m abstractActivityC0822m, @NotNull b contract, @NotNull ActivityResultCallback<O> callback) {
        Intrinsics.checkNotNullParameter(abstractActivityC0822m, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        g gVarD = abstractActivityC0822m.getActivityResultRegistry().d(string, contract, callback);
        Intrinsics.checkNotNullExpressionValue(gVarD, "activityResultRegistry.r…(key, contract, callback)");
        return gVarD;
    }
}
