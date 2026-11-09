package com.transsnet.palmpay.core.rnbridge.bridge;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.bridge.BaseBridge;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.transsnet.palmpay.core.rnbridge.bridge.PhotoUploadBridge$uploadToS3$1$1$1", f = "PhotoUploadBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PhotoUploadBridge$uploadToS3$1$1$1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $it;
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ PhotoUploadBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoUploadBridge$uploadToS3$1$1$1(PhotoUploadBridge photoUploadBridge, String str, boolean z3, Continuation<? super PhotoUploadBridge$uploadToS3$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = photoUploadBridge;
        this.$path = str;
        this.$it = z3;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PhotoUploadBridge$uploadToS3$1$1$1(this.this$0, this.$path, this.$it, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        try {
            if (this.this$0.checkContent(this.$path)) {
                BaseBridge.handleIllegalArgument$default(this.this$0, null, 1, null);
                return Unit.f38893a;
            }
            FileUploadManager fileUploadManager = FileUploadManager.getInstance();
            File file = new File(this.$path);
            boolean z3 = this.$it;
            final PhotoUploadBridge photoUploadBridge = this.this$0;
            fileUploadManager.uploadFile(file, z3, new FileUploadManager.UploadListener() { // from class: com.transsnet.palmpay.core.rnbridge.bridge.PhotoUploadBridge$uploadToS3$1$1$1.1
                @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
                public void onComplete(String url, File file2) {
                    String absolutePath;
                    PhotoUploadBridge photoUploadBridge2 = photoUploadBridge;
                    String str = "";
                    if (url == null) {
                        url = "";
                    }
                    if (file2 != null && (absolutePath = file2.getAbsolutePath()) != null) {
                        str = absolutePath;
                    }
                    BaseBridge.handleSuccess$default(photoUploadBridge2, new com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge.PhotoUploadEntry(url, str), null, 2, null);
                }

                @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
                public void onError(Exception e10) {
                    photoUploadBridge.handleFail(e10);
                }

                @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
                public void onProgressChanged(long bytesCurrent, long bytesTotal) {
                }

                @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
                public void onStartSync(String url, File originFile) {
                }
            });
            return Unit.f38893a;
        } catch (Exception e10) {
            e10.printStackTrace();
            this.this$0.handleFail(e10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PhotoUploadBridge$uploadToS3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
