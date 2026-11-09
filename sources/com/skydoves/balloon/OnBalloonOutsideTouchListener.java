package com.skydoves.balloon;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/skydoves/balloon/OnBalloonOutsideTouchListener;", "", "onBalloonOutsideTouch", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "lib_ballon_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface OnBalloonOutsideTouchListener {
    void onBalloonOutsideTouch(@NotNull View view, @NotNull MotionEvent event);
}
