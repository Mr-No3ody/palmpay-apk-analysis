package com.mikepenz.iconics.animation;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(19)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u0007"}, d2 = {"Lcom/mikepenz/iconics/animation/IconicsAnimationPauseListener;", "", "onAnimationPause", "", "processor", "Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;", "onAnimationResume", "iconics-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IconicsAnimationPauseListener {
    @RequiresApi(19)
    void onAnimationPause(@NotNull IconicsAnimationProcessor processor);

    @RequiresApi(19)
    void onAnimationResume(@NotNull IconicsAnimationProcessor processor);
}
