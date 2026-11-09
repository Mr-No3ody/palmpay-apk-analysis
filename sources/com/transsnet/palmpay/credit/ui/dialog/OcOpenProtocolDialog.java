package com.transsnet.palmpay.credit.ui.dialog;

import Oc.C0500c;
import Pa.AbstractC0511h;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.Group;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001d\u0010 \u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001d\u0010(\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001d\u0010-\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010,R\u001d\u00100\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u001d\u00103\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010,R\u001d\u00106\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010$R\u001d\u00109\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u0010\u001fR\u001d\u0010<\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u001d\u001a\u0004\b;\u0010,R\u001d\u0010?\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u001d\u001a\u0004\b>\u0010$R\u001d\u0010B\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u001d\u001a\u0004\bA\u0010\u001fR\u001d\u0010E\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u001d\u001a\u0004\bD\u0010,R\u001d\u0010J\u001a\u0004\u0018\u00010F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u001d\u001a\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcOpenProtocolDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "protocolType", "<init>", "(Landroid/content/Context;I)V", "", "initViews", "()V", "Landroid/view/View$OnClickListener;", "agreeListener", "setAgreeBtListener", "(Landroid/view/View$OnClickListener;)V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "setListener", "type", "jump2ProtoPageDetail", "(Ljava/lang/Integer;)V", "jump2CashProtoPageDetail", "checkProto", "()Z", "I", "Landroid/widget/TextView;", "agree_tv$delegate", "Lkotlin/Lazy;", "getAgree_tv", "()Landroid/widget/TextView;", "agree_tv", "Landroidx/constraintlayout/widget/Group;", "one_loop_group$delegate", "getOne_loop_group", "()Landroidx/constraintlayout/widget/Group;", "one_loop_group", "tvDebitMandate$delegate", "getTvDebitMandate", "tvDebitMandate", "Landroidx/appcompat/widget/AppCompatCheckBox;", "cbDebitMandate$delegate", "getCbDebitMandate", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "cbDebitMandate", "one_loop_tv$delegate", "getOne_loop_tv", "one_loop_tv", "bank_info_cb$delegate", "getBank_info_cb", "bank_info_cb", "privacy_group$delegate", "getPrivacy_group", "privacy_group", "privacy_prefix_tv$delegate", "getPrivacy_prefix_tv", "privacy_prefix_tv", "privacy_policy_cb$delegate", "getPrivacy_policy_cb", "privacy_policy_cb", "condition_group$delegate", "getCondition_group", "condition_group", "term_condition_tv$delegate", "getTerm_condition_tv", "term_condition_tv", "checkAgreement$delegate", "getCheckAgreement", "checkAgreement", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "mAgreeListener", "Landroid/view/View$OnClickListener;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcOpenProtocolDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcOpenProtocolDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/OcOpenProtocolDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
public final class OcOpenProtocolDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: agree_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy agree_tv;

    /* JADX INFO: renamed from: bank_info_cb$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bank_info_cb;

    /* JADX INFO: renamed from: cbDebitMandate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cbDebitMandate;

    /* JADX INFO: renamed from: checkAgreement$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy checkAgreement;

    /* JADX INFO: renamed from: condition_group$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy condition_group;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private View.OnClickListener mAgreeListener;

    /* JADX INFO: renamed from: one_loop_group$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy one_loop_group;

    /* JADX INFO: renamed from: one_loop_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy one_loop_tv;

    /* JADX INFO: renamed from: privacy_group$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy privacy_group;

    /* JADX INFO: renamed from: privacy_policy_cb$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy privacy_policy_cb;

    /* JADX INFO: renamed from: privacy_prefix_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy privacy_prefix_tv;
    private final int protocolType;

    /* JADX INFO: renamed from: term_condition_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy term_condition_tv;

    /* JADX INFO: renamed from: tvDebitMandate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvDebitMandate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcOpenProtocolDialog(@NotNull Context context, int i7) {
        super(context, Ya.f.cs_oc_protocol_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        this.protocolType = i7;
        final int i10 = 0;
        this.agree_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i11 = 7;
        this.one_loop_group = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i12 = 8;
        this.tvDebitMandate = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i13 = 9;
        this.cbDebitMandate = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i14 = 10;
        this.one_loop_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i15 = 11;
        this.bank_info_cb = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i16 = 12;
        this.privacy_group = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i17 = 1;
        this.privacy_prefix_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i18 = 2;
        this.privacy_policy_cb = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i19 = 3;
        this.condition_group = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i20 = 4;
        this.term_condition_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i21 = 5;
        this.checkAgreement = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
        final int i22 = 6;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcOpenProtocolDialog f29958b;

            {
                this.f29958b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return OcOpenProtocolDialog.agree_tv_delegate$lambda$0(this.f29958b);
                    case 1:
                        return OcOpenProtocolDialog.privacy_prefix_tv_delegate$lambda$7(this.f29958b);
                    case 2:
                        return OcOpenProtocolDialog.privacy_policy_cb_delegate$lambda$8(this.f29958b);
                    case 3:
                        return OcOpenProtocolDialog.condition_group_delegate$lambda$9(this.f29958b);
                    case 4:
                        return OcOpenProtocolDialog.term_condition_tv_delegate$lambda$10(this.f29958b);
                    case 5:
                        return OcOpenProtocolDialog.checkAgreement_delegate$lambda$11(this.f29958b);
                    case 6:
                        return OcOpenProtocolDialog.ivClose_delegate$lambda$12(this.f29958b);
                    case 7:
                        return OcOpenProtocolDialog.one_loop_group_delegate$lambda$1(this.f29958b);
                    case 8:
                        return OcOpenProtocolDialog.tvDebitMandate_delegate$lambda$2(this.f29958b);
                    case 9:
                        return OcOpenProtocolDialog.cbDebitMandate_delegate$lambda$3(this.f29958b);
                    case 10:
                        return OcOpenProtocolDialog.one_loop_tv_delegate$lambda$4(this.f29958b);
                    case 11:
                        return OcOpenProtocolDialog.bank_info_cb_delegate$lambda$5(this.f29958b);
                    default:
                        return OcOpenProtocolDialog.privacy_group_delegate$lambda$6(this.f29958b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView agree_tv_delegate$lambda$0(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (TextView) ocOpenProtocolDialog.findViewById(Ya.e.agree_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatCheckBox bank_info_cb_delegate$lambda$5(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (AppCompatCheckBox) ocOpenProtocolDialog.findViewById(Ya.e.bank_info_cb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatCheckBox cbDebitMandate_delegate$lambda$3(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (AppCompatCheckBox) ocOpenProtocolDialog.findViewById(Ya.e.cbDebitMandate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatCheckBox checkAgreement_delegate$lambda$11(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (AppCompatCheckBox) ocOpenProtocolDialog.findViewById(Ya.e.checkAgreement);
    }

    private final boolean checkProto() {
        AppCompatCheckBox checkAgreement;
        AppCompatCheckBox privacy_policy_cb;
        AppCompatCheckBox bank_info_cb;
        AppCompatCheckBox cbDebitMandate;
        AppCompatCheckBox checkAgreement2 = getCheckAgreement();
        if ((checkAgreement2 == null || checkAgreement2.getVisibility() != 8) && ((checkAgreement = getCheckAgreement()) == null || !checkAgreement.isChecked())) {
            return false;
        }
        AppCompatCheckBox privacy_policy_cb2 = getPrivacy_policy_cb();
        if ((privacy_policy_cb2 == null || privacy_policy_cb2.getVisibility() != 8) && ((privacy_policy_cb = getPrivacy_policy_cb()) == null || !privacy_policy_cb.isChecked())) {
            return false;
        }
        AppCompatCheckBox bank_info_cb2 = getBank_info_cb();
        return ((bank_info_cb2 != null && bank_info_cb2.getVisibility() == 8) || ((bank_info_cb = getBank_info_cb()) != null && bank_info_cb.isChecked())) && (cbDebitMandate = getCbDebitMandate()) != null && cbDebitMandate.isChecked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Group condition_group_delegate$lambda$9(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (Group) ocOpenProtocolDialog.findViewById(Ya.e.condition_group);
    }

    private final TextView getAgree_tv() {
        return (TextView) this.agree_tv.getValue();
    }

    private final AppCompatCheckBox getBank_info_cb() {
        return (AppCompatCheckBox) this.bank_info_cb.getValue();
    }

    private final AppCompatCheckBox getCbDebitMandate() {
        return (AppCompatCheckBox) this.cbDebitMandate.getValue();
    }

    private final AppCompatCheckBox getCheckAgreement() {
        return (AppCompatCheckBox) this.checkAgreement.getValue();
    }

    private final Group getCondition_group() {
        return (Group) this.condition_group.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final Group getOne_loop_group() {
        return (Group) this.one_loop_group.getValue();
    }

    private final TextView getOne_loop_tv() {
        return (TextView) this.one_loop_tv.getValue();
    }

    private final Group getPrivacy_group() {
        return (Group) this.privacy_group.getValue();
    }

    private final AppCompatCheckBox getPrivacy_policy_cb() {
        return (AppCompatCheckBox) this.privacy_policy_cb.getValue();
    }

    private final TextView getPrivacy_prefix_tv() {
        return (TextView) this.privacy_prefix_tv.getValue();
    }

    private final TextView getTerm_condition_tv() {
        return (TextView) this.term_condition_tv.getValue();
    }

    private final TextView getTvDebitMandate() {
        return (TextView) this.tvDebitMandate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$12(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (ImageView) ocOpenProtocolDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jump2CashProtoPageDetail(Integer type) {
        if (type != null && type.intValue() == 1) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "TermsAndConditions");
            return;
        }
        if (type != null && type.intValue() == 2) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "PrivacyPolicy");
        } else if (type != null && type.intValue() == 3) {
            Eb.a.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jump2ProtoPageDetail(Integer type) {
        if (type != null && type.intValue() == 1) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "okc");
            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "TermsAndConditions");
        } else if (type != null && type.intValue() == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("type", "okc");
            com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "PrivacyPolicy");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Group one_loop_group_delegate$lambda$1(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (Group) ocOpenProtocolDialog.findViewById(Ya.e.one_loop_group);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView one_loop_tv_delegate$lambda$4(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (TextView) ocOpenProtocolDialog.findViewById(Ya.e.one_loop_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Group privacy_group_delegate$lambda$6(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (Group) ocOpenProtocolDialog.findViewById(Ya.e.privacy_group);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatCheckBox privacy_policy_cb_delegate$lambda$8(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (AppCompatCheckBox) ocOpenProtocolDialog.findViewById(Ya.e.privacy_policy_cb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView privacy_prefix_tv_delegate$lambda$7(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (TextView) ocOpenProtocolDialog.findViewById(Ya.e.privacy_prefix_tv);
    }

    private final void setListener() {
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.E0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcOpenProtocolDialog f29965b;

                {
                    this.f29965b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f29965b.dismiss();
                            break;
                        default:
                            OcOpenProtocolDialog.setListener$lambda$22(this.f29965b, view);
                            break;
                    }
                }
            }, ivClose);
        }
        TextView one_loop_tv = getOne_loop_tv();
        if (one_loop_tv != null) {
            p220oa.h.l(new ViewOnClickListenerC1478l(8), one_loop_tv);
        }
        AppCompatCheckBox checkAgreement = getCheckAgreement();
        if (checkAgreement != null) {
            checkAgreement.setOnCheckedChangeListener(new com.facebook.react.views.switchview.a(1));
        }
        AppCompatCheckBox privacy_policy_cb = getPrivacy_policy_cb();
        if (privacy_policy_cb != null) {
            privacy_policy_cb.setOnCheckedChangeListener(new com.facebook.react.views.switchview.a(2));
        }
        AppCompatCheckBox bank_info_cb = getBank_info_cb();
        if (bank_info_cb != null) {
            bank_info_cb.setOnCheckedChangeListener(new com.facebook.react.views.switchview.a(3));
        }
        TextView agree_tv = getAgree_tv();
        if (agree_tv != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.E0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcOpenProtocolDialog f29965b;

                {
                    this.f29965b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f29965b.dismiss();
                            break;
                        default:
                            OcOpenProtocolDialog.setListener$lambda$22(this.f29965b, view);
                            break;
                    }
                }
            }, agree_tv);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$22(OcOpenProtocolDialog ocOpenProtocolDialog, View view) {
        if (!ocOpenProtocolDialog.checkProto()) {
            ToastUtils.showLong(ocOpenProtocolDialog.getContext().getString(Ya.g.cs_oc_consent_agreement), new Object[0]);
            return;
        }
        View.OnClickListener onClickListener = ocOpenProtocolDialog.mAgreeListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        ocOpenProtocolDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView term_condition_tv_delegate$lambda$10(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (TextView) ocOpenProtocolDialog.findViewById(Ya.e.term_condition_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDebitMandate_delegate$lambda$2(OcOpenProtocolDialog ocOpenProtocolDialog) {
        return (TextView) ocOpenProtocolDialog.findViewById(Ya.e.tvDebitMandate);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        ArrayList arrayList = new ArrayList();
        ApplyProtoContent applyProtoContent = new ApplyProtoContent(0, this.mContext.getString(Ya.g.cs_oc_read_and_agreed));
        ApplyProtoContent applyProtoContent2 = new ApplyProtoContent(1, C0.G.o(" ", this.mContext.getString(Ya.g.cs_oc_protocol_terms_conditions)));
        ApplyProtoContent applyProtoContent3 = new ApplyProtoContent(1, ", ");
        ApplyProtoContent applyProtoContent4 = new ApplyProtoContent(2, C0.G.o(" ", this.mContext.getString(Ya.g.cs_oc_protocol_privacy_policy)));
        arrayList.add(applyProtoContent);
        arrayList.add(applyProtoContent2);
        arrayList.add(applyProtoContent3);
        arrayList.add(applyProtoContent4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        int length = 0;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ApplyProtoContent applyProtoContent5 = (ApplyProtoContent) next;
            spannableStringBuilder.append((CharSequence) applyProtoContent5.content);
            Integer num = applyProtoContent5.clickType;
            if (num == null || num.intValue() != 0) {
                spannableStringBuilder.setSpan(new F0(this, applyProtoContent5, 0), length + 1, spannableStringBuilder.length(), 33);
            }
            length = spannableStringBuilder.length() - 1;
        }
        TextView term_condition_tv = getTerm_condition_tv();
        if (term_condition_tv != null) {
            term_condition_tv.setText(spannableStringBuilder);
        }
        TextView term_condition_tv2 = getTerm_condition_tv();
        if (term_condition_tv2 != null) {
            term_condition_tv2.setHighlightColor(getContext().getColor(com.transsnet.palmpay.custom_view.p.transparent));
        }
        TextView term_condition_tv3 = getTerm_condition_tv();
        if (term_condition_tv3 != null) {
            term_condition_tv3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        ArrayList arrayList2 = new ArrayList();
        ApplyProtoContent applyProtoContent6 = new ApplyProtoContent(0, this.mContext.getString(Ya.g.cs_oc_read_and_agreed));
        ApplyProtoContent applyProtoContent7 = new ApplyProtoContent(1, C0.G.o(" ", this.mContext.getString(Ya.g.cs_cl_protocol_terms_conditions)));
        ApplyProtoContent applyProtoContent8 = new ApplyProtoContent(1, ", ");
        ApplyProtoContent applyProtoContent9 = new ApplyProtoContent(2, C0.G.o(" ", this.mContext.getString(Ya.g.cs_cl_flexi_protocol_privacy)));
        ApplyProtoContent applyProtoContent10 = new ApplyProtoContent(2, ",  ");
        ApplyProtoContent applyProtoContent11 = new ApplyProtoContent(3, C0.G.o(" ", this.mContext.getString(Ya.g.cs_cl_protocol_application_agreement)));
        arrayList2.add(applyProtoContent6);
        arrayList2.add(applyProtoContent7);
        arrayList2.add(applyProtoContent8);
        arrayList2.add(applyProtoContent9);
        arrayList2.add(applyProtoContent10);
        arrayList2.add(applyProtoContent11);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Iterator it2 = arrayList2.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        int length2 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            ApplyProtoContent applyProtoContent12 = (ApplyProtoContent) next2;
            spannableStringBuilder2.append((CharSequence) applyProtoContent12.content);
            Integer num2 = applyProtoContent12.clickType;
            if (num2 == null || num2.intValue() != 0) {
                spannableStringBuilder2.setSpan(new F0(this, applyProtoContent12, 1), length2 + 1, spannableStringBuilder2.length(), 33);
            }
            length2 = spannableStringBuilder2.length() - 1;
        }
        TextView privacy_prefix_tv = getPrivacy_prefix_tv();
        if (privacy_prefix_tv != null) {
            privacy_prefix_tv.setText(spannableStringBuilder2);
        }
        TextView privacy_prefix_tv2 = getPrivacy_prefix_tv();
        if (privacy_prefix_tv2 != null) {
            privacy_prefix_tv2.setHighlightColor(getContext().getColor(com.transsnet.palmpay.custom_view.p.transparent));
        }
        TextView privacy_prefix_tv3 = getPrivacy_prefix_tv();
        if (privacy_prefix_tv3 != null) {
            privacy_prefix_tv3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TextView one_loop_tv = getOne_loop_tv();
        if (one_loop_tv != null) {
            C0.G.w(getContext(), Ya.b.cs_oc_proto_txt_color, com.horcrux.svg.d0.j(" ", this.mContext.getString(Ya.g.cs_oc_protocol_one_loop), new SpanUtils().append(this.mContext.getString(Ya.g.cs_oc_read_and_agreed)).setForegroundColor(getContext().getColor(L6.b.ppColorTextPrimary))), one_loop_tv);
        }
        AbstractC0511h.f7089a.richText(getTvDebitMandate(), N8.q0.y(this.mContext.getString(Ya.g.cs_oc_read_and_agreed), " ", this.mContext.getString(Ya.g.cs_oc_direct_debit_mandate)), this.mContext.getString(Ya.g.cs_oc_direct_debit_mandate), new C0500c(this, 8));
        int i7 = this.protocolType;
        if (i7 == 1) {
            Group condition_group = getCondition_group();
            if (condition_group != null) {
                condition_group.setVisibility(0);
            }
            Group privacy_group = getPrivacy_group();
            if (privacy_group != null) {
                privacy_group.setVisibility(8);
            }
            Group one_loop_group = getOne_loop_group();
            if (one_loop_group != null) {
                one_loop_group.setVisibility(8);
            }
        } else if (i7 == 2) {
            Group condition_group2 = getCondition_group();
            if (condition_group2 != null) {
                condition_group2.setVisibility(8);
            }
            Group privacy_group2 = getPrivacy_group();
            if (privacy_group2 != null) {
                privacy_group2.setVisibility(0);
            }
            Group one_loop_group2 = getOne_loop_group();
            if (one_loop_group2 != null) {
                one_loop_group2.setVisibility(8);
            }
        } else if (i7 == 3) {
            Group condition_group3 = getCondition_group();
            if (condition_group3 != null) {
                condition_group3.setVisibility(0);
            }
            Group privacy_group3 = getPrivacy_group();
            if (privacy_group3 != null) {
                privacy_group3.setVisibility(0);
            }
            Group one_loop_group3 = getOne_loop_group();
            if (one_loop_group3 != null) {
                one_loop_group3.setVisibility(8);
            }
        }
        setListener();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        View decorView3;
        super.onWindowFocusChanged(hasFocus);
        if (!hasFocus || getWindow() == null) {
            return;
        }
        Window window3 = getWindow();
        if (((window3 == null || (decorView3 = window3.getDecorView()) == null || decorView3.getHeight() != 0) && ((window = getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getWidth() != 0)) || (window2 = getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
            return;
        }
        decorView2.requestLayout();
    }

    public final void setAgreeBtListener(@Nullable View.OnClickListener agreeListener) {
        this.mAgreeListener = agreeListener;
    }
}
