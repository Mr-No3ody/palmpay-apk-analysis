package Me;

import Bc.C0106c;
import Gb.T;
import Pa.i0;
import Pa.n0;
import Pe.d0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import com.transsnet.palmpay.main.export.bean.req.PalmZoneTasksReq;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneTasksRspV2;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneTaskListDialog;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends AbstractC0456a implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final x f5933L = new x(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AnimatorSet f5934A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f5935B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5936C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f5937H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f5938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PalmZoneViewModel f5939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f5941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f5942g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f5943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p370ye.c f5944j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PalmZoneTasksRspV2 f5945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5946p;
    public PalmZoneTaskListDialog t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bc.i f5947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u f5948w;

    public A(LinearLayout linearLayout, PalmZoneViewModel palmZoneViewModel, boolean z3) {
        super(0);
        this.f5938c = linearLayout;
        this.f5939d = palmZoneViewModel;
        this.f5940e = z3;
        this.f5941f = C2131j.b(new M3.f(this, 2));
        this.f5946p = true;
        this.f5935B = C2131j.b(new La.i(8));
        this.f5937H = C2131j.b(new La.i(9));
        AppCompatImageView appCompatImageViewE = e(linearLayout, Ac.d.main_rewards_task_skeleton_bg);
        this.f5949a = appCompatImageViewE;
        if (appCompatImageViewE == null) {
            o();
        }
    }

    public final List l() {
        return (List) this.f5937H.getValue();
    }

    public final y m() {
        return (y) this.f5941f.getValue();
    }

    public final Handler n() {
        return (Handler) this.f5935B.getValue();
    }

    public final void o() {
        View viewM;
        View viewM2;
        View viewM3;
        View viewM4;
        View viewM5;
        View viewG = AbstractC0456a.g(this, this.f5938c, Ac.f.main_layout_palmzone_tasks, 8);
        this.f5942g = viewG;
        if (viewG != null) {
            p220oa.h.s(viewG, this.f5946p);
            int i7 = Ac.e.bottomBarrier;
            if (((Barrier) p059e1.a.m(i7, viewG)) != null) {
                i7 = Ac.e.ivFinger;
                ImageView imageView = (ImageView) p059e1.a.m(i7, viewG);
                if (imageView != null && (viewM = p059e1.a.m((i7 = Ac.e.layoutProgress), viewG)) != null) {
                    int i10 = Ac.e.arrow1;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i10, viewM);
                    if (appCompatImageView != null) {
                        i10 = Ac.e.arrow2;
                        ImageView imageView2 = (ImageView) p059e1.a.m(i10, viewM);
                        if (imageView2 != null) {
                            i10 = Ac.e.arrow3;
                            ImageView imageView3 = (ImageView) p059e1.a.m(i10, viewM);
                            if (imageView3 != null) {
                                i10 = Ac.e.bottomBarrier;
                                if (((Barrier) p059e1.a.m(i10, viewM)) != null) {
                                    i10 = Ac.e.flHintBar;
                                    FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i10, viewM);
                                    if (frameLayout != null) {
                                        i10 = Ac.e.ivHintAnchor;
                                        ImageView imageView4 = (ImageView) p059e1.a.m(i10, viewM);
                                        if (imageView4 != null && (viewM2 = p059e1.a.m((i10 = Ac.e.reward1), viewM)) != null && (viewM3 = p059e1.a.m((i10 = Ac.e.reward2), viewM)) != null && (viewM4 = p059e1.a.m((i10 = Ac.e.reward3), viewM)) != null && (viewM5 = p059e1.a.m((i10 = Ac.e.reward4), viewM)) != null) {
                                            i10 = Ac.e.tvHint;
                                            TextView textView = (TextView) p059e1.a.m(i10, viewM);
                                            if (textView != null) {
                                                C0106c c0106c = new C0106c((ConstraintLayout) viewM, appCompatImageView, imageView2, imageView3, frameLayout, imageView4, viewM2, viewM3, viewM4, viewM5, textView);
                                                i7 = Ac.e.taskList;
                                                RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewG);
                                                if (recyclerView != null) {
                                                    i7 = Ac.e.tvExpireTime;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) p059e1.a.m(i7, viewG);
                                                    if (appCompatTextView != null) {
                                                        i7 = Ac.e.tvMore;
                                                        IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewG);
                                                        if (iconicsTextView != null) {
                                                            i7 = Ac.e.tvTitle;
                                                            TextView textView2 = (TextView) p059e1.a.m(i7, viewG);
                                                            if (textView2 != null) {
                                                                this.f5947v = new Bc.i((ConstraintLayout) viewG, imageView, c0106c, recyclerView, appCompatTextView, iconicsTextView, textView2);
                                                                this.f5943i = viewG.getContext();
                                                                this.f5944j = new p370ye.c();
                                                                Bc.i iVar = this.f5947v;
                                                                if (iVar != null) {
                                                                    ((IconicsTextView) iVar.f730i).setOnClickListener(new T(14, viewG, this));
                                                                }
                                                                Bc.i iVar2 = this.f5947v;
                                                                if (iVar2 != null) {
                                                                    ((RecyclerView) iVar2.f725c).setLayoutManager(new LinearLayoutManager(viewG.getContext(), 1, false));
                                                                }
                                                                Bc.i iVar3 = this.f5947v;
                                                                if (iVar3 != null) {
                                                                    RecyclerView recyclerView2 = (RecyclerView) iVar3.f725c;
                                                                    C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(L6.b.ppColorDividerLine, viewG.getContext()), SizeUtils.dp2px(1.0f), CommonViewExtKt.getDp(12.0f), CommonViewExtKt.getDp(12.0f));
                                                                    c1548f.f31336e = false;
                                                                    recyclerView2.addItemDecoration(c1548f);
                                                                }
                                                                Bc.i iVar4 = this.f5947v;
                                                                if (iVar4 != null) {
                                                                    ((RecyclerView) iVar4.f725c).setAdapter(this.f5944j);
                                                                }
                                                                p370ye.c cVar = this.f5944j;
                                                                if (cVar != null) {
                                                                    cVar.setOnItemClickListener(new w(this));
                                                                }
                                                                p370ye.c cVar2 = this.f5944j;
                                                                if (cVar2 != null) {
                                                                    cVar2.addChildClickViewIds(Ac.e.btnRight);
                                                                }
                                                                p370ye.c cVar3 = this.f5944j;
                                                                if (cVar3 != null) {
                                                                    cVar3.setOnItemChildClickListener(new w(this));
                                                                }
                                                                if (this.f5940e) {
                                                                    t();
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
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM.getResources().getResourceName(i10)));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewG.getResources().getResourceName(i7)));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        View view = this.f5942g;
        if (!i0.X(view != null ? view.getContext() : null)) {
            u();
            return;
        }
        AnimatorSet animatorSet = this.f5934A;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p(PalmZoneTaskBean palmZoneTaskBean) {
        PalmZoneTaskListDialog palmZoneTaskListDialog;
        n0.g().m(A.class.getSimpleName().concat("_element_click"), palmZoneTaskBean != null ? palmZoneTaskBean.taskName : null, "");
        if (Intrinsics.c(palmZoneTaskBean != null ? palmZoneTaskBean.buttonType : null, PalmZoneTaskBean.BTN_TYPE_CLAIM)) {
            n0.g().l("new_reward_task_reward_click");
            PalmZoneViewModel palmZoneViewModel = this.f5939d;
            if (palmZoneViewModel != null) {
                String str = palmZoneTaskBean != null ? palmZoneTaskBean.memberTaskNo : null;
                PalmZoneTasksRspV2 palmZoneTasksRspV2 = this.f5945o;
                palmZoneViewModel.e(palmZoneTasksRspV2 != null ? Long.valueOf(palmZoneTasksRspV2.rewardSpecialMemberCycleId) : null, str);
                return;
            }
            return;
        }
        if (Intrinsics.c(palmZoneTaskBean != null ? palmZoneTaskBean.buttonType : null, PalmZoneTaskBean.BTN_TYPE_GO)) {
            n0.g().l("new_reward_task_click");
            if (palmZoneTaskBean != null) {
                palmZoneTaskBean.itemClick(this.f5943i);
            }
            PalmZoneTaskListDialog palmZoneTaskListDialog2 = this.t;
            if (palmZoneTaskListDialog2 == null || !palmZoneTaskListDialog2.isShowing() || (palmZoneTaskListDialog = this.t) == null) {
                return;
            }
            palmZoneTaskListDialog.dismiss();
        }
    }

    public final void q() {
        F6.d.h("PalmZoneTasksHandler", 3, "release: ");
        u();
        m().f6019a = null;
        n().removeCallbacks(m());
    }

    public final void r(boolean z3) {
        View view = this.f5942g;
        if (view != null) {
            p220oa.h.s(view, z3 && this.f5946p);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    public final void s(boolean z3) {
        View childAt;
        View viewFindViewById;
        List<Object> data;
        List<Object> data2;
        Bc.i iVar;
        Bc.i iVar2;
        AnimatorSet.Builder builderWith;
        AnimatorSet.Builder builderWith2;
        C0106c c0106c;
        C0106c c0106c2;
        final int i7 = 0;
        final int i10 = 1;
        Bc.i iVar3 = this.f5947v;
        if (iVar3 != null) {
            ((ConstraintLayout) iVar3.f724b).removeCallbacks(null);
        }
        PalmZoneTasksRspV2 palmZoneTasksRspV2 = this.f5945o;
        if (palmZoneTasksRspV2 != null) {
            int i11 = palmZoneTasksRspV2.finishTaskNum;
            u uVar = this.f5948w;
            if (((uVar == null || (c0106c2 = uVar.f6009a) == null || ((ConstraintLayout) c0106c2.f675i).getVisibility() != 0) ? null : uVar.f6011c) != null) {
                u uVar2 = this.f5948w;
                if (uVar2 == null || (c0106c = uVar2.f6009a) == null || ((ConstraintLayout) c0106c.f675i).getVisibility() != 0) {
                    viewFindViewById = null;
                } else {
                    viewFindViewById = uVar2.f6011c;
                }
            } else {
                if (i11 > 0) {
                    childAt = null;
                } else {
                    p370ye.c cVar = this.f5944j;
                    int size = (cVar == null || (data2 = cVar.getData()) == null) ? 0 : data2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            p370ye.c cVar2 = this.f5944j;
                            PalmZoneTaskBean palmZoneTaskBean = (cVar2 == null || (data = cVar2.getData()) == null) ? null : (PalmZoneTaskBean) data.get(i12);
                            if (!Intrinsics.c(palmZoneTaskBean != null ? palmZoneTaskBean.buttonType : null, PalmZoneTaskBean.BTN_TYPE_GO)) {
                                if (!Intrinsics.c(palmZoneTaskBean != null ? palmZoneTaskBean.buttonType : null, PalmZoneTaskBean.BTN_TYPE_CLAIM)) {
                                    i12++;
                                }
                            }
                            Bc.i iVar4 = this.f5947v;
                            if (iVar4 != null) {
                                childAt = ((RecyclerView) iVar4.f725c).getChildAt(i12);
                            }
                        }
                        childAt = null;
                    }
                }
                if (childAt != null) {
                    viewFindViewById = childAt.findViewById(Ac.e.btnRight);
                } else {
                    viewFindViewById = null;
                }
            }
            u();
            Bc.i iVar5 = this.f5947v;
            ImageView imageView = iVar5 != null ? (ImageView) iVar5.f727e : null;
            if (imageView != null) {
                p220oa.h.s(imageView, false);
            }
            if (viewFindViewById != null) {
                Bc.i iVar6 = this.f5947v;
                ConstraintLayout constraintLayout = iVar6 != null ? (ConstraintLayout) iVar6.f724b : null;
                ImageView imageView2 = iVar6 != null ? (ImageView) iVar6.f727e : null;
                if (constraintLayout != null) {
                    int[] iArr = new int[2];
                    viewFindViewById.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    constraintLayout.getLocationInWindow(iArr2);
                    if ((iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) && viewFindViewById.getWidth() != 0 && viewFindViewById.getHeight() != 0 && viewFindViewById.getVisibility() == 0) {
                        if (imageView2 != null) {
                            p220oa.h.j(imageView2, Integer.valueOf((viewFindViewById.getHeight() / 3) + (iArr[1] - iArr2[1])), Integer.valueOf((viewFindViewById.getWidth() / 3) + (iArr[0] - iArr2[0])), 0, 0);
                        }
                        if (imageView2 != null) {
                            p220oa.h.s(imageView2, true);
                        }
                        Bc.i iVar7 = this.f5947v;
                        ImageView imageView3 = iVar7 != null ? (ImageView) iVar7.f727e : null;
                        if (this.f5934A == null) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.9f, 0.8f, 1.0f);
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.9f, 0.8f, 1.0f);
                            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView3, "pivotX", 0.0f);
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView3, "pivotY", 0.0f);
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.f5934A = animatorSet;
                            AnimatorSet.Builder builderPlay = animatorSet.play(objectAnimatorOfFloat2);
                            if (builderPlay != null && (builderWith = builderPlay.with(objectAnimatorOfFloat)) != null && (builderWith2 = builderWith.with(objectAnimatorOfFloat3)) != null) {
                                builderWith2.with(objectAnimatorOfFloat4);
                            }
                            AnimatorSet animatorSet2 = this.f5934A;
                            if (animatorSet2 != null) {
                                animatorSet2.setDuration(500L);
                            }
                            AnimatorSet animatorSet3 = this.f5934A;
                            if (animatorSet3 != null) {
                                animatorSet3.setInterpolator(new AccelerateDecelerateInterpolator());
                            }
                            AnimatorSet animatorSet4 = this.f5934A;
                            if (animatorSet4 != null) {
                                animatorSet4.addListener(this);
                            }
                            AnimatorSet animatorSet5 = this.f5934A;
                            if (animatorSet5 != null) {
                                animatorSet5.setStartDelay(1000L);
                            }
                        }
                        if (imageView3 != null) {
                            p220oa.h.s(imageView3, true);
                        }
                        AnimatorSet animatorSet6 = this.f5934A;
                        if (animatorSet6 != null) {
                            animatorSet6.start();
                        }
                    } else if (z3 && (iVar2 = this.f5947v) != null) {
                        ((ConstraintLayout) iVar2.f724b).postDelayed(new Runnable(this) { // from class: Me.v

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ A f6017b;

                            {
                                this.f6017b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i7) {
                                    case 0:
                                        this.f6017b.s(false);
                                        break;
                                    default:
                                        this.f6017b.s(false);
                                        break;
                                }
                            }
                        }, 2000L);
                    }
                } else if (z3) {
                    ((ConstraintLayout) iVar2.f724b).postDelayed(new Runnable(this) { // from class: Me.v

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ A f6017b;

                        {
                            this.f6017b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    this.f6017b.s(false);
                                    break;
                                default:
                                    this.f6017b.s(false);
                                    break;
                            }
                        }
                    }, 2000L);
                }
            }
            if (viewFindViewById == null && z3 && (iVar = this.f5947v) != null) {
                ((ConstraintLayout) iVar.f724b).postDelayed(new Runnable(this) { // from class: Me.v

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ A f6017b;

                    {
                        this.f6017b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f6017b.s(false);
                                break;
                            default:
                                this.f6017b.s(false);
                                break;
                        }
                    }
                }, BaseApplication.get().isOldAndroidDevice() ? 2000L : 1000L);
            }
        }
    }

    public final void t() {
        Context context;
        if (this.t == null && (context = this.f5943i) != null) {
            PalmZoneTaskListDialog palmZoneTaskListDialog = new PalmZoneTaskListDialog(context);
            this.t = palmZoneTaskListDialog;
            palmZoneTaskListDialog.setCallback(new z(this));
        }
        if (!l().isEmpty()) {
            PalmZoneTaskListDialog palmZoneTaskListDialog2 = this.t;
            if (palmZoneTaskListDialog2 != null) {
                palmZoneTaskListDialog2.show();
            }
            PalmZoneTaskListDialog palmZoneTaskListDialog3 = this.t;
            if (palmZoneTaskListDialog3 != null) {
                palmZoneTaskListDialog3.fillDatas(l());
            }
        }
        PalmZoneViewModel palmZoneViewModel = this.f5939d;
        if (palmZoneViewModel != null) {
            PalmZoneTasksReq req = new PalmZoneTasksReq();
            req.setPageNum(1);
            req.setPageSize(100);
            boolean zIsEmpty = l().isEmpty();
            Intrinsics.checkNotNullParameter(req, "req");
            d0 d0Var = new d0(req, null);
            Boolean boolValueOf = Boolean.valueOf(zIsEmpty);
            com.transsnet.palmpay.core.base.l lVar = palmZoneViewModel.f35390f;
            lVar.f27356m = boolValueOf;
            Unit unit = Unit.f38893a;
            p140j8.f.v(palmZoneViewModel, d0Var, lVar, 0L);
        }
    }

    public final void u() {
        AnimatorSet animatorSet = this.f5934A;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f5934A;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f5934A = null;
    }
}
