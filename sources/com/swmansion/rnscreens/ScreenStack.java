package com.swmansion.rnscreens;

import Ad.C0058e;
import Fe.h0;
import Kf.q;
import M7.C0449i;
import M7.EnumC0455o;
import M7.p;
import M7.s;
import M7.y;
import M7.z;
import O7.O;
import Sf.d;
import Sf.e;
import Sf.g;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.camera.video.u;
import androidx.fragment.app.C1161a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.ScreenStackFragmentWrapper;
import com.swmansion.rnscreens.stack.views.ScreensCoordinatorLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.I;
import kotlin.collections.J;
import kotlin.collections.r;
import kotlin.collections.v;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023b8.b;
import p023b8.c;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006 "}, d2 = {"Lcom/swmansion/rnscreens/ScreenStack;", "Lcom/swmansion/rnscreens/ScreenContainer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "getScreenIds", "()Ljava/util/List;", "", "H", "Z", "getGoingForward", "()Z", "setGoingForward", "(Z)V", "goingForward", "Lcom/swmansion/rnscreens/Screen;", "getTopScreen", "()Lcom/swmansion/rnscreens/Screen;", "topScreen", "Ljava/util/ArrayList;", "Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;", "Lkotlin/collections/ArrayList;", "getFragments", "()Ljava/util/ArrayList;", "fragments", "getRootScreen", "rootScreen", "M7/y", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenStack.kt\ncom/swmansion/rnscreens/ScreenStack\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,412:1\n295#2,2:413\n1563#2:416\n1634#2,3:417\n360#2,7:420\n388#2,7:427\n1869#2,2:440\n1#3:415\n1321#4,2:434\n1321#4,2:436\n1321#4,2:438\n*S KotlinDebug\n*F\n+ 1 ScreenStack.kt\ncom/swmansion/rnscreens/ScreenStack\n*L\n54#1:413,2\n98#1:416\n98#1:417,3\n117#1:420,7\n118#1:427,7\n328#1:440,2\n253#1:434,2\n260#1:436,2\n268#1:438,2\n*E\n"})
public final class ScreenStack extends ScreenContainer {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f25329L = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f25330A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p023b8.a f25331B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f25332C;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    public boolean goingForward;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f25334j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashSet f25335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f25336p;
    public final ArrayList t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f25337v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ScreenStackFragmentWrapper f25338w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean needsDrawReordering(ScreenFragmentWrapper screenFragmentWrapper, p pVar) {
            if (pVar == null) {
                pVar = screenFragmentWrapper.getScreen().getStackAnimation();
            }
            return (Build.VERSION.SDK_INT >= 33 || pVar == p.f5835d || pVar == p.f5838g || pVar == p.f5839i || pVar == p.f5840j) && pVar != p.f5833b;
        }

