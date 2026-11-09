package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferCreateResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankAccountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayHomeActivity;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.Nullable;
import p141j9.C1798f;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p223od.b;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/schedule_transfer_create_result")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferCreateResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferViewModel;", "Lod/b;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferCreateResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferCreateResultActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferCreateResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1#2:153\n1869#3,2:154\n1869#3,2:156\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferCreateResultActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferCreateResultActivity\n*L\n128#1:154,2\n135#1:156,2\n*E\n"})
public final class ScheduleTransferCreateResultActivity extends BaseMvvmVBActivity<ScheduleTransferViewModel, b> implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ArrayList f33370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ArrayList f33371f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduleTransferCreateResp f33372d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f33370e = C1850q.e(TransferToBankAccountActivity.class, TransferToPalmPayHomeActivity.class);
        f33371f = C1850q.e(ScheduleTransferCreateActivity.class, ScheduleTransferCreateV2Activity.class, ScheduleTransferHomeActivity.class, ScheduleTransferOrderDetailActivity.class, ScheduleTransferPaymentSelectActivity.class);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(f.sm_activity_schedule_transfer_create_result, (ViewGroup) null, false);
        int i7 = e.fl_bottom;
        FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
        if (frameLayout != null) {
            i7 = e.itvNextOrder;
            IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
            if (iconicsTextView != null) {
                i7 = e.iv_success;
                if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.tv_account;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = e.tv_amount;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = e.tv_bank;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                i7 = e.tv_complete;
                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView4 != null) {
                                    i7 = e.tv_name;
                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView5 != null) {
                                        i7 = e.tv_schedule_name;
                                        TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView6 != null) {
                                            i7 = e.tv_schedule_type;
                                            TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView7 != null) {
                                                i7 = e.tv_view_detail;
                                                IconicsTextView iconicsTextView2 = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                if (iconicsTextView2 != null) {
                                                    b bVar = new b((ConstraintLayout) viewInflate, frameLayout, iconicsTextView, textView, textView2, textView3, textView4, textView5, textView6, textView7, iconicsTextView2);
                                                    Intrinsics.checkNotNullExpressionValue(bVar, "inflate(...)");
                                                    return bVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void n() {
        c cVarB = c.b();
        TransactionEvent transactionEvent = new TransactionEvent();
        transactionEvent.setSendAgain(false);
        cVarB.f(transactionEvent);
        for (Class cls : f33370e) {
            if (ActivityUtils.isActivityExistsInStack((Class<?>) cls)) {
                ActivityUtils.finishToActivity((Class<?>) cls, false);
                finish();
                return;
            }
        }
        for (Class cls2 : f33371f) {
            if (ActivityUtils.isActivityExistsInStack((Class<?>) cls2)) {
                ActivityUtils.finishActivity((Class<?>) cls2, false);
            }
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        n();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        ScheduleTransferCreateResp scheduleTransferCreateResp;
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = e.tv_complete;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            n();
            return;
        }
        int i10 = e.tv_view_detail;
        if (numValueOf == null || numValueOf.intValue() != i10 || (scheduleTransferCreateResp = this.f33372d) == null) {
            return;
        }
        ARouter.getInstance().build("/sm/schedule_transfer_order_detail").withString("orderId", scheduleTransferCreateResp.getTaskNo()).navigation();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String str;
        super.setupView();
        ARouter.getInstance().inject(this);
        b bVar = (b) this.f27334c;
        if (bVar != null) {
            bVar.f40304g.setOnClickListener(this);
        }
        b bVar2 = (b) this.f27334c;
        if (bVar2 != null) {
            bVar2.f40308p.setOnClickListener(this);
        }
        ScheduleTransferCreateResp scheduleTransferCreateResp = this.f33372d;
        if (scheduleTransferCreateResp != null) {
            b bVar3 = (b) this.f27334c;
            if (bVar3 != null) {
                bVar3.f40305i.setText(scheduleTransferCreateResp.getPayeeName());
            }
            Integer type = scheduleTransferCreateResp.getType();
            if (type != null && type.intValue() == 1) {
                b bVar4 = (b) this.f27334c;
                if (bVar4 != null) {
                    TextView textView = bVar4.f40301d;
                    String payeePhone = scheduleTransferCreateResp.getPayeePhone();
                    textView.setText(payeePhone != null ? r0.w(payeePhone) : null);
                }
                b bVar5 = (b) this.f27334c;
                if (bVar5 != null) {
                    bVar5.f40303f.setText(getString(h.sm_schedule_result_palmpay));
                }
            } else {
                b bVar6 = (b) this.f27334c;
                if (bVar6 != null) {
                    bVar6.f40301d.setText(scheduleTransferCreateResp.getPayeeBankNo());
                }
                b bVar7 = (b) this.f27334c;
                if (bVar7 != null) {
                    bVar7.f40303f.setText(scheduleTransferCreateResp.getPayeeBankName());
                }
            }
            b bVar8 = (b) this.f27334c;
            if (bVar8 != null) {
                IconicsTextView iconicsTextView = bVar8.f40300c;
                SpanUtils spanUtils = new SpanUtils();
                IconicsDrawable iconicsDrawable = new IconicsDrawable(this, S6.a.pay_Schedule);
                iconicsDrawable.a(new C1798f(this, 21));
                SpanUtils spanUtilsAppendImage = spanUtils.appendImage(iconicsDrawable);
                int i7 = h.sm_schedule_result_upcoming;
                Long nextExecuteDate = scheduleTransferCreateResp.getNextExecuteDate();
                iconicsTextView.setText(spanUtilsAppendImage.append(" " + getString(i7, r0.S(nextExecuteDate != null ? nextExecuteDate.longValue() : 0L))).create());
            }
            b bVar9 = (b) this.f27334c;
            if (bVar9 != null) {
                TextView textView2 = bVar9.f40302e;
                Long businessAmount = scheduleTransferCreateResp.getBusinessAmount();
                textView2.setText(r0.B(businessAmount != null ? businessAmount.longValue() : 0L, false));
            }
            b bVar10 = (b) this.f27334c;
            if (bVar10 != null) {
                TextView textView3 = bVar10.f40306j;
                SimpleDateFormat simpleDateFormat = Jd.b.f4773a;
                Integer taskType = scheduleTransferCreateResp.getTaskType();
                int iIntValue = taskType != null ? taskType.intValue() : 0;
                if (iIntValue == 1) {
                    str = "Once Transfer";
                } else if (iIntValue == 3) {
                    str = "Weekly Transfer";
                } else {
                    str = iIntValue == 4 ? "Monthly Transfer" : "Daily Transfer";
                }
                textView3.setText(str);
            }
            b bVar11 = (b) this.f27334c;
            if (bVar11 != null) {
                TextView textView4 = bVar11.f40307o;
                SimpleDateFormat simpleDateFormat2 = Jd.b.f4773a;
                Integer taskType2 = scheduleTransferCreateResp.getTaskType();
                int iIntValue2 = taskType2 != null ? taskType2.intValue() : 0;
                Long taskStartDate = scheduleTransferCreateResp.getTaskStartDate();
                textView4.setText(Jd.b.g(iIntValue2, taskStartDate != null ? taskStartDate.longValue() : 0L, true));
            }
        }
    }
}
