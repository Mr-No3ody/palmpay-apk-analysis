package defpackage;

import C0.G;
import F6.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Keep;
import com.didi.drouter.annotation.Service;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.activityresult.IActivityResult;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Service(alias = {"/file/upload"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001f !\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"LCommonFileUploadBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "LCommonFileUploadBridge$FileUploadParam;", "<init>", "()V", "", "filePath", "params", "", "uploadFile", "(Ljava/lang/String;LCommonFileUploadBridge$FileUploadParam;)V", "Landroid/content/Context;", "context", "uriString", "LCommonFileUploadBridge$FileCopyListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "copyFileToCacheDir", "(Landroid/content/Context;Ljava/lang/String;LCommonFileUploadBridge$FileCopyListener;)V", "generateTempPath", "(Landroid/content/Context;)Ljava/lang/String;", "Ljava/io/InputStream;", "inputStream", "Ljava/io/OutputStream;", "outputStream", "writeFileFromInputStream", "(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/lang/String;LCommonFileUploadBridge$FileCopyListener;)V", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(LCommonFileUploadBridge$FileUploadParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "b", "FileCopyListener", "FileUploadEntity", "FileUploadParam", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonFileUploadBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonFileUploadBridge.kt\nCommonFileUploadBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n1#2:193\n*E\n"})
public final class CommonFileUploadBridge extends SyncBridge<FileUploadParam> {

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final String TAG = "CommonFileUploadBridge";

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¨\u0006\b"}, d2 = {"LCommonFileUploadBridge$FileCopyListener;", "", "onSuccess", "", "filePath", "", "onFailure", "error", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface FileCopyListener {
        void onFailure(@Nullable String error);

        void onSuccess(@NotNull String filePath);
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"LCommonFileUploadBridge$FileUploadEntity;", "", "filePath", "", "fileUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getFileUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FileUploadEntity {

        @Nullable
        private final String filePath;

        @Nullable
        private final String fileUrl;

        public FileUploadEntity(@Nullable String str, @Nullable String str2) {
            this.filePath = str;
            this.fileUrl = str2;
        }

        public static /* synthetic */ FileUploadEntity copy$default(FileUploadEntity fileUploadEntity, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = fileUploadEntity.filePath;
            }
            if ((i7 & 2) != 0) {
                str2 = fileUploadEntity.fileUrl;
            }
            return fileUploadEntity.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFileUrl() {
            return this.fileUrl;
        }

        @NotNull
        public final FileUploadEntity copy(@Nullable String filePath, @Nullable String fileUrl) {
            return new FileUploadEntity(filePath, fileUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileUploadEntity)) {
                return false;
            }
            FileUploadEntity fileUploadEntity = (FileUploadEntity) other;
            return Intrinsics.c(this.filePath, fileUploadEntity.filePath) && Intrinsics.c(this.fileUrl, fileUploadEntity.fileUrl);
        }

        @Nullable
        public final String getFilePath() {
            return this.filePath;
        }

        @Nullable
        public final String getFileUrl() {
            return this.fileUrl;
        }

        public int hashCode() {
            String str = this.filePath;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fileUrl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return G.q("FileUploadEntity(filePath=", this.filePath, ", fileUrl=", this.fileUrl, ")");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"LCommonFileUploadBridge$FileUploadParam;", "", "useExtendedUploadTimeout", "", "<init>", "(Ljava/lang/Boolean;)V", "getUseExtendedUploadTimeout", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)LCommonFileUploadBridge$FileUploadParam;", "equals", "other", "hashCode", "", "toString", "", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FileUploadParam {

        @Nullable
        private final Boolean useExtendedUploadTimeout;

        /* JADX WARN: Multi-variable type inference failed */
        public FileUploadParam() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ FileUploadParam copy$default(FileUploadParam fileUploadParam, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                bool = fileUploadParam.useExtendedUploadTimeout;
            }
            return fileUploadParam.copy(bool);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getUseExtendedUploadTimeout() {
            return this.useExtendedUploadTimeout;
        }

        @NotNull
        public final FileUploadParam copy(@Nullable Boolean useExtendedUploadTimeout) {
            return new FileUploadParam(useExtendedUploadTimeout);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FileUploadParam) && Intrinsics.c(this.useExtendedUploadTimeout, ((FileUploadParam) other).useExtendedUploadTimeout);
        }

        @Nullable
        public final Boolean getUseExtendedUploadTimeout() {
            return this.useExtendedUploadTimeout;
        }

        public int hashCode() {
            Boolean bool = this.useExtendedUploadTimeout;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @NotNull
        public String toString() {
            return "FileUploadParam(useExtendedUploadTimeout=" + this.useExtendedUploadTimeout + ")";
        }

        public FileUploadParam(@Nullable Boolean bool) {
            this.useExtendedUploadTimeout = bool;
        }

        public /* synthetic */ FileUploadParam(Boolean bool, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : bool);
        }
    }

    private final void copyFileToCacheDir(Context context, String uriString, FileCopyListener listener) throws Throwable {
        d.h(TAG, 3, G.o("copyFileToCacheDir >>> ", uriString));
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(uriString), "r");
            String strGenerateTempPath = generateTempPath(context);
            writeFileFromInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor), new FileOutputStream(strGenerateTempPath), strGenerateTempPath, listener);
        } catch (Exception e10) {
            e10.printStackTrace();
            listener.onFailure(e10.getMessage());
        }
    }

    private final String generateTempPath(Context context) {
        d.h(TAG, 3, "generateTempPath >>>");
        File file = new File(context.getCacheDir(), "tz_prove_" + System.currentTimeMillis() + ".pdf");
        if (file.exists()) {
            file.delete();
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$3$lambda$2(CommonFileUploadBridge commonFileUploadBridge, Activity activity, FileUploadParam fileUploadParam, int i7, Intent intent) throws Throwable {
        d.h(TAG, 3, G.m(i7, "launcher result >>> resultCode="));
        if (i7 != -1) {
            if (i7 != 0) {
                d.h(TAG, 3, "handleReject-----------");
                commonFileUploadBridge.handleReject("Something wrong");
                return;
            } else {
                d.h(TAG, 3, "handleCancel-----------");
                BaseBridge.handleCancel$default(commonFileUploadBridge, null, 1, null);
                return;
            }
        }
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            commonFileUploadBridge.handleReject("choose file error, uri is null");
            return;
        }
        String string = data.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        commonFileUploadBridge.copyFileToCacheDir(activity, string, new c(commonFileUploadBridge, fileUploadParam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadFile(String filePath, FileUploadParam params) {
        boolean zC = params != null ? Intrinsics.c(params.getUseExtendedUploadTimeout(), Boolean.TRUE) : false;
        d.h(TAG, 3, "uploadFile >>>filePath=" + filePath + ", useExtendedUploadTimeout=" + zC);
        FileUploadManager.getInstance().uploadFile(new File(filePath), true, new d(this, filePath), zC);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0068 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #6 {Exception -> 0x0064, blocks: (B:36:0x0060, B:40:0x0068), top: B:48:0x0060 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.OutputStream] */
    private final void writeFileFromInputStream(InputStream inputStream, OutputStream outputStream, String filePath, FileCopyListener listener) throws Throwable {
        ?? bufferedInputStream = 3;
        bufferedInputStream = 3;
        d.h(TAG, 3, "writeFileFromInputStream >>>");
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        try {
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(inputStream);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                        try {
                            r3 = new byte[1024];
                            while (true) {
                                int i7 = bufferedInputStream.read(r3);
                                if (i7 == -1) {
                                    break;
                                } else {
                                    outputStream.write(r3, 0, i7);
                                }
                            }
                            outputStream.flush();
                            listener.onSuccess(filePath);
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                        } catch (Exception e10) {
                            e = e10;
                            r3 = bufferedOutputStream;
                            e.printStackTrace();
                            listener.onFailure(e.getMessage());
                            if (r3 != 0) {
                                r3.close();
                            }
                            if (bufferedInputStream != 0) {
                                bufferedInputStream.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            r3 = bufferedOutputStream;
                            if (r3 != 0) {
                                try {
                                    r3.close();
                                    if (bufferedInputStream != 0) {
                                        bufferedInputStream.close();
                                    }
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                    throw th;
                                }
                            } else if (bufferedInputStream != 0) {
                                bufferedInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            } catch (Exception e14) {
                e = e14;
                bufferedInputStream = 0;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable FileUploadParam params, @Nullable IBridgeCallback callback) {
        d.h(TAG, 3, "onHandle >>>");
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/pdf");
        Activity activity = getActivity();
        if (activity != null) {
            if (!(activity instanceof IActivityResult)) {
                activity = null;
            }
            if (activity != null) {
                ((IActivityResult) activity).getF28604i().f(intent, new a(this, 0, activity, params));
            }
        }
    }
}
