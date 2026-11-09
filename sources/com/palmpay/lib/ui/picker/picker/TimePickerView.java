package com.palmpay.lib.ui.picker.picker;

import Ba.a;
import L6.j;
import N8.C0463g;
import Rf.b;
import X6.c;
import X6.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import com.palmpay.lib.ui.picker.picker.model.TimePickerBean;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/palmpay/lib/ui/picker/picker/TimePickerView;", "Lcom/palmpay/lib/ui/picker/picker/PickerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getYearList", "()I", "getMonthList", "getDayList", "", "", "getMonthDataStrings", "()Ljava/util/List;", "", "getTime", "()J", "", "exchange", "", "setMonthDayExchange", "(Z)V", "lib_ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimePickerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePickerView.kt\ncom/palmpay/lib/ui/picker/picker/TimePickerView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n1869#2,2:333\n1869#2,2:335\n*S KotlinDebug\n*F\n+ 1 TimePickerView.kt\ncom/palmpay/lib/ui/picker/picker/TimePickerView\n*L\n132#1:333,2\n190#1:335,2\n*E\n"})
public final class TimePickerView extends PickerView {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f24497u0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Calendar f24498A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Calendar f24499B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f24500C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f24501H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f24502L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final List f24503M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayList f24504Q;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final ArrayList f24505k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f24506p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f24507q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f24508r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f24509s0;
    public final String t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f24510t0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f24511v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Calendar f24512w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimePickerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static List g(TimePickerView timePickerView) {
        timePickerView.f24507q0 = timePickerView.getYearList();
        return timePickerView.f24504Q;
    }

    private final int getDayList() {
        ArrayList arrayList = this.f24506p0;
        arrayList.clear();
        Calendar calendar = this.f24499B;
        int size = calendar.get(5);
        int actualMinimum = calendar.getActualMinimum(5);
        int actualMaximum = calendar.getActualMaximum(5);
        int i7 = calendar.get(1);
        Calendar calendar2 = this.f24512w;
        if (i7 == calendar2.get(1) && calendar.get(2) == calendar2.get(2)) {
            actualMinimum = calendar2.get(5);
            size = (size - actualMinimum) + 1;
        }
        int i10 = calendar.get(1);
        Calendar calendar3 = this.f24498A;
        if (i10 == calendar3.get(1) && calendar.get(2) == calendar3.get(2)) {
            actualMaximum = calendar3.get(5);
        }
        Iterator it = new IntRange(actualMinimum, actualMaximum, 1).iterator();
        while (((b) it).f8613c) {
            int iA = ((C) it).a();
            arrayList.add(new TimePickerBean(String.valueOf(iA), Integer.valueOf(iA)));
        }
        if (size > arrayList.size()) {
            size = arrayList.size();
        }
        return size - 1;
    }

