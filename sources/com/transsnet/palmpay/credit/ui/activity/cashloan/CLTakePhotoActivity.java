package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Dd.b;
import O6.c;
import O6.d;
import Ya.e;
import Ya.f;
import Ya.g;
import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.AbstractC1032a;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.rmondjone.camera.AspectRatio;
import com.rmondjone.camera.CameraPreview;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLUploadImgDialog;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p220oa.h;
import p294tb.o0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit授信拍照页", path = "/credit_score/ol_take_photo_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLTakePhotoActivity;", "Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcApplyBaseActivity;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLTakePhotoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLTakePhotoActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/cashloan/CLTakePhotoActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,631:1\n1#2:632\n*E\n"})
public final class CLTakePhotoActivity extends OcApplyBaseActivity {

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ int f29134F0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public CameraPreview f29135A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public File f29136B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public CLUploadImgDialog f29137C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public String f29138D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f29139E0 = true;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29140Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29141Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29142k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29143p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29144q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29145r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29146s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f29147t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f29148u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f29149v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f29150w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f29151x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Camera f29152y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f29153z0;

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

    public CLTakePhotoActivity() {
        final int i7 = 4;
        this.f29140Y = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i7) {
                    case 0:
                        int i10 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i11 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i12 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i13 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i14 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i15 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i16 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i17 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i18 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i10 = 7;
        this.f29141Z = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i10) {
                    case 0:
                        int i11 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i12 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i13 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i14 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i15 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i16 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i17 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i18 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i11 = 8;
        this.f29142k0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i11) {
                    case 0:
                        int i12 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i13 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i14 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i15 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i16 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i17 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i18 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i12 = 9;
        this.f29143p0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i12) {
                    case 0:
                        int i13 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i14 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i15 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i16 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i17 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i18 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i112 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i13 = 10;
        this.f29144q0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i13) {
                    case 0:
                        int i14 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i15 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i16 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i17 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i18 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i112 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i113 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i14 = 11;
        this.f29145r0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i14) {
                    case 0:
                        int i15 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i16 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i17 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i18 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i112 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i113 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i114 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i15 = 0;
        this.f29146s0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i15) {
                    case 0:
                        int i16 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i17 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i18 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i112 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i113 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i114 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i115 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i16 = 1;
        this.f29147t0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i16) {
                    case 0:
                        int i17 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i18 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i112 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i113 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i114 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i115 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i116 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i17 = 2;
        this.f29148u0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i17) {
                    case 0:
                        int i18 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i112 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i113 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i114 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i115 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i116 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i117 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i18 = 3;
        this.f29149v0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i18) {
                    case 0:
                        int i19 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i112 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i113 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i114 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i115 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i116 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i117 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i118 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i19 = 5;
        this.f29150w0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i19) {
                    case 0:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i112 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i113 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i114 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i115 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i116 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i117 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i118 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i119 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i20 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
        final int i20 = 6;
        this.f29151x0 = C2131j.b(new Function0(this) { // from class: tb.p0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLTakePhotoActivity f42498b;

            {
                this.f42498b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLTakePhotoActivity cLTakePhotoActivity = this.f42498b;
                switch (i20) {
                    case 0:
                        int i110 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.first_tips_tv);
                    case 1:
                        int i111 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.router_title_tv);
                    case 2:
                        int i112 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_back_img);
                    case 3:
                        int i113 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.router_close_img);
                    case 4:
                        int i114 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.done_tv);
                    case 5:
                        int i115 = CLTakePhotoActivity.f29134F0;
                        return cLTakePhotoActivity.findViewById(e.focus_img);
                    case 6:
                        int i116 = CLTakePhotoActivity.f29134F0;
                        return (FrameLayout) cLTakePhotoActivity.findViewById(e.camera_preview_fl);
                    case 7:
                        int i117 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.try_again_tv);
                    case 8:
                        int i118 = CLTakePhotoActivity.f29134F0;
                        return (ConstraintLayout) cLTakePhotoActivity.findViewById(e.review_photo_cl);
                    case 9:
                        int i119 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.take_photo_img);
                    case 10:
                        int i21 = CLTakePhotoActivity.f29134F0;
                        return (ImageView) cLTakePhotoActivity.findViewById(e.photo_img);
                    default:
                        int i22 = CLTakePhotoActivity.f29134F0;
                        return (TextView) cLTakePhotoActivity.findViewById(e.second_tips_tv);
                }
            }
        });
    }

    public static final void y(CLTakePhotoActivity cLTakePhotoActivity) {
        File file = cLTakePhotoActivity.f29136B0;
        t tVar = cLTakePhotoActivity.f29144q0;
        if (file != null) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ImageView imageView = (ImageView) value;
            if (imageView != null) {
                imageView.setImageURI(Uri.fromFile(cLTakePhotoActivity.f29136B0));
            }
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ImageView imageView2 = (ImageView) value2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        Object value3 = cLTakePhotoActivity.f29151x0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        FrameLayout frameLayout = (FrameLayout) value3;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        Object value4 = cLTakePhotoActivity.f29146s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setVisibility(8);
        Object value5 = cLTakePhotoActivity.f29145r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TextView) value5).setVisibility(8);
        Object value6 = cLTakePhotoActivity.f29150w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((View) value6).setVisibility(8);
        Object value7 = cLTakePhotoActivity.f29143p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ImageView imageView3 = (ImageView) value7;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        Object value8 = cLTakePhotoActivity.f29142k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) value8;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
    }

    public final void A() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivity(intent);
        finish();
    }

    public final void B() {
        c cVar = new c(this);
        cVar.f6598d = getString(g.cs_cl_require_permission_dialog_title);
        String string = getString(k.core_ok);
        o0 o0Var = new o0(this, 0);
        cVar.f6600f = string;
        cVar.f6602h = o0Var;
        d dVarA = cVar.a();
        dVarA.setOnDismissListener(new b(this, 29));
        dVarA.show();
    }

    public final void C() {
        try {
            Camera camera = this.f29152y0;
            if (camera != null) {
                camera.startPreview();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            ToastUtils.showLong(e10.getMessage(), new Object[0]);
            setResult(1001);
            finish();
        }
        Object value = this.f29144q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ImageView imageView = (ImageView) value;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Object value2 = this.f29151x0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        FrameLayout frameLayout = (FrameLayout) value2;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        Object value3 = this.f29146s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        TextView textView = (TextView) value3;
        if (textView != null) {
            textView.setVisibility(0);
        }
        Object value4 = this.f29145r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        TextView textView2 = (TextView) value4;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        Object value5 = this.f29150w0.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((View) value5).setVisibility(0);
        Object value6 = this.f29143p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ImageView imageView2 = (ImageView) value6;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        Object value7 = this.f29142k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) value7;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    public final void D() {
        w();
        try {
            this.f29152y0 = Camera.open(1);
            this.f29135A0 = new CameraPreview(this, this.f29152y0, AspectRatio.c(MessageEvent.EVENT_CL_REPAYMENT_FAILED, 625));
            Object value = this.f29151x0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            FrameLayout frameLayout = (FrameLayout) value;
            if (frameLayout != null) {
                CameraPreview cameraPreview = this.f29135A0;
                if (cameraPreview != null) {
                    frameLayout.addView(cameraPreview);
                } else {
                    Intrinsics.n("mCameraPreview");
                    throw null;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            ToastUtils.showLong(e10.getMessage(), new Object[0]);
            setResult(1001);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_take_photo_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        getWindow().addFlags(67108864);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            try {
                Camera camera = this.f29152y0;
                if (camera != null) {
                    if (camera != null) {
                        camera.stopPreview();
                    }
                    Camera camera2 = this.f29152y0;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    this.f29152y0 = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            try {
                Camera camera = this.f29152y0;
                if (camera != null) {
                    if (camera != null) {
                        camera.stopPreview();
                    }
                    Camera camera2 = this.f29152y0;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    this.f29152y0 = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                setResult(1001);
                finish();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 1000) {
            int length = grantResults.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (grantResults[i10] != 0) {
                    if (this.f29139E0) {
                        B();
                        this.f29139E0 = false;
                        return;
                    } else if (!AbstractC1032a.h(this, permissions[i10])) {
                        A();
                        return;
                    } else {
                        if (grantResults[i10] != 0) {
                            B();
                            return;
                        }
                        return;
                    }
                }
            }
            D();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            try {
                if (this.f29152y0 == null) {
                    Camera cameraOpen = Camera.open(1);
                    this.f29152y0 = cameraOpen;
                    CameraPreview cameraPreview = this.f29135A0;
                    if (cameraPreview == null) {
                        Intrinsics.n("mCameraPreview");
                        throw null;
                    }
                    cameraPreview.setCamera(cameraOpen);
                }
                Camera camera = this.f29152y0;
                if (camera != null) {
                    camera.startPreview();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ToastUtils.showLong(e10.getMessage(), new Object[0]);
                setResult(1001);
                finish();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        BarUtils.setStatusBarLightMode((Activity) this, true);
        this.f29138D0 = getIntent().getStringExtra("cl_take_photo_operate_type");
        TextView textView = (TextView) this.f29147t0.getValue();
        if (textView != null) {
            textView.setText(getString(g.cs_take_selfie));
        }
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            D();
        } else {
            AbstractC1032a.g(this, new String[]{"android.permission.CAMERA"}, 1000);
        }
        View view = (View) this.f29148u0.getValue();
        if (view != null) {
            h.l(new o0(this, 1), view);
        }
        Object value = this.f29149v0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        View view2 = (View) value;
        if (view2 != null) {
            h.l(new o0(this, 2), view2);
        }
        Object value2 = this.f29143p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        h.l(new o0(this, 3), (ImageView) value2);
        Object value3 = this.f29141Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        h.l(new o0(this, 4), (TextView) value3);
        Object value4 = this.f29140Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        h.l(new o0(this, 5), (TextView) value4);
        HashMap map = new HashMap();
        map.put(LogConstants.Autotrack.ELEMENT_EXTRA_TYPE, "CLTakePhotoActivity_type=" + this.f29261w);
        AutoTrackUtil.trackActivityProperties(this, map);
    }

    public final void z() {
        if (Intrinsics.c(this.f29249C, "oc_use_type_router")) {
            r();
        } else {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_VERIFY_PHOTO_SUCCESS));
            finish();
        }
    }
}
