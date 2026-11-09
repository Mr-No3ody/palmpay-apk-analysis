package com.swmansion.rnscreens.gamma.tabs;

import V7.c;
import W7.d;
import W7.f;
import W7.h;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.uimanager.UIManagerHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabScreenFragment;", "Landroidx/fragment/app/Fragment;", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabScreenFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabScreen f25437a;

    public TabScreenFragment(TabScreen tabScreen) {
        Intrinsics.checkNotNullParameter(tabScreen, "tabScreen");
        this.f25437a = tabScreen;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration config) {
        Intrinsics.checkNotNullParameter(config, "newConfig");
        super.onConfigurationChanged(config);
        TabScreen tabScreen = this.f25437a;
        tabScreen.getClass();
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        TabScreenDelegate tabScreenDelegate = (TabScreenDelegate) tabScreen.f25425b.get();
        if (tabScreenDelegate != null) {
            tabScreenDelegate.onFragmentConfigurationChange(tabScreen, config);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return this.f25437a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        c eventEmitter$react_native_screens_release = this.f25437a.getEventEmitter$react_native_screens_release();
        int i7 = eventEmitter$react_native_screens_release.f7630b;
        b.a(i7, "onWillDisappear");
        eventEmitter$react_native_screens_release.f7631c.dispatchEvent(new h(UIManagerHelper.getSurfaceId(eventEmitter$react_native_screens_release.f7629a), i7));
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        c eventEmitter$react_native_screens_release = this.f25437a.getEventEmitter$react_native_screens_release();
        int i7 = eventEmitter$react_native_screens_release.f7630b;
        b.a(i7, "onDidAppear");
        eventEmitter$react_native_screens_release.f7631c.dispatchEvent(new W7.b(UIManagerHelper.getSurfaceId(eventEmitter$react_native_screens_release.f7629a), i7));
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        c eventEmitter$react_native_screens_release = this.f25437a.getEventEmitter$react_native_screens_release();
        int i7 = eventEmitter$react_native_screens_release.f7630b;
        b.a(i7, "onWillAppear");
        eventEmitter$react_native_screens_release.f7631c.dispatchEvent(new f(UIManagerHelper.getSurfaceId(eventEmitter$react_native_screens_release.f7629a), i7));
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        c eventEmitter$react_native_screens_release = this.f25437a.getEventEmitter$react_native_screens_release();
        int i7 = eventEmitter$react_native_screens_release.f7630b;
        b.a(i7, "onDidDisappear");
        eventEmitter$react_native_screens_release.f7631c.dispatchEvent(new d(UIManagerHelper.getSurfaceId(eventEmitter$react_native_screens_release.f7629a), i7));
        super.onStop();
    }
}
