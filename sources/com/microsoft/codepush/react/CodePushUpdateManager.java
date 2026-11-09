package com.microsoft.codepush.react;

import N8.q0;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CodePushUpdateManager {
    private String mDocumentsDirectory;

    public CodePushUpdateManager(String str) {
        this.mDocumentsDirectory = str;
    }

    private String getCodePushPath() {
        String strAppendPathComponent = CodePushUtils.appendPathComponent(getDocumentsDirectory(), "CodePush");
        return CodePush.isUsingTestConfiguration() ? CodePushUtils.appendPathComponent(strAppendPathComponent, "TestPackages") : strAppendPathComponent;
    }

    private String getDocumentsDirectory() {
        return this.mDocumentsDirectory;
    }

    private String getDownloadFilePath() {
        return CodePushUtils.appendPathComponent(getCodePushPath(), CodePushConstants.DOWNLOAD_FILE_NAME);
    }

    private String getStatusFilePath() {
        return CodePushUtils.appendPathComponent(getCodePushPath(), CodePushConstants.STATUS_FILE);
    }

    private String getUnzippedFolderPath() {
        return CodePushUtils.appendPathComponent(getCodePushPath(), CodePushConstants.UNZIPPED_FOLDER_NAME);
    }

    public void clearUpdates() {
        FileUtils.deleteDirectoryAtPath(getCodePushPath());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0043: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:68), block:B:13:0x0043 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r11v8 */
    public void downloadAndReplaceCurrentBundle(String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        Object obj;
        OutputStream outputStream;
        Object obj2;
        MalformedURLException e10;
        OutputStream outputStream2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                try {
                    bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    try {
                        File file = new File(getCurrentPackageBundlePath(str2));
                        file.delete();
                        str2 = new FileOutputStream(file);
                        try {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(str2, CodePushConstants.DOWNLOAD_BUFFER_SIZE);
                            try {
                                byte[] bArr = new byte[CodePushConstants.DOWNLOAD_BUFFER_SIZE];
                                while (true) {
                                    int i7 = bufferedInputStream.read(bArr, 0, CodePushConstants.DOWNLOAD_BUFFER_SIZE);
                                    if (i7 < 0) {
                                        try {
                                            bufferedOutputStream.close();
                                            str2.close();
                                            bufferedInputStream.close();
                                            httpURLConnection.disconnect();
                                            return;
                                        } catch (IOException e11) {
                                            throw new CodePushUnknownException("Error closing IO resources.", e11);
                                        }
                                    }
                                    bufferedOutputStream.write(bArr, 0, i7);
                                }
                            } catch (MalformedURLException e12) {
                                e10 = e12;
                                throw new CodePushMalformedDataException(str, e10);
                            }
                        } catch (MalformedURLException e13) {
                            e10 = e13;
                        } catch (Throwable th) {
                            th = th;
                            if (outputStream2 != null) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e14) {
                                    throw new CodePushUnknownException("Error closing IO resources.", e14);
                                }
                            }
                            if (str2 != 0) {
                                str2.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (MalformedURLException e15) {
                        e = e15;
                        obj2 = null;
                        e10 = e;
                        throw new CodePushMalformedDataException(str, e10);
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = 0;
                    }
                } catch (MalformedURLException e16) {
                    e = e16;
                    obj = null;
                    obj2 = obj;
                    e10 = e;
                    throw new CodePushMalformedDataException(str, e10);
                } catch (Throwable th3) {
                    th = th3;
                    str2 = 0;
                    bufferedInputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                outputStream2 = outputStream;
            }
        } catch (MalformedURLException e17) {
            e = e17;
            obj = null;
        } catch (Throwable th5) {
            th = th5;
            str2 = 0;
            httpURLConnection = null;
            bufferedInputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x023d A[Catch: IOException -> 0x0239, TryCatch #0 {IOException -> 0x0239, blocks: (B:121:0x0235, B:125:0x023d, B:127:0x0242, B:129:0x0247), top: B:134:0x0235 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0242 A[Catch: IOException -> 0x0239, TryCatch #0 {IOException -> 0x0239, blocks: (B:121:0x0235, B:125:0x023d, B:127:0x0242, B:129:0x0247), top: B:134:0x0235 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0247 A[Catch: IOException -> 0x0239, TRY_LEAVE, TryCatch #0 {IOException -> 0x0239, blocks: (B:121:0x0235, B:125:0x023d, B:127:0x0242, B:129:0x0247), top: B:134:0x0235 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0235 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void downloadPackage(JSONObject jSONObject, String str, DownloadProgressCallback downloadProgressCallback, String str2) throws IOException {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        BufferedOutputStream bufferedOutputStream2;
        String str3;
        String str4;
        String str5 = "Error closing IO resources.";
        String strOptString = jSONObject.optString("packageHash", null);
        String packageFolderPath = getPackageFolderPath(strOptString);
        String strAppendPathComponent = CodePushUtils.appendPathComponent(packageFolderPath, CodePushConstants.PACKAGE_FILE_NAME);
        if (FileUtils.fileAtPathExists(packageFolderPath)) {
            FileUtils.deleteDirectoryAtPath(packageFolderPath);
        }
        String strOptString2 = jSONObject.optString(CodePushConstants.DOWNLOAD_URL_KEY, null);
        try {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(strOptString2).openConnection()));
                try {
                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
                    bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                    try {
                        long contentLength = httpURLConnection.getContentLength();
                        File file = new File(getCodePushPath());
                        file.mkdirs();
                        File file2 = new File(file, CodePushConstants.DOWNLOAD_FILE_NAME);
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                        try {
                            bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream2, CodePushConstants.DOWNLOAD_BUFFER_SIZE);
                            fileOutputStream = fileOutputStream2;
                            try {
                                byte[] bArr = new byte[CodePushConstants.DOWNLOAD_BUFFER_SIZE];
                                httpURLConnection = httpURLConnection;
                                try {
                                    byte[] bArr2 = new byte[4];
                                    long j6 = 0;
                                    while (true) {
                                        str3 = str5;
                                        strOptString2 = strOptString2;
                                        try {
                                            int i7 = bufferedInputStream.read(bArr, 0, CodePushConstants.DOWNLOAD_BUFFER_SIZE);
                                            if (i7 < 0) {
                                                break;
                                            }
                                            if (j6 < 4) {
                                                int i10 = 0;
                                                while (i10 < i7) {
                                                    int i11 = ((int) j6) + i10;
                                                    int i12 = i10;
                                                    if (i11 >= 4) {
                                                        break;
                                                    }
                                                    try {
                                                        bArr2[i11] = bArr[i12];
                                                        i10 = i12 + 1;
                                                    } catch (MalformedURLException e10) {
                                                        e = e10;
                                                        str5 = str3;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        bufferedOutputStream = bufferedOutputStream2;
                                                        str5 = str3;
                                                        if (bufferedOutputStream != null) {
                                                            try {
                                                                bufferedOutputStream.close();
                                                            } catch (IOException e11) {
                                                                throw new CodePushUnknownException(str5, e11);
                                                            }
                                                        }
                                                        if (fileOutputStream != null) {
                                                            fileOutputStream.close();
                                                        }
                                                        if (bufferedInputStream != null) {
                                                            bufferedInputStream.close();
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            }
                                            j6 += (long) i7;
                                            bufferedOutputStream2.write(bArr, 0, i7);
                                            downloadProgressCallback.call(new DownloadProgress(contentLength, j6));
                                            str5 = str3;
                                            strOptString2 = strOptString2;
                                        } catch (MalformedURLException e12) {
                                            e = e12;
                                            str5 = str3;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            str5 = str3;
                                        }
                                        httpURLConnection2 = httpURLConnection;
                                        throw new CodePushMalformedDataException(strOptString2, e);
                                    }
                                    if (contentLength == j6) {
                                        boolean z3 = ByteBuffer.wrap(bArr2).getInt() == 1347093252;
                                        try {
                                            bufferedOutputStream2.close();
                                            fileOutputStream.close();
                                            bufferedInputStream.close();
                                            httpURLConnection.disconnect();
                                            if (z3) {
                                                String unzippedFolderPath = getUnzippedFolderPath();
                                                FileUtils.unzipFile(file2, unzippedFolderPath);
                                                FileUtils.deleteFileOrFolderSilently(file2);
                                                String strAppendPathComponent2 = CodePushUtils.appendPathComponent(unzippedFolderPath, CodePushConstants.DIFF_MANIFEST_FILE_NAME);
                                                boolean zFileAtPathExists = FileUtils.fileAtPathExists(strAppendPathComponent2);
                                                if (zFileAtPathExists) {
                                                    str4 = packageFolderPath;
                                                    CodePushUpdateUtils.copyNecessaryFilesFromCurrentPackage(strAppendPathComponent2, getCurrentPackageFolderPath(), str4);
                                                    new File(strAppendPathComponent2).delete();
                                                } else {
                                                    str4 = packageFolderPath;
                                                }
                                                FileUtils.copyDirectoryContents(unzippedFolderPath, str4);
                                                FileUtils.deleteFileAtPathSilently(unzippedFolderPath);
                                                String strFindJSBundleInUpdateContents = CodePushUpdateUtils.findJSBundleInUpdateContents(str4, str);
                                                if (strFindJSBundleInUpdateContents == null) {
                                                    throw new CodePushInvalidUpdateException(q0.k("Update is invalid - A JS bundle file named \"", str, "\" could not be found within the downloaded contents. Please check that you are releasing your CodePush updates using the exact same JS bundle file name that was shipped with your app's binary."));
                                                }
                                                if (FileUtils.fileAtPathExists(strAppendPathComponent)) {
                                                    new File(strAppendPathComponent).delete();
                                                }
                                                if (zFileAtPathExists) {
                                                    CodePushUtils.log("Applying diff update.");
                                                } else {
                                                    CodePushUtils.log("Applying full update.");
                                                }
                                                boolean z8 = str2 != null;
                                                boolean zFileAtPathExists2 = FileUtils.fileAtPathExists(CodePushUpdateUtils.getSignatureFilePath(str4));
                                                if (z8) {
                                                    if (!zFileAtPathExists2) {
                                                        throw new CodePushInvalidUpdateException("Error! Public key was provided but there is no JWT signature within app bundle to verify. Possible reasons, why that might happen: \n1. You've been released CodePush bundle update using version of CodePush CLI that is not support code signing.\n2. You've been released CodePush bundle update without providing --privateKeyPath option.");
                                                    }
                                                    CodePushUpdateUtils.verifyFolderHash(str4, strOptString);
                                                    CodePushUpdateUtils.verifyUpdateSignature(str4, strOptString, str2);
                                                } else if (zFileAtPathExists2) {
                                                    CodePushUtils.log("Warning! JWT signature exists in codepush update but code integrity check couldn't be performed because there is no public key configured. Please ensure that public key is properly configured within your application.");
                                                    CodePushUpdateUtils.verifyFolderHash(str4, strOptString);
                                                } else if (zFileAtPathExists) {
                                                    CodePushUpdateUtils.verifyFolderHash(str4, strOptString);
                                                }
                                                CodePushUtils.setJSONValueForKey(jSONObject, CodePushConstants.RELATIVE_BUNDLE_PATH_KEY, strFindJSBundleInUpdateContents);
                                            } else {
                                                FileUtils.moveFile(file2, packageFolderPath, str);
                                            }
                                            CodePushUtils.writeJsonToFile(jSONObject, strAppendPathComponent);
                                            return;
                                        } catch (IOException e13) {
                                            throw new CodePushUnknownException(str3, e13);
                                        }
                                    }
                                    str5 = str3;
                                    try {
                                        throw new CodePushUnknownException("Received " + j6 + " bytes, expected " + contentLength);
                                    } catch (MalformedURLException e14) {
                                        e = e14;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        bufferedOutputStream = bufferedOutputStream2;
                                        if (bufferedOutputStream != null) {
                                            bufferedOutputStream.close();
                                        }
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        throw th;
                                    }
                                } catch (MalformedURLException e15) {
                                    e = e15;
                                    str5 = "Error closing IO resources.";
                                    strOptString2 = strOptString2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    str5 = "Error closing IO resources.";
                                }
                            } catch (MalformedURLException e16) {
                                e = e16;
                                str5 = "Error closing IO resources.";
                                strOptString2 = strOptString2;
                                httpURLConnection = httpURLConnection;
                            } catch (Throwable th5) {
                                th = th5;
                                str5 = "Error closing IO resources.";
                                httpURLConnection = httpURLConnection;
                            }
                            httpURLConnection2 = httpURLConnection;
                        } catch (MalformedURLException e17) {
                            e = e17;
                            str5 = "Error closing IO resources.";
                            fileOutputStream = fileOutputStream2;
                            strOptString2 = strOptString2;
                            httpURLConnection2 = httpURLConnection;
                            bufferedOutputStream2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            str5 = "Error closing IO resources.";
                            fileOutputStream = fileOutputStream2;
                            httpURLConnection = httpURLConnection;
                            bufferedOutputStream = null;
                        }
                    } catch (MalformedURLException e18) {
                        e = e18;
                        str5 = "Error closing IO resources.";
                        strOptString2 = strOptString2;
                        httpURLConnection2 = httpURLConnection;
                        bufferedOutputStream2 = null;
                        fileOutputStream = null;
                    } catch (Throwable th7) {
                        th = th7;
                        bufferedOutputStream = null;
                        fileOutputStream = null;
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (MalformedURLException e19) {
                    e = e19;
                    httpURLConnection2 = httpURLConnection;
                    bufferedInputStream = null;
                    bufferedOutputStream2 = null;
                    fileOutputStream = null;
                    throw new CodePushMalformedDataException(strOptString2, e);
                } catch (Throwable th8) {
                    th = th8;
                    bufferedOutputStream = null;
                    bufferedInputStream = null;
                }
            } catch (MalformedURLException e20) {
                e = e20;
                httpURLConnection2 = null;
            } catch (Throwable th9) {
                th = th9;
                str5 = "Error closing IO resources.";
                bufferedOutputStream = null;
                bufferedInputStream = null;
                fileOutputStream = null;
                httpURLConnection = null;
            }
            throw new CodePushMalformedDataException(strOptString2, e);
        } catch (Throwable th10) {
            th = th10;
            httpURLConnection = httpURLConnection2;
            bufferedOutputStream = bufferedOutputStream2;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public JSONObject getCurrentPackage() {
        String currentPackageHash = getCurrentPackageHash();
        if (currentPackageHash == null) {
            return null;
        }
        return getPackage(currentPackageHash);
    }

    public String getCurrentPackageBundlePath(String str) {
        JSONObject currentPackage;
        String currentPackageFolderPath = getCurrentPackageFolderPath();
        if (currentPackageFolderPath == null || (currentPackage = getCurrentPackage()) == null) {
            return null;
        }
        String strOptString = currentPackage.optString(CodePushConstants.RELATIVE_BUNDLE_PATH_KEY, null);
        return strOptString == null ? CodePushUtils.appendPathComponent(currentPackageFolderPath, str) : CodePushUtils.appendPathComponent(currentPackageFolderPath, strOptString);
    }

    public String getCurrentPackageFolderPath() {
        String strOptString = getCurrentPackageInfo().optString(CodePushConstants.CURRENT_PACKAGE_KEY, null);
        if (strOptString == null) {
            return null;
        }
        return getPackageFolderPath(strOptString);
    }

    public String getCurrentPackageHash() {
        return getCurrentPackageInfo().optString(CodePushConstants.CURRENT_PACKAGE_KEY, null);
    }

    public JSONObject getCurrentPackageInfo() {
        String statusFilePath = getStatusFilePath();
        if (!FileUtils.fileAtPathExists(statusFilePath)) {
            return new JSONObject();
        }
        try {
            return CodePushUtils.getJsonObjectFromFile(statusFilePath);
        } catch (IOException e10) {
            throw new CodePushUnknownException("Error getting current package info", e10);
        }
    }

    public JSONObject getPackage(String str) {
        try {
            return CodePushUtils.getJsonObjectFromFile(CodePushUtils.appendPathComponent(getPackageFolderPath(str), CodePushConstants.PACKAGE_FILE_NAME));
        } catch (IOException unused) {
            return null;
        }
    }

    public String getPackageFolderPath(String str) {
        return CodePushUtils.appendPathComponent(getCodePushPath(), str);
    }

    public JSONObject getPreviousPackage() {
        String previousPackageHash = getPreviousPackageHash();
        if (previousPackageHash == null) {
            return null;
        }
        return getPackage(previousPackageHash);
    }

    public String getPreviousPackageHash() {
        return getCurrentPackageInfo().optString(CodePushConstants.PREVIOUS_PACKAGE_KEY, null);
    }

    public void installPackage(JSONObject jSONObject, boolean z3) {
        String strOptString = jSONObject.optString("packageHash", null);
        JSONObject currentPackageInfo = getCurrentPackageInfo();
        String strOptString2 = currentPackageInfo.optString(CodePushConstants.CURRENT_PACKAGE_KEY, null);
        if (strOptString == null || !strOptString.equals(strOptString2)) {
            if (z3) {
                String currentPackageFolderPath = getCurrentPackageFolderPath();
                if (currentPackageFolderPath != null) {
                    FileUtils.deleteDirectoryAtPath(currentPackageFolderPath);
                }
            } else {
                String previousPackageHash = getPreviousPackageHash();
                if (previousPackageHash != null && !previousPackageHash.equals(strOptString)) {
                    FileUtils.deleteDirectoryAtPath(getPackageFolderPath(previousPackageHash));
                }
                CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.PREVIOUS_PACKAGE_KEY, currentPackageInfo.optString(CodePushConstants.CURRENT_PACKAGE_KEY, null));
            }
            CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.CURRENT_PACKAGE_KEY, strOptString);
            updateCurrentPackageInfo(currentPackageInfo);
        }
    }

    public void rollbackPackage() throws Throwable {
        JSONObject currentPackageInfo = getCurrentPackageInfo();
        FileUtils.deleteDirectoryAtPath(getCurrentPackageFolderPath());
        CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.CURRENT_PACKAGE_KEY, currentPackageInfo.optString(CodePushConstants.PREVIOUS_PACKAGE_KEY, null));
        CodePushUtils.setJSONValueForKey(currentPackageInfo, CodePushConstants.PREVIOUS_PACKAGE_KEY, null);
        updateCurrentPackageInfo(currentPackageInfo);
    }

    public void updateCurrentPackageInfo(JSONObject jSONObject) throws Throwable {
        try {
            CodePushUtils.writeJsonToFile(jSONObject, getStatusFilePath());
        } catch (IOException e10) {
            throw new CodePushUnknownException("Error updating current package info", e10);
        }
    }
}
