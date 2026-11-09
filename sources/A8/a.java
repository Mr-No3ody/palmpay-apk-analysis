package A8;

import Ab.B;
import Ab.C;
import Ad.C0058e;
import B6.X;
import B6.b0;
import Fe.I;
import G7.q;
import Kd.C0361b;
import Ke.i;
import M1.j;
import Pa.C0525w;
import Pa.D;
import Pa.n0;
import Pa.r0;
import Pe.C0538j;
import Pe.C0541m;
import Pe.C0553z;
import Wf.AbstractC0780y;
import Wf.t0;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.core.ImageAnalysis$Analyzer;
import androidx.camera.core.ImageProxy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.facebook.react.modules.network.OkHttpClientFactory;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.api.Service;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.skydoves.balloon.Balloon;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.mtn.sdk.ui.bank._common.LoginSuccessActivity;
import com.transsnet.mtn.sdk.ui.bank._common.SelectBankActivity;
import com.transsnet.mtn.sdk.ui.bank._common.TermsAndPrivacyActivity;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import com.transsnet.palmpay.cash_in.bean.response.BankCashInInstructionBean;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionDetailActivity;
import com.transsnet.palmpay.core.bean.AccountFlowBean;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.req.BindBankCardReq;
import com.transsnet.palmpay.core.bean.req.SetDefaultPaymentBankCardReq;
import com.transsnet.palmpay.core.bean.req.ViewBankCardReq;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.rnbridge.ReactNativeInitTask;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.rsp.CLCanBorrowData;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.MobileNumberEditText;
import com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.send_money.bean.AddRecipientReq;
import com.transsnet.palmpay.send_money.ui.dialog.FrequencyPickerDialog;
import com.transsnet.palmpay.send_money.ui.dialog.MonthDayPickerDialog;
import com.transsnet.palmpay.send_money.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.send_money.viewmodel.AddBankAccountViewModel;
import com.transsnet.palmpay.ui.dialog.OtpVerifyDialog;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneCouponRewardsDialog;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneRewardsDialog;
import com.transsnet.palmpay.ui.fragment.BankCardFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;
import com.transsnet.palmpay.ui.fragment.InvestGuideFragment;
import com.transsnet.palmpay.ui.fragment.MeBalanceStatementFragment;
import com.transsnet.palmpay.ui.fragment.settings.LoginSettingsFragment;
import com.transsnet.palmpay.ui.view.SettingItem;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.BalanceViewModel;
import com.transsnet.palmpay.viewmodule.BankCardAndAccountViewModel;
import com.transsnet.palmpay.viewmodule.HomeSavingsViewModel;
import face.security.device.api.FaceSecCode;
import io.fastkv.n;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.coroutines.channels.ProducerScope;
import okhttp3.U;
import p259r.b$c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements MTNButton.a, AmountEditText.OnTextInputListener, BiFunction, Function, Consumer, Action, WheelView.OnWheelItemSelectedListener, OnItemClickListener, OnSuccessListener, OnFailureListener, ImageAnalysis$Analyzer, b$c, OnItemChildClickListener, PpAmountEditText.OnTextInputListener, OkHttpClientFactory, ResultCallback, SwipeRefreshLayout.OnRefreshListener, BaseRecyclerViewAdapter$ItemViewOnClickListener, Argument2Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f78a = i7;
        this.f79b = obj;
    }

    @Override // com.transsnet.palmpay.custom_view.adapter.BaseRecyclerViewAdapter$ItemViewOnClickListener
    public void OnItemViewOnClick(View view, Object obj, RecyclerView.ViewHolder viewHolder) {
        BalanceViewModel balanceViewModel;
        Object obj2 = this.f79b;
        switch (this.f78a) {
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                AccountFlowBean.DataBean.ListBean data = (AccountFlowBean.DataBean.ListBean) obj;
                MeBalanceStatementFragment.a aVar = MeBalanceStatementFragment.f35209Z;
                Intrinsics.checkNotNullParameter(data, "data");
                MeBalanceStatementFragment meBalanceStatementFragment = (MeBalanceStatementFragment) obj2;
                meBalanceStatementFragment.f35218Y = data.redirect;
                boolean zM = false;
                if (!TextUtils.isEmpty(data.getPayId())) {
                    String payId = data.getPayId();
                    Intrinsics.checkNotNullExpressionValue(payId, "getPayId(...)");
                    zM = y.m(payId, "R_", false);
                }
                if (zM && !"03".equals(data.getTransType())) {
                    ARouter.getInstance().build("/main/refund_billdetail").withString("orderNo", data.getRemark()).withString("extra_data", data.getTransType()).navigation();
                    break;
                } else if (!TextUtils.isEmpty(data.getPayId()) && (balanceViewModel = (BalanceViewModel) meBalanceStatementFragment.f27333i) != null) {
                    String payId2 = data.getPayId();
                    Intrinsics.checkNotNullExpressionValue(payId2, "getPayId(...)");
                    balanceViewModel.e(payId2, data.getAmount(), data.getCreateTime());
                    break;
                }
                break;
            default:
                InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                InterBankCashInInstructionActivity interBankCashInInstructionActivity = (InterBankCashInInstructionActivity) obj2;
                Intent intent = new Intent(interBankCashInInstructionActivity, (Class<?>) InterBankCashInInstructionDetailActivity.class);
                intent.addFlags(268435456);
                intent.putExtra("extra_data", (BankCashInInstructionBean) obj);
                interBankCashInInstructionActivity.startActivity(intent);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    @Override // com.transsnet.palmpay.custom_view.AmountEditText.OnTextInputListener, com.palmpay.lib.ui.edit.PpAmountEditText.OnTextInputListener
    public void OnTextInput(String str) {
        boolean z3;
        Long maxLoanAmt;
        Long minLoanAmt;
        Long minLoanAmt2;
        Long maxLoanAmt2;
        Integer productSubId;
        Object obj = this.f79b;
        switch (this.f78a) {
            case 2:
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = (CLInstallmentBorrowFragment) obj;
                cLInstallmentBorrowFragment.f30519G1 = false;
                cLInstallmentBorrowFragment.E().setVisibility(8);
                Object value = cLInstallmentBorrowFragment.f30546c1.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((ConstraintLayout) value).setVisibility(8);
                CLCanBorrowData cLCanBorrowData = cLInstallmentBorrowFragment.f30555l1;
                if (cLCanBorrowData != null) {
                    long j6 = cLInstallmentBorrowFragment.x().getLong();
                    Long maxLoanAmt3 = cLCanBorrowData.getMaxLoanAmt();
                    if (maxLoanAmt3 != null && j6 == maxLoanAmt3.longValue()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                cLInstallmentBorrowFragment.D1 = z3;
                Object value2 = cLInstallmentBorrowFragment.f1.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((TextView) value2).setVisibility(cLInstallmentBorrowFragment.D1 ? 8 : 0);
                cLInstallmentBorrowFragment.U().setVisibility(cLInstallmentBorrowFragment.D1 ? 8 : 0);
                Object value3 = cLInstallmentBorrowFragment.f30551i1.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((ImageView) value3).setVisibility(cLInstallmentBorrowFragment.D1 ? 8 : 0);
                CLRepaymentPlanData cLRepaymentPlanDataX = cLInstallmentBorrowFragment.X();
                if (cLRepaymentPlanDataX != null) {
                    cLRepaymentPlanDataX.setCoupon(null);
                }
                CLRepaymentPlanData cLRepaymentPlanDataX2 = cLInstallmentBorrowFragment.X();
                if (cLRepaymentPlanDataX2 != null && (productSubId = cLRepaymentPlanDataX2.getProductSubId()) != null && productSubId.intValue() == 2) {
                    cLInstallmentBorrowFragment.f30579x1 = null;
                    cLInstallmentBorrowFragment.f30515E1 = false;
                }
                cLInstallmentBorrowFragment.f30562p1 = null;
                cLInstallmentBorrowFragment.f30564q1 = null;
                Context context = cLInstallmentBorrowFragment.getContext();
                if (context != null) {
                    long j10 = cLInstallmentBorrowFragment.x().getLong();
                    CLCanBorrowData cLCanBorrowData2 = cLInstallmentBorrowFragment.f30555l1;
                    long jLongValue = (cLCanBorrowData2 == null || (maxLoanAmt2 = cLCanBorrowData2.getMaxLoanAmt()) == null) ? 0L : maxLoanAmt2.longValue();
                    CLCanBorrowData cLCanBorrowData3 = cLInstallmentBorrowFragment.f30555l1;
                    long jLongValue2 = (cLCanBorrowData3 == null || (minLoanAmt2 = cLCanBorrowData3.getMinLoanAmt()) == null) ? 0L : minLoanAmt2.longValue();
                    cLInstallmentBorrowFragment.f30517F1 = true;
                    if (j10 < jLongValue2) {
                        cLInstallmentBorrowFragment.v().setTextColor(context.getColor(Ya.b.cs_cl_max_txt_color));
                        cLInstallmentBorrowFragment.v().setText(cLInstallmentBorrowFragment.getString(Ya.g.cs_cl_min_tips, r0.B(jLongValue2, false)));
                        cLInstallmentBorrowFragment.v().setVisibility(0);
                        cLInstallmentBorrowFragment.v().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_repayment_amount_tips_txt_color));
                        cLInstallmentBorrowFragment.A().setActionButtonEnable(false);
                    } else if (j10 > jLongValue) {
                        cLInstallmentBorrowFragment.v().setTextColor(context.getColor(Ya.b.cs_cl_max_txt_color));
                        cLInstallmentBorrowFragment.v().setText(cLInstallmentBorrowFragment.getString(Ya.g.cs_cl_max_tips, r0.B(jLongValue, false)));
                        cLInstallmentBorrowFragment.v().setVisibility(0);
                        cLInstallmentBorrowFragment.v().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_repayment_amount_tips_txt_color));
                        cLInstallmentBorrowFragment.A().setActionButtonEnable(false);
                    } else if (j10 % ((long) FaceSecCode.SC_SUCCESS) != 0) {
                        cLInstallmentBorrowFragment.v().setTextColor(context.getColor(Ya.b.cs_cl_max_txt_color));
                        cLInstallmentBorrowFragment.v().setText(cLInstallmentBorrowFragment.getString(Ya.g.cs_cl_round_number, r0.F(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM), r0.F(100000L)));
                        cLInstallmentBorrowFragment.v().setVisibility(0);
                        cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_repayment_amount_tips_txt_color));
                        cLInstallmentBorrowFragment.A().setActionButtonEnable(false);
                    } else if (j10 == 0) {
                        cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_input_divider_focus_color));
                        cLInstallmentBorrowFragment.A().setActionButtonEnable(false);
                    } else {
                        long j11 = cLInstallmentBorrowFragment.x().getLong();
                        CLCanBorrowData cLCanBorrowData4 = cLInstallmentBorrowFragment.f30555l1;
                        if (j11 < ((cLCanBorrowData4 == null || (minLoanAmt = cLCanBorrowData4.getMinLoanAmt()) == null) ? 0L : minLoanAmt.longValue())) {
                            cLInstallmentBorrowFragment.v().setTextColor(context.getColor(Ya.b.cs_cl_repayment_amount_tips_txt_color));
                            cLInstallmentBorrowFragment.v().setText(cLInstallmentBorrowFragment.getString(Ya.g.cs_cl_min_installment_amount_tips, r0.B(jLongValue2, true)));
                            cLInstallmentBorrowFragment.v().setVisibility(0);
                            cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_repayment_amount_tips_txt_color));
                            cLInstallmentBorrowFragment.A().setActionButtonEnable(false);
                        } else {
                            long j12 = cLInstallmentBorrowFragment.x().getLong();
                            CLCanBorrowData cLCanBorrowData5 = cLInstallmentBorrowFragment.f30555l1;
                            if (j12 > ((cLCanBorrowData5 == null || (maxLoanAmt = cLCanBorrowData5.getMaxLoanAmt()) == null) ? 0L : maxLoanAmt.longValue())) {
                                cLInstallmentBorrowFragment.v().setTextColor(context.getColor(Ya.b.cs_cl_max_amount_tips_txt_color));
                                cLInstallmentBorrowFragment.v().setText(cLInstallmentBorrowFragment.getString(Ya.g.cs_cl_max_one_off_limit_tips, r0.B(jLongValue, true)));
                                cLInstallmentBorrowFragment.v().setVisibility(0);
                                cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_repayment_amount_tips_txt_color));
                                cLInstallmentBorrowFragment.A().setActionButtonEnable(false);
                            } else if (j10 < jLongValue) {
                                cLInstallmentBorrowFragment.v().setVisibility(8);
                                cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(L6.b.ppColorTextPrimary));
                                cLInstallmentBorrowFragment.A().setActionButtonEnable(true);
                                cLInstallmentBorrowFragment.f30517F1 = false;
                            } else {
                                cLInstallmentBorrowFragment.v().setTextColor(context.getColor(Ya.b.cs_cl_max_amount_tips_txt_color));
                                cLInstallmentBorrowFragment.v().setText(cLInstallmentBorrowFragment.getString(Ya.g.cs_cl_only_one_loan_is_support));
                                cLInstallmentBorrowFragment.v().setVisibility(8);
                                cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_input_divider_normal_color));
                                cLInstallmentBorrowFragment.A().setActionButtonEnable(true);
                                cLInstallmentBorrowFragment.f30517F1 = false;
                            }
                        }
                    }
                    CLCanBorrowData cLCanBorrowData6 = cLInstallmentBorrowFragment.f30555l1;
                    if (cLCanBorrowData6 != null ? Intrinsics.c(cLCanBorrowData6.can, Boolean.FALSE) : false) {
                        cLInstallmentBorrowFragment.v().setTextColor(context.getColor(Ya.b.cs_cl_max_txt_color));
                        TextView textViewV = cLInstallmentBorrowFragment.v();
                        CLCanBorrowData cLCanBorrowData7 = cLInstallmentBorrowFragment.f30555l1;
                        textViewV.setText(cLCanBorrowData7 != null ? cLCanBorrowData7.msg : null);
                        cLInstallmentBorrowFragment.v().setVisibility(0);
                        cLInstallmentBorrowFragment.v().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        cLInstallmentBorrowFragment.y().setBackgroundColor(context.getColor(Ya.b.cs_cl_repayment_amount_tips_txt_color));
                    }
                    cLInstallmentBorrowFragment.f30559o1 = -1;
                    p351xb.y yVar = cLInstallmentBorrowFragment.f30568s1;
                    if (yVar != null) {
                        yVar.f43823d = -1;
                    }
                    if (yVar != null) {
                        yVar.notifyDataSetChanged();
                    }
                    p351xb.y yVar2 = cLInstallmentBorrowFragment.f30585I1;
                    if (yVar2 != null) {
                        yVar2.f43823d = cLInstallmentBorrowFragment.f30581y1;
                    }
                    if (yVar2 != null) {
                        yVar2.notifyDataSetChanged();
                    }
                    cLInstallmentBorrowFragment.W().setVisibility(8);
                    cLInstallmentBorrowFragment.N().setVisibility(8);
                    cLInstallmentBorrowFragment.E().setVisibility(8);
                    cLInstallmentBorrowFragment.R().setVisibility(8);
                    cLInstallmentBorrowFragment.B().setVisibility(0);
                    cLInstallmentBorrowFragment.K().setVisibility(8);
                    cLInstallmentBorrowFragment.z().setEnabled(false);
                }
                if (!cLInstallmentBorrowFragment.D1 && cLInstallmentBorrowFragment.A().getVisibility() == 0) {
                    cLInstallmentBorrowFragment.u();
                    break;
                }
                break;
            default:
                String str2 = RechargeActivity.f26858r0;
                RechargeActivity rechargeActivity = (RechargeActivity) obj;
                rechargeActivity.f26867Q = rechargeActivity.p().getLongAmount();
                rechargeActivity.p().setError("");
                break;
        }
    }

    @Override // p259r.b$c
    public void a(Calendar calendar) {
        InputView inputView = (InputView) this.f79b;
        inputView.f25704a.setTag(calendar);
        inputView.f25704a.setText(new SimpleDateFormat(inputView.f25707d.f39784p != 2 ? "dd/MMM/yyyy" : "MM/yy").format(Long.valueOf(calendar.getTime().getTime())));
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        Object obj2 = this.f79b;
        switch (this.f78a) {
            case 5:
                CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                ((C) obj2).invoke(obj);
                break;
            default:
                CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                ((B) obj2).invoke(obj);
                break;
        }
    }

    @Override // androidx.camera.core.ImageAnalysis$Analyzer
    public void analyze(ImageProxy imageProxy) {
        t0 t0Var;
        b0 b0Var = (b0) this.f79b;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        if (imageProxy.getImage() == null || ((t0Var = b0Var.f463w) != null && t0Var.isActive())) {
            imageProxy.close();
        } else {
            AbstractC0780y.m(V.h(b0Var), null, null, new X(b0Var, imageProxy, null), 3);
        }
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object p3) {
        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (Long) ((B) this.f79b).invoke(p3);
    }

    @Override // com.facebook.react.modules.network.OkHttpClientFactory
    public U createNewNetworkModuleClient() {
        return ReactNativeInitTask.initOkHttpClientFactory$lambda$2((ReactNativeInitTask) this.f79b);
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        Intent intent = (Intent) obj2;
        LoginSettingsFragment.a aVar = LoginSettingsFragment.f35263B;
        LoginSettingsFragment loginSettingsFragment = (LoginSettingsFragment) this.f79b;
        if (iIntValue != -1) {
            D3.a.N("enable", "fail", "user_cancelled");
            SettingItem settingItem = loginSettingsFragment.f35270w;
            if (settingItem != null) {
                settingItem.setChecked(false);
                return;
            }
            return;
        }
        if (intent != null) {
            try {
                n.I(intent.getStringExtra("_cipher_vector"), intent.getStringExtra("_encrypt_text"));
            } catch (Exception unused) {
                Z4.c cVar = n0.f7107i;
                D3.a.N("enable", "fail", "sdk_error");
                SettingItem settingItem2 = loginSettingsFragment.f35270w;
                if (settingItem2 != null) {
                    settingItem2.setChecked(false);
                    return;
                }
                return;
            }
        }
        n.G();
        n.M(true);
        D3.a.N("enable", "success", null);
        E activity = loginSettingsFragment.getActivity();
        if (activity != null) {
            p220oa.h.z(activity, "Enabled Successfully", null, null, 61);
        }
        SettingItem settingItem3 = loginSettingsFragment.f35270w;
        if (settingItem3 != null) {
            settingItem3.setChecked(true);
        }
    }

    @Override // com.transsnet.palmpay.core.callback.ResultCallback
    public void onComplete(Object obj) {
        AddBankAccountFragment addBankAccountFragment;
        BankInfo bankInfo;
        int i7 = AddBankAccountFragment.f33648M;
        if (!((Boolean) obj).booleanValue() || (bankInfo = (addBankAccountFragment = (AddBankAccountFragment) this.f79b).f33651C) == null) {
            return;
        }
        AddRecipientReq req = new AddRecipientReq();
        req.setRecipientBankAccount(addBankAccountFragment.u());
        req.setRecipientBankCode(bankInfo.bankCode);
        req.setRecipientBankName(bankInfo.bankName);
        req.setRecipientImageUrl(bankInfo.bankUrl);
        req.setRecipientType(bankInfo.mmo == 1 ? 7 : 2);
        MobileNumberEditText mobileNumberEditText = (MobileNumberEditText) addBankAccountFragment.f33655o.getValue();
        req.setRecipientMobileNo(r0.v0(r0.L0(mobileNumberEditText != null ? mobileNumberEditText.getString() : null)));
        AddBankAccountViewModel addBankAccountViewModel = (AddBankAccountViewModel) addBankAccountFragment.f27333i;
        if (addBankAccountViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            p140j8.f.s(addBankAccountViewModel, new C0361b(req, null), addBankAccountViewModel.f33962f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((ProducerScope) this.f79b).close(exc);
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(j jVar, View view, int i7) {
        final int i10 = 0;
        Object obj = this.f79b;
        switch (this.f78a) {
            case 15:
                PalmZoneCouponRewardsDialog.initViews$lambda$4((PalmZoneCouponRewardsDialog) obj, jVar, view, i7);
                break;
            case 16:
                PalmZoneRewardsDialog.initViews$lambda$2((PalmZoneRewardsDialog) obj, jVar, view, i7);
                break;
            default:
                int i11 = BankCardFragment.f35064B;
                Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "view");
                final BankCardFragment bankCardFragment = (BankCardFragment) obj;
                LinkBankCardResp.LinkBankCard linkBankCard = (LinkBankCardResp.LinkBankCard) bankCardFragment.u().getItem(i7);
                int id2 = view.getId();
                if (id2 == Ac.e.v_status_bg) {
                    int i12 = linkBankCard.bankCardStatus;
                    if (i12 == 3 || i12 == 2) {
                        n0.g().q(new ClickEvent("banksandcardsPagereaddClick"));
                        BindBankCardReq bindBankCardReq = new BindBankCardReq();
                        bindBankCardReq.cardNo = linkBankCard.getCardNo();
                        bindBankCardReq.bankCode = linkBankCard.getBankCode();
                        bindBankCardReq.bankName = linkBankCard.getBankName();
                        bindBankCardReq.cardExpiryYear = linkBankCard.getExpiryYear();
                        bindBankCardReq.cardExpiryMon = linkBankCard.getExpiryMonth();
                        bindBankCardReq.bankUrl = linkBankCard.getBankUrl();
                        bindBankCardReq.bankCardStatus = linkBankCard.bankCardStatus;
                        ARouter.getInstance().build("/coreImpl/add_new_card").withParcelable("extra_data", bindBankCardReq).navigation();
                    }
                } else if (id2 == Ac.e.ivDelete) {
                    bankCardFragment.w((LinkBankCardResp.LinkBankCard) bankCardFragment.u().getItem(i7));
                } else if (id2 == Ac.e.iv_setting) {
                    final LinkBankCardResp.LinkBankCard linkBankCard2 = (LinkBankCardResp.LinkBankCard) bankCardFragment.u().getItem(i7);
                    View layout = bankCardFragment.getLayoutInflater().inflate(Ac.f.main_popup_bank_card_setting, (ViewGroup) null);
                    Context contextRequireContext = bankCardFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    G7.g gVar = new G7.g(contextRequireContext);
                    Intrinsics.e(layout);
                    Intrinsics.checkNotNullParameter(layout, "layout");
                    gVar.f3068G = layout;
                    gVar.d(10);
                    gVar.i(21);
                    gVar.b(G7.b.f3050c);
                    gVar.c(G7.c.f3055b);
                    gVar.e(4);
                    gVar.g(8.0f);
                    gVar.t = CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, bankCardFragment.requireContext());
                    gVar.f(q.f3135a);
                    gVar.f3076O = bankCardFragment.getViewLifecycleOwner();
                    final Balloon balloonA = gVar.a();
                    p002a.a.B(view, balloonA);
                    IconicsTextView iconicsTextView = (IconicsTextView) layout.findViewById(Ac.e.itv_setting_default);
                    if (linkBankCard2.isDefaultPaymentCard()) {
                        Intrinsics.e(iconicsTextView);
                        p220oa.h.c(iconicsTextView);
                    } else {
                        iconicsTextView.setOnClickListener(new View.OnClickListener() { // from class: Ce.d
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                LinkBankCardResp.LinkBankCard linkBankCard3 = linkBankCard2;
                                BankCardFragment bankCardFragment2 = bankCardFragment;
                                Balloon balloon = balloonA;
                                switch (i10) {
                                    case 0:
                                        int i13 = BankCardFragment.f35064B;
                                        balloon.f();
                                        BankCardAndAccountViewModel bankCardAndAccountViewModel = (BankCardAndAccountViewModel) bankCardFragment2.f27333i;
                                        if (bankCardAndAccountViewModel != null) {
                                            p140j8.f.v(bankCardAndAccountViewModel, new C0541m(new SetDefaultPaymentBankCardReq(linkBankCard3.getAccountId(), 0), null), bankCardAndAccountViewModel.f35358g, 0L);
                                        }
                                        break;
                                    default:
                                        int i14 = BankCardFragment.f35064B;
                                        if (balloon != null) {
                                            balloon.f();
                                        }
                                        bankCardFragment2.w(linkBankCard3);
                                        break;
                                }
                            }
                        });
                    }
                    final int i13 = 1;
                    ((IconicsTextView) layout.findViewById(Ac.e.itv_delete)).setOnClickListener(new View.OnClickListener() { // from class: Ce.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            LinkBankCardResp.LinkBankCard linkBankCard3 = linkBankCard2;
                            BankCardFragment bankCardFragment2 = bankCardFragment;
                            Balloon balloon = balloonA;
                            switch (i13) {
                                case 0:
                                    int i14 = BankCardFragment.f35064B;
                                    balloon.f();
                                    BankCardAndAccountViewModel bankCardAndAccountViewModel = (BankCardAndAccountViewModel) bankCardFragment2.f27333i;
                                    if (bankCardAndAccountViewModel != null) {
                                        p140j8.f.v(bankCardAndAccountViewModel, new C0541m(new SetDefaultPaymentBankCardReq(linkBankCard3.getAccountId(), 0), null), bankCardAndAccountViewModel.f35358g, 0L);
                                    }
                                    break;
                                default:
                                    int i15 = BankCardFragment.f35064B;
                                    if (balloon != null) {
                                        balloon.f();
                                    }
                                    bankCardFragment2.w(linkBankCard3);
                                    break;
                            }
                        }
                    });
                } else if (id2 == Ac.e.iv_copy) {
                    String cardNo = linkBankCard.getCardNo();
                    if (cardNo != null) {
                        String str = TextUtils.isEmpty(cardNo) ? null : cardNo;
                        if (str != null) {
                            ToastUtils.showShort(v.cv_copy_successful);
                            ClipboardUtils.copyText(str);
                        }
                    }
                } else if (id2 == Ac.e.iiv_show) {
                    if (!linkBankCard.isShow()) {
                        bankCardFragment.f35069v = i7;
                        BankCardAndAccountViewModel bankCardAndAccountViewModel = (BankCardAndAccountViewModel) bankCardFragment.f27333i;
                        if (bankCardAndAccountViewModel != null) {
                            ViewBankCardReq viewBankCardReq = new ViewBankCardReq(null, null, 3, null);
                            viewBankCardReq.accountId = linkBankCard.getAccountId();
                            viewBankCardReq.orderId = linkBankCard.getOrderId();
                            p140j8.f.v(bankCardAndAccountViewModel, new C0538j(viewBankCardReq, null), bankCardAndAccountViewModel.f35359i, 0L);
                        }
                    } else {
                        linkBankCard.setShow(false);
                        bankCardFragment.u().notifyItemChanged(i7);
                    }
                }
                break;
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(j jVar, View view, int i7) {
        switch (this.f78a) {
            case 9:
                MonthDayPickerDialog.initViews$lambda$7$lambda$6((MonthDayPickerDialog) this.f79b, jVar, view, i7);
                break;
            default:
                OtpVerifyDialog.initViews$lambda$3((OtpVerifyDialog) this.f79b, jVar, view, i7);
                break;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.OnWheelItemSelectedListener
    public void onItemSelected(int i7, Object obj) {
        ((FrequencyPickerDialog) this.f79b).selectDate = (Jd.a) obj;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        Ie.h hVar;
        I i7;
        Object obj = this.f79b;
        switch (this.f78a) {
            case 22:
                HomeFragmentHomeTab homeFragmentHomeTab = (HomeFragmentHomeTab) obj;
                boolean z3 = ((homeFragmentHomeTab.f35104j > 0L ? 1 : (homeFragmentHomeTab.f35104j == 0L ? 0 : -1)) > 0 ? System.currentTimeMillis() - homeFragmentHomeTab.f35104j : 2000L) < 2000;
                I i10 = (I) homeFragmentHomeTab.f27328i;
                if (i10 != null) {
                    i10.c(true, z3);
                }
                I i11 = (I) homeFragmentHomeTab.f27328i;
                if (i11 != null) {
                    i11.queryHomeBusinessInfo();
                }
                D.f7012b = 0L;
                HomeFragment homeFragment = (HomeFragment) homeFragmentHomeTab.getParentFragment();
                if (Intrinsics.c(homeFragment != null ? homeFragment.G(true) : null, Boolean.TRUE) && (hVar = homeFragmentHomeTab.f35115v0) != null) {
                    hVar.c(true);
                }
                MarqueeViewV2 marqueeViewV2 = homeFragmentHomeTab.f35100Q;
                if (marqueeViewV2 != null) {
                    marqueeViewV2.loadAdData();
                }
                BannerAdView bannerAdView = homeFragmentHomeTab.f35098L;
                if (bannerAdView != null) {
                    BannerAdView.refreshData$default(bannerAdView, false, 1, null);
                }
                SingleAdView singleAdView = homeFragmentHomeTab.f35095B;
                if (singleAdView != null) {
                    singleAdView.refreshData();
                }
                SingleAdView singleAdView2 = homeFragmentHomeTab.f35099M;
                if (singleAdView2 != null) {
                    singleAdView2.refreshData();
                }
                homeFragmentHomeTab.f35104j = System.currentTimeMillis();
                break;
            case 23:
                n0.g().l("me_page_pull_down_to_refresh");
                D.f7012b = 0L;
                HomeMeFragment homeMeFragment = (HomeMeFragment) obj;
                I i12 = (I) homeMeFragment.f27328i;
                if (i12 != null) {
                    i12.queryMenuList();
                }
                i iVar = homeMeFragment.t;
                if (iVar != null) {
                    iVar.a(true);
                }
                HomeFragment homeFragment2 = (HomeFragment) homeMeFragment.getParentFragment();
                if (homeFragment2 != null) {
                    homeFragment2.G(true);
                }
                HomeFragment homeFragment3 = (HomeFragment) homeMeFragment.getParentFragment();
                if (homeFragment3 != null && (i7 = (I) homeFragment3.f27328i) != null) {
                    i7.queryLastTransactionHistory();
                }
                I i13 = (I) homeMeFragment.f27328i;
                if (i13 != null) {
                    i13.queryMeTabTotalAssetInfo();
                }
                MarqueeViewV2 marqueeViewV3 = homeMeFragment.f35128X;
                if (marqueeViewV3 != null) {
                    marqueeViewV3.loadAdData();
                }
                break;
            default:
                InvestGuideFragment.a aVar = InvestGuideFragment.f35185t0;
                HomeSavingsViewModel homeSavingsViewModel = (HomeSavingsViewModel) ((InvestGuideFragment) obj).f27327p;
                homeSavingsViewModel.getClass();
                p140j8.f.s(homeSavingsViewModel, new C0553z(1, null), homeSavingsViewModel.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f78a) {
            case 11:
                ((C0058e) this.f79b).invoke(obj);
                break;
            case 17:
                ((C6.q) this.f79b).invoke(obj);
                break;
            case 26:
                ((D6.a) this.f79b).invoke(obj);
                break;
            default:
                ((C6.q) this.f79b).invoke(obj);
                break;
        }
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
        ((CLInstallmentUpGradeSuccFragment) this.f79b).t();
    }

    @Override // io.reactivex.functions.BiFunction
    public Object apply(Object p3, Object p10) {
        CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p10, "p1");
        return (Pair) ((Ab.y) this.f79b).invoke(p3, p10);
    }

    @Override // com.transsnet.mtn.sdk.ui.view.MTNButton.a
    public void a() {
        switch (this.f78a) {
            case 0:
                ((LoginSuccessActivity) this.f79b).getClass();
                p073f.c.a().b(101, p073f.c.a().f36334b);
                if (Oe.a.f6828d == null) {
                    Oe.a.f6828d = new Oe.a(23);
                }
                Oe.a aVar = Oe.a.f6828d;
                aVar.getClass();
                ArrayList arrayList = new ArrayList((ArrayList) aVar.f6830b);
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    eh.a aVar2 = (eh.a) it.next();
                    it.remove();
                    aVar2.finish();
                }
                break;
            default:
                C0525w c0525w = ((TermsAndPrivacyActivity) ((Sd.b) this.f79b).f8871b).f25700g;
                ((TermsAndPrivacyActivity) c0525w.f7166b).startActivity(new Intent((TermsAndPrivacyActivity) c0525w.f7166b, (Class<?>) SelectBankActivity.class));
                break;
        }
    }
}
