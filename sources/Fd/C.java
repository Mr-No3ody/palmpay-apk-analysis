package Fd;

import Pa.n0;
import androidx.viewpager2.widget.ViewPager2;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayHomeFragment f2652a;

    public C(TransferToPalmPayHomeFragment transferToPalmPayHomeFragment) {
        this.f2652a = transferToPalmPayHomeFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        Balloon balloon;
        super.onPageSelected(i7);
        TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = this.f2652a;
        if (i7 == 2 && transferToPalmPayHomeFragment.f33814A != null && (balloon = transferToPalmPayHomeFragment.f33815B) != null && balloon.f25227f) {
            balloon.f();
        }
        String str = (String) CollectionsKt.G(i7, (ArrayList) transferToPalmPayHomeFragment.f33820p.getValue());
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = new ClickEvent("Transfer_ToPalmPay_Tab_Click");
        if (str == null) {
            str = "";
        }
        n0VarG.k(clickEvent.add("element_name", str));
    }
}
