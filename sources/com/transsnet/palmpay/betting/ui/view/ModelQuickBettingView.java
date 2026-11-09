package com.transsnet.palmpay.betting.ui.view;

import L6.b;
import M1.j;
import Pa.n0;
import Pd.c;
import Rd.m0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.betting.bean.BettingGameItem;
import com.transsnet.palmpay.betting.bean.BettingGameTabBean;
import com.transsnet.palmpay.betting.bean.BettingQuickILotHomeBean;
import com.transsnet.palmpay.betting.bean.BettingSportItem;
import com.transsnet.palmpay.betting.bean.BettingSportsCodeTabBean;
import com.transsnet.palmpay.betting.ui.view.ModelQuickBettingView;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p270rd.C1976t;
import p294tb.W;
import p355xf.C2131j;
import p355xf.t;
import t9.l;
import t9.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/view/ModelQuickBettingView;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "tabType", "", "setupRecyclerView", "(Ljava/lang/String;)V", "Lt9/l;", "e", "Lkotlin/Lazy;", "getGameAdapter", "()Lt9/l;", "gameAdapter", "Lt9/m;", "f", "getSportsAdapter", "()Lt9/m;", "sportsAdapter", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelQuickBettingView extends BaseConstraintLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f26759p = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1548f f26760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0 f26761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26764g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f26765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f26766j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BettingQuickILotHomeBean f26767o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelQuickBettingView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(ModelQuickBettingView modelQuickBettingView, j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        BettingSportItem bettingSportItem = (BettingSportItem) modelQuickBettingView.getSportsAdapter().getItem(i7);
        String durl = bettingSportItem.getDurl();
        if (durl != null) {
            Pair pair = new Pair("linkUrl", durl);
            BettingQuickILotHomeBean bettingQuickILotHomeBean = modelQuickBettingView.f26767o;
            Pair pair2 = new Pair("BillerIcon", bettingQuickILotHomeBean != null ? bettingQuickILotHomeBean.getBillerIcon() : null);
            BettingQuickILotHomeBean bettingQuickILotHomeBean2 = modelQuickBettingView.f26767o;
            d.E(p002a.a.e(pair, pair2, new Pair("BillerName", bettingQuickILotHomeBean2 != null ? bettingQuickILotHomeBean2.getBillerName() : null)), "/quick_teller/betting_quickbet_web");
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = new ClickEvent("PPay_Betting_Btn_QuickBetSportsCodes");
            String bookingCode = bettingSportItem.getBookingCode();
            if (bookingCode == null) {
                bookingCode = "";
            }
            n0VarG.k(clickEvent.add("element_name", bookingCode));
        }
    }

    public static void d(ModelQuickBettingView modelQuickBettingView, j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        BettingGameItem bettingGameItem = (BettingGameItem) modelQuickBettingView.getGameAdapter().getItem(i7);
        String gameUrl = bettingGameItem.getGameUrl();
        if (gameUrl != null) {
            Pair pair = new Pair("linkUrl", gameUrl);
            BettingQuickILotHomeBean bettingQuickILotHomeBean = modelQuickBettingView.f26767o;
            Pair pair2 = new Pair("BillerIcon", bettingQuickILotHomeBean != null ? bettingQuickILotHomeBean.getBillerIcon() : null);
            BettingQuickILotHomeBean bettingQuickILotHomeBean2 = modelQuickBettingView.f26767o;
            d.E(p002a.a.e(pair, pair2, new Pair("BillerName", bettingQuickILotHomeBean2 != null ? bettingQuickILotHomeBean2.getBillerName() : null)), "/quick_teller/betting_quickbet_web");
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = new ClickEvent("PPay_Betting_Btn_QuickBetFeaturedGame");
            String gameName = bettingGameItem.getGameName();
            if (gameName == null) {
                gameName = "";
            }
            n0VarG.k(clickEvent.add("element_name", gameName));
        }
    }

    private final l getGameAdapter() {
        return (l) this.f26762e.getValue();
    }

    private final m getSportsAdapter() {
        return (m) this.f26763f.getValue();
    }

    private final void setupRecyclerView(String tabType) {
        RecyclerView recyclerView;
        BettingSportsCodeTabBean sportsCodeTab;
        List<BettingSportItem> bookingList;
        BettingGameTabBean gameTab;
        List<BettingGameItem> gameList;
        m0 m0Var = this.f26761d;
        if (m0Var == null || (recyclerView = m0Var.itemRy) == null) {
            return;
        }
        C1548f c1548f = this.f26760c;
        if (c1548f != null) {
            recyclerView.removeItemDecoration(c1548f);
        }
        recyclerView.setBackgroundColor(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, getContext()));
        if (Intrinsics.c(tabType, this.f26765i)) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            recyclerView.setAdapter(getGameAdapter());
            BettingQuickILotHomeBean bettingQuickILotHomeBean = this.f26767o;
            if (bettingQuickILotHomeBean != null && (gameTab = bettingQuickILotHomeBean.getGameTab()) != null && (gameList = gameTab.getGameList()) != null) {
                getGameAdapter().setNewInstance(CollectionsKt.Z(gameList));
            }
            C1548f c1548f2 = this.f26760c;
            if (c1548f2 != null) {
                recyclerView.addItemDecoration(c1548f2);
            }
            final int i7 = 0;
            getGameAdapter().setOnItemClickListener(new OnItemClickListener(this) { // from class: w9.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ModelQuickBettingView f43352b;

                {
                    this.f43352b = this;
                }

                @Override // com.chad.library.adapter.base.listener.OnItemClickListener
                public final void onItemClick(j jVar, View view, int i10) {
                    switch (i7) {
                        case 0:
                            ModelQuickBettingView.d(this.f43352b, jVar, view, i10);
                            break;
                        default:
                            ModelQuickBettingView.c(this.f43352b, jVar, view, i10);
                            break;
                    }
                }
            });
            return;
        }
        if (!Intrinsics.c(tabType, this.f26766j)) {
            recyclerView.setAdapter(null);
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(getSportsAdapter());
        BettingQuickILotHomeBean bettingQuickILotHomeBean2 = this.f26767o;
        if (bettingQuickILotHomeBean2 != null && (sportsCodeTab = bettingQuickILotHomeBean2.getSportsCodeTab()) != null && (bookingList = sportsCodeTab.getBookingList()) != null) {
            getSportsAdapter().setNewInstance(CollectionsKt.Z(bookingList));
        }
        h.n(recyclerView, CommonViewExtKt.colorInt(b.ppColorSecondary, getContext()), CommonViewExtKt.getDp(8.0f), null, null, 124);
        final int i10 = 1;
        getSportsAdapter().setOnItemClickListener(new OnItemClickListener(this) { // from class: w9.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelQuickBettingView f43352b;

            {
                this.f43352b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(j jVar, View view, int i11) {
                switch (i10) {
                    case 0:
                        ModelQuickBettingView.d(this.f43352b, jVar, view, i11);
                        break;
                    default:
                        ModelQuickBettingView.c(this.f43352b, jVar, view, i11);
                        break;
                }
            }
        });
    }

    public final void e(int i7, String str, String str2) {
        LinearLayout linearLayout;
        m0 m0Var = this.f26761d;
        if (m0Var == null || (linearLayout = m0Var.llTabs) == null) {
            return;
        }
        if (str == null) {
            str = "默认标题";
        }
        View viewF = f(i7, str, str2);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        view.setVisibility(4);
        ViewGroup.LayoutParams layoutParams = viewF.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(CommonViewExtKt.getDp(8));
        viewF.setLayoutParams(layoutParams2);
        linearLayout.addView(viewF);
        linearLayout.addView(view);
    }

    public final LinearLayout f(int i7, String str, String str2) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(Pd.d.qt_item_tab_layout, (ViewGroup) null);
        Intrinsics.f(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        linearLayout.setTag(str2);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(28), 1.0f));
        AppCompatImageView appCompatImageView = (AppCompatImageView) linearLayout.findViewById(c.ivTabIcon);
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i7);
        }
        TextView textView = (TextView) linearLayout.findViewById(c.tvTabTitle);
        if (textView != null) {
            textView.setText(str);
            textView.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, textView.getContext()));
        }
        linearLayout.setOnClickListener(new W(10, this, str2));
        return linearLayout;
    }

    public final void g(String str) {
        LinearLayout linearLayout;
        int i7;
        if (Intrinsics.c(this.f26764g, str)) {
            return;
        }
        this.f26764g = str;
        m0 m0Var = this.f26761d;
        if (m0Var != null && (linearLayout = m0Var.llTabs) != null) {
            int childCount = linearLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = linearLayout.getChildAt(i10);
                Object tag = childAt.getTag();
                String str2 = tag instanceof String ? (String) tag : null;
                boolean zEquals = this.f26764g.equals(str2);
                childAt.setBackground(zEquals ? getContext().getDrawable(r.cv_shape_rect_corner_16_bg_secondary) : getContext().getDrawable(r.cv_shape_rect_corner_16_bg_dark));
                TextView textView = (TextView) childAt.findViewById(c.tvTabTitle);
                if (textView != null) {
                    textView.setTextColor(zEquals ? CommonViewExtKt.colorInt(b.ppColorPrimary, getContext()) : CommonViewExtKt.colorInt(b.ppColorTextPrimary, getContext()));
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) childAt.findViewById(c.ivTabIcon);
                if (appCompatImageView != null) {
                    if (Intrinsics.c(str2, this.f26765i)) {
                        i7 = zEquals ? Pd.b.qt_quick_bet_game_icon : Pd.b.qt_quick_bet_game_icon_default;
                    } else if (Intrinsics.c(str2, this.f26766j)) {
                        i7 = zEquals ? Pd.b.qt_quick_bet_sports_icon : Pd.b.qt_quick_bet_sports_icon_default;
                    } else {
                        i7 = Pd.b.qt_quick_bet_game_icon_default;
                    }
                    appCompatImageView.setImageResource(i7);
                }
            }
        }
        setupRecyclerView(str);
    }

    public final void h(String str) {
        String str2;
        if (Intrinsics.c(str, this.f26765i)) {
            str2 = "PPay_Betting_QuickBet_Game";
        } else {
            str2 = Intrinsics.c(str, this.f26766j) ? "PPay_Betting_QuickBet_Sport" : "";
        }
        n0.g().q(new ViewEvent(str2));
    }

    public final void i(BettingQuickILotHomeBean bettingQuickILotHomeBean) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        String title;
        String title2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        C1548f c1548f = new C1548f(getContext().getColor(p.transparent), CommonViewExtKt.getDp(14));
        this.f26760c = c1548f;
        c1548f.f31336e = false;
        m0 m0Var = this.f26761d;
        if (m0Var != null && (linearLayout5 = m0Var.llTabs) != null) {
            linearLayout5.removeAllViews();
        }
        this.f26767o = bettingQuickILotHomeBean;
        if (!TextUtils.isEmpty(bettingQuickILotHomeBean != null ? bettingQuickILotHomeBean.getILotLink1() : null)) {
            if (m0Var != null && (linearLayout4 = m0Var.ivArrowRight) != null) {
                h.s(linearLayout4, true);
            }
            if (m0Var != null && (linearLayout3 = m0Var.ivArrowRight) != null) {
                linearLayout3.setOnClickListener(new W(9, bettingQuickILotHomeBean, this));
            }
        } else if (m0Var != null && (linearLayout = m0Var.ivArrowRight) != null) {
            h.s(linearLayout, false);
        }
        boolean z3 = (bettingQuickILotHomeBean != null ? bettingQuickILotHomeBean.getGameTab() : null) != null;
        boolean z8 = (bettingQuickILotHomeBean != null ? bettingQuickILotHomeBean.getSportsCodeTab() : null) != null;
        String str = this.f26766j;
        String str2 = this.f26765i;
        if (z3 && z8) {
            if (m0Var != null && (linearLayout2 = m0Var.llTabs) != null) {
                BettingGameTabBean gameTab = bettingQuickILotHomeBean.getGameTab();
                if (gameTab == null || (title = gameTab.getTitle()) == null) {
                    title = "特色游戏";
                }
                View viewF = f(Pd.b.qt_quick_bet_game_icon_default, title, str2);
                BettingSportsCodeTabBean sportsCodeTab = bettingQuickILotHomeBean.getSportsCodeTab();
                if (sportsCodeTab == null || (title2 = sportsCodeTab.getTitle()) == null) {
                    title2 = "体育代码";
                }
                LinearLayout linearLayoutF = f(Pd.b.qt_quick_bet_sports_icon_default, title2, str);
                ViewGroup.LayoutParams layoutParams = viewF.getLayoutParams();
                Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd(CommonViewExtKt.getDp(8));
                viewF.setLayoutParams(layoutParams2);
                linearLayout2.addView(viewF);
                linearLayout2.addView(linearLayoutF);
            }
            g(str2);
            h(str2);
            h(str);
        } else if (z3) {
            BettingGameTabBean gameTab2 = bettingQuickILotHomeBean.getGameTab();
            e(Pd.b.qt_quick_bet_game_icon_default, gameTab2 != null ? gameTab2.getTitle() : null, str2);
            g(str2);
            h(str2);
        } else {
            if (!z8) {
                h.s(this, false);
                return;
            }
            BettingSportsCodeTabBean sportsCodeTab2 = bettingQuickILotHomeBean.getSportsCodeTab();
            e(Pd.b.qt_quick_bet_sports_icon_default, sportsCodeTab2 != null ? sportsCodeTab2.getTitle() : null, str);
            g(str);
            h(str);
        }
        h.s(this, true);
        n0.g().v("PPay_Betting_QuickBet");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelQuickBettingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelQuickBettingView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelQuickBettingView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26762e = C2131j.b(new C1976t(24));
        this.f26763f = C2131j.b(new C1976t(25));
        this.f26764g = "";
        this.f26765i = "GAME";
        this.f26766j = "SPORTS";
        this.f26761d = m0.bind(View.inflate(context, Pd.d.qt_layout_quick_betting_view, this));
        h.s(this, false);
    }
}
