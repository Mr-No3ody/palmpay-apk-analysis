package com.palmpay.lib.webview.offline.resource;

import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.download.IDownLoader;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.palmpay.lib.webview.offline.utils.OfflineFileUtils;
import com.palmpay.lib.webview.offline.utils.OfflinePackageUtil;
import com.palmpay.lib.webview.offline.utils.OfflineStringUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class DownloadFlow implements ResourceFlow.IFlow {
    private static final String TAG = "DownloadFlow";
    private final ResourceFlow mResourceFlow;

    public DownloadFlow(ResourceFlow resourceFlow) {
        this.mResourceFlow = resourceFlow;
    }

    @Override // com.palmpay.lib.webview.offline.resource.ResourceFlow.IFlow
    public void process() {
        final String str = this.mResourceFlow.getPackageInfo().getUrl() + "?t=" + System.currentTimeMillis();
        String str2 = OfflinePackageUtil.getBisDir(this.mResourceFlow.getPackageInfo().getBisName()) + File.separator + this.mResourceFlow.getPackageInfo().getVersionCode() + OfflineConstant.ZIP_SUFFIX;
        IDownLoader downLoader = OfflineWebManager.getInstance().getDownLoader();
        File file = new File(str2);
        if (OfflineWebLog.loggable()) {
            OfflineWebLog.d(TAG, "start download ... mDestPath=" + str2 + "\n mDownloadPath=" + str);
        }
        this.mResourceFlow.getReportParams().downloadStart();
        downLoader.download(str, file.getParentFile().getAbsolutePath(), file.getName(), new IDownLoader.DownloadCallback() { // from class: com.palmpay.lib.webview.offline.resource.DownloadFlow.1
            @Override // com.palmpay.lib.webview.offline.download.IDownLoader.DownloadCallback
            public void fail(Throwable th) {
                DownloadFlow.this.mResourceFlow.getReportParams().downloadResult(false, OfflineStringUtils.getErrorString(th));
                DownloadFlow.this.mResourceFlow.error(th);
            }

            @Override // com.palmpay.lib.webview.offline.download.IDownLoader.DownloadCallback
            public void success(File file2, boolean z3) {
                if (file2 == null || !file2.exists()) {
                    DownloadFlow.this.mResourceFlow.getReportParams().downloadResult(false, "download error local file not found");
                    DownloadFlow.this.mResourceFlow.error(new IllegalStateException("download error local file not found"));
                } else {
                    DownloadFlow.this.mResourceFlow.getReportParams().zipSize(OfflineFileUtils.getFileSize(file2));
                    DownloadFlow.this.mResourceFlow.getReportParams().isBrokenDown(z3);
                    DownloadFlow.this.mResourceFlow.getReportParams().downloadResult(true, str);
                    DownloadFlow.this.mResourceFlow.process();
                }
            }
        });
    }
}
