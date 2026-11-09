package p102ge;

import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.transsnet.palmpay.ui.activity.BillPaymentEditActivity;

/* JADX INFO: renamed from: ge.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1738k extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillPaymentEditActivity f37221a;

    public C1738k(BillPaymentEditActivity billPaymentEditActivity) {
        this.f37221a = billPaymentEditActivity;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        int i10 = BillPaymentEditActivity.f34439j;
        return ((SectionEntity) this.f37221a.m().getItem(i7)).getIsHeader() ? 2 : 1;
    }
}
