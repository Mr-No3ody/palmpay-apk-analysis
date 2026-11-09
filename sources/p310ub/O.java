package p310ub;

import Oe.a;
import Wf.AbstractC0780y;
import Wf.C0759d0;
import Wf.I;
import Ya.g;
import android.text.TextUtils;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.luck.picture.lib.basic.PictureSelectionModel;
import com.luck.picture.lib.basic.PictureSelector;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.engine.GlideEngine;
import com.luck.picture.lib.style.PictureSelectorStyle;
import com.transsnet.palmpay.betting.ui.adapter.BettingCouponAdapter$OnCouponClickListener;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.rsp.ALiFaceCheckResultData;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import com.transsnet.palmpay.credit.ui.adapter.okcard.OcFeedbackSelectedImgAdapter$FeedBackAddImgCallBack;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFaceRecFragment;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.ui.dialog.CouponClaimResultDialog;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p041ce.C1281c;
import p042cg.e;
import p042cg.f;
import p184m8.b;
import p368yb.C2157z;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements OcFeedbackSelectedImgAdapter$FeedBackAddImgCallBack, BettingCouponAdapter$OnCouponClickListener, ScanFaceLogicUtil$IScanFaceResultCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f42778a;

    public /* synthetic */ O(LifecycleOwner lifecycleOwner) {
        this.f42778a = lifecycleOwner;
    }

    @Override // com.transsnet.palmpay.credit.ui.adapter.okcard.OcFeedbackSelectedImgAdapter$FeedBackAddImgCallBack
    public void addImg() {
        OcFeedbackActivity ocFeedbackActivity = (OcFeedbackActivity) this.f42778a;
        C2157z c2157z = ocFeedbackActivity.f29438w;
        if (c2157z == null) {
            Intrinsics.n("mSelectedImgAdapter");
            throw null;
        }
        if (c2157z.getItemCount() > 9) {
            ToastUtils.showShort(ocFeedbackActivity.getString(g.cs_oc_feedback_max_pic), new Object[0]);
            return;
        }
        KeyboardUtils.hideSoftInput(ocFeedbackActivity.o());
        PictureSelectionModel selectMaxFileSize = PictureSelector.create((AbstractActivityC0837o) ocFeedbackActivity).openGallery(SelectMimeType.ofImage()).setSelectorUIStyle((PictureSelectorStyle) ocFeedbackActivity.f29436p.getValue()).setImageEngine(GlideEngine.createGlideEngine()).setCompressEngine(new p045d3.g(2)).setEditMediaInterceptListener(null).isPageSyncAlbumCount(true).setQueryFilterListener(new b(15)).setSelectionMode(2).setLanguage(2).setDefaultLanguage(2).isDisplayTimeAxis(false).setPreviewInterceptListener(new b(16)).isOnlyObtainSandboxDir(false).isPageStrategy(true).isOriginalControl(false).isDisplayCamera(true).isOpenClickSound(false).isFastSlidingSelect(false).isPreviewFullScreenMode(false).isPreviewImage(false).isMaxSelectEnabledMask(true).setMaxSelectNum(9).setRecyclerAnimationMode(-1).isGif(false).setSelectMaxFileSize(15360L);
        C2157z c2157z2 = ocFeedbackActivity.f29438w;
        if (c2157z2 == null) {
            Intrinsics.n("mSelectedImgAdapter");
            throw null;
        }
        PictureSelectionModel selectedData = selectMaxFileSize.setSelectedData(c2157z2.f44274b);
        Intrinsics.checkNotNullExpressionValue(selectedData, "setSelectedData(...)");
        selectedData.forResult(ocFeedbackActivity.t);
    }

    @Override // com.transsnet.palmpay.betting.ui.adapter.BettingCouponAdapter$OnCouponClickListener
    public void onCouponClick(BillerCouponItemBean item, int i7) {
        Intrinsics.checkNotNullParameter(item, "coupon");
        boolean zIsEmpty = TextUtils.isEmpty(item.getStatus());
        final ModelBettingRootView lifecycleOwner = (ModelBettingRootView) this.f42778a;
        if (!zIsEmpty) {
            a aVar = lifecycleOwner.t;
            if (aVar != null) {
                List<String> institutionIdList = item.getInstitutionIdList();
                Long limitAmt = item.getLimitAmt();
                aVar.onCouponUseClick(institutionIdList, limitAmt != null ? limitAmt.longValue() : 0L);
                return;
            }
            return;
        }
        lifecycleOwner.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        C0759d0 c0759d0 = lifecycleOwner.f26751v;
        if (c0759d0 != null) {
            c0759d0.invoke(Boolean.TRUE);
        }
        Long claimId = item.getClaimId();
        final int i10 = 0;
        Function1 onSuccess = new Function1() { // from class: w9.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ModelBettingRootView modelBettingRootView = lifecycleOwner;
                switch (i10) {
                    case 0:
                        BillerCouponItemBean billerCouponItemBean = (BillerCouponItemBean) obj;
                        C0759d0 c0759d1 = modelBettingRootView.f26751v;
                        if (c0759d1 != null) {
                            c0759d1.invoke(Boolean.FALSE);
                        }
                        modelBettingRootView.d();
                        if (billerCouponItemBean != null) {
                            CouponClaimResultDialog couponClaimResultDialog = new CouponClaimResultDialog(modelBettingRootView.getContext(), 0, 0, 6, null);
                            couponClaimResultDialog.setCouponItem(C1849p.c(billerCouponItemBean)).setResultCallback((ResultCallback<List<BillerCouponItemBean>>) new com.transsnet.adsdk.b(16, modelBettingRootView, couponClaimResultDialog)).show();
                        }
                        a aVar2 = modelBettingRootView.t;
                        if (aVar2 != null) {
                            aVar2.onCouponClaimComplete();
                        }
                        break;
                    default:
                        String it = (String) obj;
                        int i11 = ModelBettingRootView.f26741w;
                        Intrinsics.checkNotNullParameter(it, "it");
                        C0759d0 c0759d2 = modelBettingRootView.f26751v;
                        if (c0759d2 != null) {
                            c0759d2.invoke(Boolean.FALSE);
                        }
                        ToastUtils.showLong(it, new Object[0]);
                        break;
                }
                return Unit.f38893a;
            }
        };
        final int i11 = 1;
        Function1 onError = new Function1() { // from class: w9.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ModelBettingRootView modelBettingRootView = lifecycleOwner;
                switch (i11) {
                    case 0:
                        BillerCouponItemBean billerCouponItemBean = (BillerCouponItemBean) obj;
                        C0759d0 c0759d1 = modelBettingRootView.f26751v;
                        if (c0759d1 != null) {
                            c0759d1.invoke(Boolean.FALSE);
                        }
                        modelBettingRootView.d();
                        if (billerCouponItemBean != null) {
                            CouponClaimResultDialog couponClaimResultDialog = new CouponClaimResultDialog(modelBettingRootView.getContext(), 0, 0, 6, null);
                            couponClaimResultDialog.setCouponItem(C1849p.c(billerCouponItemBean)).setResultCallback((ResultCallback<List<BillerCouponItemBean>>) new com.transsnet.adsdk.b(16, modelBettingRootView, couponClaimResultDialog)).show();
                        }
                        a aVar2 = modelBettingRootView.t;
                        if (aVar2 != null) {
                            aVar2.onCouponClaimComplete();
                        }
                        break;
                    default:
                        String it = (String) obj;
                        int i12 = ModelBettingRootView.f26741w;
                        Intrinsics.checkNotNullParameter(it, "it");
                        C0759d0 c0759d2 = modelBettingRootView.f26751v;
                        if (c0759d2 != null) {
                            c0759d2.invoke(Boolean.FALSE);
                        }
                        ToastUtils.showLong(it, new Object[0]);
                        break;
                }
                return Unit.f38893a;
            }
        };
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        String memberId = BaseApplication.get().getUser().getMemberId();
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(lifecycleOwner);
        f fVar = I.f10809a;
        lifecycleOwner.addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new C1281c(null, claimId, memberId, onSuccess, onError), 2));
        a aVar2 = lifecycleOwner.t;
        if (aVar2 != null) {
            aVar2.onCouponClaimComplete();
        }
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public void onFailed(String str, String str2, String str3) {
        LoanCreditFaceRecFragment loanCreditFaceRecFragment = (LoanCreditFaceRecFragment) this.f42778a;
        loanCreditFaceRecFragment.showLoadingDialog(false);
        Sd.b bVar = loanCreditFaceRecFragment.f30333j;
        if (bVar != null) {
            bVar.onFaceRecFailed(str, str2);
        }
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public void onProcessing() {
        ((LoanCreditFaceRecFragment) this.f42778a).showLoadingDialog(true);
    }

    @Override // com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack
    public void onSuccess(ALiFaceCheckResultData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        LoanCreditFaceRecFragment loanCreditFaceRecFragment = (LoanCreditFaceRecFragment) this.f42778a;
        loanCreditFaceRecFragment.showLoadingDialog(false);
        Sd.b bVar = loanCreditFaceRecFragment.f30333j;
        if (bVar != null) {
            bVar.onFaceRecSuccess(data);
        }
    }
}
