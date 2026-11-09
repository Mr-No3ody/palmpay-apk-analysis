package Xd;

import Pa.C0525w;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.transsnet.palmpay.databundle.ui.fragment.DataBundleWalletFragment;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends androidx.viewpager2.adapter.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f11162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f11163p;
    public long t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f11164v;

    static {
        new n(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.viewpager2.adapter.f
    public final boolean b(long j6) {
        return this.f11163p.contains(Long.valueOf(j6));
    }

    @Override // androidx.viewpager2.adapter.f
    public final Fragment c(int i7) {
        DataBundleWalletFragment dataBundleWalletFragment = new DataBundleWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putString("operatorCode", this.f11162o);
        bundle.putString("categoryId", String.valueOf(((DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean) this.f11164v.get(i7)).getBundleCategoryId()));
        C0525w c0525wF = C0525w.f();
        bundle.putString("listJson", ((Gson) c0525wF.f7166b).toJson(this.f11164v.get(i7)));
        bundle.putInt(FirebaseAnalytics.Param.INDEX, i7);
        String bundleCategoryName = ((DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean) this.f11164v.get(i7)).getBundleCategoryName();
        if (bundleCategoryName == null) {
            bundleCategoryName = "";
        }
        bundle.putString("tabDetail", bundleCategoryName);
        dataBundleWalletFragment.setArguments(bundle);
        return dataBundleWalletFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f11164v.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.viewpager2.adapter.f, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i7) {
        return ((Number) this.f11163p.get(i7)).longValue();
    }
}
