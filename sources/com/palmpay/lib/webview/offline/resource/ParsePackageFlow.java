package com.palmpay.lib.webview.offline.resource;

import android.content.Context;
import android.content.res.AssetManager;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.palmpay.lib.webview.offline.utils.OfflineFileUtils;
import com.palmpay.lib.webview.offline.utils.OfflinePackageUtil;
import com.palmpay.lib.webview.offline.utils.OfflineStringUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ParsePackageFlow implements ResourceFlow.IFlow {
    private static final String TAG = "ParsePackageFlow";
    private ResourceFlow mResourceFlow;

    public ParsePackageFlow(ResourceFlow resourceFlow) {
        this.mResourceFlow = resourceFlow;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void unzipIfExistsInAssets(Context context, String str, File file) {
        AssetManager assets = context.getAssets();
        try {
            String[] list = assets.list("");
            if (list != null) {
                for (String str2 : list) {
                    if (OfflineWebLog.loggable()) {
                        OfflineWebLog.i(TAG, "assets file : " + str2);
                    }
                    if (str2.equals(str)) {
                        InputStream inputStreamOpen = assets.open(str);
                        try {
                            ZipInputStream zipInputStream = new ZipInputStream(inputStreamOpen);
                            while (true) {
                                try {
                                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                                    if (nextEntry == null) {
                                        break;
                                    }
                                    File file2 = new File(file, nextEntry.getName());
                                    if (nextEntry.isDirectory()) {
                                        file2.mkdirs();
                                    } else {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            byte[] bArr = new byte[1024];
                                            while (true) {
                                                int i7 = zipInputStream.read(bArr);
                                                if (i7 <= 0) {
                                                    break;
                                                } else {
                                                    fileOutputStream.write(bArr, 0, i7);
                                                }
                                                try {
                                                    zipInputStream.close();
                                                } catch (Throwable th) {
                                                    th.addSuppressed(th);
                                                }
                                                throw th;
                                            }
                                            fileOutputStream.close();
                                        } catch (Throwable th2) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                            throw th2;
                                        }
                                    }
                                    zipInputStream.closeEntry();
                                } catch (Throwable th4) {
                                    zipInputStream.close();
                                    throw th4;
                                }
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                    } catch (Throwable th5) {
                                        th.addSuppressed(th5);
                                    }
                                }
                                throw th;
                            }
                            zipInputStream.close();
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                                return;
                            }
                            return;
                        } catch (Throwable th6) {
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                            throw th6;
                        }
                    }
                }
            }
            OfflineWebLog.i(TAG, "文件不存在于Assets目录中。");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.palmpay.lib.webview.offline.resource.ResourceFlow.IFlow
    public void process() throws ResourceFlow.FlowException {
        try {
            String bisDir = OfflinePackageUtil.getBisDir(this.mResourceFlow.getPackageInfo().getBisName());
            String str = File.separator;
            String strAppendUnsafeString = OfflineStringUtils.appendUnsafeString(bisDir, str, OfflineConstant.TEMP_DIR_NAME);
            String strAppendUnsafeString2 = OfflineStringUtils.appendUnsafeString(OfflinePackageUtil.getBisDir(this.mResourceFlow.getPackageInfo().getBisName()), str, OfflineConstant.NEW_DIR_NAME);
            this.mResourceFlow.getReportParams().unZipStart();
            File file = new File(strAppendUnsafeString);
            File file2 = new File(strAppendUnsafeString2);
            OfflineFileUtils.deleteDir(file);
            String strAppendUnsafeString3 = OfflineStringUtils.appendUnsafeString(OfflinePackageUtil.getBisDir(this.mResourceFlow.getPackageInfo().getBisName()), str, this.mResourceFlow.getPackageInfo().getVersionCode() + "", OfflineConstant.ZIP_SUFFIX);
            OfflineFileUtils.unzipFile(strAppendUnsafeString3, strAppendUnsafeString);
            OfflineFileUtils.deleteDir(file2);
            OfflineFileUtils.rename(file, OfflineConstant.NEW_DIR_NAME);
            File file3 = new File(strAppendUnsafeString3);
            if (file3.exists()) {
                if (OfflineWebLog.loggable()) {
                    OfflineWebLog.i(TAG, "delete zip : " + file3.getName());
                }
                file3.delete();
            }
            this.mResourceFlow.getReportParams().unZipEnd(true, "");
            this.mResourceFlow.process();
        } catch (Exception e10) {
            this.mResourceFlow.getReportParams().unZipEnd(false, OfflineStringUtils.getErrorString(e10));
            this.mResourceFlow.error(e10);
        }
    }
}
