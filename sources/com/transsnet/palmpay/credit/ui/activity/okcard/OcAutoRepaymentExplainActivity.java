package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Pa.Y;
import Pa.r0;
import Ya.e;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.UserDeduceDateResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAutoRepaymentExplainActivity;
import com.transsnet.palmpay.util.BarUtils;
import df.i;
import io.reactivex.internal.operators.observable.K;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p284sb.A;
import p310ub.C2103u;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2140h;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC自动还款说明页", path = "/credit_score/oc_auto_repayment_explain_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcAutoRepaymentExplainActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcAutoRepaymentExplainActivity extends Za.b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f29327B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C2140h f29328A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29332g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29333i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29334j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29336p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29337v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f29338w;

    public OcAutoRepaymentExplainActivity() {
        final int i7 = 2;
        this.f29329d = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i7) {
                    case 0:
                        int i10 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i11 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i12 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i13 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i14 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i15 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i16 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i17 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i18 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
        final int i10 = 3;
        this.f29330e = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i10) {
                    case 0:
                        int i11 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i12 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i13 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i14 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i15 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i16 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i17 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i18 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i110 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
        final int i11 = 4;
        this.f29331f = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i11) {
                    case 0:
                        int i12 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i13 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i14 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i15 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i16 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i17 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i18 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i110 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i111 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
        final int i12 = 5;
        this.f29332g = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i12) {
                    case 0:
                        int i13 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i14 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i15 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i16 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i17 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i18 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i110 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i111 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i112 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
        final int i13 = 6;
        this.f29333i = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i13) {
                    case 0:
                        int i14 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i15 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i16 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i17 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i18 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i110 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i111 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i112 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i113 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
        final int i14 = 7;
        this.f29334j = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i14) {
                    case 0:
                        int i15 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i16 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i17 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i18 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i110 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i111 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i112 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i113 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i114 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
        final int i15 = 8;
        this.f29335o = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i15) {
                    case 0:
                        int i16 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i17 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i18 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i110 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i111 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i112 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i113 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i114 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i115 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
        final int i16 = 9;
        this.f29336p = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i16) {
                    case 0:
                        int i17 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i18 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i110 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i111 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i112 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i113 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i114 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i115 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i116 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
        final int i17 = 0;
        this.t = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i17) {
                    case 0:
                        int i18 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i110 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i111 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i112 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i113 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i114 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i115 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i116 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i117 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
        final int i18 = 1;
        this.f29337v = C2131j.b(new Function0(this) { // from class: ub.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcAutoRepaymentExplainActivity f42922b;

            {
                this.f42922b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42922b;
                switch (i18) {
                    case 0:
                        int i19 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvRepaymentDate);
                    case 1:
                        int i110 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvDueDateTitle);
                    case 2:
                        int i111 = OcAutoRepaymentExplainActivity.f29327B;
                        return (RecyclerView) ocAutoRepaymentExplainActivity.findViewById(e.bank_card_method_rv);
                    case 3:
                        int i112 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.bank_title_tv);
                    case 4:
                        int i113 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.payment_num_tv);
                    case 5:
                        int i114 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.btnBottomTips);
                    case 6:
                        int i115 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnPayWithFlexi);
                    case 7:
                        int i116 = OcAutoRepaymentExplainActivity.f29327B;
                        return (PpButton) ocAutoRepaymentExplainActivity.findViewById(e.btnBorrow);
                    case 8:
                        int i117 = OcAutoRepaymentExplainActivity.f29327B;
                        return (TextView) ocAutoRepaymentExplainActivity.findViewById(e.tvNoOutstanding);
                    default:
                        int i118 = OcAutoRepaymentExplainActivity.f29327B;
                        return ocAutoRepaymentExplainActivity.findViewById(e.ivNoOutstanding);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_auto_repay_explain_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        p221ob.a aVar = p221ob.c.f40268a;
        aVar.getInstance().getClass();
        df.d<UserDeduceDateResp> dVarQueryUserDeduceDate = p221ob.c.a().queryUserDeduceDate();
        dVarQueryUserDeduceDate.getClass();
        i iVar = p298tf.f.f42629b;
        new K(dVarQueryUserDeduceDate.k(iVar), iVar, 1).i(p071ef.b.a()).c(new Y(new WeakReference(this), 1)).subscribe(new C2103u(this, 1));
        aVar.getInstance().getClass();
        p221ob.c.a().getAutoRepaymentBankCardList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2103u(this, 0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String strY;
        String strSubstring;
        initStatusBar(getColor(Ya.b.cs_oc_auto_repayment_bg_color));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        String strX = r0.X(BaseApplication.getInstance().getUser().getPhoneNumber());
        Object value = this.f29331f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        if ((strX != null ? strX.length() : 0) >= 4) {
            if (strX != null) {
                strSubstring = strX.substring(strX.length() - 4, strX.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = null;
            }
            strY = G.o("**** ", strSubstring);
        } else {
            strY = r0.Y(strX);
        }
        textView.setText(strY);
        this.f29338w = new ArrayList();
        ArrayList data = this.f29338w;
        if (data == null) {
            Intrinsics.n("mBankCardData");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f29328A = new C2140h(this, data);
        t tVar = this.f29329d;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        RecyclerView recyclerView = (RecyclerView) value3;
        C2140h c2140h = this.f29328A;
        if (c2140h == null) {
            Intrinsics.n("mBankCardAdapter");
            throw null;
        }
        recyclerView.setAdapter(c2140h);
        Object value4 = this.f29334j.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        PpButton ppButton = (PpButton) value4;
        if (ppButton != null) {
            p220oa.h.l(new A(19), ppButton);
        }
        Object value5 = this.f29333i.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        PpButton ppButton2 = (PpButton) value5;
        if (ppButton2 != null) {
            p220oa.h.l(new A(20), ppButton2);
        }
    }
}
