package p023b8;

import com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements ChildrenDrawingOrderStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18788a = false;

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public final void disable() {
        this.f18788a = false;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public final void enable() {
        this.f18788a = true;
    }

    @Override // com.swmansion.rnscreens.stack.views.ChildrenDrawingOrderStrategy
    public final boolean isEnabled() {
        return this.f18788a;
    }
}
