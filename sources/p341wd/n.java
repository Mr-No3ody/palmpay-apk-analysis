package p341wd;

import Ad.C0077y;
import C0.G;
import Pa.r0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableCreateOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBankChannelInfoResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableResultActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateScheduleTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmTransferInfoDialog;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p159kd.d;
import p220oa.h;
import p355xf.l;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43430c;

    public /* synthetic */ n(ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity, ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity2, int i7) {
        this.f43428a = i7;
        this.f43429b = scheduleTransferForBankUnstableHomeActivity;
        this.f43430c = scheduleTransferForBankUnstableHomeActivity2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long maxAmount;
        Long minAmount;
        ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43430c;
        ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity2 = this.f43429b;
        switch (this.f43428a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        ScheduleTransferForBankUnstableResp scheduleTransferForBankUnstableResp = (ScheduleTransferForBankUnstableResp) commonBeanResult.data;
                        if (scheduleTransferForBankUnstableResp != null) {
                            scheduleTransferForBankUnstableHomeActivity.f33466t0 = scheduleTransferForBankUnstableResp;
                            scheduleTransferForBankUnstableHomeActivity.n();
                            String bottomContent = scheduleTransferForBankUnstableResp.getBottomContent();
                            if (bottomContent != null) {
                                if (TextUtils.isEmpty(bottomContent)) {
                                    bottomContent = null;
                                }
                                if (bottomContent != null) {
                                    t tVar = scheduleTransferForBankUnstableHomeActivity.f33453d;
                                    Object value = tVar.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                    TextView textView = (TextView) value;
                                    if (textView != null) {
                                        h.C(textView);
                                    }
                                    Object value2 = tVar.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                                    TextView textView2 = (TextView) value2;
                                    if (textView2 != null) {
                                        SpanUtils spanUtilsAppend = new SpanUtils().append(bottomContent.concat(" "));
                                        String bottomBoldContent = scheduleTransferForBankUnstableResp.getBottomBoldContent();
                                        if (bottomBoldContent == null) {
                                            bottomBoldContent = "";
                                        }
                                        textView2.setText(spanUtilsAppend.append(bottomBoldContent).setFontFamily("sans-serif-medium").setFontSize(12, true).create());
                                    }
                                }
                            }
                            String topContent = scheduleTransferForBankUnstableResp.getTopContent();
                            if (topContent != null) {
                                if (TextUtils.isEmpty(topContent)) {
                                    topContent = null;
                                }
                                if (topContent != null) {
                                    t tVar2 = scheduleTransferForBankUnstableHomeActivity.f33447M;
                                    Object value3 = tVar2.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                                    TextView textView3 = (TextView) value3;
                                    if (textView3 != null) {
                                        h.C(textView3);
                                    }
                                    Object value4 = tVar2.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                                    TextView textView4 = (TextView) value4;
                                    if (textView4 != null) {
                                        textView4.setText(topContent);
                                    }
                                }
                            }
                            String iconUrl = scheduleTransferForBankUnstableResp.getIconUrl();
                            if (iconUrl != null) {
                                String str = TextUtils.isEmpty(iconUrl) ? null : iconUrl;
                                if (str != null) {
                                    Object value5 = scheduleTransferForBankUnstableHomeActivity.f33457i.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                                    ImageView imageView = (ImageView) value5;
                                    if (imageView != null) {
                                        r0.i1(imageView, str, Integer.MIN_VALUE, CommonViewExtKt.getDp(14));
                                    }
                                }
                            }
                            Long minAmount2 = scheduleTransferForBankUnstableResp.getMinAmount();
                            long jLongValue = 0;
                            if ((minAmount2 != null ? minAmount2.longValue() : 0L) >= 0) {
                                Long maxAmount2 = scheduleTransferForBankUnstableResp.getMaxAmount();
                                if ((maxAmount2 != null ? maxAmount2.longValue() : 0L) > 0) {
                                    StateAmountEditText stateAmountEditTextS = scheduleTransferForBankUnstableHomeActivity.s();
                                    SpanUtils spanUtilsI = G.i("");
                                    ScheduleTransferForBankUnstableResp scheduleTransferForBankUnstableResp2 = scheduleTransferForBankUnstableHomeActivity.f33466t0;
                                    String strA = r0.A((scheduleTransferForBankUnstableResp2 == null || (minAmount = scheduleTransferForBankUnstableResp2.getMinAmount()) == null) ? 0L : minAmount.longValue());
                                    ScheduleTransferForBankUnstableResp scheduleTransferForBankUnstableResp3 = scheduleTransferForBankUnstableHomeActivity.f33466t0;
                                    if (scheduleTransferForBankUnstableResp3 != null && (maxAmount = scheduleTransferForBankUnstableResp3.getMaxAmount()) != null) {
                                        jLongValue = maxAmount.longValue();
                                    }
                                    stateAmountEditTextS.setHint(spanUtilsI.append(strA + " - " + r0.A(jLongValue)).setFontFamily("sans-serif").setFontSize(16, true).create());
                                }
                            }
                        }
                    } else {
                        h.x(scheduleTransferForBankUnstableHomeActivity, commonBeanResult.getRespMsg());
                    }
                } else if (it instanceof m) {
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new l();
                    }
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                    if (commonBeanResult2.isSuccess()) {
                        ScheduleTransferForBankUnstableCreateOrderResp scheduleTransferForBankUnstableCreateOrderResp = (ScheduleTransferForBankUnstableCreateOrderResp) commonBeanResult2.data;
                        if (scheduleTransferForBankUnstableCreateOrderResp != null) {
                            ScheduleTransferForBankUnstableResultActivity.f33485j.startActivity(scheduleTransferForBankUnstableHomeActivity, scheduleTransferForBankUnstableCreateOrderResp);
                        }
                    } else {
                        h.x(scheduleTransferForBankUnstableHomeActivity, commonBeanResult2.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new l();
                    }
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it2).getClass();
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((p) it3).f27360a;
                    if (commonBeanResult3.isSuccess()) {
                        TransferBankChannelInfoResp transferBankChannelInfoResp = (TransferBankChannelInfoResp) commonBeanResult3.data;
                        scheduleTransferForBankUnstableHomeActivity.f33467u0 = transferBankChannelInfoResp;
                        Integer channelStatus = transferBankChannelInfoResp != null ? transferBankChannelInfoResp.getChannelStatus() : null;
                        if (channelStatus != null && channelStatus.intValue() == 3) {
                            if (scheduleTransferForBankUnstableHomeActivity.f33469v0 == null) {
                                scheduleTransferForBankUnstableHomeActivity.f33469v0 = new ConfirmDuplicateScheduleTransferDialog(scheduleTransferForBankUnstableHomeActivity);
                            }
                            ConfirmDuplicateScheduleTransferDialog confirmDuplicateScheduleTransferDialog = scheduleTransferForBankUnstableHomeActivity.f33469v0;
                            if (confirmDuplicateScheduleTransferDialog != null && !confirmDuplicateScheduleTransferDialog.isShowing()) {
                                confirmDuplicateScheduleTransferDialog.show();
                                String string = scheduleTransferForBankUnstableHomeActivity.getString(p159kd.h.sm_book_new_transfer);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                confirmDuplicateScheduleTransferDialog.setConfirmText(string);
                                TransferBankChannelInfoResp transferBankChannelInfoResp2 = scheduleTransferForBankUnstableHomeActivity.f33467u0;
                                confirmDuplicateScheduleTransferDialog.setData(transferBankChannelInfoResp2 != null ? transferBankChannelInfoResp2.getBookTransferDetail() : null);
                                confirmDuplicateScheduleTransferDialog.setOnConfirmDuplicateScheduleTransferListener(new p(scheduleTransferForBankUnstableHomeActivity));
                            }
                        } else {
                            ConfirmTransferInfoDialog confirmTransferInfoDialog = scheduleTransferForBankUnstableHomeActivity.f33464r0;
                            if (confirmTransferInfoDialog == null || !confirmTransferInfoDialog.isShowing()) {
                                String string2 = scheduleTransferForBankUnstableHomeActivity.t().getText().toString();
                                ConfirmTransferInfoDialog confirmTransferInfoDialog2 = new ConfirmTransferInfoDialog(scheduleTransferForBankUnstableHomeActivity);
                                scheduleTransferForBankUnstableHomeActivity.f33464r0 = confirmTransferInfoDialog2;
                                confirmTransferInfoDialog2.show();
                                VerifyPaymentInfoRsp.DataBean dataBean = scheduleTransferForBankUnstableHomeActivity.f33459k0;
                                if (dataBean != null) {
                                    SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().appendImage(d.sm_ic_none_verified).append(" ").append(dataBean.statusDesc).create();
                                    Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                                    confirmTransferInfoDialog2.setTips(spannableStringBuilderCreate);
                                    C0077y c0077y = new C0077y();
                                    c0077y.f260a = scheduleTransferForBankUnstableHomeActivity.getString(p159kd.h.sm_bank);
                                    BankInfo bankInfo = scheduleTransferForBankUnstableHomeActivity.f33465s0;
                                    c0077y.f261b = bankInfo != null ? bankInfo.bankName : null;
                                    c0077y.f262c = bankInfo != null ? bankInfo.bankUrl : null;
                                    Unit unit = Unit.f38893a;
                                    C0077y c0077y2 = new C0077y();
                                    c0077y2.f260a = scheduleTransferForBankUnstableHomeActivity.getString(p159kd.h.sm_account_number);
                                    c0077y2.f261b = string2;
                                    C0077y c0077y3 = new C0077y();
                                    c0077y3.f260a = scheduleTransferForBankUnstableHomeActivity.getString(p159kd.h.sm_verified_name);
                                    c0077y3.f261b = dataBean.accountName;
                                    confirmTransferInfoDialog2.setData(C1850q.e(c0077y, c0077y2, c0077y3));
                                    confirmTransferInfoDialog2.setOnConfirmTransferInfoListener(new l(scheduleTransferForBankUnstableHomeActivity));
                                }
                            }
                        }
                    }
                } else if (it3 instanceof m) {
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new l();
                    }
                    scheduleTransferForBankUnstableHomeActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
