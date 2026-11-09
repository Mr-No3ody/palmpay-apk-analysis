package com.palmpay.lib.webview.offline.matcher;

import C0.G;
import android.net.Uri;
import androidx.camera.video.u;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.palmpay.lib.webview.offline.utils.OfflineFileUtils;
import com.palmpay.lib.webview.offline.utils.OfflinePackageUtil;
import com.palmpay.lib.webview.offline.utils.UrlParamsUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultMatcher implements BisNameMatcher {
    private static final String TAG = "DefaultMatcher";

    @Override // com.palmpay.lib.webview.offline.matcher.BisNameMatcher
    public String matching(String str, String str2) {
        Uri uri;
        try {
            uri = Uri.parse(str2);
        } catch (Exception e10) {
            OfflineWebLog.e(TAG, e10);
            uri = null;
        }
        if (uri != null && !OfflineFileUtils.isSpaceString(str)) {
            if (OfflineWebManager.getInstance().getSharedPreferences().getBoolean(str, true)) {
                if (!OfflineWebManager.getInstance().getOfflineConfig().isDisable(str)) {
                    StringBuilder sbS = u.s(OfflinePackageUtil.getBisDir(str));
                    String str3 = File.separator;
                    File file = new File(G.s(sbS, str3, OfflineConstant.CUR_DIR_NAME, str3, OfflineConstant.HTML_FILE));
                    if (file.exists()) {
                        OfflineWebLog.d(TAG, file.getAbsolutePath());
                        String strSubstring = str2.substring(str2.indexOf("?"));
                        if (!strSubstring.contains("#")) {
                            return "file://" + file.getAbsolutePath() + UrlParamsUtils.urlAppendParam(strSubstring, OfflineConstant.PARAM_OFFWEB_HOST, uri.getHost());
                        }
                        String query = uri.getQuery();
                        String fragment = uri.getFragment();
                        String strUrlAppendParam = UrlParamsUtils.urlAppendParam(query, OfflineConstant.PARAM_OFFWEB_HOST, uri.getHost());
                        if (!"/".equals(fragment)) {
                            fragment = UrlParamsUtils.urlAppendParam(fragment, OfflineConstant.PARAM_OFFWEB_HOST, uri.getHost());
                        }
                        return "file://" + file.getAbsolutePath() + "?" + strUrlAppendParam + "#" + fragment;
                    }
                    if (OfflineWebLog.loggable()) {
                        OfflineWebLog.d(TAG, "file not found : " + file.getAbsolutePath());
                    }
                } else if (OfflineWebLog.loggable()) {
                    OfflineWebLog.i(TAG, "match url :" + str + " is disabled by user");
                }
            } else if (OfflineWebLog.loggable()) {
                OfflineWebLog.i(TAG, "match url :" + str + " is disabled by sp");
            }
        }
        return str2;
    }
}
