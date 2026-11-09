package com.palmpay.lib.webview.offline;

import android.content.Context;
import android.text.TextUtils;
import com.palmpay.lib.webview.offline.resource.ResourceFlow;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineWebClient {
    private OfflineWebClient() {
    }

    public static void checkAllVersion() {
        if (OfflineWebManager.getInstance().isInit()) {
            OfflineTaskManager.checkAllVersion();
        }
    }

    public static void checkPackage(String str) {
        checkPackage(str, null);
    }

    public static void clean() {
        if (OfflineWebManager.getInstance().isInit()) {
            OfflineTaskManager.clean();
        }
    }

    public static void init(Context context, OfflineParams offlineParams) {
        OfflineWebManager.getInstance().init(context, offlineParams);
        if (OfflineWebManager.getInstance().isInit()) {
            OfflineTaskManager.startInitTask();
        }
    }

    public static void checkPackage(String str, ResourceFlow.FlowListener flowListener) {
        if (TextUtils.isEmpty(str)) {
            if (flowListener != null) {
                flowListener.error(null, new IllegalStateException("bisName == null"));
            }
        } else if (OfflineWebManager.getInstance().isInit()) {
            OfflineTaskManager.checkPackage(str, flowListener);
        } else if (flowListener != null) {
            flowListener.error(null, new IllegalStateException("please init sdk first ."));
        }
    }
}
