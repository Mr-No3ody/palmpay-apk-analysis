package com.transsnet.palmpay.contacts.ui.activity;

import Bc.C0104a;
import Fd.G;
import L6.b;
import R9.d;
import R9.e;
import V9.v;
import V9.w;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.contacts.bean.req.AddRelationShipReq;
import com.transsnet.palmpay.contacts.ui.viewmodel.PalmPayFriendsViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p140j8.f;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/link_fave_personal_info")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/contacts/ui/activity/LinkFavePersonalInfoActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/contacts/ui/viewmodel/PalmPayFriendsViewModel;", "<init>", "()V", "a", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinkFavePersonalInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkFavePersonalInfoActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/LinkFavePersonalInfoActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,210:1\n1#2:211\n171#3,12:212\n215#3:224\n171#3,12:225\n215#3:237\n171#3,12:238\n215#3:250\n*S KotlinDebug\n*F\n+ 1 LinkFavePersonalInfoActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/LinkFavePersonalInfoActivity\n*L\n72#1:212,12\n72#1:224\n110#1:225,12\n110#1:237\n125#1:238,12\n125#1:250\n*E\n"})
public final class LinkFavePersonalInfoActivity extends BaseMvvmActivity<PalmPayFriendsViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27222f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0104a f27223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27225e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ct_activity_link_fave_personal_info, (ViewGroup) null, false);
        int i7 = d.ivHead;
        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
        if (imageView != null) {
            i7 = d.ivTag;
            ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i7 = d.titleBar;
                if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = d.tvAdd;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = d.tvBindingType;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = d.tvDelete;
                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView3 != null) {
                                i7 = d.tvEdit;
                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView4 != null) {
                                    i7 = d.tvFriendTag;
                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView5 != null) {
                                        i7 = d.tvName;
                                        TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView6 != null) {
                                            i7 = d.tvOptional;
                                            TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView7 != null) {
                                                i7 = d.tvTime;
                                                AppCompatTextView appCompatTextView = (AppCompatTextView) p059e1.a.m(i7, viewInflate);
                                                if (appCompatTextView != null) {
                                                    i7 = d.viewInfo;
                                                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                        C0104a c0104a = new C0104a(constraintLayout, imageView, imageView2, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, appCompatTextView);
                                                        this.f27223c = c0104a;
                                                        return c0104a;
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

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 10 && i10 == -1) {
            finish();
        }
        if (i7 == 101 && i10 == -1) {
            PalmPayFriendsViewModel palmPayFriendsViewModel = (PalmPayFriendsViewModel) l();
            AddRelationShipReq req = new AddRelationShipReq();
            req.phone = this.f27225e;
            palmPayFriendsViewModel.getClass();
            Intrinsics.checkNotNullParameter(req, "req");
            f.s(palmPayFriendsViewModel, new Z9.e(req, null), palmPayFriendsViewModel.f27307o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((PalmPayFriendsViewModel) l()).f27305i;
        if (lVar != null) {
            lVar.e(this, new G(new w(this, this, 0), 26));
        }
        l lVar2 = ((PalmPayFriendsViewModel) l()).f27307o;
        if (lVar2 != null) {
            lVar2.e(this, new G(new w(this, this, 1), 26));
        }
        l lVar3 = ((PalmPayFriendsViewModel) l()).t;
        if (lVar3 != null) {
            lVar3.e(this, new G(new w(this, this, 2), 26));
        }
        PalmPayFriendsViewModel palmPayFriendsViewModel = (PalmPayFriendsViewModel) l();
        AddRelationShipReq req = new AddRelationShipReq();
        req.phone = this.f27225e;
        req.bindingmemberid = this.f27224d;
        palmPayFriendsViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(palmPayFriendsViewModel, new Z9.l(req, null), palmPayFriendsViewModel.f27305i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        v vVar = new v(this, 0);
        C0104a c0104a = this.f27223c;
        h.q(vVar, c0104a != null ? (TextView) c0104a.f658o : null, c0104a != null ? (TextView) c0104a.f655g : null, c0104a != null ? c0104a.t : null);
    }
}
