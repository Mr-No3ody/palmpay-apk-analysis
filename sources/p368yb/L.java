package p368yb;

import androidx.fragment.app.AbstractC1168d0;
import androidx.fragment.app.Fragment;
import com.transsnet.palmpay.credit.ui.fragment.OcReferEarnWithRewardsListFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcReferEarnWithdrawListFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends AbstractC1168d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OcReferEarnWithdrawListFragment f44186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OcReferEarnWithRewardsListFragment f44187i;

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return 2;
    }

    @Override // androidx.fragment.app.AbstractC1168d0
    public final Fragment n(int i7) {
        if (i7 == 0) {
            if (this.f44187i == null) {
                this.f44187i = OcReferEarnWithRewardsListFragment.f30486o.newInstance();
            }
            return this.f44187i;
        }
        if (i7 != 1) {
            if (this.f44187i == null) {
                this.f44187i = OcReferEarnWithRewardsListFragment.f30486o.newInstance();
            }
            return this.f44187i;
        }
        if (this.f44186h == null) {
            this.f44186h = OcReferEarnWithdrawListFragment.f30489o.newInstance();
        }
        return this.f44186h;
    }
}
