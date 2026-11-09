package com.transsnet.palmpay.core.rnbridge.bridge;

import C0.G;
import F6.d;
import N8.q0;
import android.app.Activity;
import android.content.res.Resources;
import com.didi.drouter.annotation.Service;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.palmpay.lib.bridge.AsyncBridge;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.F;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.X;
import okhttp3.e0;
import okhttp3.h0;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/lottie/getFile"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J \u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/LottieFileBridge;", "Lcom/palmpay/lib/bridge/AsyncBridge;", "Lcom/transsnet/palmpay/core/rnbridge/bridge/LottieFileBean;", "<init>", "()V", "TAG", "", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "downloadFromUrl", "fileUrl", "outputDir", "loadFromResource", "fileName", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "getResourceId", "", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LottieFileBridge extends AsyncBridge<LottieFileBean> {

    @NotNull
    private final String TAG = "LottieFileBridge";

    private final void downloadFromUrl(String fileUrl, String outputDir) {
        try {
            File file = new File(outputDir, "http_" + StringsKt.R(fileUrl, "/"));
            if (file.exists() && file.length() > 0) {
                d.h(this.TAG, 3, "HTTPS Lottie file already exists, returning cached file");
                BaseBridge.handleSuccess$default(this, F.b(new Pair("filePath", file.getAbsolutePath())), null, 2, null);
                return;
            }
            X x3 = new X();
            x3.k(fileUrl);
            e0 e0VarExecute = FirebasePerfOkHttpClient.execute(BaseApplication.get().getHttpClient().newCall(x3.b()));
            try {
                if (!e0VarExecute.isSuccessful()) {
                    handleCancel("HTTP Error: " + e0VarExecute.f40731d);
                    e0VarExecute.close();
                    return;
                }
                h0 h0Var = e0VarExecute.f40734g;
                if (h0Var != null) {
                    InputStream inputStreamByteStream = h0Var.byteStream();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        f.d(inputStreamByteStream, fileOutputStream);
                        fileOutputStream.close();
                        BaseBridge.handleSuccess$default(this, F.b(new Pair("filePath", file.getAbsolutePath())), null, 2, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            b.o(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    handleCancel("Empty response body");
                }
                Unit unit = Unit.f38893a;
                e0VarExecute.close();
                return;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    b.o(e0VarExecute, th3);
                    throw th4;
                }
            }
            d.c(this.TAG, G.o("Error downloading file: ", e.getMessage()));
            handleCancel("Download failed: " + e.getMessage());
        } catch (Exception e10) {
            d.c(this.TAG, G.o("Error downloading file: ", e10.getMessage()));
            handleCancel("Download failed: " + e10.getMessage());
        }
    }

    private final int getResourceId(String fileName, String packageName) {
        String packageName2;
        try {
            return Class.forName(packageName + ".R$raw").getDeclaredField(fileName).getInt(null);
        } catch (Exception unused) {
            d.h(this.TAG, 3, q0.k("无法在 ", packageName, " 中找到资源"));
            try {
                return Class.forName("com.transsnet.palmpay.common.R$raw").getDeclaredField(fileName).getInt(null);
            } catch (Exception unused2) {
                d.h(this.TAG, 3, "无法在通用包中找到资源");
                try {
                    Activity activity = getActivity();
                    if (activity != null && (packageName2 = activity.getPackageName()) != null) {
                        return Class.forName(packageName2.concat(".R$raw")).getDeclaredField(fileName).getInt(null);
                    }
                    return 0;
                } catch (Exception unused3) {
                    d.h(this.TAG, 3, "无法在应用包中找到资源");
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:22:0x006a, B:24:0x0070, B:28:0x008b, B:27:0x0086), top: B:41:0x006a, outer: #2 }] */
    private final void loadFromResource(String fileName, String packageName, String outputDir) {
        Resources resources;
        try {
            File file = new File(outputDir, fileName + ".lottie");
            if (file.exists() && file.length() > 0) {
                d.h(this.TAG, 3, "Resource Lottie file already exists, returning cached file");
                BaseBridge.handleSuccess$default(this, F.b(new Pair("filePath", file.getAbsolutePath())), null, 2, null);
                return;
            }
            int resourceId = getResourceId(fileName, packageName);
            if (resourceId == 0) {
                handleCancel("Resource not found: " + fileName);
                return;
            }
            Activity activity = getActivity();
            InputStream inputStreamOpenRawResource = (activity == null || (resources = activity.getResources()) == null) ? null : resources.openRawResource(resourceId);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (inputStreamOpenRawResource != null) {
                try {
                    byte[] bArrY = f.y(inputStreamOpenRawResource);
                    if (bArrY != null) {
                        fileOutputStream.write(bArrY);
                        BaseBridge.handleSuccess$default(this, F.b(new Pair("filePath", file.getAbsolutePath())), null, 2, null);
                    } else {
                        handleCancel("Failed to read resource");
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.o(fileOutputStream, th);
                        throw th2;
                    }
                }
            } else {
                handleCancel("Failed to read resource");
            }
            Unit unit = Unit.f38893a;
            fileOutputStream.close();
        } catch (Exception e10) {
            d.c(this.TAG, G.o("Error loading resource: ", e10.getMessage()));
            handleCancel(String.valueOf(e10.getMessage()));
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable LottieFileBean params, @Nullable IBridgeCallback callback) {
        String filePath;
        if (params == null || (filePath = params.getFilePath()) == null) {
            handleCancel("Invalid parameters");
            return;
        }
        String str = BaseApplication.get().getCacheDir() + "/lottie";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (y.m(filePath, "https://", false) || y.m(filePath, "http://", false)) {
            downloadFromUrl(filePath, str);
        } else {
            loadFromResource(y.k(filePath, ".lottie", ""), "com.transsnet.palmpay.common", str);
        }
    }
}
