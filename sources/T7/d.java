package T7;

import U7.i;
import U7.k;
import com.facebook.react.uimanager.UIManagerHelper;
import com.swmansion.rnscreens.gamma.common.event.ViewAppearanceEventEmitter;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Q7.b implements ViewAppearanceEventEmitter {
    static {
        new c(null);
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.ViewAppearanceEventEmitter
    public final void emitOnDidAppear() {
        this.f7631c.dispatchEvent(new U7.b(UIManagerHelper.getSurfaceId(this.f7629a), "topDidAppear", this.f7630b, "onDidAppear"));
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.ViewAppearanceEventEmitter
    public final void emitOnDidDisappear() {
        this.f7631c.dispatchEvent(new U7.d(UIManagerHelper.getSurfaceId(this.f7629a), "topDidDisappear", this.f7630b, "onDidDisappear"));
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.ViewAppearanceEventEmitter
    public final void emitOnWillAppear() {
        this.f7631c.dispatchEvent(new i(UIManagerHelper.getSurfaceId(this.f7629a), "topWillAppear", this.f7630b, "onWillAppear"));
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.ViewAppearanceEventEmitter
    public final void emitOnWillDisappear() {
        this.f7631c.dispatchEvent(new k(UIManagerHelper.getSurfaceId(this.f7629a), "topWillDisappear", this.f7630b, "onWillDisappear"));
    }
}
