package com.palmpay.lib.webview.offline;

import android.text.TextUtils;
import com.palmpay.lib.webview.offline.net.DefaultPreloadRequest;
import com.palmpay.lib.webview.offline.net.RequestCallback;
import com.palmpay.lib.webview.offline.resource.ResourceFlow;
import com.palmpay.lib.webview.offline.task.CheckAndUpdateTask;
import com.palmpay.lib.webview.offline.task.CheckVersionTask;
import com.palmpay.lib.webview.offline.task.CleanTask;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineTaskManager {
    private OfflineTaskManager() {
    }

    public static void checkAllVersion() {
        OfflineWebManager.getInstance().getExecutor().execute(new CheckVersionTask());
    }

    public static void checkPackage(String str, ResourceFlow.FlowListener flowListener) {
        if (!TextUtils.isEmpty(str)) {
            OfflineWebManager.getInstance().getExecutor().execute(new CheckAndUpdateTask(str, flowListener));
        } else if (flowListener != null) {
            flowListener.error(null, new IllegalStateException("bisName == null"));
        }
    }

    public static void checkWebConfig() {
        try {
            if (OfflineWebManager.getInstance().getPreloadRequest() != null) {
                OfflineWebManager.getInstance().getPreloadRequest().requestPreloadList(new RequestCallback<DefaultPreloadRequest.WebConfig>() { // from class: com.palmpay.lib.webview.offline.OfflineTaskManager.1
                    @Override // com.palmpay.lib.webview.offline.net.RequestCallback
                    public void onFail(Throwable th) {
                        th.printStackTrace();
                    }

                    @Override // com.palmpay.lib.webview.offline.net.RequestCallback
                    public void onSuccess(DefaultPreloadRequest.WebConfig webConfig) {
                        HashSet<String> preDownloadList = OfflineWebManager.getInstance().getOfflineConfig().getPreDownloadList();
                        Set<String> preloadList = webConfig.getPreloadList();
                        if (!OfflineTaskManager.isEqual(preDownloadList, preloadList)) {
                            OfflineWebManager.getInstance().getOfflineConfig().getPreDownloadList().clear();
                            OfflineConfig offlineConfigBuild = OfflineConfig.newBuilder(OfflineWebManager.getInstance().getOfflineConfig()).addPreDownloadList(preloadList).build();
                            OfflineWebManager.getInstance().setOfflineConfig(offlineConfigBuild);
                            if (offlineConfigBuild.getPreDownloadList() != null && !offlineConfigBuild.getPreDownloadList().isEmpty()) {
                                Iterator<String> it = offlineConfigBuild.getPreDownloadList().iterator();
                                while (it.hasNext()) {
                                    OfflineTaskManager.checkPackage(it.next(), null);
                                }
                            }
                        }
                        if (OfflineWebManager.getInstance().getOfflineConfig().getWhiteList() != null) {
                            OfflineWebManager.getInstance().getOfflineConfig().getWhiteList().clear();
                        }
                        OfflineWebManager.getInstance().setOfflineConfig(OfflineConfig.newBuilder(OfflineWebManager.getInstance().getOfflineConfig()).addWhiteHostList(webConfig.getWhiteList()).build());
                    }
                });
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void clean() {
        OfflineWebManager.getInstance().getExecutor().execute(new CleanTask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isEqual(Set<String> set, Set<String> set2) {
        if (set == null && set2 == null) {
            return true;
        }
        if (set == null || set2 == null || set.size() != set2.size()) {
            return false;
        }
        return set.containsAll(set2);
    }

    public static void startInitTask() {
        OfflineConfig offlineConfig = OfflineWebManager.getInstance().getOfflineConfig();
        if (offlineConfig.isOpen()) {
            checkAllVersion();
            if (offlineConfig.getPreDownloadList() == null || offlineConfig.getPreDownloadList().size() <= 0) {
                return;
            }
            Iterator<String> it = offlineConfig.getPreDownloadList().iterator();
            while (it.hasNext()) {
                checkPackage(it.next(), null);
            }
        }
    }
}
