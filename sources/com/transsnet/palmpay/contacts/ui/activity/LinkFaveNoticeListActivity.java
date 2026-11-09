package com.transsnet.palmpay.contacts.ui.activity;

import Bc.i;
import L6.b;
import R9.d;
import R9.e;
import T8.f;
import T8.o;
import Uc.I0;
import W9.k;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.contacts.bean.req.QueryRelationshipLogListReq;
import com.transsnet.palmpay.contacts.ui.viewmodel.PalmPayFriendsViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.ReverseRecyclerView;
import com.transsnet.palmpay.custom_view.StateImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/link_fave_notice_list")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/contacts/ui/activity/LinkFaveNoticeListActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/contacts/ui/viewmodel/PalmPayFriendsViewModel;", "<init>", "()V", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLinkFaveNoticeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkFaveNoticeListActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/LinkFaveNoticeListActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,92:1\n171#2,12:93\n215#2:105\n*S KotlinDebug\n*F\n+ 1 LinkFaveNoticeListActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/LinkFaveNoticeListActivity\n*L\n79#1:93,12\n79#1:105\n*E\n"})
public final class LinkFaveNoticeListActivity extends BaseMvvmActivity<PalmPayFriendsViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27218f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f27219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f27220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27221e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((PalmPayFriendsViewModel) l()).f27309v;
        if (lVar != null) {
            lVar.e(this, new f(new o(6, this, this), (byte) 0));
        }
        QueryRelationshipLogListReq req = new QueryRelationshipLogListReq();
        String str = this.f27221e;
        if (str == null) {
            str = "";
        }
        req.bindingMemberId = str;
        PalmPayFriendsViewModel palmPayFriendsViewModel = (PalmPayFriendsViewModel) l();
        palmPayFriendsViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(palmPayFriendsViewModel, new Z9.f(req, null), palmPayFriendsViewModel.f27309v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ct_activity_link_fave_notice_list, (ViewGroup) null, false);
        int i7 = d.freeTv;
        TextView textView = (TextView) a.m(i7, viewInflate);
        if (textView != null) {
            i7 = d.ivAvatar;
            ImageView imageView = (ImageView) a.m(i7, viewInflate);
            if (imageView != null) {
                i7 = d.ivBack;
                StateImageView stateImageView = (StateImageView) a.m(i7, viewInflate);
                if (stateImageView != null) {
                    i7 = d.thanksAnimView;
                    if (((LottieAnimationView) a.m(i7, viewInflate)) != null) {
                        i7 = d.tvName;
                        TextView textView2 = (TextView) a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = d.tvNo;
                            TextView textView3 = (TextView) a.m(i7, viewInflate);
                            if (textView3 != null) {
                                i7 = d.viewList;
                                ReverseRecyclerView reverseRecyclerView = (ReverseRecyclerView) a.m(i7, viewInflate);
                                if (reverseRecyclerView != null) {
                                    i iVar = new i((LinearLayout) viewInflate, textView, imageView, stateImageView, textView2, textView3, reverseRecyclerView);
                                    this.f27219c = iVar;
                                    return iVar;
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
    public final void processLogic(Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        k kVar = new k(this);
        this.f27220d = kVar;
        String memberId = this.f27221e;
        if (memberId == null) {
            memberId = "";
        }
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        kVar.f10640e = memberId;
        i iVar = this.f27219c;
        if (iVar != null && (recyclerView2 = ((ReverseRecyclerView) iVar.f730i).getRecyclerView()) != null) {
            recyclerView2.setAdapter(this.f27220d);
        }
        i iVar2 = this.f27219c;
        if (iVar2 == null || (recyclerView = ((ReverseRecyclerView) iVar2.f730i).getRecyclerView()) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        super.setupView();
        I0 i0 = new I0(this, 2);
        i iVar = this.f27219c;
        h.q(i0, iVar != null ? (StateImageView) iVar.f726d : null);
    }
}
