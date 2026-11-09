package com.palmpay.lib.webview.offline.flow;

import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.monitor.OfflineWebMonitorUtils;

/* JADX INFO: loaded from: classes3.dex */
public class FlowResultHandleStrategy implements IFlowResultHandleStrategy {
    @Override // com.palmpay.lib.webview.offline.flow.IFlowResultHandleStrategy
    public void done(FlowReportParams flowReportParams) {
        OfflineWebLog.d(getClass().getSimpleName(), "FlowReportParams  --> " + flowReportParams);
        if (flowReportParams == null) {
            return;
        }
        OfflineWebMonitorUtils.reportFlowParams(flowReportParams);
    }
}
