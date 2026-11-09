package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\nR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/swmansion/rnscreens/ScreenContentWrapper;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/swmansion/rnscreens/ScreenContentWrapper$OnLayoutCallback;", "a", "Lcom/swmansion/rnscreens/ScreenContentWrapper$OnLayoutCallback;", "getDelegate$react_native_screens_release", "()Lcom/swmansion/rnscreens/ScreenContentWrapper$OnLayoutCallback;", "setDelegate$react_native_screens_release", "(Lcom/swmansion/rnscreens/ScreenContentWrapper$OnLayoutCallback;)V", "delegate", "OnLayoutCallback", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ScreenContentWrapper extends ReactViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public OnLayoutCallback delegate;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/swmansion/rnscreens/ScreenContentWrapper$OnLayoutCallback;", "", "onContentWrapperLayout", "", "changed", "", ViewProps.LEFT, "", ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnLayoutCallback {
        void onContentWrapperLayout(boolean changed, int left, int top2, int right, int bottom);
    }

    @Nullable
    /* JADX INFO: renamed from: getDelegate$react_native_screens_release, reason: from getter */
    public final OnLayoutCallback getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        OnLayoutCallback onLayoutCallback = this.delegate;
        if (onLayoutCallback != null) {
            onLayoutCallback.onContentWrapperLayout(z3, i7, i10, i11, i12);
        }
    }

    public final void setDelegate$react_native_screens_release(@Nullable OnLayoutCallback onLayoutCallback) {
        this.delegate = onLayoutCallback;
    }
}
