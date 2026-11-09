package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.h;
import Bc.s;
import C0.G;
import F6.d;
import L6.b;
import Pa.n0;
import Pa.r0;
import Pe.z0;
import T8.f;
import V8.w;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.MemberAddressBean;
import com.transsnet.palmpay.core.bean.bill.TransHistroyDownReq;
import com.transsnet.palmpay.core.dialog.DayPickDialog;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.TransactionHistoryViewModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p052da.ViewOnClickListenerC1649v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/TransactionHistoryDownloadFilterActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/TransactionHistoryViewModel;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "view", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionHistoryDownloadFilterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryDownloadFilterActivity.kt\ncom/transsnet/palmpay/ui/activity/TransactionHistoryDownloadFilterActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,368:1\n115#2,8:369\n145#2:377\n*S KotlinDebug\n*F\n+ 1 TransactionHistoryDownloadFilterActivity.kt\ncom/transsnet/palmpay/ui/activity/TransactionHistoryDownloadFilterActivity\n*L\n322#1:369,8\n322#1:377\n*E\n"})
public final class TransactionHistoryDownloadFilterActivity extends BaseMvvmActivity<TransactionHistoryViewModel> implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f34581B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MemberAddressBean f34582A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f34583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f34586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f34587g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f34589j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f34590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DayPickDialog f34591p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f34592v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f34593w;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) l();
        l lVar = transactionHistoryViewModel != null ? transactionHistoryViewModel.f35406f : null;
        if (lVar != null) {
            lVar.e(this, new f(new w(this, 12), 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundDark), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(Ac.f.main_activity_transaction_download_filter, (ViewGroup) null, false);
        int i7 = e.checkAddress;
        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) p059e1.a.m(i7, viewInflate);
        if (iconicsCheckBox != null) {
            i7 = e.llBillType;
            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
            if (linearLayout != null) {
                i7 = e.llMyAddress;
                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.llStartDate;
                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.llStartEnd;
                        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = e.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                i7 = e.tv3Month;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = e.tvConfirm;
                                    PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                                    if (ppButton != null) {
                                        i7 = e.tvEndDate;
                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            i7 = e.tvIO;
                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView3 != null) {
                                                i7 = e.tvLastMonth;
                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView4 != null) {
                                                    i7 = e.tvMoneyIn;
                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView5 != null) {
                                                        i7 = e.tvMoneyOut;
                                                        TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                        if (textView6 != null) {
                                                            i7 = e.tvMonthCustomize;
                                                            TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                            if (textView7 != null) {
                                                                i7 = e.tvMyAddress;
                                                                TextView textView8 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView8 != null) {
                                                                    i7 = e.tvStartDate;
                                                                    TextView textView9 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView9 != null) {
                                                                        i7 = e.tvType;
                                                                        TextView textView10 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                        if (textView10 != null) {
                                                                            i7 = e.tvTypeCustomize;
                                                                            TextView textView11 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView11 != null) {
                                                                                i7 = e.viewContainer;
                                                                                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                    i7 = e.viewDate;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                                    if (linearLayout2 != null) {
                                                                                        i7 = e.viewIO;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                                        if (linearLayout3 != null) {
                                                                                            s sVar = new s((LinearLayout) viewInflate, iconicsCheckBox, linearLayout, ppTitleBar, textView, ppButton, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, linearLayout2, linearLayout3);
                                                                                            this.f34583c = sVar;
                                                                                            return sVar;
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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        Calendar calendar = Calendar.getInstance();
        this.f34587g = calendar.getTimeInMillis();
        int i7 = this.f34584d;
        if (i7 == 0) {
            Date time = calendar.getTime();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(time);
            calendar2.add(2, -1);
            this.f34586f = calendar2.getTimeInMillis();
        } else if (i7 == 1) {
            Date time2 = calendar.getTime();
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(time2);
            calendar3.add(2, -3);
            this.f34586f = calendar3.getTimeInMillis();
        }
        s sVar = this.f34583c;
        if (sVar != null) {
            sVar.f835c.setText(r0.S(this.f34587g));
        }
        s sVar2 = this.f34583c;
        if (sVar2 != null) {
            sVar2.f842o.setText(r0.S(this.f34586f));
        }
    }

    public final void n() {
        s sVar = this.f34583c;
        if (sVar != null) {
            LinearLayout linearLayout = (LinearLayout) sVar.f844v;
            int childCount = linearLayout.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                linearLayout.getChildAt(i7).setSelected(i7 == this.f34585e);
                i7++;
            }
        }
    }

    public final void o() {
        s sVar = this.f34583c;
        if (sVar != null) {
            LinearLayout linearLayout = (LinearLayout) sVar.f845w;
            int childCount = linearLayout.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                linearLayout.getChildAt(i7).setSelected(i7 == this.f34584d);
                i7++;
            }
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        TextView textView;
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("key") : null;
            String stringExtra2 = intent != null ? intent.getStringExtra("value") : null;
            d.h("selectValue", 3, G.o("selectValue ", stringExtra2));
            this.f34585e = 0;
            s sVar = this.f34583c;
            if (sVar != null && (textView = sVar.f843p) != null) {
                textView.setText(stringExtra);
            }
            this.f34588i = stringExtra2;
            n();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = e.tvType;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            Bundle bundle = new Bundle();
            s sVar = this.f34583c;
            bundle.putString("key", String.valueOf(sVar != null ? sVar.f843p.getText() : null));
            bundle.putString("value", this.f34588i);
            TransactionHistoryDownloadFilterTypeActivity.f34594f.startAct(this, HomeDialogState.PRIORITY_HIGHEST_111, bundle);
            return;
        }
        int i10 = e.tvTypeCustomize;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            this.f34585e = 1;
            this.f34588i = "";
            s sVar2 = this.f34583c;
            if (sVar2 != null) {
                sVar2.f843p.setText(getResources().getText(h.main_all));
            }
            n();
            return;
        }
        int i11 = e.tvIO;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            this.f34589j = 0;
            p();
            return;
        }
        int i12 = e.tvMoneyIn;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            this.f34589j = 1;
            p();
            return;
        }
        int i13 = e.tvMoneyOut;
        if (numValueOf != null && numValueOf.intValue() == i13) {
            this.f34589j = 2;
            p();
            return;
        }
        int i14 = e.tvLastMonth;
        if (numValueOf != null && numValueOf.intValue() == i14) {
            this.f34584d = 0;
            o();
            m();
            return;
        }
        int i15 = e.tv3Month;
        if (numValueOf != null && numValueOf.intValue() == i15) {
            this.f34584d = 1;
            o();
            m();
            return;
        }
        int i16 = e.tvMonthCustomize;
        if (numValueOf != null && numValueOf.intValue() == i16) {
            this.f34584d = 2;
            o();
            m();
            return;
        }
        int i17 = e.tvConfirm;
        if (numValueOf != null && numValueOf.intValue() == i17) {
            n0.g().m("TranscationHistoryDownload", "TXNHistoryDL_Continue", "");
            if (this.f34586f > this.f34587g) {
                ToastUtils.showShort(getResources().getString(h.main_duration_check), new Object[0]);
                return;
            }
            TransHistroyDownReq transHistroyDownReq = new TransHistroyDownReq();
            transHistroyDownReq.beginTime = this.f34586f;
            transHistroyDownReq.endTime = this.f34587g;
            transHistroyDownReq.inOutFlag = this.f34589j;
            transHistroyDownReq.transType = this.f34588i;
            s sVar3 = this.f34583c;
            ARouter.getInstance().build("/main/trans_history_down_load").withParcelable("extra_data", transHistroyDownReq).withInt("includeAddress", (sVar3 == null || !((IconicsCheckBox) sVar3.f829B).isChecked()) ? 0 : 1).navigation();
            return;
        }
        int i18 = e.tvStartDate;
        if (numValueOf != null && numValueOf.intValue() == i18) {
            this.f34590o = 0;
            s sVar4 = this.f34583c;
            q(String.valueOf(sVar4 != null ? sVar4.f842o.getText() : null));
            return;
        }
        int i19 = e.tvEndDate;
        if (numValueOf != null && numValueOf.intValue() == i19) {
            this.f34590o = 1;
            s sVar5 = this.f34583c;
            q(String.valueOf(sVar5 != null ? sVar5.f835c.getText() : null));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) l();
        if (transactionHistoryViewModel != null) {
            p140j8.f.s(transactionHistoryViewModel, new z0(1, null), transactionHistoryViewModel.f35406f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void p() {
        s sVar = this.f34583c;
        if (sVar != null) {
            LinearLayout linearLayout = (LinearLayout) sVar.f828A;
            int childCount = linearLayout.getChildCount();
            int i7 = 0;
            while (i7 < childCount) {
                linearLayout.getChildAt(i7).setSelected(i7 == this.f34589j);
                i7++;
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) l();
        if (transactionHistoryViewModel != null) {
            p140j8.f.s(transactionHistoryViewModel, new z0(1, null), transactionHistoryViewModel.f35406f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void q(String str) {
        try {
            long time = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH).parse(str).getTime();
            this.t = r0.h0(time);
            this.f34592v = r0.N0(time);
            this.f34593w = r0.U(time);
        } catch (Exception unused) {
        }
        DayPickDialog dayPickDialog = this.f34591p;
        if (dayPickDialog != null) {
            dayPickDialog.show();
            dayPickDialog.setCanceledOnTouchOutside(true);
            dayPickDialog.setNowPickDate(this.f34592v, this.t, this.f34593w);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        fillDisplayCutOutEdge();
        s sVar = this.f34583c;
        if (sVar != null) {
            ((PpTitleBar) sVar.f830C).setRightImageView1Icon(S6.a.pay_CustomerService);
        }
        s sVar2 = this.f34583c;
        if (sVar2 != null) {
            ((PpTitleBar) sVar2.f830C).setRightImageView1ClickListener(new p054dd.d(11));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.t = r0.h0(jCurrentTimeMillis);
        this.f34592v = r0.N0(jCurrentTimeMillis);
        this.f34593w = r0.U(jCurrentTimeMillis);
        DayPickDialog dayPickDialog = new DayPickDialog(this);
        this.f34591p = dayPickDialog;
        dayPickDialog.setShowConfirmBtn(true);
        DayPickDialog dayPickDialog2 = this.f34591p;
        if (dayPickDialog2 != null) {
            dayPickDialog2.setOnDismissListener(new Dd.b(this, 24));
        }
        s sVar3 = this.f34583c;
        if (sVar3 != null) {
            sVar3.f843p.setOnClickListener(this);
        }
        s sVar4 = this.f34583c;
        if (sVar4 != null) {
            ((TextView) sVar4.f831H).setOnClickListener(this);
        }
        s sVar5 = this.f34583c;
        if (sVar5 != null) {
            sVar5.f836d.setOnClickListener(this);
        }
        s sVar6 = this.f34583c;
        if (sVar6 != null) {
            sVar6.f838f.setOnClickListener(this);
        }
        s sVar7 = this.f34583c;
        if (sVar7 != null) {
            sVar7.f839g.setOnClickListener(this);
        }
        s sVar8 = this.f34583c;
        if (sVar8 != null) {
            sVar8.f837e.setOnClickListener(this);
        }
        s sVar9 = this.f34583c;
        if (sVar9 != null) {
            sVar9.f834b.setOnClickListener(this);
        }
        s sVar10 = this.f34583c;
        if (sVar10 != null) {
            sVar10.f840i.setOnClickListener(this);
        }
        s sVar11 = this.f34583c;
        if (sVar11 != null) {
            sVar11.f842o.setOnClickListener(this);
        }
        s sVar12 = this.f34583c;
        if (sVar12 != null) {
            sVar12.f835c.setOnClickListener(this);
        }
        s sVar13 = this.f34583c;
        if (sVar13 != null) {
            ((PpButton) sVar13.f832L).setOnClickListener(this);
        }
        s sVar14 = this.f34583c;
        if (sVar14 != null) {
            ((IconicsCheckBox) sVar14.f829B).setOnClickListener(new ViewOnClickListenerC1649v(this, 6));
        }
        n();
        p();
        o();
        m();
    }
}
