package p096g8;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.sy007.calendar.widget.BaseMonthView;
import com.sy007.calendar.widget.RangeMonthView;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p081f8.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMonthView f36884b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(BaseMonthView baseMonthView, int i7) {
        super(3);
        this.f36883a = i7;
        this.f36884b = baseMonthView;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f36883a) {
            case 0:
                Canvas canvas = (Canvas) obj;
                b calendarDay = (b) obj2;
                Rect rect = (Rect) obj3;
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(calendarDay, "calendarDay");
                Intrinsics.checkNotNullParameter(rect, "rect");
                this.f36884b.a(canvas, calendarDay, rect);
                int i7 = calendarDay.f36416d;
                Calendar tempCalendar = calendarDay.f36413a;
                tempCalendar.clear();
                tempCalendar.set(1, calendarDay.f36414b);
                tempCalendar.set(2, calendarDay.f36415c);
                tempCalendar.set(5, calendarDay.f36416d);
                Intrinsics.checkNotNullExpressionValue(tempCalendar, "tempCalendar");
                tempCalendar.set(5, i7);
                tempCalendar.get(7);
                Intrinsics.n("calendarConfig");
                throw null;
            default:
                Intrinsics.checkNotNullParameter((Canvas) obj, "canvas");
                Intrinsics.checkNotNullParameter((b) obj2, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter((Rect) obj3, "rect");
                ((RangeMonthView) this.f36884b).c();
                return Unit.f38893a;
        }
    }
}
