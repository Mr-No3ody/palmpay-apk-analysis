package p082f9;

import Bc.q;
import F8.c;
import F8.d;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.bean.rsp.UserRawIdNo;
import com.transsnet.palmpay.account.ui.dialog.KycDetailsDialog;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.ui.activity.Z;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import p010a9.m;
import p038ca.e;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseActivity f36423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f36424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f36425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RealNameAuthInfoRsp f36426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UserRawIdNo f36427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36429g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f36430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function0 f36431j;

    public b(ViewStub viewStub, BaseActivity baseActivity) {
        View viewInflate;
        this.f36423a = baseActivity;
        this.f36430i = new WeakReference(baseActivity);
        if (viewStub == null || (viewInflate = viewStub.inflate()) == null) {
            return;
        }
        this.f36424b = viewInflate.getContext();
        int i7 = d.ivBvnHide;
        IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewInflate);
        if (iconicsImageView != null) {
            i7 = d.ivNinHide;
            IconicsImageView iconicsImageView2 = (IconicsImageView) a.m(i7, viewInflate);
            if (iconicsImageView2 != null) {
                i7 = d.tvAccountDetails;
                IconicsImageView iconicsImageView3 = (IconicsImageView) a.m(i7, viewInflate);
                if (iconicsImageView3 != null) {
                    i7 = d.tvBvn;
                    TextView textView = (TextView) a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = d.tvBvnNo;
                        TextView textView2 = (TextView) a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = d.tvBvnVerify;
                            IconicsTextView iconicsTextView = (IconicsTextView) a.m(i7, viewInflate);
                            if (iconicsTextView != null) {
                                i7 = d.tvLinkedIdTitle;
                                TextView textView3 = (TextView) a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    i7 = d.tvNin;
                                    TextView textView4 = (TextView) a.m(i7, viewInflate);
                                    if (textView4 != null) {
                                        i7 = d.tvNinNo;
                                        TextView textView5 = (TextView) a.m(i7, viewInflate);
                                        if (textView5 != null) {
                                            this.f36425c = new q((ConstraintLayout) viewInflate, iconicsImageView, iconicsImageView2, iconicsImageView3, textView, textView2, iconicsTextView, textView3, textView4, textView5);
                                            iconicsImageView2.setOnClickListener(this);
                                            iconicsImageView.setOnClickListener(this);
                                            iconicsImageView3.setOnClickListener(this);
                                            textView3.setOnClickListener(this);
                                            iconicsTextView.setOnClickListener(this);
                                            return;
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

    public static void a(Context context, int i7, String str) {
        if (TextUtils.isEmpty(str)) {
            if (context != null) {
                h.x(context, context.getString(F8.h.ac_guardian_copy_nothing));
                return;
            }
            return;
        }
        Object systemService = context != null ? context.getSystemService("clipboard") : null;
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(context.getString(i7), str));
        }
        if (context != null) {
            h.x(context, context.getString(F8.h.ac_copied));
        }
    }

    public final void b() {
        if (this.f36427e == null) {
            this.f36431j = new a(this, 2);
            d();
            return;
        }
        c("details");
        new KycDetailsDialog(this.f36424b, this.f36423a, this.f36426d, this.f36427e, new m(this, 24)).show();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    public final void c(String str) {
        RealNameAuthInfoRsp realNameAuthInfoRsp;
        String str2;
        RealNameAuthInfoRsp realNameAuthInfoRsp2;
        ClickEvent clickEvent = new ClickEvent("MyProfile_Account Level_ButtonClick");
        RealNameAuthInfoRsp realNameAuthInfoRsp3 = this.f36426d;
        clickEvent.add("Tier", realNameAuthInfoRsp3 != null ? realNameAuthInfoRsp3.mobileMoneyAccountTier : null);
        RealNameAuthInfoRsp realNameAuthInfoRsp4 = this.f36426d;
        if (TextUtils.isEmpty(realNameAuthInfoRsp4 != null ? realNameAuthInfoRsp4.bvn : null)) {
            realNameAuthInfoRsp = this.f36426d;
            if (realNameAuthInfoRsp != null) {
                str2 = realNameAuthInfoRsp.bvn;
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                realNameAuthInfoRsp2 = this.f36426d;
                if (!TextUtils.isEmpty(realNameAuthInfoRsp2 != null ? realNameAuthInfoRsp2.idNum : null)) {
                    clickEvent.add("Idtype", "nin");
                }
            } else {
                clickEvent.add("Idtype", "bvn");
            }
        } else {
            RealNameAuthInfoRsp realNameAuthInfoRsp5 = this.f36426d;
            if (TextUtils.isEmpty(realNameAuthInfoRsp5 != null ? realNameAuthInfoRsp5.idNum : null)) {
                realNameAuthInfoRsp = this.f36426d;
                if (realNameAuthInfoRsp != null) {
                    str2 = realNameAuthInfoRsp.bvn;
                } else {
                    str2 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    clickEvent.add("Idtype", "bvn");
                } else {
                    realNameAuthInfoRsp2 = this.f36426d;
                    if (!TextUtils.isEmpty(realNameAuthInfoRsp2 != null ? realNameAuthInfoRsp2.idNum : null)) {
                        clickEvent.add("Idtype", "nin");
                    }
                }
            }
        }
        clickEvent.add("Button", str);
        n0.g().q(clickEvent);
    }

    public final void d() {
        BaseActivity baseActivity;
        e f28604i;
        WeakReference weakReference = this.f36430i;
        if (weakReference == null || (baseActivity = (BaseActivity) weakReference.get()) == null || (f28604i = baseActivity.getF28604i()) == null) {
            return;
        }
        Intent intentC = F.c(this.f36423a, ARouter.getInstance().build("/account/verifyAccount"));
        intentC.putExtra("extra_type", SecurityVerifyMethodReq.SHOW_BVN_NIN_CODE);
        f28604i.f(intentC, new Z(baseActivity, 26));
    }

    public final void e(boolean z3) {
        q qVar;
        Context context = this.f36424b;
        if (context == null || (qVar = this.f36425c) == null) {
            return;
        }
        ((IconicsImageView) qVar.f815b).setIcon(new IconicsDrawable(context, z3 ? S6.a.pay_Copy : S6.a.pay_Hide));
    }

    public final void f(boolean z3) {
        q qVar;
        Context context = this.f36424b;
        if (context == null || (qVar = this.f36425c) == null) {
            return;
        }
        ((IconicsImageView) qVar.f818e).setIcon(new IconicsDrawable(context, z3 ? S6.a.pay_Copy : S6.a.pay_Hide));
    }

    public final void g(RealNameAuthInfoRsp realNameAuthInfoRsp) {
        String strM;
        this.f36426d = realNameAuthInfoRsp;
        String strM2 = realNameAuthInfoRsp != null ? realNameAuthInfoRsp.idNum : null;
        String str = realNameAuthInfoRsp != null ? realNameAuthInfoRsp.bvn : null;
        boolean zIsEmpty = TextUtils.isEmpty(strM2);
        q qVar = this.f36425c;
        if (zIsEmpty) {
            if (qVar != null) {
                h.s((IconicsImageView) qVar.f818e, false);
            }
            if (qVar != null) {
                ((TextView) qVar.f821i).setEnabled(false);
            }
            if (qVar != null) {
                ((TextView) qVar.f821i).setCompoundDrawablesWithIntrinsicBounds(c.ac_nin_not_verified, 0, 0, 0);
            }
            if (qVar != null) {
                TextView textView = (TextView) qVar.f823o;
                int i7 = L6.b.ppColorTextNormal;
                Context context = this.f36424b;
                textView.setText(h.B("Unverified", context, Integer.valueOf(CommonViewExtKt.colorInt(i7, context)), null, null, null, null, 1020));
            }
            if (qVar != null) {
                ((TextView) qVar.f823o).setOnClickListener(this);
            }
        } else {
            if (qVar != null) {
                ((TextView) qVar.f821i).setEnabled(true);
            }
            if (qVar != null) {
                ((TextView) qVar.f821i).setCompoundDrawablesWithIntrinsicBounds(c.ac_nin_verified, 0, 0, 0);
            }
            if (qVar != null) {
                TextView textView2 = (TextView) qVar.f823o;
                if (this.f36428f) {
                    UserRawIdNo userRawIdNo = this.f36427e;
                    strM2 = i0.m(userRawIdNo != null ? userRawIdNo.getAuthIdNum() : null);
                }
                String str2 = strM2;
                textView2.setText(str2 != null ? h.B(str2, this.f36424b, null, null, null, null, null, 958) : null);
            }
            if (qVar != null) {
                h.s((IconicsImageView) qVar.f818e, true);
            }
            f(this.f36428f);
        }
        if (TextUtils.isEmpty(str)) {
            if (qVar != null) {
                qVar.f816c.setEnabled(false);
            }
            if (qVar != null) {
                qVar.f816c.setCompoundDrawablesWithIntrinsicBounds(c.ac_nin_not_verified, 0, 0, 0);
            }
            if (qVar != null) {
                TextView textView3 = qVar.f822j;
                int i10 = L6.b.ppColorTextNormal;
                Context context2 = this.f36424b;
                textView3.setText(h.B("Unverified", context2, Integer.valueOf(CommonViewExtKt.colorInt(i10, context2)), null, null, null, null, 1020));
            }
            if (qVar != null) {
                h.s((IconicsImageView) qVar.f815b, false);
            }
            if (qVar != null) {
                qVar.f822j.setOnClickListener(this);
            }
            if (qVar != null) {
                ((IconicsTextView) qVar.f819f).setText(r0.H0(F8.h.ac_verify));
            }
            if (qVar != null) {
                h.C((IconicsTextView) qVar.f819f);
            }
        } else {
            if (qVar != null) {
                qVar.f816c.setEnabled(true);
            }
            if (qVar != null) {
                qVar.f816c.setCompoundDrawablesWithIntrinsicBounds(c.ac_nin_verified, 0, 0, 0);
            }
            if (qVar != null) {
                TextView textView4 = qVar.f822j;
                if (this.f36429g) {
                    UserRawIdNo userRawIdNo2 = this.f36427e;
                    strM = i0.m(userRawIdNo2 != null ? userRawIdNo2.getBvn() : null);
                } else {
                    strM = str;
                }
                textView4.setText(strM != null ? h.B(strM, this.f36424b, null, null, null, null, null, 958) : null);
            }
            if (qVar != null) {
                h.s((IconicsImageView) qVar.f815b, true);
            }
            if (qVar != null) {
                h.c((IconicsTextView) qVar.f819f);
            }
            e(this.f36429g);
        }
        if (qVar != null) {
            h.s((IconicsTextView) qVar.f819f, TextUtils.isEmpty(str));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String bvn = null;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = d.tvNinNo;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            RealNameAuthInfoRsp realNameAuthInfoRsp = this.f36426d;
            if (!TextUtils.isEmpty(realNameAuthInfoRsp != null ? realNameAuthInfoRsp.idNum : null)) {
                b();
                return;
            }
            n0.g().l("KycHomeNinClick");
            c("verifynin");
            com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
            return;
        }
        int i10 = d.tvBvnNo;
        if (numValueOf == null || numValueOf.intValue() != i10) {
            int i11 = d.tvBvnVerify;
            if (numValueOf == null || numValueOf.intValue() != i11) {
                int i12 = d.ivNinHide;
                q qVar = this.f36425c;
                Context context = this.f36424b;
                if (numValueOf != null && numValueOf.intValue() == i12) {
                    if (r0.U0()) {
                        return;
                    }
                    n0.g().l("KycHomeNinHideClick");
                    c("showNIN");
                    UserRawIdNo userRawIdNo = this.f36427e;
                    if (userRawIdNo == null) {
                        this.f36431j = new a(this, 1);
                        d();
                        return;
                    }
                    if (this.f36428f) {
                        a(context, F8.h.ac_nin, userRawIdNo.getAuthIdNum());
                    } else {
                        this.f36428f = true;
                        f(true);
                    }
                    if (qVar != null) {
                        TextView textView = (TextView) qVar.f823o;
                        if (this.f36428f) {
                            UserRawIdNo userRawIdNo2 = this.f36427e;
                            if (userRawIdNo2 != null) {
                                bvn = userRawIdNo2.getAuthIdNum();
                            }
                        } else {
                            RealNameAuthInfoRsp realNameAuthInfoRsp2 = this.f36426d;
                            if (realNameAuthInfoRsp2 != null) {
                                bvn = realNameAuthInfoRsp2.idNum;
                            }
                        }
                        textView.setText(bvn);
                        return;
                    }
                    return;
                }
                int i13 = d.ivBvnHide;
                if (numValueOf == null || numValueOf.intValue() != i13) {
                    int i14 = d.tvLinkedIdTitle;
                    if (numValueOf == null || numValueOf.intValue() != i14) {
                        int i15 = d.tvAccountDetails;
                        if (numValueOf == null || numValueOf.intValue() != i15) {
                            return;
                        }
                    }
                    if (r0.U0()) {
                        return;
                    }
                    b();
                    return;
                }
                if (r0.U0()) {
                    return;
                }
                n0.g().l("KycHomeBvnHideClick");
                c("showBVN");
                UserRawIdNo userRawIdNo3 = this.f36427e;
                if (userRawIdNo3 == null) {
                    this.f36431j = new a(this, 0);
                    d();
                    return;
                }
                if (this.f36429g) {
                    a(context, F8.h.ac_bvn, userRawIdNo3.getBvn());
                } else {
                    this.f36429g = true;
                    e(true);
                }
                if (qVar != null) {
                    TextView textView2 = qVar.f822j;
                    if (this.f36429g) {
                        UserRawIdNo userRawIdNo4 = this.f36427e;
                        if (userRawIdNo4 != null) {
                            bvn = userRawIdNo4.getBvn();
                        }
                    } else {
                        RealNameAuthInfoRsp realNameAuthInfoRsp3 = this.f36426d;
                        if (realNameAuthInfoRsp3 != null) {
                            bvn = realNameAuthInfoRsp3.bvn;
                        }
                    }
                    textView2.setText(bvn);
                    return;
                }
                return;
            }
        }
        RealNameAuthInfoRsp realNameAuthInfoRsp4 = this.f36426d;
        if (!TextUtils.isEmpty(realNameAuthInfoRsp4 != null ? realNameAuthInfoRsp4.bvn : null)) {
            b();
            return;
        }
        n0.g().l("KycHomeBvnClick");
        c("verifybvn");
        com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
    }
}
