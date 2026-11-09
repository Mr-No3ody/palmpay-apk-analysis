package com.palmpay.lib.webview.cache.util;

import androidx.annotation.Keep;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/palmpay/lib/webview/cache/util/ICancellable;", "", PPRNBridge.DIALOG_ACTION_CANCEL, "", "msg", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ICancellable {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(ICancellable iCancellable, String str, int i7, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i7 & 1) != 0) {
                str = null;
            }
            iCancellable.cancel(str);
        }
    }

    void cancel(@Nullable String msg);
}
