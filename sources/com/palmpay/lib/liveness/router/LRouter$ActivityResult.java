package com.palmpay.lib.liveness.router;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/palmpay/lib/liveness/router/LRouter$ActivityResult", "", "", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "onActivityResult", "(ILandroid/content/Intent;)V", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface LRouter$ActivityResult {
    void onActivityResult(int resultCode, @Nullable Intent data);
}
