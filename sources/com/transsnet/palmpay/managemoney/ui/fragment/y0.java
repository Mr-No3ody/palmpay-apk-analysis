package com.transsnet.palmpay.managemoney.ui.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends Yb.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(List list, List list2, int i7) {
        super(list, list2);
        this.f32684c = i7;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i10) {
        switch (this.f32684c) {
            case 0:
                return ((ProductBean) this.f11323a.get(i7)).getPlanStatus() == ((ProductBean) this.f11324b.get(i10)).getProductStatus();
            default:
                return true;
        }
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i10) {
        switch (this.f32684c) {
            case 0:
                break;
        }
        return TextUtils.equals(((ProductBean) this.f11323a.get(i7)).getOrderId(), ((ProductBean) this.f11324b.get(i10)).getOrderId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public Object getChangePayload(int i7, int i10) {
        switch (this.f32684c) {
            case 0:
                Bundle bundle = new Bundle();
                int planStatus = ((ProductBean) this.f11323a.get(i7)).getPlanStatus();
                List list = this.f11324b;
                if (planStatus != ((ProductBean) list.get(i10)).getProductStatus()) {
                    bundle.putInt("plan_status", ((ProductBean) list.get(i10)).getPlanStatus());
                }
                return bundle;
            default:
                return super.getChangePayload(i7, i10);
        }
    }
}
