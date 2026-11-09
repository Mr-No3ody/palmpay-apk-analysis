package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.V;
import androidx.core.view.W;
import androidx.core.view.d0;
import androidx.core.view.q0;
import com.google.android.material.animation.AnimationUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class InsetsAnimationCallback extends W {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation = new int[2];
    private final View view;

    public InsetsAnimationCallback(View view) {
        this.view = view;
    }

    @Override // androidx.core.view.W
    public void onEnd(@NonNull d0 d0Var) {
        this.view.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.W
    public void onPrepare(@NonNull d0 d0Var) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // androidx.core.view.W
    @NonNull
    public q0 onProgress(@NonNull q0 q0Var, @NonNull List<d0> list) {
        for (d0 d0Var : list) {
            if ((d0Var.f16210a.c() & 8) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, d0Var.f16210a.b()));
                break;
            }
        }
        return q0Var;
    }

    @Override // androidx.core.view.W
    @NonNull
    public V onStart(@NonNull d0 d0Var, @NonNull V v3) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i7 = this.startY - this.tmpLocation[1];
        this.startTranslationY = i7;
        this.view.setTranslationY(i7);
        return v3;
    }
}
