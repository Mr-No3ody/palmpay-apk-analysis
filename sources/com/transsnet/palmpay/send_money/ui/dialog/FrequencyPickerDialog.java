package com.transsnet.palmpay.send_money.ui.dialog;

import Ad.L;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.send_money.ui.dialog.FrequencyPickerDialog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002)*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u00002\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/FrequencyPickerDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Ljava/util/ArrayList;", "LJd/a;", "Lkotlin/collections/ArrayList;", "dates", "setDate", "(Ljava/util/ArrayList;)Lcom/transsnet/palmpay/send_money/ui/dialog/FrequencyPickerDialog;", "date", "setCurrentDate", "(LJd/a;)Lcom/transsnet/palmpay/send_money/ui/dialog/FrequencyPickerDialog;", "Lcom/transsnet/palmpay/send_money/ui/dialog/FrequencyPickerDialog$OnFrequencySelectedListener;", "onFrequencySelectedListener", "setOnFrequencySelectedListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/FrequencyPickerDialog$OnFrequencySelectedListener;)Lcom/transsnet/palmpay/send_money/ui/dialog/FrequencyPickerDialog;", "Landroid/content/Context;", "Landroid/widget/TextView;", "tv_confirm$delegate", "Lkotlin/Lazy;", "getTv_confirm", "()Landroid/widget/TextView;", "tv_confirm", "tv_cancel$delegate", "getTv_cancel", "tv_cancel", "Lcom/transsnet/palmpay/send_money/ui/dialog/FrequencyPickerDialog$OnFrequencySelectedListener;", "Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;", "wheelView", "Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;", "", "Ljava/util/List;", "currentDate", "LJd/a;", "selectDate", "Ad/L", "OnFrequencySelectedListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrequencyPickerDialog extends b {

    @NotNull
    private final Context context;

    @Nullable
    private Jd.a currentDate;

    @NotNull
    private List<Jd.a> dates;

    @Nullable
    private OnFrequencySelectedListener onFrequencySelectedListener;

    @Nullable
    private Jd.a selectDate;

    /* JADX INFO: renamed from: tv_cancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_cancel;

    /* JADX INFO: renamed from: tv_confirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_confirm;
    private WheelView<Jd.a> wheelView;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/FrequencyPickerDialog$OnFrequencySelectedListener;", "", "LJd/a;", "frequency", "", "onFrequencySelected", "(LJd/a;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnFrequencySelectedListener {
        void onFrequencySelected(@Nullable Jd.a frequency);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrequencyPickerDialog(@NotNull Context context) {
        super(context, f.sm_dialog_frequency_picker);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final int i7 = 0;
        this.tv_confirm = C2131j.b(new Function0(this) { // from class: Ad.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FrequencyPickerDialog f172b;

            {
                this.f172b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return FrequencyPickerDialog.tv_confirm_delegate$lambda$0(this.f172b);
                    default:
                        return FrequencyPickerDialog.tv_cancel_delegate$lambda$1(this.f172b);
                }
            }
        });
        final int i10 = 1;
        this.tv_cancel = C2131j.b(new Function0(this) { // from class: Ad.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FrequencyPickerDialog f172b;

            {
                this.f172b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return FrequencyPickerDialog.tv_confirm_delegate$lambda$0(this.f172b);
                    default:
                        return FrequencyPickerDialog.tv_cancel_delegate$lambda$1(this.f172b);
                }
            }
        });
        this.dates = new ArrayList();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(FrequencyPickerDialog frequencyPickerDialog, View view) {
        OnFrequencySelectedListener onFrequencySelectedListener = frequencyPickerDialog.onFrequencySelectedListener;
        if (onFrequencySelectedListener != null) {
            onFrequencySelectedListener.onFrequencySelected(frequencyPickerDialog.selectDate);
        }
        frequencyPickerDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_cancel_delegate$lambda$1(FrequencyPickerDialog frequencyPickerDialog) {
        return (TextView) frequencyPickerDialog.findViewById(e.tv_cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_confirm_delegate$lambda$0(FrequencyPickerDialog frequencyPickerDialog) {
        return (TextView) frequencyPickerDialog.findViewById(e.tv_confirm);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        showAtBottom(getWindow());
        final int i7 = 0;
        getTv_cancel().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FrequencyPickerDialog f174b;

            {
                this.f174b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f174b.dismiss();
                        break;
                    default:
                        FrequencyPickerDialog.initViews$lambda$3(this.f174b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        getTv_confirm().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FrequencyPickerDialog f174b;

            {
                this.f174b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f174b.dismiss();
                        break;
                    default:
                        FrequencyPickerDialog.initViews$lambda$3(this.f174b, view);
                        break;
                }
            }
        });
        WheelView<Jd.a> wheelView = (WheelView) findViewById(e.wv_schedule_date);
        this.wheelView = wheelView;
        if (wheelView == null) {
            Intrinsics.n("wheelView");
            throw null;
        }
        wheelView.setWheelAdapter(new L(this.context, 0));
        wheelView.setSkin(dc.a.f35861b);
        wheelView.setWheelSize(5);
        dc.b bVar = new dc.b();
        int i11 = 0;
        bVar.f35864a = 0;
        bVar.f35866c = CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, this.context);
        bVar.f35867d = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, this.context);
        bVar.f35868e = 16;
        bVar.f35869f = 22;
        bVar.f35865b = CommonViewExtKt.colorInt(p.transparent, this.context);
        wheelView.setStyle(bVar);
        wheelView.setOnWheelItemSelectedListener(new A8.a(this, 8));
        wheelView.setWheelData(this.dates);
        Jd.a aVar = this.currentDate;
        if (aVar != null && aVar.f4769a > 0) {
            int size = this.dates.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (Intrinsics.c(this.dates.get(i12).f4770b, aVar.f4770b)) {
                    i11 = i12;
                    break;
                }
            }
        }
        this.selectDate = (Jd.a) CollectionsKt.G(i11, this.dates);
        WheelView<Jd.a> wheelView2 = this.wheelView;
        if (wheelView2 == null) {
            Intrinsics.n("wheelView");
            throw null;
        }
        wheelView2.setSelection(i11);
    }

    @NotNull
    public final FrequencyPickerDialog setCurrentDate(@Nullable Jd.a date) {
        this.currentDate = date;
        this.selectDate = date;
        return this;
    }

    @NotNull
    public final FrequencyPickerDialog setDate(@NotNull ArrayList<Jd.a> dates) {
        Intrinsics.checkNotNullParameter(dates, "dates");
        this.dates = dates;
        return this;
    }

    @NotNull
    public final FrequencyPickerDialog setOnFrequencySelectedListener(@NotNull OnFrequencySelectedListener onFrequencySelectedListener) {
        Intrinsics.checkNotNullParameter(onFrequencySelectedListener, "onFrequencySelectedListener");
        this.onFrequencySelectedListener = onFrequencySelectedListener;
        return this;
    }
}
