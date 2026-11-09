package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.util.DeviceUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 I2\u00020\u0001:\u0001JB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0014\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001d\u0010$\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R\u001d\u00103\u001a\u0004\u0018\u00010/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u00102R\u001d\u00106\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u0010-R\u001d\u00109\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010!\u001a\u0004\b8\u0010-R#\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010!\u001a\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010H¨\u0006K"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLInstallmentCheckPlanDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "mobileInstallmentPopupBrands", "Lkotlin/Function0;", "checkFaceLivenessListener", "setData", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Lcom/transsnet/palmpay/credit/ui/dialog/CLInstallmentCheckPlanDialog;", "applyPageMode", "setupViewPager", "setupButtons", "", ViewProps.POSITION, "updatePageUi", "(I)V", "updateIndicator", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$PhoneModelDto;", "Landroid/widget/TextView;", "tvSubtitle$delegate", "Lkotlin/Lazy;", "getTvSubtitle", "()Landroid/widget/TextView;", "tvSubtitle", "Landroidx/viewpager2/widget/ViewPager2;", "vpRepaymentGuide$delegate", "getVpRepaymentGuide", "()Landroidx/viewpager2/widget/ViewPager2;", "vpRepaymentGuide", "Lcom/palmpay/lib/ui/button/PpButton;", "btnAction$delegate", "getBtnAction", "()Lcom/palmpay/lib/ui/button/PpButton;", "btnAction", "Landroid/widget/LinearLayout;", "llDualButtons$delegate", "getLlDualButtons", "()Landroid/widget/LinearLayout;", "llDualButtons", "btnLast$delegate", "getBtnLast", "btnLast", "btnNext$delegate", "getBtnNext", "btnNext", "Landroid/view/View;", "indicatorDots$delegate", "getIndicatorDots", "()Ljava/util/List;", "indicatorDots", "pageCount", "I", "", "subtitleResIds", "[I", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "pageChangeCallback", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "Companion", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLInstallmentCheckPlanDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLInstallmentCheckPlanDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/CLInstallmentCheckPlanDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1#2:246\n1878#3,3:247\n*S KotlinDebug\n*F\n+ 1 CLInstallmentCheckPlanDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/CLInstallmentCheckPlanDialog\n*L\n175#1:247,3\n*E\n"})
public final class CLInstallmentCheckPlanDialog extends com.transsnet.palmpay.custom_view.dialog.b {
    private static final int PAGE_COUNT_WITHOUT_VA = 3;

    @NotNull
    private static final int[] SUBTITLE_DAILY_WITHOUT_VA;

    @NotNull
    private static final int[] SUBTITLE_DAILY_WITH_VA;

    @NotNull
    private static final int[] SUBTITLE_WITHOUT_VA;

    @NotNull
    private static final int[] SUBTITLE_WITH_VA;

