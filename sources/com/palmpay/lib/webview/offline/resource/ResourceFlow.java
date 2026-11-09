package com.palmpay.lib.webview.offline.resource;

import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.flow.FlowReportParams;
import com.palmpay.lib.webview.offline.info.OfflinePackageInfo;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ResourceFlow {
    private static final String TAG = "ResourceFlow";
    private boolean isForceStop;
    private FlowListener mFlowListener;
    private List<IFlow> mFlows;
    private int mIndex;
    private OfflinePackageInfo mPackageInfo;
    private FlowReportParams mReportParams;

    public static class FlowException extends Exception {
    }

    public interface FlowListener {
        void done(OfflinePackageInfo offlinePackageInfo, boolean z3);

        void error(OfflinePackageInfo offlinePackageInfo, Throwable th);
    }

    public interface IFlow {
        void process() throws FlowException;
    }

    public ResourceFlow(OfflinePackageInfo offlinePackageInfo) {
        this.mPackageInfo = offlinePackageInfo;
        this.mReportParams = new FlowReportParams(offlinePackageInfo.getBisName());
    }

    public void addFlow(IFlow iFlow) {
        if (this.mFlows == null) {
            this.mFlows = new ArrayList();
        }
        this.mFlows.add(iFlow);
    }

    public void error(Throwable th) {
        th.printStackTrace();
        FlowListener flowListener = this.mFlowListener;
        if (flowListener != null) {
            flowListener.error(this.mPackageInfo, th);
        }
        OfflineWebManager.getInstance().getFlowResultHandleStrategy().done(this.mReportParams);
    }

    public OfflinePackageInfo getPackageInfo() {
        return this.mPackageInfo;
    }

    public FlowReportParams getReportParams() {
        return this.mReportParams;
    }

    public void process() {
        if (this.mIndex >= this.mFlows.size()) {
            OfflineWebLog.i(TAG, "done ... ...");
            setDone(true);
            return;
        }
        if (!this.isForceStop) {
            List<IFlow> list = this.mFlows;
            int i7 = this.mIndex;
            this.mIndex = i7 + 1;
            final IFlow iFlow = list.get(i7);
            OfflineWebManager.getInstance().getExecutor().execute(new Runnable() { // from class: com.palmpay.lib.webview.offline.resource.ResourceFlow.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (OfflineWebLog.loggable()) {
                            OfflineWebLog.i(ResourceFlow.TAG, "Flow start process :".concat(iFlow.getClass().getSimpleName()));
                        }
                        iFlow.process();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        OfflineWebLog.e(ResourceFlow.TAG, e10);
                        ResourceFlow.this.error(e10);
                    }
                }
            });
            return;
        }
        if (OfflineWebLog.loggable()) {
            OfflineWebLog.i(TAG, "isForceStop  = " + this.isForceStop);
        }
    }

    public void setDone(boolean z3) {
        FlowListener flowListener = this.mFlowListener;
        if (flowListener != null) {
            flowListener.done(this.mPackageInfo, z3);
        }
        OfflineWebManager.getInstance().getFlowResultHandleStrategy().done(this.mReportParams);
    }

    public void setFlowListener(FlowListener flowListener) {
        this.mFlowListener = flowListener;
    }

    public void setPackageInfo(OfflinePackageInfo offlinePackageInfo) {
        this.mPackageInfo = offlinePackageInfo;
    }

    public void start() {
        List<IFlow> list = this.mFlows;
        if (list == null || list.size() == 0) {
            return;
        }
        this.mIndex = 0;
        process();
    }

    public void stop() {
        this.isForceStop = true;
    }
}
