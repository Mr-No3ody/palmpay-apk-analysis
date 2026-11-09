package com.transsnet.palmpay.send_money.ui.activity.tobank;

import C0.G;
import Ed.ViewOnFocusChangeListenerC0235o;
import Kd.C0404p0;
import L6.b;
import M1.j;
import Pa.n0;
import Pa.r0;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import com.transsnet.palmpay.send_money.viewmodel.SelectBankViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p141j9.s;
import p159kd.a;
import p159kd.e;
import p159kd.f;
import p173ld.n;
import p173ld.r;
import p353xd.g;
import p353xd.q;
import p355xf.C2131j;
import p355xf.t;
import p7.h;
import x9.u;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/select_bank_for_to_bank_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/tobank/SelectBankForToBankActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/SelectBankViewModel;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectBankForToBankActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectBankForToBankActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/tobank/SelectBankForToBankActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,353:1\n562#2,10:354\n171#3,12:364\n215#3:376\n*S KotlinDebug\n*F\n+ 1 SelectBankForToBankActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/tobank/SelectBankForToBankActivity\n*L\n115#1:354,10\n210#1:364,12\n210#1:376\n*E\n"})
public final class SelectBankForToBankActivity extends BaseMvvmActivity<SelectBankViewModel> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f33506B = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33512g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33513i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33514j;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33518w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33515o = C2131j.b(new u(7));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33516p = C2131j.b(new u(4));
    public final t t = C2131j.b(new u(5));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33517v = C2131j.b(new u(6));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f33507A = "";

    public SelectBankForToBankActivity() {
        final int i7 = 0;
        this.f33508c = C2131j.b(new Function0(this) { // from class: xd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43862b;

            {
                this.f43862b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankForToBankActivity selectBankForToBankActivity = this.f43862b;
                switch (i7) {
                    case 0:
                        int i10 = SelectBankForToBankActivity.f33506B;
                        return (SideBarView) selectBankForToBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i11 = SelectBankForToBankActivity.f33506B;
                        return selectBankForToBankActivity.getLayoutInflater().inflate(f.sm_layout_select_bank_for_to_bank_header, (ViewGroup) null);
                    case 2:
                        int i12 = SelectBankForToBankActivity.f33506B;
                        return (RecyclerView) selectBankForToBankActivity.findViewById(e.bank_rv);
                    case 3:
                        int i13 = SelectBankForToBankActivity.f33506B;
                        return (CompatStateEditText) selectBankForToBankActivity.findViewById(e.search_et);
                    case 4:
                        int i14 = SelectBankForToBankActivity.f33506B;
                        return (ImageView) selectBankForToBankActivity.findViewById(e.search_iv);
                    case 5:
                        int i15 = SelectBankForToBankActivity.f33506B;
                        return (PpTitleBar) selectBankForToBankActivity.findViewById(e.select_bank_title_bar);
                    case 6:
                        int i16 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                    default:
                        int i17 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                }
            }
        });
        final int i10 = 2;
        this.f33509d = C2131j.b(new Function0(this) { // from class: xd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43862b;

            {
                this.f43862b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankForToBankActivity selectBankForToBankActivity = this.f43862b;
                switch (i10) {
                    case 0:
                        int i11 = SelectBankForToBankActivity.f33506B;
                        return (SideBarView) selectBankForToBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i12 = SelectBankForToBankActivity.f33506B;
                        return selectBankForToBankActivity.getLayoutInflater().inflate(f.sm_layout_select_bank_for_to_bank_header, (ViewGroup) null);
                    case 2:
                        int i13 = SelectBankForToBankActivity.f33506B;
                        return (RecyclerView) selectBankForToBankActivity.findViewById(e.bank_rv);
                    case 3:
                        int i14 = SelectBankForToBankActivity.f33506B;
                        return (CompatStateEditText) selectBankForToBankActivity.findViewById(e.search_et);
                    case 4:
                        int i15 = SelectBankForToBankActivity.f33506B;
                        return (ImageView) selectBankForToBankActivity.findViewById(e.search_iv);
                    case 5:
                        int i16 = SelectBankForToBankActivity.f33506B;
                        return (PpTitleBar) selectBankForToBankActivity.findViewById(e.select_bank_title_bar);
                    case 6:
                        int i17 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                    default:
                        int i18 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                }
            }
        });
        final int i11 = 3;
        this.f33510e = C2131j.b(new Function0(this) { // from class: xd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43862b;

            {
                this.f43862b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankForToBankActivity selectBankForToBankActivity = this.f43862b;
                switch (i11) {
                    case 0:
                        int i12 = SelectBankForToBankActivity.f33506B;
                        return (SideBarView) selectBankForToBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i13 = SelectBankForToBankActivity.f33506B;
                        return selectBankForToBankActivity.getLayoutInflater().inflate(f.sm_layout_select_bank_for_to_bank_header, (ViewGroup) null);
                    case 2:
                        int i14 = SelectBankForToBankActivity.f33506B;
                        return (RecyclerView) selectBankForToBankActivity.findViewById(e.bank_rv);
                    case 3:
                        int i15 = SelectBankForToBankActivity.f33506B;
                        return (CompatStateEditText) selectBankForToBankActivity.findViewById(e.search_et);
                    case 4:
                        int i16 = SelectBankForToBankActivity.f33506B;
                        return (ImageView) selectBankForToBankActivity.findViewById(e.search_iv);
                    case 5:
                        int i17 = SelectBankForToBankActivity.f33506B;
                        return (PpTitleBar) selectBankForToBankActivity.findViewById(e.select_bank_title_bar);
                    case 6:
                        int i18 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                    default:
                        int i19 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                }
            }
        });
        final int i12 = 4;
        this.f33511f = C2131j.b(new Function0(this) { // from class: xd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43862b;

            {
                this.f43862b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankForToBankActivity selectBankForToBankActivity = this.f43862b;
                switch (i12) {
                    case 0:
                        int i13 = SelectBankForToBankActivity.f33506B;
                        return (SideBarView) selectBankForToBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i14 = SelectBankForToBankActivity.f33506B;
                        return selectBankForToBankActivity.getLayoutInflater().inflate(f.sm_layout_select_bank_for_to_bank_header, (ViewGroup) null);
                    case 2:
                        int i15 = SelectBankForToBankActivity.f33506B;
                        return (RecyclerView) selectBankForToBankActivity.findViewById(e.bank_rv);
                    case 3:
                        int i16 = SelectBankForToBankActivity.f33506B;
                        return (CompatStateEditText) selectBankForToBankActivity.findViewById(e.search_et);
                    case 4:
                        int i17 = SelectBankForToBankActivity.f33506B;
                        return (ImageView) selectBankForToBankActivity.findViewById(e.search_iv);
                    case 5:
                        int i18 = SelectBankForToBankActivity.f33506B;
                        return (PpTitleBar) selectBankForToBankActivity.findViewById(e.select_bank_title_bar);
                    case 6:
                        int i19 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                    default:
                        int i110 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                }
            }
        });
        final int i13 = 5;
        this.f33512g = C2131j.b(new Function0(this) { // from class: xd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43862b;

            {
                this.f43862b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankForToBankActivity selectBankForToBankActivity = this.f43862b;
                switch (i13) {
                    case 0:
                        int i14 = SelectBankForToBankActivity.f33506B;
                        return (SideBarView) selectBankForToBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i15 = SelectBankForToBankActivity.f33506B;
                        return selectBankForToBankActivity.getLayoutInflater().inflate(f.sm_layout_select_bank_for_to_bank_header, (ViewGroup) null);
                    case 2:
                        int i16 = SelectBankForToBankActivity.f33506B;
                        return (RecyclerView) selectBankForToBankActivity.findViewById(e.bank_rv);
                    case 3:
                        int i17 = SelectBankForToBankActivity.f33506B;
                        return (CompatStateEditText) selectBankForToBankActivity.findViewById(e.search_et);
                    case 4:
                        int i18 = SelectBankForToBankActivity.f33506B;
                        return (ImageView) selectBankForToBankActivity.findViewById(e.search_iv);
                    case 5:
                        int i19 = SelectBankForToBankActivity.f33506B;
                        return (PpTitleBar) selectBankForToBankActivity.findViewById(e.select_bank_title_bar);
                    case 6:
                        int i110 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                    default:
                        int i111 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                }
            }
        });
        final int i14 = 6;
        this.f33513i = C2131j.b(new Function0(this) { // from class: xd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43862b;

            {
                this.f43862b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankForToBankActivity selectBankForToBankActivity = this.f43862b;
                switch (i14) {
                    case 0:
                        int i15 = SelectBankForToBankActivity.f33506B;
                        return (SideBarView) selectBankForToBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i16 = SelectBankForToBankActivity.f33506B;
                        return selectBankForToBankActivity.getLayoutInflater().inflate(f.sm_layout_select_bank_for_to_bank_header, (ViewGroup) null);
                    case 2:
                        int i17 = SelectBankForToBankActivity.f33506B;
                        return (RecyclerView) selectBankForToBankActivity.findViewById(e.bank_rv);
                    case 3:
                        int i18 = SelectBankForToBankActivity.f33506B;
                        return (CompatStateEditText) selectBankForToBankActivity.findViewById(e.search_et);
                    case 4:
                        int i19 = SelectBankForToBankActivity.f33506B;
                        return (ImageView) selectBankForToBankActivity.findViewById(e.search_iv);
                    case 5:
                        int i110 = SelectBankForToBankActivity.f33506B;
                        return (PpTitleBar) selectBankForToBankActivity.findViewById(e.select_bank_title_bar);
                    case 6:
                        int i111 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                    default:
                        int i112 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                }
            }
        });
        final int i15 = 7;
        this.f33514j = C2131j.b(new Function0(this) { // from class: xd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43862b;

            {
                this.f43862b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankForToBankActivity selectBankForToBankActivity = this.f43862b;
                switch (i15) {
                    case 0:
                        int i16 = SelectBankForToBankActivity.f33506B;
                        return (SideBarView) selectBankForToBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i17 = SelectBankForToBankActivity.f33506B;
                        return selectBankForToBankActivity.getLayoutInflater().inflate(f.sm_layout_select_bank_for_to_bank_header, (ViewGroup) null);
                    case 2:
                        int i18 = SelectBankForToBankActivity.f33506B;
                        return (RecyclerView) selectBankForToBankActivity.findViewById(e.bank_rv);
                    case 3:
                        int i19 = SelectBankForToBankActivity.f33506B;
                        return (CompatStateEditText) selectBankForToBankActivity.findViewById(e.search_et);
                    case 4:
                        int i110 = SelectBankForToBankActivity.f33506B;
                        return (ImageView) selectBankForToBankActivity.findViewById(e.search_iv);
                    case 5:
                        int i111 = SelectBankForToBankActivity.f33506B;
                        return (PpTitleBar) selectBankForToBankActivity.findViewById(e.select_bank_title_bar);
                    case 6:
                        int i112 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                    default:
                        int i113 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                }
            }
        });
        final int i16 = 1;
        this.f33518w = C2131j.b(new Function0(this) { // from class: xd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43862b;

            {
                this.f43862b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankForToBankActivity selectBankForToBankActivity = this.f43862b;
                switch (i16) {
                    case 0:
                        int i17 = SelectBankForToBankActivity.f33506B;
                        return (SideBarView) selectBankForToBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i18 = SelectBankForToBankActivity.f33506B;
                        return selectBankForToBankActivity.getLayoutInflater().inflate(f.sm_layout_select_bank_for_to_bank_header, (ViewGroup) null);
                    case 2:
                        int i19 = SelectBankForToBankActivity.f33506B;
                        return (RecyclerView) selectBankForToBankActivity.findViewById(e.bank_rv);
                    case 3:
                        int i110 = SelectBankForToBankActivity.f33506B;
                        return (CompatStateEditText) selectBankForToBankActivity.findViewById(e.search_et);
                    case 4:
                        int i111 = SelectBankForToBankActivity.f33506B;
                        return (ImageView) selectBankForToBankActivity.findViewById(e.search_iv);
                    case 5:
                        int i112 = SelectBankForToBankActivity.f33506B;
                        return (PpTitleBar) selectBankForToBankActivity.findViewById(e.select_bank_title_bar);
                    case 6:
                        int i113 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                    default:
                        int i114 = SelectBankForToBankActivity.f33506B;
                        return new r(selectBankForToBankActivity.isDarkMode());
                }
            }
        });
    }

    public static final ArrayList m(SelectBankForToBankActivity selectBankForToBankActivity, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BankInfo bankInfo = (BankInfo) it.next();
            if (TextUtils.isEmpty(bankInfo.indexType)) {
                arrayList.add(bankInfo);
            }
        }
        return arrayList;
    }

    public static final void n(final SelectBankForToBankActivity selectBankForToBankActivity) {
        Object value = selectBankForToBankActivity.f33512g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setTitle(r0.H0(k.core_select_bank));
        selectBankForToBankActivity.u().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(selectBankForToBankActivity, 29));
        selectBankForToBankActivity.u().addTextChangedListener(new R3.e(selectBankForToBankActivity, 26));
        selectBankForToBankActivity.p().setLayoutManager(new LinearLayoutManager(selectBankForToBankActivity));
        selectBankForToBankActivity.p().setAdapter(selectBankForToBankActivity.q());
        final int i7 = 0;
        selectBankForToBankActivity.q().setOnItemClickListener(new OnItemClickListener(selectBankForToBankActivity) { // from class: xd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43864b;

            {
                this.f43864b = selectBankForToBankActivity;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(j jVar, View view, int i10) {
                SelectBankForToBankActivity selectBankForToBankActivity2 = this.f43864b;
                switch (i7) {
                    case 0:
                        int i11 = SelectBankForToBankActivity.f33506B;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        BankInfo bankInfo = (BankInfo) selectBankForToBankActivity2.q().getItem(i10);
                        if (!bankInfo.isHeader) {
                            selectBankForToBankActivity2.o("2");
                            Intent intent = new Intent();
                            intent.putExtra("BANK_CARD_INFO", bankInfo);
                            selectBankForToBankActivity2.setResult(-1, intent);
                            selectBankForToBankActivity2.finish();
                            break;
                        }
                        break;
                    case 1:
                        int i12 = SelectBankForToBankActivity.f33506B;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        BankInfo bankInfo2 = (BankInfo) selectBankForToBankActivity2.t().getItem(i10);
                        selectBankForToBankActivity2.o("1");
                        Intent intent2 = new Intent();
                        intent2.putExtra("BANK_CARD_INFO", bankInfo2);
                        selectBankForToBankActivity2.setResult(-1, intent2);
                        selectBankForToBankActivity2.finish();
                        break;
                    default:
                        int i13 = SelectBankForToBankActivity.f33506B;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        BankInfo bankInfo3 = (BankInfo) selectBankForToBankActivity2.r().getItem(i10);
                        selectBankForToBankActivity2.o("1");
                        Intent intent3 = new Intent();
                        intent3.putExtra("BANK_CARD_INFO", bankInfo3);
                        selectBankForToBankActivity2.setResult(-1, intent3);
                        selectBankForToBankActivity2.finish();
                        break;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) selectBankForToBankActivity.s().findViewById(e.rv_match_bank);
        recyclerView.setAdapter(selectBankForToBankActivity.t());
        recyclerView.setLayoutManager(new GridLayoutManager(selectBankForToBankActivity, 3));
        recyclerView.addItemDecoration(new p353xd.f());
        RecyclerView recyclerView2 = (RecyclerView) selectBankForToBankActivity.s().findViewById(e.rv_frequently_used_bank);
        recyclerView2.setAdapter(selectBankForToBankActivity.r());
        recyclerView2.setLayoutManager(new GridLayoutManager(selectBankForToBankActivity, 3));
        recyclerView2.addItemDecoration(new g());
        final int i10 = 1;
        selectBankForToBankActivity.t().setOnItemClickListener(new OnItemClickListener(selectBankForToBankActivity) { // from class: xd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43864b;

            {
                this.f43864b = selectBankForToBankActivity;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(j jVar, View view, int i11) {
                SelectBankForToBankActivity selectBankForToBankActivity2 = this.f43864b;
                switch (i10) {
                    case 0:
                        int i12 = SelectBankForToBankActivity.f33506B;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        BankInfo bankInfo = (BankInfo) selectBankForToBankActivity2.q().getItem(i11);
                        if (!bankInfo.isHeader) {
                            selectBankForToBankActivity2.o("2");
                            Intent intent = new Intent();
                            intent.putExtra("BANK_CARD_INFO", bankInfo);
                            selectBankForToBankActivity2.setResult(-1, intent);
                            selectBankForToBankActivity2.finish();
                            break;
                        }
                        break;
                    case 1:
                        int i13 = SelectBankForToBankActivity.f33506B;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        BankInfo bankInfo2 = (BankInfo) selectBankForToBankActivity2.t().getItem(i11);
                        selectBankForToBankActivity2.o("1");
                        Intent intent2 = new Intent();
                        intent2.putExtra("BANK_CARD_INFO", bankInfo2);
                        selectBankForToBankActivity2.setResult(-1, intent2);
                        selectBankForToBankActivity2.finish();
                        break;
                    default:
                        int i14 = SelectBankForToBankActivity.f33506B;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        BankInfo bankInfo3 = (BankInfo) selectBankForToBankActivity2.r().getItem(i11);
                        selectBankForToBankActivity2.o("1");
                        Intent intent3 = new Intent();
                        intent3.putExtra("BANK_CARD_INFO", bankInfo3);
                        selectBankForToBankActivity2.setResult(-1, intent3);
                        selectBankForToBankActivity2.finish();
                        break;
                }
            }
        });
        final int i11 = 2;
        selectBankForToBankActivity.r().setOnItemClickListener(new OnItemClickListener(selectBankForToBankActivity) { // from class: xd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankForToBankActivity f43864b;

            {
                this.f43864b = selectBankForToBankActivity;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(j jVar, View view, int i12) {
                SelectBankForToBankActivity selectBankForToBankActivity2 = this.f43864b;
                switch (i11) {
                    case 0:
                        int i13 = SelectBankForToBankActivity.f33506B;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        BankInfo bankInfo = (BankInfo) selectBankForToBankActivity2.q().getItem(i12);
                        if (!bankInfo.isHeader) {
                            selectBankForToBankActivity2.o("2");
                            Intent intent = new Intent();
                            intent.putExtra("BANK_CARD_INFO", bankInfo);
                            selectBankForToBankActivity2.setResult(-1, intent);
                            selectBankForToBankActivity2.finish();
                            break;
                        }
                        break;
                    case 1:
                        int i14 = SelectBankForToBankActivity.f33506B;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        BankInfo bankInfo2 = (BankInfo) selectBankForToBankActivity2.t().getItem(i12);
                        selectBankForToBankActivity2.o("1");
                        Intent intent2 = new Intent();
                        intent2.putExtra("BANK_CARD_INFO", bankInfo2);
                        selectBankForToBankActivity2.setResult(-1, intent2);
                        selectBankForToBankActivity2.finish();
                        break;
                    default:
                        int i15 = SelectBankForToBankActivity.f33506B;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        BankInfo bankInfo3 = (BankInfo) selectBankForToBankActivity2.r().getItem(i12);
                        selectBankForToBankActivity2.o("1");
                        Intent intent3 = new Intent();
                        intent3.putExtra("BANK_CARD_INFO", bankInfo3);
                        selectBankForToBankActivity2.setResult(-1, intent3);
                        selectBankForToBankActivity2.finish();
                        break;
                }
            }
        });
        j.setHeaderView$default(selectBankForToBankActivity.q(), selectBankForToBankActivity.s(), 0, 0, 6, null);
        SelectBankViewModel selectBankViewModel = (SelectBankViewModel) selectBankForToBankActivity.l();
        String str = selectBankForToBankActivity.f33507A;
        selectBankViewModel.getClass();
        p140j8.f.s(selectBankViewModel, new C0404p0(str, null), selectBankViewModel.f34021g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_select_bank;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void o(String str) {
        ClickEvent clickEvent = (ClickEvent) G.f("bankTransfer_selectBank", "bankTransfer_selectType", str);
        if (!TextUtils.isEmpty(this.f33507A)) {
            clickEvent.add("bankTransfer_matchedAccountID", this.f33507A);
        }
        n0.g().k(clickEvent);
    }

    public final RecyclerView p() {
        Object value = this.f33509d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((SelectBankViewModel) l()).f34021g;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 28), 0, (short) 0));
        }
    }

    public final n q() {
        return (n) this.f33515o.getValue();
    }

    public final r r() {
        return (r) this.f33513i.getValue();
    }

    public final View s() {
        Object value = this.f33518w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
        t tVar = this.f33508c;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((SideBarView) value).setLetters(getResources().getStringArray(a.sm_select_bank_slide_bar_value_new));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((SideBarView) value2).setOnLetterChangeListener(new q(this));
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new h(uIHandler, 19, this, false));
    }

    public final r t() {
        return (r) this.f33514j.getValue();
    }

    public final CompatStateEditText u() {
        Object value = this.f33510e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CompatStateEditText) value;
    }
}
