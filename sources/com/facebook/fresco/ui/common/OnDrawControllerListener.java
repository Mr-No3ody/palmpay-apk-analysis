package com.facebook.fresco.ui.common;

import S2.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/fresco/ui/common/OnDrawControllerListener;", "INFO", "", "", "id", "imageInfo", "LS2/e;", "dimensionsInfo", "", "onImageDrawn", "(Ljava/lang/String;Ljava/lang/Object;LS2/e;)V", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OnDrawControllerListener<INFO> {
    void onImageDrawn(@NotNull String id2, INFO imageInfo, @NotNull e dimensionsInfo);
}