    private final List<String> getMonthDataStrings() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM", Locale.ENGLISH);
        ArrayList arrayList = new ArrayList(12);
        for (int i7 = 0; i7 < 12; i7++) {
            calendar.set(2, i7);
            calendar.set(5, 1);
            String str = simpleDateFormat.format(calendar.getTime());
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            arrayList.add(str);
        }
        return arrayList;
    }

    private final int getMonthList() {
        int i7;
        ArrayList arrayList = this.f24505k0;
        arrayList.clear();
        Calendar calendar = this.f24499B;
        int i10 = calendar.get(2);
        int i11 = calendar.get(1);
        Calendar calendar2 = this.f24512w;
        if (i11 == calendar2.get(1)) {
            i7 = calendar2.get(2);
            i10 -= i7;
        } else {
            i7 = 0;
        }
        int i12 = calendar.get(1);
        Calendar calendar3 = this.f24498A;
        int i13 = i12 == calendar3.get(1) ? calendar3.get(2) : 11;
        if (i7 <= i13) {
            while (true) {
                arrayList.add(new TimePickerBean((String) this.f24503M.get(i7), Integer.valueOf(i7)));
                if (i7 == i13) {
                    break;
                }
                i7++;
            }
        }
        return i10 > arrayList.size() - 1 ? arrayList.size() - 1 : i10;
    }

    private final int getYearList() {
        ArrayList arrayList = this.f24504Q;
        arrayList.clear();
        Calendar calendar = this.f24512w;
        Iterator it = new IntRange(calendar.get(1), this.f24498A.get(1), 1).iterator();
        while (((b) it).f8613c) {
            int iA = ((C) it).a();
            arrayList.add(new TimePickerBean(String.valueOf(iA), Integer.valueOf(iA)));
        }
        return this.f24499B.get(1) - calendar.get(1);
    }

    public static List h(TimePickerView timePickerView) {
        timePickerView.f24508r0 = timePickerView.getMonthList();
        return timePickerView.f24505k0;
    }

    public static List i(TimePickerView timePickerView) {
        timePickerView.f24509s0 = timePickerView.getDayList();
        return timePickerView.f24506p0;
    }

    @Override // com.palmpay.lib.ui.picker.picker.PickerView
    public final void c(Function0 function0, Function1 function1, Function2 function2, Boolean bool) {
        setGetOneData(function0);
        setGetTowData(function1);
        setGetThreeData(function2);
        if (this.f24510t0 && bool.equals(Boolean.TRUE)) {
            removeAllViews();
            if (function2 == null) {
                if (indexOfChild(getThreeWheelView()) != -1) {
                    removeView(getThreeWheelView());
                }
            } else if (indexOfChild(getThreeWheelView()) == -1) {
                addView(getThreeWheelView());
            }
            if (function1 == null) {
                if (indexOfChild(getTowWheelView()) != -1) {
                    removeView(getTowWheelView());
                }
            } else if (indexOfChild(getTowWheelView()) == -1) {
                addView(getTowWheelView());
            }
        } else {
            if (function1 == null) {
                if (indexOfChild(getTowWheelView()) != -1) {
                    removeView(getTowWheelView());
                }
            } else if (indexOfChild(getTowWheelView()) == -1) {
                addView(getTowWheelView());
            }
            if (function2 == null) {
                if (indexOfChild(getThreeWheelView()) != -1) {
                    removeView(getThreeWheelView());
                }
            } else if (indexOfChild(getThreeWheelView()) == -1) {
                addView(getThreeWheelView());
            }
        }
        if (function0 == null) {
            if (indexOfChild(getOneWheelView()) != -1) {
                removeView(getOneWheelView());
            }
        } else if (indexOfChild(getOneWheelView()) == -1) {
            addView(getOneWheelView());
        }
        a();
    }

    public final long getTime() {
        return this.f24499B.getTimeInMillis();
    }

    public final void j(long j6) {
        this.f24499B.setTimeInMillis(j6);
        l(Boolean.FALSE);
    }

    public final void k(long j6, long j10, Long l5) {
        if (l5 != null) {
            this.f24499B.setTimeInMillis(l5.longValue());
        }
        this.f24512w.setTimeInMillis(j6);
        this.f24498A.setTimeInMillis(j10);
        l(Boolean.FALSE);
    }

    public final void l(Boolean bool) {
        c(this.f24502L ? null : new c(this, 1), this.f24501H ? null : new C0463g(this, 24), this.f24500C ? null : new a(this, 20), bool);
        getOneWheelView().setCurrentItem(this.f24507q0);
        getTowWheelView().setCurrentItem(this.f24508r0);
        getThreeWheelView().setCurrentItem(this.f24509s0);
        getOneWheelView().d();
    }

    public final void setMonthDayExchange(boolean exchange) {
        this.f24510t0 = exchange;
        l(Boolean.TRUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimePickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TimePickerView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimePickerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        String string = "1790-01-01 00:00:00";
        this.t = "1790-01-01 00:00:00";
        String string2 = "";
        this.f24511v = "";
        Calendar calendar = Calendar.getInstance();
        this.f24512w = calendar;
        Calendar calendar2 = Calendar.getInstance();
        this.f24498A = calendar2;
        Calendar calendar3 = Calendar.getInstance();
        this.f24499B = calendar3;
        this.f24503M = getMonthDataStrings();
        this.f24504Q = new ArrayList();
        this.f24505k0 = new ArrayList();
        this.f24506p0 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.PpTimePickerView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string3 = typedArrayObtainStyledAttributes.getString(j.PpTimePickerView_start);
        if (string3 != null && string3.length() != 0) {
            string = typedArrayObtainStyledAttributes.getString(j.PpTimePickerView_start);
            Intrinsics.e(string);
        }
        this.t = string;
        String string4 = typedArrayObtainStyledAttributes.getString(j.PpTimePickerView_end);
        if (string4 != null && string4.length() != 0) {
            string2 = typedArrayObtainStyledAttributes.getString(j.PpTimePickerView_end);
            Intrinsics.e(string2);
        }
        this.f24511v = string2;
        String string5 = typedArrayObtainStyledAttributes.getString(j.PpTimePickerView_selection);
        if (string5 != null && string5.length() != 0) {
            String string6 = typedArrayObtainStyledAttributes.getString(j.PpTimePickerView_selection);
            Intrinsics.e(string6);
            calendar3.setTime(f.a(string6));
        } else {
            calendar3.set(11, 0);
            calendar3.set(12, 0);
            calendar3.set(13, 0);
            calendar3.set(14, 0);
        }
        this.f24500C = typedArrayObtainStyledAttributes.getBoolean(j.PpTimePickerView_hide_day, false);
        this.f24501H = typedArrayObtainStyledAttributes.getBoolean(j.PpTimePickerView_hide_month, false);
        this.f24502L = typedArrayObtainStyledAttributes.getBoolean(j.PpTimePickerView_hide_year, false);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f24511v.length() > 0) {
            calendar2.setTime(f.a(this.f24511v));
        }
        calendar.setTime(f.a(this.t));
        l(Boolean.FALSE);
        setOnItemSelectedListener(new Function4() { // from class: X6.e
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                int i10 = TimePickerView.f24497u0;
                TimePickerView timePickerView = this.f11010a;
                ArrayList arrayList = timePickerView.f24504Q;
                Calendar calendar4 = timePickerView.f24499B;
                if (iIntValue == 1) {
                    Integer time = ((TimePickerBean) arrayList.get(iIntValue2)).getTime();
                    Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
                    calendar4.set(1, time.intValue());
                } else if (iIntValue == 2) {
                    Calendar calendar5 = Calendar.getInstance();
                    Integer time2 = ((TimePickerBean) arrayList.get(iIntValue2)).getTime();
                    Intrinsics.checkNotNullExpressionValue(time2, "getTime(...)");
                    calendar5.set(1, time2.intValue());
                    ArrayList arrayList2 = timePickerView.f24505k0;
                    Integer time3 = ((TimePickerBean) arrayList2.get(iIntValue3)).getTime();
                    Intrinsics.checkNotNullExpressionValue(time3, "getTime(...)");
                    calendar5.set(2, time3.intValue());
                    if (calendar4.getActualMaximum(5) > calendar5.getActualMaximum(5)) {
                        calendar4.set(5, calendar5.getActualMaximum(5));
                        Integer time4 = ((TimePickerBean) arrayList2.get(iIntValue3)).getTime();
                        Intrinsics.checkNotNullExpressionValue(time4, "getTime(...)");
                        calendar4.set(2, time4.intValue());
                    } else {
                        Integer time5 = ((TimePickerBean) arrayList2.get(iIntValue3)).getTime();
                        Intrinsics.checkNotNullExpressionValue(time5, "getTime(...)");
                        calendar4.set(2, time5.intValue());
                    }
                } else if (iIntValue == 3) {
                    Integer time6 = ((TimePickerBean) timePickerView.f24506p0.get(iIntValue4)).getTime();
                    Intrinsics.checkNotNullExpressionValue(time6, "getTime(...)");
                    calendar4.set(5, time6.intValue());
                }
                return Unit.f38893a;
            }
        });
    }
}
