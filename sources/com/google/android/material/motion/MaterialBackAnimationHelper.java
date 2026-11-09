package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.activity.C0812c;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public abstract class MaterialBackAnimationHelper<V extends View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";

    @Nullable
    private C0812c backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;

    @NonNull
    private final TimeInterpolator progressInterpolator = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    @NonNull
    protected final V view;

    public MaterialBackAnimationHelper(@NonNull V v3) {
        this.view = v3;
        Context context = v3.getContext();
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort3, HIDE_DURATION_MIN_DEFAULT);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f10) {
        return this.progressInterpolator.getInterpolation(f10);
    }

    @Nullable
    public C0812c onCancelBackProgress() {
        C0812c c0812c = this.backEvent;
        this.backEvent = null;
        return c0812c;
    }

    @Nullable
    public C0812c onHandleBackInvoked() {
        C0812c c0812c = this.backEvent;
        this.backEvent = null;
        return c0812c;
    }

    public void onStartBackProgress(@NonNull C0812c c0812c) {
        this.backEvent = c0812c;
    }

    @Nullable
    public C0812c onUpdateBackProgress(@NonNull C0812c c0812c) {
        C0812c c0812c2 = this.backEvent;
        this.backEvent = c0812c;
        return c0812c2;
    }
}
