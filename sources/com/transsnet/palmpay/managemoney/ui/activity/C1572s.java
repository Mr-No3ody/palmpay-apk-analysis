package com.transsnet.palmpay.managemoney.ui.activity;

import Pa.r0;
import android.text.TextUtils;
import androidx.fragment.app.Z;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.CreateOrderResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestSwitchResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetTrialIncomeTaxResp;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1572s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePlanActivity f32261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreatePlanActivity f32262c;

    public /* synthetic */ C1572s(CreatePlanActivity createPlanActivity, CreatePlanActivity createPlanActivity2, int i7) {
        this.f32260a = i7;
        this.f32261b = createPlanActivity;
        this.f32262c = createPlanActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d A[PHI: r0
      0x005d: PHI (r0v48 Lc.a) = (r0v44 Lc.a), (r0v52 Lc.a), (r0v54 Lc.a) binds: [B:45:0x00c8, B:33:0x009b, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[PHI: r0
      0x0064: PHI (r0v45 Lc.a) = (r0v44 Lc.a), (r0v52 Lc.a), (r0v54 Lc.a) binds: [B:45:0x00c8, B:33:0x009b, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        GetInterestSwitchResp getInterestSwitchResp;
        Lc.a aVar;
        long j6;
        switch (this.f32260a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                CreatePlanActivity createPlanActivity = this.f32261b;
                if (z3) {
                    createPlanActivity.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    createPlanActivity.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (commonResult.isSuccess()) {
                        int iD = p059e1.a.D(0, "invest_interest_disable");
                        CreatePlanActivity createPlanActivity2 = this.f32262c;
                        if (createPlanActivity2.f32071H == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        if (iD == 0) {
                            androidx.camera.core.impl.utils.n.v(p025ba.k.core_successful);
                        }
                        CreatePlanActivity.m(createPlanActivity2, iD == 0 ? 1 : 0);
                        C0.G.u(MessageEvent.EVENT_INVEST_INTEREST, org.greenrobot.eventbus.c.b());
                        CreatePlanActivity.n(createPlanActivity2, iD != 0 ? 0 : 1);
                        CreatePlanActivity.o(createPlanActivity2);
                    } else {
                        String respMsg = commonResult.getRespMsg();
                        if (respMsg != null) {
                            ToastUtils.showShort(respMsg, new Object[0]);
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    createPlanActivity.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    createPlanActivity.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                CreatePlanActivity createPlanActivity3 = this.f32261b;
                if (z8) {
                    createPlanActivity3.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    createPlanActivity3.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonBeanResult.isSuccess() && (getInterestSwitchResp = (GetInterestSwitchResp) commonBeanResult.data) != null) {
                        int switchStatus = getInterestSwitchResp.getSwitchStatus();
                        CreatePlanActivity createPlanActivity4 = this.f32262c;
                        CreatePlanActivity.m(createPlanActivity4, switchStatus);
                        CreatePlanActivity.n(createPlanActivity4, getInterestSwitchResp.getSwitchStatus());
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    createPlanActivity3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    createPlanActivity3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                boolean z10 = it3 instanceof com.transsnet.palmpay.core.base.o;
                CreatePlanActivity createPlanActivity5 = this.f32261b;
                if (z10) {
                    createPlanActivity5.showLoadingDialog(true, true);
                } else {
                    boolean z11 = it3 instanceof com.transsnet.palmpay.core.base.p;
                    CreatePlanActivity createPlanActivity6 = this.f32262c;
                    if (z11) {
                        createPlanActivity5.showLoadingDialog(false, true);
                        CreateOrderResp createOrderResp = (CreateOrderResp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        if (createOrderResp.isSuccess()) {
                            ProductBean data = createOrderResp.getData();
                            if (data != null) {
                                data.setRenewDepositSwitch(createPlanActivity6.f32083w);
                            }
                            d0.g(3, "/manage_money/detail_activity", "detail_type").withParcelable("product_bean", createOrderResp.getData()).withParcelable("state_info", createPlanActivity6.f32073c).navigation();
                        } else {
                            String respMsg2 = createOrderResp.getRespMsg();
                            if (respMsg2 != null) {
                                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, createPlanActivity6.getResources().getString(p025ba.k.core_oops), respMsg2, createPlanActivity6.getResources().getString(p025ba.k.core_ok1), null, 8, null);
                                Z supportFragmentManager = createPlanActivity6.getSupportFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showErrorDialog");
                            }
                        }
                    } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                        createPlanActivity5.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        createPlanActivity5.showLoadingDialog(false, true);
                        String str = ((com.transsnet.palmpay.core.base.n) it3).f27358a;
                        if (!TextUtils.isEmpty(str)) {
                            p220oa.h.x(createPlanActivity6, str);
                        }
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                boolean z12 = it4 instanceof com.transsnet.palmpay.core.base.o;
                CreatePlanActivity createPlanActivity7 = this.f32261b;
                if (z12) {
                    createPlanActivity7.showLoadingDialog(true);
                } else if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                    createPlanActivity7.showLoadingDialog(false);
                    com.transsnet.palmpay.core.base.p pVar = (com.transsnet.palmpay.core.base.p) it4;
                    Object obj2 = pVar.f27360a;
                    boolean z13 = obj2 instanceof CommonResult;
                    CreatePlanActivity createPlanActivity8 = this.f32262c;
                    if (z13) {
                        boolean zIsSuccess = ((CommonResult) obj2).isSuccess();
                        Object obj3 = pVar.f27360a;
                        if (zIsSuccess) {
                            GetTrialIncomeTaxResp.ComeTax data2 = ((GetTrialIncomeTaxResp) obj3).getData();
                            if (data2 != null) {
                                createPlanActivity8.f32078i = data2.getTotalAmount();
                                createPlanActivity8.v();
                                Lc.a aVar2 = createPlanActivity8.f32071H;
                                if (aVar2 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                aVar2.f5622A.setVisibility(0);
                                int iD2 = p059e1.a.D(0, "invest_interest_disable");
                                aVar = createPlanActivity8.f32071H;
                                if (aVar == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                if (iD2 == 1) {
                                    j6 = aVar.f5637f.getLong();
                                } else {
                                    j6 = createPlanActivity8.f32078i;
                                }
                                aVar.f5648t0.setText(r0.B(j6, true));
                            }
                        } else {
                            GetTrialIncomeTaxResp.ComeTax data3 = ((GetTrialIncomeTaxResp) obj3).getData();
                            if (data3 != null) {
                                createPlanActivity8.f32078i = data3.getTotalAmount();
                                createPlanActivity8.v();
                                Lc.a aVar3 = createPlanActivity8.f32071H;
                                if (aVar3 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                aVar3.f5622A.setVisibility(0);
                                int iD3 = p059e1.a.D(0, "invest_interest_disable");
                                aVar = createPlanActivity8.f32071H;
                                if (aVar == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                if (iD3 == 1) {
                                    j6 = aVar.f5637f.getLong();
                                } else {
                                    j6 = createPlanActivity8.f32078i;
                                }
                                aVar.f5648t0.setText(r0.B(j6, true));
                            }
                        }
                    } else {
                        GetTrialIncomeTaxResp.ComeTax data4 = ((GetTrialIncomeTaxResp) obj2).getData();
                        if (data4 != null) {
                            createPlanActivity8.f32078i = data4.getTotalAmount();
                            createPlanActivity8.v();
                            Lc.a aVar4 = createPlanActivity8.f32071H;
                            if (aVar4 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            aVar4.f5622A.setVisibility(0);
                            int iD4 = p059e1.a.D(0, "invest_interest_disable");
                            aVar = createPlanActivity8.f32071H;
                            if (aVar == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            if (iD4 == 1) {
                                j6 = aVar.f5637f.getLong();
                            } else {
                                j6 = createPlanActivity8.f32078i;
                            }
                            aVar.f5648t0.setText(r0.B(j6, true));
                        }
                    }
                } else if (it4 instanceof com.transsnet.palmpay.core.base.m) {
                    createPlanActivity7.showLoadingDialog(false);
                } else {
                    if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    createPlanActivity7.showLoadingDialog(false);
                    ((com.transsnet.palmpay.core.base.n) it4).getClass();
                }
                return Unit.f38893a;
        }
    }
}
