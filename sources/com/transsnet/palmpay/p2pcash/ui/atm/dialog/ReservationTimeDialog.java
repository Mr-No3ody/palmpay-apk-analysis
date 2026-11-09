package com.transsnet.palmpay.p2pcash.ui.atm.dialog;

import Ab.y;
import Sc.c;
import Uc.I0;
import Wc.k;
import Wc.m;
import Wc.o;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentTimeResp;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.ReservationTimeDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.view.AppointmentTimeSelectorView;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PButton;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002.3B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJE\u0010\u0016\u001a\u00020\u000b26\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u001f\u00102\u001a\u00060.R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u00101R\u001f\u00107\u001a\u000603R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u00106R(\u00108\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/transsnet/palmpay/p2pcash/ui/atm/dialog/ReservationTimeDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "layoutId", "(Landroid/content/Context;I)V", "styleId", "(Landroid/content/Context;II)V", "", "renderWindow", "()V", "initViews", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ViewProps.START, ViewProps.END, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lkotlin/jvm/functions/Function2;)V", "serverTime", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/p2pcash/bean/rsp/QueryAppointmentTimeResp$TimeRangeListBean;", "timeRangeData", "setData", "(JLjava/util/ArrayList;)V", "Lcom/transsnet/palmpay/p2pcash/ui/atm/view/P2PButton;", "p2p_confirm$delegate", "Lkotlin/Lazy;", "getP2p_confirm", "()Lcom/transsnet/palmpay/p2pcash/ui/atm/view/P2PButton;", "p2p_confirm", "Lcom/transsnet/palmpay/p2pcash/ui/atm/view/AppointmentTimeSelectorView;", "p2p_time_selector$delegate", "getP2p_time_selector", "()Lcom/transsnet/palmpay/p2pcash/ui/atm/view/AppointmentTimeSelectorView;", "p2p_time_selector", "Landroid/widget/ImageView;", "p2p_close$delegate", "getP2p_close", "()Landroid/widget/ImageView;", "p2p_close", "LWc/o;", "mU$delegate", "getMU", "()LWc/o;", "mU", "LWc/m;", "mD$delegate", "getMD", "()LWc/m;", "mD", "mListener", "Lkotlin/jvm/functions/Function2;", "", "agentShopId", "Ljava/lang/String;", "module_p2p_cash_in_out_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReservationTimeDialog extends b {

    @Nullable
    private String agentShopId;

    /* JADX INFO: renamed from: mD$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mD;

    @NotNull
    private Function2<? super Long, ? super Long, Unit> mListener;

    /* JADX INFO: renamed from: mU$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mU;

    /* JADX INFO: renamed from: p2p_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy p2p_close;

    /* JADX INFO: renamed from: p2p_confirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy p2p_confirm;

    /* JADX INFO: renamed from: p2p_time_selector$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy p2p_time_selector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReservationTimeDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.p2p_confirm = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i10 = 1;
        this.p2p_time_selector = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i11 = 2;
        this.p2p_close = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i12 = 3;
        this.mU = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i13 = 4;
        this.mD = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        this.mListener = new y(6);
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getMD() {
        return (m) this.mD.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o getMU() {
        return (o) this.mU.getValue();
    }

    private final ImageView getP2p_close() {
        Object value = this.p2p_close.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P2PButton getP2p_confirm() {
        Object value = this.p2p_confirm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (P2PButton) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppointmentTimeSelectorView getP2p_time_selector() {
        Object value = this.p2p_time_selector.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AppointmentTimeSelectorView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m mD_delegate$lambda$4(ReservationTimeDialog reservationTimeDialog) {
        return new m(reservationTimeDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mListener$lambda$5(long j6, long j10) {
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o mU_delegate$lambda$3(ReservationTimeDialog reservationTimeDialog) {
        return new o(reservationTimeDialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView p2p_close_delegate$lambda$2(ReservationTimeDialog reservationTimeDialog) {
        return (ImageView) reservationTimeDialog.findViewById(Sc.b.p2p_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P2PButton p2p_confirm_delegate$lambda$0(ReservationTimeDialog reservationTimeDialog) {
        return (P2PButton) reservationTimeDialog.findViewById(Sc.b.p2p_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppointmentTimeSelectorView p2p_time_selector_delegate$lambda$1(ReservationTimeDialog reservationTimeDialog) {
        return (AppointmentTimeSelectorView) reservationTimeDialog.findViewById(Sc.b.p2p_time_selector);
    }

    private final void renderWindow() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        window.setAttributes(attributes);
        window.setDimAmount(0.4f);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(c.p2p_reservation_time_dialog_layout);
        renderWindow();
        getP2p_close().setOnClickListener(new I0(this, 14));
    }

    public final void setData(long serverTime, @NotNull ArrayList<QueryAppointmentTimeResp.TimeRangeListBean> timeRangeData) {
        Intrinsics.checkNotNullParameter(timeRangeData, "timeRangeData");
        m md2 = getMD();
        k kVar = md2.f10688a;
        KProperty<?>[] kPropertyArr = m.f10687j;
        kVar.setValue(md2, kPropertyArr[0], Long.valueOf(serverTime));
        m md3 = getMD();
        md3.getClass();
        Intrinsics.checkNotNullParameter(timeRangeData, "<set-?>");
        md3.f10691d.setValue(md3, kPropertyArr[3], timeRangeData);
    }

    public final void setListener(@NotNull Function2<? super Long, ? super Long, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReservationTimeDialog(@NotNull Context context, int i7) {
        super(context, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.p2p_confirm = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i11 = 1;
        this.p2p_time_selector = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i12 = 2;
        this.p2p_close = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i13 = 3;
        this.mU = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i14 = 4;
        this.mD = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        this.mListener = new y(6);
        this.mContext = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReservationTimeDialog(@NotNull Context context, int i7, int i10) {
        super(context, i7, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i11 = 0;
        this.p2p_confirm = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i12 = 1;
        this.p2p_time_selector = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i13 = 2;
        this.p2p_close = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i14 = 3;
        this.mU = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        final int i15 = 4;
        this.mD = C2131j.b(new Function0(this) { // from class: Wc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReservationTimeDialog f10680b;

            {
                this.f10680b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ReservationTimeDialog.p2p_confirm_delegate$lambda$0(this.f10680b);
                    case 1:
                        return ReservationTimeDialog.p2p_time_selector_delegate$lambda$1(this.f10680b);
                    case 2:
                        return ReservationTimeDialog.p2p_close_delegate$lambda$2(this.f10680b);
                    case 3:
                        return ReservationTimeDialog.mU_delegate$lambda$3(this.f10680b);
                    default:
                        return ReservationTimeDialog.mD_delegate$lambda$4(this.f10680b);
                }
            }
        });
        this.mListener = new y(6);
        this.mContext = context;
    }
}
