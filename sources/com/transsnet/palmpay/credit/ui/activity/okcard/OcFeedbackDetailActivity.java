package com.transsnet.palmpay.credit.ui.activity.okcard;

import M.q;
import Oc.C0500c;
import Pa.r0;
import Ya.e;
import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.bumptech.glide.m;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.resp.OcFeedbackHistoryDetail;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackDetailActivity;
import com.transsnet.palmpay.util.BarUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p284sb.A;
import p285sc.x;
import p310ub.T;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2152u;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit反馈详情页", path = "/credit_score/oc_feedback_detail_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcFeedbackDetailActivity;", "LZa/b;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcFeedbackDetailActivity extends Za.b {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f29439L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29440A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f29441B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C2152u f29442C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public OcFeedbackHistoryDetail f29443H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29447g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29449j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29451p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29453w;

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

    public OcFeedbackDetailActivity() {
        final int i7 = 4;
        this.f29444d = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i7) {
                    case 0:
                        int i10 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i11 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i12 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i13 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i14 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i15 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i16 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i17 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i18 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i10 = 7;
        this.f29445e = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i10) {
                    case 0:
                        int i11 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i12 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i13 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i14 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i15 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i16 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i17 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i18 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i11 = 8;
        this.f29446f = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i11) {
                    case 0:
                        int i12 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i13 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i14 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i15 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i16 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i17 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i18 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i12 = 9;
        this.f29447g = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i12) {
                    case 0:
                        int i13 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i14 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i15 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i16 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i17 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i18 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i112 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i13 = 10;
        this.f29448i = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i13) {
                    case 0:
                        int i14 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i15 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i16 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i17 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i18 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i112 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i113 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i14 = 11;
        this.f29449j = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i14) {
                    case 0:
                        int i15 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i16 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i17 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i18 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i112 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i113 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i114 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i15 = 0;
        this.f29450o = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i15) {
                    case 0:
                        int i16 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i17 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i18 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i112 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i113 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i114 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i115 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i16 = 1;
        this.f29451p = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i16) {
                    case 0:
                        int i17 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i18 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i112 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i113 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i114 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i115 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i116 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i17 = 2;
        this.t = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i17) {
                    case 0:
                        int i18 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i112 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i113 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i114 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i115 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i116 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i117 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i18 = 3;
        this.f29452v = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i18) {
                    case 0:
                        int i19 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i112 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i113 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i114 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i115 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i116 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i117 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i118 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i19 = 5;
        this.f29453w = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i19) {
                    case 0:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i112 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i113 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i114 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i115 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i116 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i117 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i118 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i119 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i20 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
        final int i20 = 6;
        this.f29440A = C2131j.b(new Function0(this) { // from class: ub.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcFeedbackDetailActivity f42788b;

            {
                this.f42788b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcFeedbackDetailActivity ocFeedbackDetailActivity = this.f42788b;
                switch (i20) {
                    case 0:
                        int i110 = OcFeedbackDetailActivity.f29439L;
                        return (RecyclerView) ocFeedbackDetailActivity.findViewById(e.feedback_img_rv);
                    case 1:
                        int i111 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_content_tv);
                    case 2:
                        int i112 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.submit_time_tv);
                    case 3:
                        int i113 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.user_avatar_img);
                    case 4:
                        int i114 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.phone_tv);
                    case 5:
                        int i115 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_status_tv);
                    case 6:
                        int i116 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_title_tv);
                    case 7:
                        int i117 = OcFeedbackDetailActivity.f29439L;
                        return (ImageView) ocFeedbackDetailActivity.findViewById(e.reply_img);
                    case 8:
                        int i118 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_content_tv);
                    case 9:
                        int i119 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.reply_time_tv);
                    case 10:
                        int i21 = OcFeedbackDetailActivity.f29439L;
                        return (LinearLayout) ocFeedbackDetailActivity.findViewById(e.complete_fl);
                    default:
                        int i22 = OcFeedbackDetailActivity.f29439L;
                        return (TextView) ocFeedbackDetailActivity.findViewById(e.feedback_no_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_feedback_detail_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final TextView m() {
        Object value = this.f29453w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String solverImage;
        Long updateTime;
        Long createTime;
        Object value = this.f29440A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail = this.f29443H;
        textView.setText(ocFeedbackHistoryDetail != null ? ocFeedbackHistoryDetail.getFeedbackType() : null);
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail2 = this.f29443H;
        Integer status = ocFeedbackHistoryDetail2 != null ? ocFeedbackHistoryDetail2.getStatus() : null;
        t tVar = this.f29448i;
        if (status != null && status.intValue() == 2) {
            m().setTextColor(getColor(Ya.b.cs_oc_feed_complete_txt_color));
            m().setText(getString(Ya.g.cs_oc_feedback_completed));
            m().setBackground(getResources().getDrawable(Ya.d.cs_oc_feedback_status_tv_bg));
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((LinearLayout) value2).setVisibility(0);
        } else {
            m().setTextColor(getColor(Ya.b.cs_oc_feed_uncomplete_txt_color));
            m().setText(getString(Ya.g.cs_oc_feedback_ongoing));
            m().setBackground(getResources().getDrawable(Ya.d.cs_oc_feedback_status_tv_bg2));
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((LinearLayout) value3).setVisibility(8);
        }
        Object value4 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        TextView textView2 = (TextView) value4;
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail3 = this.f29443H;
        long jLongValue = 0;
        textView2.setText(r0.X1(Long.valueOf((ocFeedbackHistoryDetail3 == null || (createTime = ocFeedbackHistoryDetail3.getCreateTime()) == null) ? 0L : createTime.longValue()), "HH:mm, MMM dd, yyyy"));
        Object value5 = this.f29451p.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        TextView textView3 = (TextView) value5;
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail4 = this.f29443H;
        textView3.setText(ocFeedbackHistoryDetail4 != null ? ocFeedbackHistoryDetail4.getContent() : null);
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail5 = this.f29443H;
        if (TextUtils.isEmpty(ocFeedbackHistoryDetail5 != null ? ocFeedbackHistoryDetail5.getRemark() : null)) {
            return;
        }
        Object value6 = this.f29447g.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        TextView textView4 = (TextView) value6;
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail6 = this.f29443H;
        if (ocFeedbackHistoryDetail6 != null && (updateTime = ocFeedbackHistoryDetail6.getUpdateTime()) != null) {
            jLongValue = updateTime.longValue();
        }
        textView4.setText(r0.X1(Long.valueOf(jLongValue), "HH:mm, MMM dd, yyyy"));
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail7 = this.f29443H;
        Spanned spannedFromHtml = Html.fromHtml(ocFeedbackHistoryDetail7 != null ? ocFeedbackHistoryDetail7.getRemark() : null);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        q qVarA = AbstractC1859i.a((URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class));
        while (qVarA.hasNext()) {
            URLSpan uRLSpan = (URLSpan) qVarA.next();
            spannableStringBuilder.setSpan(new C0500c(uRLSpan, 19), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        t tVar2 = this.f29446f;
        Object value7 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((TextView) value7).setText(spannableStringBuilder);
        Object value8 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ((TextView) value8).setHighlightColor(0);
        Object value9 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        ((TextView) value9).setMovementMethod(LinkMovementMethod.getInstance());
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail8 = this.f29443H;
        if (ocFeedbackHistoryDetail8 == null || (solverImage = ocFeedbackHistoryDetail8.getSolverImage()) == null) {
            return;
        }
        m mVarLoad = com.bumptech.glide.b.c(this).e(this).load(solverImage);
        Object value10 = this.f29445e.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        mVarLoad.S((ImageView) value10);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String feedbackImage;
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        String stringExtra = getIntent().getStringExtra("oc_feedback_detail");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f29443H = (OcFeedbackHistoryDetail) d0.l(OcFeedbackHistoryDetail.class, stringExtra);
        }
        this.f29441B = new ArrayList();
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail = this.f29443H;
        if (!TextUtils.isEmpty(ocFeedbackHistoryDetail != null ? ocFeedbackHistoryDetail.getFeedbackImage() : null)) {
            OcFeedbackHistoryDetail ocFeedbackHistoryDetail2 = this.f29443H;
            List listSplit$default = (ocFeedbackHistoryDetail2 == null || (feedbackImage = ocFeedbackHistoryDetail2.getFeedbackImage()) == null) ? null : StringsKt__StringsKt.split$default(feedbackImage, new String[]{","}, false, 0, 6, null);
            if (listSplit$default != null && !listSplit$default.isEmpty()) {
                ArrayList arrayList = this.f29441B;
                if (arrayList == null) {
                    Intrinsics.n("mImageData");
                    throw null;
                }
                arrayList.addAll(listSplit$default);
            }
        }
        ArrayList arrayList2 = this.f29441B;
        if (arrayList2 == null) {
            Intrinsics.n("mImageData");
            throw null;
        }
        this.f29442C = new C2152u(this, arrayList2);
        t tVar = this.f29450o;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new GridLayoutManager(this, 4));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).addItemDecoration(new T());
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        RecyclerView recyclerView = (RecyclerView) value3;
        C2152u c2152u = this.f29442C;
        if (c2152u == null) {
            Intrinsics.n("mImageAdapter");
            throw null;
        }
        recyclerView.setAdapter(c2152u);
        t tVar2 = this.f29449j;
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        TextView textView = (TextView) value4;
        int i7 = Ya.g.cs_feedback_no;
        OcFeedbackHistoryDetail ocFeedbackHistoryDetail3 = this.f29443H;
        textView.setText(getString(i7, ocFeedbackHistoryDetail3 != null ? ocFeedbackHistoryDetail3.getFeedbackNo() : null));
        String avatar = BaseApplication.getInstance().getUser().getAvatar();
        if (!TextUtils.isEmpty(avatar)) {
            m mVarLoad = com.bumptech.glide.b.c(this).e(this).load(avatar);
            Object value5 = this.f29452v.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            mVarLoad.S((ImageView) value5);
        }
        Object value6 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        p220oa.h.l(new x(this, 19), (TextView) value6);
        Object value7 = this.f29444d.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        p220oa.h.l(new A(21), (TextView) value7);
    }
}
