package com.palmpay.lib.webview.offline.proxy;

import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.adjust.sdk.Constants;
import com.didiglobal.booster.instrument.ShadowToast;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.task.CheckAndUpdateTask;
import com.palmpay.lib.webview.offline.utils.OffWebRuleUtil;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.palmpay.lib.webview.offline.utils.OfflineHandlerUtils;
import com.palmpay.lib.webview.offline.widget.IOfflineWebView;
import com.palmpay.lib.webview.offline.widget.ReloadOfflineWebView;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineWebViewProxy implements IOfflineWebViewProxy {
    private static final String TAG = "OfflineWebViewProxy";
    private String mBisName;
    private IOfflineWebView mIOfflineWebView;
    private boolean mIsOffline;

    public OfflineWebViewProxy(IOfflineWebView iOfflineWebView) {
        this.mIOfflineWebView = iOfflineWebView;
    }

    private boolean isOffWebUrl(String str) {
        if (str.contains(OfflineConstant.OFF_WEB)) {
            return str.startsWith("http") || str.startsWith(Constants.SCHEME);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean reloadEnable() {
        return (this.mIOfflineWebView instanceof ReloadOfflineWebView) && OfflineWebManager.getInstance().isForceReloadEnable();
    }

    @Override // com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy
    public void destroy() {
        if (reloadEnable()) {
            OfflineWebLog.i(TAG, "destroy");
        }
    }

    @Override // com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy
    public String getBisName() {
        return this.mBisName;
    }

    @Override // com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy
    public String loadUrl(String str) {
        String strAddOfflineParam = OffWebRuleUtil.addOfflineParam(str);
        if (isOffWebUrl(strAddOfflineParam)) {
            try {
                Uri uri = Uri.parse(strAddOfflineParam.trim());
                this.mBisName = uri.getQueryParameter(OfflineConstant.OFF_WEB);
                if (!"http".equalsIgnoreCase(uri.getScheme()) && !Constants.SCHEME.equalsIgnoreCase(uri.getScheme())) {
                    return strAddOfflineParam;
                }
            } catch (Exception e10) {
                OfflineWebLog.e(TAG, e10);
            }
            String str2 = TAG;
            OfflineWebLog.i(str2, strAddOfflineParam);
            if (!TextUtils.isEmpty(this.mBisName)) {
                if (!OfflineWebManager.getInstance().getOfflineConfig().isDisable(this.mBisName)) {
                    String offlineRes = OfflineWebManager.getInstance().getOfflineRes(this.mBisName, strAddOfflineParam);
                    if (OfflineWebLog.loggable()) {
                        OfflineWebLog.i(str2, "match url :" + offlineRes);
                    }
                    OfflineWebManager.getInstance().getExecutor().execute(new CheckAndUpdateTask(this.mBisName, null));
                    this.mIsOffline = !strAddOfflineParam.equals(offlineRes);
                    if (OfflineWebManager.getInstance().isDebug()) {
                        ShadowToast.show(Toast.makeText(OfflineWebManager.getInstance().getContext(), this.mIsOffline ? "离线包模式" : "在线模式", 1));
                    }
                    return offlineRes;
                }
                if (OfflineWebLog.loggable()) {
                    OfflineWebLog.i(str2, "is disabled:" + this.mBisName);
                }
            }
        }
        return strAddOfflineParam;
    }

    @Override // com.palmpay.lib.webview.offline.proxy.IOfflineWebViewProxy
    public void reLoadUrl() {
        OfflineHandlerUtils.post(new Runnable() { // from class: com.palmpay.lib.webview.offline.proxy.OfflineWebViewProxy.1
            @Override // java.lang.Runnable
            public void run() {
                if (!OfflineWebViewProxy.this.reloadEnable() || OfflineWebViewProxy.this.mIOfflineWebView == null) {
                    return;
                }
                OfflineWebLog.i(OfflineWebViewProxy.TAG, "reLoadUrl");
                ((ReloadOfflineWebView) OfflineWebViewProxy.this.mIOfflineWebView).reloadOfflineWeb();
            }
        });
    }
}
