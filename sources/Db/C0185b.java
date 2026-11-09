package Db;

import android.widget.ImageView;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.rsp.QueryUserCouponsRsp;
import com.transsnet.palmpay.credit.ui.viewmodel.AvailableCouponItem;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Db.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0185b extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AvailableCouponItem f1799f;

    public C0185b(AvailableCouponItem availableCouponItem) {
        this.f1799f = availableCouponItem;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f1799f.getMDisposable().add(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f1799f.getIvArrowRight().setVisibility(8);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        List<CouponItem> list;
        QueryUserCouponsRsp queryUserCouponsRsp = (QueryUserCouponsRsp) obj;
        AvailableCouponItem availableCouponItem = this.f1799f;
        if (queryUserCouponsRsp != null) {
            if (!queryUserCouponsRsp.isSuccess() || queryUserCouponsRsp.getData() == null || (list = queryUserCouponsRsp.getData().getList()) == null || !(!list.isEmpty())) {
                queryUserCouponsRsp = null;
            }
            if (queryUserCouponsRsp != null) {
                availableCouponItem.f30671o = queryUserCouponsRsp.getData().getList();
            }
        }
        ImageView ivArrowRight = availableCouponItem.getIvArrowRight();
        List list2 = availableCouponItem.f30671o;
        p220oa.h.s(ivArrowRight, list2 != null && (list2.isEmpty() ^ true));
    }
}
