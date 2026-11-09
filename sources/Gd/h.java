package Gd;

import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.send_money.ui.view.TransferHomeEntranceView;
import kotlin.collections.C1850q;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferHomeEntranceView f3350a;

    public h(TransferHomeEntranceView transferHomeEntranceView) {
        this.f3350a = transferHomeEntranceView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        int i10 = 0;
        for (Object obj : this.f3350a.f33875c) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C1850q.k();
                throw null;
            }
            ((ImageView) obj).setSelected(i10 == i7);
            i10 = i11;
        }
    }
}
