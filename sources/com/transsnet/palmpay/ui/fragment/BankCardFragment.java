package com.transsnet.palmpay.ui.fragment;

import Ab.B;
import Ab.C;
import Ac.e;
import Ac.f;
import C9.C0144k;
import Ce.C0165g;
import Ce.C0166h;
import Ce.ViewOnClickListenerC0163e;
import M1.j;
import Pe.C0539k;
import Pe.C0540l;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.message.DefaultRepayCardReplaceMsg;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.ui.fragment.BankCardFragment;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.viewmodule.BankCardAndAccountViewModel;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p220oa.h;
import p328ve.d;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/BankCardFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/viewmodule/BankCardAndAccountViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/DefaultRepayCardReplaceMsg;", "msg", "", "onDefaultRepayCardChanged", "(Lcom/transsnet/palmpay/core/bean/message/DefaultRepayCardReplaceMsg;)V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBankCardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankCardFragment.kt\ncom/transsnet/palmpay/ui/fragment/BankCardFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n171#2,12:401\n215#2:413\n171#2,12:414\n215#2:426\n171#2,12:427\n215#2:439\n1#3:440\n*S KotlinDebug\n*F\n+ 1 BankCardFragment.kt\ncom/transsnet/palmpay/ui/fragment/BankCardFragment\n*L\n169#1:401,12\n169#1:413\n196#1:414,12\n196#1:426\n205#1:427,12\n205#1:439\n*E\n"})
public final class BankCardFragment extends BaseMvvmFragment<BankCardAndAccountViewModel> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f35064B = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f35066j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f35067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f35068p;
    public final t t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinkBankCardResp.LinkBankCard f35070w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35069v = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f35065A = C2131j.b(new Aa.a(13));

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

    public BankCardFragment() {
        final int i7 = 0;
        this.f35066j = C2131j.b(new Function0(this) { // from class: Ce.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankCardFragment f1480b;

            {
                this.f1480b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BankCardFragment bankCardFragment = this.f1480b;
                switch (i7) {
                    case 0:
                        int i10 = BankCardFragment.f35064B;
                        View view = bankCardFragment.f27318b;
                        if (view != null) {
                            return (FrameLayout) view.findViewById(Ac.e.fl_container);
                        }
                        return null;
                    case 1:
                        int i11 = BankCardFragment.f35064B;
                        View view2 = bankCardFragment.f27318b;
                        if (view2 != null) {
                            return (Group) view2.findViewById(Ac.e.g_card_list);
                        }
                        return null;
                    case 2:
                        int i12 = BankCardFragment.f35064B;
                        View view3 = bankCardFragment.f27318b;
                        if (view3 != null) {
                            return (IconicsTextView) view3.findViewById(Ac.e.iv_add_card);
                        }
                        return null;
                    default:
                        int i13 = BankCardFragment.f35064B;
                        View view4 = bankCardFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(Ac.e.rv_bank_card);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f35067o = C2131j.b(new Function0(this) { // from class: Ce.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankCardFragment f1480b;

            {
                this.f1480b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BankCardFragment bankCardFragment = this.f1480b;
                switch (i10) {
                    case 0:
                        int i11 = BankCardFragment.f35064B;
                        View view = bankCardFragment.f27318b;
                        if (view != null) {
                            return (FrameLayout) view.findViewById(Ac.e.fl_container);
                        }
                        return null;
                    case 1:
                        int i12 = BankCardFragment.f35064B;
                        View view2 = bankCardFragment.f27318b;
                        if (view2 != null) {
                            return (Group) view2.findViewById(Ac.e.g_card_list);
                        }
                        return null;
                    case 2:
                        int i13 = BankCardFragment.f35064B;
                        View view3 = bankCardFragment.f27318b;
                        if (view3 != null) {
                            return (IconicsTextView) view3.findViewById(Ac.e.iv_add_card);
                        }
                        return null;
                    default:
                        int i14 = BankCardFragment.f35064B;
                        View view4 = bankCardFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(Ac.e.rv_bank_card);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f35068p = C2131j.b(new Function0(this) { // from class: Ce.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankCardFragment f1480b;

            {
                this.f1480b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BankCardFragment bankCardFragment = this.f1480b;
                switch (i11) {
                    case 0:
                        int i12 = BankCardFragment.f35064B;
                        View view = bankCardFragment.f27318b;
                        if (view != null) {
                            return (FrameLayout) view.findViewById(Ac.e.fl_container);
                        }
                        return null;
                    case 1:
                        int i13 = BankCardFragment.f35064B;
                        View view2 = bankCardFragment.f27318b;
                        if (view2 != null) {
                            return (Group) view2.findViewById(Ac.e.g_card_list);
                        }
                        return null;
                    case 2:
                        int i14 = BankCardFragment.f35064B;
                        View view3 = bankCardFragment.f27318b;
                        if (view3 != null) {
                            return (IconicsTextView) view3.findViewById(Ac.e.iv_add_card);
                        }
                        return null;
                    default:
                        int i15 = BankCardFragment.f35064B;
                        View view4 = bankCardFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(Ac.e.rv_bank_card);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Ce.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankCardFragment f1480b;

            {
                this.f1480b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BankCardFragment bankCardFragment = this.f1480b;
                switch (i12) {
                    case 0:
                        int i13 = BankCardFragment.f35064B;
                        View view = bankCardFragment.f27318b;
                        if (view != null) {
                            return (FrameLayout) view.findViewById(Ac.e.fl_container);
                        }
                        return null;
                    case 1:
                        int i14 = BankCardFragment.f35064B;
                        View view2 = bankCardFragment.f27318b;
                        if (view2 != null) {
                            return (Group) view2.findViewById(Ac.e.g_card_list);
                        }
                        return null;
                    case 2:
                        int i15 = BankCardFragment.f35064B;
                        View view3 = bankCardFragment.f27318b;
                        if (view3 != null) {
                            return (IconicsTextView) view3.findViewById(Ac.e.iv_add_card);
                        }
                        return null;
                    default:
                        int i16 = BankCardFragment.f35064B;
                        View view4 = bankCardFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(Ac.e.rv_bank_card);
                        }
                        return null;
                }
            }
        });
    }

    public static final void t(BankCardFragment bankCardFragment, boolean z3) {
        t tVar = bankCardFragment.f35067o;
        t tVar2 = bankCardFragment.f35066j;
        if (!z3) {
            FrameLayout frameLayout = (FrameLayout) tVar2.getValue();
            if (frameLayout != null) {
                h.c(frameLayout);
            }
            Group group = (Group) tVar.getValue();
            if (group != null) {
                h.C(group);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = (FrameLayout) tVar2.getValue();
        if (frameLayout2 != null) {
            h.C(frameLayout2);
        }
        c.b().f(new MessageEvent(MessageEvent.EVENT_TO_LOAD_DRAFT));
        Z childFragmentManager = bankCardFragment.getChildFragmentManager();
        childFragmentManager.getClass();
        C1161a c1161a = new C1161a(childFragmentManager);
        int i7 = e.fl_container;
        Object objNavigation = ARouter.getInstance().build("/coreImpl/add_new_fragment").withBoolean("me_bind_bank_card", true).navigation();
        Intrinsics.f(objNavigation, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        c1161a.e(i7, (Fragment) objNavigation, null);
        c1161a.h(true);
        Group group2 = (Group) tVar.getValue();
        if (group2 != null) {
            h.c(group2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_bank_card;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        BankCardAndAccountViewModel bankCardAndAccountViewModel = (BankCardAndAccountViewModel) this.f27333i;
        l lVar = bankCardAndAccountViewModel != null ? bankCardAndAccountViewModel.f35356e : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0165g(this, this, 0), 7));
        }
        BankCardAndAccountViewModel bankCardAndAccountViewModel2 = (BankCardAndAccountViewModel) this.f27333i;
        n.B(this, bankCardAndAccountViewModel2 != null ? bankCardAndAccountViewModel2.f35357f : null, this, new Ba.a(this, 2), new C(this, 3), false, null, 240);
        BankCardAndAccountViewModel bankCardAndAccountViewModel3 = (BankCardAndAccountViewModel) this.f27333i;
        l lVar2 = bankCardAndAccountViewModel3 != null ? bankCardAndAccountViewModel3.f35358g : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new C0165g(this, this, 1), 7));
        }
        BankCardAndAccountViewModel bankCardAndAccountViewModel4 = (BankCardAndAccountViewModel) this.f27333i;
        l lVar3 = bankCardAndAccountViewModel4 != null ? bankCardAndAccountViewModel4.f35359i : null;
        if (lVar3 == null) {
            return 0;
        }
        lVar3.e(this, new C0144k(new C0165g(this, this, 2), 7));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        v();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        c.b().j(this);
        t tVar = this.f35068p;
        IconicsTextView iconicsTextView = (IconicsTextView) tVar.getValue();
        if (iconicsTextView != null) {
            SpanUtils spanUtils = new SpanUtils();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext, S6.a.pay_AddOutline);
            iconicsDrawable.a(new B(6));
            iconicsTextView.setText(spanUtils.appendImage(iconicsDrawable).append(" Add New Card").create());
        }
        IconicsTextView iconicsTextView2 = (IconicsTextView) tVar.getValue();
        if (iconicsTextView2 != null) {
            iconicsTextView2.setOnClickListener(new ViewOnClickListenerC0163e(this, 1));
        }
        t tVar2 = this.t;
        RecyclerView recyclerView = (RecyclerView) tVar2.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(u());
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar2.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        RecyclerView recyclerView3 = (RecyclerView) tVar2.getValue();
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C0166h());
        }
        u().setOnItemChildClickListener(new A8.a(this, 21));
        d dVarU = u();
        View viewInflate = View.inflate(requireContext(), com.transsnet.palmpay.custom_view.t.cv_layout_empty_footer_height_80, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        j.setFooterView$default(dVarU, viewInflate, 0, 0, 6, null);
        super.o();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        String accountId;
        String orderId;
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1) {
            if (i7 == 100) {
                v();
            }
            if (i7 == 1 && this.f35069v >= 0) {
                d dVarU = u();
                if ((dVarU != null ? dVarU.getItemCount() : -1) > this.f35069v) {
                    ((LinkBankCardResp.LinkBankCard) u().getItem(this.f35069v)).setShow(true);
                    u().notifyItemChanged(this.f35069v);
                    this.f35069v = -1;
                }
            }
            if (i7 == 2) {
                LinkBankCardResp.LinkBankCard linkBankCard = this.f35070w;
                BankCardAndAccountViewModel bankCardAndAccountViewModel = (BankCardAndAccountViewModel) this.f27333i;
                if (bankCardAndAccountViewModel != null) {
                    String str = "";
                    if (linkBankCard == null || (accountId = linkBankCard.getAccountId()) == null) {
                        accountId = "";
                    }
                    LinkBankCardResp.LinkBankCard linkBankCard2 = this.f35070w;
                    if (linkBankCard2 != null && (orderId = linkBankCard2.getOrderId()) != null) {
                        str = orderId;
                    }
                    C0539k c0539k = new C0539k(accountId, str, null);
                    l lVar = bankCardAndAccountViewModel.f35357f;
                    lVar.f27356m = str;
                    Unit unit = Unit.f38893a;
                    p140j8.f.v(bankCardAndAccountViewModel, c0539k, lVar, 0L);
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onDefaultRepayCardChanged(@Nullable DefaultRepayCardReplaceMsg msg) {
        v();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 275 || eventType == 282) {
            v();
        }
    }

    public final d u() {
        return (d) this.f35065A.getValue();
    }

    public final void v() {
        BankCardAndAccountViewModel bankCardAndAccountViewModel = (BankCardAndAccountViewModel) this.f27333i;
        if (bankCardAndAccountViewModel != null) {
            p140j8.f.s(bankCardAndAccountViewModel, new C0540l(1, null), bankCardAndAccountViewModel.f35356e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void w(LinkBankCardResp.LinkBankCard linkBankCard) {
        this.f35070w = linkBankCard;
        O6.c cVar = new O6.c(this.f27319c);
        cVar.e(k.core_title_attention);
        cVar.f6598d = getString(Ac.h.main_bank_card_delete_text);
        cVar.c(k.core_cancel, null);
        cVar.d(Ac.h.main_delete, new ViewOnClickListenerC0163e(this, 0));
        cVar.g();
    }
}
