package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends androidx.cursoradapter.widget.b implements View.OnClickListener {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f12813Z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f12814A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12815B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f12816C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f12817H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f12818L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12819M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f12820Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f12821X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f12822Y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12824j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LayoutInflater f12825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SearchView f12826p;
    public final SearchableInfo t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f12827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WeakHashMap f12828w;

    public T0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f16375b = true;
        this.f16376c = null;
        this.f16374a = false;
        this.f16377d = -1;
        this.f16378e = new androidx.cursoradapter.widget.a(this);
        this.f16379f = new C0884t0(this, 1);
        this.f12824j = suggestionRowLayout;
        this.f12823i = suggestionRowLayout;
        this.f12825o = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f12815B = 1;
        this.f12817H = -1;
        this.f12818L = -1;
        this.f12819M = -1;
        this.f12820Q = -1;
        this.f12821X = -1;
        this.f12822Y = -1;
        this.f12826p = searchView;
        this.t = searchableInfo;
        this.f12814A = searchView.getSuggestionCommitIconResId();
        this.f12827v = context;
        this.f12828w = weakHashMap;
    }

    public static String f(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    @Override // androidx.cursoradapter.widget.b
    public final void a(View view, Cursor cursor) {
        Drawable drawableD;
        CharSequence charSequenceF;
        S0 s3 = (S0) view.getTag();
        int i7 = this.f12822Y;
        int i10 = i7 != -1 ? cursor.getInt(i7) : 0;
        TextView textView = s3.f12750a;
        if (textView != null) {
            String strF = f(cursor, this.f12817H);
            textView.setText(strF);
            if (TextUtils.isEmpty(strF)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f12827v;
        TextView textView2 = s3.f12751b;
        if (textView2 != null) {
            String strF2 = f(cursor, this.f12819M);
            if (strF2 != null) {
                if (this.f12816C == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(p241q.a.textColorSearchUrl, typedValue, true);
                    this.f12816C = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strF2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f12816C, null), 0, strF2.length(), 33);
                charSequenceF = spannableString;
            } else {
                charSequenceF = f(cursor, this.f12818L);
            }
            if (TextUtils.isEmpty(charSequenceF)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceF);
            if (TextUtils.isEmpty(charSequenceF)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView = s3.f12752c;
        if (imageView != null) {
            int i11 = this.f12820Q;
            if (i11 == -1) {
                drawableD = null;
            } else {
                drawableD = d(cursor.getString(i11));
                if (drawableD == null) {
                    ComponentName searchActivity = this.t.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f12828w;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableD = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    searchActivity.flattenToShortString();
                                    drawableD = null;
                                } else {
                                    drawableD = drawable;
                                }
                            } else {
                                drawableD = null;
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            e10.toString();
                        }
                        weakHashMap.put(strFlattenToShortString, drawableD == null ? null : drawableD.getConstantState());
                    }
                    if (drawableD == null) {
                        drawableD = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableD);
            if (drawableD == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableD.setVisible(false, false);
                drawableD.setVisible(true, false);
            }
        }
        ImageView imageView2 = s3.f12753d;
        if (imageView2 != null) {
            int i12 = this.f12821X;
            Drawable drawableD2 = i12 == -1 ? null : d(cursor.getString(i12));
            imageView2.setImageDrawable(drawableD2);
            if (drawableD2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawableD2.setVisible(false, false);
                drawableD2.setVisible(true, false);
            }
        }
        int i13 = this.f12815B;
        ImageView imageView3 = s3.f12754e;
        if (i13 != 2 && (i13 != 1 || (i10 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.b
    public final View b(ViewGroup viewGroup) {
        View viewInflate = this.f12825o.inflate(this.f12823i, viewGroup, false);
        viewInflate.setTag(new S0(viewInflate));
        ((ImageView) viewInflate.findViewById(p241q.f.edit_query)).setImageResource(this.f12814A);
        return viewInflate;
    }

    public final Drawable c(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f12827v.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // androidx.cursoradapter.widget.b, androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public final void changeCursor(Cursor cursor) {
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f12817H = cursor.getColumnIndex("suggest_text_1");
                this.f12818L = cursor.getColumnIndex("suggest_text_2");
                this.f12819M = cursor.getColumnIndex("suggest_text_2_url");
                this.f12820Q = cursor.getColumnIndex("suggest_icon_1");
                this.f12821X = cursor.getColumnIndex("suggest_icon_2");
                this.f12822Y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // androidx.cursoradapter.widget.b, androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public final CharSequence convertToString(Cursor cursor) {
        String strF;
        String strF2;
        if (cursor == null) {
            return null;
        }
        String strF3 = f(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strF3 != null) {
            return strF3;
        }
        SearchableInfo searchableInfo = this.t;
        if (searchableInfo.shouldRewriteQueryFromData() && (strF2 = f(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strF2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strF = f(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strF;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    public final Drawable d(String str) {
        WeakHashMap weakHashMap = this.f12828w;
        Context context = this.f12827v;
        Drawable drawableC = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i7 = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i7;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = context.getDrawable(i7);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableC = c(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e10) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                            }
                            drawableC = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e11) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e12) {
                    Objects.toString(uri);
                    e12.getMessage();
                    if (drawableC != null) {
                        weakHashMap.put(str, drawableC.getConstantState());
                    }
                    return drawableC;
                }
                if (drawableC != null) {
                    weakHashMap.put(str, drawableC.getConstantState());
                }
            }
        }
        return drawableC;
    }

    public final Cursor e(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f12827v.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // androidx.cursoradapter.widget.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewInflate = this.f12825o.inflate(this.f12824j, viewGroup, false);
            if (viewInflate != null) {
                ((S0) viewInflate.getTag()).f12750a.setText(e10.toString());
            }
            return viewInflate;
        }
    }

    @Override // androidx.cursoradapter.widget.b, android.widget.Adapter
    public final View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewB = b(viewGroup);
            ((S0) viewB.getTag()).f12750a.setText(e10.toString());
            return viewB;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f16376c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f16376c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f12826p.g((CharSequence) tag);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorFilter$CursorFilterClient
    public final Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.f12826p;
        if (searchView.getVisibility() != 0 || searchView.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursorE = e(this.t, string);
            if (cursorE == null) {
                return null;
            }
            cursorE.getCount();
            return cursorE;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
