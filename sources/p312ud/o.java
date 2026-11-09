package p312ud;

import C0.G;
import L6.b;
import N8.q0;
import Pa.i0;
import Pa.r0;
import S1.c;
import S6.a;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.adjust.sdk.network.ErrorCodes;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferDetailOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferOrderResp;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferSubOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferOrderDetailActivity;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p223od.d;
import p223od.v;
import p294tb.W;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferOrderDetailActivity f42987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferOrderDetailActivity f42988c;

    public /* synthetic */ o(ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity, ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity2, int i7) {
        this.f42986a = i7;
        this.f42987b = scheduleTransferOrderDetailActivity;
        this.f42988c = scheduleTransferOrderDetailActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:226:0x0547  */
    /* JADX WARN: Code duplicated, block: B:228:0x055c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0561  */
    /* JADX WARN: Code duplicated, block: B:231:0x0564  */
    /* JADX WARN: Code duplicated, block: B:233:0x056e  */
    /* JADX WARN: Code duplicated, block: B:234:0x0573  */
    /* JADX WARN: Code duplicated, block: B:237:0x057b  */
    /* JADX WARN: Code duplicated, block: B:238:0x057d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0588  */
    /* JADX WARN: Code duplicated, block: B:242:0x058d  */
    /* JADX WARN: Code duplicated, block: B:244:0x0590  */
    /* JADX WARN: Code duplicated, block: B:248:0x05d2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SpanUtils spanUtilsAppendLine;
        Integer transferNum;
        int iIntValue;
        v vVarO;
        Integer successNum;
        int iIntValue2;
        String str;
        Integer residueNum;
        int iIntValue3;
        String strG;
        String strN;
        int i7;
        Long gmtModified;
        View viewInflate;
        String transferStatusIcon;
        Long gmtModified2;
        v vVarO2;
        Long gmtModified3;
        Long gmtModified4;
        String transferStatusIcon2;
        Long gmtModified5;
        View viewInflate2 = null;
        ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity = this.f42988c;
        ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity2 = this.f42987b;
        switch (this.f42986a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    boolean zIsSuccess = commonBeanResult.isSuccess();
                    ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity3 = this.f42988c;
                    if (zIsSuccess) {
                        ScheduleTransferOrderResp scheduleTransferOrderResp = (ScheduleTransferOrderResp) commonBeanResult.data;
                        if (scheduleTransferOrderResp != null) {
                            scheduleTransferOrderDetailActivity3.f33412f = scheduleTransferOrderResp;
                            v vVarO3 = scheduleTransferOrderDetailActivity3.o();
                            if (vVarO3 != null) {
                                vVarO3.f40520b.removeAllViews();
                                ArrayList arrayList = scheduleTransferOrderDetailActivity3.f33416o;
                                arrayList.clear();
                                SpanUtils spanUtils = new SpanUtils();
                                String payeeName = scheduleTransferOrderResp.getPayeeName();
                                if (payeeName == null) {
                                    payeeName = "";
                                }
                                SpanUtils fontFamily = spanUtils.appendLine(payeeName).setFontFamily("sans-serif-medium");
                                Integer type = scheduleTransferOrderResp.getType();
                                if (type != null && type.intValue() == 1) {
                                    String payeePhone = scheduleTransferOrderResp.getPayeePhone();
                                    d0.j("PalmPay | ", payeePhone != null ? r0.w(payeePhone) : null, fontFamily).setForegroundColor(scheduleTransferOrderDetailActivity3.getColor(b.ppColorTextNormal)).setFontSize(CommonViewExtKt.getDp(12), false);
                                } else {
                                    fontFamily.append(r0.H(scheduleTransferOrderResp.getPayeeBankName()) + " | " + i0.o(scheduleTransferOrderResp.getPayeeBankNo())).setFontSize(CommonViewExtKt.getDp(12), false).setForegroundColor(scheduleTransferOrderDetailActivity3.getColor(b.ppColorTextNormal));
                                }
                                OrderResultItemModel orderResultItemModel = new OrderResultItemModel(scheduleTransferOrderDetailActivity3, 1002, scheduleTransferOrderDetailActivity3.getString(h.sm_beneficiary), fontFamily.create(), 12.0f, 12.0f, CommonViewExtKt.getDp(40));
                                v vVarO4 = scheduleTransferOrderDetailActivity3.o();
                                if (vVarO4 != null) {
                                    vVarO4.f40520b.addView(orderResultItemModel);
                                }
                                String string = scheduleTransferOrderDetailActivity3.getString(k.core_amount);
                                Long businessAmount = scheduleTransferOrderResp.getBusinessAmount();
                                scheduleTransferOrderDetailActivity3.p(1002, string, r0.B(businessAmount != null ? businessAmount.longValue() : 0L, false));
                                String string2 = scheduleTransferOrderDetailActivity3.getString(h.sm_frequency);
                                SimpleDateFormat simpleDateFormat = Jd.b.f4773a;
                                Integer taskType = scheduleTransferOrderResp.getTaskType();
                                int iIntValue4 = taskType != null ? taskType.intValue() : 0;
                                Long taskStartDate = scheduleTransferOrderResp.getTaskStartDate();
                                long jLongValue = taskStartDate != null ? taskStartDate.longValue() : 0L;
                                if (iIntValue4 == 1) {
                                    strG = "Once";
                                } else if (iIntValue4 == 3) {
                                    strG = G.o("Every ", r0.M0(jLongValue, TimeZone.getDefault()));
                                } else if (iIntValue4 == 4) {
                                    Calendar calendar = Calendar.getInstance();
                                    calendar.setTime(new Date(jLongValue));
                                    int i10 = calendar.get(5);
                                    if (i10 == 1) {
                                        strG = "1st of Every Month";
                                    } else if (i10 != 2) {
                                        strG = i10 != 3 ? u.g(i10, "th of Every Month") : "3rd of Every Month";
                                    } else {
                                        strG = "2nd of Every Month";
                                    }
                                } else {
                                    strG = "Every Day";
                                }
                                scheduleTransferOrderDetailActivity3.p(1002, string2, strG);
                                String string3 = scheduleTransferOrderDetailActivity3.getString(k.core_duration);
                                Integer taskType2 = scheduleTransferOrderResp.getTaskType();
                                int iIntValue5 = taskType2 != null ? taskType2.intValue() : 0;
                                Integer transferNum2 = scheduleTransferOrderResp.getTransferNum();
                                int iIntValue6 = transferNum2 != null ? transferNum2.intValue() : 0;
                                Long taskStartDate2 = scheduleTransferOrderResp.getTaskStartDate();
                                Long taskEndDate = scheduleTransferOrderResp.getTaskEndDate();
                                if (iIntValue5 == 1) {
                                    strN = Jd.b.b(taskStartDate2);
                                    i7 = 1002;
                                } else {
                                    if (iIntValue5 == 3) {
                                        strN = iIntValue6 > 0 ? G.n(iIntValue6, " transfers", F.f("From ", Jd.b.b(taskStartDate2), " to ", Jd.b.b(taskEndDate), "\nTotaling ")) : q0.k("From ", Jd.b.b(taskStartDate2), ", with no end date");
                                    } else if (iIntValue5 == 4) {
                                        strN = iIntValue6 > 0 ? G.n(iIntValue6, " transfers", F.f("From ", Jd.b.b(taskStartDate2), " to ", Jd.b.b(taskEndDate), "\nTotaling ")) : q0.k("From ", Jd.b.b(taskStartDate2), ", with no end date");
                                    } else {
                                        strN = Jd.b.b(taskStartDate2) + " to " + Jd.b.b(taskEndDate) + "\nTotaling " + iIntValue6 + " transfers";
                                    }
                                    i7 = 1002;
                                }
                                scheduleTransferOrderDetailActivity3.p(i7, string3, strN);
                                OrderResultItemModel orderResultItemModelP = scheduleTransferOrderDetailActivity3.p(ErrorCodes.MALFORMED_URL_EXCEPTION, scheduleTransferOrderDetailActivity3.getString(h.sm_order_id), scheduleTransferOrderResp.getTaskNo());
                                p220oa.h.c(orderResultItemModelP);
                                arrayList.add(orderResultItemModelP);
                                String payTypeDesc = scheduleTransferOrderResp.getPayTypeDesc();
                                if (payTypeDesc != null) {
                                    if (TextUtils.isEmpty(payTypeDesc)) {
                                        payTypeDesc = null;
                                    }
                                    if (payTypeDesc != null) {
                                        OrderResultItemModel orderResultItemModelP2 = scheduleTransferOrderDetailActivity3.p(1002, scheduleTransferOrderDetailActivity3.getString(k.core_payment_method), payTypeDesc);
                                        p220oa.h.c(orderResultItemModelP2);
                                        arrayList.add(orderResultItemModelP2);
                                    }
                                }
                                String scheduleNote = scheduleTransferOrderResp.getScheduleNote();
                                if (scheduleNote != null) {
                                    if (TextUtils.isEmpty(scheduleNote)) {
                                        scheduleNote = null;
                                    }
                                    if (scheduleNote != null) {
                                        OrderResultItemModel orderResultItemModelP3 = scheduleTransferOrderDetailActivity3.p(1002, scheduleTransferOrderDetailActivity3.getString(k.core_notes), scheduleNote);
                                        p220oa.h.c(orderResultItemModelP3);
                                        arrayList.add(orderResultItemModelP3);
                                    }
                                }
                                TextView textView = new TextView(scheduleTransferOrderDetailActivity3);
                                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, CommonViewExtKt.getDp(38));
                                textView.setPadding(CommonViewExtKt.getDp(20), 0, CommonViewExtKt.getDp(20), 0);
                                textView.setLayoutParams(layoutParams);
                                textView.setGravity(17);
                                textView.setText(r0.H0(k.core_more));
                                textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, scheduleTransferOrderDetailActivity3));
                                textView.setTextSize(14.0f);
                                IconicsDrawable iconicsDrawable = new IconicsDrawable(scheduleTransferOrderDetailActivity3, a.pay_Arrowdown);
                                iconicsDrawable.a(new l(scheduleTransferOrderDetailActivity3, 0));
                                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, iconicsDrawable, (Drawable) null);
                                textView.setOnClickListener(new W(7, scheduleTransferOrderDetailActivity3, textView));
                                v vVarO5 = scheduleTransferOrderDetailActivity3.o();
                                if (vVarO5 != null) {
                                    vVarO5.f40520b.addView(textView);
                                }
                            }
                            Integer successNum2 = scheduleTransferOrderResp.getSuccessNum();
                            if ((successNum2 != null ? successNum2.intValue() : 0) > 0) {
                                spanUtilsAppendLine = new SpanUtils().appendLine(scheduleTransferOrderDetailActivity3.getString(h.sm_transfer_history));
                                transferNum = scheduleTransferOrderResp.getTransferNum();
                                if (transferNum != null) {
                                    iIntValue = transferNum.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                if (iIntValue > 0) {
                                    Integer successNum3 = scheduleTransferOrderResp.getSuccessNum();
                                    successNum = scheduleTransferOrderResp.getSuccessNum();
                                    if (successNum != null) {
                                        iIntValue2 = successNum.intValue();
                                    } else {
                                        iIntValue2 = 0;
                                    }
                                    if (iIntValue2 > 1) {
                                        str = "Transfers";
                                    } else {
                                        str = "Transfer";
                                    }
                                    Integer residueNum2 = scheduleTransferOrderResp.getResidueNum();
                                    residueNum = scheduleTransferOrderResp.getResidueNum();
                                    if (residueNum != null) {
                                        iIntValue3 = residueNum.intValue();
                                    } else {
                                        iIntValue3 = 0;
                                    }
                                    spanUtilsAppendLine.append(successNum3 + " " + str + " Completed, " + residueNum2 + " " + (iIntValue3 > 1 ? "Transfers" : "Transfer") + " Remaining").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, scheduleTransferOrderDetailActivity3)).setFontSize(12, true);
                                }
                                vVarO = scheduleTransferOrderDetailActivity3.o();
                                if (vVarO != null) {
                                    vVarO.f40522d.setText(spanUtilsAppendLine.create());
                                }
                            } else {
                                Integer residueNum3 = scheduleTransferOrderResp.getResidueNum();
                                if ((residueNum3 != null ? residueNum3.intValue() : 0) > 0) {
                                    spanUtilsAppendLine = new SpanUtils().appendLine(scheduleTransferOrderDetailActivity3.getString(h.sm_transfer_history));
                                    transferNum = scheduleTransferOrderResp.getTransferNum();
                                    if (transferNum != null) {
                                        iIntValue = transferNum.intValue();
                                    } else {
                                        iIntValue = 0;
                                    }
                                    if (iIntValue > 0) {
                                        Integer successNum4 = scheduleTransferOrderResp.getSuccessNum();
                                        successNum = scheduleTransferOrderResp.getSuccessNum();
                                        if (successNum != null) {
                                            iIntValue2 = successNum.intValue();
                                        } else {
                                            iIntValue2 = 0;
                                        }
                                        if (iIntValue2 > 1) {
                                            str = "Transfers";
                                        } else {
                                            str = "Transfer";
                                        }
                                        Integer residueNum4 = scheduleTransferOrderResp.getResidueNum();
                                        residueNum = scheduleTransferOrderResp.getResidueNum();
                                        if (residueNum != null) {
                                            iIntValue3 = residueNum.intValue();
                                        } else {
                                            iIntValue3 = 0;
                                        }
                                        if (iIntValue3 > 1) {
                                        }
                                        spanUtilsAppendLine.append(successNum4 + " " + str + " Completed, " + residueNum4 + " " + (iIntValue3 > 1 ? "Transfers" : "Transfer") + " Remaining").setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextNormal, scheduleTransferOrderDetailActivity3)).setFontSize(12, true);
                                    }
                                    vVarO = scheduleTransferOrderDetailActivity3.o();
                                    if (vVarO != null) {
                                        vVarO.f40522d.setText(spanUtilsAppendLine.create());
                                    }
                                }
                            }
                            Integer taskStatus = scheduleTransferOrderResp.getTaskStatus();
                            if (taskStatus != null && taskStatus.intValue() == 1) {
                                d dVar = (d) scheduleTransferOrderDetailActivity3.f27334c;
                                if (dVar != null) {
                                    p220oa.h.C(dVar.f40324c);
                                }
                            } else if (taskStatus != null && taskStatus.intValue() == 3) {
                                d dVar2 = (d) scheduleTransferOrderDetailActivity3.f27334c;
                                if (dVar2 != null) {
                                    p220oa.h.c(dVar2.f40324c);
                                }
                            } else {
                                d dVar3 = (d) scheduleTransferOrderDetailActivity3.f27334c;
                                if (dVar3 != null) {
                                    p220oa.h.c(dVar3.f40324c);
                                }
                            }
                        }
                    } else {
                        p220oa.h.x(scheduleTransferOrderDetailActivity3, commonBeanResult.getRespMsg());
                    }
                } else if (it instanceof m) {
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it2).f27360a;
                    if (commonBeanResult2.isSuccess()) {
                        ScheduleTransferDetailOrderResp scheduleTransferDetailOrderResp = (ScheduleTransferDetailOrderResp) commonBeanResult2.data;
                        if (scheduleTransferDetailOrderResp != null) {
                            int i11 = ScheduleTransferOrderDetailActivity.f33409p;
                            List<ScheduleTransferSubOrderResp> historyTransferList = scheduleTransferDetailOrderResp.getHistoryTransferList();
                            if (historyTransferList != null) {
                                if (scheduleTransferOrderDetailActivity.f33411e == 1) {
                                    scheduleTransferOrderDetailActivity.n().setList(historyTransferList);
                                } else {
                                    scheduleTransferOrderDetailActivity.n().addData((Collection<Object>) historyTransferList);
                                }
                                c loadMoreModule = scheduleTransferOrderDetailActivity.n().getLoadMoreModule();
                                List<ScheduleTransferSubOrderResp> historyTransferList2 = scheduleTransferDetailOrderResp.getHistoryTransferList();
                                int size = historyTransferList2 != null ? historyTransferList2.size() : 0;
                                Intrinsics.checkNotNullParameter(loadMoreModule, "<this>");
                                if (10 > size) {
                                    loadMoreModule.g();
                                } else {
                                    loadMoreModule.f();
                                }
                            }
                            if (scheduleTransferDetailOrderResp.getLastTransfer() == null || scheduleTransferDetailOrderResp.getNextTransfer() == null) {
                                if (scheduleTransferDetailOrderResp.getLastTransfer() != null) {
                                    viewInflate = scheduleTransferOrderDetailActivity.getLayoutInflater().inflate(f.sm_layout_schedule_transfer_detail_top_single, (ViewGroup) null);
                                    ((TextView) viewInflate.findViewById(e.tvTitle)).setText(r0.H0(h.sm_last_transfer));
                                    TextView textView2 = (TextView) viewInflate.findViewById(e.tvTime);
                                    ScheduleTransferSubOrderResp lastTransfer = scheduleTransferDetailOrderResp.getLastTransfer();
                                    textView2.setText(r0.S((lastTransfer == null || (gmtModified2 = lastTransfer.getGmtModified()) == null) ? 0L : gmtModified2.longValue()));
                                    ScheduleTransferSubOrderResp lastTransfer2 = scheduleTransferDetailOrderResp.getLastTransfer();
                                    if (lastTransfer2 != null && (transferStatusIcon = lastTransfer2.getTransferStatusIcon()) != null) {
                                        String str2 = TextUtils.isEmpty(transferStatusIcon) ? null : transferStatusIcon;
                                        if (str2 != null) {
                                            r0.l1(str2, (ImageView) viewInflate.findViewById(e.ivStatus));
                                        }
                                    }
                                } else if (scheduleTransferDetailOrderResp.getNextTransfer() != null) {
                                    viewInflate2 = scheduleTransferOrderDetailActivity.getLayoutInflater().inflate(f.sm_layout_schedule_transfer_detail_top_single, (ViewGroup) null);
                                    ((TextView) viewInflate2.findViewById(e.tvTitle)).setText(r0.H0(h.sm_upcoming_transfer));
                                    TextView textView3 = (TextView) viewInflate2.findViewById(e.tvTime);
                                    ScheduleTransferSubOrderResp nextTransfer = scheduleTransferDetailOrderResp.getNextTransfer();
                                    textView3.setText(r0.O((nextTransfer == null || (gmtModified = nextTransfer.getGmtModified()) == null) ? 0L : gmtModified.longValue()));
                                }
                                if (viewInflate2 != null && (vVarO2 = scheduleTransferOrderDetailActivity.o()) != null) {
                                    vVarO2.f40521c.addView(viewInflate2);
                                }
                            } else {
                                viewInflate = scheduleTransferOrderDetailActivity.getLayoutInflater().inflate(f.sm_layout_schedule_transfer_detail_top_twice, (ViewGroup) null);
                                TextView textView4 = (TextView) viewInflate.findViewById(e.tvDate1);
                                ScheduleTransferSubOrderResp lastTransfer3 = scheduleTransferDetailOrderResp.getLastTransfer();
                                textView4.setText(r0.S((lastTransfer3 == null || (gmtModified5 = lastTransfer3.getGmtModified()) == null) ? 0L : gmtModified5.longValue()));
                                ScheduleTransferSubOrderResp lastTransfer4 = scheduleTransferDetailOrderResp.getLastTransfer();
                                if (lastTransfer4 != null && (transferStatusIcon2 = lastTransfer4.getTransferStatusIcon()) != null) {
                                    String str3 = TextUtils.isEmpty(transferStatusIcon2) ? null : transferStatusIcon2;
                                    if (str3 != null) {
                                        r0.l1(str3, (ImageView) viewInflate.findViewById(e.ivStatus));
                                    }
                                }
                                TextView textView5 = (TextView) viewInflate.findViewById(e.tvDate2);
                                ScheduleTransferSubOrderResp nextTransfer2 = scheduleTransferDetailOrderResp.getNextTransfer();
                                textView5.setText(r0.S((nextTransfer2 == null || (gmtModified4 = nextTransfer2.getGmtModified()) == null) ? 0L : gmtModified4.longValue()));
                                TextView textView6 = (TextView) viewInflate.findViewById(e.tvTime2);
                                ScheduleTransferSubOrderResp nextTransfer3 = scheduleTransferDetailOrderResp.getNextTransfer();
                                G.x("at ", TimeUtils.millis2String((nextTransfer3 == null || (gmtModified3 = nextTransfer3.getGmtModified()) == null) ? 0L : gmtModified3.longValue(), new SimpleDateFormat("h:mm aa", Locale.ENGLISH)), textView6);
                            }
                            viewInflate2 = viewInflate;
                            if (viewInflate2 != null) {
                                vVarO2.f40521c.addView(viewInflate2);
                            }
                        }
                    } else {
                        p220oa.h.x(scheduleTransferOrderDetailActivity, commonBeanResult2.getRespMsg());
                    }
                } else if (it2 instanceof m) {
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((p) it3).f27360a;
                    if (commonResult.isSuccess()) {
                        scheduleTransferOrderDetailActivity.finish();
                        ToastUtils.showLong("Successfully Cancelled", new Object[0]);
                    } else {
                        p220oa.h.x(scheduleTransferOrderDetailActivity, commonResult.getRespMsg());
                    }
                } else if (it3 instanceof m) {
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    scheduleTransferOrderDetailActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    ((n) it3).getClass();
                }
                return Unit.f38893a;
        }
    }
}
