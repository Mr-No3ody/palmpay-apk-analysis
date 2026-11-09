package com.transsnet.palmpay.core.manager;

import Pa.T;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.fragment.app.RunnableC1169e;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.req.GetS3PreSignedUrl;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.util.EncryptUtils;
import com.transsnet.palmpay.util.RegexUtils;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.L;
import okhttp3.S;
import okhttp3.U;
import okhttp3.X;
import okhttp3.c0;
import okhttp3.e0;
import p309ua.b;
import p324va.c;

/* JADX INFO: loaded from: classes3.dex */
public class FileUploadManager {
    private static final int EXTENDED_UPLOAD_CONNECT_TIMEOUT_SECONDS = 30;
    private static final int EXTENDED_UPLOAD_READ_TIMEOUT_SECONDS = 200;
    private static final int EXTENDED_UPLOAD_WRITE_TIMEOUT_SECONDS = 200;
    private static final String PRIVATE_RELEASE_BUCKET_NAME = "transsnet-app-images-prod";
    private static final String PRIVATE_TEST_BUCKET_NAME = "transsnet-apps-images-test";
    private static final String RELEASE_BUCKET_NAME = "transsnet-android-upload-image-prod";
    private static final boolean RELEASE_BUILD = true;
    private static final String S3_SERVER_URL1 = "https://s3-eu-west-1.amazonaws.com/";
    private static final String S3_SERVER_URL2 = "https://s3-ap-southeast-1.amazonaws.com/";
    private static final String TAG = "FileUploadManager";
    private static final String TEST_BUCKET_NAME = "transsnet-android-upload-dev";

    public interface UploadListener {
        void onComplete(String url, File originFile);

        void onError(Exception ex);

        void onProgressChanged(long bytesCurrent, long bytesTotal);

        void onStartSync(String url, File originFile);
    }

    public /* synthetic */ FileUploadManager(int i7) {
        this();
    }

