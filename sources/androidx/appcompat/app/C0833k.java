package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.appcompat.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0833k {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final C0830h f12305P;
    private final int mTheme;

    public C0833k(Context context) {
        this(context, DialogInterfaceC0834l.b(0, context));
    }

    public DialogInterfaceC0834l create() {
        C0832j c0832j;
        ListAdapter simpleCursorAdapter;
        DialogInterfaceC0834l dialogInterfaceC0834l = new DialogInterfaceC0834l(this.f12305P.f12238a, this.mTheme);
        C0830h c0830h = this.f12305P;
        View view = c0830h.f12243f;
        C0832j c0832j2 = dialogInterfaceC0834l.f12306a;
        if (view != null) {
            c0832j2.f12269G = view;
        } else {
            CharSequence charSequence = c0830h.f12242e;
            if (charSequence != null) {
                c0832j2.f12284e = charSequence;
                TextView textView = c0832j2.f12267E;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0830h.f12241d;
            if (drawable != null) {
                c0832j2.f12265C = drawable;
                c0832j2.f12264B = 0;
                ImageView imageView = c0832j2.f12266D;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0832j2.f12266D.setImageDrawable(drawable);
                }
            }
            int i7 = c0830h.f12240c;
            if (i7 != 0) {
                c0832j2.f12265C = null;
                c0832j2.f12264B = i7;
                ImageView imageView2 = c0832j2.f12266D;
                if (imageView2 != null) {
                    if (i7 != 0) {
                        imageView2.setVisibility(0);
                        c0832j2.f12266D.setImageResource(c0832j2.f12264B);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = c0830h.f12244g;
        if (charSequence2 != null) {
            c0832j2.f12285f = charSequence2;
            TextView textView2 = c0832j2.f12268F;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = c0830h.f12245h;
        if (charSequence3 != null || c0830h.f12246i != null) {
            c0832j2.c(-1, charSequence3, c0830h.f12247j, c0830h.f12246i);
        }
        CharSequence charSequence4 = c0830h.f12248k;
        if (charSequence4 != null || c0830h.f12249l != null) {
            c0832j2.c(-2, charSequence4, c0830h.f12250m, c0830h.f12249l);
        }
        CharSequence charSequence5 = c0830h.f12251n;
        if (charSequence5 != null || c0830h.f12252o != null) {
            c0832j2.c(-3, charSequence5, c0830h.f12253p, c0830h.f12252o);
        }
        if (c0830h.f12257u == null && c0830h.f12234J == null && c0830h.f12258v == null) {
            c0832j = c0832j2;
        } else {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0830h.f12239b.inflate(c0832j2.f12273K, (ViewGroup) null);
            boolean z3 = c0830h.f12230F;
            ContextThemeWrapper contextThemeWrapper = c0830h.f12238a;
            if (!z3) {
                c0832j = c0832j2;
                int i10 = c0830h.f12231G ? c0832j.f12275M : c0832j.f12276N;
                if (c0830h.f12234J != null) {
                    simpleCursorAdapter = new SimpleCursorAdapter(contextThemeWrapper, i10, c0830h.f12234J, new String[]{c0830h.f12235K}, new int[]{R.id.text1});
                } else {
                    ListAdapter c0831i = c0830h.f12258v;
                    if (c0831i == null) {
                        c0831i = new C0831i(contextThemeWrapper, i10, R.id.text1, c0830h.f12257u);
                    }
                    simpleCursorAdapter = c0831i;
                }
            } else if (c0830h.f12234J == null) {
                simpleCursorAdapter = new C0826d(c0830h, contextThemeWrapper, c0832j2.f12274L, c0830h.f12257u, alertController$RecycleListView);
                alertController$RecycleListView = alertController$RecycleListView;
                c0832j = c0832j2;
            } else {
                c0832j = c0832j2;
                simpleCursorAdapter = new C0827e(c0830h, contextThemeWrapper, c0830h.f12234J, alertController$RecycleListView, c0832j);
            }
            c0832j.f12270H = simpleCursorAdapter;
            c0832j.f12271I = c0830h.f12232H;
            if (c0830h.f12259w != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0828f(c0830h, c0832j));
            } else if (c0830h.f12233I != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0829g(c0830h, alertController$RecycleListView, c0832j));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c0830h.f12237M;
            if (onItemSelectedListener != null) {
                alertController$RecycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c0830h.f12231G) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (c0830h.f12230F) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            c0832j.f12286g = alertController$RecycleListView;
        }
        View view2 = c0830h.f12261y;
        if (view2 == null) {
            int i11 = c0830h.f12260x;
            if (i11 != 0) {
                c0832j.f12287h = null;
                c0832j.f12288i = i11;
                c0832j.f12293n = false;
            }
        } else if (c0830h.f12228D) {
            int i12 = c0830h.f12262z;
            int i13 = c0830h.f12225A;
            int i14 = c0830h.f12226B;
            int i15 = c0830h.f12227C;
            c0832j.f12287h = view2;
            c0832j.f12288i = 0;
            c0832j.f12293n = true;
            c0832j.f12289j = i12;
            c0832j.f12290k = i13;
            c0832j.f12291l = i14;
            c0832j.f12292m = i15;
        } else {
            c0832j.f12287h = view2;
            c0832j.f12288i = 0;
            c0832j.f12293n = false;
        }
        dialogInterfaceC0834l.setCancelable(this.f12305P.f12254q);
        if (this.f12305P.f12254q) {
            dialogInterfaceC0834l.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC0834l.setOnCancelListener(this.f12305P.f12255r);
        dialogInterfaceC0834l.setOnDismissListener(this.f12305P.f12256s);
        DialogInterface.OnKeyListener onKeyListener = this.f12305P.t;
        if (onKeyListener != null) {
            dialogInterfaceC0834l.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC0834l;
    }

    @NonNull
    public Context getContext() {
        return this.f12305P.f12238a;
    }

    public C0833k setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12258v = listAdapter;
        c0830h.f12259w = onClickListener;
        return this;
    }

    public C0833k setCancelable(boolean z3) {
        this.f12305P.f12254q = z3;
        return this;
    }

    public C0833k setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        C0830h c0830h = this.f12305P;
        c0830h.f12234J = cursor;
        c0830h.f12235K = str;
        c0830h.f12259w = onClickListener;
        return this;
    }

    public C0833k setCustomTitle(View view) {
        this.f12305P.f12243f = view;
        return this;
    }

    public C0833k setIcon(int i7) {
        this.f12305P.f12240c = i7;
        return this;
    }

    public C0833k setIconAttribute(int i7) {
        TypedValue typedValue = new TypedValue();
        this.f12305P.f12238a.getTheme().resolveAttribute(i7, typedValue, true);
        this.f12305P.f12240c = typedValue.resourceId;
        return this;
    }

    @Deprecated
    public C0833k setInverseBackgroundForced(boolean z3) {
        this.f12305P.getClass();
        return this;
    }

    public C0833k setItems(int i7, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12257u = c0830h.f12238a.getResources().getTextArray(i7);
        this.f12305P.f12259w = onClickListener;
        return this;
    }

    public C0833k setMessage(int i7) {
        C0830h c0830h = this.f12305P;
        c0830h.f12244g = c0830h.f12238a.getText(i7);
        return this;
    }

    public C0833k setMultiChoiceItems(int i7, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12257u = c0830h.f12238a.getResources().getTextArray(i7);
        C0830h c0830h2 = this.f12305P;
        c0830h2.f12233I = onMultiChoiceClickListener;
        c0830h2.f12229E = zArr;
        c0830h2.f12230F = true;
        return this;
    }

    public C0833k setNegativeButton(int i7, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12248k = c0830h.f12238a.getText(i7);
        this.f12305P.f12250m = onClickListener;
        return this;
    }

    public C0833k setNegativeButtonIcon(Drawable drawable) {
        this.f12305P.f12249l = drawable;
        return this;
    }

    public C0833k setNeutralButton(int i7, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12251n = c0830h.f12238a.getText(i7);
        this.f12305P.f12253p = onClickListener;
        return this;
    }

    public C0833k setNeutralButtonIcon(Drawable drawable) {
        this.f12305P.f12252o = drawable;
        return this;
    }

    public C0833k setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.f12305P.f12255r = onCancelListener;
        return this;
    }

    public C0833k setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f12305P.f12256s = onDismissListener;
        return this;
    }

    public C0833k setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f12305P.f12237M = onItemSelectedListener;
        return this;
    }

    public C0833k setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.f12305P.t = onKeyListener;
        return this;
    }

    public C0833k setPositiveButton(int i7, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12245h = c0830h.f12238a.getText(i7);
        this.f12305P.f12247j = onClickListener;
        return this;
    }

    public C0833k setPositiveButtonIcon(Drawable drawable) {
        this.f12305P.f12246i = drawable;
        return this;
    }

    @RestrictTo({p192n.c.f39802c})
    public C0833k setRecycleOnMeasureEnabled(boolean z3) {
        this.f12305P.getClass();
        return this;
    }

    public C0833k setSingleChoiceItems(int i7, int i10, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12257u = c0830h.f12238a.getResources().getTextArray(i7);
        C0830h c0830h2 = this.f12305P;
        c0830h2.f12259w = onClickListener;
        c0830h2.f12232H = i10;
        c0830h2.f12231G = true;
        return this;
    }

    public C0833k setTitle(int i7) {
        C0830h c0830h = this.f12305P;
        c0830h.f12242e = c0830h.f12238a.getText(i7);
        return this;
    }

    public C0833k setView(int i7) {
        C0830h c0830h = this.f12305P;
        c0830h.f12261y = null;
        c0830h.f12260x = i7;
        c0830h.f12228D = false;
        return this;
    }

    public DialogInterfaceC0834l show() {
        DialogInterfaceC0834l dialogInterfaceC0834lCreate = create();
        dialogInterfaceC0834lCreate.show();
        return dialogInterfaceC0834lCreate;
    }

    public C0833k(Context context, int i7) {
        this.f12305P = new C0830h(new ContextThemeWrapper(context, DialogInterfaceC0834l.b(i7, context)));
        this.mTheme = i7;
    }

    public C0833k setIcon(Drawable drawable) {
        this.f12305P.f12241d = drawable;
        return this;
    }

    public C0833k setMessage(CharSequence charSequence) {
        this.f12305P.f12244g = charSequence;
        return this;
    }

    public C0833k setTitle(CharSequence charSequence) {
        this.f12305P.f12242e = charSequence;
        return this;
    }

    public C0833k setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12257u = charSequenceArr;
        c0830h.f12259w = onClickListener;
        return this;
    }

    public C0833k setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12248k = charSequence;
        c0830h.f12250m = onClickListener;
        return this;
    }

    public C0833k setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12251n = charSequence;
        c0830h.f12253p = onClickListener;
        return this;
    }

    public C0833k setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12245h = charSequence;
        c0830h.f12247j = onClickListener;
        return this;
    }

    public C0833k setView(View view) {
        C0830h c0830h = this.f12305P;
        c0830h.f12261y = view;
        c0830h.f12260x = 0;
        c0830h.f12228D = false;
        return this;
    }

    public C0833k setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12257u = charSequenceArr;
        c0830h.f12233I = onMultiChoiceClickListener;
        c0830h.f12229E = zArr;
        c0830h.f12230F = true;
        return this;
    }

    public C0833k setSingleChoiceItems(Cursor cursor, int i7, String str, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12234J = cursor;
        c0830h.f12259w = onClickListener;
        c0830h.f12232H = i7;
        c0830h.f12235K = str;
        c0830h.f12231G = true;
        return this;
    }

    @RestrictTo({p192n.c.f39802c})
    @Deprecated
    public C0833k setView(View view, int i7, int i10, int i11, int i12) {
        C0830h c0830h = this.f12305P;
        c0830h.f12261y = view;
        c0830h.f12260x = 0;
        c0830h.f12228D = true;
        c0830h.f12262z = i7;
        c0830h.f12225A = i10;
        c0830h.f12226B = i11;
        c0830h.f12227C = i12;
        return this;
    }

    public C0833k setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12234J = cursor;
        c0830h.f12233I = onMultiChoiceClickListener;
        c0830h.f12236L = str;
        c0830h.f12235K = str2;
        c0830h.f12230F = true;
        return this;
    }

    public C0833k setSingleChoiceItems(CharSequence[] charSequenceArr, int i7, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12257u = charSequenceArr;
        c0830h.f12259w = onClickListener;
        c0830h.f12232H = i7;
        c0830h.f12231G = true;
        return this;
    }

    public C0833k setSingleChoiceItems(ListAdapter listAdapter, int i7, DialogInterface.OnClickListener onClickListener) {
        C0830h c0830h = this.f12305P;
        c0830h.f12258v = listAdapter;
        c0830h.f12259w = onClickListener;
        c0830h.f12232H = i7;
        c0830h.f12231G = true;
        return this;
    }
}
