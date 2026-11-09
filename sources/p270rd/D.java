package p270rd;

import Jd.c;
import L6.b;
import Pa.r0;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderDetailQuestionBean;
import com.transsnet.palmpay.core.bean.rsp.CashOrderExtendBean;
import com.transsnet.palmpay.core.ui.widget.FixedSavingsLayout;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.ApplyVoucherResp;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.bean.TransferDetailCompensation;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.view.TransferDetailBottomModel;
import com.transsnet.palmpay.send_money.ui.view.TransferDetailQuestionView;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankProgressModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayProgressView;
import com.transsnet.palmpay.send_money.viewmodel.TradeRecordViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p025ba.k;
import p054dd.n;
import p159kd.d;
import p159kd.e;
import p220oa.h;
import p223od.w;
import p355xf.l;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TradeRecordDetailActivity f41678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TradeRecordDetailActivity f41679c;

    public /* synthetic */ D(TradeRecordDetailActivity tradeRecordDetailActivity, TradeRecordDetailActivity tradeRecordDetailActivity2, int i7) {
        this.f41677a = i7;
        this.f41678b = tradeRecordDetailActivity;
        this.f41679c = tradeRecordDetailActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:302:0x051e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OrderResultHeaderModel orderResultHeaderModel;
        TextView tvViewDetail;
        long j6;
        String strW;
        List<OrderDetailQuestionBean> list;
        ImageView orderStatusArrow;
        w wVar;
        LinearLayout linearLayout;
        TextView tvViewDetail2;
        TextView tvViewDetail3;
        TextView tvViewDetail4;
        OrderResultHeaderModel orderResultHeaderModel2;
        CharSequence pendingMessage;
        TextView orderResultStatusTipsTv;
        String errorMessage;
        OrderResultHeaderModel orderResultHeaderModel3;
        View viewInflate;
        View viewInflate2;
        View viewInflate3;
        TradeRecordDetailActivity tradeRecordDetailActivity = this.f41679c;
        boolean z3 = true;
        TradeRecordDetailActivity tradeRecordDetailActivity2 = this.f41678b;
        switch (this.f41677a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    tradeRecordDetailActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    tradeRecordDetailActivity2.showLoadingDialog(false, true);
                    TradeRecordDetailResp tradeRecordDetailResp = (TradeRecordDetailResp) ((p) it).f27360a;
                    if (!tradeRecordDetailResp.isSuccess() || tradeRecordDetailResp.getData() == null) {
                        ToastUtils.showShort(tradeRecordDetailResp.getRespMsg(), new Object[0]);
                    } else {
                        TradeRecordDetailResp.RecordDetail data = tradeRecordDetailResp.getData();
                        if (data != null) {
                            BillProcessDetail orderStatusInfo = data.getOrderStatusInfo();
                            TradeRecordDetailActivity tradeRecordDetailActivity3 = this.f41679c;
                            tradeRecordDetailActivity3.f33221o = orderStatusInfo;
                            if (tradeRecordDetailActivity3.f33222p == null) {
                                w wVar2 = (w) tradeRecordDetailActivity3.f27334c;
                                tradeRecordDetailActivity3.f33222p = (wVar2 == null || (viewInflate3 = wVar2.f40531j.inflate()) == null) ? null : (OrderResultHeaderModel) viewInflate3.findViewById(e.orlm_heaer);
                            }
                            if (tradeRecordDetailActivity3.t == null) {
                                w wVar3 = (w) tradeRecordDetailActivity3.f27334c;
                                View viewInflate4 = wVar3 != null ? wVar3.t.inflate() : null;
                                tradeRecordDetailActivity3.t = viewInflate4 != null ? (TransferToPalmPayProgressView) viewInflate4.findViewById(e.v_progress_to_palmpay) : null;
                            }
                            if (tradeRecordDetailActivity3.f33223v == null) {
                                w wVar4 = (w) tradeRecordDetailActivity3.f27334c;
                                tradeRecordDetailActivity3.f33223v = (wVar4 == null || (viewInflate2 = wVar4.f40533p.inflate()) == null) ? null : (TransferToBankProgressModel) viewInflate2.findViewById(e.v_progress_to_bank);
                            }
                            if (tradeRecordDetailActivity3.f33224w == null) {
                                w wVar5 = (w) tradeRecordDetailActivity3.f27334c;
                                tradeRecordDetailActivity3.f33224w = (wVar5 == null || (viewInflate = wVar5.f40532o.inflate()) == null) ? null : (TransferDetailQuestionView) viewInflate.findViewById(e.model_transfer_question_view);
                            }
                            tradeRecordDetailActivity3.f33218g = data;
                            w wVar6 = (w) tradeRecordDetailActivity3.f27334c;
                            if (wVar6 != null) {
                                wVar6.f40526d.removeAllViews();
                            }
                            w wVar7 = (w) tradeRecordDetailActivity3.f27334c;
                            if (wVar7 != null) {
                                wVar7.f40527e.removeAllViews();
                            }
                            if (tradeRecordDetailActivity3.f33217f == 0) {
                                tradeRecordDetailActivity3.f33217f = Intrinsics.c(a.d().i(), data.getSendMemberId()) ? 1 : 2;
                            }
                            OrderResultHeaderModel orderResultHeaderModel4 = tradeRecordDetailActivity3.f33222p;
                            if (orderResultHeaderModel4 != null) {
                                orderResultHeaderModel4.l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, tradeRecordDetailActivity3, data.getOrderStatusDesc(), 0.0f, 4, null));
                            }
                            OrderResultHeaderModel orderResultHeaderModel5 = tradeRecordDetailActivity3.f33222p;
                            if (orderResultHeaderModel5 != null) {
                                orderResultHeaderModel5.k(data.getOrderStatusDesc());
                            }
                            if ((data.getOrderStatus() == 3 || data.getOrderStatus() == 5) && !TextUtils.isEmpty(data.getSuccessfulDesc()) && (orderResultHeaderModel = tradeRecordDetailActivity3.f33222p) != null) {
                                orderResultHeaderModel.m(data.getSuccessfulDesc());
                            }
                            if (data.getOrderStatus() == 6 && !TextUtils.isEmpty(data.getErrorMessage()) && (errorMessage = data.getErrorMessage()) != null && StringsKt.A(errorMessage, "Insufficient funds", false) && (orderResultHeaderModel3 = tradeRecordDetailActivity3.f33222p) != null) {
                                String errorMessage2 = data.getErrorMessage();
                                if (errorMessage2 == null) {
                                    errorMessage2 = "";
                                }
                                orderResultHeaderModel3.m(errorMessage2);
                            }
                            if (data.getOrderStatus() == 15) {
                                OrderResultHeaderModel orderResultHeaderModel6 = tradeRecordDetailActivity3.f33222p;
                                if (orderResultHeaderModel6 != null && (orderResultStatusTipsTv = orderResultHeaderModel6.getOrderResultStatusTipsTv()) != null) {
                                    orderResultStatusTipsTv.setTextColor(data.getEarlyRefundGuarantee() != 0 ? Color.parseColor("#6271EB") : tradeRecordDetailActivity3.getColor(b.ppColorPrimary));
                                }
                                if (!TextUtils.isEmpty(data.getPendingMessage()) && (orderResultHeaderModel2 = tradeRecordDetailActivity3.f33222p) != null) {
                                    if (data.getEarlyRefundGuarantee() != 0) {
                                        SpanUtils spanUtilsAppend = new SpanUtils().appendImage(d.sm_ic_early_refund).append(" ");
                                        String pendingMessage2 = data.getPendingMessage();
                                        if (pendingMessage2 == null) {
                                            pendingMessage2 = "";
                                        }
                                        pendingMessage = spanUtilsAppend.append(pendingMessage2).create();
                                    } else {
                                        pendingMessage = data.getPendingMessage();
                                        if (pendingMessage == null) {
                                            pendingMessage = "";
                                        }
                                    }
                                    orderResultHeaderModel2.m(pendingMessage);
                                }
                            }
                            if (TextUtils.isEmpty(data.getDetailBtnContent()) || TextUtils.isEmpty(data.getDetailBtnJumpUrl())) {
                                OrderResultHeaderModel orderResultHeaderModel7 = tradeRecordDetailActivity3.f33222p;
                                if (orderResultHeaderModel7 != null && (tvViewDetail = orderResultHeaderModel7.getTvViewDetail()) != null) {
                                    h.c(tvViewDetail);
                                }
                            } else {
                                OrderResultHeaderModel orderResultHeaderModel8 = tradeRecordDetailActivity3.f33222p;
                                if (orderResultHeaderModel8 != null && (tvViewDetail4 = orderResultHeaderModel8.getTvViewDetail()) != null) {
                                    h.C(tvViewDetail4);
                                }
                                OrderResultHeaderModel orderResultHeaderModel9 = tradeRecordDetailActivity3.f33222p;
                                if (orderResultHeaderModel9 != null && (tvViewDetail3 = orderResultHeaderModel9.getTvViewDetail()) != null) {
                                    tvViewDetail3.setText(data.getDetailBtnContent());
                                }
                                OrderResultHeaderModel orderResultHeaderModel10 = tradeRecordDetailActivity3.f33222p;
                                if (orderResultHeaderModel10 != null && (tvViewDetail2 = orderResultHeaderModel10.getTvViewDetail()) != null) {
                                    tvViewDetail2.setOnClickListener(new A(tradeRecordDetailActivity3, data, 0));
                                }
                            }
                            TransferDetailCompensation compensation = data.getCompensation();
                            if (compensation != null) {
                                String successCompensationPic = (!tradeRecordDetailActivity3.isDarkMode() || TextUtils.isEmpty(compensation.getSuccessDarkCompensationPic())) ? compensation.getSuccessCompensationPic() : compensation.getSuccessDarkCompensationPic();
                                if (TextUtils.isEmpty(successCompensationPic)) {
                                    if (tradeRecordDetailActivity3.f33214A == null) {
                                        ViewStub viewStub = (ViewStub) tradeRecordDetailActivity3.findViewById(e.vs_transfer_to_bank_fast_refund_progress);
                                        View viewInflate5 = viewStub != null ? viewStub.inflate() : null;
                                        tradeRecordDetailActivity3.f33214A = viewInflate5 != null ? (TransferToFastTransferSafeguardProgressModel) viewInflate5.findViewById(e.v_progress_fast_refund) : null;
                                    }
                                    TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = tradeRecordDetailActivity3.f33214A;
                                    if (transferToFastTransferSafeguardProgressModel != null) {
                                        transferToFastTransferSafeguardProgressModel.setOnFastTransferSafeguardListener(new B(tradeRecordDetailActivity3));
                                    }
                                    compensation.setDetailJumpUrl(compensation.getDetailJumpUrl() + "&fromDetail=true");
                                    TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel2 = tradeRecordDetailActivity3.f33214A;
                                    if (transferToFastTransferSafeguardProgressModel2 != null) {
                                        transferToFastTransferSafeguardProgressModel2.c(tradeRecordDetailActivity3, compensation);
                                    }
                                    w wVar8 = (w) tradeRecordDetailActivity3.f27334c;
                                    if (wVar8 != null) {
                                        h.c(wVar8.f40524b);
                                    }
                                } else {
                                    w wVar9 = (w) tradeRecordDetailActivity3.f27334c;
                                    r0.l1(successCompensationPic, wVar9 != null ? wVar9.f40524b : null);
                                    w wVar10 = (w) tradeRecordDetailActivity3.f27334c;
                                    if (wVar10 != null) {
                                        wVar10.f40524b.setOnClickListener(new n(21, compensation, tradeRecordDetailActivity3));
                                    }
                                    w wVar11 = (w) tradeRecordDetailActivity3.f27334c;
                                    if (wVar11 != null) {
                                        h.C(wVar11.f40524b);
                                    }
                                }
                            }
                            int i7 = tradeRecordDetailActivity3.f33217f;
                            if (i7 == 1) {
                                w wVar12 = (w) tradeRecordDetailActivity3.f27334c;
                                if (wVar12 != null) {
                                    TransferDetailBottomModel transferDetailBottomModel = wVar12.f40528f;
                                    if (data.getOrderStatus() != 3 && data.getOrderStatus() != 5) {
                                        z3 = false;
                                    }
                                    LinearLayout linearLayout2 = transferDetailBottomModel.f33869b;
                                    if (linearLayout2 != null) {
                                        h.s(linearLayout2, z3);
                                    }
                                }
                                tradeRecordDetailActivity3.o();
                            } else if (i7 == 2) {
                                w wVar13 = (w) tradeRecordDetailActivity3.f27334c;
                                if (wVar13 != null && (linearLayout = wVar13.f40528f.f33869b) != null) {
                                    h.s(linearLayout, false);
                                }
                                TradeRecordDetailResp.RecordDetail recordDetail = tradeRecordDetailActivity3.f33218g;
                                if (recordDetail != null) {
                                    if (TextUtils.isEmpty(recordDetail.getSenderFullName())) {
                                        OrderResultHeaderModel orderResultHeaderModel11 = tradeRecordDetailActivity3.f33222p;
                                        if (orderResultHeaderModel11 != null) {
                                            int i10 = p159kd.h.sm_bill_detail_request_to_s;
                                            String senderPhone = recordDetail.getSenderPhone();
                                            orderResultHeaderModel11.o(tradeRecordDetailActivity3.getString(i10, senderPhone != null ? r0.w(senderPhone) : null));
                                        }
                                    } else {
                                        OrderResultHeaderModel orderResultHeaderModel12 = tradeRecordDetailActivity3.f33222p;
                                        if (orderResultHeaderModel12 != null) {
                                            orderResultHeaderModel12.o(tradeRecordDetailActivity3.getString(p159kd.h.sm_bill_detail_transfer_from_s_short, recordDetail.getSenderFullName()));
                                        }
                                    }
                                    tradeRecordDetailActivity3.p(recordDetail.getSenderHeadImage());
                                    OrderResultHeaderModel orderResultHeaderModel13 = tradeRecordDetailActivity3.f33222p;
                                    if (orderResultHeaderModel13 != null) {
                                        orderResultHeaderModel13.c(r0.z(recordDetail.getRecipientAmount() <= 0 ? recordDetail.getAmount() : recordDetail.getRecipientAmount()));
                                    }
                                    CashOrderExtendBean cashOrderExtendDTO = recordDetail.getCashOrderExtendDTO();
                                    if (cashOrderExtendDTO != null) {
                                        w wVar14 = (w) tradeRecordDetailActivity3.f27334c;
                                        if (wVar14 != null) {
                                            h.C(wVar14.f40525c);
                                        }
                                        w wVar15 = (w) tradeRecordDetailActivity3.f27334c;
                                        if (wVar15 != null) {
                                            FixedSavingsLayout.c(wVar15.f40525c, cashOrderExtendDTO, null, 6);
                                        }
                                    }
                                    List<TradeRecordDetailResp.RecordDetail.TransferTax> transferTaxes = recordDetail.getTransferTaxes();
                                    if (transferTaxes == null) {
                                        j6 = 0;
                                    } else {
                                        if (transferTaxes.isEmpty()) {
                                            transferTaxes = null;
                                        }
                                        if (transferTaxes != null) {
                                            j6 = 0;
                                            tradeRecordDetailActivity3.q(tradeRecordDetailActivity3.getString(p159kd.h.sm_transfer_amount), new SpanUtils().append(c.a(recordDetail.getAmount())).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, tradeRecordDetailActivity3)).create(), false, null);
                                            for (TradeRecordDetailResp.RecordDetail.TransferTax transferTax : transferTaxes) {
                                                SpanUtils spanUtils = new SpanUtils();
                                                Long underlineTax = transferTax.getUnderlineTax();
                                                if ((underlineTax != null ? underlineTax.longValue() : 0L) > 0) {
                                                    Long underlineTax2 = transferTax.getUnderlineTax();
                                                    spanUtils.append(c.a(underlineTax2 != null ? underlineTax2.longValue() : 0L)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextAssist, tradeRecordDetailActivity3)).setStrikethrough().append(" ");
                                                }
                                                Long tax = transferTax.getTax();
                                                spanUtils.append(c.a(tax != null ? tax.longValue() : 0L));
                                                String taxName = transferTax.getTaxName();
                                                SpannableStringBuilder spannableStringBuilderCreate = spanUtils.create();
                                                List<TradeRecordDetailResp.RecordDetail.SubTax> subTaxList = transferTax.getSubTaxList();
                                                tradeRecordDetailActivity3.q(taxName, spannableStringBuilderCreate, (subTaxList == null || (subTaxList.isEmpty() ^ z3) != z3) ? false : z3, new C(tradeRecordDetailActivity3, transferTax, 0));
                                                z3 = true;
                                            }
                                            tradeRecordDetailActivity3.q(tradeRecordDetailActivity3.getString(p159kd.h.sm_receive_amount_text), new SpanUtils().append(c.a(recordDetail.getRecipientAmount())).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, tradeRecordDetailActivity3)).create(), false, null);
                                        } else {
                                            j6 = 0;
                                        }
                                    }
                                    SpanUtils spanUtils2 = new SpanUtils();
                                    if (TextUtils.isEmpty(recordDetail.getSenderPhone())) {
                                        strW = "";
                                    } else {
                                        String senderPhone2 = recordDetail.getSenderPhone();
                                        strW = senderPhone2 != null ? r0.w(senderPhone2) : null;
                                    }
                                    if (TextUtils.isEmpty(recordDetail.getSenderFullName())) {
                                        StringBuilder sb2 = new StringBuilder();
                                        if (!TextUtils.isEmpty(recordDetail.getSenderBankName())) {
                                            sb2.append(recordDetail.getSenderBankName());
                                        }
                                        if (!TextUtils.isEmpty(strW)) {
                                            if (!TextUtils.isEmpty(sb2)) {
                                                sb2.append(" | ");
                                            }
                                            sb2.append(strW);
                                        }
                                        spanUtils2.append(sb2);
                                    } else {
                                        String senderFullName = recordDetail.getSenderFullName();
                                        spanUtils2.append(senderFullName != null ? senderFullName : "");
                                        StringBuilder sb3 = new StringBuilder();
                                        if (!TextUtils.isEmpty(recordDetail.getSenderBankName())) {
                                            sb3.append(recordDetail.getSenderBankName());
                                        }
                                        if (!TextUtils.isEmpty(strW)) {
                                            if (!TextUtils.isEmpty(sb3)) {
                                                sb3.append(" | ");
                                            }
                                            sb3.append(strW);
                                        }
                                        if (!TextUtils.isEmpty(sb3)) {
                                            spanUtils2.appendLine().append(sb3).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, tradeRecordDetailActivity3));
                                        }
                                    }
                                    TradeRecordDetailActivity.r(tradeRecordDetailActivity3, tradeRecordDetailActivity3.getString(k.core_sender), spanUtils2.create(), 60);
                                    if (!TextUtils.isEmpty(recordDetail.getRecipientRemark())) {
                                        TradeRecordDetailActivity.r(tradeRecordDetailActivity3, tradeRecordDetailActivity3.getString(k.core_notes), recordDetail.getRecipientRemark(), 60);
                                    } else if (!TextUtils.isEmpty(recordDetail.getSenderRemark())) {
                                        TradeRecordDetailActivity.r(tradeRecordDetailActivity3, tradeRecordDetailActivity3.getString(k.core_notes), recordDetail.getSenderRemark(), 60);
                                    }
                                    if (recordDetail.getOrderStatus() == 5 || recordDetail.getOrderStatus() == 6 || recordDetail.getOrderStatus() == 13 || recordDetail.getOrderStatus() == 12 || recordDetail.getOrderStatus() == 11 || recordDetail.getOrderStatus() == 14) {
                                        String string = tradeRecordDetailActivity3.getString(k.core_completion_time);
                                        Long updateTime = recordDetail.getUpdateTime();
                                        TradeRecordDetailActivity.r(tradeRecordDetailActivity3, string, r0.N(updateTime != null ? updateTime.longValue() : j6), 60);
                                    } else {
                                        String string2 = tradeRecordDetailActivity3.getString(k.core_create_time);
                                        Long updateTime2 = recordDetail.getUpdateTime();
                                        TradeRecordDetailActivity.r(tradeRecordDetailActivity3, string2, r0.N(updateTime2 != null ? updateTime2.longValue() : j6), 60);
                                    }
                                    if (!TextUtils.isEmpty(recordDetail.getOrderNo())) {
                                        TradeRecordDetailActivity.r(tradeRecordDetailActivity3, tradeRecordDetailActivity3.getString(k.core_receipt_transaction_id), recordDetail.getOrderNo(), 44);
                                    }
                                    if (!TextUtils.isEmpty(recordDetail.getChannelTransactionId())) {
                                        TradeRecordDetailActivity.r(tradeRecordDetailActivity3, tradeRecordDetailActivity3.getString(p159kd.h.sm_session_id), recordDetail.getChannelTransactionId(), 44);
                                    }
                                    tradeRecordDetailActivity3.f33219i = recordDetail.getPaymentTypeDesc();
                                    TradeRecordDetailActivity.r(tradeRecordDetailActivity3, tradeRecordDetailActivity3.getString(k.core_bill_detail_bill_type), tradeRecordDetailActivity3.f33219i, 60);
                                    int businessType = recordDetail.getBusinessType();
                                    if (businessType == 4) {
                                        TradeRecordDetailResp.RecordDetail recordDetail2 = tradeRecordDetailActivity3.f33218g;
                                        Intrinsics.e(recordDetail2);
                                        int orderStatus = recordDetail2.getOrderStatus();
                                        if (orderStatus == 2) {
                                            w wVar16 = (w) tradeRecordDetailActivity3.f27334c;
                                            if (wVar16 != null) {
                                                h.s(wVar16.f40529g, true);
                                            }
                                        } else if (orderStatus != 5) {
                                            w wVar17 = (w) tradeRecordDetailActivity3.f27334c;
                                            if (wVar17 != null) {
                                                h.s(wVar17.f40529g, false);
                                            }
                                        } else {
                                            w wVar18 = (w) tradeRecordDetailActivity3.f27334c;
                                            if (wVar18 != null) {
                                                h.s(wVar18.f40529g, false);
                                            }
                                        }
                                    } else if (businessType == 5) {
                                        TradeRecordDetailResp.RecordDetail recordDetail3 = tradeRecordDetailActivity3.f33218g;
                                        Intrinsics.e(recordDetail3);
                                        int orderStatus2 = recordDetail3.getOrderStatus();
                                        if (orderStatus2 == 3) {
                                            w wVar19 = (w) tradeRecordDetailActivity3.f27334c;
                                            if (wVar19 != null) {
                                                wVar19.f40529g.setBackgroundResource(p025ba.d.core_next_btn_selector_corner_12dp_bg);
                                            }
                                            w wVar20 = (w) tradeRecordDetailActivity3.f27334c;
                                            if (wVar20 != null) {
                                                wVar20.f40529g.setTextColor(tradeRecordDetailActivity3.getColor(b.ppColorTextBase));
                                            }
                                            if (TradeRecordDetailActivity.s()) {
                                                w wVar21 = (w) tradeRecordDetailActivity3.f27334c;
                                                if (wVar21 != null) {
                                                    wVar21.f40529g.setText(k.core_apply_for_balance);
                                                }
                                            } else {
                                                w wVar22 = (w) tradeRecordDetailActivity3.f27334c;
                                                if (wVar22 != null) {
                                                    wVar22.f40529g.setText(p159kd.h.sm_bill_detail_collect_action);
                                                }
                                            }
                                            w wVar23 = (w) tradeRecordDetailActivity3.f27334c;
                                            if (wVar23 != null) {
                                                h.s(wVar23.f40529g, true);
                                            }
                                        } else if (orderStatus2 != 5) {
                                            w wVar24 = (w) tradeRecordDetailActivity3.f27334c;
                                            if (wVar24 != null) {
                                                h.s(wVar24.f40529g, false);
                                            }
                                        } else {
                                            w wVar25 = (w) tradeRecordDetailActivity3.f27334c;
                                            if (wVar25 != null) {
                                                h.s(wVar25.f40529g, false);
                                            }
                                        }
                                    } else if ((businessType == 7 || businessType == 8) && (wVar = (w) tradeRecordDetailActivity3.f27334c) != null) {
                                        h.s(wVar.f40529g, false);
                                    }
                                    if (recordDetail.getOrderStatus() == 5) {
                                        w wVar26 = (w) tradeRecordDetailActivity3.f27334c;
                                        if (wVar26 != null) {
                                            wVar26.f40529g.setVisibility(8);
                                        }
                                        OrderResultHeaderModel orderResultHeaderModel14 = tradeRecordDetailActivity3.f33222p;
                                        if (orderResultHeaderModel14 != null) {
                                            orderResultHeaderModel14.c(r0.B(recordDetail.getRecipientAmount(), false));
                                        }
                                        String receiveTypeDesc = recordDetail.getReceiveTypeDesc();
                                        tradeRecordDetailActivity3.f33220j = receiveTypeDesc;
                                        if (TextUtils.isEmpty(receiveTypeDesc)) {
                                            tradeRecordDetailActivity3.f33220j = tradeRecordDetailActivity3.getString(p159kd.h.sm_bill_bill_collect_balance);
                                        }
                                        TradeRecordDetailActivity.r(tradeRecordDetailActivity3, tradeRecordDetailActivity3.getString(p159kd.h.sm_bill_detail_collect_method), tradeRecordDetailActivity3.f33220j, 60);
                                    }
                                    if (!TextUtils.isEmpty(recordDetail.getShopName())) {
                                        TradeRecordDetailActivity.r(tradeRecordDetailActivity3, tradeRecordDetailActivity3.getString(p159kd.h.sm_receive_shop_name), recordDetail.getShopName(), 60);
                                    }
                                    TransferDetailQuestionView transferDetailQuestionView = tradeRecordDetailActivity3.f33224w;
                                    if (transferDetailQuestionView != null) {
                                        h.c(transferDetailQuestionView);
                                    }
                                    OrderResultHeaderModel orderResultHeaderModel15 = tradeRecordDetailActivity3.f33222p;
                                    if (orderResultHeaderModel15 != null && (orderStatusArrow = orderResultHeaderModel15.getOrderStatusArrow()) != null) {
                                        h.c(orderStatusArrow);
                                    }
                                    BillProcessDetail orderStatusInfo2 = recordDetail.getOrderStatusInfo();
                                    if (orderStatusInfo2 != null && (list = orderStatusInfo2.faqLinkList) != null) {
                                        List<OrderDetailQuestionBean> list2 = list.size() > 0 ? list : null;
                                        if (list2 != null) {
                                            TransferDetailQuestionView transferDetailQuestionView2 = tradeRecordDetailActivity3.f33224w;
                                            if (transferDetailQuestionView2 != null) {
                                                h.C(transferDetailQuestionView2);
                                            }
                                            TransferDetailQuestionView transferDetailQuestionView3 = tradeRecordDetailActivity3.f33224w;
                                            if (transferDetailQuestionView3 != null) {
                                                transferDetailQuestionView3.setData(list2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (it instanceof m) {
                    tradeRecordDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new l();
                    }
                    tradeRecordDetailActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    tradeRecordDetailActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    tradeRecordDetailActivity2.showLoadingDialog(false, true);
                    if (((ApplyVoucherResp) ((p) it2).f27360a).isSuccess()) {
                        TradeRecordDetailActivity.a aVar = TradeRecordDetailActivity.f33213B;
                        ((TradeRecordViewModel) tradeRecordDetailActivity.l()).d(tradeRecordDetailActivity.f33216e);
                        TradeRecordDetailActivity.n(tradeRecordDetailActivity, true);
                    } else {
                        TradeRecordDetailActivity.n(tradeRecordDetailActivity, false);
                    }
                } else if (it2 instanceof m) {
                    tradeRecordDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new l();
                    }
                    tradeRecordDetailActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    tradeRecordDetailActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    tradeRecordDetailActivity2.showLoadingDialog(false, true);
                    if (((ApplyVoucherResp) ((p) it3).f27360a).isSuccess()) {
                        TradeRecordDetailActivity.a aVar2 = TradeRecordDetailActivity.f33213B;
                        ((TradeRecordViewModel) tradeRecordDetailActivity.l()).d(tradeRecordDetailActivity.f33216e);
                        TradeRecordDetailActivity.n(tradeRecordDetailActivity, true);
                    } else {
                        TradeRecordDetailActivity.n(tradeRecordDetailActivity, false);
                    }
                } else if (it3 instanceof m) {
                    tradeRecordDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new l();
                    }
                    tradeRecordDetailActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
