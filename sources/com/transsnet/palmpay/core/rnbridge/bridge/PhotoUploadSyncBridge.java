package com.transsnet.palmpay.core.rnbridge.bridge;

import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/photo/uploadsync"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/PhotoUploadSyncBridge;", "Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge;", "<init>", "()V", "isDebug", "", "uploadToS3", "", "path", "", "params", "Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PhotoUploadSyncBridge extends com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge {
    @Override // com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge
    public boolean isDebug() {
        return false;
    }

    @Override // com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge
    public void uploadToS3(@NotNull String path, @Nullable com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge.PhotoUploadParam params) {
        Intrinsics.checkNotNullParameter(path, "path");
        FileUploadManager.getInstance().uploadFileSync(new File(path), false, new FileUploadManager.UploadListener() { // from class: com.transsnet.palmpay.core.rnbridge.bridge.PhotoUploadSyncBridge.uploadToS3.1
            @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
            public void onComplete(String url, File originFile) {
                PhotoUploadSyncBridge photoUploadSyncBridge = PhotoUploadSyncBridge.this;
                if (url == null) {
                    url = "";
                }
                BaseBridge.handleSuccess$default(photoUploadSyncBridge, new com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge.PhotoUploadEntry(url, originFile != null ? originFile.getAbsolutePath() : null), null, 2, null);
            }

            @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
            public void onError(Exception ex) {
                PhotoUploadSyncBridge.this.handleFail(new Throwable(ex));
            }

            @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
            public void onProgressChanged(long bytesCurrent, long bytesTotal) {
            }

            @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
            public void onStartSync(String url, File originFile) {
                PhotoUploadSyncBridge photoUploadSyncBridge = PhotoUploadSyncBridge.this;
                if (url == null) {
                    url = "";
                }
                BaseBridge.handleSuccess$default(photoUploadSyncBridge, new com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge.PhotoUploadEntry(url, originFile != null ? originFile.getAbsolutePath() : null), null, 2, null);
            }
        });
    }
}
