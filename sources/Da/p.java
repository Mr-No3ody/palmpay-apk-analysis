package Da;

import com.facebook.react.bridge.Promise;
import com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements PickStateDialogFragment.OnAreaSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f1768a;

    public p(Promise promise) {
        this.f1768a = promise;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.PickStateDialogFragment.OnAreaSelectedListener
    public final void onAreaSelected(Object obj) {
        String str = (String) obj;
        if (str != null) {
            this.f1768a.resolve(str);
        }
    }
}