    private String buildPath(String fileName, boolean isPrivate) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isPrivate ? "private/" : "");
        sb2.append("prod/");
        sb2.append(EncryptUtils.encryptMD5ToString(String.valueOf(System.currentTimeMillis())));
        sb2.append("_");
        sb2.append(fileName);
        return sb2.toString();
    }

    public static String getBucketName(boolean isPrivate) {
        return isPrivate ? PRIVATE_RELEASE_BUCKET_NAME : RELEASE_BUCKET_NAME;
    }

    public static FileUploadManager getInstance() {
        return b.f42729a;
    }

    private U getUploadClient(boolean useExtendedUploadTimeout) {
        U httpClient = BaseApplication.getInstance().getHttpClient();
        if (httpClient == null || !useExtendedUploadTimeout) {
            return httpClient;
        }
        S sA = httpClient.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        sA.b(30L, timeUnit);
        sA.e(200L, timeUnit);
        sA.f(200L, timeUnit);
        return new U(sA);
    }

    public static boolean isPrivateBucket(String name) {
        return PRIVATE_TEST_BUCKET_NAME.equals(name) || PRIVATE_RELEASE_BUCKET_NAME.equals(name);
    }

    public static boolean isPrivateS3ImageUrl(String url) {
        if (isS3ImageUrl(url)) {
            try {
                String path = new URL(url).getPath();
                if (isPrivateBucket(parseBucketName(url))) {
                    return true;
                }
                if (!TextUtils.isEmpty(path)) {
                    return path.startsWith("/transsnet-android-upload-image-prod/private") || path.startsWith("/transsnet-android-upload-dev/private") || path.startsWith("/transsnet-apps-images-test/private") || path.startsWith("/private") || path.startsWith("/transsnet-app-images-prod/private");
                }
            } catch (Exception e10) {
                Log.e(TAG, "isPrivateS3ImageUrl: ", e10);
            }
        }
        return false;
    }

    public static boolean isS3ImageUrl(String url) {
        if (TextUtils.isEmpty(url) || !RegexUtils.isURL(url)) {
            return false;
        }
        return url.startsWith(S3_SERVER_URL1) || url.startsWith(S3_SERVER_URL2) || url.contains("s3.amazonaws.com/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadFile$0(File file, boolean z3, UploadListener uploadListener, boolean z8) {
        try {
            String strUploadFileToS3V2 = uploadFileToS3V2(file, z3, uploadListener, z8);
            if (uploadListener != null) {
                uploadListener.onComplete(strUploadFileToS3V2, file);
            }
        } catch (Exception e10) {
            Log.e(TAG, "uploadFile: ", e10);
            if (uploadListener != null) {
                uploadListener.onError(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadFileSync$1(File file, boolean z3, UploadListener uploadListener) {
        try {
            String strUploadFileToS3V2 = uploadFileToS3V2(file, z3, uploadListener, false);
            if (uploadListener != null) {
                uploadListener.onComplete(strUploadFileToS3V2, file);
            }
        } catch (Exception e10) {
            if (uploadListener != null) {
                uploadListener.onError(e10);
            }
        }
    }

    public static String parseBucketName(String url) {
        if (!isS3ImageUrl(url)) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(new URL(url).getPath())) {
                return null;
            }
            if (url.contains(RELEASE_BUCKET_NAME)) {
                return RELEASE_BUCKET_NAME;
            }
            if (url.contains(TEST_BUCKET_NAME)) {
                return TEST_BUCKET_NAME;
            }
            if (url.contains(PRIVATE_TEST_BUCKET_NAME)) {
                return PRIVATE_TEST_BUCKET_NAME;
            }
            if (url.contains(PRIVATE_RELEASE_BUCKET_NAME)) {
                return PRIVATE_RELEASE_BUCKET_NAME;
            }
            return null;
        } catch (Exception e10) {
            Log.e(TAG, "parseBucketName: ", e10);
            return null;
        }
    }

    @WorkerThread
    private String uploadFileToS3V2(File file, boolean privateFile, final UploadListener listener) throws Exception {
        return uploadFileToS3V2(file, privateFile, listener, false);
    }

    public void uploadFile(final File file, final boolean isPrivate, final UploadListener listener, final boolean useExtendedUploadTimeout) {
        T.b(-4).execute(new Runnable() { // from class: ua.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f42724a.lambda$uploadFile$0(file, isPrivate, listener, useExtendedUploadTimeout);
            }
        });
    }

    public void uploadFileSync(final File file, boolean isPrivate, final UploadListener listener) {
        T.b(-4).execute(new RunnableC1169e(2, this, file, listener, isPrivate));
    }

    private FileUploadManager() {
    }

    @WorkerThread
    private String uploadFileToS3V2(File file, boolean privateFile, final UploadListener listener, boolean useExtendedUploadTimeout) throws Exception {
        GetS3PreSignedUrl getS3PreSignedUrl = new GetS3PreSignedUrl();
        getS3PreSignedUrl.bucketName = getBucketName(privateFile);
        getS3PreSignedUrl.filePath = buildPath(file.getName(), privateFile);
        getS3PreSignedUrl.permission = privateFile ? 2 : 1;
        getS3PreSignedUrl.contentType = "application/octet-stream";
        getS3PreSignedUrl.expiration = 3600000L;
        CommonStringResult commonStringResult = (CommonStringResult) ((PayApiService) c.f43141a.f14621b).generatePreSignedUrlForUpload(getS3PreSignedUrl).b();
        if (!commonStringResult.isSuccess()) {
            throw new p309ua.c(502, commonStringResult.getRespMsg());
        }
        if (TextUtils.isEmpty(commonStringResult.data)) {
            return null;
        }
        U uploadClient = getUploadClient(useExtendedUploadTimeout);
        c0 body = c0.create(L.f40589e.parse("application/octet-stream"), file);
        String strReplace = commonStringResult.data.replace("http://", "https://");
        listener.onStartSync(strReplace.split("\\?")[0], file);
        X x3 = new X();
        x3.e(HttpHeaders.CONTENT_TYPE, "application/octet-stream");
        x3.k(strReplace);
        Intrinsics.checkNotNullParameter(body, "body");
        x3.g("PUT", body);
        e0 e0VarExecute = FirebasePerfOkHttpClient.execute(uploadClient.newCall(x3.b()));
        if (e0VarExecute.isSuccessful()) {
            return strReplace.split("\\?")[0];
        }
        throw new p309ua.c(e0VarExecute.f40731d, e0VarExecute.f40730c);
    }

    public void uploadFile(final File file, boolean isPrivate, final UploadListener listener) {
        uploadFile(file, isPrivate, listener, false);
    }

    public void uploadFile(final File file, final UploadListener listener) {
        uploadFile(file, false, listener);
    }
}
