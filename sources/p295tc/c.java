package p295tc;

import androidx.fragment.app.AbstractC1168d0;
import androidx.fragment.app.Fragment;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithRewardsListFragment;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC1168d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ReferEarnWithdrawListFragment f42542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ReferEarnWithRewardsListFragment f42543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f42544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f42545k;

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return 2;
    }

    @Override // androidx.viewpager.widget.a
    public final CharSequence e(int i7) {
        ArrayList arrayList = this.f42545k;
        return arrayList != null ? (CharSequence) arrayList.get(i7) : "";
    }

    @Override // androidx.fragment.app.AbstractC1168d0
    public final Fragment n(int i7) {
        String str = this.f42544j;
        if (i7 == 0) {
            if (this.f42543i == null) {
                this.f42543i = ReferEarnWithRewardsListFragment.t.newInstance(str);
            }
            return this.f42543i;
        }
        if (i7 != 1) {
            if (this.f42543i == null) {
                this.f42543i = ReferEarnWithRewardsListFragment.t.newInstance(str);
            }
            return this.f42543i;
        }
        if (this.f42542h == null) {
            this.f42542h = ReferEarnWithdrawListFragment.f31960w.newInstance(str);
        }
        return this.f42542h;
    }
}
