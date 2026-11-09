package Xd;

import Pa.C0525w;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.gson.Gson;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.fragment.TvPaymentListFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xd.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0786e extends androidx.viewpager2.adapter.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashMap f11145p;
    public ArrayList t;

    static {
        new C0785d(null);
    }

    @Override // androidx.viewpager2.adapter.f
    public final boolean b(long j6) {
        List list = (List) this.f11145p.get(this.f11144o);
        return list != null && list.contains(Long.valueOf(j6));
    }

    @Override // androidx.viewpager2.adapter.f
    public final Fragment c(int i7) {
        TvPaymentListFragment tvPaymentListFragment = new TvPaymentListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("operatorCode", this.f11144o);
        bundle.putString("categoryId", String.valueOf(((TvListByCategoryIdResp.TvCategoryBean) this.t.get(i7)).getBusinessCategoryId()));
        C0525w c0525wF = C0525w.f();
        bundle.putString("listJson", ((Gson) c0525wF.f7166b).toJson(this.t.get(i7)));
        tvPaymentListFragment.setArguments(bundle);
        return tvPaymentListFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.t.size();
    }

    @Override // androidx.viewpager2.adapter.f, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        Object obj = this.t.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return h(i7, (TvListByCategoryIdResp.TvCategoryBean) obj);
    }

    public final long h(int i7, TvListByCategoryIdResp.TvCategoryBean tvCategoryBean) {
        String operatorCode = this.f11144o;
        Integer businessCategoryId = tvCategoryBean.getBusinessCategoryId();
        int iIntValue = businessCategoryId != null ? businessCategoryId.intValue() : 0;
        Intrinsics.checkNotNullParameter(operatorCode, "operatorCode");
        return (((long) (iIntValue ^ operatorCode.hashCode())) & 4294967295L) | (((long) i7) << 32);
    }
}
