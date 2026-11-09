package com.palmpay.lib.bridgewrapper.video;

import Ff.h;
import android.app.Activity;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper;
import com.palmpay.lib.bridgewrapper.photo.upload.util.CompressUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.palmpay.lib.bridgewrapper.video.VideoUploadBridge$uploadToS3$1$1$1", f = "VideoUploadBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VideoUploadBridge$uploadToS3$1$1$1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $context;
    final /* synthetic */ boolean $it;
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ VideoUploadBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoUploadBridge$uploadToS3$1$1$1(Activity activity, String str, boolean z3, VideoUploadBridge videoUploadBridge, Continuation<? super VideoUploadBridge$uploadToS3$1$1$1> continuation) {
        super(2, continuation);
        this.$context = activity;
        this.$path = str;
        this.$it = z3;
        this.this$0 = videoUploadBridge;
    }

    @Override // Ff.a
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new VideoUploadBridge$uploadToS3$1$1$1(this.$context, this.$path, this.$it, this.this$0, continuation);
    }

    @Override // Ff.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        try {
            final File file = CompressUtils.INSTANCE.getFile(this.$context, this.$path);
            AWSHelper aWSHelper = AWSHelper.INSTANCE;
            boolean z3 = this.$it;
            boolean zIsDebug = this.this$0.isDebug();
            String accessKey = this.this$0.getAccessKey();
            String secretKey = this.this$0.getSecretKey();
            final VideoUploadBridge videoUploadBridge = this.this$0;
            aWSHelper.uploadToS3(file, z3, zIsDebug, accessKey, secretKey, new AWSHelper.UploadCallback() { // from class: com.palmpay.lib.bridgewrapper.video.VideoUploadBridge$uploadToS3$1$1$1.1
                @Override // com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper.UploadCallback
                public void onCancel() {
                    BaseBridge.handleCancel$default(videoUploadBridge, null, 1, null);
                }

                @Override // com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper.UploadCallback
                public void onFail(@Nullable String errorMsg) {
                    videoUploadBridge.handleFail(new Throwable(errorMsg));
                }

                @Override // com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper.UploadCallback
                public void onSuccess(@Nullable String fileUrl) {
                    VideoUploadBridge videoUploadBridge2 = videoUploadBridge;
                    if (fileUrl == null) {
                        fileUrl = "";
                    }
                    BaseBridge.handleSuccess$default(videoUploadBridge2, new VideoUploadBridge.VideoUploadEntry(fileUrl, file.getAbsolutePath()), null, 2, null);
                }
            }, this.this$0.getOkHttpClient());
        } catch (Exception e10) {
            e10.printStackTrace();
            this.this$0.handleFail(e10);
        }
        return Unit.f38893a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((VideoUploadBridge$uploadToS3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
