package com.palmpay.lib.webview.offline.task;

import com.palmpay.lib.webview.cache.WebCache;
import com.palmpay.lib.webview.offline.OfflineWebClient;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.info.OfflinePackageInfo;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.resource.DownloadFlow;
import com.palmpay.lib.webview.offline.resource.FetchPackageFlow;
import com.palmpay.lib.webview.offline.resource.ParsePackageFlow;
import com.palmpay.lib.webview.offline.resource.ReplaceResFlow;
import com.palmpay.lib.webview.offline.resource.ResourceFlow;
import com.palmpay.lib.webview.offline.utils.OfflinePackageUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CheckAndUpdateTask implements Runnable {
    private static final String TAG = "CheckAndUpdateTask";
    private String mBisName;
    private ResourceFlow.FlowListener mListener;

    public CheckAndUpdateTask(String str, ResourceFlow.FlowListener flowListener) {
        this.mBisName = str;
        this.mListener = flowListener;
    }

    private static boolean isRunning(List<ResourceFlow> list, String str) {
        synchronized (list) {
            try {
                Iterator<ResourceFlow> it = list.iterator();
                while (it.hasNext()) {
                    OfflinePackageInfo packageInfo = it.next().getPackageInfo();
                    if (packageInfo != null && str.equals(packageInfo.getBisName())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (OfflineWebManager.getInstance().getInterceptor().isIntercept(this.mBisName)) {
            if (OfflineWebLog.loggable()) {
                OfflineWebLog.i(TAG, "interceptor bisName :" + this.mBisName);
                return;
            }
            return;
        }
        final List<ResourceFlow> resourceFlows = OfflineWebManager.getInstance().getResourceFlows();
        if (isRunning(resourceFlows, this.mBisName)) {
            if (OfflineWebLog.loggable()) {
                OfflineWebLog.i(TAG, "same flow running :" + this.mBisName);
                return;
            }
            return;
        }
        String packageVersionCode = OfflinePackageUtil.getPackageVersionCode(this.mBisName);
        if (OfflineWebLog.loggable()) {
            OfflineWebLog.i(TAG, "checkPackage:" + this.mBisName + "，packageVersion：" + packageVersionCode);
        }
        ResourceFlow resourceFlow = new ResourceFlow(new OfflinePackageInfo(this.mBisName, packageVersionCode));
        resourceFlow.addFlow(new FetchPackageFlow(resourceFlow));
        resourceFlow.addFlow(new DownloadFlow(resourceFlow));
        resourceFlow.addFlow(new ParsePackageFlow(resourceFlow));
        resourceFlow.addFlow(new ReplaceResFlow(resourceFlow));
        resourceFlow.setFlowListener(new ResourceFlow.FlowListener() { // from class: com.palmpay.lib.webview.offline.task.CheckAndUpdateTask.1
            private void doneFlow(OfflinePackageInfo offlinePackageInfo, boolean z3) {
                synchronized (resourceFlows) {
                    try {
                        Iterator it = resourceFlows.iterator();
                        while (it.hasNext()) {
                            if (offlinePackageInfo.equals(((ResourceFlow) it.next()).getPackageInfo())) {
                                it.remove();
                                if (!z3) {
                                    break;
                                }
                                WebCache.INSTANCE.updateLoader(offlinePackageInfo.getBisName(), OfflineWebManager.getInstance().getSharedPreferences().getBoolean(offlinePackageInfo.getBisName(), true), offlinePackageInfo.isForceRefresh());
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                OfflineWebClient.checkAllVersion();
            }

            @Override // com.palmpay.lib.webview.offline.resource.ResourceFlow.FlowListener
            public void done(OfflinePackageInfo offlinePackageInfo, boolean z3) {
                if (OfflineWebLog.loggable()) {
                    OfflineWebLog.i(CheckAndUpdateTask.TAG, "done :");
                }
                if (CheckAndUpdateTask.this.mListener != null) {
                    CheckAndUpdateTask.this.mListener.done(offlinePackageInfo, z3);
                }
                doneFlow(offlinePackageInfo, z3);
            }

            @Override // com.palmpay.lib.webview.offline.resource.ResourceFlow.FlowListener
            public void error(OfflinePackageInfo offlinePackageInfo, Throwable th) {
                if (CheckAndUpdateTask.this.mListener != null) {
                    CheckAndUpdateTask.this.mListener.error(offlinePackageInfo, th);
                }
                doneFlow(offlinePackageInfo, false);
                if (OfflineWebLog.loggable()) {
                    OfflineWebLog.i(CheckAndUpdateTask.TAG, "error");
                }
            }
        });
        synchronized (resourceFlows) {
            try {
                if (!isRunning(resourceFlows, this.mBisName)) {
                    resourceFlows.add(resourceFlow);
                    resourceFlow.start();
                    return;
                }
                if (OfflineWebLog.loggable()) {
                    OfflineWebLog.i(TAG, "same flow running (double-check) :" + this.mBisName);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
