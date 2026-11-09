package Me;

import C0.G;
import Fe.I;
import Pa.C0525w;
import Pa.F;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.HeadlineCardTemplateRender;
import com.transsnet.palmpay.main.export.bean.rsp.HomeTaskCenterRsp;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.util.ActivityUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f5951p = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewStub f5952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f5953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bc.i f5954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f5955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HomeTaskCenterRsp f5956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f5957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f5958g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.camera.core.impl.utils.futures.i f5959i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f5960j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f5961o;

    public c(ViewStub viewStub, HomeFragmentHomeTab homeFragmentHomeTab) {
        this.f5952a = viewStub;
        this.f5955d = new WeakReference(homeFragmentHomeTab);
    }

    public static void a(TextView textView, Integer num, int i7) {
        if (textView == null) {
            return;
        }
        textView.setTextColor(num != null ? num.intValue() : textView.getContext().getColor(i7));
    }

    public static Integer c(String str, String str2, boolean z3) {
        String strD = d(str, str2, z3);
        if (strD == null || strD.length() == 0) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(strD));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(String str, String str2, boolean z3) {
        if (z3) {
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    return str;
                }
            }
            if (str2 != null && str2.length() > 0) {
                return str2;
            }
        } else if (str2 != null && str2.length() > 0) {
            return str2;
        }
        return null;
    }

    public final void b() {
        androidx.camera.core.impl.utils.futures.i iVar = this.f5959i;
        if (iVar != null) {
            this.f5958g.removeCallbacks(iVar);
        }
        this.f5959i = null;
        this.f5960j = null;
        this.f5961o = null;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x02ff  */
    public final boolean e(HomeTaskCenterRsp homeTaskCenterRsp, boolean z3) {
        if (Intrinsics.c(homeTaskCenterRsp, this.f5956e) && Boolean.valueOf(z3).equals(this.f5957f)) {
            View view = this.f5953b;
            if (view != null && view.getVisibility() == 0) {
                return true;
            }
        } else {
            this.f5956e = homeTaskCenterRsp;
            this.f5957f = Boolean.valueOf(z3);
            if (homeTaskCenterRsp == null) {
                b();
                View view2 = this.f5953b;
                if (view2 != null) {
                    p220oa.h.s(view2, false);
                    return false;
                }
            } else {
                C0525w c0525wF = C0525w.f();
                String str = homeTaskCenterRsp.templateConfig;
                c0525wF.getClass();
                HeadlineCardTemplateRender headlineCardTemplateRender = (HeadlineCardTemplateRender) C0525w.d(str, HeadlineCardTemplateRender.class);
                if (headlineCardTemplateRender != null) {
                    if (this.f5953b == null) {
                        ViewStub viewStub = this.f5952a;
                        View viewInflate = viewStub != null ? viewStub.inflate() : null;
                        this.f5953b = viewInflate;
                        if (viewInflate != null) {
                            int i7 = Ac.e.btnAction;
                            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                            if (ppButton != null) {
                                i7 = Ac.e.ivLabelIcon;
                                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                if (iconicsImageView != null) {
                                    i7 = Ac.e.tvExpireBadge;
                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView != null) {
                                        i7 = Ac.e.tvLabel;
                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            i7 = Ac.e.tvSubTitle;
                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView3 != null) {
                                                i7 = Ac.e.tvTitle;
                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView4 != null) {
                                                    this.f5954c = new Bc.i((ViewGroup) viewInflate, (View) ppButton, (Object) iconicsImageView, (View) textView, (View) textView2, (View) textView3, (View) textView4, 3);
                                                    ppButton.setOnClickListener(this);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
                        }
                    }
                    View view3 = this.f5953b;
                    if (view3 != null) {
                        p220oa.h.s(view3, true);
                    }
                    String str2 = headlineCardTemplateRender.labelText;
                    Bc.i iVar = this.f5954c;
                    if (iVar != null) {
                        ((TextView) iVar.f729g).setText(str2 == null ? "" : str2);
                    }
                    Bc.i iVar2 = this.f5954c;
                    if (iVar2 != null) {
                        p220oa.h.s((TextView) iVar2.f729g, !(str2 == null || str2.length() == 0));
                    }
                    Bc.i iVar3 = this.f5954c;
                    a(iVar3 != null ? (TextView) iVar3.f729g : null, c(headlineCardTemplateRender.darkModeLabelTextColor, headlineCardTemplateRender.labelTextColor, z3), L6.b.ppColorSecondary);
                    boolean z8 = str2 == null || str2.length() == 0;
                    Bc.i iVar4 = this.f5954c;
                    if (iVar4 != null) {
                        IconicsImageView iconicsImageView2 = (IconicsImageView) iVar4.f727e;
                        if (z8) {
                            p220oa.h.s(iconicsImageView2, false);
                        } else {
                            p220oa.h.s(iconicsImageView2, true);
                            String strD = d(headlineCardTemplateRender.darkModeLabelIconUrl, headlineCardTemplateRender.labelIconUrl, z3);
                            if (strD == null || strD.length() == 0) {
                                Context context = iconicsImageView2.getContext();
                                Intrinsics.e(context);
                                iconicsImageView2.setImageDrawable(G8.a.x(context, S6.a.pay_LoanFill, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiPrimary, context)), null, 20.0f, 116));
                            } else {
                                r0.l1(strD, iconicsImageView2);
                            }
                        }
                    }
                    Bc.i iVar5 = this.f5954c;
                    if (iVar5 != null) {
                        TextView textView5 = (TextView) iVar5.f730i;
                        String str3 = headlineCardTemplateRender.title;
                        if (str3 == null) {
                            str3 = "";
                        }
                        textView5.setText(str3);
                    }
                    Bc.i iVar6 = this.f5954c;
                    if (iVar6 != null) {
                        TextView textView6 = (TextView) iVar6.f730i;
                        String str4 = headlineCardTemplateRender.title;
                        p220oa.h.s(textView6, !(str4 == null || str4.length() == 0));
                    }
                    Bc.i iVar7 = this.f5954c;
                    a(iVar7 != null ? (TextView) iVar7.f730i : null, c(headlineCardTemplateRender.darkModeTitleColor, headlineCardTemplateRender.titleColor, z3), L6.b.ppColorTextPrimary);
                    Bc.i iVar8 = this.f5954c;
                    if (iVar8 != null) {
                        TextView textView7 = (TextView) iVar8.f725c;
                        String str5 = headlineCardTemplateRender.subTitle;
                        if (str5 == null) {
                            str5 = "";
                        }
                        textView7.setText(str5);
                    }
                    Bc.i iVar9 = this.f5954c;
                    if (iVar9 != null) {
                        TextView textView8 = (TextView) iVar9.f725c;
                        String str6 = headlineCardTemplateRender.subTitle;
                        p220oa.h.s(textView8, !(str6 == null || str6.length() == 0));
                    }
                    Bc.i iVar10 = this.f5954c;
                    a(iVar10 != null ? (TextView) iVar10.f725c : null, c(headlineCardTemplateRender.darkModeSubTitleColor, headlineCardTemplateRender.subTitleColor, z3), L6.b.ppColorTextAssist);
                    Bc.i iVar11 = this.f5954c;
                    if (iVar11 != null) {
                        PpButton ppButton2 = (PpButton) iVar11.f726d;
                        String str7 = headlineCardTemplateRender.buttonText;
                        ppButton2.setText(str7 != null ? str7 : "");
                        String str8 = headlineCardTemplateRender.buttonText;
                        p220oa.h.s(ppButton2, !(str8 == null || str8.length() == 0));
                        Integer numC = c(headlineCardTemplateRender.darkModeButtonTextColor, headlineCardTemplateRender.buttonTextColor, z3);
                        if (numC != null) {
                            ppButton2.setTextColor(numC.intValue());
                        } else {
                            ppButton2.setTextColor(ppButton2.getContext().getColor(L6.b.ppColorButtonTextWhite));
                        }
                        Integer numC2 = c(headlineCardTemplateRender.darkModeButtonColor, headlineCardTemplateRender.buttonColor, z3);
                        if (numC2 != null) {
                            ppButton2.setBackgroundTintList(ColorStateList.valueOf(numC2.intValue()));
                        }
                    }
                    String str9 = headlineCardTemplateRender.buttonBadgeText;
                    Long l5 = headlineCardTemplateRender.earliestValidUntil;
                    b();
                    Bc.i iVar12 = this.f5954c;
                    if (iVar12 != null) {
                        TextView textView9 = (TextView) iVar12.f728f;
                        a(textView9, c(headlineCardTemplateRender.darkModeButtonBadgeTextColor, headlineCardTemplateRender.buttonBadgeTextColor, z3), L6.b.ppColorTextPrimary);
                        Integer numC3 = c(headlineCardTemplateRender.darkModeButtonBadgeColor, headlineCardTemplateRender.buttonBadgeColor, z3);
                        textView9.setBackgroundTintList(ColorStateList.valueOf(numC3 != null ? numC3.intValue() : textView9.getContext().getColor(L6.b.ppColorWarning)));
                        if (str9 == null || str9.length() == 0) {
                            p220oa.h.s(textView9, false);
                        } else if (!StringsKt.A(str9, "{{earliestValidUntil}}", false)) {
                            textView9.setText(str9);
                            p220oa.h.s(textView9, true);
                        } else if (l5 != null) {
                            if (l5.longValue() <= 0 || l5.longValue() <= System.currentTimeMillis()) {
                                p220oa.h.s(textView9, false);
                            } else {
                                this.f5960j = l5;
                                this.f5961o = str9;
                                Context context2 = textView9.getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                                long jLongValue = l5.longValue() - System.currentTimeMillis();
                                long j6 = jLongValue >= 0 ? jLongValue : 0L;
                                b bVar = f5951p;
                                textView9.setText(kotlin.text.y.k(str9, "{{earliestValidUntil}}", bVar.formatCountdown(context2, j6)));
                                p220oa.h.s(textView9, true);
                                androidx.camera.core.impl.utils.futures.i iVar13 = new androidx.camera.core.impl.utils.futures.i(7, textView9, this);
                                this.f5959i = iVar13;
                                this.f5958g.postDelayed(iVar13, bVar.nextExpireRefreshDelay(l5.longValue() - System.currentTimeMillis()));
                            }
                        } else {
                            p220oa.h.s(textView9, false);
                        }
                    }
                    n0 n0VarG = n0.g();
                    ViewEvent viewEventAdd = new ViewEvent("Home_TaskCenter_View").add("Type", "Template");
                    String str10 = homeTaskCenterRsp.tagId;
                    if (str10 == null) {
                        str10 = "unknown";
                    }
                    n0VarG.u(viewEventAdd.add("tagId", str10));
                    return true;
                }
                b();
                View view4 = this.f5953b;
                if (view4 != null) {
                    p220oa.h.s(view4, false);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        HomeFragmentHomeTab homeFragmentHomeTab;
        I i7;
        PpButton ppButton;
        if (r0.U0()) {
            return;
        }
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        Bc.i iVar = this.f5954c;
        if (Intrinsics.c(numValueOf, (iVar == null || (ppButton = (PpButton) iVar.f726d) == null) ? null : Integer.valueOf(ppButton.getId()))) {
            HomeTaskCenterRsp homeTaskCenterRsp = this.f5956e;
            if (homeTaskCenterRsp != null && (str2 = homeTaskCenterRsp.androidUrl) != null) {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    WeakReference weakReference = this.f5955d;
                    if (weakReference != null && (homeFragmentHomeTab = (HomeFragmentHomeTab) weakReference.get()) != null && (i7 = (I) homeFragmentHomeTab.f27328i) != null) {
                        i7.f2737e = true;
                    }
                    View view2 = this.f5953b;
                    ActivityUtils.startActivity(F.a(view2 != null ? view2.getContext() : null, str2));
                }
            }
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = (ClickEvent) G.f("Home_TaskCenter_Click", "Type", "Template");
            HomeTaskCenterRsp homeTaskCenterRsp2 = this.f5956e;
            String str3 = homeTaskCenterRsp2 != null ? homeTaskCenterRsp2.androidUrl : null;
            if (str3 == null) {
                str3 = "";
            }
            ClickEvent clickEventAdd = clickEvent.add(FirebaseAnalytics.Param.CONTENT, str3);
            HomeTaskCenterRsp homeTaskCenterRsp3 = this.f5956e;
            if (homeTaskCenterRsp3 == null || (str = homeTaskCenterRsp3.tagId) == null) {
                str = "unknown";
            }
            n0VarG.k(clickEventAdd.add("tagId", str));
        }
    }
}
