package p102ge;

import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import p328ve.k;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifeBillsHomeActivity f37181a;

    public C(LifeBillsHomeActivity lifeBillsHomeActivity) {
        this.f37181a = lifeBillsHomeActivity;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        int i10 = LifeBillsHomeActivity.f34485A;
        return ((SectionEntity) ((k) this.f37181a.f34488f.getValue()).getItem(i7)).getIsHeader() ? 2 : 1;
    }
}
