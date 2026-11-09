package com.swmansion.rnscreens;

import Ab.C;
import Ed.ViewOnFocusChangeListenerC0235o;
import Je.l;
import M7.G;
import M7.I;
import M7.N;
import M7.O;
import O7.E;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241q.f;
import top.zibin.luban.io.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0013\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R$\u0010)\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R$\u0010-\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010A\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00108\u001a\u0004\b?\u0010:\"\u0004\b@\u0010<R\"\u0010E\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00108\u001a\u0004\bC\u0010:\"\u0004\bD\u0010<R\u0016\u0010I\u001a\u0004\u0018\u00010F8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010M\u001a\u0004\u0018\u00010J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/swmansion/rnscreens/SearchBarView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Landroidx/appcompat/widget/SearchView;", "searchView", "", "setSearchViewListeners", "(Landroidx/appcompat/widget/SearchView;)V", "", "visibility", "setToolbarElementsVisibility", "(I)V", "LM7/N;", "a", "LM7/N;", "getInputType", "()LM7/N;", "setInputType", "(LM7/N;)V", "inputType", "LM7/I;", "b", "LM7/I;", "getAutoCapitalize", "()LM7/I;", "setAutoCapitalize", "(LM7/I;)V", "autoCapitalize", "c", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/Integer;", "setTextColor", "(Ljava/lang/Integer;)V", "textColor", "d", "getTintColor", "setTintColor", "tintColor", "e", "getHeaderIconColor", "setHeaderIconColor", "headerIconColor", "f", "getHintTextColor", "setHintTextColor", "hintTextColor", "", "g", "Ljava/lang/String;", "getPlaceholder", "()Ljava/lang/String;", "setPlaceholder", "(Ljava/lang/String;)V", ReactTextInputShadowNode.PROP_PLACEHOLDER, "", "i", "Z", "getShouldOverrideBackButton", "()Z", "setShouldOverrideBackButton", "(Z)V", "shouldOverrideBackButton", "j", "getAutoFocus", "setAutoFocus", "autoFocus", "o", "getShouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "shouldShowHintSearchIcon", "Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "getHeaderConfig", "()Lcom/swmansion/rnscreens/ScreenStackHeaderConfig;", "headerConfig", "Lcom/swmansion/rnscreens/ScreenStackFragment;", "getScreenStackFragment", "()Lcom/swmansion/rnscreens/ScreenStackFragment;", "screenStackFragment", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nSearchBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBarView.kt\ncom/swmansion/rnscreens/SearchBarView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class SearchBarView extends ReactViewGroup {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f25379w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public N inputType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public I autoCapitalize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Integer textColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Integer tintColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Integer headerIconColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Integer hintTextColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public String placeholder;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean shouldOverrideBackButton;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean autoFocus;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean shouldShowHintSearchIcon;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f25390p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f25391v;

    public SearchBarView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        this.inputType = N.f5797a;
        this.autoCapitalize = I.f5792a;
        this.placeholder = "";
        this.shouldOverrideBackButton = true;
        this.shouldShowHintSearchIcon = true;
        this.f25391v = UIManagerHelper.getSurfaceId(this);
    }

    public static Unit b(SearchBarView searchBarView, CustomSearchView searchView) {
        ScreenStackFragment screenStackFragment;
        CustomSearchView customSearchView;
        Intrinsics.checkNotNullParameter(searchView, "newSearchView");
        if (searchBarView.f25390p == null) {
            Intrinsics.checkNotNullParameter(searchView, "searchView");
            a aVar = new a(12, false);
            aVar.f42645b = searchView;
            searchBarView.f25390p = aVar;
        }
        searchBarView.k();
        if (searchBarView.autoFocus && (screenStackFragment = searchBarView.getScreenStackFragment()) != null && (customSearchView = screenStackFragment.f25340A) != null) {
            customSearchView.setIconified(false);
            customSearchView.requestFocusFromTouch();
        }
        return Unit.f38893a;
    }

    public static void c(SearchBarView searchBarView) {
        searchBarView.j(new E(searchBarView.f25391v, searchBarView.getId()));
        searchBarView.setToolbarElementsVisibility(0);
    }

    public static void d(SearchBarView searchBarView) {
        searchBarView.j(new O7.I(searchBarView.f25391v, searchBarView.getId()));
        searchBarView.setToolbarElementsVisibility(8);
    }

    private final ScreenStackHeaderConfig getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof ScreenStackHeaderSubview) {
            return ((ScreenStackHeaderSubview) parent).getConfig();
        }
        return null;
    }

    private final ScreenStackFragment getScreenStackFragment() {
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new O(this));
        searchView.setOnQueryTextFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 2));
        searchView.setOnCloseListener(new Dg.a(this, 28));
        searchView.setOnSearchClickListener(new l(this, 13));
    }

    private final void setToolbarElementsVisibility(int visibility) {
        ScreenStackHeaderSubview screenStackHeaderSubview;
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        int i7 = 0;
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            ScreenStackHeaderConfig headerConfig2 = getHeaderConfig();
            if (headerConfig2 != null) {
                Object obj = headerConfig2.f25361g.get(i7);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                screenStackHeaderSubview = (ScreenStackHeaderSubview) obj;
            } else {
                screenStackHeaderSubview = null;
            }
            if ((screenStackHeaderSubview != null ? screenStackHeaderSubview.getType() : null) != G.f5789e && screenStackHeaderSubview != null) {
                screenStackHeaderSubview.setVisibility(visibility);
            }
            if (i7 == configSubviewsCount) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void e() {
        CustomSearchView customSearchView;
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (customSearchView = screenStackFragment.f25340A) == null) {
            return;
        }
        customSearchView.clearFocus();
    }

    public final void f() {
        CustomSearchView customSearchView;
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (customSearchView = screenStackFragment.f25340A) == null) {
            return;
        }
        customSearchView.i("");
        customSearchView.setIconified(true);
    }

    public final void g() {
        CustomSearchView customSearchView;
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (customSearchView = screenStackFragment.f25340A) == null) {
            return;
        }
        customSearchView.i("");
    }

    @NotNull
    public final I getAutoCapitalize() {
        return this.autoCapitalize;
    }

    public final boolean getAutoFocus() {
        return this.autoFocus;
    }

    @Nullable
    public final Integer getHeaderIconColor() {
        return this.headerIconColor;
    }

    @Nullable
    public final Integer getHintTextColor() {
        return this.hintTextColor;
    }

    @NotNull
    public final N getInputType() {
        return this.inputType;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.shouldOverrideBackButton;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.shouldShowHintSearchIcon;
    }

    @Nullable
    public final Integer getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final Integer getTintColor() {
        return this.tintColor;
    }

    public final void h() {
        CustomSearchView customSearchView;
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (customSearchView = screenStackFragment.f25340A) == null) {
            return;
        }
        customSearchView.setIconified(false);
        customSearchView.requestFocusFromTouch();
    }

    public final void i(String str) {
        ScreenStackFragment screenStackFragment;
        CustomSearchView customSearchView;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (customSearchView = screenStackFragment.f25340A) == null) {
            return;
        }
        customSearchView.setText(str);
    }

    public final void j(Event event) {
        Context context = getContext();
        Intrinsics.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(event);
        }
    }

    public final void k() {
        Integer num;
        Integer num2;
        EditText editTextJ;
        ColorStateList textColors;
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        Integer numValueOf = null;
        CustomSearchView customSearchView = screenStackFragment != null ? screenStackFragment.f25340A : null;
        if (customSearchView != null) {
            if (!this.t) {
                setSearchViewListeners(customSearchView);
                this.t = true;
            }
            customSearchView.setInputType(this.inputType.a(this.autoCapitalize));
            a aVar = this.f25390p;
            if (aVar != null) {
                Integer num3 = this.textColor;
                Integer num4 = (Integer) aVar.f42646c;
                if (num3 != null) {
                    if (num4 == null) {
                        EditText editTextJ2 = aVar.j();
                        if (editTextJ2 != null && (textColors = editTextJ2.getTextColors()) != null) {
                            numValueOf = Integer.valueOf(textColors.getDefaultColor());
                        }
                        aVar.f42646c = numValueOf;
                    }
                    EditText editTextJ3 = aVar.j();
                    if (editTextJ3 != null) {
                        editTextJ3.setTextColor(num3.intValue());
                    }
                } else if (num4 != null && (editTextJ = aVar.j()) != null) {
                    editTextJ.setTextColor(num4.intValue());
                }
            }
            a aVar2 = this.f25390p;
            if (aVar2 != null) {
                Integer num5 = this.tintColor;
                Drawable drawable = (Drawable) aVar2.f42647d;
                if (num5 != null) {
                    if (drawable == null) {
                        aVar2.f42647d = ((CustomSearchView) aVar2.f42645b).findViewById(f.search_plate).getBackground();
                    }
                    ((CustomSearchView) aVar2.f42645b).findViewById(f.search_plate).setBackgroundColor(num5.intValue());
                } else if (drawable != null) {
                    ((CustomSearchView) aVar2.f42645b).findViewById(f.search_plate).setBackground(drawable);
                }
            }
            a aVar3 = this.f25390p;
            if (aVar3 != null && (num2 = this.headerIconColor) != null) {
                int iIntValue = num2.intValue();
                int i7 = f.search_button;
                CustomSearchView customSearchView2 = (CustomSearchView) aVar3.f42645b;
                ((ImageView) customSearchView2.findViewById(i7)).setColorFilter(iIntValue);
                ((ImageView) customSearchView2.findViewById(f.search_close_btn)).setColorFilter(iIntValue);
            }
            a aVar4 = this.f25390p;
            if (aVar4 != null && (num = this.hintTextColor) != null) {
                int iIntValue2 = num.intValue();
                EditText editTextJ4 = aVar4.j();
                if (editTextJ4 != null) {
                    editTextJ4.setHintTextColor(iIntValue2);
                }
            }
            a aVar5 = this.f25390p;
            if (aVar5 != null) {
                String placeholder = this.placeholder;
                boolean z3 = this.shouldShowHintSearchIcon;
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                if (z3) {
                    ((CustomSearchView) aVar5.f42645b).setQueryHint(placeholder);
                } else {
                    EditText editTextJ5 = aVar5.j();
                    if (editTextJ5 != null) {
                        editTextJ5.setHint(placeholder);
                    }
                }
            }
            customSearchView.setOverrideBackAction(this.shouldOverrideBackButton);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.f25341B = new C(this, 23);
        }
    }

    public final void setAutoCapitalize(@NotNull I i7) {
        Intrinsics.checkNotNullParameter(i7, "<set-?>");
        this.autoCapitalize = i7;
    }

    public final void setAutoFocus(boolean z3) {
        this.autoFocus = z3;
    }

    public final void setHeaderIconColor(@Nullable Integer num) {
        this.headerIconColor = num;
    }

    public final void setHintTextColor(@Nullable Integer num) {
        this.hintTextColor = num;
    }

    public final void setInputType(@NotNull N n10) {
        Intrinsics.checkNotNullParameter(n10, "<set-?>");
        this.inputType = n10;
    }

    public final void setPlaceholder(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placeholder = str;
    }

    public final void setShouldOverrideBackButton(boolean z3) {
        this.shouldOverrideBackButton = z3;
    }

    public final void setShouldShowHintSearchIcon(boolean z3) {
        this.shouldShowHintSearchIcon = z3;
    }

    public final void setTextColor(@Nullable Integer num) {
        this.textColor = num;
    }

    public final void setTintColor(@Nullable Integer num) {
        this.tintColor = num;
    }
}
