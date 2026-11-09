package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.appcompat.app.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0834l extends K implements DialogInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0832j f12306a;

    public DialogInterfaceC0834l(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper, b(i7, contextThemeWrapper));
        this.f12306a = new C0832j(getContext(), this, getWindow());
    }

    public static int b(int i7, Context context) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p241q.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.K, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i7;
        int i10;
        View view;
        int i11;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C0832j c0832j = this.f12306a;
        c0832j.f12281b.setContentView(c0832j.f12272J);
        int i12 = p241q.f.parentPanel;
        Window window = c0832j.f12282c;
        View viewFindViewById2 = window.findViewById(i12);
        View viewFindViewById3 = viewFindViewById2.findViewById(p241q.f.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(p241q.f.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(p241q.f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(p241q.f.customPanel);
        View viewInflate = c0832j.f12287h;
        Context context = c0832j.f12280a;
        if (viewInflate == null) {
            viewInflate = c0832j.f12288i != 0 ? LayoutInflater.from(context).inflate(c0832j.f12288i, viewGroup, false) : null;
        }
        boolean z3 = viewInflate != null;
        if (!z3 || !C0832j.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z3) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(p241q.f.custom);
            i7 = 2;
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (c0832j.f12293n) {
                frameLayout.setPadding(c0832j.f12289j, c0832j.f12290k, c0832j.f12291l, c0832j.f12292m);
            }
            if (c0832j.f12286g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            i7 = 2;
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(p241q.f.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(p241q.f.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(p241q.f.buttonPanel);
        ViewGroup viewGroupB = C0832j.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = C0832j.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = C0832j.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(p241q.f.scrollView);
        c0832j.f12263A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0832j.f12263A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        c0832j.f12268F = textView;
        if (textView != null) {
            CharSequence charSequence = c0832j.f12285f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0832j.f12263A.removeView(c0832j.f12268F);
                if (c0832j.f12286g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0832j.f12263A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c0832j.f12263A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c0832j.f12286g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        c0832j.f12294o = button;
        ViewOnClickListenerC0825c viewOnClickListenerC0825c = c0832j.f12279Q;
        button.setOnClickListener(viewOnClickListenerC0825c);
        boolean zIsEmpty = TextUtils.isEmpty(c0832j.f12295p);
        int i13 = c0832j.f12283d;
        if (zIsEmpty && c0832j.f12297r == null) {
            c0832j.f12294o.setVisibility(8);
            i10 = 0;
        } else {
            c0832j.f12294o.setText(c0832j.f12295p);
            Drawable drawable = c0832j.f12297r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i13, i13);
                c0832j.f12294o.setCompoundDrawables(c0832j.f12297r, null, null, null);
            }
            c0832j.f12294o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        c0832j.f12298s = button2;
        button2.setOnClickListener(viewOnClickListenerC0825c);
        if (TextUtils.isEmpty(c0832j.t) && c0832j.f12300v == null) {
            c0832j.f12298s.setVisibility(8);
        } else {
            c0832j.f12298s.setText(c0832j.t);
            Drawable drawable2 = c0832j.f12300v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i13, i13);
                c0832j.f12298s.setCompoundDrawables(c0832j.f12300v, null, null, null);
            }
            c0832j.f12298s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        c0832j.f12301w = button3;
        button3.setOnClickListener(viewOnClickListenerC0825c);
        if (TextUtils.isEmpty(c0832j.f12302x) && c0832j.f12304z == null) {
            c0832j.f12301w.setVisibility(8);
            view = null;
        } else {
            c0832j.f12301w.setText(c0832j.f12302x);
            Drawable drawable3 = c0832j.f12304z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i13, i13);
                view = null;
                c0832j.f12301w.setCompoundDrawables(c0832j.f12304z, null, null, null);
            } else {
                view = null;
            }
            c0832j.f12301w.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p241q.a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data == 0) {
            i11 = i7;
        } else if (i10 == 1) {
            Button button4 = c0832j.f12294o;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button4.setLayoutParams(layoutParams);
            i11 = i7;
        } else {
            i11 = i7;
            if (i10 == i11) {
                Button button5 = c0832j.f12298s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = c0832j.f12301w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (c0832j.f12269G != null) {
            viewGroupB.addView(c0832j.f12269G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(p241q.f.title_template).setVisibility(8);
        } else {
            c0832j.f12266D = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(c0832j.f12284e) || !c0832j.f12277O) {
                window.findViewById(p241q.f.title_template).setVisibility(8);
                c0832j.f12266D.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(p241q.f.alertTitle);
                c0832j.f12267E = textView2;
                textView2.setText(c0832j.f12284e);
                int i14 = c0832j.f12264B;
                if (i14 != 0) {
                    c0832j.f12266D.setImageResource(i14);
                } else {
                    Drawable drawable4 = c0832j.f12265C;
                    if (drawable4 != null) {
                        c0832j.f12266D.setImageDrawable(drawable4);
                    } else {
                        c0832j.f12267E.setPadding(c0832j.f12266D.getPaddingLeft(), c0832j.f12266D.getPaddingTop(), c0832j.f12266D.getPaddingRight(), c0832j.f12266D.getPaddingBottom());
                        c0832j.f12266D.setVisibility(8);
                    }
                }
            }
        }
        boolean z8 = viewGroup.getVisibility() != 8;
        int i15 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z10 = viewGroupB3.getVisibility() != 8;
        if (!z10 && (viewFindViewById = viewGroupB2.findViewById(p241q.f.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i15 != 0) {
            NestedScrollView nestedScrollView2 = c0832j.f12263A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c0832j.f12285f == null && c0832j.f12286g == null) ? view : viewGroupB.findViewById(p241q.f.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(p241q.f.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0832j.f12286g;
        if (alertController$RecycleListView != null && (!z10 || i15 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i15 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f12076a, alertController$RecycleListView.getPaddingRight(), z10 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f12077b);
        }
        if (!z8) {
            View view2 = c0832j.f12286g;
            if (view2 == null) {
                view2 = c0832j.f12263A;
            }
            if (view2 != null) {
                if (!z10) {
                    i11 = 0;
                }
                int i16 = i15 | i11;
                View viewFindViewById11 = window.findViewById(p241q.f.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(p241q.f.scrollIndicatorDown);
                WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                androidx.core.view.F.b(view2, i16, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0832j.f12286g;
        if (alertController$RecycleListView2 == null || (listAdapter = c0832j.f12270H) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i17 = c0832j.f12271I;
        if (i17 > -1) {
            alertController$RecycleListView2.setItemChecked(i17, true);
            alertController$RecycleListView2.setSelection(i17);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12306a.f12263A;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyDown(i7, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12306a.f12263A;
        if (nestedScrollView == null || !nestedScrollView.c(keyEvent)) {
            return super.onKeyUp(i7, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.K, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0832j c0832j = this.f12306a;
        c0832j.f12284e = charSequence;
        TextView textView = c0832j.f12267E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
