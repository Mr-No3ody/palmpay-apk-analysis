package com.transsnet.palmpay.jara_packet.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnRichDialog;
import com.transsnet.palmpay.jara_packet.ui.model.ReferEarnFooterView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p236pc.b;
import p236pc.e;
import p236pc.f;
import p287se.d;
import p294tb.C2055q;
import p295tc.p;
import p340wc.g;
import p340wc.h;
import p340wc.i;
import p340wc.j;
import p340wc.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/fragment/ReferEarnWithdrawListFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReferEarnWithdrawListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReferEarnWithdrawListFragment.kt\ncom/transsnet/palmpay/jara_packet/ui/fragment/ReferEarnWithdrawListFragment\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,366:1\n116#2:367\n*S KotlinDebug\n*F\n+ 1 ReferEarnWithdrawListFragment.kt\ncom/transsnet/palmpay/jara_packet/ui/fragment/ReferEarnWithdrawListFragment\n*L\n166#1:367\n*E\n"})
public final class ReferEarnWithdrawListFragment extends BaseFragment {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f31960w = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p f31962j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31964p;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31961i = C2131j.b(new p325vb.a(this, 4));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31963o = 1;
    public String t = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f31965v = 15;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReferEarnWithdrawListFragment newInstance(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            ReferEarnWithdrawListFragment referEarnWithdrawListFragment = new ReferEarnWithdrawListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_data", id2);
            referEarnWithdrawListFragment.setArguments(bundle);
            return referEarnWithdrawListFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return e.jp_fragment_rv;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        c.b().j(this);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        u();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String string;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("extra_data")) == null) {
            string = "";
        }
        this.t = string;
        SwipeRecyclerView swipeRecyclerViewT = t();
        if (swipeRecyclerViewT != null && (recyclerView2 = swipeRecyclerViewT.getRecyclerView()) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        p pVar = new p(context);
        this.f31962j = pVar;
        pVar.f4986c = new d(this, 20);
        SwipeRecyclerView swipeRecyclerViewT2 = t();
        if (swipeRecyclerViewT2 != null) {
            swipeRecyclerViewT2.setAdapter(this.f31962j);
        }
        SwipeRecyclerView swipeRecyclerViewT3 = t();
        if (swipeRecyclerViewT3 != null) {
            swipeRecyclerViewT3.setRefreshEnable(false);
        }
        ModelEmptyView modelEmptyView = new ModelEmptyView(getContext());
        modelEmptyView.f31512c.setText(f.jp_history_invite_friends2);
        modelEmptyView.setBackgroundResource(p236pc.c.jp_refer_earn_bg);
        SwipeRecyclerView swipeRecyclerViewT4 = t();
        if (swipeRecyclerViewT4 != null) {
            swipeRecyclerViewT4.setEmptyView(modelEmptyView);
        }
        SwipeRecyclerView swipeRecyclerViewT5 = t();
        if (swipeRecyclerViewT5 != null) {
            swipeRecyclerViewT5.setFooterView(new ReferEarnFooterView(requireContext()));
        }
        C1548f c1548f = new C1548f(requireContext().getColor(b.jp_invite_divider_line), getResources().getDimensionPixelOffset(q.dp1), getResources().getDimensionPixelOffset(q.dp19), getResources().getDimensionPixelOffset(q.dp19));
        c1548f.f31336e = false;
        SwipeRecyclerView swipeRecyclerViewT6 = t();
        if (swipeRecyclerViewT6 != null && (recyclerView = swipeRecyclerViewT6.getRecyclerView()) != null) {
            recyclerView.addItemDecoration(c1548f);
        }
        SwipeRecyclerView swipeRecyclerViewT7 = t();
        if (swipeRecyclerViewT7 != null) {
            swipeRecyclerViewT7.setLoadMoreEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewT8 = t();
        if (swipeRecyclerViewT8 != null) {
            swipeRecyclerViewT8.setOnLoadListener(new p340wc.e(this));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 352) {
            this.f31963o = 1;
            u();
        }
    }

    public final SwipeRecyclerView t() {
        return (SwipeRecyclerView) this.f31961i.getValue();
    }

    public final void u() {
        if (this.t.length() == 0) {
            return;
        }
        ((JaraPacketApiService) p254qc.a.f41475a.f35518b).queryReferEarnWithDrawList(this.f31963o, this.f31965v).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 29));
    }

    public final void v(int i7, String str, String str2, String str3) {
        ReferEarnRichDialog.Companion companion = ReferEarnRichDialog.INSTANCE;
        if (i7 == companion.getRE_TYPE_WITHDRAW_SUCC()) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            ReferEarnRichDialog referEarnRichDialog = new ReferEarnRichDialog(contextRequireContext, companion.getRE_TYPE_WITHDRAW_SUCC(), new p340wc.f());
            referEarnRichDialog.show();
            referEarnRichDialog.setContent(str);
            return;
        }
        if (i7 == companion.getRE_TYPE_WITHDRAW_SUCC_RATE()) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            ReferEarnRichDialog referEarnRichDialog2 = new ReferEarnRichDialog(contextRequireContext2, companion.getRE_TYPE_WITHDRAW_SUCC_RATE(), new g(this));
            referEarnRichDialog2.show();
            referEarnRichDialog2.setContent(str);
            return;
        }
        if (i7 == companion.getRE_TYPE_WITHDRAW_FAIL_RISK()) {
            Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            ReferEarnRichDialog referEarnRichDialog3 = new ReferEarnRichDialog(contextRequireContext3, companion.getRE_TYPE_WITHDRAW_FAIL_RISK(), new h(str3));
            referEarnRichDialog3.show();
            referEarnRichDialog3.setContent(str);
            return;
        }
        if (i7 == companion.getRE_TYPE_WITHDRAW_SUCC_BIND()) {
            Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
            ReferEarnRichDialog referEarnRichDialog4 = new ReferEarnRichDialog(contextRequireContext4, companion.getRE_TYPE_WITHDRAW_SUCC_BIND(), new i());
            referEarnRichDialog4.show();
            referEarnRichDialog4.setContent(str);
            referEarnRichDialog4.setBottomContent(str2);
            String string = getString(k.core_add_bank_card);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            referEarnRichDialog4.setActionName("", string);
            return;
        }
        if (i7 == companion.getRE_TYPE_WITHDRAW_SUCC_COMMENT()) {
            Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
            ReferEarnRichDialog referEarnRichDialog5 = new ReferEarnRichDialog(contextRequireContext5, companion.getRE_TYPE_WITHDRAW_SUCC_COMMENT(), new j(str2, this));
            referEarnRichDialog5.show();
            referEarnRichDialog5.setContent(str);
            referEarnRichDialog5.setBottomContent(str2);
            String string2 = getString(f.jp_share_earn);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            referEarnRichDialog5.setActionName("", string2);
            return;
        }
        if (i7 == companion.getRE_TYPE_WITHDRAW_MANUAL_REVIEW()) {
            Context contextRequireContext6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
            ReferEarnRichDialog referEarnRichDialog6 = new ReferEarnRichDialog(contextRequireContext6, companion.getRE_TYPE_WITHDRAW_MANUAL_REVIEW(), new p340wc.k());
            referEarnRichDialog6.show();
            referEarnRichDialog6.setContent(str);
            referEarnRichDialog6.setBottomContent(str2);
            String string3 = getString(f.jp_view_now);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = getString(f.jp_claim_more);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            referEarnRichDialog6.setActionName(string3, string4);
            return;
        }
        if (i7 == companion.getRE_TYPE_REAL_NAME_RATE()) {
            Context contextRequireContext7 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "requireContext(...)");
            ReferEarnRichDialog referEarnRichDialog7 = new ReferEarnRichDialog(contextRequireContext7, companion.getRE_TYPE_REAL_NAME_RATE(), new l());
            referEarnRichDialog7.show();
            referEarnRichDialog7.setContent(str);
            referEarnRichDialog7.setBottomContent(str2);
            String string5 = getString(f.jp_resolve);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            referEarnRichDialog7.setActionName("", string5);
        }
    }
}
