package com.transsnet.palmpay.airtime.ui.fragment;

import Ab.y;
import Pd.c;
import Rd.d0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.airtime.bean.req.EditScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRemark;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAmountItemRsp;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpConfigInfoBean;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpTaskBean;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpEditTaskFragment;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.D;
import m9.m;
import m9.n;
import m9.o;
import m9.q;
import m9.r;
import o9.K;
import o9.L;
import o9.P;
import o9.g0;
import p002a.a;
import p140j8.f;
import p141j9.C1794b;
import p155k9.i;
import p155k9.j;
import p171lb.d;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpEditTaskFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "LRd/d0;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTopUpEditTaskFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTopUpEditTaskFragment.kt\ncom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpEditTaskFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n+ 4 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n172#2,9:422\n172#2,9:431\n33#3,3:440\n33#3,3:443\n260#4,10:446\n296#4:456\n260#4,10:461\n296#4:471\n152#4:472\n169#4:473\n1869#5:457\n295#5,2:458\n1870#5:460\n1#6:474\n*S KotlinDebug\n*F\n+ 1 ScheduleTopUpEditTaskFragment.kt\ncom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpEditTaskFragment\n*L\n64#1:422,9\n65#1:431,9\n67#1:440,3\n80#1:443,3\n199#1:446,10\n199#1:456\n319#1:461,10\n319#1:471\n347#1:472\n347#1:473\n302#1:457\n304#1:458,2\n302#1:460\n*E\n"})
public final class ScheduleTopUpEditTaskFragment extends BaseMvvmVBFragment<ScheduleTopUpViewModel, d0> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f26566Y;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ScheduleTopUpAmountItemRsp f26568B;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ScheduleTopUpAmountItemBean f26571L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ScheduleTopUpAmountItemBean f26572M;
    public ScheduleTopUpTaskBean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f26577v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f26575o = 100;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f26576p = 101;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b0 f26578w = a.h(this, G.a(K.class), new q(this, 0), new q(this, 1), new q(this, 2));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b0 f26567A = a.h(this, G.a(L.class), new q(this, 3), new q(this, 4), new q(this, 5));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final r f26569C = new r(this);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final r f26570H = new r(Integer.valueOf(CommonViewExtKt.getDayIndexOfWeek(System.currentTimeMillis())), this);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f26573Q = C2131j.b(new d(13));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f26574X = C2131j.b(new m(this, 0));

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r("mDateMode", "getMDateMode()I", ScheduleTopUpEditTaskFragment.class);
        G.f38952a.getClass();
        f26566Y = new KProperty[]{rVar, new kotlin.jvm.internal.r("mDateIndex", "getMDateIndex()I", ScheduleTopUpEditTaskFragment.class)};
    }

    public static final void u(ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            scheduleTopUpEditTaskFragment.v().setList(null);
        } else {
            scheduleTopUpEditTaskFragment.v().setList(list2);
            scheduleTopUpEditTaskFragment.x((List) ((L) scheduleTopUpEditTaskFragment.f26567A.getValue()).f40123e.d());
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        d0 d0Var;
        ScheduleTopUpViewModel scheduleTopUpViewModel;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26577v = arguments.getString("extra_data_1");
        }
        if (!TextUtils.isEmpty(this.f26577v) && (scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i) != null) {
            String taskId = this.f26577v;
            if (taskId == null) {
                taskId = "";
            }
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            f.s(scheduleTopUpViewModel, new g0(taskId, null), scheduleTopUpViewModel.f26636H, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) this.f27333i;
        l lVar = scheduleTopUpViewModel2 != null ? scheduleTopUpViewModel2.f26636H : null;
        if (lVar != null) {
            lVar.e(this, new p054dd.q(new o(this, this, 0), 13));
        }
        final int i7 = 1;
        ((L) this.f26567A.getValue()).f40123e.e(this, new p054dd.q(new Function1(this) { // from class: m9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTopUpEditTaskFragment f39571b;

            {
                this.f39571b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextView textView;
                ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment = this.f39571b;
                switch (i7) {
                    case 0:
                        ScheduleTopUpConfigInfoBean scheduleTopUpConfigInfoBean = (ScheduleTopUpConfigInfoBean) obj;
                        KProperty[] kPropertyArr = ScheduleTopUpEditTaskFragment.f26566Y;
                        d0 d0Var2 = (d0) scheduleTopUpEditTaskFragment.f27335j;
                        if (d0Var2 != null && (textView = d0Var2.f8254e) != null) {
                            textView.setText(scheduleTopUpConfigInfoBean.getNotes());
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr2 = ScheduleTopUpEditTaskFragment.f26566Y;
                        scheduleTopUpEditTaskFragment.x((List) obj);
                        break;
                }
                return Unit.f38893a;
            }
        }, 14));
        d0 d0Var2 = (d0) this.f27335j;
        if (d0Var2 != null) {
            d0Var2.f8253d.setLayoutManager(new GridLayoutManager(getContext(), 3));
        }
        d0 d0Var3 = (d0) this.f27335j;
        if (d0Var3 != null) {
            d0Var3.f8253d.addItemDecoration(new i());
        }
        d0 d0Var4 = (d0) this.f27335j;
        if (d0Var4 != null) {
            d0Var4.f8253d.setAdapter(v());
        }
        j jVarV = v();
        if (jVarV != null) {
            jVarV.setOnItemClickListener(new C1794b(this, 10));
        }
        d0 d0Var5 = (d0) this.f27335j;
        if (d0Var5 != null) {
            d0Var5.f8257i.setText(CommonViewExtKt.toDayOfWeek(System.currentTimeMillis()));
        }
        d0 d0Var6 = (d0) this.f27335j;
        if (d0Var6 != null) {
            d0Var6.f8257i.setOnClickListener(new n(this, 3));
        }
        d0 d0Var7 = (d0) this.f27335j;
        if (d0Var7 != null) {
            d0Var7.f8260p.setOnClickListener(new n(this, 2));
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel3 = (ScheduleTopUpViewModel) this.f27333i;
        l lVar2 = scheduleTopUpViewModel3 != null ? scheduleTopUpViewModel3.f26635C : null;
        if (lVar2 != null) {
            lVar2.e(this, new p054dd.q(new o(this, this, 1), 13));
        }
        d0 d0Var8 = (d0) this.f27335j;
        if (d0Var8 != null) {
            d0Var8.f8256g.setOnClickListener(new n(this, 4));
        }
        b0 b0Var = this.f26578w;
        ScheduleTopUpConfigInfoBean scheduleTopUpConfigInfoBean = (ScheduleTopUpConfigInfoBean) ((K) b0Var.getValue()).f40121d.d();
        if (scheduleTopUpConfigInfoBean != null && (d0Var = (d0) this.f27335j) != null) {
            d0Var.f8254e.setText(scheduleTopUpConfigInfoBean.getNotes());
        }
        final int i10 = 0;
        ((K) b0Var.getValue()).f40121d.e(this, new p054dd.q(new Function1(this) { // from class: m9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTopUpEditTaskFragment f39571b;

            {
                this.f39571b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextView textView;
                ScheduleTopUpEditTaskFragment scheduleTopUpEditTaskFragment = this.f39571b;
                switch (i10) {
                    case 0:
                        ScheduleTopUpConfigInfoBean scheduleTopUpConfigInfoBean2 = (ScheduleTopUpConfigInfoBean) obj;
                        KProperty[] kPropertyArr = ScheduleTopUpEditTaskFragment.f26566Y;
                        d0 d0Var9 = (d0) scheduleTopUpEditTaskFragment.f27335j;
                        if (d0Var9 != null && (textView = d0Var9.f8254e) != null) {
                            textView.setText(scheduleTopUpConfigInfoBean2.getNotes());
                        }
                        break;
                    default:
                        KProperty[] kPropertyArr2 = ScheduleTopUpEditTaskFragment.f26566Y;
                        scheduleTopUpEditTaskFragment.x((List) obj);
                        break;
                }
                return Unit.f38893a;
            }
        }, 14));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        String operatorCode;
        long price;
        String id2;
        ScheduleTopUpViewModel scheduleTopUpViewModel;
        super.onActivityResult(i7, i10, intent);
        String id3 = "";
        if (i7 == this.f26575o) {
            if (i10 != -1 || (scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i) == null) {
                return;
            }
            String str = this.f26577v;
            id3 = str != null ? str : "";
            Intrinsics.checkNotNullParameter(id3, "id");
            f.s(scheduleTopUpViewModel, new P(id3, null), scheduleTopUpViewModel.f26635C, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            return;
        }
        if (i7 == this.f26576p && i10 == -1) {
            EditScheduleTopUpTaskReq editScheduleTopUpTaskReq = new EditScheduleTopUpTaskReq();
            ScheduleTopUpTaskBean scheduleTopUpTaskBean = this.t;
            if (scheduleTopUpTaskBean != null && (id2 = scheduleTopUpTaskBean.getId()) != null) {
                id3 = id2;
            }
            editScheduleTopUpTaskReq.setId(id3);
            editScheduleTopUpTaskReq.setMemberId(BaseApplication.get().getUser().getMemberId());
            ScheduleTopUpTaskBean scheduleTopUpTaskBean2 = this.t;
            if (TextUtils.isEmpty(scheduleTopUpTaskBean2 != null ? scheduleTopUpTaskBean2.getBillerId() : null)) {
                ScheduleTopUpTaskBean scheduleTopUpTaskBean3 = this.t;
                if (scheduleTopUpTaskBean3 != null) {
                    operatorCode = scheduleTopUpTaskBean3.getOperatorCode();
                } else {
                    operatorCode = null;
                }
            } else {
                ScheduleTopUpTaskBean scheduleTopUpTaskBean4 = this.t;
                if (scheduleTopUpTaskBean4 != null) {
                    operatorCode = scheduleTopUpTaskBean4.getBillerId();
                } else {
                    operatorCode = null;
                }
            }
            editScheduleTopUpTaskReq.setBillerId(operatorCode);
            ScheduleTopUpTaskBean scheduleTopUpTaskBean5 = this.t;
            editScheduleTopUpTaskReq.setBillerName(scheduleTopUpTaskBean5 != null ? scheduleTopUpTaskBean5.getBillerName() : null);
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean = this.f26571L;
            editScheduleTopUpTaskReq.setBillerLogo(scheduleTopUpAmountItemBean != null ? scheduleTopUpAmountItemBean.getBillerLogo() : null);
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean2 = this.f26571L;
            editScheduleTopUpTaskReq.setItemId(scheduleTopUpAmountItemBean2 != null ? scheduleTopUpAmountItemBean2.getItemId() : null);
            KProperty<?>[] kPropertyArr = f26566Y;
            editScheduleTopUpTaskReq.setTimeType(Integer.valueOf(((Number) this.f26569C.getValue(this, kPropertyArr[0])).intValue()));
            editScheduleTopUpTaskReq.setTimeValue(Integer.valueOf(((Number) this.f26570H.getValue(this, kPropertyArr[1])).intValue()));
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean3 = this.f26571L;
            if (scheduleTopUpAmountItemBean3 == null || (price = scheduleTopUpAmountItemBean3.getPrice()) == null) {
                price = 0L;
            }
            editScheduleTopUpTaskReq.setRechargeAmount(price);
            ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) this.f27333i;
            if (scheduleTopUpViewModel2 != null) {
                scheduleTopUpViewModel2.f(editScheduleTopUpTaskReq, new m(this, 1));
            }
            ScheduleTopUpViewModel scheduleTopUpViewModel3 = (ScheduleTopUpViewModel) this.f27333i;
            io.fastkv.n.B(this, scheduleTopUpViewModel3 != null ? scheduleTopUpViewModel3.f26634B : null, this, new y(25), new D(5), false, null, 240);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Pd.d.qt_fragment_airtime_schedule_task_edit, viewGroup, false);
        int i7 = c.gpAmountList;
        Group group = (Group) p059e1.a.m(i7, viewInflate);
        if (group != null) {
            i7 = c.ivOperatorIcon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
            if (appCompatImageView != null) {
                i7 = c.ryAmount;
                RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                if (recyclerView != null) {
                    i7 = c.spaceBottom;
                    if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = c.tvAmountTips;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = c.tvAutoTopUp;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = c.tvConfirm;
                                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    i7 = c.tvDate;
                                    TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView4 != null) {
                                        i7 = c.tvEvery;
                                        TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView5 != null) {
                                            i7 = c.tvPhoneNumber;
                                            TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView6 != null) {
                                                i7 = c.tvTurnOff;
                                                TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView7 != null && (viewM = p059e1.a.m((i7 = c.viewBgAmount), viewInflate)) != null) {
                                                    d0 d0Var = new d0((LinearLayout) viewInflate, group, appCompatImageView, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewM);
                                                    Intrinsics.checkNotNullExpressionValue(d0Var, "inflate(...)");
                                                    return d0Var;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final j v() {
        return (j) this.f26573Q.getValue();
    }

    public final void w(int i7) {
        this.f26569C.setValue(this, f26566Y[0], Integer.valueOf(i7));
    }

    public final void x(List list) {
        Iterator<T> it = v().getData().iterator();
        while (it.hasNext()) {
            ScheduleTopUpAmountItemBean scheduleTopUpAmountItemBean = (ScheduleTopUpAmountItemBean) it.next();
            ScheduleTopUpAmountItemRemark scheduleTopUpAmountItemRemark = null;
            Object obj = null;
            if (list != null) {
                for (Object obj2 : list) {
                    ScheduleTopUpAmountItemRemark scheduleTopUpAmountItemRemark2 = (ScheduleTopUpAmountItemRemark) obj2;
                    if (Intrinsics.c(scheduleTopUpAmountItemRemark2.getBillerId(), scheduleTopUpAmountItemBean.getBillerId()) && Intrinsics.c(scheduleTopUpAmountItemRemark2.getItemId(), scheduleTopUpAmountItemBean.getItemId())) {
                        obj = obj2;
                        break;
                    }
                }
                scheduleTopUpAmountItemRemark = (ScheduleTopUpAmountItemRemark) obj;
            }
            if (scheduleTopUpAmountItemRemark != null) {
                scheduleTopUpAmountItemBean.setRewardsRateText(scheduleTopUpAmountItemRemark.getRewardsRateText());
            } else {
                scheduleTopUpAmountItemBean.setRewardsRateText("");
            }
        }
        v().notifyDataSetChanged();
    }
}
