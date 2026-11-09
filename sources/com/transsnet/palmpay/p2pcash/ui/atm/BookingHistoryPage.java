package com.transsnet.palmpay.p2pcash.ui.atm;

import L6.b;
import Sc.c;
import Uc.C0670n;
import Uc.C0672p;
import Uc.C0674s;
import Uc.C0675t;
import Uc.r;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingHistoryPage;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/p2pcash/ui/atm/BookingHistoryPage;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Uc/t", "Uc/p", "Uc/u", "Uc/n", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BookingHistoryPage extends BaseActivity {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f32818v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f32819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f32821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f32823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f32824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f32825g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f32826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f32827j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f32828o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f32829p;
    public final t t;

    public BookingHistoryPage() {
        final int i7 = 0;
        this.f32819a = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i7) {
                    case 0:
                        int i10 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i11 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i12 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i13 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i14 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i15 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i16 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i17 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i18 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i19 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i10 = 5;
        this.f32820b = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i10) {
                    case 0:
                        int i11 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i12 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i13 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i14 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i15 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i16 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i17 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i18 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i19 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i110 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i11 = 6;
        this.f32821c = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i11) {
                    case 0:
                        int i12 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i13 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i14 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i15 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i16 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i17 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i18 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i19 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i110 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i111 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i12 = 7;
        this.f32822d = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i12) {
                    case 0:
                        int i13 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i14 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i15 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i16 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i17 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i18 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i19 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i110 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i111 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i112 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i13 = 8;
        this.f32823e = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i13) {
                    case 0:
                        int i14 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i15 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i16 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i17 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i18 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i19 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i110 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i111 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i112 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i113 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i14 = 9;
        this.f32824f = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i14) {
                    case 0:
                        int i15 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i16 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i17 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i18 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i19 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i110 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i111 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i112 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i113 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i114 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i15 = 10;
        this.f32825g = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i15) {
                    case 0:
                        int i16 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i17 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i18 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i19 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i110 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i111 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i112 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i113 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i114 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i115 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i16 = 11;
        this.f32826i = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i16) {
                    case 0:
                        int i17 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i18 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i19 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i110 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i111 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i112 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i113 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i114 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i115 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i116 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i17 = 1;
        this.f32827j = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i17) {
                    case 0:
                        int i18 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i19 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i110 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i111 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i112 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i113 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i114 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i115 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i116 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i117 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i18 = 2;
        this.f32828o = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i18) {
                    case 0:
                        int i19 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i110 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i111 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i112 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i113 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i114 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i115 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i116 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i117 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i118 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i19 = 3;
        this.f32829p = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i19) {
                    case 0:
                        int i110 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i111 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i112 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i113 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i114 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i115 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i116 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i117 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i118 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i119 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i20 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i21 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
        final int i20 = 4;
        this.t = C2131j.b(new Function0(this) { // from class: Uc.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9663b;

            {
                this.f9663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BookingHistoryPage bookingHistoryPage = this.f9663b;
                switch (i20) {
                    case 0:
                        int i110 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj2);
                    case 1:
                        int i111 = BookingHistoryPage.f32818v;
                        return new C0675t(bookingHistoryPage);
                    case 2:
                        int i112 = BookingHistoryPage.f32818v;
                        return new C0672p(bookingHistoryPage);
                    case 3:
                        int i113 = BookingHistoryPage.f32818v;
                        return new C0676u(bookingHistoryPage);
                    case 4:
                        int i114 = BookingHistoryPage.f32818v;
                        return new C0670n(bookingHistoryPage);
                    case 5:
                        int i115 = BookingHistoryPage.f32818v;
                        return (CardView) bookingHistoryPage.findViewById(Sc.b.p2p_book_now);
                    case 6:
                        int i116 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_text);
                    case 7:
                        int i117 = BookingHistoryPage.f32818v;
                        return (ImageView) bookingHistoryPage.findViewById(Sc.b.p2p_empty_img);
                    case 8:
                        int i118 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_empty_view);
                    case 9:
                        int i119 = BookingHistoryPage.f32818v;
                        return (SwipeRecyclerView) bookingHistoryPage.findViewById(Sc.b.p2p_list);
                    case 10:
                        int i21 = BookingHistoryPage.f32818v;
                        return (TextView) bookingHistoryPage.findViewById(Sc.b.p2p_asdfklaj);
                    default:
                        int i22 = BookingHistoryPage.f32818v;
                        return (FrameLayout) bookingHistoryPage.findViewById(Sc.b.p2p_entadasfdsaf);
                }
            }
        });
    }

    public static final SwipeRecyclerView l(BookingHistoryPage bookingHistoryPage) {
        Object value = bookingHistoryPage.f32824f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SwipeRecyclerView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.p2p_booking_history_page_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final C0672p m() {
        return (C0672p) this.f32828o.getValue();
    }

    public final C0675t n() {
        return (C0675t) this.f32827j.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c cVarB = org.greenrobot.eventbus.c.b();
        Intrinsics.checkNotNullParameter(this, "<this>");
        cVarB.l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 407) {
            m().a(1);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        m().a(1);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c cVarB = org.greenrobot.eventbus.c.b();
        Intrinsics.checkNotNullParameter(this, "<this>");
        cVarB.j(this);
        C0675t c0675tN = n();
        int i7 = b.ppColorBackgroundLight;
        BookingHistoryPage bookingHistoryPage = c0675tN.f9723a;
        bookingHistoryPage.initStatusBar(CommonViewExtKt.colorInt(i7, bookingHistoryPage), !bookingHistoryPage.isDarkMode());
        final BookingHistoryPage bookingHistoryPage2 = n().f9723a;
        t tVar = bookingHistoryPage2.f32825g;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        SpannableString spannableString = new SpannableString("Click here to check transfer history");
        spannableString.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(b.ppColorPrimary)), StringsKt.E("Click here to check transfer history", "transfer history", 0, false, 6), StringsKt.E("Click here to check transfer history", "transfer history", 0, false, 6) + 16, 33);
        ((TextView) value).setText(spannableString);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i10 = 1;
        ((TextView) value2).setOnClickListener(new View.OnClickListener(bookingHistoryPage2) { // from class: Uc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9712b;

            {
                this.f9712b = bookingHistoryPage2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f9712b.finish();
                        break;
                    case 1:
                        ((C0676u) this.f9712b.f32829p.getValue()).getClass();
                        ARouter.getInstance().build("/collect/record").navigation();
                        break;
                    default:
                        ((C0676u) this.f9712b.f32829p.getValue()).getClass();
                        ARouter.getInstance().build("/collect/record").navigation();
                        break;
                }
            }
        });
        t tVar2 = bookingHistoryPage2.f32819a;
        Object value3 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        SpannableString spannableString2 = new SpannableString("Click here to check transfer history");
        spannableString2.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(b.ppColorPrimary)), StringsKt.E("Click here to check transfer history", "transfer history", 0, false, 6), StringsKt.E("Click here to check transfer history", "transfer history", 0, false, 6) + 16, 33);
        ((TextView) value3).setText(spannableString2);
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i11 = 2;
        ((TextView) value4).setOnClickListener(new View.OnClickListener(bookingHistoryPage2) { // from class: Uc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9712b;

            {
                this.f9712b = bookingHistoryPage2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f9712b.finish();
                        break;
                    case 1:
                        ((C0676u) this.f9712b.f32829p.getValue()).getClass();
                        ARouter.getInstance().build("/collect/record").navigation();
                        break;
                    default:
                        ((C0676u) this.f9712b.f32829p.getValue()).getClass();
                        ARouter.getInstance().build("/collect/record").navigation();
                        break;
                }
            }
        });
        final BookingHistoryPage bookingHistoryPage3 = n().f9723a;
        RecyclerView recyclerView = l(bookingHistoryPage3).getRecyclerView();
        Intrinsics.checkNotNullParameter(bookingHistoryPage3, "<this>");
        recyclerView.setLayoutManager(new LinearLayoutManager(bookingHistoryPage3));
        l(bookingHistoryPage3).getRecyclerView().addItemDecoration(new r());
        l(bookingHistoryPage3).setRefreshEnable(true);
        l(bookingHistoryPage3).setLoadMoreEnable(true);
        l(bookingHistoryPage3).setOnLoadListener(new C0674s(bookingHistoryPage3));
        SwipeRecyclerView swipeRecyclerViewL = l(bookingHistoryPage3);
        Object value5 = bookingHistoryPage3.f32823e.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        Object value6 = bookingHistoryPage3.f32822d.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((ImageView) value6).setImageResource(com.transsnet.palmpay.custom_view.r.cv_empty_no_transaction_history);
        Object value7 = bookingHistoryPage3.f32821c.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((TextView) value7).setText("No Booking Yet");
        Object value8 = bookingHistoryPage3.f32820b.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        final int i12 = 0;
        ((CardView) value8).setOnClickListener(new View.OnClickListener(bookingHistoryPage3) { // from class: Uc.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BookingHistoryPage f9712b;

            {
                this.f9712b = bookingHistoryPage3;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f9712b.finish();
                        break;
                    case 1:
                        ((C0676u) this.f9712b.f32829p.getValue()).getClass();
                        ARouter.getInstance().build("/collect/record").navigation();
                        break;
                    default:
                        ((C0676u) this.f9712b.f32829p.getValue()).getClass();
                        ARouter.getInstance().build("/collect/record").navigation();
                        break;
                }
            }
        });
        swipeRecyclerViewL.setEmptyView((FrameLayout) value5);
        l(bookingHistoryPage3).setAdapter((C0670n) bookingHistoryPage3.t.getValue());
    }
}
