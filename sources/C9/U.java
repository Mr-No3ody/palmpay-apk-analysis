package C9;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawHomeActivity;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawHomeFragment;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f1280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String[] f1281j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(androidx.fragment.app.Z z3, SparseArray mFragments) {
        super(z3);
        Intrinsics.checkNotNullParameter(mFragments, "mFragments");
        Intrinsics.e(z3);
        this.f1280i = mFragments;
        this.f1281j = new String[]{"Cash From Agent", "To Bank Account"};
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f1281j.length;
    }

    @Override // androidx.viewpager.widget.a
    public final CharSequence e(int i7) {
        return this.f1281j[i7];
    }

    @Override // androidx.fragment.app.g0
    public final Fragment n(int i7) {
        SparseArray sparseArray = this.f1280i;
        if (sparseArray.get(i7) != null) {
            Object obj = sparseArray.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return (Fragment) obj;
        }
        int i10 = WithdrawHomeActivity.f26933v;
        if (i7 == 0) {
            return new WithdrawHomeFragment();
        }
        return i7 == WithdrawHomeActivity.f26933v ? new WithdrawV2Fragment() : new WithdrawHomeFragment();
    }
}
