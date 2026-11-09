package Ce;

import B6.RunnableC0085g;
import B6.ViewOnClickListenerC0087i;
import Bc.C0106c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.text.ImageTextView;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import com.transsnet.palmpay.main.export.bean.rsp.ClaimablePointDetails;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponRewardsItems;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponRewardsRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsTabInfo;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneReferEarnHomeResp;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneTasksRspV2;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.ui.view.HomeScrollView;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomePalmZoneTabV2 f1446b;

    public /* synthetic */ Q(HomePalmZoneTabV2 homePalmZoneTabV2, HomePalmZoneTabV2 homePalmZoneTabV3, int i7) {
        this.f1445a = i7;
        this.f1446b = homePalmZoneTabV3;
    }

    /* JADX WARN: Code duplicated, block: B:243:0x0368  */
    /* JADX WARN: Code duplicated, block: B:362:0x056f  */
    /* JADX WARN: Code duplicated, block: B:466:0x0733  */
    /* JADX WARN: Code duplicated, block: B:535:0x082e A[PHI: r0 r1
      0x082e: PHI (r0v9 boolean) = (r0v6 boolean), (r0v8 boolean), (r0v12 boolean) binds: [B:554:0x0872, B:544:0x084e, B:534:0x082c] A[DONT_GENERATE, DONT_INLINE]
      0x082e: PHI (r1v5 com.transsnet.palmpay.common.export.view.NetworkNotConnectView) = 
      (r1v2 com.transsnet.palmpay.common.export.view.NetworkNotConnectView)
      (r1v4 com.transsnet.palmpay.common.export.view.NetworkNotConnectView)
      (r1v9 com.transsnet.palmpay.common.export.view.NetworkNotConnectView)
     binds: [B:554:0x0872, B:544:0x084e, B:534:0x082c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zIsNetworkOffline;
        NetworkNotConnectView networkNotConnectView;
        List<PalmZoneTaskBean> list;
        C0106c c0106c;
        boolean z3;
        int iG;
        CharSequence charSequence;
        int i7;
        Iterator it;
        int i10;
        C0106c c0106c2;
        String str;
        AppCompatTextView textView;
        List<ClaimablePointDetails.ClaimablePointItem> list2;
        List<HomeCouponRewardsItems> list3;
        HomePalmZoneTabV2 homePalmZoneTabV2 = this.f1446b;
        boolean z8 = true;
        switch (this.f1445a) {
            case 0:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            PalmZoneTasksRspV2 palmZoneTasksRspV2 = (PalmZoneTasksRspV2) commonBeanResult.data;
                            if (palmZoneTasksRspV2 != null) {
                                int i11 = HomePalmZoneTabV2.f35134Z;
                                List<PalmZoneTaskBean> list4 = palmZoneTasksRspV2.taskRespList;
                                if (list4 != null && (!list4.isEmpty())) {
                                    homePalmZoneTabV2.v(true, false);
                                }
                            }
                            Me.A a3 = homePalmZoneTabV2.f35147v;
                            if (a3 != null) {
                                a3.f5945o = palmZoneTasksRspV2;
                                if (palmZoneTasksRspV2 == null || (list = palmZoneTasksRspV2.taskRespList) == null || list.isEmpty()) {
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) a3.f5949a;
                                    if (appCompatImageView != null) {
                                        p220oa.h.s(appCompatImageView, false);
                                    }
                                    a3.r(false);
                                } else {
                                    if (a3.f5942g == null) {
                                        a3.o();
                                    }
                                    a3.r(true);
                                    Bc.i iVar = a3.f5947v;
                                    if (iVar != null) {
                                        ((TextView) iVar.f728f).setText(palmZoneTasksRspV2.taskActivityTitle);
                                    }
                                    Bc.i iVar2 = a3.f5947v;
                                    if (iVar2 != null) {
                                        ((AppCompatTextView) iVar2.f729g).setTag(Long.valueOf(palmZoneTasksRspV2.expireTime));
                                    }
                                    Bc.i iVar3 = a3.f5947v;
                                    Me.x xVar = Me.A.f5933L;
                                    if (iVar3 != null) {
                                        ((AppCompatTextView) iVar3.f729g).setText(xVar.getExpireTime(palmZoneTasksRspV2.expireTime));
                                    }
                                    a3.n().removeCallbacks(a3.m());
                                    long refreshTime = xVar.getRefreshTime(palmZoneTasksRspV2.expireTime);
                                    if (refreshTime > 0) {
                                        a3.n().postDelayed(a3.m(), refreshTime);
                                    }
                                    p370ye.c cVar = a3.f5944j;
                                    if (cVar != null) {
                                        cVar.setList(palmZoneTasksRspV2.taskRespList);
                                    }
                                    if (a3.f5948w == null) {
                                        Bc.i iVar4 = a3.f5947v;
                                        a3.f5948w = new Me.u(iVar4 != null ? (C0106c) iVar4.f726d : null, a3.f5939d);
                                    }
                                    ViewEvent viewEvent = new ViewEvent("new_reward_task_show");
                                    List<PalmZoneTasksRspV2.RewardsBean> list5 = palmZoneTasksRspV2.progressBarRewardDTOList;
                                    if ((list5 != null ? list5.size() : 0) >= 2) {
                                        Pa.n0.g().u(viewEvent.add("is_progress", "yes"));
                                        Me.u uVar = a3.f5948w;
                                        if (uVar != null && (c0106c2 = uVar.f6009a) != null) {
                                            p220oa.h.s((ConstraintLayout) c0106c2.f675i, true);
                                        }
                                        Me.u uVar2 = a3.f5948w;
                                        if (uVar2 != null) {
                                            C0106c c0106c3 = uVar2.f6009a;
                                            if (c0106c3 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) c0106c3.f675i;
                                                constraintLayout.setBackgroundTintList(Pa.i0.V(constraintLayout) ? ColorStateList.valueOf(Color.parseColor("#121212")) : ColorStateList.valueOf(Color.parseColor("#E9EBFD")));
                                            }
                                            List<PalmZoneTasksRspV2.RewardsBean> list6 = palmZoneTasksRspV2.progressBarRewardDTOList;
                                            int size = list6 != null ? list6.size() : 0;
                                            if (size < 2) {
                                                C0106c c0106c4 = uVar2.f6009a;
                                                if (c0106c4 != null) {
                                                    p220oa.h.s((ConstraintLayout) c0106c4.f675i, false);
                                                }
                                            } else {
                                                C0106c c0106c5 = uVar2.f6009a;
                                                if (c0106c5 != null) {
                                                    p220oa.h.s((ConstraintLayout) c0106c5.f675i, true);
                                                }
                                                Intrinsics.e(list6);
                                                uVar2.f6011c = null;
                                                p355xf.t tVar = uVar2.f6014f;
                                                Iterator it3 = ((List) tVar.getValue()).iterator();
                                                int i12 = 0;
                                                while (true) {
                                                    boolean zHasNext = it3.hasNext();
                                                    Context context = uVar2.f6012d;
                                                    if (zHasNext) {
                                                        Object next = it3.next();
                                                        int i13 = i12 + 1;
                                                        if (i12 < 0) {
                                                            C1850q.k();
                                                            throw null;
                                                        }
                                                        Me.t tVar2 = (Me.t) next;
                                                        boolean z10 = z8;
                                                        if (i12 >= size) {
                                                            z8 = false;
                                                        }
                                                        View view = tVar2.f6005a;
                                                        if (view != null) {
                                                            p220oa.h.s(view, z8);
                                                        }
                                                        if (z8) {
                                                            PalmZoneTasksRspV2.RewardsBean rewardsBean = list6.get(i12);
                                                            boolean z11 = palmZoneTasksRspV2.finishTaskNum >= rewardsBean.taskNum ? z10 : false;
                                                            boolean z12 = rewardsBean.finish;
                                                            if (context == null) {
                                                                i7 = size;
                                                                it = it3;
                                                            } else {
                                                                TextView textView2 = tVar2.f6008d;
                                                                i7 = size;
                                                                it = it3;
                                                                if (textView2 != null) {
                                                                    textView2.setText(Pa.r0.F(rewardsBean.displayAmount));
                                                                }
                                                                ImageView imageView = tVar2.f6006b;
                                                                if (imageView != null) {
                                                                    boolean zV = Pa.i0.V(imageView);
                                                                    if (z12 || z11) {
                                                                        Pa.r0.h1(imageView, zV ? rewardsBean.completedIconDark : rewardsBean.completedIcon, com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_small);
                                                                    } else {
                                                                        Pa.r0.h1(imageView, zV ? rewardsBean.incompleteIconDark : rewardsBean.incompleteIcon, com.transsnet.palmpay.custom_view.r.cv_palmpay_logo_f0ecfc);
                                                                    }
                                                                }
                                                                ImageView imageView2 = tVar2.f6007c;
                                                                if (imageView2 != null) {
                                                                    p220oa.h.s(imageView2, z12);
                                                                }
                                                                View view2 = tVar2.f6005a;
                                                                if (z12 || z11) {
                                                                    if (view2 != null) {
                                                                        view2.setBackgroundResource(Ac.d.main_shape_reward_progress_node_active);
                                                                    }
                                                                    if (textView2 != null) {
                                                                        textView2.setTextColor(context.getColor(Ac.b.main_color_reward_progress_active));
                                                                    }
                                                                } else {
                                                                    if (view2 != null) {
                                                                        view2.setBackgroundResource(Ac.d.main_shape_reward_progress_node_inactive);
                                                                    }
                                                                    if (textView2 != null) {
                                                                        textView2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, context));
                                                                    }
                                                                }
                                                                if (view2 != null) {
                                                                    view2.setOnClickListener(null);
                                                                }
                                                                if (z11 && !z12 && uVar2.f6011c == null) {
                                                                    if (view2 != null) {
                                                                        i10 = 14;
                                                                        view2.setOnClickListener(new ViewOnClickListenerC0087i(uVar2, i10, rewardsBean, palmZoneTasksRspV2));
                                                                    } else {
                                                                        i10 = 14;
                                                                    }
                                                                    uVar2.f6011c = imageView;
                                                                }
                                                            }
                                                            i10 = 14;
                                                        } else {
                                                            i7 = size;
                                                            it = it3;
                                                            i10 = 14;
                                                        }
                                                        size = i7;
                                                        i12 = i13;
                                                        z8 = z10;
                                                        it3 = it;
                                                    } else {
                                                        boolean z13 = z8;
                                                        int i14 = size;
                                                        int i15 = 0;
                                                        for (Object obj2 : (List) uVar2.f6015g.getValue()) {
                                                            int i16 = i15 + 1;
                                                            if (i15 < 0) {
                                                                C1850q.k();
                                                                throw null;
                                                            }
                                                            ImageView imageView3 = (ImageView) obj2;
                                                            boolean z14 = i15 < i14 + (-1) ? z13 : false;
                                                            if (imageView3 != null) {
                                                                p220oa.h.s(imageView3, z14);
                                                            }
                                                            if (z14 && imageView3 != null) {
                                                                imageView3.setImageResource(Ac.d.main_ic_reward_progress_arrow_inactive);
                                                            }
                                                            i15 = i16;
                                                        }
                                                        String input = palmZoneTasksRspV2.progressBarTips;
                                                        if (input == null || StringsKt.F(input)) {
                                                            if (c0106c3 != null) {
                                                                p220oa.h.s((FrameLayout) c0106c3.f673f, false);
                                                            }
                                                            if (c0106c3 != null) {
                                                                p220oa.h.s((ImageView) c0106c3.f674g, false);
                                                            }
                                                        } else {
                                                            if (c0106c3 != null) {
                                                                p220oa.h.s((FrameLayout) c0106c3.f673f, z13);
                                                            }
                                                            if (c0106c3 != null) {
                                                                TextView textView3 = c0106c3.f669b;
                                                                if (input.length() == 0) {
                                                                    charSequence = input;
                                                                    charSequence = "";
                                                                } else if (context != null) {
                                                                    SpannableString spannableString = new SpannableString(input);
                                                                    int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorPrimary, context);
                                                                    Regex regex = new Regex("\\d+");
                                                                    Intrinsics.checkNotNullParameter(input, "input");
                                                                    if (input.length() < 0) {
                                                                        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + input.length());
                                                                    }
                                                                    Hb.L seedFunction = new Hb.L(21, regex, input);
                                                                    kotlin.text.p nextFunction = kotlin.text.p.f39035a;
                                                                    Intrinsics.checkNotNullParameter(seedFunction, "seedFunction");
                                                                    Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
                                                                    Sf.h hVar = new Sf.h(new Sf.e(seedFunction, nextFunction));
                                                                    while (hVar.hasNext()) {
                                                                        MatchResult matchResult = (MatchResult) hVar.next();
                                                                        spannableString.setSpan(new ForegroundColorSpan(iColorInt), matchResult.getRange().f38977a, matchResult.getRange().f38978b + 1, 33);
                                                                    }
                                                                    charSequence = spannableString;
                                                                }
                                                                textView3.setText(charSequence);
                                                            }
                                                            Iterator<PalmZoneTasksRspV2.RewardsBean> it4 = list6.iterator();
                                                            int i17 = 0;
                                                            while (true) {
                                                                if (!it4.hasNext()) {
                                                                    i17 = -1;
                                                                } else if (it4.next().finish) {
                                                                    i17++;
                                                                }
                                                            }
                                                            if (i17 < 0) {
                                                                i17 = -1;
                                                            } else {
                                                                int i18 = palmZoneTasksRspV2.finishTaskNum;
                                                                PalmZoneTasksRspV2.RewardsBean rewardsBean2 = (PalmZoneTasksRspV2.RewardsBean) CollectionsKt.G(i17, list6);
                                                                if (rewardsBean2 == null || rewardsBean2.finish || i18 < rewardsBean2.taskNum) {
                                                                    i17 = -1;
                                                                }
                                                            }
                                                            Integer numValueOf = Integer.valueOf(i17);
                                                            if (i17 < 0) {
                                                                numValueOf = null;
                                                            }
                                                            if (numValueOf != null) {
                                                                iG = numValueOf.intValue();
                                                            } else {
                                                                Iterator<PalmZoneTasksRspV2.RewardsBean> it5 = list6.iterator();
                                                                int i19 = 0;
                                                                while (true) {
                                                                    if (!it5.hasNext()) {
                                                                        i19 = -1;
                                                                    } else if (it5.next().finish) {
                                                                        i19++;
                                                                    }
                                                                }
                                                                if (i19 >= 0) {
                                                                    iG = i19;
                                                                } else {
                                                                    iG = C1850q.g(list6);
                                                                    if (iG < 0) {
                                                                        iG = 0;
                                                                    }
                                                                }
                                                            }
                                                            Me.t tVar3 = (Me.t) CollectionsKt.G(iG, (List) tVar.getValue());
                                                            View view3 = tVar3 != null ? tVar3.f6005a : null;
                                                            FrameLayout frameLayout = c0106c3 != null ? (FrameLayout) c0106c3.f673f : null;
                                                            ImageView imageView4 = c0106c3 != null ? (ImageView) c0106c3.f674g : null;
                                                            if (view3 != null && frameLayout != null && imageView4 != null) {
                                                                p220oa.h.s(imageView4, true);
                                                                frameLayout.post(new Da.h(view3, 5, frameLayout, imageView4));
                                                            } else if (imageView4 != null) {
                                                                p220oa.h.s(imageView4, false);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            z3 = true;
                                        }
                                        a3.s(z3);
                                    } else {
                                        Pa.n0.g().u(viewEvent.add("is_progress", "no"));
                                        Me.u uVar3 = a3.f5948w;
                                        if (uVar3 != null && (c0106c = uVar3.f6009a) != null) {
                                            p220oa.h.s((ConstraintLayout) c0106c.f675i, false);
                                        }
                                    }
                                    z3 = true;
                                    a3.s(z3);
                                }
                            }
                        } else {
                            ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
                        }
                        zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
                        boolean z15 = !zIsNetworkOffline;
                        View view4 = homePalmZoneTabV2.f35138H;
                        if (view4 != null) {
                            p220oa.h.s(view4, z15);
                        }
                        if (zIsNetworkOffline) {
                            homePalmZoneTabV2.w();
                        }
                        networkNotConnectView = homePalmZoneTabV2.f35137C;
                        if (networkNotConnectView != null) {
                            p220oa.h.s(networkNotConnectView, zIsNetworkOffline);
                        }
                    } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                        zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
                        boolean z16 = !zIsNetworkOffline;
                        View view5 = homePalmZoneTabV2.f35138H;
                        if (view5 != null) {
                            p220oa.h.s(view5, z16);
                        }
                        if (zIsNetworkOffline) {
                            homePalmZoneTabV2.w();
                        }
                        networkNotConnectView = homePalmZoneTabV2.f35137C;
                        if (networkNotConnectView != null) {
                            p220oa.h.s(networkNotConnectView, zIsNetworkOffline);
                        }
                    } else {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                        zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
                        boolean z17 = !zIsNetworkOffline;
                        View view6 = homePalmZoneTabV2.f35138H;
                        if (view6 != null) {
                            p220oa.h.s(view6, z17);
                        }
                        if (zIsNetworkOffline) {
                            homePalmZoneTabV2.w();
                        }
                        networkNotConnectView = homePalmZoneTabV2.f35137C;
                        if (networkNotConnectView != null) {
                            p220oa.h.s(networkNotConnectView, zIsNetworkOffline);
                        }
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it6).f27360a;
                        int i20 = HomePalmZoneTabV2.f35134Z;
                        Bc.i iVar5 = homePalmZoneTabV2.f35139L;
                        if (iVar5 != null) {
                            ((HomeScrollView) iVar5.f729g).r();
                        }
                        if (commonBeanResult2.isSuccess()) {
                            HomeRewardsTabInfo homeRewardsTabInfo = (HomeRewardsTabInfo) commonBeanResult2.data;
                            if (homeRewardsTabInfo != null) {
                                Me.r rVar = homePalmZoneTabV2.f35148w;
                                if (rVar != null) {
                                    if (rVar.f5998f == null) {
                                        rVar.l();
                                    }
                                    Pa.n0.g().v("new_reward_qy_show");
                                    p355xf.t tVar4 = rVar.f6002o;
                                    ((List) tVar4.getValue()).clear();
                                    ClaimablePointDetails claimablePointDetails = homeRewardsTabInfo.claimablePointDetails;
                                    if (claimablePointDetails != null && (list2 = claimablePointDetails.claimablePointInfoList) != null) {
                                        for (ClaimablePointDetails.ClaimablePointItem claimablePointItem : list2) {
                                            List list7 = (List) tVar4.getValue();
                                            String bizId = claimablePointItem.bizId;
                                            Intrinsics.checkNotNullExpressionValue(bizId, "bizId");
                                            list7.add(bizId);
                                        }
                                    }
                                    Bc.E e10 = rVar.f5999g;
                                    if (e10 != null && (textView = ((ImageTextView) e10.f631H).getTextView()) != null) {
                                        textView.setText(String.valueOf(homeRewardsTabInfo.couponNum));
                                    }
                                    Bc.E e11 = rVar.f5999g;
                                    if (e11 != null) {
                                        e11.f642g.setText(Pa.r0.x0(homeRewardsTabInfo.pointBalance));
                                    }
                                    Bc.E e12 = rVar.f5999g;
                                    if (e12 != null) {
                                        e12.f645o.setText(Pa.r0.B(homeRewardsTabInfo.trialCashClaimed, true));
                                    }
                                    if (homeRewardsTabInfo.trialCashUnclaimed > 0) {
                                        Bc.E e13 = rVar.f5999g;
                                        if (e13 != null) {
                                            p220oa.h.C((FrameLayout) e13.f635X);
                                        }
                                        Bc.E e14 = rVar.f5999g;
                                        if (e14 != null) {
                                            e14.f646p.setText(Pa.r0.F(homeRewardsTabInfo.trialCashUnclaimed));
                                        }
                                        Bc.E e15 = rVar.f5999g;
                                        if (e15 != null) {
                                            FrameLayout frameLayout2 = (FrameLayout) e15.f635X;
                                            if (frameLayout2.getVisibility() == 0) {
                                                rVar.m();
                                                frameLayout2.post(new RunnableC0085g(14, frameLayout2, rVar));
                                            }
                                        }
                                    } else {
                                        Bc.E e16 = rVar.f5999g;
                                        if (e16 != null) {
                                            p220oa.h.c((FrameLayout) e16.f635X);
                                        }
                                        rVar.m();
                                    }
                                    Bc.E e17 = rVar.f5999g;
                                    if (e17 != null) {
                                        p220oa.h.c((PpButton) e17.f634Q);
                                    }
                                    Bc.E e18 = rVar.f5999g;
                                    String str2 = Pa.i0.V(e18 != null ? (ImageView) e18.f628A : null) ? homeRewardsTabInfo.darkCalendarIconUrl : homeRewardsTabInfo.calendarIconUrl;
                                    Bc.E e19 = rVar.f5999g;
                                    Pa.r0.h1(e19 != null ? (ImageView) e19.f628A : null, str2, Ac.d.main_rewards_top_icon);
                                    Bc.E e20 = rVar.f5999g;
                                    String str3 = Pa.i0.V(e20 != null ? e20.f637b : null) ? homeRewardsTabInfo.darkEquityBgUrl : homeRewardsTabInfo.equityBgUrl;
                                    Bc.E e21 = rVar.f5999g;
                                    Pa.r0.h1(e21 != null ? e21.f637b : null, str3, Ac.d.main_rewards_top_bg);
                                }
                                Me.r rVar2 = homePalmZoneTabV2.f35148w;
                                if (rVar2 != null) {
                                    boolean zHasLogin = BaseApplication.hasLogin();
                                    View view7 = rVar2.f5998f;
                                    if (view7 != null) {
                                        p220oa.h.s(view7, zHasLogin);
                                    }
                                    rVar2.k(rVar2.f5998f, zHasLogin);
                                    if (!zHasLogin) {
                                        rVar2.m();
                                    }
                                }
                            }
                            HomeRewardsTabInfo homeRewardsTabInfo2 = (HomeRewardsTabInfo) commonBeanResult2.data;
                            if (Pa.i0.T()) {
                                if (homeRewardsTabInfo2 != null) {
                                    str = homeRewardsTabInfo2.darkBackGroundUrl;
                                } else {
                                    str = null;
                                }
                            } else if (homeRewardsTabInfo2 != null) {
                                str = homeRewardsTabInfo2.backGroundUrl;
                            } else {
                                str = null;
                            }
                            Bc.i iVar6 = homePalmZoneTabV2.f35139L;
                            AppCompatImageView appCompatImageView2 = iVar6 != null ? (AppCompatImageView) iVar6.f727e : null;
                            int i21 = Ac.d.main_zone_top_bg;
                            if (Pa.r0.n(appCompatImageView2)) {
                                Pa.r0.j1(appCompatImageView2, str, (G1.d) ((G1.d) new G1.d().j(i21)).m(com.bumptech.glide.load.b.f20515b));
                            }
                            if (homePalmZoneTabV2.f35140M) {
                                homePalmZoneTabV2.f35140M = false;
                                HomeActivity homeActivity = (HomeActivity) homePalmZoneTabV2.getActivity();
                                if (Pa.i0.W(homeActivity)) {
                                    String string = homePalmZoneTabV2.getString(Ac.h.main_ad_zone_pop_slot_id);
                                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                    new InterstitialAdView(string, 0, new Ab.k(8), new org.sufficientlysecure.htmltextview.h(9)).show(homeActivity, false, new C0174p(homeActivity, 1));
                                }
                            }
                        } else {
                            ToastUtils.showLong(commonBeanResult2.getRespMsg(), new Object[0]);
                        }
                    } else if (!(it6 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it6).getClass();
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it7 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (!(it7 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it7 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it7).f27360a;
                        Me.r rVar3 = homePalmZoneTabV2.f35148w;
                        if (rVar3 != null) {
                            HomeCouponRewardsRsp homeCouponRewardsRsp = commonBeanResult3 != null ? (HomeCouponRewardsRsp) commonBeanResult3.data : null;
                            if (rVar3.f5998f == null) {
                                rVar3.l();
                            }
                            Me.o oVar = rVar3.f6000i;
                            if (oVar != null) {
                                RecyclerView recyclerView = oVar.f5987a;
                                if (homeCouponRewardsRsp == null || (list3 = homeCouponRewardsRsp.list) == null || list3.isEmpty()) {
                                    p220oa.h.c(recyclerView);
                                } else {
                                    p220oa.h.s(recyclerView, true);
                                    Pa.n0.g().v("new_reward_hub_show");
                                    P8.a aVar = oVar.f5989c;
                                    if (aVar != null) {
                                        aVar.setList(homeCouponRewardsRsp.list);
                                    }
                                }
                            }
                        }
                    } else if (!(it7 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it7 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it7).getClass();
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it8 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it8 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult4 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it8).f27360a;
                        Je.n nVar = homePalmZoneTabV2.t;
                        if (nVar != null) {
                            PalmZoneReferEarnHomeResp palmZoneReferEarnHomeResp = commonBeanResult4 != null ? (PalmZoneReferEarnHomeResp) commonBeanResult4.data : null;
                            nVar.f4832g = palmZoneReferEarnHomeResp;
                            if (commonBeanResult4 == null || !commonBeanResult4.isSuccess() || palmZoneReferEarnHomeResp == null || !palmZoneReferEarnHomeResp.hasValidCardData()) {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) nVar.f5949a;
                                if (appCompatImageView3 != null) {
                                    p220oa.h.c(appCompatImageView3);
                                }
                                View view8 = nVar.f4830e;
                                if (view8 != null) {
                                    p220oa.h.s(view8, false);
                                }
                                nVar.k(nVar.f4830e, false);
                            } else {
                                if (nVar.f4830e == null) {
                                    nVar.n();
                                }
                                View view9 = nVar.f4830e;
                                if (view9 != null) {
                                    p220oa.h.s(view9, true);
                                }
                                nVar.k(nVar.f4830e, true);
                                TextView textView4 = nVar.f4833i;
                                if (textView4 != null) {
                                    String strB = Pa.r0.B(palmZoneReferEarnHomeResp.actualAmt, false);
                                    Intrinsics.checkNotNullExpressionValue(strB, "getAmountStringWithCurrency(...)");
                                    textView4.setText(strB);
                                }
                                if (nVar.f4835o.size() == 3) {
                                    Je.m mVar = (Je.m) nVar.f4835o.get(0);
                                    Je.m mVar2 = (Je.m) nVar.f4835o.get(1);
                                    Je.m mVar3 = (Je.m) nVar.f4835o.get(2);
                                    if (palmZoneReferEarnHomeResp.isSingleLevelReward()) {
                                        View view10 = mVar.f4825a;
                                        if (view10 != null) {
                                            p220oa.h.c(view10);
                                        }
                                        View view11 = mVar2.f4825a;
                                        if (view11 != null) {
                                            p220oa.h.c(view11);
                                        }
                                        View view12 = mVar3.f4825a;
                                        if (view12 != null) {
                                            p220oa.h.s(view12, true);
                                        }
                                        TextView textView5 = mVar3.f4826b;
                                        if (textView5 != null) {
                                            textView5.setText(Pa.r0.F(palmZoneReferEarnHomeResp.targetAmt1));
                                        }
                                        TextView textView6 = mVar3.f4827c;
                                        if (textView6 != null) {
                                            textView6.setText(nVar.m(palmZoneReferEarnHomeResp.userCount3));
                                        }
                                        ProgressBar progressBar = nVar.f4834j;
                                        if (progressBar != null) {
                                            int i22 = (int) palmZoneReferEarnHomeResp.targetAmt1;
                                            progressBar.setMax(i22 >= 1 ? i22 : 1);
                                        }
                                    } else {
                                        View view13 = mVar.f4825a;
                                        if (view13 != null) {
                                            p220oa.h.s(view13, true);
                                        }
                                        View view14 = mVar2.f4825a;
                                        if (view14 != null) {
                                            p220oa.h.s(view14, true);
                                        }
                                        View view15 = mVar3.f4825a;
                                        if (view15 != null) {
                                            p220oa.h.s(view15, true);
                                        }
                                        TextView textView7 = mVar.f4826b;
                                        if (textView7 != null) {
                                            textView7.setText(Pa.r0.F(palmZoneReferEarnHomeResp.targetAmt1));
                                        }
                                        TextView textView8 = mVar2.f4826b;
                                        if (textView8 != null) {
                                            textView8.setText(Pa.r0.F(palmZoneReferEarnHomeResp.targetAmt2));
                                        }
                                        TextView textView9 = mVar3.f4826b;
                                        if (textView9 != null) {
                                            textView9.setText(Pa.r0.F(palmZoneReferEarnHomeResp.targetAmt3));
                                        }
                                        TextView textView10 = mVar.f4827c;
                                        if (textView10 != null) {
                                            textView10.setText(nVar.m(palmZoneReferEarnHomeResp.userCount1));
                                        }
                                        TextView textView11 = mVar2.f4827c;
                                        if (textView11 != null) {
                                            textView11.setText(nVar.m(palmZoneReferEarnHomeResp.userCount2));
                                        }
                                        TextView textView12 = mVar3.f4827c;
                                        if (textView12 != null) {
                                            textView12.setText(nVar.m(palmZoneReferEarnHomeResp.userCount3));
                                        }
                                        ProgressBar progressBar2 = nVar.f4834j;
                                        if (progressBar2 != null) {
                                            int i23 = (int) palmZoneReferEarnHomeResp.targetAmt3;
                                            progressBar2.setMax(i23 >= 1 ? i23 : 1);
                                        }
                                    }
                                    nVar.o(palmZoneReferEarnHomeResp);
                                    ProgressBar progressBar3 = nVar.f4834j;
                                    if (progressBar3 != null) {
                                        int i24 = (int) palmZoneReferEarnHomeResp.actualAmt;
                                        int max = progressBar3.getMax();
                                        if (i24 > max) {
                                            i24 = max;
                                        }
                                        progressBar3.setProgress(i24);
                                    }
                                }
                            }
                        }
                    } else if (!(it8 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it8 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it8).getClass();
                    }
                }
                return Unit.f38893a;
        }
    }
}
