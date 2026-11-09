package Be;

import Pa.C0505b;
import Q3.i;
import Rd.T;
import Rd.U;
import Rd.r0;
import Re.n;
import Yd.s;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.v;
import androidx.appcompat.widget.C0894y0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.dialog.CashierCouponListDialog;
import com.transsnet.palmpay.core.dialog.CoreSelectCouponForPaymentDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;
import com.transsnet.palmpay.core.dialog.SelectBillTypeDialog;
import com.transsnet.palmpay.core.dialog.SelectPayMethodDialog;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.custom_view.PatternLockResultView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.teller.ui.dialog.BillerCouponListDialog;
import com.transsnet.palmpay.teller.ui.dialog.CouponClaimResultDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f905b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f904a = i7;
        this.f905b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        ViewTreeObserver viewTreeObserver3;
        ConstraintLayout constraintLayout;
        ViewTreeObserver viewTreeObserver4;
        ConstraintLayout constraintLayout2;
        ViewTreeObserver viewTreeObserver5;
        ConstraintLayout constraintLayout3;
        LinearLayout linearLayout;
        ViewTreeObserver viewTreeObserver6;
        LinearLayout linearLayout2;
        Drawable cVar;
        RelativeLayout relativeLayout;
        ViewTreeObserver viewTreeObserver7;
        int i7;
        ViewTreeObserver viewTreeObserver8;
        switch (this.f904a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f905b;
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int screenHeight = (int) (ScreenUtils.getScreenHeight() * 0.5f);
                int height = recyclerView.getHeight();
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                layoutParams.height = height > screenHeight ? screenHeight : -2;
                recyclerView.setLayoutParams(layoutParams);
                recyclerView.setNestedScrollingEnabled(height > screenHeight);
                return;
            case 1:
                HomeFragmentHomeTab homeFragmentHomeTab = (HomeFragmentHomeTab) this.f905b;
                SingleAdView singleAdView = homeFragmentHomeTab.f35099M;
                int i10 = 0;
                int height2 = singleAdView != null ? singleAdView.getHeight() : 0;
                DragView dragView = homeFragmentHomeTab.f35097H;
                if (dragView != null) {
                    ViewGroup.LayoutParams layoutParams2 = dragView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (marginLayoutParams != null) {
                        i10 = marginLayoutParams.bottomMargin;
                    }
                }
                if (height2 <= 0 || height2 <= i10) {
                    return;
                }
                DragView dragView2 = homeFragmentHomeTab.f35097H;
                if (dragView2 != null) {
                    h.k(dragView2, null, null, null, Integer.valueOf(CommonViewExtKt.getDp(16.0f) + height2), 7);
                }
                SingleAdView singleAdView2 = homeFragmentHomeTab.f35099M;
                if (singleAdView2 == null || (viewTreeObserver = singleAdView2.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            case 2:
                C0505b c0505b = (C0505b) this.f905b;
                c0505b.getClass();
                int statusBarHeight = BarUtils.getStatusBarHeight();
                Rect rect = new Rect();
                View view = (View) c0505b.f7073c;
                view.getWindowVisibleDisplayFrame(rect);
                int i11 = (rect.bottom - rect.top) + statusBarHeight;
                if (i11 != c0505b.f7072b) {
                    ((ViewGroup.LayoutParams) c0505b.f7074d).height = i11;
                    view.requestLayout();
                    c0505b.f7072b = i11;
                    return;
                }
                return;
            case 3:
                Q3.c cVar2 = (Q3.c) this.f905b;
                Window window = cVar2.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                int screenHeight2 = (int) (ScreenUtils.getScreenHeight() * 0.7f);
                if (attributes != null) {
                    attributes.height = screenHeight2;
                }
                if (window != null) {
                    window.setAttributes(attributes);
                }
                View view2 = (View) cVar2.f7593g.getValue();
                if (view2 == null || (viewTreeObserver2 = view2.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver2.removeOnGlobalLayoutListener(this);
                return;
            case 4:
                i iVar = (i) this.f905b;
                Window window2 = iVar.getWindow();
                WindowManager.LayoutParams attributes2 = window2 != null ? window2.getAttributes() : null;
                int screenHeight3 = (int) (ScreenUtils.getScreenHeight() * 0.75f);
                if (attributes2 != null) {
                    attributes2.height = screenHeight3;
                }
                if (window2 != null) {
                    window2.setAttributes(attributes2);
                }
                View view3 = (View) iVar.f7607e.getValue();
                if (view3 == null || (viewTreeObserver3 = view3.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver3.removeOnGlobalLayoutListener(this);
                return;
            case 5:
                BillerCouponListDialog billerCouponListDialog = (BillerCouponListDialog) this.f905b;
                Window window3 = billerCouponListDialog.getWindow();
                WindowManager.LayoutParams attributes3 = window3 != null ? window3.getAttributes() : null;
                int screenHeight4 = (int) (ScreenUtils.getScreenHeight() * 0.7f);
                if (attributes3 != null) {
                    attributes3.height = screenHeight4;
                }
                if (window3 != null) {
                    window3.setAttributes(attributes3);
                }
                T t = billerCouponListDialog.binding;
                if (t == null || (constraintLayout = t.f8153e) == null || (viewTreeObserver4 = constraintLayout.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver4.removeOnGlobalLayoutListener(this);
                return;
            case 6:
                int screenHeight5 = (int) (ScreenUtils.getScreenHeight() * 0.7f);
                CouponClaimResultDialog couponClaimResultDialog = (CouponClaimResultDialog) this.f905b;
                U u6 = couponClaimResultDialog.binding;
                if (((u6 == null || (constraintLayout3 = u6.f8160g) == null) ? 0 : constraintLayout3.getHeight()) > screenHeight5) {
                    Window window4 = couponClaimResultDialog.getWindow();
                    WindowManager.LayoutParams attributes4 = window4 != null ? window4.getAttributes() : null;
                    if (attributes4 != null) {
                        attributes4.height = screenHeight5;
                    }
                    Window window5 = couponClaimResultDialog.getWindow();
                    if (window5 != null) {
                        window5.setAttributes(attributes4);
                    }
                }
                U u10 = couponClaimResultDialog.binding;
                if (u10 == null || (constraintLayout2 = u10.f8160g) == null || (viewTreeObserver5 = constraintLayout2.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver5.removeOnGlobalLayoutListener(this);
                return;
            case 7:
                PickPaymentItemDialog pickPaymentItemDialog = (PickPaymentItemDialog) this.f905b;
                Window window6 = pickPaymentItemDialog.getWindow();
                Intrinsics.e(window6);
                WindowManager.LayoutParams attributes5 = window6.getAttributes();
                s sVar = pickPaymentItemDialog.mAdapter;
                if (sVar == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                sVar.getItemCount();
                int screenHeight6 = (int) (ScreenUtils.getScreenHeight() * 0.7f);
                int screenHeight7 = (int) (ScreenUtils.getScreenHeight() * 0.5f);
                r0 r0Var = pickPaymentItemDialog.binding;
                attributes5.height = Math.min(screenHeight6, Math.max((r0Var == null || (linearLayout2 = r0Var.f8471j) == null) ? 0 : linearLayout2.getHeight(), screenHeight7));
                window6.setAttributes(attributes5);
                r0 r0Var2 = pickPaymentItemDialog.binding;
                if (r0Var2 == null || (linearLayout = r0Var2.f8471j) == null || (viewTreeObserver6 = linearLayout.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver6.removeOnGlobalLayoutListener(this);
                return;
            case 8:
                g gVar = (g) this.f905b;
                if (gVar.isShowing()) {
                    ArrayList arrayList = gVar.f12412i;
                    if (arrayList.size() <= 0 || ((f) arrayList.get(0)).f12392a.f12721k0) {
                        return;
                    }
                    View view4 = gVar.f12396A;
                    if (view4 == null || !view4.isShown()) {
                        gVar.dismiss();
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).f12392a.show();
                    }
                    return;
                }
                return;
            case 9:
                v vVar = (v) this.f905b;
                if (vVar.isShowing()) {
                    C0894y0 c0894y0 = vVar.f12503i;
                    if (c0894y0.f12721k0) {
                        return;
                    }
                    View view5 = vVar.f12507v;
                    if (view5 == null || !view5.isShown()) {
                        vVar.dismiss();
                        return;
                    } else {
                        c0894y0.show();
                        return;
                    }
                }
                return;
            case 10:
                PatternLockResultView patternLockResultView = (PatternLockResultView) this.f905b;
                patternLockResultView.f31040b = patternLockResultView.getHeight();
                patternLockResultView.f31039a = patternLockResultView.getWidth();
                float f10 = patternLockResultView.f31039a / 3.0f;
                patternLockResultView.f31041c = f10;
                float f11 = patternLockResultView.f31040b / 3.0f;
                patternLockResultView.f31042d = f11;
                patternLockResultView.f31044f = f11 > f10 ? f10 / 4.0f : f11 / 4.0f;
                patternLockResultView.getClass();
                for (int i12 = 0; i12 < 9; i12++) {
                    n nVar = new n();
                    nVar.f8589a = -1.0f;
                    nVar.f8590b = -1.0f;
                    patternLockResultView.f31043e[i12] = nVar;
                    int i13 = i12 % 3;
                    if (i13 == 0) {
                        nVar.f8589a = patternLockResultView.f31041c * 0.5f;
                    } else if (i13 == 1) {
                        nVar.f8589a = patternLockResultView.f31041c * 1.5f;
                    } else if (i13 == 2) {
                        nVar.f8589a = patternLockResultView.f31041c * 2.5f;
                    }
                    int i14 = i12 / 3;
                    if (i14 == 0) {
                        nVar.f8590b = patternLockResultView.f31042d * 0.5f;
                    } else if (i14 == 1) {
                        nVar.f8590b = patternLockResultView.f31042d * 1.5f;
                    } else if (i14 == 2) {
                        nVar.f8590b = patternLockResultView.f31042d * 2.5f;
                    }
                }
                patternLockResultView.invalidate();
                return;
            case 11:
                WheelView wheelView = (WheelView) this.f905b;
                wheelView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (wheelView.getChildCount() <= 0 || wheelView.f31723a != 0) {
                    return;
                }
                wheelView.f31723a = wheelView.getChildAt(0).getHeight();
                if (wheelView.f31723a == 0) {
                    throw new P0.c("wheel item is error.", 2, false);
                }
                wheelView.getLayoutParams().height = wheelView.f31723a * wheelView.f31724b;
                int firstVisiblePosition = wheelView.getFirstVisiblePosition();
                int currentPosition = wheelView.getCurrentPosition();
                int i15 = wheelView.f31724b;
                wheelView.g(firstVisiblePosition, (i15 / 2) + currentPosition, i15 / 2);
                dc.a aVar = wheelView.f31731j;
                int width = wheelView.getWidth();
                int i16 = wheelView.f31723a;
                int i17 = wheelView.f31724b;
                int i18 = i16 * i17;
                dc.b bVar = wheelView.f31732o;
                if (aVar.equals(dc.a.f35860a)) {
                    p027bc.a aVar2 = new p027bc.a(width, i18, bVar);
                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    int[] iArr = p027bc.a.f18830n;
                    aVar2.f18831f = new GradientDrawable(orientation, iArr);
                    aVar2.f18832g = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                    aVar2.f18837l = i17;
                    aVar2.f18838m = i16;
                    Paint paint = new Paint();
                    aVar2.f18833h = paint;
                    int i19 = ((dc.b) aVar2.f18847e).f35864a;
                    if (i19 == -1) {
                        i19 = p011ac.a.f11867a;
                    }
                    paint.setColor(i19);
                    Paint paint2 = new Paint();
                    aVar2.f18834i = paint2;
                    paint2.setColor(p011ac.a.f11869c);
                    Paint paint3 = new Paint();
                    aVar2.f18835j = paint3;
                    paint3.setColor(p011ac.a.f11870d);
                    aVar2.f18835j.setStrokeWidth(2.0f);
                    Paint paint4 = new Paint();
                    aVar2.f18836k = paint4;
                    paint4.setStrokeWidth(6.0f);
                    aVar2.f18836k.setColor(p011ac.a.f11871e);
                    cVar = aVar2;
                } else if (aVar.equals(dc.a.f35861b)) {
                    p027bc.b bVar2 = new p027bc.b(width, i18, bVar);
                    bVar2.f18841h = i17;
                    bVar2.f18842i = i16;
                    Paint paint5 = new Paint();
                    bVar2.f18839f = paint5;
                    dc.b bVar3 = (dc.b) bVar2.f18847e;
                    int i20 = bVar3.f35864a;
                    if (i20 == -1) {
                        i20 = -1;
                    }
                    paint5.setColor(i20);
                    Paint paint6 = new Paint();
                    bVar2.f18840g = paint6;
                    paint6.setStrokeWidth(3.0f);
                    Paint paint7 = bVar2.f18840g;
                    int i21 = bVar3.f35865b;
                    if (i21 == -1) {
                        i21 = p011ac.a.f11868b;
                    }
                    paint7.setColor(i21);
                    cVar = bVar2;
                } else {
                    cVar = new p027bc.c(width, i18, bVar);
                }
                wheelView.setBackground(cVar);
                return;
            case 12:
                j4.b bVar4 = (j4.b) this.f905b;
                bVar4.getClass();
                int statusBarHeight2 = BarUtils.getStatusBarHeight();
                Rect rect2 = new Rect();
                View view6 = bVar4.f38282a;
                Intrinsics.e(view6);
                view6.getWindowVisibleDisplayFrame(rect2);
                int i22 = (rect2.bottom - rect2.top) + statusBarHeight2;
                if (i22 != bVar4.f38283b) {
                    ViewGroup.LayoutParams layoutParams3 = bVar4.f38284c;
                    Intrinsics.e(layoutParams3);
                    layoutParams3.height = i22;
                    view6.requestLayout();
                    bVar4.f38283b = i22;
                    return;
                }
                return;
            case 13:
                CashierCouponListDialog cashierCouponListDialog = (CashierCouponListDialog) this.f905b;
                Window window7 = cashierCouponListDialog.getWindow();
                WindowManager.LayoutParams attributes6 = window7 != null ? window7.getAttributes() : null;
                int screenHeight8 = (int) (ScreenUtils.getScreenHeight() * 0.7f);
                if (attributes6 != null) {
                    attributes6.height = screenHeight8;
                }
                if (window7 != null) {
                    window7.setAttributes(attributes6);
                }
                p142ja.b bVar5 = cashierCouponListDialog.binding;
                if (bVar5 == null || (relativeLayout = bVar5.f38454g) == null || (viewTreeObserver7 = relativeLayout.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver7.removeOnGlobalLayoutListener(this);
                return;
            case 14:
                CoreSelectCouponForPaymentDialog coreSelectCouponForPaymentDialog = (CoreSelectCouponForPaymentDialog) this.f905b;
                Window window8 = coreSelectCouponForPaymentDialog.getWindow();
                WindowManager.LayoutParams attributes7 = window8.getAttributes();
                attributes7.height = (int) (ScreenUtils.getScreenHeight() * 0.7f);
                window8.setAttributes(attributes7);
                coreSelectCouponForPaymentDialog.mViewRoot.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            case 15:
                SelectBankDialog selectBankDialog = (SelectBankDialog) this.f905b;
                Window window9 = selectBankDialog.getWindow();
                WindowManager.LayoutParams attributes8 = window9.getAttributes();
                int screenHeight9 = (int) (ScreenUtils.getScreenHeight() * 0.7f);
                int height3 = selectBankDialog.mViewRoot.getHeight();
                if (height3 <= screenHeight9) {
                    screenHeight9 = height3;
                }
                attributes8.height = screenHeight9;
                window9.setAttributes(attributes8);
                selectBankDialog.mViewRoot.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            case 16:
                SelectBankDialogV2 selectBankDialogV2 = (SelectBankDialogV2) this.f905b;
                Window window10 = selectBankDialogV2.getWindow();
                WindowManager.LayoutParams attributes9 = window10.getAttributes();
                int screenHeight10 = (int) (ScreenUtils.getScreenHeight() * 0.7f);
                int height4 = selectBankDialogV2.mViewRoot.getHeight();
                if (height4 <= screenHeight10) {
                    screenHeight10 = height4;
                }
                attributes9.height = screenHeight10;
                window10.setAttributes(attributes9);
                selectBankDialogV2.mViewRoot.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            case 17:
                SelectBillTypeDialog selectBillTypeDialog = (SelectBillTypeDialog) this.f905b;
                Window window11 = selectBillTypeDialog.getWindow();
                WindowManager.LayoutParams attributes10 = window11.getAttributes();
                int screenHeight11 = (int) (ScreenUtils.getScreenHeight() * 0.7f);
                int height5 = selectBillTypeDialog.mViewRoot.getHeight();
                if (height5 <= screenHeight11) {
                    screenHeight11 = height5;
                }
                attributes10.height = screenHeight11;
                window11.setAttributes(attributes10);
                selectBillTypeDialog.mViewRoot.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            case 18:
                SelectPayMethodDialog selectPayMethodDialog = (SelectPayMethodDialog) this.f905b;
                Window window12 = selectPayMethodDialog.getWindow();
                WindowManager.LayoutParams attributes11 = window12.getAttributes();
                int screenHeight12 = (int) (ScreenUtils.getScreenHeight() * 0.75f);
                selectPayMethodDialog.mViewRoot.getHeight();
                attributes11.height = screenHeight12;
                window12.setAttributes(attributes11);
                selectPayMethodDialog.mViewRoot.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            case 19:
                mh.i iVar2 = (mh.i) this.f905b;
                Window window13 = iVar2.getWindow();
                WindowManager.LayoutParams attributes12 = window13.getAttributes();
                WindowManager windowManager = (WindowManager) D3.a.f1587c.getSystemService("window");
                if (windowManager == null) {
                    i7 = D3.a.f1587c.getResources().getDisplayMetrics().heightPixels;
                } else {
                    Point point = new Point();
                    windowManager.getDefaultDisplay().getRealSize(point);
                    i7 = point.y;
                }
                int i23 = (int) (i7 * 0.7f);
                int iC = (l.c() * 300) / MessageEvent.EVENT_CL_REPAYMENT_FAILED;
                int height6 = iVar2.f39789c.getHeight();
                if (height6 < iC) {
                    attributes12.height = iC;
                } else if (height6 > i23) {
                    attributes12.height = i23;
                }
                window13.setAttributes(attributes12);
                iVar2.f39789c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            case 20:
                com.transsnet.mtn.sdk.ui.view.wheelview.widget.WheelView wheelView2 = (com.transsnet.mtn.sdk.ui.view.wheelview.widget.WheelView) this.f905b;
                wheelView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (wheelView2.getChildCount() <= 0 || wheelView2.f25760a != 0) {
                    return;
                }
                int height7 = wheelView2.getChildAt(0).getHeight();
                wheelView2.f25760a = height7;
                if (height7 == 0) {
                    throw new P0.c("wheel item is error.", 17, false);
                }
                wheelView2.getLayoutParams().height = wheelView2.f25760a * wheelView2.f25761b;
                int firstVisiblePosition2 = wheelView2.getFirstVisiblePosition();
                int currentPosition2 = wheelView2.getCurrentPosition();
                int i24 = wheelView2.f25761b / 2;
                wheelView2.b(firstVisiblePosition2, currentPosition2 + i24, i24);
                D8.c cVar3 = wheelView2.f25768j;
                int width2 = wheelView2.getWidth();
                int i25 = wheelView2.f25760a;
                int i26 = wheelView2.f25761b;
                int i27 = i25 * i26;
                D8.d dVar = wheelView2.f25769o;
                wheelView2.setBackground(cVar3.equals(D8.c.f1694a) ? new sh.a(width2, i27, dVar, i26, i25) : cVar3.equals(D8.c.f1695b) ? new sh.b(width2, i27, dVar, i26, i25) : new p027bc.c(width2, i27, dVar));
                return;
            case 21:
                FlexiBankWheelView flexiBankWheelView = (FlexiBankWheelView) this.f905b;
                flexiBankWheelView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (flexiBankWheelView.getChildCount() <= 0 || flexiBankWheelView.f22280a != 0) {
                    return;
                }
                int height8 = flexiBankWheelView.getChildAt(0).getHeight();
                flexiBankWheelView.f22280a = height8;
                if (height8 == 0) {
                    throw new P0.c("wheel item is error.", 19, false);
                }
                flexiBankWheelView.getLayoutParams().height = flexiBankWheelView.f22280a * flexiBankWheelView.f22281b;
                int firstVisiblePosition3 = flexiBankWheelView.getFirstVisiblePosition();
                int currentPosition3 = flexiBankWheelView.getCurrentPosition();
                int i28 = flexiBankWheelView.f22281b / 2;
                flexiBankWheelView.e(firstVisiblePosition3, currentPosition3 + i28, i28);
                p334w4.a skin = flexiBankWheelView.skin;
                int width3 = flexiBankWheelView.getWidth();
                int i29 = flexiBankWheelView.f22280a;
                int i30 = flexiBankWheelView.f22281b;
                int i31 = i29 * i30;
                p334w4.b style = flexiBankWheelView.style;
                Intrinsics.checkNotNullParameter(skin, "skin");
                Intrinsics.checkNotNullParameter(style, "style");
                flexiBankWheelView.setBackground(skin == p334w4.a.f43255a ? new p304u4.b(width3, i31, style, i30, i29) : skin == p334w4.a.f43256b ? new p304u4.c(width3, i31, style, i30, i29) : new p027bc.c(width3, i31, style));
                return;
            default:
                p352xc.b bVar6 = (p352xc.b) this.f905b;
                bVar6.c(bVar6.f43843c);
                View view7 = bVar6.f43841a;
                if (view7 == null || (viewTreeObserver8 = view7.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver8.removeOnGlobalLayoutListener(this);
                return;
        }
    }
}
