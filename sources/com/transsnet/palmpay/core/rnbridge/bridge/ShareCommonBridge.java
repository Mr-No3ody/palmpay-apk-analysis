package com.transsnet.palmpay.core.rnbridge.bridge;

import C0.G;
import F6.d;
import android.app.Activity;
import android.text.TextUtils;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.bean.ShareBridgeDataBean;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/shareCommon/share"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/ShareCommonBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/bean/ShareBridgeDataBean;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShareCommonBridge extends SyncBridge<ShareBridgeDataBean> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable ShareBridgeDataBean params, @Nullable IBridgeCallback callback) {
        d.h("ShareBridgeDataBean", 3, G.o("key: ", params != null ? params.title : null));
        if (params != null) {
            try {
                Activity topActivity = ActivityUtils.getTopActivity();
                if (topActivity == null) {
                    return;
                }
                String localClassName = topActivity.getLocalClassName();
                Intrinsics.checkNotNullExpressionValue(localClassName, "getLocalClassName(...)");
                Activity topActivity2 = ActivityUtils.getTopActivity();
                if (topActivity2 != null && Intrinsics.c(localClassName, topActivity2.getLocalClassName())) {
                    ShareDialog shareDialog = new ShareDialog(topActivity2);
                    shareDialog.setH5ShareText(params.businessType, params.shareText, params.params);
                    shareDialog.showMore(params.showMore);
                    shareDialog.showCopyLink(params.showCopyLink);
                    shareDialog.showQrCode(params.showQrCode);
                    shareDialog.setIgnoreContactArea(params.ignoreContact);
                    shareDialog.show();
                    if (TextUtils.isEmpty(params.title)) {
                        return;
                    }
                    shareDialog.setTitle(params.title);
                }
            } catch (Exception unused) {
            }
        }
    }
}
