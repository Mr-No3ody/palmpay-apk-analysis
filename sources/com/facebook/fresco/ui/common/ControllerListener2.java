package com.facebook.fresco.ui.common;

import S2.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\b\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0006J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\f\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/fresco/ui/common/ControllerListener2;", "INFO", "", "", "id", "callerContext", "LS2/d;", "extraData", "", "onSubmit", "(Ljava/lang/String;Ljava/lang/Object;LS2/d;)V", "imageInfo", "onFinalImageSet", "onIntermediateImageSet", "(Ljava/lang/String;Ljava/lang/Object;)V", "onIntermediateImageFailed", "(Ljava/lang/String;)V", "", "throwable", "onFailure", "(Ljava/lang/String;Ljava/lang/Throwable;LS2/d;)V", "onRelease", "(Ljava/lang/String;LS2/d;)V", "onEmptyEvent", "(Ljava/lang/Object;)V", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ControllerListener2<INFO> {
    void onEmptyEvent(@Nullable Object callerContext);

    void onFailure(@NotNull String id2, @Nullable Throwable throwable, @Nullable d extraData);

    void onFinalImageSet(@NotNull String id2, @Nullable INFO imageInfo, @Nullable d extraData);

    void onIntermediateImageFailed(@NotNull String id2);

    void onIntermediateImageSet(@NotNull String id2, @Nullable INFO imageInfo);

    void onRelease(@NotNull String id2, @Nullable d extraData);

    void onSubmit(@NotNull String id2, @Nullable Object callerContext, @Nullable d extraData);
}
