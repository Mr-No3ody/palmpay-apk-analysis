package com.swmansion.rnscreens;

import Dg.a;
import Je.l;
import M7.C0442b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p294tb.K;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/swmansion/rnscreens/CustomSearchView;", "Landroidx/appcompat/widget/SearchView;", "", ReactTextInputShadowNode.PROP_TEXT, "", "setText", "(Ljava/lang/String;)V", "Landroidx/appcompat/widget/SearchView$OnCloseListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCloseListener", "(Landroidx/appcompat/widget/SearchView$OnCloseListener;)V", "Landroid/view/View$OnClickListener;", "setOnSearchClickListener", "(Landroid/view/View$OnClickListener;)V", "", "value", "getOverrideBackAction", "()Z", "setOverrideBackAction", "(Z)V", "overrideBackAction", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class CustomSearchView extends SearchView {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public SearchView.OnCloseListener f25248M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public View.OnClickListener f25249N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final C0442b f25250O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSearchView(Context context, ScreenStackFragment fragment) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        K onBackPressedCallback = new K(this, 1);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        C0442b c0442b = new C0442b();
        c0442b.f5807c = fragment;
        c0442b.f5808d = onBackPressedCallback;
        c0442b.f5806b = true;
        this.f25250O0 = c0442b;
        super.setOnSearchClickListener(new l(this, 11));
        super.setOnCloseListener(new a(this, 26));
        setMaxWidth(Integer.MAX_VALUE);
    }

    public final boolean getOverrideBackAction() {
        return this.f25250O0.f5806b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12800u0) {
            return;
        }
        this.f25250O0.d();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0442b c0442b = this.f25250O0;
        if (c0442b.f5805a) {
            ((K) c0442b.f5808d).remove();
            c0442b.f5805a = false;
        }
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(@Nullable SearchView.OnCloseListener listener) {
        this.f25248M0 = listener;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(@Nullable View.OnClickListener listener) {
        this.f25249N0 = listener;
    }

    public final void setOverrideBackAction(boolean z3) {
        this.f25250O0.f5806b = z3;
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        i(text);
    }
}
