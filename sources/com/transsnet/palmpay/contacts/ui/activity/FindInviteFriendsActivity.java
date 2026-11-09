package com.transsnet.palmpay.contacts.ui.activity;

import Bc.k;
import Fd.G;
import N8.C0463g;
import Pa.n0;
import Pa.r0;
import R9.d;
import Uc.I0;
import V8.w;
import V9.q;
import V9.u;
import W9.C0726g;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.imagepipeline.nativecode.b;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.contacts.ui.viewmodel.FindInviteFriendsViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p140j8.f;
import p161kf.e;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/find_my_friends")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/contacts/ui/activity/FindInviteFriendsActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/contacts/ui/viewmodel/FindInviteFriendsViewModel;", "Landroid/text/TextWatcher;", "<init>", "()V", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFindInviteFriendsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindInviteFriendsActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/FindInviteFriendsActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,213:1\n171#2,12:214\n215#2:226\n171#2,12:227\n215#2:239\n171#2,12:240\n215#2:252\n*S KotlinDebug\n*F\n+ 1 FindInviteFriendsActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/FindInviteFriendsActivity\n*L\n131#1:214,12\n131#1:226\n137#1:227,12\n137#1:239\n142#1:240,12\n142#1:252\n*E\n"})
public final class FindInviteFriendsActivity extends BaseMvvmActivity<FindInviteFriendsViewModel> implements TextWatcher {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f27212i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0726g f27213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f27214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f27215e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27216f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f27217g;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(R9.e.ct_activity_find_invite_friends, (ViewGroup) null, false);
        int i7 = d.editSearch;
        EditText editText = (EditText) a.m(i7, viewInflate);
        if (editText != null) {
            i7 = d.ivDelete;
            IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewInflate);
            if (iconicsImageView != null) {
                i7 = d.titleBar;
                if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                    i7 = d.viewInvite;
                    RelativeLayout relativeLayout = (RelativeLayout) a.m(i7, viewInflate);
                    if (relativeLayout != null) {
                        i7 = d.viewList;
                        RecyclerView recyclerView = (RecyclerView) a.m(i7, viewInflate);
                        if (recyclerView != null) {
                            i7 = d.viewSearch;
                            if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                                k kVar = new k((LinearLayout) viewInflate, editText, iconicsImageView, relativeLayout, recyclerView, 16);
                                this.f27217g = kVar;
                                return kVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void m() {
        if (TextUtils.isEmpty(this.f27216f)) {
            return;
        }
        String strR = b.r(this.f27216f, r0.K());
        FindInviteFriendsViewModel findInviteFriendsViewModel = (FindInviteFriendsViewModel) l();
        CommonShareReq req = new CommonShareReq(5, strR);
        findInviteFriendsViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(findInviteFriendsViewModel, new Z9.b(req, null), findInviteFriendsViewModel.f27301g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        e eVar = this.f27214d;
        if (eVar != null && !eVar.isDisposed()) {
            p001if.a.a(eVar);
        }
        k kVar = this.f27217g;
        if (!TextUtils.isEmpty(String.valueOf(kVar != null ? ((EditText) kVar.f751e).getText() : null))) {
            k kVar2 = this.f27217g;
            if (kVar2 != null) {
                ((IconicsImageView) kVar2.f752f).setVisibility(0);
            }
            k kVar3 = this.f27217g;
            C1765q c1765qI = new C1755g(new U8.a(6, this, String.valueOf(kVar3 != null ? ((EditText) kVar3.f751e).getText() : null)), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
            e eVar2 = new e(new q(new C0463g(this, 17), 2), p147jf.a.f38601e, p147jf.a.f38599c);
            c1765qI.subscribe(eVar2);
            this.f27214d = eVar2;
            addSubscription(eVar2);
            return;
        }
        k kVar4 = this.f27217g;
        if (kVar4 != null) {
            ((IconicsImageView) kVar4.f752f).setVisibility(8);
        }
        C0726g c0726g = this.f27213c;
        if (c0726g != null) {
            c0726g.b();
        }
        C0726g c0726g2 = this.f27213c;
        if (c0726g2 != null) {
            c0726g2.a(this.f27215e);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((FindInviteFriendsViewModel) l()).f27299e;
        if (lVar != null) {
            lVar.e(this, new G(new u(this, this, 0), 25));
        }
        l lVar2 = ((FindInviteFriendsViewModel) l()).f27300f;
        if (lVar2 != null) {
            lVar2.e(this, new G(new w(1, this, this), 25));
        }
        l lVar3 = ((FindInviteFriendsViewModel) l()).f27301g;
        if (lVar3 != null) {
            lVar3.e(this, new G(new u(this, this, 1), 25));
        }
        if (!p377z5.l.o(this, "android.permission.READ_CONTACTS")) {
            n0.g().m("event_track_dialog_screen", "Authorized address book", "");
        }
        FindInviteFriendsViewModel findInviteFriendsViewModel = (FindInviteFriendsViewModel) l();
        findInviteFriendsViewModel.getClass();
        f.s(findInviteFriendsViewModel, new Z9.a(1, null), findInviteFriendsViewModel.f27300f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7 = 1;
        super.setupView();
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        k kVar = this.f27217g;
        if (kVar != null) {
            ((EditText) kVar.f751e).setFocusable(true);
        }
        k kVar2 = this.f27217g;
        if (kVar2 != null) {
            ((EditText) kVar2.f751e).setFocusableInTouchMode(true);
        }
        k kVar3 = this.f27217g;
        if (kVar3 != null) {
            ((EditText) kVar3.f751e).addTextChangedListener(this);
        }
        C0726g c0726g = new C0726g(this);
        this.f27213c = c0726g;
        c0726g.f4986c = new q(this, i7);
        k kVar4 = this.f27217g;
        if (kVar4 != null) {
            ((RecyclerView) kVar4.f749c).setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        C1548f c1548f = new C1548f(getColor(L6.b.ppColorBackgroundDark), getResources().getDimensionPixelOffset(com.transsnet.palmpay.custom_view.q.dp1));
        c1548f.f31336e = false;
        k kVar5 = this.f27217g;
        if (kVar5 != null) {
            ((RecyclerView) kVar5.f749c).addItemDecoration(c1548f);
        }
        k kVar6 = this.f27217g;
        if (kVar6 != null) {
            ((RecyclerView) kVar6.f749c).setAdapter(this.f27213c);
        }
        I0 i0 = new I0(this, i7);
        k kVar7 = this.f27217g;
        h.q(i0, kVar7 != null ? (IconicsImageView) kVar7.f752f : null, kVar7 != null ? (RelativeLayout) kVar7.f750d : null);
        ((PpTitleBar) findViewById(d.titleBar)).c(S6.a.pay_ArrowLeft, CommonViewExtKt.colorInt(L6.b.ppColorTextBase, this));
    }
}
