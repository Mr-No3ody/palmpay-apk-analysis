package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f21843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21844c;

    public /* synthetic */ b(View view, Object obj, int i7) {
        this.f21842a = i7;
        this.f21843b = view;
        this.f21844c = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f21842a) {
            case 0:
                return ReactTextInputManager.addEventEmitters$lambda$3((ReactEditText) this.f21843b, (ThemedReactContext) this.f21844c, textView, i7, keyEvent);
            default:
                return ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$13((ModelMobileWithIconInputLayout) this.f21843b, (Function1) this.f21844c, textView, i7, keyEvent);
        }
    }
}
