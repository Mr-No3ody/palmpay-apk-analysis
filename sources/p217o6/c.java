package p217o6;

import androidx.lifecycle.Observer;
import com.palmpay.lib.live.LiveFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveFragment f40062b;

    public /* synthetic */ c(LiveFragment liveFragment, int i7) {
        this.f40061a = i7;
        this.f40062b = liveFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.f40061a) {
            case 0:
                this.f40062b.getActivity().finish();
                break;
            default:
                this.f40062b.getActivity().onBackPressed();
                break;
        }
    }
}
