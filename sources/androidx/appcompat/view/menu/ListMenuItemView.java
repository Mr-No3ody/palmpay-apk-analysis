package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Z0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f12344A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LayoutInflater f12345B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12346C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f12347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f12348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f12349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f12350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f12351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f12352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f12353g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f12354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f12355j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f12356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12357p;
    public final Context t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12358v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Drawable f12359w;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.f12345B == null) {
            this.f12345B = LayoutInflater.from(getContext());
        }
        return this.f12345B;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f12353g;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f12354i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12354i.getLayoutParams();
        rect.top = this.f12354i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public m getItemData() {
        return this.f12347a;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void initialize(m mVar, int i7) {
        this.f12347a = mVar;
        boolean z3 = false;
        setVisibility(mVar.isVisible() ? 0 : 8);
        setTitle(prefersCondensedTitle() ? mVar.getTitleCondensed() : mVar.f12446e);
        setCheckable(mVar.isCheckable());
        if (mVar.f12455n.isShortcutsVisible()) {
            if ((mVar.f12455n.isQwertyMode() ? mVar.f12451j : mVar.f12449h) != 0) {
                z3 = true;
            }
        }
        setShortcut(z3, mVar.f12455n.isQwertyMode() ? mVar.f12451j : mVar.f12449h);
        setIcon(mVar.getIcon());
        setEnabled(mVar.isEnabled());
        setSubMenuArrowVisible(mVar.hasSubMenu());
        setContentDescription(mVar.f12458q);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f12356o);
        TextView textView = (TextView) findViewById(p241q.f.title);
        this.f12350d = textView;
        int i7 = this.f12357p;
        if (i7 != -1) {
            textView.setTextAppearance(this.t, i7);
        }
        this.f12352f = (TextView) findViewById(p241q.f.shortcut);
        ImageView imageView = (ImageView) findViewById(p241q.f.submenuarrow);
        this.f12353g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f12359w);
        }
        this.f12354i = (ImageView) findViewById(p241q.f.group_divider);
        this.f12355j = (LinearLayout) findViewById(p241q.f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.f12348b != null && this.f12358v) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f12348b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f12349c == null && this.f12351e == null) {
            return;
        }
        if ((this.f12347a.f12464x & 4) != 0) {
            if (this.f12349c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(p241q.g.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f12349c = radioButton;
                LinearLayout linearLayout = this.f12355j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f12349c;
            view = this.f12351e;
        } else {
            if (this.f12351e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(p241q.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f12351e = checkBox;
                LinearLayout linearLayout2 = this.f12355j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f12351e;
            view = this.f12349c;
        }
        if (z3) {
            compoundButton.setChecked(this.f12347a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f12351e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f12349c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f12347a.f12464x & 4) != 0) {
            if (this.f12349c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(p241q.g.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f12349c = radioButton;
                LinearLayout linearLayout = this.f12355j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f12349c;
        } else {
            if (this.f12351e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(p241q.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f12351e = checkBox;
                LinearLayout linearLayout2 = this.f12355j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f12351e;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f12346C = z3;
        this.f12358v = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f12354i;
        if (imageView != null) {
            imageView.setVisibility((this.f12344A || !z3) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(Drawable drawable) {
        boolean z3 = this.f12347a.f12455n.getOptionalIconsVisible() || this.f12346C;
        if (z3 || this.f12358v) {
            ImageView imageView = this.f12348b;
            if (imageView == null && drawable == null && !this.f12358v) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(p241q.g.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f12348b = imageView2;
                LinearLayout linearLayout = this.f12355j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f12358v) {
                this.f12348b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f12348b;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f12348b.getVisibility() != 0) {
                this.f12348b.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final void setShortcut(boolean z3, char c6) {
        int i7;
        String string;
        boolean z8;
        if (z3) {
            m mVar = this.f12347a;
            if (mVar.f12455n.isShortcutsVisible()) {
                if ((mVar.f12455n.isQwertyMode() ? mVar.f12451j : mVar.f12449h) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                z8 = false;
            }
            i7 = z8 ? 0 : 8;
        }
        if (i7 == 0) {
            TextView textView = this.f12352f;
            m mVar2 = this.f12347a;
            char c10 = mVar2.f12455n.isQwertyMode() ? mVar2.f12451j : mVar2.f12449h;
            if (c10 == 0) {
                string = "";
            } else {
                k kVar = mVar2.f12455n;
                Resources resources = kVar.getContext().getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(kVar.getContext()).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(p241q.h.abc_prepend_shortcut_label));
                }
                int i10 = kVar.isQwertyMode() ? mVar2.f12452k : mVar2.f12450i;
                m.a(sb2, resources.getString(p241q.h.abc_menu_meta_shortcut_label), i10, 65536);
                m.a(sb2, resources.getString(p241q.h.abc_menu_ctrl_shortcut_label), i10, 4096);
                m.a(sb2, resources.getString(p241q.h.abc_menu_alt_shortcut_label), i10, 2);
                m.a(sb2, resources.getString(p241q.h.abc_menu_shift_shortcut_label), i10, 1);
                m.a(sb2, resources.getString(p241q.h.abc_menu_sym_shortcut_label), i10, 4);
                m.a(sb2, resources.getString(p241q.h.abc_menu_function_shortcut_label), i10, 8);
                if (c10 == '\b') {
                    sb2.append(resources.getString(p241q.h.abc_menu_delete_shortcut_label));
                } else if (c10 == '\n') {
                    sb2.append(resources.getString(p241q.h.abc_menu_enter_shortcut_label));
                } else if (c10 != ' ') {
                    sb2.append(c10);
                } else {
                    sb2.append(resources.getString(p241q.h.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f12352f.getVisibility() != i7) {
            this.f12352f.setVisibility(i7);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f12350d.getVisibility() != 8) {
                this.f12350d.setVisibility(8);
            }
        } else {
            this.f12350d.setText(charSequence);
            if (this.f12350d.getVisibility() != 0) {
                this.f12350d.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public final boolean showsIcon() {
        return this.f12346C;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        Z0 z0F = Z0.f(getContext(), attributeSet, p241q.j.MenuView, i7, 0);
        this.f12356o = z0F.b(p241q.j.MenuView_android_itemBackground);
        int i10 = p241q.j.MenuView_android_itemTextAppearance;
        TypedArray typedArray = z0F.f12863b;
        this.f12357p = typedArray.getResourceId(i10, -1);
        this.f12358v = typedArray.getBoolean(p241q.j.MenuView_preserveIconSpacing, false);
        this.t = context;
        this.f12359w = z0F.b(p241q.j.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, p241q.a.dropDownListViewStyle, 0);
        this.f12344A = typedArrayObtainStyledAttributes.hasValue(0);
        z0F.g();
        typedArrayObtainStyledAttributes.recycle();
    }
}