        private a() {
        }
    }

    public ScreenStack(@Nullable Context context) {
        super(context);
        this.f25334j = new ArrayList();
        this.f25335o = new HashSet();
        this.f25336p = new ArrayList();
        this.t = new ArrayList();
        this.f25337v = new ArrayList();
        this.f25332C = new ArrayList();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public final ScreenFragmentWrapper a(Screen screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screen");
        if (z.f5869a[screenView.getStackPresentation().ordinal()] == 1) {
            Intrinsics.checkNotNullParameter(screenView, "screenView");
            return new ScreenStackFragment(screenView);
        }
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        return new ScreenStackFragment(screenView);
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public final boolean c(ScreenFragmentWrapper screenFragmentWrapper) {
        return CollectionsKt.A(this.f25305a, screenFragmentWrapper) && !CollectionsKt.A(this.f25335o, screenFragmentWrapper);
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public final void d() {
        Iterator it = this.f25334j.iterator();
        while (it.hasNext()) {
            ((ScreenStackFragmentWrapper) it.next()).onContainerUpdate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        p023b8.a aVar = this.f25331B;
        if (aVar != null) {
            aVar.apply(this.f25337v);
        }
        ArrayList<y> arrayList = this.f25337v;
        this.f25337v = new ArrayList();
        for (y yVar : arrayList) {
            ScreenStack screenStack = yVar.f5868d;
            Canvas canvas2 = yVar.f5865a;
            Intrinsics.e(canvas2);
            super.drawChild(canvas2, yVar.f5866b, yVar.f5867c);
            yVar.f5865a = null;
            yVar.f5866b = null;
            yVar.f5867c = 0L;
            this.t.add(yVar);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j6) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        ArrayList arrayList = this.f25337v;
        ArrayList arrayList2 = this.t;
        y yVar = arrayList2.isEmpty() ? new y(this) : (y) arrayList2.remove(C1850q.g(arrayList2));
        yVar.f5865a = canvas;
        yVar.f5866b = child;
        yVar.f5867c = j6;
        arrayList.add(yVar);
        return true;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        p023b8.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.endViewTransition(view);
        ArrayList arrayList = this.f25332C;
        arrayList.remove(view);
        if (arrayList.isEmpty() && (aVar = this.f25331B) != null) {
            aVar.f18788a = false;
        }
        if (this.f25330A) {
            this.f25330A = false;
            j();
        }
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public final void f() {
        p stackAnimation;
        boolean z3;
        ScreenStackFragmentWrapper screenStackFragmentWrapper;
        CustomToolbar toolbar;
        ScreenStackFragmentWrapper screenStackFragmentWrapper2;
        ScreenFragmentWrapper screenFragmentWrapper;
        CustomToolbar toolbar2;
        Object obj;
        Screen screen;
        final F f10 = new F();
        final F f11 = new F();
        this.f25331B = null;
        ArrayList arrayList = this.f25305a;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        final int i7 = 0;
        g gVarC = Sf.p.c(CollectionsKt.y(new I(arrayList)), new Function1(this) { // from class: M7.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenStack f5862b;

            {
                this.f5862b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean z8 = true;
                ScreenStack screenStack = this.f5862b;
                switch (i7) {
                    case 0:
                        ScreenFragmentWrapper it = (ScreenFragmentWrapper) obj2;
                        ScreenStack.a aVar = ScreenStack.f25329L;
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf((CollectionsKt.A(screenStack.f25335o, it) || it.getScreen().getActivityState() == EnumC0454n.f5825a) ? false : true);
                    default:
                        ScreenStackFragmentWrapper wrapper = (ScreenStackFragmentWrapper) obj2;
                        ScreenStack.a aVar2 = ScreenStack.f25329L;
                        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                        if (screenStack.f25305a.contains(wrapper) && !screenStack.f25335o.contains(wrapper)) {
                            z8 = false;
                        }
                        return Boolean.valueOf(z8);
                }
            }
        });
        f10.f38951a = Sf.p.d(gVarC);
        h0 predicate = new h0(10);
        Intrinsics.checkNotNullParameter(gVarC, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ScreenFragmentWrapper screenFragmentWrapper2 = (ScreenFragmentWrapper) Sf.p.d(new e(gVarC, predicate, 0));
        if (screenFragmentWrapper2 == null || screenFragmentWrapper2 == f10.f38951a) {
            screenFragmentWrapper2 = null;
        }
        f11.f38951a = screenFragmentWrapper2;
        ArrayList arrayList2 = this.f25334j;
        boolean z8 = CollectionsKt.A(arrayList2, f10.f38951a) && !CollectionsKt.A(this.f25336p, f10.f38951a);
        Object obj2 = f10.f38951a;
        ScreenStackFragmentWrapper screenStackFragmentWrapper3 = this.f25338w;
        boolean z10 = obj2 != screenStackFragmentWrapper3;
        if (obj2 == null || z8) {
            if (obj2 == null || screenStackFragmentWrapper3 == null || !z10) {
                stackAnimation = null;
                z3 = true;
            } else {
                Screen screen2 = screenStackFragmentWrapper3.getScreen();
                stackAnimation = screen2 != null ? screen2.getStackAnimation() : null;
                z3 = false;
            }
        } else if (screenStackFragmentWrapper3 != null) {
            z3 = (arrayList.contains(screenStackFragmentWrapper3)) || (((ScreenFragmentWrapper) f10.f38951a).getScreen().getReplaceAnimation() == EnumC0455o.f5829a);
            if (z3) {
                screen = ((ScreenFragmentWrapper) f10.f38951a).getScreen();
            } else {
                ScreenStackFragmentWrapper screenStackFragmentWrapper4 = this.f25338w;
                if (screenStackFragmentWrapper4 == null || (screen = screenStackFragmentWrapper4.getScreen()) == null) {
                    stackAnimation = null;
                }
            }
            stackAnimation = screen.getStackAnimation();
        } else {
            stackAnimation = p.f5833b;
            this.goingForward = true;
            z3 = true;
        }
        this.goingForward = z3;
        if (z3 && (obj = f10.f38951a) != null && f25329L.needsDrawReordering((ScreenFragmentWrapper) obj, stackAnimation) && f11.f38951a == null) {
            this.f25331B = new c();
        } else if (f10.f38951a != null && z8 && (screenStackFragmentWrapper = this.f25338w) != null && screenStackFragmentWrapper.isTranslucent() && !((ScreenFragmentWrapper) f10.f38951a).isTranslucent()) {
            Intrinsics.checkNotNullParameter(arrayList2, "<this>");
            final int i10 = 0;
            e eVarH = Sf.p.h(CollectionsKt.y(new I(arrayList2)), new Function1() { // from class: M7.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    boolean z11 = false;
                    kotlin.jvm.internal.F f12 = f10;
                    switch (i10) {
                        case 0:
                            ScreenStackFragmentWrapper it = (ScreenStackFragmentWrapper) obj3;
                            ScreenStack.a aVar = ScreenStack.f25329L;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it != f12.f38951a && it.isTranslucent()) {
                                z11 = true;
                            }
                            return Boolean.valueOf(z11);
                        case 1:
                            ScreenFragmentWrapper it2 = (ScreenFragmentWrapper) obj3;
                            ScreenStack.a aVar2 = ScreenStack.f25329L;
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return Boolean.valueOf(it2 != f12.f38951a);
                        default:
                            ScreenFragmentWrapper it3 = (ScreenFragmentWrapper) obj3;
                            ScreenStack.a aVar3 = ScreenStack.f25329L;
                            Intrinsics.checkNotNullParameter(it3, "it");
                            return Boolean.valueOf(it3 != f12.f38951a);
                    }
                }
            });
            Intrinsics.checkNotNullParameter(eVarH, "<this>");
            d dVar = new d(eVarH, (byte) 0);
            int i11 = 0;
            while (dVar.hasNext()) {
                dVar.next();
                i11++;
                if (i11 < 0) {
                    C1850q.j();
                    throw null;
                }
            }
            if (i11 > 1) {
                this.f25331B = new b(Math.max((C1850q.g(arrayList2) - i11) + 1, 0));
            }
        }
        C1161a c1161aB = b();
        if (stackAnimation != null) {
            Intrinsics.checkNotNullParameter(c1161aB, "<this>");
            Intrinsics.checkNotNullParameter(stackAnimation, "stackAnimation");
            if (z3) {
                switch (stackAnimation.ordinal()) {
                    case 0:
                        c1161aB.f(C0449i.rns_default_enter_in, C0449i.rns_default_enter_out, 0, 0);
                        break;
                    case 1:
                        int i12 = C0449i.rns_no_animation_20;
                        c1161aB.f(i12, i12, 0, 0);
                        break;
                    case 2:
                        c1161aB.f(C0449i.rns_fade_in, C0449i.rns_fade_out, 0, 0);
                        break;
                    case 3:
                        c1161aB.f(C0449i.rns_slide_in_from_bottom, C0449i.rns_no_animation_medium, 0, 0);
                        break;
                    case 4:
                        c1161aB.f(C0449i.rns_slide_in_from_right, C0449i.rns_slide_out_to_left, 0, 0);
                        break;
                    case 5:
                        c1161aB.f(C0449i.rns_slide_in_from_left, C0449i.rns_slide_out_to_right, 0, 0);
                        break;
                    case 6:
                        c1161aB.f(C0449i.rns_fade_from_bottom, C0449i.rns_no_animation_350, 0, 0);
                        break;
                    case 7:
                        c1161aB.f(C0449i.rns_ios_from_right_foreground_open, C0449i.rns_ios_from_right_background_open, 0, 0);
                        break;
                    case 8:
                        c1161aB.f(C0449i.rns_ios_from_left_foreground_open, C0449i.rns_ios_from_left_background_open, 0, 0);
                        break;
                    default:
                        throw new l();
                }
            } else {
                switch (stackAnimation.ordinal()) {
                    case 0:
                        c1161aB.f(C0449i.rns_default_exit_in, C0449i.rns_default_exit_out, 0, 0);
                        break;
                    case 1:
                        int i13 = C0449i.rns_no_animation_20;
                        c1161aB.f(i13, i13, 0, 0);
                        break;
                    case 2:
                        c1161aB.f(C0449i.rns_fade_in, C0449i.rns_fade_out, 0, 0);
                        break;
                    case 3:
                        c1161aB.f(C0449i.rns_no_animation_medium, C0449i.rns_slide_out_to_bottom, 0, 0);
                        break;
                    case 4:
                        c1161aB.f(C0449i.rns_slide_in_from_left, C0449i.rns_slide_out_to_right, 0, 0);
                        break;
                    case 5:
                        c1161aB.f(C0449i.rns_slide_in_from_right, C0449i.rns_slide_out_to_left, 0, 0);
                        break;
                    case 6:
                        c1161aB.f(C0449i.rns_no_animation_250, C0449i.rns_fade_to_bottom, 0, 0);
                        break;
                    case 7:
                        c1161aB.f(C0449i.rns_ios_from_right_background_close, C0449i.rns_ios_from_right_foreground_close, 0, 0);
                        break;
                    case 8:
                        c1161aB.f(C0449i.rns_ios_from_left_background_close, C0449i.rns_ios_from_left_foreground_close, 0, 0);
                        break;
                    default:
                        throw new l();
                }
            }
        }
        final int i14 = 1;
        d dVar2 = new d(Sf.p.c(CollectionsKt.y(arrayList2), new Function1(this) { // from class: M7.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenStack f5862b;

            {
                this.f5862b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                boolean z11 = true;
                ScreenStack screenStack = this.f5862b;
                switch (i14) {
                    case 0:
                        ScreenFragmentWrapper it = (ScreenFragmentWrapper) obj3;
                        ScreenStack.a aVar = ScreenStack.f25329L;
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf((CollectionsKt.A(screenStack.f25335o, it) || it.getScreen().getActivityState() == EnumC0454n.f5825a) ? false : true);
                    default:
                        ScreenStackFragmentWrapper wrapper = (ScreenStackFragmentWrapper) obj3;
                        ScreenStack.a aVar2 = ScreenStack.f25329L;
                        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                        if (screenStack.f25305a.contains(wrapper) && !screenStack.f25335o.contains(wrapper)) {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        }));
        while (dVar2.hasNext()) {
            c1161aB.m(((ScreenStackFragmentWrapper) dVar2.next()).getFragment());
        }
        final int i15 = 1;
        d dVar3 = new d(Sf.p.c(Sf.p.h(CollectionsKt.y(arrayList), new Function1() { // from class: M7.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                boolean z11 = false;
                kotlin.jvm.internal.F f12 = f11;
                switch (i15) {
                    case 0:
                        ScreenStackFragmentWrapper it = (ScreenStackFragmentWrapper) obj3;
                        ScreenStack.a aVar = ScreenStack.f25329L;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it != f12.f38951a && it.isTranslucent()) {
                            z11 = true;
                        }
                        return Boolean.valueOf(z11);
                    case 1:
                        ScreenFragmentWrapper it2 = (ScreenFragmentWrapper) obj3;
                        ScreenStack.a aVar2 = ScreenStack.f25329L;
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return Boolean.valueOf(it2 != f12.f38951a);
                    default:
                        ScreenFragmentWrapper it3 = (ScreenFragmentWrapper) obj3;
                        ScreenStack.a aVar3 = ScreenStack.f25329L;
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return Boolean.valueOf(it3 != f12.f38951a);
                }
            }
        }), new C0058e(13, f10, this)));
        while (dVar3.hasNext()) {
            c1161aB.m(((ScreenFragmentWrapper) dVar3.next()).getFragment());
        }
        Object obj3 = f11.f38951a;
        if (obj3 == null || ((ScreenFragmentWrapper) obj3).getFragment().isAdded()) {
            Object obj4 = f10.f38951a;
            if (obj4 != null && !((ScreenFragmentWrapper) obj4).getFragment().isAdded()) {
                Screen screen3 = ((ScreenFragmentWrapper) f10.f38951a).getScreen();
                Intrinsics.checkNotNullParameter(screen3, "<this>");
                if (!screen3.getSheetShouldOverflowTopInset() && androidx.camera.core.impl.utils.executor.g.N(screen3)) {
                    ((ScreenFragmentWrapper) f10.f38951a).getFragment().postponeEnterTransition();
                }
                c1161aB.a(((ScreenFragmentWrapper) f10.f38951a).getFragment(), getId());
            }
        } else {
            ScreenFragmentWrapper screenFragmentWrapper3 = (ScreenFragmentWrapper) f10.f38951a;
            q qVarY = CollectionsKt.y(arrayList);
            final int i16 = 2;
            Function1 predicate2 = new Function1() { // from class: M7.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    boolean z11 = false;
                    kotlin.jvm.internal.F f12 = f11;
                    switch (i16) {
                        case 0:
                            ScreenStackFragmentWrapper it = (ScreenStackFragmentWrapper) obj5;
                            ScreenStack.a aVar = ScreenStack.f25329L;
                            Intrinsics.checkNotNullParameter(it, "it");
                            if (it != f12.f38951a && it.isTranslucent()) {
                                z11 = true;
                            }
                            return Boolean.valueOf(z11);
                        case 1:
                            ScreenFragmentWrapper it2 = (ScreenFragmentWrapper) obj5;
                            ScreenStack.a aVar2 = ScreenStack.f25329L;
                            Intrinsics.checkNotNullParameter(it2, "it");
                            return Boolean.valueOf(it2 != f12.f38951a);
                        default:
                            ScreenFragmentWrapper it3 = (ScreenFragmentWrapper) obj5;
                            ScreenStack.a aVar3 = ScreenStack.f25329L;
                            Intrinsics.checkNotNullParameter(it3, "it");
                            return Boolean.valueOf(it3 != f12.f38951a);
                    }
                }
            };
            Intrinsics.checkNotNullParameter(qVarY, "<this>");
            Intrinsics.checkNotNullParameter(predicate2, "predicate");
            d dVar4 = new d(new e(qVarY, predicate2, 0));
            while (dVar4.hasNext()) {
                c1161aB.d(getId(), ((ScreenFragmentWrapper) dVar4.next()).getFragment(), null, 1);
                s sVar = new s(screenFragmentWrapper3, 1);
                if (c1161aB.f17167g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                c1161aB.f17168h = false;
                if (c1161aB.f17177q == null) {
                    c1161aB.f17177q = new ArrayList();
                }
                c1161aB.f17177q.add(sVar);
            }
        }
        Object obj5 = f10.f38951a;
        this.f25338w = obj5 instanceof ScreenStackFragmentWrapper ? (ScreenStackFragmentWrapper) obj5 : null;
        arrayList2.clear();
        v.o(arrayList2, Sf.p.f(CollectionsKt.y(arrayList), new h0(11)));
        this.f25336p = Sf.p.i(Sf.p.c(CollectionsKt.y(arrayList), new h0(12)));
        ScreenFragmentWrapper screenFragmentWrapper4 = (ScreenFragmentWrapper) f11.f38951a;
        if (arrayList.size() > 1 && screenFragmentWrapper4 != null && (screenStackFragmentWrapper2 = this.f25338w) != null && screenStackFragmentWrapper2.isTranslucent()) {
            IntRange indices = kotlin.ranges.b.f(0, arrayList.size() - 1);
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            Intrinsics.checkNotNullParameter(indices, "indices");
            Iterator it = w.v(indices.isEmpty() ? kotlin.collections.z.f38935a : CollectionsKt.Y(arrayList.subList(indices.f38977a, indices.f38978b + 1))).iterator();
            do {
                ListIterator listIterator = ((J) it).f38901a;
                if (listIterator.hasPrevious()) {
                    screenFragmentWrapper = (ScreenFragmentWrapper) listIterator.previous();
                    Screen screen4 = screenFragmentWrapper.getScreen();
                    screen4.setImportantForAccessibility(4);
                    ScreenStackHeaderConfig headerConfig = screen4.getHeaderConfig();
                    if (headerConfig != null && (toolbar2 = headerConfig.getToolbar()) != null) {
                        toolbar2.setImportantForAccessibility(4);
                    }
                }
            } while (!screenFragmentWrapper.equals(screenFragmentWrapper4));
        }
        Screen topScreen = getTopScreen();
        if (topScreen != null) {
            topScreen.setImportantForAccessibility(0);
            ScreenStackHeaderConfig headerConfig2 = topScreen.getHeaderConfig();
            if (headerConfig2 != null && (toolbar = headerConfig2.getToolbar()) != null) {
                toolbar.setImportantForAccessibility(0);
            }
        }
        c1161aB.j();
    }

    @NotNull
    public final ArrayList<ScreenStackFragmentWrapper> getFragments() {
        return this.f25334j;
    }

    public final boolean getGoingForward() {
        return this.goingForward;
    }

    @NotNull
    public final Screen getRootScreen() {
        Object next;
        Screen screen;
        Iterator it = this.f25305a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (CollectionsKt.A(this.f25335o, (ScreenFragmentWrapper) next));
        ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) next;
        if (screenFragmentWrapper == null || (screen = screenFragmentWrapper.getScreen()) == null) {
            throw new IllegalStateException("[RNScreens] Stack has no root screen set");
        }
        return screen;
    }

    @NotNull
    public final List<String> getScreenIds() {
        ArrayList arrayList = this.f25305a;
        ArrayList arrayList2 = new ArrayList(r.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ScreenFragmentWrapper) it.next()).getScreen().getScreenId());
        }
        return arrayList2;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    @Nullable
    public Screen getTopScreen() {
        ScreenStackFragmentWrapper screenStackFragmentWrapper = this.f25338w;
        if (screenStackFragmentWrapper != null) {
            return screenStackFragmentWrapper.getScreen();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public final void h() {
        this.f25335o.clear();
        super.h();
    }

    @Override // com.swmansion.rnscreens.ScreenContainer
    public final void i(int i7) {
        HashSet hashSet = this.f25335o;
        Object obj = this.f25305a.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        K.a(hashSet);
        hashSet.remove((ScreenFragmentWrapper) obj);
        super.i(i7);
    }

    public final void j() {
        int surfaceId = UIManagerHelper.getSurfaceId(this);
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new O(surfaceId, getId()));
        }
    }

    public final void setGoingForward(boolean z3) {
        this.goingForward = z3;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        p023b8.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view instanceof ScreensCoordinatorLayout)) {
            throw new IllegalStateException(u.l(view.getClass(), "[RNScreens] Unexpected type of ScreenStack direct subview ").toString());
        }
        super.startViewTransition(view);
        boolean zIsRemoving = ((ScreensCoordinatorLayout) view).getFragment().isRemoving();
        ArrayList arrayList = this.f25332C;
        if (zIsRemoving) {
            arrayList.add(view);
        }
        if (!arrayList.isEmpty() && (aVar = this.f25331B) != null) {
            aVar.f18788a = true;
        }
        this.f25330A = true;
    }
}
