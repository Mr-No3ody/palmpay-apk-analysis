package com.palmpay.lib.webview.offline.monitor;

import android.text.TextUtils;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.flow.FlowReportParams;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebMonitor;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineWebMonitorUtils {
    private OfflineWebMonitorUtils() {
    }

    public static void monitorLoadTime(String str, boolean z3, long j6, String str2) {
        if (OfflineWebManager.getInstance().getMonitor() != null) {
            HashMap map = new HashMap(4);
            map.put("url", str);
            if (TextUtils.isEmpty(str2)) {
                str2 = FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE;
            }
            map.put("result", str2);
        }
    }

    public static void reportFlowParams(FlowReportParams flowReportParams) {
        IEnhWebMonitor monitor = OfflineWebManager.getInstance().getMonitor();
        if (monitor != null) {
            HashMap<String, Object> map = new HashMap<>();
            HashMap<String, Object> map2 = new HashMap<>(12);
            map.put(OfflineConstant.BIS_NAME, flowReportParams.getBisName());
            map.put("downloadResult", Integer.valueOf(flowReportParams.getDownloadResult()));
            map.put("unzipResult", Integer.valueOf(flowReportParams.getUnzipResult()));
            map.put("queryResult", Integer.valueOf(flowReportParams.getQueryResult()));
            map2.put("queryTime", Long.valueOf(flowReportParams.getQueryTime()));
            map2.put("downloadTime", Long.valueOf(flowReportParams.getDownloadTime()));
            map2.put("unzipTime", Long.valueOf(flowReportParams.getUnzipTime()));
            map2.put("zipSize", Long.valueOf(flowReportParams.getZipSize()));
            monitor.report("offweb_cost_time", map, map2);
        }
    }

    public static void reportLoadError(String str, long j6, String str2, int i7) {
        IEnhWebMonitor monitor = OfflineWebManager.getInstance().getMonitor();
        if (monitor != null) {
            HashMap<String, Object> map = new HashMap<>();
            HashMap<String, Object> map2 = new HashMap<>(8);
            map.put("url", str);
            map.put("loadResult", FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE);
            map.put("errCode", i7 + "");
            map2.put("loadTime", Long.valueOf(System.currentTimeMillis() - j6));
            monitor.report("webview_load_time", map, map2);
        }
    }

    public static void reportLoadFinish(String str, String str2, long j6) {
        IEnhWebMonitor monitor = OfflineWebManager.getInstance().getMonitor();
        if (monitor != null) {
            HashMap<String, Object> map = new HashMap<>();
            HashMap<String, Object> map2 = new HashMap<>(7);
            map.put("url", str);
            map.put("loadResult", "0");
            map.put("cacheHitRate", str2);
            map2.put("loadTime", Long.valueOf(System.currentTimeMillis() - j6));
            monitor.report("webview_load_time", map, map2);
        }
    }
}
