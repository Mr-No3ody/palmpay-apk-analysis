package p308u9;

import M1.j;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PickBettingBillerDialog f42719b;

    public /* synthetic */ a(PickBettingBillerDialog pickBettingBillerDialog, int i7) {
        this.f42718a = i7;
        this.f42719b = pickBettingBillerDialog;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public final void onItemClick(j jVar, View view, int i7) {
        switch (this.f42718a) {
            case 0:
                PickBettingBillerDialog.initHistory$lambda$7(this.f42719b, jVar, view, i7);
                break;
            default:
                PickBettingBillerDialog.initBillerList$lambda$5(this.f42719b, jVar, view, i7);
                break;
        }
    }
}
