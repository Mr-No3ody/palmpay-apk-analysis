package com.transsnet.palmpay.core.rnbridge.bridge;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.Nullable;
import p220oa.b;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/shareCommon/shareImage"}, function = {IBridge.class, IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/ShareImageBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/rnbridge/bridge/ShareImageBean;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShareImageBridge extends SyncBridge<ShareImageBean> {
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable ShareImageBean params, @Nullable IBridgeCallback callback) {
        if (params == null || TextUtils.isEmpty(params.getImagePath())) {
            if (callback != null) {
                callback.resolved("share image failed, image path is empty");
                return;
            }
            return;
        }
        try {
            String imagePath = params.getImagePath();
            if (imagePath != null) {
                if (y.m(imagePath, "file://", false)) {
                    imagePath = y.k(imagePath, "file://", "");
                }
                File file = new File(imagePath);
                Context context = BaseApplication.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Uri uriA = b.a(context, name, file);
                Activity activity = getActivity();
                if (activity != null) {
                    com.facebook.imagepipeline.nativecode.b.F(activity, uriA);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
