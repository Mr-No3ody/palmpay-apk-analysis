package com.palmpay.lib.webview.offline.download;

import com.adjust.sdk.Constants;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.palmpay.lib.webview.offline.OfflineWebManager;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.transsnet.palmpay.custom_view.dialog.y;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.S;
import okhttp3.U;
import okhttp3.X;
import okhttp3.e0;
import okhttp3.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/palmpay/lib/webview/offline/download/DefaultDownloader;", "Lcom/palmpay/lib/webview/offline/download/IDownLoader;", "<init>", "()V", "", "directory", "fileName", "Ljava/io/File;", "buildFile", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "url", "phoneDir", "Lcom/palmpay/lib/webview/offline/download/IDownLoader$DownloadCallback;", "callback", "", "download", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/palmpay/lib/webview/offline/download/IDownLoader$DownloadCallback;)V", "Lokhttp3/U;", "getOkHttpClient", "()Lokhttp3/U;", "TAG", "Ljava/lang/String;", "", "DEFAULT_CONNECT_TIMEOUT_IN_MS", "I", "DEFAULT_READ_TIMEOUT_IN_MS", "BUFFER_SIZE_IN_BYTE", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultDownloader implements IDownLoader {

    @NotNull
    private final String TAG = "DefaultDownloader";
    private final int DEFAULT_CONNECT_TIMEOUT_IN_MS = Constants.CONNECTION_TIMEOUT_VERIFY;
    private final int DEFAULT_READ_TIMEOUT_IN_MS = Constants.CONNECTION_TIMEOUT_VERIFY;
    private final int BUFFER_SIZE_IN_BYTE = 1024;

    private final File buildFile(String directory, String fileName) {
        File file = new File(directory);
        boolean zExists = file.exists();
        if (!zExists) {
            zExists = file.mkdirs();
        }
        if (!zExists) {
            return null;
        }
        File file2 = new File(file, fileName);
        if (file2.exists()) {
            zExists = file2.delete();
        }
        if (zExists) {
            return file2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c A[Catch: Exception -> 0x003b, PHI: r8
      0x008c: PHI (r8v8 'e' java.lang.Exception) = (r8v7 'e' java.lang.Exception), (r8v9 'e' java.lang.Exception) binds: [B:45:0x00b1, B:30:0x008a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {Exception -> 0x003b, blocks: (B:3:0x0013, B:5:0x0031, B:7:0x0036, B:13:0x0042, B:15:0x0048, B:29:0x0087, B:31:0x008c, B:56:0x00c8, B:53:0x00c0, B:55:0x00c5, B:44:0x00ae, B:58:0x00cb, B:60:0x00d1, B:48:0x00b6, B:50:0x00bb, B:39:0x00a4, B:41:0x00a9, B:26:0x007f), top: B:70:0x0013, inners: #1, #2, #6 }] */
    @Override // com.palmpay.lib.webview.offline.download.IDownLoader
    public void download(@NotNull String url, @NotNull String phoneDir, @NotNull String fileName, @Nullable IDownLoader.DownloadCallback callback) throws Throwable {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(phoneDir, "phoneDir");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            U okHttpClient = getOkHttpClient();
            X x3 = new X();
            x3.k(url);
            e0 e0VarExecute = FirebasePerfOkHttpClient.execute(okHttpClient.newCall(x3.b()));
            if (!e0VarExecute.isSuccessful()) {
                if (callback != null) {
                    callback.fail(new Throwable("http response is error : ".concat(url)));
                    return;
                }
                return;
            }
            h0 h0Var = e0VarExecute.f40734g;
            File file = null;
            fileOutputStream = null;
            FileOutputStream fileOutputStream = null;
            InputStream inputStreamByteStream = h0Var != null ? h0Var.byteStream() : null;
            if (inputStreamByteStream != null) {
                File fileBuildFile = buildFile(phoneDir, fileName);
                if (fileBuildFile == null) {
                    OfflineWebLog.e(this.TAG, "base: ERR: file init err for " + phoneDir + File.separator + fileName);
                }
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileBuildFile);
                    try {
                        byte[] bArr = new byte[this.BUFFER_SIZE_IN_BYTE * 20];
                        while (true) {
                            int i7 = inputStreamByteStream.read(bArr);
                            if (i7 == -1) {
                                break;
                            } else {
                                fileOutputStream2.write(bArr, 0, i7);
                            }
                        }
                        Unit unit = Unit.f38893a;
                        try {
                            inputStreamByteStream.close();
                            fileOutputStream2.close();
                        } catch (Exception e10) {
                            e = e10;
                            e.printStackTrace();
                            if (callback != null) {
                                callback.fail(e);
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        OfflineWebLog.e(this.TAG, "base: ERR: read http or save file err");
                        if (callback != null) {
                            callback.fail(e);
                            Unit unit2 = Unit.f38893a;
                        }
                        try {
                            inputStreamByteStream.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e12) {
                            e = e12;
                            e.printStackTrace();
                            if (callback != null) {
                                callback.fail(e);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        try {
                            inputStreamByteStream.close();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (Exception e13) {
                            e13.printStackTrace();
                            if (callback != null) {
                                callback.fail(e13);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                }
                file = fileBuildFile;
            }
            if (callback != null) {
                callback.success(file, false);
            }
        } catch (Exception e15) {
            e15.printStackTrace();
        }
    }

    @NotNull
    public U getOkHttpClient() {
        try {
            S s3 = new S();
            ExecutorService executor = OfflineWebManager.getInstance().getExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "getExecutor(...)");
            y dispatcher = new y(executor);
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            s3.f40615a = dispatcher;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            s3.b(20L, timeUnit);
            s3.e(20L, timeUnit);
            return new U(s3);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
