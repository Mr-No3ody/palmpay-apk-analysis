package com.palmpay.lib.webview.offline.utils;

import C0.G;
import android.net.Uri;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.palmpay.lib.webview.offline.info.OfflineRuleConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class OffWebRuleUtil {
    private static final String OFF_WEB_KEY = "offweb";
    private static OfflineRuleConfig sOfflineWebConfig;

    private OffWebRuleUtil() {
    }

    public static String addOfflineParam(String str) {
        if (!TextUtils.isEmpty(str) && getRules() != null && getRules().size() != 0) {
            try {
                Uri uri = Uri.parse(str);
                String host = uri.getHost();
                String path = uri.getPath();
                if (path.endsWith("/")) {
                    path = path.substring(0, path.length() - 1);
                }
                if (!TextUtils.isEmpty(path) && !TextUtils.isEmpty(host)) {
                    String fragment = uri.getFragment();
                    if (!TextUtils.isEmpty(fragment) && fragment.contains("?")) {
                        fragment = fragment.substring(0, fragment.indexOf("?"));
                    }
                    String strMatchRule = matchRule(host, path, fragment);
                    if (!TextUtils.isEmpty(strMatchRule)) {
                        return addParams(str, uri, strMatchRule);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return str;
    }

    private static String addParams(String str, Uri uri, String str2) {
        String strSubstring;
        String strSubstring2;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf == -1) {
            strSubstring2 = "";
            strSubstring = str;
        } else {
            strSubstring = str.substring(0, iIndexOf);
            strSubstring2 = str.substring(iIndexOf);
        }
        if (strSubstring.endsWith("/")) {
            strSubstring = u.f(1, 0, strSubstring);
        }
        return TextUtils.isEmpty(uri.getQueryParameter("offweb")) ? G.r(new StringBuilder(), appendParams(str2, strSubstring), strSubstring2) : replaceParams(str, uri, str2, strSubstring, strSubstring2);
    }

    private static String appendParams(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str2);
        if (str2.contains("?")) {
            sb2.append("&");
        } else {
            sb2.append("?");
        }
        return G.r(sb2, "offweb=", str);
    }

    private static List<OfflineRuleConfig.RulesInfo> getRules() {
        OfflineRuleConfig offlineRuleConfig = sOfflineWebConfig;
        if (offlineRuleConfig == null) {
            return null;
        }
        return offlineRuleConfig.getRules();
    }

    public static void init(OfflineRuleConfig offlineRuleConfig) {
        sOfflineWebConfig = offlineRuleConfig;
    }

    private static boolean isMatchPath(String str, OfflineRuleConfig.RulesInfo rulesInfo) {
        Iterator<String> it = rulesInfo.getPath().iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                if (str.equals(next)) {
                    return true;
                }
                if (next.contains("*")) {
                    String[] strArrSplit = trimPath(next).split("/");
                    String[] strArrSplit2 = trimPath(str).split("/");
                    if (strArrSplit.length == strArrSplit2.length) {
                        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                            if ("*".equals(strArrSplit[i7]) || (!TextUtils.isEmpty(strArrSplit[i7]) && !TextUtils.isEmpty(strArrSplit2[i7]) && strArrSplit[i7].equals(strArrSplit2[i7]))) {
                            }
                        }
                        return true;
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
    }

    private static String matchRule(String str, String str2, String str3) {
        List<OfflineRuleConfig.RulesInfo> rules = getRules();
        if (rules != null && rules.size() != 0) {
            for (OfflineRuleConfig.RulesInfo rulesInfo : rules) {
                if (!TextUtils.isEmpty(rulesInfo.getOffWeb()) && rulesInfo.getHost() != null && rulesInfo.getHost().contains(str) && rulesInfo.getPath() != null && rulesInfo.getPath().size() != 0 && isMatchPath(str2, rulesInfo)) {
                    if (rulesInfo.getFragmentPrefix() == null || rulesInfo.getFragmentPrefix().size() == 0) {
                        return rulesInfo.getOffWeb();
                    }
                    for (String str4 : rulesInfo.getFragmentPrefix()) {
                        if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                            return rulesInfo.getOffWeb();
                        }
                        if (str4 != null && str4.equals(str3)) {
                            return rulesInfo.getOffWeb();
                        }
                    }
                }
            }
        }
        return null;
    }

    private static String replaceParams(String str, Uri uri, String str2, String str3, String str4) {
        int iIndexOf = str3.indexOf("?");
        if (iIndexOf <= 0) {
            return str;
        }
        boolean z3 = false;
        StringBuilder sb2 = new StringBuilder(str3.substring(0, iIndexOf));
        for (String str5 : uri.getQueryParameterNames()) {
            sb2.append(z3 ? "&" : "?");
            if ("offweb".equals(str5)) {
                sb2.append("offweb=");
                sb2.append(str2);
            } else {
                sb2.append(str5);
                sb2.append("=");
                sb2.append(uri.getQueryParameter(str5));
            }
            z3 = true;
        }
        return ((Object) sb2) + str4;
    }

    private static String trimPath(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        return str.endsWith("/") ? u.f(1, 0, str) : str;
    }
}
