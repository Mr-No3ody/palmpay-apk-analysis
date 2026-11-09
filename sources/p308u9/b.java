package p308u9;

import android.view.View;
import com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PickBettingBillerDialog f42721b;

    public /* synthetic */ b(PickBettingBillerDialog pickBettingBillerDialog, int i7) {
        this.f42720a = i7;
        this.f42721b = pickBettingBillerDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f42720a) {
            case 0:
                PickBettingBillerDialog.initSearch$lambda$3(this.f42721b, view);
                break;
            default:
                this.f42721b.dismiss();
                break;
        }
    }
}
