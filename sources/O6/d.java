package O6;

import L6.i;
import L6.j;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import org.sufficientlysecure.htmltextview.HtmlTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AppCompatImageView f6618A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public String f6619A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f6620B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f6621B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f6622C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public int f6623C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f6624D0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View f6625H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f6626L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public CharSequence f6627M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public CharSequence f6628Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f6629X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f6630Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f6631Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f6632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f6633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HtmlTextView f6634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HtmlTextView f6635g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f6636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f6637j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f6638k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f6639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AppCompatImageView f6640p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View.OnClickListener f6641p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View.OnClickListener f6642q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View.OnClickListener f6643r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f6644s0;
    public AppCompatImageView t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f6645t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f6646u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AppCompatImageView f6647v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Drawable f6648v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AppCompatImageView f6649w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f6650w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Drawable f6651x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f6652y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f6653z0;

    public d(Context context, int i7) {
        super(context, i7);
        this.f6628Q = null;
        this.f6629X = null;
        this.f6645t0 = -1;
        this.f6646u0 = -1;
        this.f6648v0 = null;
        this.f6651x0 = null;
        this.f6623C0 = 1;
        this.f6624D0 = i.ppDefaultDialogTheme;
    }

    public static void e(int i7, View view) {
        if (view == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i7;
        view.setLayoutParams(marginLayoutParams);
    }

    public static CharSequence f(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            int length = charSequence.length();
            int i7 = 0;
            while (i7 < length && Character.isWhitespace(charSequence.charAt(i7))) {
                i7++;
            }
            while (length > i7 && Character.isWhitespace(charSequence.charAt(length - 1))) {
                length--;
            }
            if (i7 == 0 && length == charSequence.length()) {
                return charSequence;
            }
            return charSequence instanceof Spanned ? new SpannableStringBuilder(charSequence).subSequence(i7, length) : charSequence.subSequence(i7, length);
        } catch (Exception unused) {
            return charSequence;
        }
    }

    @Override // O6.a
    public final void a(Context context) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        this.f6590a = context;
        if (getWindow() != null) {
            getWindow().setDimAmount(0.6f);
        }
        int i7 = this.f6623C0;
        if (i7 == 2 || i7 == 4) {
            ViewStub viewStub = (ViewStub) findViewById(L6.f.verticalButtonStub);
            if (viewStub != null) {
                viewStub.inflate();
            }
        } else {
            ViewStub viewStub2 = (ViewStub) findViewById(L6.f.horizontalButtonStub);
            if (viewStub2 != null) {
                viewStub2.inflate();
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f6621B0);
        boolean z3 = zIsEmpty && !TextUtils.isEmpty(this.f6619A0);
        if (!TextUtils.isEmpty(this.f6653z0) && this.f6645t0 <= 0 && this.f6648v0 == null && TextUtils.isEmpty(this.f6650w0)) {
            c();
        }
        this.f6634f = (HtmlTextView) findViewById(L6.f.tv_title);
        if (d() && TextUtils.isEmpty(this.f6653z0) && !z3) {
            this.f6634f = (HtmlTextView) findViewById(L6.f.tv_title_2);
        }
        this.f6635g = (HtmlTextView) findViewById(L6.f.tv_message);
        this.f6636i = (TextView) findViewById(L6.f.tv_confirm);
        this.f6637j = (TextView) findViewById(L6.f.tv_cancel);
        this.f6620B = findViewById(L6.f.view_gap);
        this.f6622C = findViewById(L6.f.layout_btn_container);
        this.f6639o = (ImageView) findViewById(L6.f.iv_close);
        this.f6640p = (AppCompatImageView) findViewById(L6.f.iv_icon);
        this.t = null;
        this.f6647v = null;
        this.f6633e = (LinearLayout) findViewById(L6.f.viewContainer);
        this.f6625H = findViewById(L6.f.viewRoot);
        ViewStub viewStub3 = (ViewStub) findViewById(L6.f.topHeaderBgStub);
        if (!zIsEmpty && viewStub3 != null) {
            viewStub3.inflate();
            this.f6649w = (AppCompatImageView) findViewById(L6.f.ivTopHeaderBg);
        }
        ViewStub viewStub4 = (ViewStub) findViewById(L6.f.topHeaderIconStub);
        if (z3 && viewStub4 != null) {
            viewStub4.inflate();
            this.f6618A = (AppCompatImageView) findViewById(L6.f.ivTopHeader);
        }
        if (this.f6646u0 > 0 || this.f6651x0 != null || !TextUtils.isEmpty(this.f6652y0)) {
            b();
        }
        View view = this.f6625H;
        if (view != null) {
            if (zIsEmpty && z3) {
                e(context.getResources().getDimensionPixelSize(L6.c.ppDialogHeaderIconHalfHeight), view);
            } else {
                e(-p059e1.a.j(context, 24.0f), view);
            }
            if (z3) {
                e(context.getResources().getDimensionPixelSize(L6.c.ppDialogHeaderIconBottomMargin), this.f6634f);
            }
        }
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.getTheme().obtainStyledAttributes(this.f6624D0, j.ppDialogStyle);
        this.f6634f.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ppDialogStyle_dialog_title_text_size, context2.getResources().getDimensionPixelSize(L6.c.ppDialogTitleTextSize)));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(j.ppDialogStyle_dialog_positive_button_bg);
        if (drawable != null) {
            this.f6636i.setBackground(drawable);
        }
        this.f6636i.setTextColor(typedArrayObtainStyledAttributes.getColor(j.ppDialogStyle_dialog_positive_button_text_color, context2.getColor(R.color.white)));
        if (typedArrayObtainStyledAttributes.hasValue(j.ppDialogStyle_dialog_negative_button_bg)) {
            this.f6637j.setBackground(typedArrayObtainStyledAttributes.getDrawable(j.ppDialogStyle_dialog_negative_button_bg));
        }
        this.f6637j.setTextColor(typedArrayObtainStyledAttributes.getColor(j.ppDialogStyle_dialog_negative_button_text_color, context2.getColor(L6.b.ppColorPrimary)));
        this.f6635g.setTextColor(typedArrayObtainStyledAttributes.getColor(j.ppDialogStyle_dialog_message_text_color, context2.getColor(L6.b.ppColorTextNormal)));
        this.f6635g.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ppDialogStyle_dialog_message_text_size, context2.getResources().getDimensionPixelSize(L6.c.ppDialogMessageTextSize)));
        typedArrayObtainStyledAttributes.recycle();
        this.f6639o.setImageDrawable(p059e1.a.h(context, S6.a.pay_Close, null, context.getColor(L6.b.ppColorTextAssist), 20.0f));
        final int i10 = 0;
        this.f6639o.setOnClickListener(new View.OnClickListener(this) { // from class: O6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6594b;

            {
                this.f6594b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        d dVar = this.f6594b;
                        View.OnClickListener onClickListener = dVar.f6643r0;
                        if (onClickListener != null) {
                            onClickListener.onClick(view2);
                        }
                        dVar.dismiss();
                        break;
                    case 1:
                        d dVar2 = this.f6594b;
                        View.OnClickListener onClickListener2 = dVar2.f6641p0;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(view2);
                        }
                        dVar2.dismiss();
                        break;
                    default:
                        d dVar3 = this.f6594b;
                        View.OnClickListener onClickListener3 = dVar3.f6642q0;
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(view2);
                        }
                        dVar3.dismiss();
                        break;
                }
            }
        });
        if (!TextUtils.isEmpty(this.f6629X)) {
            this.f6635g.setVisibility(0);
            this.f6635g.setHtml(this.f6629X);
        } else if (this.f6628Q != null) {
            this.f6635g.setVisibility(0);
            this.f6635g.setText(this.f6628Q);
        } else {
            this.f6635g.setVisibility(8);
        }
        if (this.f6630Y == 0) {
            this.f6630Y = 1;
        }
        this.f6635g.setGravity(this.f6630Y);
        if (!TextUtils.isEmpty(this.f6626L)) {
            this.f6634f.setHtml(this.f6626L);
            this.f6634f.setVisibility(0);
        } else if (!TextUtils.isEmpty(this.f6627M)) {
            this.f6634f.setText(this.f6627M);
            this.f6634f.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f6627M) && TextUtils.isEmpty(this.f6626L)) {
            this.f6634f.setVisibility(8);
        }
        View viewFindViewById = findViewById(L6.f.tv_title_2);
        if (viewFindViewById != null && this.f6634f != viewFindViewById) {
            int iJ = p059e1.a.j(context, 32.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            marginLayoutParams.height = iJ;
            viewFindViewById.setLayoutParams(marginLayoutParams);
        }
        this.f6639o.setVisibility(this.f6644s0 ? 4 : 0);
        if (TextUtils.isEmpty(this.f6631Z)) {
            this.f6636i.setVisibility(8);
            View view2 = this.f6620B;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        } else {
            this.f6636i.setVisibility(0);
            this.f6636i.setText(this.f6631Z);
            final int i11 = 1;
            this.f6636i.setOnClickListener(new View.OnClickListener(this) { // from class: O6.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f6594b;

                {
                    this.f6594b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            d dVar = this.f6594b;
                            View.OnClickListener onClickListener = dVar.f6643r0;
                            if (onClickListener != null) {
                                onClickListener.onClick(view3);
                            }
                            dVar.dismiss();
                            break;
                        case 1:
                            d dVar2 = this.f6594b;
                            View.OnClickListener onClickListener2 = dVar2.f6641p0;
                            if (onClickListener2 != null) {
                                onClickListener2.onClick(view3);
                            }
                            dVar2.dismiss();
                            break;
                        default:
                            d dVar3 = this.f6594b;
                            View.OnClickListener onClickListener3 = dVar3.f6642q0;
                            if (onClickListener3 != null) {
                                onClickListener3.onClick(view3);
                            }
                            dVar3.dismiss();
                            break;
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f6638k0)) {
            this.f6637j.setVisibility(8);
            View view3 = this.f6620B;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else {
            this.f6637j.setVisibility(0);
            this.f6637j.setText(this.f6638k0);
            final int i12 = 2;
            this.f6637j.setOnClickListener(new View.OnClickListener(this) { // from class: O6.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f6594b;

                {
                    this.f6594b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    switch (i12) {
                        case 0:
                            d dVar = this.f6594b;
                            View.OnClickListener onClickListener = dVar.f6643r0;
                            if (onClickListener != null) {
                                onClickListener.onClick(view4);
                            }
                            dVar.dismiss();
                            break;
                        case 1:
                            d dVar2 = this.f6594b;
                            View.OnClickListener onClickListener2 = dVar2.f6641p0;
                            if (onClickListener2 != null) {
                                onClickListener2.onClick(view4);
                            }
                            dVar2.dismiss();
                            break;
                        default:
                            d dVar3 = this.f6594b;
                            View.OnClickListener onClickListener3 = dVar3.f6642q0;
                            if (onClickListener3 != null) {
                                onClickListener3.onClick(view4);
                            }
                            dVar3.dismiss();
                            break;
                    }
                }
            });
        }
        if (TextUtils.isEmpty(this.f6631Z) && TextUtils.isEmpty(this.f6638k0)) {
            this.f6622C.setVisibility(8);
        }
        if (this.f6645t0 > 0) {
            this.f6640p.setVisibility(0);
            this.f6640p.setImageResource(this.f6645t0);
            if (d()) {
                e(p059e1.a.j(context, 8.0f), this.f6640p);
            }
        } else if (this.f6648v0 != null) {
            this.f6640p.setVisibility(0);
            this.f6640p.setImageDrawable(this.f6648v0);
            if (d()) {
                e(p059e1.a.j(context, 8.0f), this.f6640p);
            }
        } else if (TextUtils.isEmpty(this.f6650w0)) {
            this.f6640p.setVisibility(8);
        } else {
            this.f6640p.setVisibility(0);
            p059e1.a.N(this.f6590a, this.f6650w0, this.f6640p, 0);
            if (d()) {
                e(p059e1.a.j(context, 8.0f), this.f6640p);
            }
        }
        if (TextUtils.isEmpty(this.f6653z0) || this.f6645t0 > 0 || this.f6648v0 != null || !TextUtils.isEmpty(this.f6650w0)) {
            AppCompatImageView appCompatImageView = this.f6647v;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
        } else {
            if (this.f6647v == null) {
                c();
            }
            if (this.f6647v != null) {
                if (!TextUtils.isEmpty(this.f6653z0)) {
                    this.f6647v.setVisibility(0);
                    p059e1.a.N(this.f6590a, this.f6653z0, this.f6647v, p059e1.a.y(this.f6590a));
                }
                e(p059e1.a.j(this.f6590a, 16.0f), this.f6634f);
            }
        }
        if (this.f6646u0 <= 0 && this.f6651x0 == null && TextUtils.isEmpty(this.f6652y0)) {
            AppCompatImageView appCompatImageView2 = this.t;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(8);
            }
        } else {
            if (this.t == null) {
                b();
            }
            AppCompatImageView appCompatImageView3 = this.t;
            if (appCompatImageView3 != null) {
                if (this.f6646u0 > 0) {
                    appCompatImageView3.setVisibility(0);
                    this.t.setImageResource(this.f6646u0);
                } else if (this.f6651x0 != null) {
                    appCompatImageView3.setVisibility(0);
                    this.t.setImageDrawable(this.f6651x0);
                } else if (!TextUtils.isEmpty(this.f6652y0)) {
                    this.t.setVisibility(0);
                    p059e1.a.N(this.f6590a, this.f6652y0, this.t, p059e1.a.y(this.f6590a));
                }
            }
        }
        AppCompatImageView appCompatImageView4 = this.f6649w;
        if (appCompatImageView4 != null) {
            if (zIsEmpty) {
                appCompatImageView4.setVisibility(8);
            } else if (!TextUtils.isEmpty(this.f6621B0)) {
                this.f6649w.setVisibility(0);
                p059e1.a.y(this.f6590a);
                p059e1.a.N(this.f6590a, this.f6621B0, this.f6649w, 0);
            }
        }
        AppCompatImageView appCompatImageView5 = this.f6618A;
        if (appCompatImageView5 != null) {
            if (!z3) {
                appCompatImageView5.setVisibility(8);
            } else if (!TextUtils.isEmpty(this.f6619A0)) {
                this.f6618A.setVisibility(0);
                p059e1.a.N(this.f6590a, this.f6619A0, this.f6618A, p059e1.a.y(this.f6590a));
            }
        }
        View view4 = this.f6632d;
        if (view4 != null && (linearLayout2 = this.f6633e) != null) {
            linearLayout2.addView(view4, 0, new LinearLayout.LayoutParams(-1, -2));
            AppCompatImageView appCompatImageView6 = this.t;
            if (appCompatImageView6 != null) {
                appCompatImageView6.setVisibility(8);
            }
        }
        if (this.f6632d != null || (linearLayout = this.f6633e) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final void b() {
        ViewStub viewStub;
        if (this.t != null) {
            return;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(L6.f.iv_big_icon);
        this.t = appCompatImageView;
        if (appCompatImageView == null && (viewStub = (ViewStub) findViewById(L6.f.bigIconStub)) != null) {
            viewStub.inflate();
            this.t = (AppCompatImageView) findViewById(L6.f.iv_big_icon);
        }
    }

    public final void c() {
        ViewStub viewStub;
        if (this.f6647v != null) {
            return;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(L6.f.ivSecondHeader);
        this.f6647v = appCompatImageView;
        if (appCompatImageView == null && (viewStub = (ViewStub) findViewById(L6.f.secondHeaderStub)) != null) {
            viewStub.inflate();
            this.f6647v = (AppCompatImageView) findViewById(L6.f.ivSecondHeader);
        }
    }

    public final boolean d() {
        int i7 = this.f6623C0;
        return i7 == 3 || i7 == 4;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z3) {
        super.setCancelable(z3);
        this.f6644s0 = !z3;
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f6627M = charSequence;
    }

    @Override // O6.f, android.app.Dialog
    public final void show() {
        Context context = this.f6590a;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        super.show();
        int i7 = this.f6623C0;
        if (i7 == 3 || i7 == 4) {
            showAtBottom(getWindow());
        }
    }
}
