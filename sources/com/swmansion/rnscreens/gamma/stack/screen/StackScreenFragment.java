package com.swmansion.rnscreens.gamma.stack.screen;

import T7.a;
import T7.d;
import U7.f;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.react.uimanager.UIManagerHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenFragment;", "Landroidx/fragment/app/Fragment;", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StackScreenFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StackScreen f25421a;

    public StackScreenFragment(StackScreen stackScreen) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        this.f25421a = stackScreen;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return this.f25421a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        StackScreen stackScreen = this.f25421a;
        if (stackScreen.getActivityMode() == a.f9034b) {
            stackScreen.setNativelyDismissed$react_native_screens_release(true);
        }
        d eventEmitter$react_native_screens_release = stackScreen.getEventEmitter$react_native_screens_release();
        boolean z3 = stackScreen.isNativelyDismissed;
        eventEmitter$react_native_screens_release.getClass();
        eventEmitter$react_native_screens_release.f7631c.dispatchEvent(new f(UIManagerHelper.getSurfaceId(eventEmitter$react_native_screens_release.f7629a), eventEmitter$react_native_screens_release.f7630b, z3));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        StackScreen stackScreen = this.f25421a;
        stackScreen.getClass();
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        new StackScreenAppearanceEventsEmitter(viewLifecycleOwner.getLifecycle(), stackScreen.getEventEmitter$react_native_screens_release());
    }
}
