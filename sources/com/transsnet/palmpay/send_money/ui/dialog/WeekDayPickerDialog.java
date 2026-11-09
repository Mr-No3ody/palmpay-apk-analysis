package com.transsnet.palmpay.send_money.ui.dialog;

import Ad.L;
import Ad.c0;
import Ad.f0;
import C0.G;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.send_money.ui.dialog.WeekDayPickerDialog;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003(\t)B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\t0!j\b\u0012\u0004\u0012\u00020\t`\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006*"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/WeekDayPickerDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "LAd/f0;", "weekDay", "setCurrentWeekDay", "(LAd/f0;)Lcom/transsnet/palmpay/send_money/ui/dialog/WeekDayPickerDialog;", "Lcom/transsnet/palmpay/send_money/ui/dialog/WeekDayPickerDialog$OnWeekDaySelectedListener;", "onWheelItemClickListener", "setOnWeekDaySelectedListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/WeekDayPickerDialog$OnWeekDaySelectedListener;)Lcom/transsnet/palmpay/send_money/ui/dialog/WeekDayPickerDialog;", "Landroid/widget/TextView;", "tv_confirm$delegate", "Lkotlin/Lazy;", "getTv_confirm", "()Landroid/widget/TextView;", "tv_confirm", "tv_cancel$delegate", "getTv_cancel", "tv_cancel", "tv_select_date$delegate", "getTv_select_date", "tv_select_date", "Lcom/transsnet/palmpay/send_money/ui/dialog/WeekDayPickerDialog$OnWeekDaySelectedListener;", "Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;", "wheelView", "Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dates", "Ljava/util/ArrayList;", "currentWeekDay", "LAd/f0;", "selectWeekDay", "Ad/L", "OnWeekDaySelectedListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WeekDayPickerDialog extends b {

    @Nullable
    private f0 currentWeekDay;

    @NotNull
    private ArrayList<f0> dates;

    @Nullable
    private OnWeekDaySelectedListener onWheelItemClickListener;

    @Nullable
    private f0 selectWeekDay;

    /* JADX INFO: renamed from: tv_cancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_cancel;

    /* JADX INFO: renamed from: tv_confirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_confirm;

    /* JADX INFO: renamed from: tv_select_date$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_select_date;
    private WheelView<f0> wheelView;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/WeekDayPickerDialog$OnWeekDaySelectedListener;", "", "LAd/f0;", "weekDay", "", "onWeekDaySelected", "(LAd/f0;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnWeekDaySelectedListener {
        void onWeekDaySelected(@Nullable f0 weekDay);
    }

    public WeekDayPickerDialog(@Nullable Context context) {
        super(context, f.sm_dialog_week_day_picker);
        final int i7 = 0;
        this.tv_confirm = C2131j.b(new Function0(this) { // from class: Ad.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeekDayPickerDialog f212b;

            {
                this.f212b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return WeekDayPickerDialog.tv_confirm_delegate$lambda$0(this.f212b);
                    case 1:
                        return WeekDayPickerDialog.tv_cancel_delegate$lambda$1(this.f212b);
                    default:
                        return WeekDayPickerDialog.tv_select_date_delegate$lambda$2(this.f212b);
                }
            }
        });
        final int i10 = 1;
        this.tv_cancel = C2131j.b(new Function0(this) { // from class: Ad.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeekDayPickerDialog f212b;

            {
                this.f212b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return WeekDayPickerDialog.tv_confirm_delegate$lambda$0(this.f212b);
                    case 1:
                        return WeekDayPickerDialog.tv_cancel_delegate$lambda$1(this.f212b);
                    default:
                        return WeekDayPickerDialog.tv_select_date_delegate$lambda$2(this.f212b);
                }
            }
        });
        final int i11 = 2;
        this.tv_select_date = C2131j.b(new Function0(this) { // from class: Ad.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeekDayPickerDialog f212b;

            {
                this.f212b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return WeekDayPickerDialog.tv_confirm_delegate$lambda$0(this.f212b);
                    case 1:
                        return WeekDayPickerDialog.tv_cancel_delegate$lambda$1(this.f212b);
                    default:
                        return WeekDayPickerDialog.tv_select_date_delegate$lambda$2(this.f212b);
                }
            }
        });
        this.dates = new ArrayList<>();
    }

    private final TextView getTv_cancel() {
        Object value = this.tv_cancel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_confirm() {
        Object value = this.tv_confirm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_select_date() {
        Object value = this.tv_select_date.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(WeekDayPickerDialog weekDayPickerDialog, View view) {
        OnWeekDaySelectedListener onWeekDaySelectedListener = weekDayPickerDialog.onWheelItemClickListener;
        if (onWeekDaySelectedListener != null) {
            onWeekDaySelectedListener.onWeekDaySelected(weekDayPickerDialog.selectWeekDay);
        }
        weekDayPickerDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$7$lambda$6(WeekDayPickerDialog weekDayPickerDialog, WheelView wheelView, int i7, f0 f0Var) {
        String str;
        weekDayPickerDialog.selectWeekDay = f0Var;
        TextView tv_select_date = weekDayPickerDialog.getTv_select_date();
        SpanUtils spanUtilsI = G.i("Automatically transfer on every ");
        f0 f0Var2 = weekDayPickerDialog.selectWeekDay;
        if (f0Var2 == null || (str = f0Var2.f218a) == null) {
            str = "";
        }
        tv_select_date.setText(spanUtilsI.append(str).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, wheelView.getContext())).create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_cancel_delegate$lambda$1(WeekDayPickerDialog weekDayPickerDialog) {
        return (TextView) weekDayPickerDialog.findViewById(e.tv_cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_confirm_delegate$lambda$0(WeekDayPickerDialog weekDayPickerDialog) {
        return (TextView) weekDayPickerDialog.findViewById(e.tv_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_select_date_delegate$lambda$2(WeekDayPickerDialog weekDayPickerDialog) {
        return (TextView) weekDayPickerDialog.findViewById(e.tv_select_date);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Integer num;
        showAtBottom(getWindow());
        final int i7 = 0;
        getTv_cancel().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeekDayPickerDialog f203b;

            {
                this.f203b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f203b.dismiss();
                        break;
                    default:
                        WeekDayPickerDialog.initViews$lambda$4(this.f203b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        getTv_confirm().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.b0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WeekDayPickerDialog f203b;

            {
                this.f203b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f203b.dismiss();
                        break;
                    default:
                        WeekDayPickerDialog.initViews$lambda$4(this.f203b, view);
                        break;
                }
            }
        });
        WheelView<f0> wheelView = (WheelView) findViewById(e.wv_schedule_date);
        this.wheelView = wheelView;
        if (wheelView == null) {
            Intrinsics.n("wheelView");
            throw null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        wheelView.setWheelAdapter(new L(context, 1));
        wheelView.setSkin(dc.a.f35861b);
        wheelView.setWheelSize(5);
        dc.b bVar = new dc.b();
        bVar.f35864a = 0;
        bVar.f35870g = 1.0f;
        bVar.f35866c = CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, getContext());
        bVar.f35867d = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext());
        CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext());
        bVar.f35868e = 16;
        bVar.f35869f = 22;
        bVar.f35865b = CommonViewExtKt.colorInt(p.transparent, getContext());
        wheelView.setStyle(bVar);
        this.dates.add(new f0("Sunday", 1));
        this.dates.add(new f0("Monday", 2));
        this.dates.add(new f0("Tuesday", 3));
        this.dates.add(new f0("Wednesday", 4));
        this.dates.add(new f0("Thursday", 5));
        this.dates.add(new f0("Friday", 6));
        this.dates.add(new f0("Saturday", 7));
        wheelView.setWheelData(this.dates);
        f0 f0Var = this.currentWeekDay;
        wheelView.setSelection(((f0Var == null || (num = f0Var.f219b) == null) ? 1 : num.intValue()) - 1);
        wheelView.setOnWheelItemSelectedListener(new c0(0, this, wheelView));
    }

    @NotNull
    public final WeekDayPickerDialog setCurrentWeekDay(@Nullable f0 weekDay) {
        this.currentWeekDay = weekDay;
        this.selectWeekDay = weekDay;
        return this;
    }

    @NotNull
    public final WeekDayPickerDialog setOnWeekDaySelectedListener(@NotNull OnWeekDaySelectedListener onWheelItemClickListener) {
        Intrinsics.checkNotNullParameter(onWheelItemClickListener, "onWheelItemClickListener");
        this.onWheelItemClickListener = onWheelItemClickListener;
        return this;
    }
}
