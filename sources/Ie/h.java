package Ie;

import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.ContentLoadingProgressBar;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.main.export.bean.rsp.AssetBannerBean;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f4342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ContentLoadingProgressBar f4343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bc.f f4344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bc.k f4345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f4346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f4347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetBannerBean f4348g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f4350j;

    public static float a(h hVar, String html) {
        String strGroup;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(html, "html");
        try {
            Matcher matcher = Pattern.compile("font-size\\s*[:：]\\s*(\\d+)(?:px)?").matcher(html);
            if (!matcher.find() || (strGroup = matcher.group(1)) == null) {
                return 10.0f;
            }
            return Float.parseFloat(strGroup);
        } catch (Exception unused) {
            return 10.0f;
        }
    }

    public static boolean b(String str) {
        if (BaseApplication.hasLogin()) {
            return false;
        }
        if (str == null || TextUtils.isEmpty(i0.y())) {
            str = null;
        }
        i0.K(null, str);
        return true;
    }

    public final void c(boolean z3) {
        F6.d.h("HomeAccountBarHandler", 3, d0.q("isRefreshing: ", z3));
        boolean zHasLogin = BaseApplication.hasLogin();
        Bc.f fVar = this.f4344c;
        if (!zHasLogin) {
            ContentLoadingProgressBar contentLoadingProgressBar = this.f4343b;
            if (contentLoadingProgressBar != null) {
                p220oa.h.s(contentLoadingProgressBar, false);
            }
            if (fVar != null) {
                ((TextView) fVar.f700f).setText("****");
            }
            e(true);
            this.f4349i = z3;
            return;
        }
        boolean zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
        if (z3) {
            if (this.f4343b == null) {
                Bc.f fVar2 = this.f4344c;
                View viewInflate = fVar2 != null ? ((ViewStub) fVar2.f696b).inflate() : null;
                this.f4343b = viewInflate != null ? (ContentLoadingProgressBar) viewInflate.findViewById(Ac.e.loadingView) : null;
            }
            ContentLoadingProgressBar contentLoadingProgressBar2 = this.f4343b;
            if (contentLoadingProgressBar2 != null) {
                p220oa.h.s(contentLoadingProgressBar2, true);
            }
        }
        if (zIsNetworkOffline) {
            if (fVar != null) {
                ((TextView) fVar.f700f).setText("--");
            }
            this.f4350j = null;
        }
        e(!zIsNetworkOffline);
        this.f4349i = z3;
    }

    public final void d(long j6) {
        boolean zHasLogin = BaseApplication.hasLogin();
        boolean z3 = !zHasLogin;
        boolean zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
        boolean z8 = !zIsNetworkOffline;
        boolean z10 = zHasLogin && p059e1.a.C("main_sp_show_balance", false);
        f fVar = new f();
        fVar.f4336a = z8;
        fVar.f4337b = z10;
        fVar.f4338c = j6;
        fVar.f4339d = z3;
        if (fVar.equals(this.f4350j)) {
            ContentLoadingProgressBar contentLoadingProgressBar = this.f4343b;
            if (contentLoadingProgressBar != null) {
                p220oa.h.s(contentLoadingProgressBar, this.f4349i && zHasLogin);
                return;
            }
            return;
        }
        this.f4350j = fVar;
        Bc.f fVar2 = this.f4344c;
        View view = this.f4342a;
        if (zHasLogin) {
            if (fVar2 != null) {
                ((IconicsTextView) fVar2.f703j).setOnClickListener(null);
            }
            if (fVar2 != null) {
                ((IconicsTextView) fVar2.f703j).setClickable(false);
            }
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (view != null) {
                view.setClickable(false);
            }
        } else {
            if (fVar2 != null) {
                ((IconicsTextView) fVar2.f703j).setOnClickListener(this);
            }
            if (view != null) {
                view.setOnClickListener(this);
            }
        }
        if (fVar2 != null) {
            p220oa.h.s((AppCompatImageView) fVar2.f699e, zHasLogin);
        }
        CharSequence charSequenceB = "****";
        if (!zHasLogin) {
            if (fVar2 != null) {
                ((TextView) fVar2.f700f).setText("****");
            }
            View view2 = this.f4347f;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            ContentLoadingProgressBar contentLoadingProgressBar2 = this.f4343b;
            if (contentLoadingProgressBar2 != null) {
                p220oa.h.s(contentLoadingProgressBar2, false);
            }
            e(true);
            return;
        }
        if (z10) {
            if (fVar2 != null) {
                ((AppCompatImageView) fVar2.f699e).setImageResource(com.transsnet.palmpay.custom_view.r.cv_icon_eye_opened);
            }
        } else if (fVar2 != null) {
            ((AppCompatImageView) fVar2.f699e).setImageResource(com.transsnet.palmpay.custom_view.r.cv_icon_eye_closed);
        }
        if (fVar2 != null) {
            TextView textView = (TextView) fVar2.f700f;
            CharSequence charSequence = "--";
            if (!zIsNetworkOffline) {
                if (com.palmpay.lib.apm.launchcounter.util.d.f23793a == null) {
                    com.palmpay.lib.apm.launchcounter.util.d.f23793a = -1L;
                }
                Long l5 = com.palmpay.lib.apm.launchcounter.util.d.f23793a;
                Intrinsics.e(l5);
                long jLongValue = l5.longValue();
                String str = com.palmpay.lib.apm.launchcounter.util.d.f23794b;
                if (z10) {
                    if (TextUtils.isEmpty(str)) {
                        charSequenceB = jLongValue < 0 ? "--" : r0.B(jLongValue, true);
                        Intrinsics.e(charSequenceB);
                    } else {
                        SpanUtils spanUtils = new SpanUtils();
                        Intrinsics.e(str);
                        charSequenceB = spanUtils.append(str).setFontFamily("sans-serif").create();
                        Intrinsics.checkNotNullExpressionValue(charSequenceB, "create(...)");
                    }
                }
                charSequence = charSequenceB;
            }
            textView.setText(charSequence);
        }
        if (this.f4349i && this.f4343b == null) {
            Bc.f fVar3 = this.f4344c;
            View viewInflate = fVar3 != null ? ((ViewStub) fVar3.f696b).inflate() : null;
            this.f4343b = viewInflate != null ? (ContentLoadingProgressBar) viewInflate.findViewById(Ac.e.loadingView) : null;
        }
        ContentLoadingProgressBar contentLoadingProgressBar3 = this.f4343b;
        if (contentLoadingProgressBar3 != null) {
            p220oa.h.s(contentLoadingProgressBar3, this.f4349i);
        }
        e(z8);
    }

    public final void e(boolean z3) {
        TextView textView;
        TextView textView2;
        Group group;
        Bc.f fVar = this.f4344c;
        if (fVar != null && (group = (Group) fVar.f698d) != null) {
            p220oa.h.s(group, !z3);
        }
        if (z3) {
            return;
        }
        if (!TextUtils.isEmpty((fVar == null || (textView2 = (TextView) fVar.f702i) == null) ? null : textView2.getText()) || fVar == null || (textView = (TextView) fVar.f702i) == null) {
            return;
        }
        textView.setText(Ac.h.main_not_network_amount_tips);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (Intrinsics.c(view, this.f4342a)) {
            b(null);
            return;
        }
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = Ac.e.tvAmount;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            n0.g().k(new ClickEvent("home_page_element_click").afEvt(false).add("module_name", "Balance amount"));
            if (b("/main/my_assets_page")) {
                return;
            }
            com.palmpay.lib.apm.launchcounter.util.d.F("/main/my_assets_page");
            return;
        }
        int i10 = Ac.e.tvTitle;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            b("/main/my_assets_page");
            return;
        }
        int i11 = Ac.e.tvFund;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            n0.g().k(new ClickEvent("home_page_element_click").afEvt(false).add("module_name", "Fund"));
            if (b("/cashin_out/add_money")) {
                return;
            }
            com.palmpay.lib.apm.launchcounter.util.d.I(536870912, "/cashin_out/add_money");
            return;
        }
        int i12 = Ac.e.tvTransHistory;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            n0.g().q(new ClickEvent("Home_TXNHistory_Click"));
            if (b("/main/trans_history")) {
                return;
            }
            com.palmpay.lib.apm.launchcounter.util.d.F("/main/trans_history");
            return;
        }
        int i13 = Ac.e.ivEye;
        if (numValueOf != null && numValueOf.intValue() == i13 && BaseApplication.hasLogin()) {
            p059e1.a.X("main_sp_show_balance", !p059e1.a.C("main_sp_show_balance", false));
            if (com.palmpay.lib.apm.launchcounter.util.d.f23793a == null) {
                com.palmpay.lib.apm.launchcounter.util.d.f23793a = -1L;
            }
            Long l5 = com.palmpay.lib.apm.launchcounter.util.d.f23793a;
            Intrinsics.e(l5);
            d(l5.longValue());
            n0.g().k(new ClickEvent("home_page_element_click").afEvt(false).add("module_name", "Balance"));
            r0.P1(MessageEvent.EVENT_BALANCE_SECURITY_STATE_CHANGE);
        }
    }
}
