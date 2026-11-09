package com.transsnet.palmpay.send_money.ui.dialog;

import Ad.O;
import Ad.P;
import Ad.Q;
import C0.G;
import M1.j;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.ui.dialog.MonthDayPickerDialog;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003.\u000e1B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&R&\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u000e0'j\b\u0012\u0004\u0012\u00020\u000e`(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/MonthDayPickerDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "monthDay", "Landroid/text/SpannableStringBuilder;", "getSelectedText", "(Ljava/lang/Integer;)Landroid/text/SpannableStringBuilder;", "", "initViews", "()V", "LAd/O;", "setCurrentMonthDay", "(LAd/O;)Lcom/transsnet/palmpay/send_money/ui/dialog/MonthDayPickerDialog;", "Lcom/transsnet/palmpay/send_money/ui/dialog/MonthDayPickerDialog$OnMonthDaySelectedListener;", "onWheelItemClickListener", "setOnMonthDaySelectedListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/MonthDayPickerDialog$OnMonthDaySelectedListener;)Lcom/transsnet/palmpay/send_money/ui/dialog/MonthDayPickerDialog;", "Landroid/widget/TextView;", "tv_confirm$delegate", "Lkotlin/Lazy;", "getTv_confirm", "()Landroid/widget/TextView;", "tv_confirm", "tv_cancel$delegate", "getTv_cancel", "tv_cancel", "Landroidx/recyclerview/widget/RecyclerView;", "rv_schedule_date$delegate", "getRv_schedule_date", "()Landroidx/recyclerview/widget/RecyclerView;", "rv_schedule_date", "tv_select_date$delegate", "getTv_select_date", "tv_select_date", "Lcom/transsnet/palmpay/send_money/ui/dialog/MonthDayPickerDialog$OnMonthDaySelectedListener;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dates", "Ljava/util/ArrayList;", "currentMonthDay", "LAd/O;", "selectWeekDay", "LAd/P;", "adapter", "LAd/P;", "OnMonthDaySelectedListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MonthDayPickerDialog extends b {

    @Nullable
    private P adapter;

    @Nullable
    private O currentMonthDay;

    @NotNull
    private ArrayList<O> dates;

    @Nullable
    private OnMonthDaySelectedListener onWheelItemClickListener;

    /* JADX INFO: renamed from: rv_schedule_date$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rv_schedule_date;

    @Nullable
    private O selectWeekDay;

    /* JADX INFO: renamed from: tv_cancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_cancel;

    /* JADX INFO: renamed from: tv_confirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_confirm;

    /* JADX INFO: renamed from: tv_select_date$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_select_date;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/MonthDayPickerDialog$OnMonthDaySelectedListener;", "", "LAd/O;", "weekDay", "", "onMonthDaySelected", "(LAd/O;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnMonthDaySelectedListener {
        void onMonthDaySelected(@Nullable O weekDay);
    }

    public MonthDayPickerDialog(@Nullable Context context) {
        super(context, f.sm_dialog_month_day_picker);
        final int i7 = 0;
        this.tv_confirm = C2131j.b(new Function0(this) { // from class: Ad.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MonthDayPickerDialog f179b;

            {
                this.f179b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return MonthDayPickerDialog.tv_confirm_delegate$lambda$0(this.f179b);
                    case 1:
                        return MonthDayPickerDialog.tv_cancel_delegate$lambda$1(this.f179b);
                    case 2:
                        return MonthDayPickerDialog.rv_schedule_date_delegate$lambda$2(this.f179b);
                    default:
                        return MonthDayPickerDialog.tv_select_date_delegate$lambda$3(this.f179b);
                }
            }
        });
        final int i10 = 1;
        this.tv_cancel = C2131j.b(new Function0(this) { // from class: Ad.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MonthDayPickerDialog f179b;

            {
                this.f179b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return MonthDayPickerDialog.tv_confirm_delegate$lambda$0(this.f179b);
                    case 1:
                        return MonthDayPickerDialog.tv_cancel_delegate$lambda$1(this.f179b);
                    case 2:
                        return MonthDayPickerDialog.rv_schedule_date_delegate$lambda$2(this.f179b);
                    default:
                        return MonthDayPickerDialog.tv_select_date_delegate$lambda$3(this.f179b);
                }
            }
        });
        final int i11 = 2;
        this.rv_schedule_date = C2131j.b(new Function0(this) { // from class: Ad.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MonthDayPickerDialog f179b;

            {
                this.f179b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return MonthDayPickerDialog.tv_confirm_delegate$lambda$0(this.f179b);
                    case 1:
                        return MonthDayPickerDialog.tv_cancel_delegate$lambda$1(this.f179b);
                    case 2:
                        return MonthDayPickerDialog.rv_schedule_date_delegate$lambda$2(this.f179b);
                    default:
                        return MonthDayPickerDialog.tv_select_date_delegate$lambda$3(this.f179b);
                }
            }
        });
        final int i12 = 3;
        this.tv_select_date = C2131j.b(new Function0(this) { // from class: Ad.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MonthDayPickerDialog f179b;

            {
                this.f179b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return MonthDayPickerDialog.tv_confirm_delegate$lambda$0(this.f179b);
                    case 1:
                        return MonthDayPickerDialog.tv_cancel_delegate$lambda$1(this.f179b);
                    case 2:
                        return MonthDayPickerDialog.rv_schedule_date_delegate$lambda$2(this.f179b);
                    default:
                        return MonthDayPickerDialog.tv_select_date_delegate$lambda$3(this.f179b);
                }
            }
        });
        this.dates = new ArrayList<>();
    }

    private final RecyclerView getRv_schedule_date() {
        Object value = this.rv_schedule_date.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    private final SpannableStringBuilder getSelectedText(Integer monthDay) {
        String str;
        SpanUtils spanUtilsI = G.i("Automatically transfer on ");
        if (monthDay != null && monthDay.intValue() == 1) {
            str = monthDay + "st";
        } else if (monthDay != null && monthDay.intValue() == 2) {
            str = monthDay + "nd";
        } else if (monthDay != null && monthDay.intValue() == 3) {
            str = monthDay + "rd";
        } else {
            str = monthDay + "th";
        }
        return spanUtilsI.append(str).setForegroundColor(getContext().getColor(L6.b.ppColorPrimary)).append(" of every month").create();
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
    public static final void initViews$lambda$5(MonthDayPickerDialog monthDayPickerDialog, View view) {
        OnMonthDaySelectedListener onMonthDaySelectedListener = monthDayPickerDialog.onWheelItemClickListener;
        if (onMonthDaySelectedListener != null) {
            onMonthDaySelectedListener.onMonthDaySelected(monthDayPickerDialog.selectWeekDay);
        }
        monthDayPickerDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$7$lambda$6(MonthDayPickerDialog monthDayPickerDialog, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        monthDayPickerDialog.selectWeekDay = monthDayPickerDialog.dates.get(i7);
        P p3 = monthDayPickerDialog.adapter;
        if (p3 != null) {
            p3.f184a = i7;
            p3.notifyDataSetChanged();
        }
        TextView tv_select_date = monthDayPickerDialog.getTv_select_date();
        O o10 = monthDayPickerDialog.selectWeekDay;
        tv_select_date.setText(monthDayPickerDialog.getSelectedText(o10 != null ? o10.f183b : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rv_schedule_date_delegate$lambda$2(MonthDayPickerDialog monthDayPickerDialog) {
        return (RecyclerView) monthDayPickerDialog.findViewById(e.rv_schedule_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_cancel_delegate$lambda$1(MonthDayPickerDialog monthDayPickerDialog) {
        return (TextView) monthDayPickerDialog.findViewById(e.tv_cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_confirm_delegate$lambda$0(MonthDayPickerDialog monthDayPickerDialog) {
        return (TextView) monthDayPickerDialog.findViewById(e.tv_confirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_select_date_delegate$lambda$3(MonthDayPickerDialog monthDayPickerDialog) {
        return (TextView) monthDayPickerDialog.findViewById(e.tv_select_date);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Integer num;
        showAtBottom(getWindow());
        final int i7 = 0;
        getTv_cancel().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MonthDayPickerDialog f181b;

            {
                this.f181b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f181b.dismiss();
                        break;
                    default:
                        MonthDayPickerDialog.initViews$lambda$5(this.f181b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        getTv_confirm().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MonthDayPickerDialog f181b;

            {
                this.f181b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f181b.dismiss();
                        break;
                    default:
                        MonthDayPickerDialog.initViews$lambda$5(this.f181b, view);
                        break;
                }
            }
        });
        for (int i11 = 1; i11 < 31; i11++) {
            if (i11 == 1) {
                this.dates.add(new O(u.g(i11, "st"), Integer.valueOf(i11)));
            } else if (i11 == 2) {
                this.dates.add(new O(u.g(i11, "nd"), Integer.valueOf(i11)));
            } else if (i11 != 3) {
                this.dates.add(new O(u.g(i11, "th"), Integer.valueOf(i11)));
            } else {
                this.dates.add(new O(u.g(i11, "rd"), Integer.valueOf(i11)));
            }
        }
        ArrayList<O> dates = this.dates;
        Intrinsics.checkNotNullParameter(dates, "dates");
        P p3 = new P(f.sm_item_month_day_picker, dates);
        p3.setOnItemClickListener(new A8.a(this, 9));
        this.adapter = p3;
        getRv_schedule_date().setAdapter(this.adapter);
        getRv_schedule_date().setLayoutManager(new GridLayoutManager(getContext(), 7));
        getRv_schedule_date().addItemDecoration(new Q());
        O o10 = this.currentMonthDay;
        if (o10 == null) {
            O o11 = this.dates.get(0);
            Intrinsics.checkNotNullExpressionValue(o11, "get(...)");
            o10 = o11;
        }
        this.currentMonthDay = o10;
        TextView tv_select_date = getTv_select_date();
        O o12 = this.currentMonthDay;
        tv_select_date.setText(getSelectedText(o12 != null ? o12.f183b : null));
        O o13 = this.currentMonthDay;
        int iIntValue = ((o13 == null || (num = o13.f183b) == null) ? 1 : num.intValue()) - 1;
        P p10 = this.adapter;
        if (p10 != null) {
            p10.f184a = iIntValue;
            p10.notifyDataSetChanged();
        }
    }

    @NotNull
    public final MonthDayPickerDialog setCurrentMonthDay(@Nullable O monthDay) {
        this.currentMonthDay = monthDay;
        this.selectWeekDay = monthDay;
        return this;
    }

    @NotNull
    public final MonthDayPickerDialog setOnMonthDaySelectedListener(@NotNull OnMonthDaySelectedListener onWheelItemClickListener) {
        Intrinsics.checkNotNullParameter(onWheelItemClickListener, "onWheelItemClickListener");
        this.onWheelItemClickListener = onWheelItemClickListener;
        return this;
    }
}
