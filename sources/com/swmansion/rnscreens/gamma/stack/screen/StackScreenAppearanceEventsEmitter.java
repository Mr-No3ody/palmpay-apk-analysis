package com.swmansion.rnscreens.gamma.stack.screen;

import T7.b;
import T7.d;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenAppearanceEventsEmitter;", "Landroidx/lifecycle/LifecycleEventObserver;", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StackScreenAppearanceEventsEmitter implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f25420a;

    public StackScreenAppearanceEventsEmitter(AbstractC1205o screenLifecycle, d appearanceEventEmitter) {
        Intrinsics.checkNotNullParameter(screenLifecycle, "screenLifecycle");
        Intrinsics.checkNotNullParameter(appearanceEventEmitter, "appearanceEventEmitter");
        this.f25420a = appearanceEventEmitter;
        screenLifecycle.a(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i7 = b.f9036a[event.ordinal()];
        d dVar = this.f25420a;
        switch (i7) {
            case 1:
                dVar.emitOnWillAppear();
                return;
            case 2:
                dVar.emitOnDidAppear();
                return;
            case 3:
                dVar.emitOnWillDisappear();
                return;
            case 4:
                dVar.emitOnDidDisappear();
                return;
            case 5:
                source.getLifecycle().b(this);
                return;
            case 6:
            case 7:
                return;
            default:
                throw new l();
        }
    }
}
