package com.skydoves.balloon;

import Bc.i;
import C0.G;
import Db.ViewOnClickListenerC0188e;
import G7.f;
import G7.g;
import G7.h;
import G7.k;
import G7.l;
import G7.m;
import G7.q;
import G7.x;
import G7.y;
import G7.z;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.camera2.internal.F;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.C;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p059e1.a;
import p234p9.b;
import p234p9.c;
import p234p9.d;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/skydoves/balloon/Balloon;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "G7/g", "lib_ballon_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Balloon implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f25223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f25224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PopupWindow f25225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PopupWindow f25226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25228g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f25229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f25230j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f25231o;

    /* JADX WARN: Multi-variable type inference failed */
    public Balloon(Context context, g gVar) {
        AbstractC1205o lifecycle;
        int i7 = 1;
        int i10 = 0;
        this.f25222a = context;
        this.f25223b = gVar;
        View viewInflate = LayoutInflater.from(context).inflate(c.balloon_layout_body, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i11 = b.balloon_arrow;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a.m(i11, viewInflate);
        if (appCompatImageView != null) {
            i11 = b.balloon_card;
            RadiusLayout radiusLayout = (RadiusLayout) a.m(i11, viewInflate);
            if (radiusLayout != null) {
                i11 = b.balloon_content;
                FrameLayout frameLayout2 = (FrameLayout) a.m(i11, viewInflate);
                if (frameLayout2 != null) {
                    i11 = b.balloon_text;
                    VectorTextView vectorTextView = (VectorTextView) a.m(i11, viewInflate);
                    if (vectorTextView != null) {
                        i11 = b.balloon_wrapper;
                        FrameLayout frameLayout3 = (FrameLayout) a.m(i11, viewInflate);
                        if (frameLayout3 != null) {
                            i iVar = new i((ViewGroup) frameLayout, (View) frameLayout, (View) appCompatImageView, (ViewGroup) radiusLayout, (View) frameLayout2, (TextView) vectorTextView, (View) frameLayout3, 19);
                            Intrinsics.checkNotNullExpressionValue(iVar, "inflate(LayoutInflater.from(context), null, false)");
                            this.f25224c = iVar;
                            View viewInflate2 = LayoutInflater.from(context).inflate(c.balloon_layout_overlay, (ViewGroup) null, false);
                            if (viewInflate2 == null) {
                                throw new NullPointerException("rootView");
                            }
                            BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) viewInflate2;
                            Intrinsics.checkNotNullExpressionValue(new p251q9.a(balloonAnchorOverlayView, balloonAnchorOverlayView), "inflate(LayoutInflater.from(context), null, false)");
                            PopupWindow popupWindow = new PopupWindow(frameLayout, -2, -2);
                            this.f25225d = popupWindow;
                            this.f25226e = new PopupWindow(balloonAnchorOverlayView, -1, -1);
                            gVar.getClass();
                            EnumC2132k enumC2132k = EnumC2132k.f43971c;
                            this.f25229i = C2131j.a(enumC2132k, l.f3123a);
                            this.f25230j = C2131j.a(enumC2132k, new G7.i(this, i10));
                            this.f25231o = C2131j.a(enumC2132k, new G7.i(this, i7));
                            radiusLayout.setAlpha(gVar.f3066E);
                            radiusLayout.setRadius(gVar.f3108u);
                            float f10 = gVar.f3067F;
                            WeakHashMap weakHashMap = N.f16168a;
                            E.l(radiusLayout, f10);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(gVar.t);
                            gradientDrawable.setCornerRadius(gVar.f3108u);
                            radiusLayout.setBackground(gradientDrawable);
                            radiusLayout.setPadding(gVar.f3094f, gVar.f3095g, gVar.f3096h, gVar.f3097i);
                            ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, gVar.f3098j, 0);
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.setFocusable(gVar.f3084W);
                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                            popupWindow.setElevation(gVar.f3067F);
                            popupWindow.setAttachedInDecor(gVar.f3086Y);
                            gVar.getClass();
                            View view = gVar.f3068G;
                            if (!(view != null)) {
                                Intrinsics.checkNotNullExpressionValue(vectorTextView, "");
                                Context context2 = vectorTextView.getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "context");
                                Intrinsics.checkNotNullParameter(context2, "context");
                                x xVar = new x();
                                xVar.f3147a = y.f3153a;
                                float f11 = 28;
                                xVar.f3148b = G.b(1, f11);
                                xVar.f3149c = G.b(1, f11);
                                Nf.b.b(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
                                xVar.f3152f = "";
                                xVar.f3148b = gVar.f3062A;
                                xVar.f3149c = gVar.f3063B;
                                xVar.f3151e = gVar.f3065D;
                                xVar.f3150d = gVar.f3064C;
                                y value = gVar.f3113z;
                                Intrinsics.checkNotNullParameter(value, "value");
                                Intrinsics.checkNotNullParameter(value, "<set-?>");
                                xVar.f3147a = value;
                                p166l2.a iconForm = new p166l2.a(xVar);
                                Intrinsics.checkNotNullParameter(vectorTextView, "<this>");
                                Intrinsics.checkNotNullParameter(iconForm, "iconForm");
                                K7.a aVar = vectorTextView.drawableTextViewParams;
                                if (aVar != null) {
                                    aVar.f4957e = gVar.f3082U;
                                    org.chromium.support_lib_boundary.util.b.e(vectorTextView, aVar);
                                }
                                Intrinsics.checkNotNullExpressionValue(vectorTextView, "");
                                Context context3 = vectorTextView.getContext();
                                Intrinsics.checkNotNullExpressionValue(context3, "context");
                                Intrinsics.checkNotNullParameter(context3, "context");
                                z zVar = new z();
                                zVar.f3155a = "";
                                zVar.f3156b = 12.0f;
                                zVar.f3157c = -1;
                                zVar.f3158d = 17;
                                String value2 = gVar.f3109v;
                                Intrinsics.checkNotNullParameter(value2, "value");
                                Intrinsics.checkNotNullParameter(value2, "<set-?>");
                                zVar.f3155a = value2;
                                zVar.f3156b = gVar.f3111x;
                                zVar.f3157c = gVar.f3110w;
                                zVar.f3158d = gVar.f3112y;
                                vectorTextView.setMovementMethod(null);
                                z textForm = new z();
                                textForm.f3155a = zVar.f3155a;
                                textForm.f3156b = zVar.f3156b;
                                textForm.f3157c = zVar.f3157c;
                                textForm.f3158d = zVar.f3158d;
                                Intrinsics.checkNotNullParameter(vectorTextView, "<this>");
                                Intrinsics.checkNotNullParameter(textForm, "textForm");
                                vectorTextView.setText(textForm.f3155a);
                                vectorTextView.setTextSize(textForm.f3156b);
                                vectorTextView.setGravity(textForm.f3158d);
                                vectorTextView.setTextColor(textForm.f3157c);
                                vectorTextView.setTypeface(vectorTextView.getTypeface(), 0);
                                Intrinsics.checkNotNullExpressionValue(vectorTextView, "this");
                                Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
                                l(vectorTextView, radiusLayout);
                            } else {
                                if (view == null) {
                                    throw new IllegalArgumentException("The custom layout is null.");
                                }
                                ViewParent parent = view.getParent();
                                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                if (viewGroup != null) {
                                    viewGroup.removeView(view);
                                }
                                radiusLayout.removeAllViews();
                                radiusLayout.addView(view);
                                Intrinsics.checkNotNullExpressionValue(radiusLayout, "binding.balloonCard");
                                m(radiusLayout);
                            }
                            k();
                            frameLayout3.setOnClickListener(new A8.c(24, gVar.f3069H, this));
                            int i12 = 0;
                            popupWindow.setOnDismissListener(new f(this, i12));
                            popupWindow.setTouchInterceptor(new m(this, i12));
                            balloonAnchorOverlayView.setOnClickListener(new ViewOnClickListenerC0188e(this, 1));
                            Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.root");
                            d(frameLayout);
                            LifecycleOwner lifecycleOwner = gVar.f3076O;
                            if (lifecycleOwner == null && (context instanceof LifecycleOwner)) {
                                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) context;
                                gVar.f3076O = lifecycleOwner2;
                                lifecycleOwner2.getLifecycle().a(this);
                                return;
                            } else {
                                if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                                    return;
                                }
                                lifecycle.a(this);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    public static final void a(Balloon balloon) {
        g gVar = balloon.f25223b;
        int i7 = gVar.f3077P;
        PopupWindow popupWindow = balloon.f25225d;
        if (i7 != Integer.MIN_VALUE) {
            popupWindow.setAnimationStyle(i7);
            return;
        }
        int iOrdinal = gVar.f3079R.ordinal();
        if (iOrdinal == 0) {
            popupWindow.setAnimationStyle(d.Balloon_Normal_Anim);
            return;
        }
        if (iOrdinal == 1) {
            popupWindow.setAnimationStyle(d.Balloon_Elastic_Anim);
            return;
        }
        if (iOrdinal == 2) {
            popupWindow.setAnimationStyle(d.Balloon_Fade_Anim);
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                return;
            }
            popupWindow.setAnimationStyle(d.Balloon_Overshoot_Anim);
            return;
        }
        View contentView = popupWindow.getContentView();
        Intrinsics.checkNotNullExpressionValue(contentView, "bodyWindow.contentView");
        Intrinsics.checkNotNullParameter(contentView, "<this>");
        contentView.setVisibility(4);
        contentView.post(new H7.a(0, gVar.f3080S, contentView));
        popupWindow.setAnimationStyle(d.Balloon_Normal_Dispose_Anim);
    }

    public static final void b(Balloon balloon) {
        g gVar = balloon.f25223b;
        int i7 = gVar.f3078Q;
        PopupWindow popupWindow = balloon.f25226e;
        if (i7 != Integer.MIN_VALUE) {
            popupWindow.setAnimationStyle(gVar.f3077P);
        } else if (h.f3114a[F.i(gVar.f3089a0)] == 1) {
            popupWindow.setAnimationStyle(d.Balloon_Fade_Anim);
        } else {
            popupWindow.setAnimationStyle(d.Balloon_Normal_Anim);
        }
    }

    public static final void c(View view, Balloon balloon) {
        i iVar = balloon.f25224c;
        AppCompatImageView appCompatImageView = (AppCompatImageView) iVar.f727e;
        g gVar = balloon.f25223b;
        int i7 = gVar.f3101m;
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
        appCompatImageView.setAlpha(gVar.f3066E);
        Drawable drawable = gVar.f3105q;
        if (drawable != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
        appCompatImageView.setPadding(0, gVar.f3106r, 0, 0);
        int i10 = gVar.f3100l;
        if (i10 != Integer.MIN_VALUE) {
            appCompatImageView.setImageTintList(ColorStateList.valueOf(i10));
        } else {
            appCompatImageView.setImageTintList(ColorStateList.valueOf(gVar.t));
        }
        appCompatImageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        ((RadiusLayout) iVar.f725c).post(new Da.h(balloon, 3, view, appCompatImageView));
    }

    public static void d(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        IntRange intRangeF = kotlin.ranges.b.f(0, viewGroup.getChildCount());
        ArrayList<View> arrayList = new ArrayList(r.l(intRangeF, 10));
        Iterator it = intRangeF.iterator();
        while (((Rf.b) it).f8613c) {
            arrayList.add(viewGroup.getChildAt(((C) it).a()));
        }
        for (View view : arrayList) {
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                d((ViewGroup) view);
            }
        }
    }

    public final boolean e(View view) {
        if (this.f25227f || this.f25228g) {
            return false;
        }
        Context context = this.f25222a;
        if (((context instanceof Activity) && ((Activity) context).isFinishing()) || this.f25225d.getContentView().getParent() != null) {
            return false;
        }
        WeakHashMap weakHashMap = N.f16168a;
        return view.isAttachedToWindow();
    }

    public final void f() {
        if (this.f25227f) {
            G7.i iVar = new G7.i(this, 2);
            g gVar = this.f25223b;
            if (gVar.f3079R != q.f3136b) {
                iVar.invoke();
                return;
            }
            View contentView = this.f25225d.getContentView();
            Intrinsics.checkNotNullExpressionValue(contentView, "this.bodyWindow.contentView");
            contentView.post(new k(contentView, gVar.f3080S, iVar));
        }
    }

    public final float g(View view) {
        i iVar = this.f25224c;
        FrameLayout frameLayout = (FrameLayout) iVar.f728f;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.balloonContent");
        int i7 = p264r5.a.w(frameLayout).x;
        int i10 = p264r5.a.w(view).x;
        g gVar = this.f25223b;
        float f10 = 0;
        float f11 = (gVar.f3101m * gVar.f3107s) + f10;
        float fJ = ((j() - f11) - gVar.f3098j) - f10;
        int iOrdinal = gVar.f3103o.ordinal();
        if (iOrdinal == 0) {
            return (((FrameLayout) iVar.f730i).getWidth() * gVar.f3102n) - (gVar.f3101m * 0.5f);
        }
        if (iOrdinal != 1) {
            throw new p355xf.l();
        }
        if (view.getWidth() + i10 >= i7) {
            if (j() + i7 >= i10) {
                float width = (((view.getWidth() * gVar.f3102n) + i10) - i7) - (gVar.f3101m * 0.5f);
                if (width > gVar.f3101m * 2) {
                    if (width <= j() - (gVar.f3101m * 2)) {
                        return width;
                    }
                }
            }
            return fJ;
        }
        return f11;
    }

    public final float h(View view) {
        int i7;
        g gVar = this.f25223b;
        boolean z3 = gVar.f3085X;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Rect rect = new Rect();
        Context context = view.getContext();
        if ((context instanceof Activity) && z3) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i7 = rect.top;
        } else {
            i7 = 0;
        }
        i iVar = this.f25224c;
        FrameLayout frameLayout = (FrameLayout) iVar.f728f;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.balloonContent");
        int i10 = p264r5.a.w(frameLayout).y - i7;
        int i11 = p264r5.a.w(view).y - i7;
        float f10 = 0;
        float f11 = (gVar.f3101m * gVar.f3107s) + f10;
        float fI = ((i() - f11) - f10) - f10;
        int i12 = gVar.f3101m / 2;
        int iOrdinal = gVar.f3103o.ordinal();
        if (iOrdinal == 0) {
            return (((FrameLayout) iVar.f730i).getHeight() * gVar.f3102n) - i12;
        }
        if (iOrdinal != 1) {
            throw new p355xf.l();
        }
        if (view.getHeight() + i11 >= i10) {
            if (i() + i10 >= i11) {
                float height = (((view.getHeight() * gVar.f3102n) + i11) - i10) - i12;
                if (height > gVar.f3101m * 2) {
                    if (height <= i() - (gVar.f3101m * 2)) {
                        return height;
                    }
                }
            }
            return fI;
        }
        return f11;
    }

    public final int i() {
        int i7 = this.f25223b.f3093e;
        return i7 != Integer.MIN_VALUE ? i7 : ((FrameLayout) this.f25224c.f724b).getMeasuredHeight();
    }

    public final int j() {
        int i7 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        g gVar = this.f25223b;
        float f10 = gVar.f3092d;
        if (f10 != 0.0f) {
            return (int) (i7 * f10);
        }
        gVar.getClass();
        gVar.getClass();
        int i10 = gVar.f3090b;
        if (i10 != Integer.MIN_VALUE) {
            return i10 > i7 ? i7 : i10;
        }
        int measuredWidth = ((FrameLayout) this.f25224c.f724b).getMeasuredWidth();
        gVar.getClass();
        return kotlin.ranges.b.c(measuredWidth, 0, gVar.f3091c);
    }

    public final void k() {
        g gVar = this.f25223b;
        int i7 = gVar.f3101m - 1;
        int i10 = (int) gVar.f3067F;
        FrameLayout frameLayout = (FrameLayout) this.f25224c.f728f;
        int iOrdinal = gVar.f3104p.ordinal();
        if (iOrdinal == 0) {
            frameLayout.setPadding(i10, i7, i10, i7 < i10 ? i10 : i7);
            return;
        }
        if (iOrdinal == 1) {
            frameLayout.setPadding(i10, i7, i10, i7 < i10 ? i10 : i7);
        } else if (iOrdinal == 2) {
            frameLayout.setPadding(i7, i10, i7, i10);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            frameLayout.setPadding(i7, i10, i7, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    public final void l(TextView textView, View view) {
        int intrinsicWidth;
        int compoundPaddingStart;
        int compoundPaddingEnd;
        int i7;
        g gVar;
        int i10;
        int i11;
        float f10;
        int i12;
        int iMeasureText = (int) textView.getPaint().measureText(textView.getText().toString());
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "compoundDrawablesRelative");
        Intrinsics.checkNotNullParameter(compoundDrawablesRelative, "<this>");
        if (compoundDrawablesRelative[0] == null && compoundDrawablesRelative[2] == null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            Intrinsics.checkNotNullExpressionValue(compoundDrawables, "compoundDrawables");
            Intrinsics.checkNotNullParameter(compoundDrawables, "<this>");
            if (compoundDrawables[0] != null || compoundDrawables[2] != null) {
                Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                Intrinsics.checkNotNullExpressionValue(compoundDrawables2, "compoundDrawables");
                Intrinsics.checkNotNullParameter(compoundDrawables2, "<this>");
                Drawable drawable = compoundDrawables2[0];
                int intrinsicHeight = drawable == null ? 0 : drawable.getIntrinsicHeight();
                Drawable drawable2 = compoundDrawables2[2];
                int intrinsicHeight2 = drawable2 == null ? 0 : drawable2.getIntrinsicHeight();
                if (intrinsicHeight < intrinsicHeight2) {
                    intrinsicHeight = intrinsicHeight2;
                }
                textView.setMinHeight(intrinsicHeight);
                Drawable[] compoundDrawables3 = textView.getCompoundDrawables();
                Intrinsics.checkNotNullExpressionValue(compoundDrawables3, "compoundDrawables");
                Intrinsics.checkNotNullParameter(compoundDrawables3, "<this>");
                Drawable drawable3 = compoundDrawables3[0];
                int intrinsicWidth2 = drawable3 == null ? 0 : drawable3.getIntrinsicWidth();
                Drawable drawable4 = compoundDrawables3[2];
                intrinsicWidth = (drawable4 != null ? drawable4.getIntrinsicWidth() : 0) + intrinsicWidth2;
                compoundPaddingStart = textView.getCompoundPaddingStart();
                compoundPaddingEnd = textView.getCompoundPaddingEnd();
            }
            i7 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            gVar = this.f25223b;
            gVar.getClass();
            i10 = (gVar.f3101m * 2) + gVar.f3098j + paddingRight;
            i11 = gVar.f3091c - i10;
            f10 = gVar.f3092d;
            if (f10 == 0.0f) {
                i12 = gVar.f3090b;
                if (i12 == Integer.MIN_VALUE && i12 <= i7) {
                    iMeasureText = i12 - i10;
                } else if (iMeasureText > i11) {
                    iMeasureText = i11;
                }
            } else {
                iMeasureText = ((int) (i7 * f10)) - i10;
            }
            textView.setMaxWidth(iMeasureText);
        }
        Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative2, "compoundDrawablesRelative");
        Intrinsics.checkNotNullParameter(compoundDrawablesRelative2, "<this>");
        Drawable drawable5 = compoundDrawablesRelative2[0];
        int intrinsicHeight3 = drawable5 == null ? 0 : drawable5.getIntrinsicHeight();
        Drawable drawable6 = compoundDrawablesRelative2[2];
        int intrinsicHeight4 = drawable6 == null ? 0 : drawable6.getIntrinsicHeight();
        if (intrinsicHeight3 < intrinsicHeight4) {
            intrinsicHeight3 = intrinsicHeight4;
        }
        textView.setMinHeight(intrinsicHeight3);
        Drawable[] compoundDrawablesRelative3 = textView.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative3, "compoundDrawablesRelative");
        Intrinsics.checkNotNullParameter(compoundDrawablesRelative3, "<this>");
        Drawable drawable7 = compoundDrawablesRelative3[0];
        int intrinsicWidth3 = drawable7 == null ? 0 : drawable7.getIntrinsicWidth();
        Drawable drawable8 = compoundDrawablesRelative3[2];
        intrinsicWidth = (drawable8 != null ? drawable8.getIntrinsicWidth() : 0) + intrinsicWidth3;
        compoundPaddingStart = textView.getCompoundPaddingStart();
        compoundPaddingEnd = textView.getCompoundPaddingEnd();
        iMeasureText += compoundPaddingEnd + compoundPaddingStart + intrinsicWidth;
        i7 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        int paddingRight2 = view.getPaddingRight() + view.getPaddingLeft();
        gVar = this.f25223b;
        gVar.getClass();
        i10 = (gVar.f3101m * 2) + gVar.f3098j + paddingRight2;
        i11 = gVar.f3091c - i10;
        f10 = gVar.f3092d;
        if (f10 == 0.0f) {
            i12 = gVar.f3090b;
            if (i12 == Integer.MIN_VALUE) {
                if (iMeasureText > i11) {
                    iMeasureText = i11;
                }
            } else if (iMeasureText > i11) {
                iMeasureText = i11;
            }
        } else {
            iMeasureText = ((int) (i7 * f10)) - i10;
        }
        textView.setMaxWidth(iMeasureText);
    }

    public final void m(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            Intrinsics.d(childAt, "getChildAt(index)");
            if (childAt instanceof TextView) {
                l((TextView) childAt, viewGroup);
            } else if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        AbstractC1205o lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.f25228g = true;
        this.f25226e.dismiss();
        this.f25225d.dismiss();
        LifecycleOwner lifecycleOwner = this.f25223b.f3076O;
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.b(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        if (this.f25223b.f3074M) {
            f();
        }
    }
}