    /* JADX INFO: renamed from: btnAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnAction;

    /* JADX INFO: renamed from: btnLast$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnLast;

    /* JADX INFO: renamed from: btnNext$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnNext;

    @NotNull
    private Function0<Unit> checkFaceLivenessListener;

    @Nullable
    private QueryLoanDialogPopUpsBean.PhoneModelDto data;

    /* JADX INFO: renamed from: indicatorDots$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy indicatorDots;

    /* JADX INFO: renamed from: llDualButtons$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy llDualButtons;

    @Nullable
    private List<String> mobileInstallmentPopupBrands;

    @Nullable
    private ViewPager2.OnPageChangeCallback pageChangeCallback;
    private int pageCount;

    @NotNull
    private int[] subtitleResIds;

    /* JADX INFO: renamed from: tvSubtitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvSubtitle;

    /* JADX INFO: renamed from: vpRepaymentGuide$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vpRepaymentGuide;

    static {
        int i7 = p116hb.f.cs_check_your_repayment_plan_now;
        int i10 = p116hb.f.cs_repayment_guide_subtitle_3;
        int i11 = p116hb.f.cs_repayment_guide_subtitle_2;
        int i12 = p116hb.f.cs_repayment_guide_subtitle_4;
        SUBTITLE_WITH_VA = new int[]{i7, i10, i11, i12};
        SUBTITLE_WITHOUT_VA = new int[]{i7, i11, i12};
        SUBTITLE_DAILY_WITH_VA = new int[]{i7, i10, i11, i12};
        SUBTITLE_DAILY_WITHOUT_VA = new int[]{i7, i11, i12};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLInstallmentCheckPlanDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_cl_installment_check_plan_dialog_layout_v3);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 2;
        this.tvSubtitle = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentCheckPlanDialog f30222b;

            {
                this.f30222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLInstallmentCheckPlanDialog.btnNext_delegate$lambda$5(this.f30222b);
                    case 1:
                        return CLInstallmentCheckPlanDialog.indicatorDots_delegate$lambda$6(this.f30222b);
                    case 2:
                        return CLInstallmentCheckPlanDialog.tvSubtitle_delegate$lambda$0(this.f30222b);
                    case 3:
                        return CLInstallmentCheckPlanDialog.vpRepaymentGuide_delegate$lambda$1(this.f30222b);
                    case 4:
                        return CLInstallmentCheckPlanDialog.btnAction_delegate$lambda$2(this.f30222b);
                    case 5:
                        return CLInstallmentCheckPlanDialog.llDualButtons_delegate$lambda$3(this.f30222b);
                    default:
                        return CLInstallmentCheckPlanDialog.btnLast_delegate$lambda$4(this.f30222b);
                }
            }
        });
        final int i10 = 3;
        this.vpRepaymentGuide = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentCheckPlanDialog f30222b;

            {
                this.f30222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLInstallmentCheckPlanDialog.btnNext_delegate$lambda$5(this.f30222b);
                    case 1:
                        return CLInstallmentCheckPlanDialog.indicatorDots_delegate$lambda$6(this.f30222b);
                    case 2:
                        return CLInstallmentCheckPlanDialog.tvSubtitle_delegate$lambda$0(this.f30222b);
                    case 3:
                        return CLInstallmentCheckPlanDialog.vpRepaymentGuide_delegate$lambda$1(this.f30222b);
                    case 4:
                        return CLInstallmentCheckPlanDialog.btnAction_delegate$lambda$2(this.f30222b);
                    case 5:
                        return CLInstallmentCheckPlanDialog.llDualButtons_delegate$lambda$3(this.f30222b);
                    default:
                        return CLInstallmentCheckPlanDialog.btnLast_delegate$lambda$4(this.f30222b);
                }
            }
        });
        final int i11 = 4;
        this.btnAction = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentCheckPlanDialog f30222b;

            {
                this.f30222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLInstallmentCheckPlanDialog.btnNext_delegate$lambda$5(this.f30222b);
                    case 1:
                        return CLInstallmentCheckPlanDialog.indicatorDots_delegate$lambda$6(this.f30222b);
                    case 2:
                        return CLInstallmentCheckPlanDialog.tvSubtitle_delegate$lambda$0(this.f30222b);
                    case 3:
                        return CLInstallmentCheckPlanDialog.vpRepaymentGuide_delegate$lambda$1(this.f30222b);
                    case 4:
                        return CLInstallmentCheckPlanDialog.btnAction_delegate$lambda$2(this.f30222b);
                    case 5:
                        return CLInstallmentCheckPlanDialog.llDualButtons_delegate$lambda$3(this.f30222b);
                    default:
                        return CLInstallmentCheckPlanDialog.btnLast_delegate$lambda$4(this.f30222b);
                }
            }
        });
        final int i12 = 5;
        this.llDualButtons = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentCheckPlanDialog f30222b;

            {
                this.f30222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLInstallmentCheckPlanDialog.btnNext_delegate$lambda$5(this.f30222b);
                    case 1:
                        return CLInstallmentCheckPlanDialog.indicatorDots_delegate$lambda$6(this.f30222b);
                    case 2:
                        return CLInstallmentCheckPlanDialog.tvSubtitle_delegate$lambda$0(this.f30222b);
                    case 3:
                        return CLInstallmentCheckPlanDialog.vpRepaymentGuide_delegate$lambda$1(this.f30222b);
                    case 4:
                        return CLInstallmentCheckPlanDialog.btnAction_delegate$lambda$2(this.f30222b);
                    case 5:
                        return CLInstallmentCheckPlanDialog.llDualButtons_delegate$lambda$3(this.f30222b);
                    default:
                        return CLInstallmentCheckPlanDialog.btnLast_delegate$lambda$4(this.f30222b);
                }
            }
        });
        final int i13 = 6;
        this.btnLast = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentCheckPlanDialog f30222b;

            {
                this.f30222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return CLInstallmentCheckPlanDialog.btnNext_delegate$lambda$5(this.f30222b);
                    case 1:
                        return CLInstallmentCheckPlanDialog.indicatorDots_delegate$lambda$6(this.f30222b);
                    case 2:
                        return CLInstallmentCheckPlanDialog.tvSubtitle_delegate$lambda$0(this.f30222b);
                    case 3:
                        return CLInstallmentCheckPlanDialog.vpRepaymentGuide_delegate$lambda$1(this.f30222b);
                    case 4:
                        return CLInstallmentCheckPlanDialog.btnAction_delegate$lambda$2(this.f30222b);
                    case 5:
                        return CLInstallmentCheckPlanDialog.llDualButtons_delegate$lambda$3(this.f30222b);
                    default:
                        return CLInstallmentCheckPlanDialog.btnLast_delegate$lambda$4(this.f30222b);
                }
            }
        });
        final int i14 = 0;
        this.btnNext = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentCheckPlanDialog f30222b;

            {
                this.f30222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return CLInstallmentCheckPlanDialog.btnNext_delegate$lambda$5(this.f30222b);
                    case 1:
                        return CLInstallmentCheckPlanDialog.indicatorDots_delegate$lambda$6(this.f30222b);
                    case 2:
                        return CLInstallmentCheckPlanDialog.tvSubtitle_delegate$lambda$0(this.f30222b);
                    case 3:
                        return CLInstallmentCheckPlanDialog.vpRepaymentGuide_delegate$lambda$1(this.f30222b);
                    case 4:
                        return CLInstallmentCheckPlanDialog.btnAction_delegate$lambda$2(this.f30222b);
                    case 5:
                        return CLInstallmentCheckPlanDialog.llDualButtons_delegate$lambda$3(this.f30222b);
                    default:
                        return CLInstallmentCheckPlanDialog.btnLast_delegate$lambda$4(this.f30222b);
                }
            }
        });
        final int i15 = 1;
        this.indicatorDots = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLInstallmentCheckPlanDialog f30222b;

            {
                this.f30222b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return CLInstallmentCheckPlanDialog.btnNext_delegate$lambda$5(this.f30222b);
                    case 1:
                        return CLInstallmentCheckPlanDialog.indicatorDots_delegate$lambda$6(this.f30222b);
                    case 2:
                        return CLInstallmentCheckPlanDialog.tvSubtitle_delegate$lambda$0(this.f30222b);
                    case 3:
                        return CLInstallmentCheckPlanDialog.vpRepaymentGuide_delegate$lambda$1(this.f30222b);
                    case 4:
                        return CLInstallmentCheckPlanDialog.btnAction_delegate$lambda$2(this.f30222b);
                    case 5:
                        return CLInstallmentCheckPlanDialog.llDualButtons_delegate$lambda$3(this.f30222b);
                    default:
                        return CLInstallmentCheckPlanDialog.btnLast_delegate$lambda$4(this.f30222b);
                }
            }
        });
        this.pageCount = 3;
        this.subtitleResIds = SUBTITLE_WITHOUT_VA;
        this.checkFaceLivenessListener = new com.transsnet.palmpay.core.ui.activity.T(5);
    }

    private final void applyPageMode() {
        int[] iArr;
        String string;
        QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto = this.data;
        String virtualAccountNo = phoneModelDto != null ? phoneModelDto.getVirtualAccountNo() : null;
        String strK = (virtualAccountNo == null || (string = StringsKt.V(virtualAccountNo).toString()) == null) ? null : kotlin.text.y.k(string, " ", "");
        boolean z3 = (strK != null ? strK : "").length() > 0;
        b1 b1Var = e1.f30095f;
        QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto2 = this.data;
        boolean zIsDailyUnit = b1Var.isDailyUnit(phoneModelDto2 != null ? phoneModelDto2.getLoanTermSpanUnit() : null);
        if (zIsDailyUnit && z3) {
            iArr = SUBTITLE_DAILY_WITH_VA;
        } else if (zIsDailyUnit) {
            iArr = SUBTITLE_DAILY_WITHOUT_VA;
        } else {
            iArr = z3 ? SUBTITLE_WITH_VA : SUBTITLE_WITHOUT_VA;
        }
        this.subtitleResIds = iArr;
        this.pageCount = iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton btnAction_delegate$lambda$2(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog) {
        return (PpButton) cLInstallmentCheckPlanDialog.findViewById(p116hb.c.btnAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton btnLast_delegate$lambda$4(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog) {
        return (PpButton) cLInstallmentCheckPlanDialog.findViewById(p116hb.c.btnLast);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton btnNext_delegate$lambda$5(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog) {
        return (PpButton) cLInstallmentCheckPlanDialog.findViewById(p116hb.c.btnNext);
    }

    private final PpButton getBtnAction() {
        return (PpButton) this.btnAction.getValue();
    }

    private final PpButton getBtnLast() {
        return (PpButton) this.btnLast.getValue();
    }

    private final PpButton getBtnNext() {
        return (PpButton) this.btnNext.getValue();
    }

    private final List<View> getIndicatorDots() {
        return (List) this.indicatorDots.getValue();
    }

    private final LinearLayout getLlDualButtons() {
        return (LinearLayout) this.llDualButtons.getValue();
    }

    private final TextView getTvSubtitle() {
        return (TextView) this.tvSubtitle.getValue();
    }

    private final ViewPager2 getVpRepaymentGuide() {
        return (ViewPager2) this.vpRepaymentGuide.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List indicatorDots_delegate$lambda$6(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog) {
        return C1850q.h(cLInstallmentCheckPlanDialog.findViewById(p116hb.c.dot0), cLInstallmentCheckPlanDialog.findViewById(p116hb.c.dot1), cLInstallmentCheckPlanDialog.findViewById(p116hb.c.dot2), cLInstallmentCheckPlanDialog.findViewById(p116hb.c.dot3), cLInstallmentCheckPlanDialog.findViewById(p116hb.c.dot4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initViews$lambda$9(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        return i7 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llDualButtons_delegate$lambda$3(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog) {
        return (LinearLayout) cLInstallmentCheckPlanDialog.findViewById(p116hb.c.llDualButtons);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CLInstallmentCheckPlanDialog setData$default(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog, QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto, List list, Function0 function0, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            list = null;
        }
        if ((i7 & 4) != 0) {
            function0 = new com.transsnet.palmpay.core.ui.activity.T(4);
        }
        return cLInstallmentCheckPlanDialog.setData(phoneModelDto, list, function0);
    }

    private final void setupButtons() {
        PpButton btnAction = getBtnAction();
        if (btnAction != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLInstallmentCheckPlanDialog f30226b;

                {
                    this.f30226b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            CLInstallmentCheckPlanDialog.setupButtons$lambda$11(this.f30226b, view);
                            break;
                        case 1:
                            CLInstallmentCheckPlanDialog.setupButtons$lambda$12(this.f30226b, view);
                            break;
                        default:
                            CLInstallmentCheckPlanDialog.setupButtons$lambda$13(this.f30226b, view);
                            break;
                    }
                }
            }, btnAction);
        }
        PpButton btnLast = getBtnLast();
        if (btnLast != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLInstallmentCheckPlanDialog f30226b;

                {
                    this.f30226b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            CLInstallmentCheckPlanDialog.setupButtons$lambda$11(this.f30226b, view);
                            break;
                        case 1:
                            CLInstallmentCheckPlanDialog.setupButtons$lambda$12(this.f30226b, view);
                            break;
                        default:
                            CLInstallmentCheckPlanDialog.setupButtons$lambda$13(this.f30226b, view);
                            break;
                    }
                }
            }, btnLast);
        }
        PpButton btnNext = getBtnNext();
        if (btnNext != null) {
            final int i11 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLInstallmentCheckPlanDialog f30226b;

                {
                    this.f30226b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            CLInstallmentCheckPlanDialog.setupButtons$lambda$11(this.f30226b, view);
                            break;
                        case 1:
                            CLInstallmentCheckPlanDialog.setupButtons$lambda$12(this.f30226b, view);
                            break;
                        default:
                            CLInstallmentCheckPlanDialog.setupButtons$lambda$13(this.f30226b, view);
                            break;
                    }
                }
            }, btnNext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButtons$lambda$11(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog, View view) {
        List<String> list;
        ViewPager2 vpRepaymentGuide = cLInstallmentCheckPlanDialog.getVpRepaymentGuide();
        if (vpRepaymentGuide == null) {
            return;
        }
        int currentItem = vpRepaymentGuide.getCurrentItem();
        if (currentItem < cLInstallmentCheckPlanDialog.pageCount - 1) {
            vpRepaymentGuide.setCurrentItem(currentItem + 1, true);
            return;
        }
        QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto = cLInstallmentCheckPlanDialog.data;
        String brand = phoneModelDto != null ? phoneModelDto.getBrand() : null;
        QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto2 = cLInstallmentCheckPlanDialog.data;
        String type = phoneModelDto2 != null ? phoneModelDto2.getType() : null;
        List<String> list2 = cLInstallmentCheckPlanDialog.mobileInstallmentPopupBrands;
        String model = DeviceUtils.getModel();
        String string = brand != null ? StringsKt.V(brand).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() != 0 && (list = list2) != null && !list.isEmpty()) {
            List<String> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.y.h(StringsKt.V((String) it.next()).toString(), string, true)) {
                        String string2 = model != null ? StringsKt.V(model).toString() : null;
                        if (string2 == null) {
                            string2 = "";
                        }
                        String strK = kotlin.text.y.k(string2, " ", "");
                        if (strK.length() == 0) {
                            break;
                        }
                        String string3 = type != null ? StringsKt.V(type).toString() : null;
                        if (string3 == null) {
                            string3 = "";
                        }
                        String strK2 = kotlin.text.y.k(string3, " ", "");
                        if (strK2.length() == 0 || StringsKt.A(strK, strK2, true) || StringsKt.A(strK2, strK, true)) {
                            break;
                            break;
                            break;
                        } else {
                            Context context = cLInstallmentCheckPlanDialog.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            new CLInstallmentModelMismatchDialog(context).setData(cLInstallmentCheckPlanDialog.data).show();
                            return;
                        }
                    }
                }
            }
        }
        cLInstallmentCheckPlanDialog.checkFaceLivenessListener.invoke();
        cLInstallmentCheckPlanDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButtons$lambda$12(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog, View view) {
        int currentItem;
        ViewPager2 vpRepaymentGuide = cLInstallmentCheckPlanDialog.getVpRepaymentGuide();
        if (vpRepaymentGuide != null && (currentItem = vpRepaymentGuide.getCurrentItem()) > 0) {
            vpRepaymentGuide.setCurrentItem(currentItem - 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupButtons$lambda$13(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog, View view) {
        int currentItem;
        ViewPager2 vpRepaymentGuide = cLInstallmentCheckPlanDialog.getVpRepaymentGuide();
        if (vpRepaymentGuide != null && (currentItem = vpRepaymentGuide.getCurrentItem()) < cLInstallmentCheckPlanDialog.pageCount - 1) {
            vpRepaymentGuide.setCurrentItem(currentItem + 1, true);
        }
    }

    private final void setupViewPager() {
        ViewPager2 vpRepaymentGuide = getVpRepaymentGuide();
        if (vpRepaymentGuide == null) {
            return;
        }
        e1 e1Var = new e1(this.data);
        this.pageCount = e1Var.f30103c.length;
        vpRepaymentGuide.setAdapter(e1Var);
        vpRepaymentGuide.setOffscreenPageLimit(1);
        B b7 = new B(this);
        vpRepaymentGuide.registerOnPageChangeCallback(b7);
        this.pageChangeCallback = b7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvSubtitle_delegate$lambda$0(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog) {
        return (TextView) cLInstallmentCheckPlanDialog.findViewById(p116hb.c.tvSubtitle);
    }

    private final void updateIndicator(int position) {
        int i7 = 0;
        for (Object obj : getIndicatorDots()) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            View view = (View) obj;
            if (i7 < this.pageCount) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (view != null) {
                    view.setBackgroundResource(i7 == position ? p116hb.b.cs_repayment_guide_dot_selected : p116hb.b.cs_repayment_guide_dot_unselected);
                }
            } else if (view != null) {
                view.setVisibility(8);
            }
            i7 = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePageUi(int position) {
        TextView tvSubtitle = getTvSubtitle();
        if (tvSubtitle != null) {
            int[] iArr = this.subtitleResIds;
            tvSubtitle.setText((position < 0 || position >= iArr.length) ? iArr[0] : iArr[position]);
        }
        updateIndicator(position);
        if (position == 0) {
            PpButton btnAction = getBtnAction();
            if (btnAction != null) {
                p220oa.h.C(btnAction);
            }
            LinearLayout llDualButtons = getLlDualButtons();
            if (llDualButtons != null) {
                p220oa.h.c(llDualButtons);
            }
            PpButton btnAction2 = getBtnAction();
            if (btnAction2 != null) {
                btnAction2.setText(getContext().getString(p116hb.f.cs_repayment_guide_next));
                return;
            }
            return;
        }
        if (position != this.pageCount - 1) {
            PpButton btnAction3 = getBtnAction();
            if (btnAction3 != null) {
                p220oa.h.c(btnAction3);
            }
            LinearLayout llDualButtons2 = getLlDualButtons();
            if (llDualButtons2 != null) {
                p220oa.h.C(llDualButtons2);
                return;
            }
            return;
        }
        PpButton btnAction4 = getBtnAction();
        if (btnAction4 != null) {
            p220oa.h.C(btnAction4);
        }
        LinearLayout llDualButtons3 = getLlDualButtons();
        if (llDualButtons3 != null) {
            p220oa.h.c(llDualButtons3);
        }
        PpButton btnAction5 = getBtnAction();
        if (btnAction5 != null) {
            btnAction5.setText(getContext().getString(p116hb.f.cs_homepage));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewPager2 vpRepaymentGuide_delegate$lambda$1(CLInstallmentCheckPlanDialog cLInstallmentCheckPlanDialog) {
        return (ViewPager2) cLInstallmentCheckPlanDialog.findViewById(p116hb.c.vpRepaymentGuide);
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
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setOnKeyListener(new A());
        applyPageMode();
        setupViewPager();
        setupButtons();
        updatePageUi(0);
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

    @NotNull
    public final CLInstallmentCheckPlanDialog setData(@Nullable QueryLoanDialogPopUpsBean.PhoneModelDto data, @Nullable List<String> mobileInstallmentPopupBrands, @NotNull Function0<Unit> checkFaceLivenessListener) {
        Intrinsics.checkNotNullParameter(checkFaceLivenessListener, "checkFaceLivenessListener");
        this.data = data;
        this.mobileInstallmentPopupBrands = mobileInstallmentPopupBrands;
        this.checkFaceLivenessListener = checkFaceLivenessListener;
        return this;
    }
}
