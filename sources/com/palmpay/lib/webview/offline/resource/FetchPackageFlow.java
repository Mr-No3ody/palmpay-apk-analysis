package com.palmpay.lib.webview.offline.resource;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.info.OfflinePackageInfo;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.net.RequestCallback;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.palmpay.lib.webview.offline.utils.OfflineFileUtils;
import com.palmpay.lib.webview.offline.utils.OfflinePackageUtil;
import com.palmpay.lib.webview.offline.utils.OfflineStringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class FetchPackageFlow implements ResourceFlow.IFlow {
    private static final String ASSETS_DIR_NAME = "offline";
    private static final String TAG = "FetchPackageFlow";
    private ResourceFlow mResourceFlow;

    public FetchPackageFlow(ResourceFlow resourceFlow) {
        this.mResourceFlow = resourceFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAssetsFileExist() {
        String url = this.mResourceFlow.getPackageInfo().getUrl();
        if (TextUtils.isEmpty(url)) {
            this.mResourceFlow.setDone(false);
            return;
        }
        String fileNameFromUrl = getFileNameFromUrl(url);
        if (TextUtils.isEmpty(fileNameFromUrl)) {
            this.mResourceFlow.process();
        } else {
            unzipIfExistsInAssets(OfflineWebManager.getInstance().getContext(), fileNameFromUrl);
        }
    }

    private String getFileNameFromUrl(String str) {
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void handleZip(AssetManager assetManager, String str) throws IOException {
        String bisDir = OfflinePackageUtil.getBisDir(this.mResourceFlow.getPackageInfo().getBisName());
        String str2 = File.separator;
        String strAppendUnsafeString = OfflineStringUtils.appendUnsafeString(bisDir, str2, OfflineConstant.TEMP_DIR_NAME);
        String strAppendUnsafeString2 = OfflineStringUtils.appendUnsafeString(OfflinePackageUtil.getBisDir(this.mResourceFlow.getPackageInfo().getBisName()), str2, OfflineConstant.NEW_DIR_NAME);
        File file = new File(strAppendUnsafeString);
        File file2 = new File(strAppendUnsafeString2);
        OfflineFileUtils.deleteDir(file);
        ZipInputStream zipInputStream = new ZipInputStream(assetManager.open(str));
        File file3 = new File(strAppendUnsafeString);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                OfflineFileUtils.deleteDir(file2);
                OfflineFileUtils.rename(file, OfflineConstant.NEW_DIR_NAME);
                this.mResourceFlow.getReportParams().unZipEnd(true, "");
                this.mResourceFlow.setDone(true);
                return;
            }
            File file4 = new File(strAppendUnsafeString, nextEntry.getName());
            if (nextEntry.isDirectory()) {
                file4.mkdirs();
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(file4);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i7 = zipInputStream.read(bArr);
                        if (i7 <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i7);
                        }
                    }
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            zipInputStream.closeEntry();
        }
    }

    private void unzipIfExistsInAssets(Context context, String str) {
        AssetManager assets = context.getAssets();
        try {
            String[] list = assets.list(ASSETS_DIR_NAME);
            if (list != null) {
                for (String str2 : list) {
                    if (OfflineWebLog.loggable()) {
                        OfflineWebLog.i(TAG, "assets file: " + str2);
                    }
                    if (str2.equals(str)) {
                        this.mResourceFlow.getReportParams().unZipStart();
                        handleZip(assets, ASSETS_DIR_NAME + File.separator + str);
                        return;
                    }
                }
            }
            OfflineWebLog.i(TAG, "文件不存在于Assets目录中。");
            this.mResourceFlow.process();
        } catch (Exception e10) {
            e10.printStackTrace();
            this.mResourceFlow.process();
        }
    }

    @Override // com.palmpay.lib.webview.offline.resource.ResourceFlow.IFlow
    public void process() throws ResourceFlow.FlowException {
        if (TextUtils.isEmpty(this.mResourceFlow.getPackageInfo().getBisName())) {
            this.mResourceFlow.getReportParams().setQueryResult(false, "bisName == null ");
            this.mResourceFlow.error(new IllegalStateException("FetchPackageFlow  bisName == null "));
        } else {
            this.mResourceFlow.getReportParams().queryStart();
            OfflineWebManager.getInstance().getRequest().requestPackageInfo(this.mResourceFlow.getPackageInfo().getBisName(), this.mResourceFlow.getPackageInfo().getVersionCode(), new RequestCallback<OfflinePackageInfo>() { // from class: com.palmpay.lib.webview.offline.resource.FetchPackageFlow.1
                @Override // com.palmpay.lib.webview.offline.net.RequestCallback
                public void onFail(Throwable th) {
                    OfflineWebLog.e(FetchPackageFlow.TAG, th);
                    FetchPackageFlow.this.mResourceFlow.getReportParams().queryEnd();
                    FetchPackageFlow.this.mResourceFlow.getReportParams().setQueryResult(false, OfflineStringUtils.getErrorString(th));
                    FetchPackageFlow.this.mResourceFlow.error(th);
                }

                @Override // com.palmpay.lib.webview.offline.net.RequestCallback
                public void onSuccess(OfflinePackageInfo offlinePackageInfo) {
                    FetchPackageFlow.this.mResourceFlow.getReportParams().queryEnd();
                    if (offlinePackageInfo == null) {
                        FetchPackageFlow.this.mResourceFlow.getReportParams().setQueryResult(false, "onResponse：null");
                        FetchPackageFlow.this.mResourceFlow.setDone(false);
                        return;
                    }
                    OfflineWebManager.getInstance().getSharedPreferences().edit().putBoolean(offlinePackageInfo.getBisName(), offlinePackageInfo.isEnable()).apply();
                    FetchPackageFlow.this.mResourceFlow.getReportParams().setQueryResult(true, offlinePackageInfo.toString());
                    if (!FetchPackageFlow.this.mResourceFlow.getPackageInfo().getBisName().equals(offlinePackageInfo.getBisName())) {
                        FetchPackageFlow.this.mResourceFlow.getReportParams().setQueryResult(false, "bizName error");
                        FetchPackageFlow.this.mResourceFlow.setDone(false);
                        return;
                    }
                    if (!offlinePackageInfo.isEnable()) {
                        OfflineWebLog.i(FetchPackageFlow.TAG, "isEnable = false");
                        FetchPackageFlow.this.mResourceFlow.setDone(true);
                        return;
                    }
                    if (offlinePackageInfo.getVersionCode().equals(FetchPackageFlow.this.mResourceFlow.getPackageInfo().getVersionCode())) {
                        OfflineWebLog.i(FetchPackageFlow.TAG, "same version");
                        FetchPackageFlow.this.mResourceFlow.setDone(false);
                    } else {
                        FetchPackageFlow.this.mResourceFlow.setPackageInfo(offlinePackageInfo);
                        FetchPackageFlow.this.checkAssetsFileExist();
                    }
                    if (OfflineWebLog.loggable()) {
                        OfflineWebLog.i(FetchPackageFlow.TAG, "package status :" + offlinePackageInfo);
                    }
                }
            });
        }
    }
}
