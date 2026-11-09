package p328ve;

import androidx.fragment.app.AbstractC1168d0;
import androidx.fragment.app.Fragment;
import com.transsnet.palmpay.ui.fragment.MeBalanceStatementFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractC1168d0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f43185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f43186i;

    @Override // androidx.viewpager.widget.a
    public final int c() {
        ArrayList arrayList = this.f43185h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.viewpager.widget.a
    public final CharSequence e(int i7) {
        String str;
        ArrayList arrayList = this.f43186i;
        return (arrayList == null || (str = (String) arrayList.get(i7)) == null) ? "" : str;
    }

    @Override // androidx.fragment.app.AbstractC1168d0
    public final Fragment n(int i7) {
        Fragment fragment;
        ArrayList arrayList = this.f43185h;
        return (arrayList == null || (fragment = (Fragment) arrayList.get(i7)) == null) ? MeBalanceStatementFragment.f35209Z.newInstance("") : fragment;
    }
}
