package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.customview.view.AbsSavedState;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.actions.SearchIntents;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final Ff.d f12764L0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ImageView f12765A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f12766A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Drawable f12767B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f12768B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f12769C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public String f12770C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public CharSequence f12771D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f12772E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f12773F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public SearchableInfo f12774G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f12775H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public Bundle f12776H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final H0 f12777I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final H0 f12778J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final WeakHashMap f12779K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Intent f12780L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final Intent f12781M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final CharSequence f12782Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchAutoComplete f12783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f12784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f12785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f12786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f12787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f12788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f12789g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f12790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f12791j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public OnQueryTextListener f12792k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Q0 f12793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f12794p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public OnCloseListener f12795p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View.OnFocusChangeListener f12796q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public OnSuggestionListener f12797r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View.OnClickListener f12798s0;
    public final Rect t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f12799t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f12800u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f12801v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public androidx.cursoradapter.widget.b f12802v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f12803w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f12804w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public CharSequence f12805x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f12806y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f12807z0;

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i7);

        boolean onSuggestionSelect(int i7);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new O0();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12808a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12808a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f12808a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Boolean.valueOf(this.f12808a));
        }
    }

    @RestrictTo({p192n.c.f39802c})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SearchView f12810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final P0 f12812d;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i7 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            if (i7 >= 600) {
                return JfifUtil.MARKER_SOFn;
            }
            if (i7 < 640 || i10 < 480) {
                return 160;
            }
            return JfifUtil.MARKER_SOFn;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                N0.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            Ff.d dVar = SearchView.f12764L0;
            dVar.getClass();
            Ff.d.a();
            Method method = dVar.f2830c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f12809a <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f12811c) {
                P0 p3 = this.f12812d;
                removeCallbacks(p3);
                post(p3);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z3, int i7, Rect rect) {
            super.onFocusChanged(z3, i7, rect);
            SearchView searchView = this.f12810b;
            searchView.o(searchView.f12800u0);
            searchView.post(searchView.f12777I0);
            if (searchView.f12783a.hasFocus()) {
                searchView.c();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f12810b.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z3) {
            super.onWindowFocusChanged(z3);
            if (z3 && this.f12810b.hasFocus() && getVisibility() == 0) {
                this.f12811c = true;
                Context context = getContext();
                Ff.d dVar = SearchView.f12764L0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            P0 p3 = this.f12812d;
            if (!z3) {
                this.f12811c = false;
                removeCallbacks(p3);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f12811c = true;
                    return;
                }
                this.f12811c = false;
                removeCallbacks(p3);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f12810b = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f12809a = i7;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, p241q.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f12812d = new P0(this);
            this.f12809a = getThreshold();
        }
    }

    static {
        Ff.d dVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            Ff.d dVar2 = new Ff.d();
            dVar2.f2828a = null;
            dVar2.f2829b = null;
            dVar2.f2830c = null;
            Ff.d.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                dVar2.f2828a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                dVar2.f2829b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                dVar2.f2830c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            dVar = dVar2;
        }
        f12764L0 = dVar;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(p241q.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(p241q.d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f12783a;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent a(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f12771D0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f12776H0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f12774G0.getSearchActivity());
        return intent;
    }

    public final Intent b(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f12776H0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void c() {
        int i7 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f12783a;
        if (i7 >= 29) {
            N0.a(searchAutoComplete);
            return;
        }
        Ff.d dVar = f12764L0;
        dVar.getClass();
        Ff.d.a();
        Method method = dVar.f2828a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        dVar.getClass();
        Ff.d.a();
        Method method2 = dVar.f2829b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f12807z0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f12783a;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f12807z0 = false;
    }

    public final void d() {
        SearchAutoComplete searchAutoComplete = this.f12783a;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f12799t0) {
            OnCloseListener onCloseListener = this.f12795p0;
            if (onCloseListener == null || !onCloseListener.onClose()) {
                clearFocus();
                o(true);
            }
        }
    }

    public final boolean e(int i7) {
        String strF;
        OnSuggestionListener onSuggestionListener = this.f12797r0;
        if (onSuggestionListener != null && onSuggestionListener.onSuggestionClick(i7)) {
            return false;
        }
        Cursor cursor = this.f12802v0.f16376c;
        if (cursor != null && cursor.moveToPosition(i7)) {
            Intent intentA = null;
            try {
                try {
                    int i10 = T0.f12813Z;
                    String strF2 = T0.f(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strF2 == null) {
                        strF2 = this.f12774G0.getSuggestIntentAction();
                    }
                    if (strF2 == null) {
                        strF2 = "android.intent.action.SEARCH";
                    }
                    String strF3 = T0.f(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strF3 == null) {
                        strF3 = this.f12774G0.getSuggestIntentData();
                    }
                    if (strF3 != null && (strF = T0.f(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strF3 = strF3 + "/" + Uri.encode(strF);
                    }
                    intentA = a(strF3 == null ? null : Uri.parse(strF3), strF2, T0.f(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), T0.f(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentA != null) {
                try {
                    getContext().startActivity(intentA);
                } catch (RuntimeException e10) {
                    Log.e("SearchView", "Failed launch activity: " + intentA, e10);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f12783a;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
        return true;
    }

    public final void f(int i7) {
        OnSuggestionListener onSuggestionListener = this.f12797r0;
        if (onSuggestionListener == null || !onSuggestionListener.onSuggestionSelect(i7)) {
            Editable text = this.f12783a.getText();
            Cursor cursor = this.f12802v0.f16376c;
            if (cursor == null) {
                return;
            }
            if (!cursor.moveToPosition(i7)) {
                setQuery(text);
                return;
            }
            CharSequence charSequenceConvertToString = this.f12802v0.convertToString(cursor);
            if (charSequenceConvertToString != null) {
                setQuery(charSequenceConvertToString);
            } else {
                setQuery(text);
            }
        }
    }

    public final void g(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public int getImeOptions() {
        return this.f12783a.getImeOptions();
    }

    public int getInputType() {
        return this.f12783a.getInputType();
    }

    public int getMaxWidth() {
        return this.f12766A0;
    }

    public CharSequence getQuery() {
        return this.f12783a.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f12805x0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f12774G0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f12782Q : getContext().getText(this.f12774G0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f12775H;
    }

    public int getSuggestionRowLayout() {
        return this.f12769C;
    }

    public androidx.cursoradapter.widget.b getSuggestionsAdapter() {
        return this.f12802v0;
    }

    public final void h() {
        SearchAutoComplete searchAutoComplete = this.f12783a;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OnQueryTextListener onQueryTextListener = this.f12792k0;
        if (onQueryTextListener == null || !onQueryTextListener.onQueryTextSubmit(text.toString())) {
            if (this.f12774G0 != null) {
                getContext().startActivity(a(null, "android.intent.action.SEARCH", null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void i(String str) {
        SearchAutoComplete searchAutoComplete = this.f12783a;
        searchAutoComplete.setText(str);
        if (str != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f12771D0 = str;
        }
    }

    public final void j() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f12783a.getText());
        int i7 = (!zIsEmpty || (this.f12799t0 && !this.f12772E0)) ? 0 : 8;
        ImageView imageView = this.f12789g;
        imageView.setVisibility(i7);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void k() {
        int[] iArr = this.f12783a.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f12785c.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f12786d.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

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
    public final void l() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z3 = this.f12799t0;
        SearchAutoComplete searchAutoComplete = this.f12783a;
        CharSequence charSequence2 = charSequence;
        if (z3 && (drawable = this.f12767B) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void m() {
        this.f12786d.setVisibility(((this.f12804w0 || this.f12768B0) && !this.f12800u0 && (this.f12788f.getVisibility() == 0 || this.f12790i.getVisibility() == 0)) ? 0 : 8);
    }

    public final void n(boolean z3) {
        boolean z8 = this.f12804w0;
        this.f12788f.setVisibility((!z8 || !(z8 || this.f12768B0) || this.f12800u0 || !hasFocus() || (!z3 && this.f12768B0)) ? 8 : 0);
    }

    public final void o(boolean z3) {
        this.f12800u0 = z3;
        int i7 = 8;
        int i10 = z3 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f12783a.getText());
        this.f12787e.setVisibility(i10);
        n(!zIsEmpty);
        this.f12784b.setVisibility(z3 ? 8 : 0);
        ImageView imageView = this.f12765A;
        imageView.setVisibility((imageView.getDrawable() == null || this.f12799t0) ? 8 : 0);
        j();
        if (this.f12768B0 && !this.f12800u0 && zIsEmpty) {
            this.f12788f.setVisibility(8);
            i7 = 0;
        }
        this.f12790i.setVisibility(i7);
        m();
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewCollapsed() {
        i("");
        clearFocus();
        o(true);
        this.f12783a.setImeOptions(this.f12773F0);
        this.f12772E0 = false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewExpanded() {
        if (this.f12772E0) {
            return;
        }
        this.f12772E0 = true;
        SearchAutoComplete searchAutoComplete = this.f12783a;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f12773F0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f12777I0);
        post(this.f12778J0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        if (z3) {
            int[] iArr = this.f12801v;
            SearchAutoComplete searchAutoComplete = this.f12783a;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f12803w;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i14;
            int height = searchAutoComplete.getHeight() + i13;
            Rect rect = this.f12794p;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.t;
            rect2.set(i15, 0, i16, i17);
            Q0 q10 = this.f12793o;
            if (q10 == null) {
                Q0 q11 = new Q0(searchAutoComplete, rect2, rect);
                this.f12793o = q11;
                setTouchDelegate(q11);
            } else {
                q10.f12745b.set(rect2);
                Rect rect3 = q10.f12747d;
                rect3.set(rect2);
                int i18 = -q10.f12748e;
                rect3.inset(i18, i18);
                q10.f12746c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.f12800u0) {
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.f12766A0;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f12766A0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.f12766A0) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        o(savedState.f12808a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12808a = this.f12800u0;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        post(this.f12777I0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (this.f12807z0 || !isFocusable()) {
            return false;
        }
        if (this.f12800u0) {
            return super.requestFocus(i7, rect);
        }
        boolean zRequestFocus = this.f12783a.requestFocus(i7, rect);
        if (zRequestFocus) {
            o(false);
        }
        return zRequestFocus;
    }

    @RestrictTo({p192n.c.f39802c})
    public void setAppSearchData(Bundle bundle) {
        this.f12776H0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            d();
            return;
        }
        o(false);
        SearchAutoComplete searchAutoComplete = this.f12783a;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f12798s0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f12799t0 == z3) {
            return;
        }
        this.f12799t0 = z3;
        o(z3);
        l();
    }

    public void setImeOptions(int i7) {
        this.f12783a.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f12783a.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f12766A0 = i7;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.f12795p0 = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f12796q0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.f12792k0 = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f12798s0 = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.f12797r0 = onSuggestionListener;
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.f12805x0 = charSequence;
        l();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        this.f12806y0 = z3;
        androidx.cursoradapter.widget.b bVar = this.f12802v0;
        if (bVar instanceof T0) {
            ((T0) bVar).f12815B = z3 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z3;
        this.f12774G0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.f12783a;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f12774G0.getImeOptions());
            int inputType = this.f12774G0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f12774G0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            androidx.cursoradapter.widget.b bVar = this.f12802v0;
            if (bVar != null) {
                bVar.changeCursor(null);
            }
            if (this.f12774G0.getSuggestAuthority() != null) {
                T0 t1 = new T0(getContext(), this, this.f12774G0, this.f12779K0);
                this.f12802v0 = t1;
                searchAutoComplete.setAdapter(t1);
                ((T0) this.f12802v0).f12815B = this.f12806y0 ? 2 : 1;
            }
            l();
        }
        SearchableInfo searchableInfo2 = this.f12774G0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f12774G0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f12780L;
            } else if (this.f12774G0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f12781M;
            }
            z3 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f12768B0 = z3;
        if (z3) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        o(this.f12800u0);
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f12804w0 = z3;
        o(this.f12800u0);
    }

    public void setSuggestionsAdapter(androidx.cursoradapter.widget.b bVar) {
        this.f12802v0 = bVar;
        this.f12783a.setAdapter(bVar);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f12794p = new Rect();
        this.t = new Rect();
        this.f12801v = new int[2];
        this.f12803w = new int[2];
        this.f12777I0 = new H0(this, 0);
        this.f12778J0 = new H0(this, 1);
        this.f12779K0 = new WeakHashMap();
        K0 k2 = new K0(this);
        L0 l5 = new L0(this);
        M0 m7 = new M0(this);
        K k8 = new K(this, 1);
        C0877p0 c0877p0 = new C0877p0(this, 1);
        G0 g7 = new G0(this);
        Z0 z0F = Z0.f(context, attributeSet, p241q.j.SearchView, i7, 0);
        androidx.core.view.N.p(this, context, p241q.j.SearchView, attributeSet, z0F.f12863b, i7, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i10 = p241q.j.SearchView_layout;
        int i11 = p241q.g.abc_search_view;
        TypedArray typedArray = z0F.f12863b;
        layoutInflaterFrom.inflate(typedArray.getResourceId(i10, i11), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(p241q.f.search_src_text);
        this.f12783a = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f12784b = findViewById(p241q.f.search_edit_frame);
        View viewFindViewById = findViewById(p241q.f.search_plate);
        this.f12785c = viewFindViewById;
        View viewFindViewById2 = findViewById(p241q.f.submit_area);
        this.f12786d = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(p241q.f.search_button);
        this.f12787e = imageView;
        ImageView imageView2 = (ImageView) findViewById(p241q.f.search_go_btn);
        this.f12788f = imageView2;
        ImageView imageView3 = (ImageView) findViewById(p241q.f.search_close_btn);
        this.f12789g = imageView3;
        ImageView imageView4 = (ImageView) findViewById(p241q.f.search_voice_btn);
        this.f12790i = imageView4;
        ImageView imageView5 = (ImageView) findViewById(p241q.f.search_mag_icon);
        this.f12765A = imageView5;
        viewFindViewById.setBackground(z0F.b(p241q.j.SearchView_queryBackground));
        viewFindViewById2.setBackground(z0F.b(p241q.j.SearchView_submitBackground));
        imageView.setImageDrawable(z0F.b(p241q.j.SearchView_searchIcon));
        imageView2.setImageDrawable(z0F.b(p241q.j.SearchView_goIcon));
        imageView3.setImageDrawable(z0F.b(p241q.j.SearchView_closeIcon));
        imageView4.setImageDrawable(z0F.b(p241q.j.SearchView_voiceIcon));
        imageView5.setImageDrawable(z0F.b(p241q.j.SearchView_searchIcon));
        this.f12767B = z0F.b(p241q.j.SearchView_searchHintIcon);
        com.facebook.imagepipeline.nativecode.b.S(imageView, getResources().getString(p241q.h.abc_searchview_description_search));
        this.f12769C = typedArray.getResourceId(p241q.j.SearchView_suggestionRowLayout, p241q.g.abc_search_dropdown_item_icons_2line);
        this.f12775H = typedArray.getResourceId(p241q.j.SearchView_commitIcon, 0);
        imageView.setOnClickListener(k2);
        imageView3.setOnClickListener(k2);
        imageView2.setOnClickListener(k2);
        imageView4.setOnClickListener(k2);
        searchAutoComplete.setOnClickListener(k2);
        searchAutoComplete.addTextChangedListener(g7);
        searchAutoComplete.setOnEditorActionListener(m7);
        searchAutoComplete.setOnItemClickListener(k8);
        searchAutoComplete.setOnItemSelectedListener(c0877p0);
        searchAutoComplete.setOnKeyListener(l5);
        searchAutoComplete.setOnFocusChangeListener(new I0(this));
        setIconifiedByDefault(typedArray.getBoolean(p241q.j.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(p241q.j.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f12782Q = typedArray.getText(p241q.j.SearchView_defaultQueryHint);
        this.f12805x0 = typedArray.getText(p241q.j.SearchView_queryHint);
        int i12 = typedArray.getInt(p241q.j.SearchView_android_imeOptions, -1);
        if (i12 != -1) {
            setImeOptions(i12);
        }
        int i13 = typedArray.getInt(p241q.j.SearchView_android_inputType, -1);
        if (i13 != -1) {
            setInputType(i13);
        }
        setFocusable(typedArray.getBoolean(p241q.j.SearchView_android_focusable, true));
        z0F.g();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f12780L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f12781M = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f12791j = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new J0(this));
        }
        o(this.f12799t0);
        l();
    }
}
