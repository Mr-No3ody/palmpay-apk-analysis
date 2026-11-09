package com.facebook.fresco.ui.common;

import S2.i;
import S2.j;
import S2.m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/facebook/fresco/ui/common/ImagePerfDataListener;", "", "LS2/j;", "imagePerfData", "LS2/i;", "imageLoadStatus", "", "onImageLoadStatusUpdated", "(LS2/j;LS2/i;)V", "LS2/m;", "visibilityState", "onImageVisibilityUpdated", "(LS2/j;LS2/m;)V", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ImagePerfDataListener {
    void onImageLoadStatusUpdated(@NotNull j imagePerfData, @NotNull i imageLoadStatus);

    void onImageVisibilityUpdated(@NotNull j imagePerfData, @NotNull m visibilityState);
}
