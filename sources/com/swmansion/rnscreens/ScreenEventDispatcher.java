package com.swmansion.rnscreens;

import M7.v;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/swmansion/rnscreens/ScreenEventDispatcher;", "", "LM7/v;", "event", "", "canDispatchLifecycleEvent", "(LM7/v;)Z", "", "updateLastEventDispatched", "(LM7/v;)V", "Lcom/swmansion/rnscreens/ScreenFragmentWrapper;", "fragmentWrapper", "dispatchLifecycleEvent", "(LM7/v;Lcom/swmansion/rnscreens/ScreenFragmentWrapper;)V", "dispatchLifecycleEventInChildContainers", "dispatchHeaderBackButtonClickedEvent", "()V", "", "alpha", "closing", "dispatchTransitionProgressEvent", "(FZ)V", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ScreenEventDispatcher {
    boolean canDispatchLifecycleEvent(@NotNull v event);

    void dispatchHeaderBackButtonClickedEvent();

    void dispatchLifecycleEvent(@NotNull v event, @NotNull ScreenFragmentWrapper fragmentWrapper);

    void dispatchLifecycleEventInChildContainers(@NotNull v event);

    void dispatchTransitionProgressEvent(float alpha, boolean closing);

    void updateLastEventDispatched(@NotNull v event);
}
