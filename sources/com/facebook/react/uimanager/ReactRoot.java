package com.facebook.react.uimanager;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(p245q3.a.f41451a)
public interface ReactRoot {
    public static final int STATE_STARTED = 1;
    public static final int STATE_STOPPED = 0;

    @Nullable
    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getJSModuleName();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    AtomicInteger getState();

    @Nullable
    @Deprecated
    String getSurfaceID();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void onStage(int i7);

    void runApplication();

    void setRootViewTag(int i7);

    void setShouldLogContentAppeared(boolean z3);
}
