package N8;

import android.content.Context;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.credit.bean.req.OcOrderReq;
import com.transsnet.palmpay.credit.bean.resp.OcOrderData;
import com.transsnet.palmpay.credit.bean.resp.OcOrderRsp;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.ui.fragment.OcBillFragment;
import com.transsnet.palmpay.teller.bean.AddFavoriteReq;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6206g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6208j;

    public /* synthetic */ d0(Object obj, int i7, Object obj2, Object obj3) {
        this.f6205f = i7;
        this.f6206g = obj;
        this.f6207i = obj2;
        this.f6208j = obj3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f6205f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((SetUserPhotoActivity) this.f6206g).addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "disposable");
                ((Yd.r) this.f6206g).f11362j.add(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "disposable");
                ((Yd.r) this.f6206g).f11362j.add(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((p235pb.p) this.f6208j).addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcBillFragment) this.f6206g).f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f6205f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                SetUserPhotoActivity.gotoFail$default((SetUserPhotoActivity) this.f6206g, null, 1, null);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                ((Yd.r) this.f6206g).d(false);
                ((Yd.s) this.f6207i).c(((AddFavoriteReq) this.f6208j).paymentItemId, false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                ((Yd.r) this.f6206g).d(false);
                ((Yd.s) this.f6208j).c((String) this.f6207i, false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                ((OcBillFragment) this.f6206g).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f6205f) {
            case 0:
                CommonResult commonResult = (CommonResult) obj;
                SetUserPhotoActivity setUserPhotoActivity = (SetUserPhotoActivity) this.f6206g;
                if (commonResult != null && commonResult.isSuccess()) {
                    boolean zEquals = "1".equals(setUserPhotoActivity.mPhotoType);
                    String str = (String) this.f6207i;
                    if (zEquals) {
                        setUserPhotoActivity.saveAvatar(str);
                    }
                    setUserPhotoActivity.setResult(str, (File) this.f6208j);
                    setUserPhotoActivity.finish();
                } else {
                    SetUserPhotoActivity.gotoFail$default(setUserPhotoActivity, null, 1, null);
                }
                break;
            case 1:
                CommonResult response = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                ((Yd.r) this.f6206g).d(false);
                ((Yd.s) this.f6207i).c(((AddFavoriteReq) this.f6208j).paymentItemId, response.isSuccess());
                if (!response.isSuccess()) {
                    ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                }
                break;
            case 2:
                CommonResult response2 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                ((Yd.r) this.f6206g).d(false);
                ((Yd.s) this.f6208j).c((String) this.f6207i, response2.isSuccess());
                if (!response2.isSuccess()) {
                    ToastUtils.showLong(response2.getRespMsg(), new Object[0]);
                }
                break;
            case 3:
                CommonStringResult response3 = (CommonStringResult) obj;
                Intrinsics.checkNotNullParameter(response3, "response");
                if (!response3.isSuccess()) {
                    ToastUtils.showShort(response3.getRespMsg(), new Object[0]);
                } else {
                    PhoneUtils.sendSms((Context) this.f6206g, response3.data, (ArrayList) this.f6207i);
                }
                break;
            default:
                OcOrderRsp ocOrderRsp = (OcOrderRsp) obj;
                if (ocOrderRsp != null) {
                    ((OcBillFragment) this.f6206g).showLoadingDialog(false);
                    if (!ocOrderRsp.isSuccess()) {
                        ToastUtils.showLong(ocOrderRsp.getRespMsg(), new Object[0]);
                    } else {
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_preview_activity");
                        Long amount = ((OcOrderReq) this.f6207i).getAmount();
                        Postcard postcardWithLong = postcardBuild.withLong("ok_card_repay_amount", amount != null ? amount.longValue() : 0L);
                        OcCurBillData ocCurBillData = (OcCurBillData) this.f6208j;
                        Postcard postcardWithString = postcardWithLong.withString("ok_card_repay_card_no", ocCurBillData.getCardNo());
                        Long id2 = ocCurBillData.getId();
                        Postcard postcardWithLong2 = postcardWithString.withLong("ok_card_repay_bill_id", id2 != null ? id2.longValue() : 0L);
                        OcOrderData data = ocOrderRsp.getData();
                        postcardWithLong2.withString("ok_card_repay_order_no", data != null ? data.getOrderId() : null).navigation();
                    }
                }
                break;
        }
    }

    public d0(Yd.r rVar, Yd.s sVar, String str) {
        this.f6205f = 2;
        this.f6206g = rVar;
        this.f6208j = sVar;
        this.f6207i = str;
    }
}
