package defpackage;

import C0.G;
import F6.d;
import com.transsnet.palmpay.util.FileUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements CommonFileUploadBridge.FileCopyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonFileUploadBridge f18850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommonFileUploadBridge.FileUploadParam f18851b;

    public c(CommonFileUploadBridge commonFileUploadBridge, CommonFileUploadBridge.FileUploadParam fileUploadParam) {
        this.f18850a = commonFileUploadBridge;
        this.f18851b = fileUploadParam;
    }

    @Override // CommonFileUploadBridge.FileCopyListener
    public final void onFailure(String str) {
        d.c(CommonFileUploadBridge.TAG, G.o("onFailure >>> ", str));
        this.f18850a.handleReject("uploadFile error, " + str);
    }

    @Override // CommonFileUploadBridge.FileCopyListener
    public final void onSuccess(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        d.h(CommonFileUploadBridge.TAG, 3, "copyFileToCacheDir onSuccess >>> start upload");
        boolean zIsFile = FileUtils.isFile(filePath);
        CommonFileUploadBridge commonFileUploadBridge = this.f18850a;
        if (zIsFile) {
            commonFileUploadBridge.uploadFile(filePath, this.f18851b);
        } else {
            commonFileUploadBridge.handleReject("copyFileToCacheDir error, file is noe exist");
        }
    }
}
