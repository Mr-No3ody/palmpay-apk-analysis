package M7;

import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.swmansion.rnscreens.bottomsheet.DimmingView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: M7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0448h implements ReactPointerEventsView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5820b;

    public C0448h(int i7) {
        this.f5819a = i7;
        switch (i7) {
            case 2:
                break;
            default:
                this.f5820b = PointerEvents.BOX_NONE;
                break;
        }
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public final PointerEvents getPointerEvents() {
        PointerEvents pointerEvents;
        switch (this.f5819a) {
            case 0:
                return (PointerEvents) this.f5820b;
            case 1:
                return ((DimmingView) this.f5820b).getBlockGestures$react_native_screens_release() ? PointerEvents.AUTO : PointerEvents.NONE;
            default:
                C0448h c0448h = (C0448h) this.f5820b;
                return (c0448h == null || (pointerEvents = c0448h.getPointerEvents()) == null) ? PointerEvents.NONE : pointerEvents;
        }
    }

    public C0448h(DimmingView dimmingView) {
        this.f5819a = 1;
        Intrinsics.checkNotNullParameter(dimmingView, "dimmingView");
        this.f5820b = dimmingView;
    }
}
