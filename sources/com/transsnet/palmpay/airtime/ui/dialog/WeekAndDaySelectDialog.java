package com.transsnet.palmpay.airtime.ui.dialog;

import Ad.L;
import Gd.n;
import M1.j;
import Rd.Z;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.core.bean.DayPickBean;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p025ba.l;
import p059e1.a;
import p068ec.d;
import p155k9.g;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 <2\u00020\u0001:\u0002=>B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R+\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u00101R\"\u00103\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0013\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017¨\u0006?"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/dialog/WeekAndDaySelectDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/transsnet/palmpay/core/bean/DayPickBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "updateMonthHintDialog", "(Lcom/transsnet/palmpay/core/bean/DayPickBean;)V", "initViews", "()V", "show", "LRd/Z;", "binding", "LRd/Z;", "", "model", "I", "getModel", "()I", "setModel", "(I)V", "selectedDay", "Lcom/transsnet/palmpay/core/bean/DayPickBean;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "timeWeeks$delegate", "Lkotlin/Lazy;", "getTimeWeeks", "()Ljava/util/ArrayList;", "timeWeeks", "Lcom/transsnet/palmpay/airtime/ui/dialog/WeekAndDaySelectDialog$Callback;", "callBack", "Lcom/transsnet/palmpay/airtime/ui/dialog/WeekAndDaySelectDialog$Callback;", "getCallBack", "()Lcom/transsnet/palmpay/airtime/ui/dialog/WeekAndDaySelectDialog$Callback;", "setCallBack", "(Lcom/transsnet/palmpay/airtime/ui/dialog/WeekAndDaySelectDialog$Callback;)V", "Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;", "wheelView$delegate", "getWheelView", "()Lcom/transsnet/palmpay/custom_view/wheelview/widget/WheelView;", "wheelView", "Lk9/g;", "dayListAdapter$delegate", "getDayListAdapter", "()Lk9/g;", "dayListAdapter", "weekSelected", "Ljava/lang/String;", "getWeekSelected", "()Ljava/lang/String;", "setWeekSelected", "(Ljava/lang/String;)V", "weekSelectedIndex", "getWeekSelectedIndex", "setWeekSelectedIndex", "Companion", "a", "Callback", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WeekAndDaySelectDialog extends b {
    public static final int MODEL_DAY = 3;
    public static final int MODEL_MONTH = 2;
    public static final int MODEL_WEEK = 1;

    @Nullable
    private Z binding;

    @Nullable
    private Callback callBack;

    /* JADX INFO: renamed from: dayListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dayListAdapter;
    private int model;

    @Nullable
    private DayPickBean selectedDay;

    /* JADX INFO: renamed from: timeWeeks$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeWeeks;

    @NotNull
    private String weekSelected;
    private int weekSelectedIndex;

    /* JADX INFO: renamed from: wheelView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wheelView;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/dialog/WeekAndDaySelectDialog$Callback;", "", "onDataSelected", "", "model", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
        void onDataSelected(int model, int data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekAndDaySelectDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.model = 1;
        this.timeWeeks = C2131j.b(new n(context, 10));
        this.wheelView = C2131j.b(new d(this, 8));
        this.dayListAdapter = C2131j.b(new c(28));
        this.weekSelected = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g dayListAdapter_delegate$lambda$2() {
        g gVar = new g(Pd.d.qt_item_pick_day, null);
        gVar.f38716a = -1;
        return gVar;
    }

    private final ArrayList<String> getTimeWeeks() {
        return (ArrayList) this.timeWeeks.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(WeekAndDaySelectDialog weekAndDaySelectDialog, int i7, String str) {
        TextView textView;
        Intrinsics.e(str);
        weekAndDaySelectDialog.weekSelected = str;
        weekAndDaySelectDialog.weekSelectedIndex = i7 + 1;
        SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(weekAndDaySelectDialog.mContext.getString(k.core_select_week_date_hint)).append(" ").append(weekAndDaySelectDialog.weekSelected).setForegroundColor(weekAndDaySelectDialog.mContext.getColor(L6.b.ppColorTextPrimary)).setBold().create();
        Z z3 = weekAndDaySelectDialog.binding;
        if (z3 == null || (textView = z3.f8193g) == null) {
            return;
        }
        textView.setText(spannableStringBuilderCreate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(WeekAndDaySelectDialog weekAndDaySelectDialog, View view) {
        View view2;
        View view3;
        TextView textView;
        TextView textView2;
        TextView textView3;
        RecyclerView recyclerView;
        WheelView wheelView;
        Z z3 = weekAndDaySelectDialog.binding;
        if (z3 != null && (wheelView = z3.f8198v) != null) {
            wheelView.setVisibility(0);
        }
        Z z8 = weekAndDaySelectDialog.binding;
        if (z8 != null && (recyclerView = z8.f8192f) != null) {
            recyclerView.setVisibility(8);
        }
        weekAndDaySelectDialog.model = 1;
        SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(weekAndDaySelectDialog.mContext.getString(k.core_select_week_date_hint)).append(" ").append(weekAndDaySelectDialog.getWheelView().getSelectionItem()).setForegroundColor(weekAndDaySelectDialog.mContext.getColor(L6.b.ppColorTextPrimary)).setBold().create();
        Z z10 = weekAndDaySelectDialog.binding;
        if (z10 != null && (textView3 = z10.f8193g) != null) {
            textView3.setText(spannableStringBuilderCreate);
        }
        Z z11 = weekAndDaySelectDialog.binding;
        if (z11 != null && (textView2 = z11.f8189c) != null) {
            textView2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, weekAndDaySelectDialog.getContext()));
        }
        Z z12 = weekAndDaySelectDialog.binding;
        if (z12 != null && (textView = z12.f8188b) != null) {
            textView.setTextColor(weekAndDaySelectDialog.mContext.getColor(L6.b.ppColorTextAssist));
        }
        Z z13 = weekAndDaySelectDialog.binding;
        if (z13 != null && (view3 = z13.f8195j) != null) {
            view3.setVisibility(0);
        }
        Z z14 = weekAndDaySelectDialog.binding;
        if (z14 == null || (view2 = z14.f8194i) == null) {
            return;
        }
        view2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$6(WeekAndDaySelectDialog weekAndDaySelectDialog, View view) {
        View view2;
        View view3;
        TextView textView;
        TextView textView2;
        RecyclerView recyclerView;
        WheelView wheelView;
        Z z3 = weekAndDaySelectDialog.binding;
        if (z3 != null && (wheelView = z3.f8198v) != null) {
            wheelView.setVisibility(8);
        }
        Z z8 = weekAndDaySelectDialog.binding;
        if (z8 != null && (recyclerView = z8.f8192f) != null) {
            recyclerView.setVisibility(0);
        }
        weekAndDaySelectDialog.model = 2;
        Z z10 = weekAndDaySelectDialog.binding;
        if (z10 != null && (textView2 = z10.f8189c) != null) {
            textView2.setTextColor(weekAndDaySelectDialog.mContext.getColor(L6.b.ppColorTextAssist));
        }
        Z z11 = weekAndDaySelectDialog.binding;
        if (z11 != null && (textView = z11.f8188b) != null) {
            textView.setTextColor(weekAndDaySelectDialog.mContext.getColor(L6.b.ppColorPrimary));
        }
        Z z12 = weekAndDaySelectDialog.binding;
        if (z12 != null && (view3 = z12.f8195j) != null) {
            view3.setVisibility(8);
        }
        Z z13 = weekAndDaySelectDialog.binding;
        if (z13 != null && (view2 = z13.f8194i) != null) {
            view2.setVisibility(0);
        }
        weekAndDaySelectDialog.updateMonthHintDialog(weekAndDaySelectDialog.selectedDay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$8(WeekAndDaySelectDialog weekAndDaySelectDialog, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        DayPickBean dayPickBean = (DayPickBean) weekAndDaySelectDialog.getDayListAdapter().getItem(i7);
        if (dayPickBean != null) {
            weekAndDaySelectDialog.selectedDay = dayPickBean;
            int i10 = weekAndDaySelectDialog.getDayListAdapter().f38716a;
            weekAndDaySelectDialog.getDayListAdapter().f38716a = i7;
            weekAndDaySelectDialog.getDayListAdapter().notifyItemChanged(i10);
            weekAndDaySelectDialog.getDayListAdapter().notifyItemChanged(i7);
            weekAndDaySelectDialog.updateMonthHintDialog(weekAndDaySelectDialog.selectedDay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$9(WeekAndDaySelectDialog weekAndDaySelectDialog, View view) {
        Callback callback;
        if (weekAndDaySelectDialog.getWheelView().getVisibility() == 0) {
            Callback callback2 = weekAndDaySelectDialog.callBack;
            if (callback2 != null) {
                callback2.onDataSelected(weekAndDaySelectDialog.model, weekAndDaySelectDialog.weekSelectedIndex);
            }
        } else {
            DayPickBean dayPickBean = weekAndDaySelectDialog.selectedDay;
            if (dayPickBean != null && (callback = weekAndDaySelectDialog.callBack) != null) {
                callback.onDataSelected(weekAndDaySelectDialog.model, dayPickBean != null ? dayPickBean.getDay() : 1);
            }
        }
        weekAndDaySelectDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList timeWeeks_delegate$lambda$0(Context context) {
        return C1850q.e(context.getString(k.core_monday), context.getString(k.core_tuesday), context.getString(k.core_wednesday), context.getString(k.core_thursday), context.getString(k.core_friday), context.getString(k.core_saturday), context.getString(k.core_sunday));
    }

    private final void updateMonthHintDialog(DayPickBean data) {
        TextView textView;
        TextView textView2;
        if (data == null) {
            Z z3 = this.binding;
            if (z3 == null || (textView = z3.f8193g) == null) {
                return;
            }
            textView.setText("");
            return;
        }
        SpanUtils spanUtilsAppend = new SpanUtils().append(this.mContext.getString(k.core_select_day_hint)).append(" ").append(CommonViewExtKt.toDayOfMonthByIndex(data.getDay())).setForegroundColor(this.mContext.getColor(L6.b.ppColorTextPrimary)).setBold().append(" of every month.");
        if (data.getDay() > 27) {
            spanUtilsAppend.append(" ").append(this.mContext.getString(k.core_select_day_hint1));
        }
        Z z8 = this.binding;
        if (z8 == null || (textView2 = z8.f8193g) == null) {
            return;
        }
        textView2.setText(spanUtilsAppend.create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WheelView wheelView_delegate$lambda$1(WeekAndDaySelectDialog weekAndDaySelectDialog) {
        return (WheelView) weekAndDaySelectDialog.findViewById(Pd.c.wheel_view);
    }

    @Nullable
    public final Callback getCallBack() {
        return this.callBack;
    }

    @NotNull
    public final g getDayListAdapter() {
        return (g) this.dayListAdapter.getValue();
    }

    public final int getModel() {
        return this.model;
    }

    @NotNull
    public final String getWeekSelected() {
        return this.weekSelected;
    }

    public final int getWeekSelectedIndex() {
        return this.weekSelectedIndex;
    }

    @NotNull
    public final WheelView<String> getWheelView() {
        Object value = this.wheelView.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (WheelView) value;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        View viewM2;
        setContentView(Pd.d.qt_dialog_select_time);
        View viewFindViewById = findViewById(Pd.c.rootView);
        int i7 = Pd.c.cds_by_month_tv;
        TextView textView = (TextView) a.m(i7, viewFindViewById);
        if (textView != null) {
            i7 = Pd.c.cds_by_week_tv;
            TextView textView2 = (TextView) a.m(i7, viewFindViewById);
            if (textView2 != null) {
                i7 = Pd.c.cds_close;
                IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
                if (iconicsImageView != null) {
                    i7 = Pd.c.cds_confirm_tv;
                    TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                    if (textView3 != null) {
                        i7 = Pd.c.cds_date_rcv;
                        RecyclerView recyclerView = (RecyclerView) a.m(i7, viewFindViewById);
                        if (recyclerView != null) {
                            i7 = Pd.c.cds_hint_tv;
                            TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                            if (textView4 != null && (viewM = a.m((i7 = Pd.c.cds_inditor_month), viewFindViewById)) != null && (viewM2 = a.m((i7 = Pd.c.cds_inditor_week), viewFindViewById)) != null) {
                                i7 = Pd.c.cds_tab_area;
                                if (((ConstraintLayout) a.m(i7, viewFindViewById)) != null) {
                                    i7 = Pd.c.cds_title;
                                    FrameLayout frameLayout = (FrameLayout) a.m(i7, viewFindViewById);
                                    if (frameLayout != null) {
                                        i7 = Pd.c.cds_title_tv;
                                        TextView textView5 = (TextView) a.m(i7, viewFindViewById);
                                        if (textView5 != null) {
                                            i7 = Pd.c.cds_viewpager;
                                            FrameLayout frameLayout2 = (FrameLayout) a.m(i7, viewFindViewById);
                                            if (frameLayout2 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                                                i7 = Pd.c.wheel_view;
                                                WheelView wheelView = (WheelView) a.m(i7, viewFindViewById);
                                                if (wheelView != null) {
                                                    this.binding = new Z(constraintLayout, textView, textView2, iconicsImageView, textView3, recyclerView, textView4, viewM, viewM2, frameLayout, textView5, frameLayout2, wheelView);
                                                    Window window = getWindow();
                                                    if (window != null) {
                                                        window.setGravity(80);
                                                    }
                                                    if (window != null) {
                                                        window.setWindowAnimations(l.dialog_bottom_in_out);
                                                    }
                                                    Intrinsics.e(window);
                                                    WindowManager.LayoutParams attributes = window.getAttributes();
                                                    attributes.width = ScreenUtils.getScreenWidth();
                                                    attributes.height = -2;
                                                    window.setAttributes(attributes);
                                                    Z z3 = this.binding;
                                                    if (z3 != null) {
                                                        z3.f8192f.setLayoutManager(new GridLayoutManager(this.mContext, 7));
                                                    }
                                                    Z z8 = this.binding;
                                                    if (z8 != null) {
                                                        z8.f8192f.setAdapter(getDayListAdapter());
                                                    }
                                                    ArrayList arrayList = new ArrayList();
                                                    for (int i10 = 1; i10 < 32; i10++) {
                                                        arrayList.add(new DayPickBean(i10));
                                                    }
                                                    getDayListAdapter().setList(arrayList);
                                                    dc.b bVar = new dc.b();
                                                    bVar.f35864a = 0;
                                                    bVar.f35866c = this.mContext.getResources().getColor(L6.b.ppColorTextAssist);
                                                    bVar.f35867d = this.mContext.getResources().getColor(L6.b.ppColorPrimary);
                                                    bVar.f35868e = 18;
                                                    bVar.f35869f = 23;
                                                    bVar.f35865b = this.mContext.getResources().getColor(L6.b.ppColorPrimary);
                                                    getWheelView().setWheelData(getTimeWeeks());
                                                    String str = getTimeWeeks().get(0);
                                                    Intrinsics.checkNotNullExpressionValue(str, "get(...)");
                                                    this.weekSelected = str;
                                                    this.weekSelectedIndex = 0;
                                                    getWheelView().setWheelAdapter(new L(this.mContext, 2, false));
                                                    getWheelView().setSkin(dc.a.f35861b);
                                                    getWheelView().setWheelSize(5);
                                                    getWheelView().setSelection(1);
                                                    getWheelView().setStyle(bVar);
                                                    SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(this.mContext.getString(k.core_select_week_date_hint)).append(" ").append(getTimeWeeks().get(1)).setForegroundColor(this.mContext.getColor(L6.b.ppColorTextPrimary)).setBold().create();
                                                    Z z10 = this.binding;
                                                    if (z10 != null) {
                                                        z10.f8193g.setText(spannableStringBuilderCreate);
                                                    }
                                                    Z z11 = this.binding;
                                                    if (z11 != null) {
                                                        z11.f8197p.setText(k.core_top_up_date);
                                                    }
                                                    getWheelView().setOnWheelItemSelectedListener(new p170l9.d(this));
                                                    Z z12 = this.binding;
                                                    if (z12 != null) {
                                                        final int i11 = 0;
                                                        z12.f8190d.setOnClickListener(new View.OnClickListener(this) { // from class: l9.e

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ WeekAndDaySelectDialog f39293b;

                                                            {
                                                                this.f39293b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i11) {
                                                                    case 0:
                                                                        this.f39293b.dismiss();
                                                                        break;
                                                                    case 1:
                                                                        WeekAndDaySelectDialog.initViews$lambda$5(this.f39293b, view);
                                                                        break;
                                                                    case 2:
                                                                        WeekAndDaySelectDialog.initViews$lambda$6(this.f39293b, view);
                                                                        break;
                                                                    default:
                                                                        WeekAndDaySelectDialog.initViews$lambda$9(this.f39293b, view);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                    Z z13 = this.binding;
                                                    if (z13 != null) {
                                                        final int i12 = 1;
                                                        z13.f8189c.setOnClickListener(new View.OnClickListener(this) { // from class: l9.e

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ WeekAndDaySelectDialog f39293b;

                                                            {
                                                                this.f39293b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i12) {
                                                                    case 0:
                                                                        this.f39293b.dismiss();
                                                                        break;
                                                                    case 1:
                                                                        WeekAndDaySelectDialog.initViews$lambda$5(this.f39293b, view);
                                                                        break;
                                                                    case 2:
                                                                        WeekAndDaySelectDialog.initViews$lambda$6(this.f39293b, view);
                                                                        break;
                                                                    default:
                                                                        WeekAndDaySelectDialog.initViews$lambda$9(this.f39293b, view);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                    Z z14 = this.binding;
                                                    if (z14 != null) {
                                                        final int i13 = 2;
                                                        z14.f8188b.setOnClickListener(new View.OnClickListener(this) { // from class: l9.e

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ WeekAndDaySelectDialog f39293b;

                                                            {
                                                                this.f39293b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i13) {
                                                                    case 0:
                                                                        this.f39293b.dismiss();
                                                                        break;
                                                                    case 1:
                                                                        WeekAndDaySelectDialog.initViews$lambda$5(this.f39293b, view);
                                                                        break;
                                                                    case 2:
                                                                        WeekAndDaySelectDialog.initViews$lambda$6(this.f39293b, view);
                                                                        break;
                                                                    default:
                                                                        WeekAndDaySelectDialog.initViews$lambda$9(this.f39293b, view);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                    getDayListAdapter().setOnItemClickListener(new p170l9.d(this));
                                                    Z z15 = this.binding;
                                                    if (z15 != null) {
                                                        final int i14 = 3;
                                                        z15.f8191e.setOnClickListener(new View.OnClickListener(this) { // from class: l9.e

                                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                            public final /* synthetic */ WeekAndDaySelectDialog f39293b;

                                                            {
                                                                this.f39293b = this;
                                                            }

                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                switch (i14) {
                                                                    case 0:
                                                                        this.f39293b.dismiss();
                                                                        break;
                                                                    case 1:
                                                                        WeekAndDaySelectDialog.initViews$lambda$5(this.f39293b, view);
                                                                        break;
                                                                    case 2:
                                                                        WeekAndDaySelectDialog.initViews$lambda$6(this.f39293b, view);
                                                                        break;
                                                                    default:
                                                                        WeekAndDaySelectDialog.initViews$lambda$9(this.f39293b, view);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void setCallBack(@Nullable Callback callback) {
        this.callBack = callback;
    }

    public final void setModel(int i7) {
        this.model = i7;
    }

    public final void setWeekSelected(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.weekSelected = str;
    }

    public final void setWeekSelectedIndex(int i7) {
        this.weekSelectedIndex = i7;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
    }
}
