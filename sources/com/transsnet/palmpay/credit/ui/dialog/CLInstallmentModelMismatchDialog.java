package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001dR\u001d\u0010&\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'¨\u0006("}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLInstallmentModelMismatchDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bindData", "()V", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;", "dto", "", "buildDeviceModelText", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;)Ljava/lang/String;", "setListener", "logoutAndBackToLogin", "initViews", "phoneModelDto", "setData", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;)Lcom/transsnet/palmpay/credit/ui/dialog/CLInstallmentModelMismatchDialog;", "Landroid/widget/ImageView;", "ivClose$delegate", "Lkotlin/Lazy;", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "Landroid/widget/TextView;", "tvDeviceModel$delegate", "getTvDeviceModel", "()Landroid/widget/TextView;", "tvDeviceModel", "tvImei$delegate", "getTvImei", "tvImei", "Lcom/palmpay/lib/ui/button/PpButton;", "btnGotIt$delegate", "getBtnGotIt", "()Lcom/palmpay/lib/ui/button/PpButton;", "btnGotIt", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLInstallmentModelMismatchDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLInstallmentModelMismatchDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/CLInstallmentModelMismatchDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class CLInstallmentModelMismatchDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: btnGotIt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnGotIt;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto;

    /* JADX INFO: renamed from: tvDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvDeviceModel;

    /* JADX INFO: renamed from: tvImei$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvImei;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLInstallmentModelMismatchDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_cl_installment_model_mismatch_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentModelMismatchDialog f29938b;

            {
                this.f29938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLInstallmentModelMismatchDialog.ivClose_delegate$lambda$0(this.f29938b);
                    case 1:
                        return CLInstallmentModelMismatchDialog.tvDeviceModel_delegate$lambda$1(this.f29938b);
                    case 2:
                        return CLInstallmentModelMismatchDialog.tvImei_delegate$lambda$2(this.f29938b);
                    default:
                        return CLInstallmentModelMismatchDialog.btnGotIt_delegate$lambda$3(this.f29938b);
                }
            }
        });
        final int i10 = 1;
        this.tvDeviceModel = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentModelMismatchDialog f29938b;

            {
                this.f29938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLInstallmentModelMismatchDialog.ivClose_delegate$lambda$0(this.f29938b);
                    case 1:
                        return CLInstallmentModelMismatchDialog.tvDeviceModel_delegate$lambda$1(this.f29938b);
                    case 2:
                        return CLInstallmentModelMismatchDialog.tvImei_delegate$lambda$2(this.f29938b);
                    default:
                        return CLInstallmentModelMismatchDialog.btnGotIt_delegate$lambda$3(this.f29938b);
                }
            }
        });
        final int i11 = 2;
        this.tvImei = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentModelMismatchDialog f29938b;

            {
                this.f29938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLInstallmentModelMismatchDialog.ivClose_delegate$lambda$0(this.f29938b);
                    case 1:
                        return CLInstallmentModelMismatchDialog.tvDeviceModel_delegate$lambda$1(this.f29938b);
                    case 2:
                        return CLInstallmentModelMismatchDialog.tvImei_delegate$lambda$2(this.f29938b);
                    default:
                        return CLInstallmentModelMismatchDialog.btnGotIt_delegate$lambda$3(this.f29938b);
                }
            }
        });
        final int i12 = 3;
        this.btnGotIt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentModelMismatchDialog f29938b;

            {
                this.f29938b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLInstallmentModelMismatchDialog.ivClose_delegate$lambda$0(this.f29938b);
                    case 1:
                        return CLInstallmentModelMismatchDialog.tvDeviceModel_delegate$lambda$1(this.f29938b);
                    case 2:
                        return CLInstallmentModelMismatchDialog.tvImei_delegate$lambda$2(this.f29938b);
                    default:
                        return CLInstallmentModelMismatchDialog.btnGotIt_delegate$lambda$3(this.f29938b);
                }
            }
        });
    }

    private final void bindData() {
        String imei;
        TextView tvDeviceModel = getTvDeviceModel();
        if (tvDeviceModel != null) {
            tvDeviceModel.setText(buildDeviceModelText(this.phoneModelDto));
        }
        QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto = this.phoneModelDto;
        String string = (phoneModelDto == null || (imei = phoneModelDto.getImei()) == null) ? null : StringsKt.V(imei).toString();
        if (string == null) {
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            TextView tvImei = getTvImei();
            if (tvImei != null) {
                tvImei.setVisibility(8);
                return;
            }
            return;
        }
        TextView tvImei2 = getTvImei();
        if (tvImei2 != null) {
            tvImei2.setVisibility(0);
        }
        TextView tvImei3 = getTvImei();
        if (tvImei3 != null) {
            tvImei3.setText(getContext().getString(p116hb.f.cs_imei_format, string));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton btnGotIt_delegate$lambda$3(CLInstallmentModelMismatchDialog cLInstallmentModelMismatchDialog) {
        return (PpButton) cLInstallmentModelMismatchDialog.findViewById(p116hb.c.btnGotIt);
    }

    private final String buildDeviceModelText(QueryLoanDialogPopUpsBean.PhoneModelDto dto) {
        String string;
        String string2;
        if (dto == null) {
            return "";
        }
        String brand = dto.getBrand();
        if (brand == null || (string = StringsKt.V(brand).toString()) == null || string.length() <= 0) {
            string = null;
        }
        String marketName = dto.getMarketName();
        if (marketName == null || (string2 = StringsKt.V(marketName).toString()) == null || string2.length() <= 0) {
            string2 = null;
        }
        String[] elements = {string, string2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        String strJ = CollectionsKt.J(C1847n.r(elements), " ", null, null, null, 62);
        String type = dto.getType();
        String string3 = type != null ? StringsKt.V(type).toString() : null;
        String str = string3 != null ? string3 : "";
        if (strJ.length() <= 0 || str.length() <= 0) {
            return strJ.length() > 0 ? strJ : str;
        }
        return N8.q0.y(strJ, " | ", str);
    }

    private final PpButton getBtnGotIt() {
        return (PpButton) this.btnGotIt.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final TextView getTvDeviceModel() {
        return (TextView) this.tvDeviceModel.getValue();
    }

    private final TextView getTvImei() {
        return (TextView) this.tvImei.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$0(CLInstallmentModelMismatchDialog cLInstallmentModelMismatchDialog) {
        return (ImageView) cLInstallmentModelMismatchDialog.findViewById(p116hb.c.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logoutAndBackToLogin() {
        dismiss();
        try {
            Pa.A.a();
            com.palmpay.lib.apm.launchcounter.util.d.F("/account/login");
        } catch (Exception e10) {
            F6.d.c(Pa.A.f7005a, "doLogoutWork: ", e10);
        }
    }

    private final void setListener() {
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLInstallmentModelMismatchDialog f29956b;

                {
                    this.f29956b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f29956b.dismiss();
                            break;
                        default:
                            this.f29956b.logoutAndBackToLogin();
                            break;
                    }
                }
            }, ivClose);
        }
        PpButton btnGotIt = getBtnGotIt();
        if (btnGotIt != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.D

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLInstallmentModelMismatchDialog f29956b;

                {
                    this.f29956b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f29956b.dismiss();
                            break;
                        default:
                            this.f29956b.logoutAndBackToLogin();
                            break;
                    }
                }
            }, btnGotIt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDeviceModel_delegate$lambda$1(CLInstallmentModelMismatchDialog cLInstallmentModelMismatchDialog) {
        return (TextView) cLInstallmentModelMismatchDialog.findViewById(p116hb.c.tvDeviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvImei_delegate$lambda$2(CLInstallmentModelMismatchDialog cLInstallmentModelMismatchDialog) {
        return (TextView) cLInstallmentModelMismatchDialog.findViewById(p116hb.c.tvImei);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            setCancelable(false);
            setCanceledOnTouchOutside(false);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        bindData();
        setListener();
    }

    @NotNull
    public final CLInstallmentModelMismatchDialog setData(@Nullable QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto) {
        this.phoneModelDto = phoneModelDto;
        return this;
    }
}
