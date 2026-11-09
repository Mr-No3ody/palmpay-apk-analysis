package com.transsnet.palmpay.send_money.ui.activity;

import G9.r;
import L6.b;
import Oc.A;
import Pa.r0;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.send_money.ui.activity.TransferToBaseActivity;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.c;
import p159kd.e;
import p159kd.f;
import p173ld.o;
import p220oa.h;
import p270rd.Y;
import p270rd.Z;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/TransferToBaseActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBaseActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransferToBaseActivity\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,272:1\n108#2:273\n80#2,22:274\n*S KotlinDebug\n*F\n+ 1 TransferToBaseActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/TransferToBaseActivity\n*L\n247#1:273\n247#1:274,22\n*E\n"})
public abstract class TransferToBaseActivity<VM extends BaseViewModel> extends BaseMvvmActivity<VM> {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f33258Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f33259A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f33260B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f33261C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f33262H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f33263L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final o f33264M;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33269g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33271j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33273p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33274v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33275w;

    public TransferToBaseActivity() {
        final int i7 = 16;
        this.f33265c = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i7) {
                    case 0:
                        int i10 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i11 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i12 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i13 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i14 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i15 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i16 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i17 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i18 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i10 = 6;
        this.f33266d = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i10) {
                    case 0:
                        int i11 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i12 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i13 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i14 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i15 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i16 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i17 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i18 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i11 = 8;
        this.f33267e = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i11) {
                    case 0:
                        int i12 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i13 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i14 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i15 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i16 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i17 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i18 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i12 = 9;
        C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i12) {
                    case 0:
                        int i13 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i14 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i15 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i16 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i17 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i18 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i13 = 10;
        this.f33268f = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i13) {
                    case 0:
                        int i14 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i15 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i16 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i17 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i18 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i14 = 11;
        this.f33269g = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i14) {
                    case 0:
                        int i15 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i16 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i17 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i18 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i15 = 12;
        this.f33270i = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i15) {
                    case 0:
                        int i16 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i17 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i18 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i16 = 13;
        this.f33271j = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i16) {
                    case 0:
                        int i17 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i18 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i17 = 14;
        C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i17) {
                    case 0:
                        int i18 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i18 = 15;
        this.f33272o = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i18) {
                    case 0:
                        int i19 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i19 = 17;
        this.f33273p = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i19) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i20 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i20 = 18;
        this.t = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i20) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i21 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i21 = 19;
        this.f33274v = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i21) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i22 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i211 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i22 = 20;
        C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i22) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i23 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i211 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i212 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i23 = 0;
        this.f33275w = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i23) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i24 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i211 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i212 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i213 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i24 = 1;
        this.f33259A = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i24) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i25 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i211 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i212 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i213 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i214 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i25 = 2;
        this.f33260B = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i25) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i26 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i211 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i212 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i213 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i214 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i215 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i26 = 3;
        C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i26) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i27 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i211 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i212 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i213 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i214 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i215 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i216 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i27 = 4;
        C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i27) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i28 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i211 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i212 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i213 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i214 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i215 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i216 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i217 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i28 = 5;
        C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i28) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i29 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i211 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i212 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i213 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i214 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i215 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i216 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i217 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i218 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        final int i29 = 7;
        this.f33261C = C2131j.b(new Function0(this) { // from class: rd.X

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41713b;

            {
                this.f41713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransferToBaseActivity transferToBaseActivity = this.f41713b;
                switch (i29) {
                    case 0:
                        int i110 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.name);
                    case 1:
                        int i111 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_auth);
                    case 2:
                        int i112 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.avatar);
                    case 3:
                        int i113 = TransferToBaseActivity.f33258Q;
                        return (LottieAnimationView) transferToBaseActivity.findViewById(e.animView);
                    case 4:
                        int i114 = TransferToBaseActivity.f33258Q;
                        return (RelativeLayout) transferToBaseActivity.findViewById(e.infoView);
                    case 5:
                        int i115 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.viewContainer);
                    case 6:
                        int i116 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.balance_tv);
                    case 7:
                        int i117 = TransferToBaseActivity.f33258Q;
                        return (PpTitleBar) transferToBaseActivity.findViewById(e.title_bar);
                    case 8:
                        int i118 = TransferToBaseActivity.f33258Q;
                        return (AppCompatCheckBox) transferToBaseActivity.findViewById(e.balance_cb);
                    case 9:
                        int i119 = TransferToBaseActivity.f33258Q;
                        return (LinearLayout) transferToBaseActivity.findViewById(e.bottomView);
                    case 10:
                        int i210 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_hint);
                    case 11:
                        int i211 = TransferToBaseActivity.f33258Q;
                        return (Group) transferToBaseActivity.findViewById(e.g_edit_note);
                    case 12:
                        int i212 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_note_length);
                    case 13:
                        int i213 = TransferToBaseActivity.f33258Q;
                        return (EditText) transferToBaseActivity.findViewById(e.et_note);
                    case 14:
                        int i214 = TransferToBaseActivity.f33258Q;
                        return (ConstraintLayout) transferToBaseActivity.findViewById(e.cl_note);
                    case 15:
                        int i215 = TransferToBaseActivity.f33258Q;
                        return (StateAmountEditText) transferToBaseActivity.findViewById(e.transfer_money_et);
                    case 16:
                        int i216 = TransferToBaseActivity.f33258Q;
                        return (DigitalKeyboardView) transferToBaseActivity.findViewById(e.keyboard_view);
                    case 17:
                        int i217 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.currency_tv);
                    case 18:
                        int i218 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_relationship);
                    case 19:
                        int i219 = TransferToBaseActivity.f33258Q;
                        return (TextView) transferToBaseActivity.findViewById(e.tv_account);
                    default:
                        int i30 = TransferToBaseActivity.f33258Q;
                        return (ImageView) transferToBaseActivity.findViewById(e.iv_user_type);
                }
            }
        });
        this.f33263L = true;
        this.f33264M = new o(this, 18);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_transfer_to_base_activity;
    }

    public final void m() {
        String string = p().getText().toString();
        int length = string.length() - 1;
        int i7 = 0;
        boolean z3 = false;
        while (i7 <= length) {
            boolean z8 = Intrinsics.h(string.charAt(!z3 ? i7 : length), 32) <= 0;
            if (z3) {
                if (!z8) {
                    break;
                } else {
                    length--;
                }
            } else if (z8) {
                i7++;
            } else {
                z3 = true;
            }
        }
        int length2 = string.subSequence(i7, length + 1).toString().length();
        t tVar = this.f33269g;
        if (length2 > 0) {
            v().setVisibility(8);
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((Group) value).setVisibility(0);
            return;
        }
        v().setVisibility(0);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((Group) value2).setVisibility(8);
    }

    public final AppCompatCheckBox n() {
        Object value = this.f33267e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AppCompatCheckBox) value;
    }

    public final TextView o() {
        Object value = this.f33266d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    public final EditText p() {
        Object value = this.f33271j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final DigitalKeyboardView q() {
        Object value = this.f33265c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DigitalKeyboardView) value;
    }

    public final TextView r() {
        Object value = this.f33275w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final PpTitleBar s() {
        Object value = this.f33261C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpTitleBar) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public void setupView() {
        super.setupView();
        initStatusBar(getColor(b.ppColorBackgroundLight));
        ARouter.getInstance().inject(this);
        c.b().j(this);
        t().setShowSoftInputOnFocus(false);
        q().setDigitalKeyboardClickListener(new Z(this));
        t().f30975b = false;
        t().addTextChangedListener(new Y(this, 1));
        q().setActionButtonEnable(false);
        final int i7 = 0;
        t().setOnTouchListener(new View.OnTouchListener(this) { // from class: rd.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41711b;

            {
                this.f41711b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                TransferToBaseActivity transferToBaseActivity = this.f41711b;
                switch (i7) {
                    case 0:
                        int i10 = TransferToBaseActivity.f33258Q;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            transferToBaseActivity.f33263L = true;
                            KeyboardUtils.hideSoftInput(transferToBaseActivity.p());
                            transferToBaseActivity.m();
                        }
                        break;
                    case 1:
                        int i11 = TransferToBaseActivity.f33258Q;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            transferToBaseActivity.f33263L = false;
                            h.s(transferToBaseActivity.q(), false);
                        }
                        break;
                    default:
                        int i12 = TransferToBaseActivity.f33258Q;
                        if (event.getAction() == 0) {
                            KeyboardUtils.hideSoftInput(transferToBaseActivity.p());
                        }
                        break;
                }
                return false;
            }
        });
        p().setOnEditorActionListener(new A(this, 5));
        final int i10 = 1;
        p().setOnTouchListener(new View.OnTouchListener(this) { // from class: rd.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41711b;

            {
                this.f41711b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                TransferToBaseActivity transferToBaseActivity = this.f41711b;
                switch (i10) {
                    case 0:
                        int i11 = TransferToBaseActivity.f33258Q;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            transferToBaseActivity.f33263L = true;
                            KeyboardUtils.hideSoftInput(transferToBaseActivity.p());
                            transferToBaseActivity.m();
                        }
                        break;
                    case 1:
                        int i12 = TransferToBaseActivity.f33258Q;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            transferToBaseActivity.f33263L = false;
                            h.s(transferToBaseActivity.q(), false);
                        }
                        break;
                    default:
                        int i13 = TransferToBaseActivity.f33258Q;
                        if (event.getAction() == 0) {
                            KeyboardUtils.hideSoftInput(transferToBaseActivity.p());
                        }
                        break;
                }
                return false;
            }
        });
        p().addTextChangedListener(new Y(this, 0));
        final int i11 = 2;
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new r(this, i11));
        v().setOnClickListener(this.f33264M);
        findViewById(e.viewContainer).setOnTouchListener(new View.OnTouchListener(this) { // from class: rd.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBaseActivity f41711b;

            {
                this.f41711b = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                TransferToBaseActivity transferToBaseActivity = this.f41711b;
                switch (i11) {
                    case 0:
                        int i12 = TransferToBaseActivity.f33258Q;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            transferToBaseActivity.f33263L = true;
                            KeyboardUtils.hideSoftInput(transferToBaseActivity.p());
                            transferToBaseActivity.m();
                        }
                        break;
                    case 1:
                        int i13 = TransferToBaseActivity.f33258Q;
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event.getAction() == 0) {
                            transferToBaseActivity.f33263L = false;
                            h.s(transferToBaseActivity.q(), false);
                        }
                        break;
                    default:
                        int i14 = TransferToBaseActivity.f33258Q;
                        if (event.getAction() == 0) {
                            KeyboardUtils.hideSoftInput(transferToBaseActivity.p());
                        }
                        break;
                }
                return false;
            }
        });
        Object value = this.f33273p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(BaseApplication.getCurrencySymbol());
        r0.R1(t(), "fonts/PalmPayNum-Bold.ttf");
    }

    public final StateAmountEditText t() {
        Object value = this.f33272o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (StateAmountEditText) value;
    }

    public final TextView u() {
        Object value = this.f33274v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView v() {
        Object value = this.f33268f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public abstract void w();
}
