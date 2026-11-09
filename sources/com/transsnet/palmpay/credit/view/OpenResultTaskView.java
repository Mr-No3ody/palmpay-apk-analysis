package com.transsnet.palmpay.credit.view;

import C0.G;
import Gb.I;
import Pa.H;
import Pa.a0;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.req.CLTaskReq;
import com.transsnet.palmpay.credit.bean.resp.CLTaskResp;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.q;
import df.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p221ob.c;
import p339wb.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/credit/view/OpenResultTaskView;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getTaskData", "()V", "Lcom/transsnet/palmpay/credit/view/OpenResultTaskView$taskAllDoneInterface;", "v", "Lcom/transsnet/palmpay/credit/view/OpenResultTaskView$taskAllDoneInterface;", "getMTaskAllDoneInterface", "()Lcom/transsnet/palmpay/credit/view/OpenResultTaskView$taskAllDoneInterface;", "setMTaskAllDoneInterface", "(Lcom/transsnet/palmpay/credit/view/OpenResultTaskView$taskAllDoneInterface;)V", "mTaskAllDoneInterface", "a", "taskAllDoneInterface", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOpenResultTaskView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenResultTaskView.kt\ncom/transsnet/palmpay/credit/view/OpenResultTaskView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1869#2,2:182\n*S KotlinDebug\n*F\n+ 1 OpenResultTaskView.kt\ncom/transsnet/palmpay/credit/view/OpenResultTaskView\n*L\n154#1:182,2\n*E\n"})
public final class OpenResultTaskView extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f30850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f30851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f30852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f30853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f30854g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f30855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f30856j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f30857o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f30858p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public taskAllDoneInterface mTaskAllDoneInterface;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/view/OpenResultTaskView$taskAllDoneInterface;", "", "taskAllDone", "", "allDone", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface taskAllDoneInterface {
        void taskAllDone(boolean allDone);
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OpenResultTaskView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void d(OpenResultTaskView openResultTaskView, CLTaskResp.CLTaskData cLTaskData) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<CLTaskResp.CLTaskData.CLTask> dailyTasks = cLTaskData.getDailyTasks();
        if (dailyTasks == null || dailyTasks.isEmpty()) {
            return;
        }
        LinearLayout linearLayout = openResultTaskView.f30856j;
        if (linearLayout != null) {
            List<CLTaskResp.CLTaskData.CLTask> dailyTasks2 = cLTaskData.getDailyTasks();
            h.s(linearLayout, !(dailyTasks2 == null || dailyTasks2.isEmpty()));
        }
        List<CLTaskResp.CLTaskData.CLTask> dailyTasks3 = cLTaskData.getDailyTasks();
        if (dailyTasks3 != null) {
            for (CLTaskResp.CLTaskData.CLTask cLTask : dailyTasks3) {
                Integer sign = cLTask.getSign();
                if (sign != null && sign.intValue() == 0) {
                    arrayList.add(cLTask);
                } else {
                    arrayList2.add(cLTask);
                }
            }
        }
        LinearLayout linearLayout2 = openResultTaskView.f30855i;
        if (linearLayout2 != null) {
            h.s(linearLayout2, !arrayList.isEmpty());
        }
        LinearLayout linearLayout3 = openResultTaskView.f30852e;
        if (linearLayout3 != null) {
            h.s(linearLayout3, !arrayList2.isEmpty());
        }
        TextView textView = openResultTaskView.f30851d;
        if (textView != null) {
            h.s(textView, arrayList.isEmpty() && !arrayList2.isEmpty());
        }
        taskAllDoneInterface taskalldoneinterface = openResultTaskView.mTaskAllDoneInterface;
        if (taskalldoneinterface != null) {
            taskalldoneinterface.taskAllDone(arrayList.isEmpty() && !arrayList2.isEmpty());
        }
        Context context = openResultTaskView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        openResultTaskView.f30857o = new b(context);
        Context context2 = openResultTaskView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        openResultTaskView.f30858p = new b(context2);
        RecyclerView recyclerView = openResultTaskView.f30853f;
        if (recyclerView != null) {
            recyclerView.setAdapter(openResultTaskView.f30857o);
        }
        RecyclerView recyclerView2 = openResultTaskView.f30850c;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(openResultTaskView.f30858p);
        }
        RecyclerView recyclerView3 = openResultTaskView.f30853f;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(openResultTaskView.getContext(), 1, false));
        }
        RecyclerView recyclerView4 = openResultTaskView.f30850c;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(new LinearLayoutManager(openResultTaskView.getContext(), 1, false));
        }
        b bVar = openResultTaskView.f30857o;
        if (bVar != null) {
            bVar.a(arrayList);
        }
        b bVar2 = openResultTaskView.f30858p;
        if (bVar2 != null) {
            bVar2.a(arrayList2);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, f.cs_view_fail_task, this);
        C1548f c1548f = new C1548f(context.getColor(p.transparent), getResources().getDimensionPixelOffset(q.dp12), 0, 0);
        c1548f.f31336e = false;
        this.f30850c = (RecyclerView) findViewById(e.completed_task_rv);
        this.f30851d = (TextView) findViewById(e.completed_task_tv);
        this.f30852e = (LinearLayout) findViewById(e.completed_task_view);
        this.f30853f = (RecyclerView) findViewById(e.do_task_rv);
        this.f30854g = (TextView) findViewById(e.do_task_tips_desc);
        this.f30855i = (LinearLayout) findViewById(e.do_task_view);
        this.f30856j = (LinearLayout) findViewById(e.all_task_view);
        RecyclerView recyclerView = this.f30853f;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(c1548f);
        }
        RecyclerView recyclerView2 = this.f30850c;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(c1548f);
        }
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    @Nullable
    public final taskAllDoneInterface getMTaskAllDoneInterface() {
        return this.mTaskAllDoneInterface;
    }

    public final void getTaskData() {
        TextView textView = this.f30854g;
        int i7 = this.t;
        if (textView != null) {
            textView.setText(i7 == 3 ? getContext().getString(g.cs_fail_task_tips_desc_flexi) : getContext().getString(g.cs_fail_task_tips_desc_cash));
        }
        TextView textView2 = this.f30851d;
        if (textView2 != null) {
            textView2.setText(i7 == 3 ? getContext().getString(g.cs_fail_task_completed_desc_flexi) : getContext().getString(g.cs_fail_task_completed_desc_cash));
        }
        if (i7 == 3) {
            String strB = H.b("getFlexiFailTaskData");
            d.d(r0.H1(CLTaskResp.class, strB), G.h(c.f40268a).getFailTaskList(new CLTaskReq(null, null, 3, null)).c(new a0(strB, 0))).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Gb.H(this));
        } else {
            String strB2 = H.b("getCashFailTaskData");
            d.d(r0.H1(CLTaskResp.class, strB2), G.h(c.f40268a).getCashFailTaskList(new CLTaskReq(null, null, 3, null)).c(new a0(strB2, 0))).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new I(this));
        }
    }

    public final void setMTaskAllDoneInterface(@Nullable taskAllDoneInterface taskalldoneinterface) {
        this.mTaskAllDoneInterface = taskalldoneinterface;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OpenResultTaskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OpenResultTaskView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OpenResultTaskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = this.f31417a.obtainStyledAttributes(attributeSet, Ya.h.OpenResultTaskView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.t = typedArrayObtainStyledAttributes.getInt(Ya.h.OpenResultTaskView_o_businessType, this.t);
        typedArrayObtainStyledAttributes.recycle();
    }
}
