package p308u9;

import com.transsnet.palmpay.betting.ui.dialog.PickBettingBillerDialog;
import com.transsnet.palmpay.teller.ui.view.SideBarView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements SideBarView.OnLetterChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PickBettingBillerDialog f42723a;

    public d(PickBettingBillerDialog pickBettingBillerDialog) {
        this.f42723a = pickBettingBillerDialog;
    }

    @Override // com.transsnet.palmpay.teller.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterChanged(String letter, int i7) {
        Intrinsics.checkNotNullParameter(letter, "letter");
        this.f42723a.scrollToSection(letter);
    }

    @Override // com.transsnet.palmpay.teller.ui.view.SideBarView.OnLetterChangeListener
    public final void onLetterGone() {
        this.f42723a.updateSideBarSelection();
    }
}
