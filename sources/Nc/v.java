package Nc;

import android.hardware.camera2.TotalCaptureResult;
import android.view.View;
import androidx.camera.camera2.internal.C0929g0;
import androidx.camera.camera2.internal.Z;
import androidx.camera.camera2.internal.j1;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.interfac.OnItemClickListener;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements OnItemClickListener, AsyncFunction, CallbackToFutureAdapter$Resolver, AccessibilityViewCommand {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6361b;

    public /* synthetic */ v(Object obj, int i7) {
        this.f6361b = obj;
        this.f6360a = i7;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        Z z3 = (Z) this.f6361b;
        z3.getClass();
        if (C0929g0.c(this.f6360a, totalCaptureResult)) {
            z3.f13329g = Z.f13322k;
        }
        return z3.f13331i.preCapture(totalCaptureResult);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(androidx.concurrent.futures.k kVar) {
        j1 j1Var = (j1) this.f6361b;
        j1Var.getClass();
        int i7 = this.f6360a;
        j1Var.f13566b.execute(new H0.a(j1Var, kVar, i7, 8));
        return "setExposureCompensationIndex[" + i7 + "]";
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnItemClickListener
    public void onItemClick(Object obj) {
        ProductBean productBean;
        ProductBean productBean2;
        ProductBean productBean3;
        A a3 = (A) this.f6361b;
        int i7 = a3.f6302a;
        int i10 = this.f6360a;
        String str = TransType.TRANS_TYPE_FIXED_SAVING_PAID;
        String orderId = null;
        int i11 = a3.f6303b;
        if (i7 == 0) {
            Postcard postcardBuild = ARouter.getInstance().build("/manage_money/plan_detail_activity");
            List list = a3.f6304c;
            if (list != null && (productBean = (ProductBean) list.get(i10)) != null) {
                orderId = productBean.getOrderId();
            }
            Postcard postcardWithString = postcardBuild.withString("orderNo", orderId);
            if (i11 == 1) {
                str = TransType.TRANS_TYPE_FIXED_SAVING;
            }
            postcardWithString.withString("transType", str).navigation();
            return;
        }
        if (i7 != 1) {
            Unit unit = Unit.f38893a;
            return;
        }
        Postcard postcardBuild2 = ARouter.getInstance().build("/manage_money/detail_activity");
        if (i11 == 1) {
            List list2 = a3.f6304c;
            if (list2 != null && (productBean3 = (ProductBean) list2.get(i10)) != null) {
                orderId = productBean3.getMainOrderId();
            }
        } else {
            List list3 = a3.f6304c;
            if (list3 != null && (productBean2 = (ProductBean) list3.get(i10)) != null) {
                orderId = productBean2.getCashOrderId();
            }
        }
        Postcard postcardWithString2 = postcardBuild2.withString("orderNo", orderId);
        if (i11 == 1) {
            str = TransType.TRANS_TYPE_FIXED_SAVING;
        }
        postcardWithString2.withString("transType", str).navigation();
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, p074f0.h hVar) {
        return ((SideSheetBehavior) this.f6361b).lambda$createAccessibilityViewCommandForState$2(this.f6360a, view, null);
    }
}
