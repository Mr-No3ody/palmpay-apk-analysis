package com.palmpay.lib.bridgewrapper.photo.upload;

import Ff.h;
import androidx.activity.AbstractActivityC0822m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoMultipleUploadBridge$PhotoMultipleUploadEntry;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$1$1", f = "PhotoMultipleUploadBridge.kt", i = {0}, l = {132, 142}, m = "invokeSuspend", n = {"$this$async"}, s = {"L$0"})
public final class PhotoMultipleUploadBridge$upload$1$1$1 extends h implements Function2<CoroutineScope, Continuation<? super PhotoMultipleUploadBridge.PhotoMultipleUploadEntry>, Object> {
    final /* synthetic */ AbstractActivityC0822m $activity;
    final /* synthetic */ PhotoMultipleUploadBridge.PhotoMultipleUploadParam $params;
    final /* synthetic */ String $path;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PhotoMultipleUploadBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoMultipleUploadBridge$upload$1$1$1(String str, AbstractActivityC0822m abstractActivityC0822m, PhotoMultipleUploadBridge.PhotoMultipleUploadParam photoMultipleUploadParam, PhotoMultipleUploadBridge photoMultipleUploadBridge, Continuation<? super PhotoMultipleUploadBridge$upload$1$1$1> continuation) {
        super(2, continuation);
        this.$path = str;
        this.$activity = abstractActivityC0822m;
        this.$params = photoMultipleUploadParam;
        this.this$0 = photoMultipleUploadBridge;
    }

    @Override // Ff.a
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PhotoMultipleUploadBridge$upload$1$1$1 photoMultipleUploadBridge$upload$1$1$1 = new PhotoMultipleUploadBridge$upload$1$1$1(this.$path, this.$activity, this.$params, this.this$0, continuation);
        photoMultipleUploadBridge$upload$1$1$1.L$0 = obj;
        return photoMultipleUploadBridge$upload$1$1$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r15 == r0) goto L38;
     */
    @Override // Ff.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super PhotoMultipleUploadBridge.PhotoMultipleUploadEntry> continuation) {
        return ((PhotoMultipleUploadBridge$upload$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
