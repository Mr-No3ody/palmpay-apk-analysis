package com.transsnet.palmpay.send_money.ui.dialog;

import Pa.n0;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.ui.dialog.AddShortcutDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p159kd.d;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\tJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/AddShortcutDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "createPinShortcuts", "()V", "initViews", "show", PPRNBridge.DIALOG_ACTION_DISMISS, "Landroid/view/View;", "p0", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Landroid/app/Activity;", "Landroid/widget/Button;", "result_right_btn$delegate", "Lkotlin/Lazy;", "getResult_right_btn", "()Landroid/widget/Button;", "result_right_btn", "result_left_btn$delegate", "getResult_left_btn", "result_left_btn", "Lcom/mikepenz/iconics/view/IconicsImageView;", "ivClose$delegate", "getIvClose", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "ivClose", "v_temp$delegate", "getV_temp", "()Landroid/view/View;", "v_temp", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddShortcutDialog extends b implements View.OnClickListener {

    @NotNull
    private final Activity activity;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    /* JADX INFO: renamed from: result_left_btn$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy result_left_btn;

    /* JADX INFO: renamed from: result_right_btn$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy result_right_btn;

    /* JADX INFO: renamed from: v_temp$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy v_temp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddShortcutDialog(@NotNull Activity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        final int i7 = 0;
        this.result_right_btn = C2131j.b(new Function0(this) { // from class: Ad.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddShortcutDialog f233b;

            {
                this.f233b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return AddShortcutDialog.result_right_btn_delegate$lambda$0(this.f233b);
                    case 1:
                        return AddShortcutDialog.result_left_btn_delegate$lambda$1(this.f233b);
                    case 2:
                        return AddShortcutDialog.ivClose_delegate$lambda$2(this.f233b);
                    default:
                        return AddShortcutDialog.v_temp_delegate$lambda$3(this.f233b);
                }
            }
        });
        final int i10 = 1;
        this.result_left_btn = C2131j.b(new Function0(this) { // from class: Ad.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddShortcutDialog f233b;

            {
                this.f233b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return AddShortcutDialog.result_right_btn_delegate$lambda$0(this.f233b);
                    case 1:
                        return AddShortcutDialog.result_left_btn_delegate$lambda$1(this.f233b);
                    case 2:
                        return AddShortcutDialog.ivClose_delegate$lambda$2(this.f233b);
                    default:
                        return AddShortcutDialog.v_temp_delegate$lambda$3(this.f233b);
                }
            }
        });
        final int i11 = 2;
        this.ivClose = C2131j.b(new Function0(this) { // from class: Ad.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddShortcutDialog f233b;

            {
                this.f233b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return AddShortcutDialog.result_right_btn_delegate$lambda$0(this.f233b);
                    case 1:
                        return AddShortcutDialog.result_left_btn_delegate$lambda$1(this.f233b);
                    case 2:
                        return AddShortcutDialog.ivClose_delegate$lambda$2(this.f233b);
                    default:
                        return AddShortcutDialog.v_temp_delegate$lambda$3(this.f233b);
                }
            }
        });
        final int i12 = 3;
        this.v_temp = C2131j.b(new Function0(this) { // from class: Ad.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddShortcutDialog f233b;

            {
                this.f233b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return AddShortcutDialog.result_right_btn_delegate$lambda$0(this.f233b);
                    case 1:
                        return AddShortcutDialog.result_left_btn_delegate$lambda$1(this.f233b);
                    case 2:
                        return AddShortcutDialog.ivClose_delegate$lambda$2(this.f233b);
                    default:
                        return AddShortcutDialog.v_temp_delegate$lambda$3(this.f233b);
                }
            }
        });
    }

    private final void createPinShortcuts() {
        int i7 = d.sm_widget_send_money;
        Activity activity = this.activity;
        if (activity != null) {
            ActivityUtils.createPinShortcuts(activity, "Bank Transfer", "Bank Transfer", i7, "com.transsnet.palmpay.intent.action.TRANS_TO_BANK_ACOUNT");
            SPUtils.getInstance("TRANS_SHORTCUTS").put("CREATE", true);
        }
    }

    private final IconicsImageView getIvClose() {
        Object value = this.ivClose.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final Button getResult_left_btn() {
        Object value = this.result_left_btn.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    private final Button getResult_right_btn() {
        Object value = this.result_right_btn.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    private final View getV_temp() {
        Object value = this.v_temp.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView ivClose_delegate$lambda$2(AddShortcutDialog addShortcutDialog) {
        return (IconicsImageView) addShortcutDialog.findViewById(e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button result_left_btn_delegate$lambda$1(AddShortcutDialog addShortcutDialog) {
        return (Button) addShortcutDialog.findViewById(e.result_left_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button result_right_btn_delegate$lambda$0(AddShortcutDialog addShortcutDialog) {
        return (Button) addShortcutDialog.findViewById(e.result_right_btn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View v_temp_delegate$lambda$3(AddShortcutDialog addShortcutDialog) {
        return addShortcutDialog.findViewById(e.v_temp);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(f.sm_add_shortcut_dialog);
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = ScreenUtils.getAppUsableScreenHeight();
        IconicsImageView ivClose = getIvClose();
        if (ivClose != null) {
            ivClose.setOnClickListener(this);
        }
        Button result_left_btn = getResult_left_btn();
        if (result_left_btn != null) {
            result_left_btn.setOnClickListener(this);
        }
        Button result_right_btn = getResult_right_btn();
        if (result_right_btn != null) {
            result_right_btn.setOnClickListener(this);
        }
        View v_temp = getV_temp();
        if (v_temp != null) {
            v_temp.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View p3) {
        if (Intrinsics.c(p3, getIvClose()) || Intrinsics.c(p3, getV_temp())) {
            n0.g().l("bankTransfer_shortCut_Close");
            dismiss();
        } else if (Intrinsics.c(p3, getResult_left_btn())) {
            n0.g().l("bankTransfer_shortCut_Cancel");
            dismiss();
        } else if (Intrinsics.c(p3, getResult_right_btn())) {
            n0.g().l("bankTransfer_shortCut_addSuccess");
            createPinShortcuts();
            dismiss();
        }
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
    }
}
