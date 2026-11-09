package com.palmpay.lib.webview.offline.resource;

import com.palmpay.lib.webview.offline.info.OfflinePackageInfo;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.palmpay.lib.webview.offline.utils.OfflineFileUtils;
import com.palmpay.lib.webview.offline.utils.OfflinePackageUtil;
import com.palmpay.lib.webview.offline.utils.OfflineStringUtils;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class ReplaceResFlow implements ResourceFlow.IFlow {
    private ResourceFlow mFlow;

    public ReplaceResFlow(ResourceFlow resourceFlow) {
        this.mFlow = resourceFlow;
    }

    @Override // com.palmpay.lib.webview.offline.resource.ResourceFlow.IFlow
    public void process() throws ResourceFlow.FlowException {
        String bisDir = OfflinePackageUtil.getBisDir(this.mFlow.getPackageInfo().getBisName());
        String str = File.separator;
        String strAppendUnsafeString = OfflineStringUtils.appendUnsafeString(bisDir, str, OfflineConstant.NEW_DIR_NAME);
        OfflinePackageInfo packageInfo = this.mFlow.getPackageInfo();
        String bisDir2 = OfflinePackageUtil.getBisDir(packageInfo.getBisName());
        if (packageInfo.isForceRefresh()) {
            File file = new File(OfflineStringUtils.appendUnsafeString(bisDir2, str, OfflineConstant.CUR_DIR_NAME));
            if (file.exists()) {
                OfflineFileUtils.rename(file, OfflineConstant.OLD_DIR_NAME);
            }
            OfflineFileUtils.rename(new File(strAppendUnsafeString), OfflineConstant.CUR_DIR_NAME);
        } else if (!new File(OfflineStringUtils.appendUnsafeString(bisDir2, str, OfflineConstant.CUR_DIR_NAME)).exists()) {
            OfflineFileUtils.rename(new File(strAppendUnsafeString), OfflineConstant.CUR_DIR_NAME);
        }
        this.mFlow.process();
    }
}
