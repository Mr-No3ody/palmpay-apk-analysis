package Da;

import Pa.C0525w;
import com.facebook.react.bridge.Promise;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.State;
import com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements PickStateDialogFragment.OnAreaSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f1769a;

    public q(Promise promise) {
        this.f1769a = promise;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment.OnAreaSelectedListener
    public final void onAreaSelected(Object obj) {
        State state = (State) obj;
        if (state == null || state.stateName == null) {
            return;
        }
        this.f1769a.resolve(((Gson) C0525w.f().f7166b).toJson(state));
    }
}
