package com.mikepenz.iconics.animation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/mikepenz/iconics/animation/IconicsAnimationListener;", "", "onAnimationCancel", "", "processor", "Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;", "onAnimationEnd", "isReverse", "", "onAnimationRepeat", "onAnimationStart", "iconics-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IconicsAnimationListener {
    void onAnimationCancel(@NotNull IconicsAnimationProcessor processor);

    void onAnimationEnd(@NotNull IconicsAnimationProcessor processor);

    void onAnimationEnd(@NotNull IconicsAnimationProcessor processor, boolean isReverse);

    void onAnimationRepeat(@NotNull IconicsAnimationProcessor processor);

    void onAnimationStart(@NotNull IconicsAnimationProcessor processor);

    void onAnimationStart(@NotNull IconicsAnimationProcessor processor, boolean isReverse);
}
