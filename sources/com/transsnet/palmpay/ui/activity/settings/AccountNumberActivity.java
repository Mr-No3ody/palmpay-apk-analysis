package com.transsnet.palmpay.ui.activity.settings;

import Ac.e;
import Ac.f;
import Bc.C0105b;
import L6.b;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;
import p284sb.A;
import p285sc.x;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/accountNumber")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/settings/AccountNumberActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccountNumberActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34946b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0105b f34947a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@Nullable Context context) {
            Intent intent = new Intent(context, (Class<?>) AccountNumberActivity.class);
            if (context != null) {
                context.startActivity(intent);
            }
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        User user = BaseApplication.get().getUser();
        if (user != null) {
            C0105b c0105b = this.f34947a;
            r0.R1(c0105b != null ? (IconicsTextView) c0105b.f666f : null, "fonts/PalmPayNum-Bold.ttf");
            C0105b c0105b2 = this.f34947a;
            r0.R1(c0105b2 != null ? (IconicsTextView) c0105b2.f667g : null, "fonts/PalmPayNum-Regular.ttf");
            C0105b c0105b3 = this.f34947a;
            if (c0105b3 != null) {
                ((IconicsTextView) c0105b3.f666f).setText(user.getFormatAccountNumber());
            }
            C0105b c0105b4 = this.f34947a;
            if (c0105b4 != null) {
                ((IconicsTextView) c0105b4.f666f).setOnClickListener(new x(user, 4));
            }
            C0105b c0105b5 = this.f34947a;
            if (c0105b5 != null) {
                ((IconicsTextView) c0105b5.f667g).setText(r0.Y(user.getPhoneNumber()));
            }
            C0105b c0105b6 = this.f34947a;
            if (c0105b6 != null) {
                ((IconicsTextView) c0105b6.f667g).setOnClickListener(new A(1));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_account_number, (ViewGroup) null, false);
        int i7 = e.titleBar;
        if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.tv;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = e.tv1;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = e.tvAccountNo;
                    IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                    if (iconicsTextView != null) {
                        i7 = e.tvMobile;
                        IconicsTextView iconicsTextView2 = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                        if (iconicsTextView2 != null) {
                            i7 = e.tvMsg;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                C0105b c0105b = new C0105b((LinearLayout) viewInflate, textView, textView2, iconicsTextView, iconicsTextView2, textView3);
                                this.f34947a = c0105b;
                                return c0105b;
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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
