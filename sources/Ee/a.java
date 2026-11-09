package Ee;

import Ac.e;
import Ac.h;
import Bc.k;
import N8.q0;
import Pa.i0;
import Pa.n0;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2418a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f2419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2422e;

    public a(LifecycleOwner viewLifecycleOwner, ViewStub viewStub) {
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        this.f2420c = viewLifecycleOwner;
        View viewInflate = viewStub != null ? viewStub.inflate() : null;
        if (viewInflate != null) {
            int i7 = e.ivAvatar;
            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
            if (appCompatImageView != null) {
                i7 = e.ivBell;
                if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.ivCustomerService;
                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                    if (iconicsImageView != null) {
                        i7 = e.ivSecurityCenter;
                        IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                        if (iconicsImageView2 != null) {
                            i7 = e.ivSecurityCenterDot;
                            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                            if (imageView != null) {
                                i7 = e.topBarEndBarrier;
                                if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = e.tvMsgCount;
                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView != null) {
                                        i7 = e.tvName;
                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            this.f2422e = new k((ConstraintLayout) viewInflate, appCompatImageView, iconicsImageView, iconicsImageView2, imageView, textView, textView2);
                                            this.f2419b = viewInflate.getContext();
                                            this.f2421d = new p045d3.k(viewInflate);
                                            appCompatImageView.setOnClickListener(this);
                                            iconicsImageView.setOnClickListener(this);
                                            iconicsImageView2.setOnClickListener(this);
                                            textView2.setOnClickListener(this);
                                            return;
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
    }

    public void a() {
        TextView textView;
        TextView textView2;
        String strString;
        boolean zHasLogin = BaseApplication.hasLogin();
        k kVar = (k) this.f2422e;
        if (!zHasLogin) {
            if (kVar == null || (textView = (TextView) kVar.f750d) == null) {
                return;
            }
            textView.setText(h.main_sign_up_login);
            return;
        }
        User user = BaseApplication.getInstance().getUser();
        if (user == null || kVar == null || (textView2 = (TextView) kVar.f750d) == null) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(user.getDisplayName());
        Context context = this.f2419b;
        if (zIsEmpty || user.isTier0User()) {
            strString = CommonViewExtKt.string(h.main_hi_palmpayer, context);
        } else {
            strString = context != null ? context.getString(p025ba.k.core_hi, user.getDisplayName()) : null;
        }
        textView2.setText(strString);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        Method method;
        switch (this.f2418a) {
            case 0:
                Intrinsics.checkNotNullParameter(v3, "v");
                try {
                    int id2 = v3.getId();
                    if (id2 == e.ivAvatar) {
                        n0.g().k(new ClickEvent("home_page_element_click").afEvt(false).add("module_name", "Personal center"));
                        if (!BaseApplication.hasLogin()) {
                            i0.K(null, null);
                        } else if (!BaseApplication.get().getUser().isTier0User()) {
                            d.F("/main/personal_info");
                        }
                    } else if (id2 == e.ivCustomerService) {
                        n0.g().l("PalmPay_Me_Help_Support_Zero_Click");
                        if (!BaseApplication.hasLogin()) {
                            i0.b0("/h5/help/service?entryType=register");
                        } else if (BaseApplication.get().getUser().isTier0User()) {
                            d.F("/account/add_extra");
                        } else {
                            i0.c0(com.transsnet.palmpay.core.config.d.c("home"));
                        }
                    } else if (id2 == e.tvName || id2 == e.ivPremium) {
                        if (!BaseApplication.hasLogin()) {
                            i0.K(null, null);
                        } else if (!BaseApplication.get().getUser().isTier0User()) {
                            d.F("/main/personal_info");
                        }
                    } else if (id2 == e.ivSecurityCenter) {
                        if (BaseApplication.hasLogin()) {
                            d.x(null, "SecurityCenterHome");
                        } else {
                            i0.K(null, null);
                        }
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                if (((Method) this.f2422e) == null) {
                    View view = (View) this.f2420c;
                    Context context = view.getContext();
                    while (true) {
                        String str = (String) this.f2421d;
                        if (context == null) {
                            int id3 = view.getId();
                            String str2 = id3 == -1 ? "" : " with id '" + view.getContext().getResources().getResourceEntryName(id3) + "'";
                            StringBuilder sbQ = q0.q("Could not find method ", str, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                            sbQ.append(view.getClass());
                            sbQ.append(str2);
                            throw new IllegalStateException(sbQ.toString());
                        }
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str, View.class)) != null) {
                                this.f2422e = method;
                                this.f2419b = context;
                            }
                            break;
                        } catch (NoSuchMethodException unused2) {
                        }
                        context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                    }
                }
                try {
                    ((Method) this.f2422e).invoke(this.f2419b, v3);
                    return;
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException("Could not execute method for android:onClick", e11);
                }
        }
    }

    public a(View view, String str) {
        this.f2420c = view;
        this.f2421d = str;
    }
}
