package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.uimanager.StateWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u000bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/swmansion/rnscreens/FabricEnabledHeaderConfigViewGroup;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/facebook/react/uimanager/StateWrapper;", "wrapper", "", "setStateWrapper", "(Lcom/facebook/react/uimanager/StateWrapper;)V", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FabricEnabledHeaderConfigViewGroup extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StateWrapper f25259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f25260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f25261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25263e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public FabricEnabledHeaderConfigViewGroup(@Nullable Context context) {
        super(context);
    }

    public final void setStateWrapper(@Nullable StateWrapper wrapper) {
        this.f25259a = wrapper;
    }
}
