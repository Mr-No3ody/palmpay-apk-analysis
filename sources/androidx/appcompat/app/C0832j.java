package androidx.appcompat.app;

import Gb.HandlerC0283f;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.appcompat.app.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0832j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public NestedScrollView f12263A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f12265C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f12266D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TextView f12267E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f12268F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public View f12269G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ListAdapter f12270H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f12272J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f12273K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f12274L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f12275M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f12276N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f12277O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final HandlerC0283f f12278P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC0834l f12281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f12282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f12284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f12285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AlertController$RecycleListView f12286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f12287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12292m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f12294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f12295p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f12296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f12297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f12298s;
    public CharSequence t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f12299u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f12300v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f12301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f12302x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f12303y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f12304z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12293n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12264B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f12271I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ViewOnClickListenerC0825c f12279Q = new ViewOnClickListenerC0825c(this);

    public C0832j(Context context, DialogInterfaceC0834l dialogInterfaceC0834l, Window window) {
        this.f12280a = context;
        this.f12281b = dialogInterfaceC0834l;
        this.f12282c = window;
        HandlerC0283f handlerC0283f = new HandlerC0283f();
        handlerC0283f.f3274b = new WeakReference(dialogInterfaceC0834l);
        this.f12278P = handlerC0283f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p241q.j.AlertDialog, p241q.a.alertDialogStyle, 0);
        this.f12272J = typedArrayObtainStyledAttributes.getResourceId(p241q.j.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(p241q.j.AlertDialog_buttonPanelSideLayout, 0);
        this.f12273K = typedArrayObtainStyledAttributes.getResourceId(p241q.j.AlertDialog_listLayout, 0);
        this.f12274L = typedArrayObtainStyledAttributes.getResourceId(p241q.j.AlertDialog_multiChoiceItemLayout, 0);
        this.f12275M = typedArrayObtainStyledAttributes.getResourceId(p241q.j.AlertDialog_singleChoiceItemLayout, 0);
        this.f12276N = typedArrayObtainStyledAttributes.getResourceId(p241q.j.AlertDialog_listItemLayout, 0);
        this.f12277O = typedArrayObtainStyledAttributes.getBoolean(p241q.j.AlertDialog_showTitle, true);
        this.f12283d = typedArrayObtainStyledAttributes.getDimensionPixelSize(p241q.j.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0834l.supportRequestWindowFeature(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.f12278P.obtainMessage(i7, onClickListener) : null;
        if (i7 == -3) {
            this.f12302x = charSequence;
            this.f12303y = messageObtainMessage;
            this.f12304z = drawable;
        } else if (i7 == -2) {
            this.t = charSequence;
            this.f12299u = messageObtainMessage;
            this.f12300v = drawable;
        } else {
            if (i7 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f12295p = charSequence;
            this.f12296q = messageObtainMessage;
            this.f12297r = drawable;
        }
    }
}
